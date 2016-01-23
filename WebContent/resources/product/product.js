function addOrUpdate(record) {
	var product = Ext.create('Ext.form.Panel', {
		width : 495,
		height : 415,
		buttonAlign : 'center',
		bodyPadding : 5,
		id : "productForm",
		layout : 'form',// 表单布局
		url : '../product/addOrUpdateProduct.htm', // 保存路径
		frame : false,//
		fieldDefaults : {
			msgTarget : 'side',
			labelWidth : 75
		},
		defaultType : 'textfield',
		defaults : {
			anchor : '100%'
		},

		items : [{
					xtype : 'numberfield',
					id : 'id',
					name : 'id',
					hidden : true
				}, {
					id : 'createTime',
					name : 'createTime',
					hidden : true
				}, {
					fieldLabel : '商品名称',
					name : 'productName',
					allowBlank : false
				}, {
					fieldLabel : '商品描述',
					xtype : 'textarea',
					name : 'description',
					width : 350
				}, {
					fieldLabel : '推荐指数',
					name : 'recommendRank',
					xtype : 'numberfield',
					minValue : 0,
					maxValue : 200,
					value : 100
				}, {
					fieldLabel : '上架',
					xtype : 'radiogroup',
					items : [{
								boxLabel : '是',
								name : 'visible',
								inputValue : true,
								checked : true

							}, {
								boxLabel : '否',
								name : 'visible',
								inputValue : false
							}]
				}],
		buttons : [{
			text : '保存',
			handler : function() {
				product.getForm().submit({
							method : 'post',
							success : function(form, action) {
								query();// 重新加载
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
				productWin.close();
			}
		}]

	})
	var imageUrl = null;
	//商品图片
	if(record.raw){
	   imageUrl = record.raw.coverUrl;
	}
    var productImage = Ext.create('Ext.form.Panel', {
		width : 495,
		height : 415,
		bodyPadding : 5,
		id : "productImage",
		layout : 'form',// 表单布局
		frame : false,//
		fieldDefaults : {
			msgTarget : 'side',
			labelWidth : 75
		},
		defaults : {
			anchor : '100%'
		},
		items : [{
					html : '<img src="'+imageUrl+'" >' 
				} ]
		}
	)
	var productWin = Ext.create('Ext.window.Window', {

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
										title : '商品信息',
										items : [product]
									}, {
										title : '商品图片',
										items :   [productImage]
									}, {
										title : '商品样式图片',
										html : 'Hello world 3',
										closable : true
									}]
						}],
				listeners : {
					beforeclose : function() {

					}
				}
			});
	if (record.raw) {
		product.loadRecord(record);
	}
	productWin.show();
}

function deleteProducts() {

	var selects = grid.getSelectionModel().getSelection();
	var actionList = [];
	if (selects.length > 0) {
		for (var i = 0; i < selects.length; i++) {
			if (selects[i].data.id) {
				actionList.push(selects[i].data.id);
			} else {
				store.remove(selects[i]);
			}
		}
		if (actionList.length > 0) {
			Ext.MessageBox.confirm('确认框', '已保存的数据删除后将不能恢复，您确定继续吗？',
					function(r) {
						if ('yes' == r) {
							$.post('../../admin/product/deleteProducts.htm', {
										ids : actionList
									}, function(json) {
										if (json) {
											queryProduct();
											Ext.MessageBox
													.alert('提示', json.obj);
										} else {
											Ext.MessageBox.alert('提示', '网络异常');
										}
									}, 'json');
						}

					});
		}
	}
}
function queryProduct() {
	productStore.load({
				url : '../../admin/product/productList.htm',
				actionMethods : {
					create : 'POST',
					read : 'POST', // by default GET
					update : 'POST',
					destroy : 'POST'
				},
				params : {
					productName : Ext.getCmp('product_name').getValue(),
					recommendRank : Ext.getCmp("recommend_rank").getValue(),
					beginTime : Ext.getCmp('begin_time').getValue(),
					endTime : Ext.getCmp('end_time').getValue(),
					productTypeId : Ext.getCmp('type').getValue(),
					visible : $('#statusId').val(),
					mark : $('#markId').val(),
					timeType : $('#timeType').val()
				}
			});
}
var typeStore = Ext.create('Ext.data.Store', {
			proxy : {
				type : 'ajax',
				url : '../../admin/producttype/productTypes.htm',
				actionMethods : {
					create : 'POST',
					read : 'POST', // by default GET
					update : 'POST',
					destroy : 'POST'
				},
				reader : {
					type : 'json'
				}
			},
			fields : [{
						name : 'productTypeId'
					}, {
						name : 'name'
					}]

		});
