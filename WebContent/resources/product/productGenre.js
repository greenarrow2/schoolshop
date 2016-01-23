function addAttributes(id) {
	Ext.define('Attribute', {
				extend : 'Ext.data.Model',
				fields : [{
							name : 'id'
						}, {
							name : 'attributeName'
						}, {
							name : 'attributeType'
						}, {
							name : 'attributeParams'
						}, {
							name : 'isFill'
						}]
			});
	var attributeStore = Ext.create('Ext.data.Store', {
				model : 'Attribute',
				pageSize : 20,
				proxy : {
					type : 'ajax',
					api : {
						read : '../../admin/attribute/attributeList.htm',//查询
						create : '../../admin/attribute/saveOrUpdate.htm',//创建  
						update : '../../admin/attribute/saveOrUpdate.htm',//更新        
						destroy : '../../admin/attribute/deleteAttribute.htm'//删除      
					},
					extraParams : {
						genreId : id
					},
					actionMethods : {
						create : 'POST',
						read : 'POST', // by default GET
						update : 'POST',
						destroy : 'POST'
					},
					reader : {
						root : 'rows',
						totalProperty : 'total'
					},
					writer : {
						type : 'json'
					}
				},
				listeners : {
					write : function(store, operation) {
						var record = operation.getRecords()[0], name = Ext.String
								.capitalize(operation.action), verb;
						if (name == 'Destroy') {
							record = operation.records[0];
							verb = 'Destroyed';
						} else {
							verb = name + 'ed';
						}
						Ext.MessageBox.alert('提示', '成功！');
					}
				},
				autoLoad : true
			});

	var rowEditing = Ext.create('Ext.grid.plugin.RowEditing', {
				clicksToEdit : 2,
				autoCancel : false
				/*listeners : {
					edit : function(rowEditing, context) {
						if (context.record.phantom) {
							attributeStore.remove(context.record);
						}
					}
				}*/
			});
	var attributeGrid = Ext.create('Ext.grid.Panel', {
		autoScroll : true,
		store : attributeStore,
		width : 780,
		height : 430,
		multiSelect : true,
		margin : {
			left : 0
		},
		//selType : 'cellmodel',
		plugins : [rowEditing],
		dockedItems : [{
			xtype : 'toolbar',
			items : [{
						icon : '../../image/extimage/add.png',
						text : '添加',
						scope : this,
						handler : function() {
							rowEditing.cancelEdit();
							var p = {
								attributeName : '',
								attributeValue : ''
							};
							//attributeGrid.stopEditing(); 
							attributeStore.insert(0, p);
							rowEditing.startEdit(0, 0);
							//attributeGrid.startEditing(0, 0);
						}
					}, {
						icon : '../../image/extimage/delete.png',
						text : 'Delete',
						disabled : true,
						itemId : 'delete',
						scope : this,
						handler : function() {
							var id = attributeGrid.getStore().geta
							$.post('../../admin/attribute/deleteAttribute.htm',
									{
										id : id
									}, function(result) {
										if (result.success == true) {
											Ext.MessageBox.alert('提示',
													result.obj);
										}
									}, 'json');
						}
					}]
		}],
		columns : [{
					header : '类型ID',
					dataIndex : 'id',
					width : 80
				}, {
					header : '属性名',
					dataIndex : 'attributeName',
					width : 100,
					editor : {
						allowBlank : false
					}
				}, {
					header : '类型',
					dataIndex : 'attributeType',
					width : 100,
					editor : {
						allowBlank : false
					}
				}, {
					header : '选择项',
					dataIndex : 'attributeParams',
					width : 100,
					editor : {
						allowBlank : false
					}
				}, {
					header : '必填',
					dataIndex : 'isFill',
					width : 100,
					editor : {
						allowBlank : false
					}
				}, {
					xtype : 'actioncolumn',
					header : '操作',
					width : 110,
					items : [{
						icon : '../../image/extimage/remove.png',
						handler : function(grid, rindex, cindex) {
							var record = grid.getStore().getAt(rindex);
							var id = record.get("id");
							// showWait();
							$.post('../../admin/product/deleteProduct.htm', {
										id : id
									}, function(json) {
										if (json.success) {
											query();
											Ext.MessageBox
													.alert('提示', json.obj);
										} else {
											Ext.MessageBox.alert('提示', "审查失败！");
										}

									}, 'json');
						}
					}, "->", {
						icon : '../../image/extimage/edit.png',
						handler : function(grid, rindex, cindex) {
							var record = grid.getStore().getAt(rindex);
							addAndUpdate(record);
						}
					}]

				}],
		listeners : {
			'selectionchange' : function(view, records) {
				attributeGrid.down('#delete').setDisabled(!records.length);
			}
		},
		bbar : Ext.create('Ext.PagingToolbar', {
					store : attributeStore,
					displayInfo : true,
					displayMsg : '显示{0}-{1}共{2}条',
					emptyMsg : "没有数据"

				})

	});

	var attributeWin = Ext.create('Ext.window.Window', {
				title : '属性信息',
				collapsible : true,
				animCollapse : true,
				maximizable : true,
				autoScroll : true,
				width : 800,
				height : 500,
				minWidth : 300,
				minHeight : 200,
				modal : true,
				items : [attributeGrid],
				listeners : {
					beforeclose : function() {

					}
				}
			});
	/*if (record!=null)
		genreForm.loadRecord(record);*/
	attributeWin.show();
}
/**
 * 添加或者更新类型
 * @param {} record
 */
