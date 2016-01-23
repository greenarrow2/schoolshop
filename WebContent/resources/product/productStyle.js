Ext.tip.QuickTipManager.init();
function deleteStylePhoto(id){
   $.post('../../admin/productstyle/deleteStylePhoto.htm',{id:id},function (result){
     Ext.MessageBox.alert('友情提示', result.obj);
   },'json');
}
function photoSubmit() {
	Ext.getCmp("stylePhotos").getForm().submit({
		url : "../../admin/productstyle/saveStylePhotos.htm?id=" + id,
		method : "POST",
		waitMsg : "操作执行中...",
		success : function(form, action) {
			var imagePaths = action.result.obj;
			for (var index = 0; index < imagePaths.length; index++) {
				if(index/3==0){
					$("#stylePhotosDiv")
						.prepend('<br>');
				}
				$("#stylePhotosDiv")
						.prepend('<img style="width:150px;height:auto" src="'
								+ imagePaths[index]
								+ '" />&nbsp;&nbsp;');
			}
			Ext.MessageBox.alert('友情提示', "图片上传成功！");
		},
		failure : function(form, action) {
			Ext.MessageBox.alert('友情提示', action.result.obj);
		}
	});
}
function addStylePhoto(id){
        var stylePhoto = Ext.create('Ext.form.Panel', {
			fileUpload : true,
			enctype : 'multipart/form-data',
			width : 300,
			height : $(window).height() - 10,
			layout : 'vbox',
			id : "stylePhotos",
			items : [{
					xtype : 'numberfield',
					id : 'id',
					name : 'id',
					value : id,
					hidden : true
				},{
						xtype : 'label',
						text : '上传相册'
					}, {
						id : 'photoOne',
						name : 'stylePhotos',
						width : 250,
						xtype : 'filefield',
						buttonText : '选择文件'
					}, {
						id : 'photoTwo',
						name : 'stylePhotos',
						width : 250,
						xtype : 'filefield',
						buttonText : '选择文件'
					}, {
						id : 'photoThree',
						name : 'stylePhotos',
						width : 250,
						xtype : 'filefield',
						buttonText : '选择文件'
					}, {
						id : 'photoFour',
						name : 'stylePhotos',
						width : 250,
						xtype : 'filefield',
						buttonText : '选择文件'
					}, {
						xtype : 'button',
						text : "提交",
						name : "submit",
						handler : photoSubmit
					}]
		})
	var stylePhotoWin = Ext.create('Ext.window.Window', {
				title : '商品信息',
				collapsible : true,
				animCollapse : true,
				maximizable : true,
				autoScroll : true,
				width : 800,
				height : 500,
				minWidth : 300,
				minHeight : 200,
				layout : 'hbox',
				modal : true,
				items : [stylePhoto,{
				   xtype : 'label',
				   html : '<div id="stylePhotosDiv"></div>'
				}]
			})
	  stylePhotoWin.show();
}
function addOrUpdate(record) {
	var product = Ext.create('Ext.form.Panel', {
		width : 495,
		height : 415,
		bodyPadding : 5,
		id : "productForm",
		layout : 'form',// 表单布局
		url : '../product/addOrUpdateProduct.htm', // 保存路径
		frame : true,//
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
										html : 'Hello world 2'
									}, {
										title : '商品描述图片',
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

function deleteProductStyles() {

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
function queryProductStyle() {
	styleStore.load({
				url : '../../admin/productstyle/productStyleList.htm',
				actionMethods : {
					create : 'POST',
					read : 'POST', // by default GET
					update : 'POST',
					destroy : 'POST'
				},
				params : {
        	        name : Ext.getCmp('style_name').getValue(),
        	        productName : Ext.getCmp('product_name').getValue(),
					beginTime : Ext.getCmp('begin_time').getValue(),
					endTime : Ext.getCmp('end_time').getValue(),
					visible : $('#statusId').val(),
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
		top : -5,
		bottom : -8
	},
	frame : false,
	items : [{
				id : 'product_name',
				xtype : 'textfield',
				fieldLabel : '品名',
				name : 'productName',
				labelWidth : 40,
				width : 150
			},{
				id : 'style_name',
				xtype : 'textfield',
				fieldLabel : '样式名',
				name : 'name',
				labelWidth : 60,
				width : 150
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
			},{
				xtype : 'label',
				html : '状态：&nbsp;<select id="statusId" name="status"><option value= "" select="true">全部</option>'
						+ '<option value=true >上架</option>'
						+ '<option value=false >下架</option>' + '</select>'
			},{
				text : '查询',
				icon : '../../image/extimage/zoom.png',
				scale : 'medium',
				handler : queryProductStyle
			}]
});

Ext.define('ProductStyle', {
			extend : 'Ext.data.Model',
			fields : [{
						name : 'id'
					}, {
						name : 'name'
					}, {
						name : 'imagename'
					}, {
						name : 'stylePhotos'
					}, {
						name : 'visible'
					}, {
						name : 'createTime'
					}, {
						name : 'updateTime'
					},{
					    name : 'product'
					}]
		})

var styleStore = Ext.create('Ext.data.Store', {
			model : 'ProductStyle',
			pageSize : 20,
			proxy : {
				type : 'ajax',
				url : '../../admin/productstyle/productStyleList.htm',
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
		styleStore.on('beforeload', function (store, options) {  
        var new_params = {
        	        name : Ext.getCmp('style_name').getValue(),
        	        productName : Ext.getCmp('product_name').getValue(),
					beginTime : Ext.getCmp('begin_time').getValue(),
					endTime : Ext.getCmp('end_time').getValue(),
					visible : $('#statusId').val(),
				   timeType : $('#timeType').val()};  
        Ext.apply(styleStore.proxy.extraParams, new_params);  
    }); 
var selModel = Ext.create('Ext.selection.CheckboxModel', {
			listeners : {
				selectionchange : function(sm, selections) {
					styleGrid.down('#removeButton')
							.setDisabled(selections.length === 0);
				}
			}
		});
var styleGrid = Ext.create('Ext.grid.Panel', {
			autoScroll : true,
			store : styleStore,
			id : 'button-grid',
			title : '商品列表管理',
			width : $(window).width(),
			height : $(window).height() - 10,
			multiSelect : true,
			columns : [{
						header : '样式ID',
						dataIndex : 'id',
						width : 80
					},{
						header : '商品',
						dataIndex : 'product',
						width : 80,
						renderer : function(value) {
							return value.productName;
						}
					}, {
						header : '样式名称',
						dataIndex : 'name',
						width : 100
					}, {
						header : '样式图片',
						dataIndex : 'imagename',
						width : 80,
						renderer : function(value) {
							var html = '<img src="'+value+'" style="width:50px;height:50px;">'
							return html;
						}
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
						width : 130,
						renderer : function(value) {
							return value.substring(0, value.length - 2);
						}
					}, {
						header : '更新日期',
						dataIndex : 'updateTime',
						width : 130,
						renderer : function(value) {
							return value.substring(0, value.length - 2);
						}
					}, {
						header : '样式相册',
						dataIndex : 'stylePhotos',
						width : 270,
						renderer : function(value) {
							var html='';
							for (var index = 0; index < value.length; index++) {
								html+='<img src="'+value[index].url+'" style="width:50px;height:50px;"><img src="../../image/extimage/delete.png" onclick="deleteStylePhoto('+value[index].id+')">'
							}
							return html;
						}
					} , {
						xtype : 'actioncolumn',
						header : '操作',
						width : 120,
						items : [{
							icon : '../../image/extimage/add.png',
							tooltip : '添加样式相册',
							handler : function(grid, rindex, cindex) {
								var record = grid.getStore().getAt(rindex);
								var id = record.get("id");
								addStylePhoto(id);
							}
						}, "->",{
							icon : '../../image/extimage/remove.png',
							 tooltip : '删除',
							handler : function(grid, rindex, cindex) {
								var record = grid.getStore().getAt(rindex);
								var id = record.get("id");
								$.post('../../admin/productstyle/deleteProductStyle.htm',
										{
											id : id
										}, function(json) {
											if (json.success) {
												queryProductStyle();
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
							 tooltip : '编辑',
							handler : function(grid, rindex, cindex) {
								var record = grid.getStore().getAt(rindex);
								addOrUpdate(record);
							}
						}, "->", {
							icon : '../../image/extimage/visible.png',
							 tooltip : '上下架',
							handler : function(grid, rindex, cindex) {
								var record = grid.getStore().getAt(rindex);
								var id = record.get("id");
								var visible = record.get("visible");
									$.post('../../admin/productstyle/updateStyleVisible.htm',
										{
											id : id,
											visible : visible
										}, function(json) {
											if (json.success) {
												queryProductStyle();
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
						items : [buttonGroup]
					},{
						xtype : 'toolbar',
						items : [{
									text : '添加',
									icon : '../../image/extimage/add.png',
									handler : addOrUpdate
								}, '-', {
									itemId : 'removeButton',
									text : '删除',
									icon : '../../image/extimage/delete.png',
									disabled : true,
									handler : deleteProductStyles
								}]
					}],
			listeners : {
				itemdblclick : function(t, r) {
					addOrUpdate(r);
				}
			},
			bbar : Ext.create('Ext.PagingToolbar', {
						store : styleStore,
						displayInfo : true,
						displayMsg : '显示{0}-{1}共{2}条',
						emptyMsg : "没有数据"
					})
		});