var typeCom = new Ext.form.ComboBox({
			id : 'type',
			store : typeStore,
			fieldLabel : '分类',
			labelWidth : 40,
			emptyText : '请选择',
			mode : 'remote',
			triggerAction : 'all',
			valueField : 'id',
			displayField : 'name'
		});

var buttonGroup = new Ext.ButtonGroup({
	autoScroll:true,
	columns : 8,
	margin : {
		left : 0
	},
	frame : false,
	items : [{
				id : 'product_name',
				xtype : 'textfield',
				fieldLabel : '品名',
				name : 'productName',
				labelWidth : 40,
				width : 150
			}, {
				id : 'recommend_rank',
				xtype : 'textfield',
				fieldLabel : '指数',
				name : 'recommendRank',
				labelWidth : 40,
				width : 100
			}, {
				id : 'begin_time',
				xtype : 'datefield',
				fieldLabel : '时间段',
				name : 'beginTime',
				labelWidth : 50,
				width : 150
			}, {
				xtype : 'label',
				html : '-'
			}, {
				id : 'end_time',
				xtype : 'datefield',
				name : 'endTime',
				labelWidth : 40,
				width : 100
			}, {
				xtype : 'label',
				html : '<select id="timeType" name="timeType">'
						+ '<option value=1 >创建</option>'
						+ '<option value=2 >更新</option>' + '</select>'
			}, typeCom, {
				xtype : 'label',
				html : '状态：&nbsp;<select id="statusId" name="status"><option value= "" select="true">全部</option>'
						+ '<option value=true >上架</option>'
						+ '<option value=false >下架</option>' + '</select>'
			}, {
				xtype : 'label',
				html : '标签：&nbsp;<select id="markId" name="status">'
						+ '<option value=-1 select="true">全部</option>'
						+ '<option value=0 select="true">普通</option>'
						+ '<option value=1 >抢购</option>'
						+ '<option value=2 >热卖</option>'
						+ '<option value=3 >特卖</option>'
						+ '<option value=4 >猜你喜欢</option>'
						+ '<option value=5 >热评商品</option>'
						+ '<option value=6 >新品上架</option>'
						+ '<option value=7 >一元云购 </option>'
						+ '</select>'

			}, {
				text : '查询',
				icon : '../../image/extimage/zoom.png',
				scale : 'medium',
				handler : queryProduct
			}]
});

Ext.define('Product', {
			extend : 'Ext.data.Model',
			fields : [{
						name : 'id'
					}, {
						name : 'nameGenre'
					}, {
						name : 'productName'
					}, {
						name : 'description'
					}, {
						name : 'visible'
					}, {
						name : 'createTime'
					}, {
						name : 'updateTime'
					}, {
						name : 'coverUrl'
					}, {
						name : 'recommendRank'
					}, {
						name : 'productType'
					}, {
						name : 'brand'
					}]
		})