function addOrUpdateGenre(record) {
	var genreForm = Ext.create('Ext.form.Panel', {
		width : 495,
		height : 415,
		bodyPadding : 5,
		id : "genreForm",
		layout : 'form',//表单布局
		url : '../productgenre/saveAndUpdateProductGenre.htm', //保存路径
		frame : false,//
		buttonAlign : 'center',
		fieldDefaults : {
			msgTarget : 'side',
			labelWidth : 75
		},
		defaultType : 'textfield',
		defaults : {
			anchor : '100%'
		},

		items : [{
					xtype : 'hiddenfield',
					name : 'id',
					id : 'id'
				}, {
					fieldLabel : '类型名称',
					name : 'genreName',
					emptyText : '请填写类型名称',
					width : 150,
					allowBlank : false
				}, {
					fieldLabel : '此类型下商品是否拥有属性',
					xtype : 'radiogroup',
					items : [{
								boxLabel : '是',
								name : 'visibleGenre',
								inputValue : true
							}, {
								boxLabel : '否',
								name : 'visibleGenre',
								inputValue : false
							}]
				}, {
					fieldLabel : '此类型下商品是否拥有参数',
					xtype : 'radiogroup',
					items : [{
								boxLabel : '是',
								name : 'visible',
								inputValue : true
							}, {
								boxLabel : '否',
								name : 'visible',
								inputValue : false
							}]
				}, {
					fieldLabel : '此类型是否关联品牌',
					xtype : 'radiogroup',
					items : [{
								boxLabel : '是',
								name : 'visible',
								inputValue : true
							}, {
								boxLabel : '否',
								name : 'visible',
								inputValue : false
							}]
				}],
		buttons : [{
			text : '保存',
			handler : function() {
				genreForm.getForm().submit({
							method : 'post',
							success : function(form, action) {
								query();//重新加载
								Ext.MessageBox.alert('友情提示', action.result.obj);
							},
							failure : function(form, action) {
								Ext.MessageBox.alert('友情提示', action.result.obj);
							}
						});
			}
		}, {
			text : '取消',
			handler : function() {
				brandWin.close();
			}
		}]
	});

	var genreWin = Ext.create('Ext.window.Window', {
				title : '商品信息',
				collapsible : true,
				animCollapse : true,
				maximizable : true,
				autoScroll : true,
				width : 500,
				height : 500,
				minWidth : 300,
				minHeight : 200,
				modal : true,
				items : [{
							xtype : 'tabpanel',
							items : [{
										title : '品牌信息',
										items : [genreForm]
									}, {
										title : '商品图片',
										html : 'Hello world 2'
									}]
						}],
				listeners : {
					beforeclose : function() {

					}
				}
			});
	/*if (record!=null)
		genreForm.loadRecord(record);*/
	genreWin.show();

}
Ext.define('ProductGenre', {
			extend : 'Ext.data.Model',
			fields : [{
						name : 'id'
					}, {
						name : 'genreName'
					}, {
						name : 'attributes'
					}]
		});
var productGenreStore = Ext.create('Ext.data.Store', {
			model : 'ProductGenre',
			pageSize : 20,
			proxy : {
				type : 'ajax',
				url : '../../admin/productgenre/productGenreList.htm',
				actionMethods : {
					create : 'POST',
					read : 'POST', // by default GET
					update : 'POST',
					destroy : 'POST'
				},
				reader : {
					root : 'rows',
					totalProperty : 'total'

				}
			},
			autoLoad : true
		});

var productGenreGrid = Ext.create('Ext.grid.Panel', {
	autoScroll : true,
	store : productGenreStore,
	title : '类型属性',
	width : $(window).width() - 20,
	height : $(window).height() - 30,
	multiSelect : true,
	margin : {
		left : 0
	},
	dockedItems : [{
				xtype : 'toolbar',
				items : [{
							icon : '../../image/extimage/add.png',
							text : '添加',
							scope : this,
							handler : this.addOrUpdateGenre
						}, {
							icon : '../../image/extimage/delete.png',
							text : '删除',
							disabled : true,
							itemId : 'delete',
							scope : this,
							handler : this.onDeleteClick
						}]
			}],
	columns : [{
				header : '类型ID',
				dataIndex : 'id',
				width : 80
			}, {
				header : '商品名称',
				dataIndex : 'genreName',
				width : 100
			}, {
				header : '属性',
				dataIndex : 'attributes',
				width : 100,
				renderer : function(value, cellmeta, record) {
					if (value[0].id == null) {
						result = "否"
					} else {
						result = "<img alt=\"编辑\" src=\"../../image/extimage/attredit.png\" onclick=\"addAttributes("
								+ record.data['id'] + ")\">"
					}
					return result;
				}
			}, {
				xtype : 'actioncolumn',
				header : '操作',
				width : 110,
				items : [{
					icon : '../../image/extimage/remove.png',
					handler : function(grid, rindex, cindex) {
						var record = grid.getStore().getAt(rindex);
						var id = record.get("id");
						// showWait();
						$
								.post(
										'../../admin/productgenre/deleteProductGenre.htm',
										{
											id : id
										}, function(json) {
											if (json.success) {
												query();
												Ext.MessageBox.alert('提示',
														json.obj);
											} else {
												Ext.MessageBox.alert('提示',
														"审查失败！");
											}

										}, 'json');
					}
				}, "->", {
					icon : '../../image/extimage/edit.png',
					handler : function(grid, rindex, cindex) {
						var record = grid.getStore().getAt(rindex);
						addOrUpdateGenre(record);
					}
				}]

			}],
	listeners : {
		itemdblclick : function(t, r) {
			addOrUpdateGenre(r);
		}
	},
	bbar : Ext.create('Ext.PagingToolbar', {
				store : productGenreStore,
				displayInfo : true,
				displayMsg : '显示{0}-{1}共{2}条',
				emptyMsg : "没有数据"

			})

});