var productStore = Ext.create('Ext.data.Store', {
			model : 'Product',
			pageSize : 20,
			proxy : {
				type : 'ajax',
				url : '../../admin/product/productList.htm',
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
		})
		productStore.on('beforeload', function (store, options) {  
        var new_params = { productName : Ext.getCmp('product_name').getValue(),
					recommendRank : Ext.getCmp("recommend_rank").getValue(),
					beginTime : Ext.getCmp('begin_time').getValue(),
					endTime : Ext.getCmp('end_time').getValue(),
					productTypeId : Ext.getCmp('type').getValue(),
					visible : $('#statusId').val(),
					mark : $('#markId').val(),
					timeType : $('#timeType').val()};  
        Ext.apply(productStore.proxy.extraParams, new_params);  
        // alert('beforeload');  
    }); 
var selModel = Ext.create('Ext.selection.CheckboxModel', {
			listeners : {
				selectionchange : function(sm, selections) {
					grid.down('#removeButton')
							.setDisabled(selections.length === 0);
				}
			}
		});
var grid = Ext.create('Ext.grid.Panel', {
			autoScroll : true,
			store : productStore,
			id : 'button-grid',
			title : '商品列表管理',
			width : $(window).width()-5,
			height : $(window).height()-5,
			multiSelect : true,
			columns : [{
						header : '商品ID',
						dataIndex : 'id',
						width : 80
					}, {
						header : '商品名称',
						dataIndex : 'productName',
						width : 100
					}, {
						header : '商品封面',
						dataIndex : 'coverUrl',
						width : 60,
						renderer : function(value) {
							var html = '<img src="'+value+'" style="width:40px;height:40px;">'
							return html;
						}
					}, {
						header : '详细描述',
						dataIndex : 'description',
						width : 200
					}, {
						header : '上架',
						dataIndex : 'visible',
						width : 80,
						renderer : function(value) {
							return value == true ? '上架' : '下架';
						}
					}, {
						header : '上架日期',
						dataIndex : 'createTime',
						width : 180,
						renderer : function(value) {
							return value.substring(0, value.length - 2);
						}
					}, {
						header : '更新日期',
						dataIndex : 'updateTime',
						width : 180,
						renderer : function(value) {
							return value.substring(0, value.length - 2);
						}
					}, {
						header : '推荐指数',
						dataIndex : 'recommendRank',
						width : 80
					}, {
						header : '分类',
						dataIndex : 'productType',
						width : 80,
						renderer : function(value) {
							return  value !=  null? value.name:"无";
						}
					}, {
						header : '品牌',
						dataIndex : 'brand',
						width : 80,
						renderer : function(value) {
							return value !=null ? value.brandName:"无";
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
								$.post('../../admin/product/deleteProduct.htm',
										{
											id : id
										}, function(json) {
											if (json.success) {
												queryProduct();
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
								addOrUpdate(record);
							}
						}, "->", {
							icon : '../../image/extimage/visible.png',
							 tooltip : '编辑',
							handler : function(grid, rindex, cindex) {
								var record = grid.getStore().getAt(rindex);
								var id = record.get("id");
								var visible = record.get("visible");
									$.post('../../admin/product/updateProductVisible.htm',
										{
											id : id,
											visible : visible
										}, function(json) {
											if (json.success) {
												queryProduct();
												Ext.MessageBox.alert('提示',
														json.obj);
											} else {
												Ext.MessageBox.alert('提示',
														"服务器内部错误！");
											}

										}, 'json');
							}
						}]

					}],
			columnLines : true,
			selModel : selModel,

			// inline buttons
			dockedItems : [{
						xtype : 'toolbar',
						items : [buttonGroup, {
									text : '添加',
									tooltip : 'Add a new row',
									icon : '../../image/extimage/add.png',
									handler : addOrUpdate
								}, '-', {
									itemId : 'removeButton',
									text : '删除',
									tooltip : 'Remove the selected item',
									icon : '../../image/extimage/delete.png',
									disabled : true,
									handler : deleteProducts
								}]
					}],
			listeners : {
				itemdblclick : function(t, r) {
					addOrUpdate(r);
				}
			},
			bbar : Ext.create('Ext.PagingToolbar', {
						store : productStore,
						displayInfo : true,
						displayMsg : '显示{0}-{1}共{2}条',
						emptyMsg : "没有数据"
					})
		});
