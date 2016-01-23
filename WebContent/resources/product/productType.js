Ext.tip.QuickTipManager.init();
function saveOrUpdate(record){
	 var typeId;
	if(!isNaN(record)){
		 typeId = record;
	}
     	var productTypeForm = Ext.create('Ext.form.Panel', {
		width : 495,
		height : 415,
		bodyPadding : 5,
		id : "productType",
		layout : 'form',//表单布局
		url : '../producttype/saveOrUpdate.htm', //保存路径
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
				},{
					xtype : 'hiddenfield',
					name : 'typeId',
					value : typeId
				}, {
					fieldLabel : '分类名称',
					name : 'name',
					emptyText : '请填写类型名称',
					width : 150,
					allowBlank : false
				},{
					fieldLabel : '推荐指数',
					name : 'recommendRank',
					xtype : 'numberfield',
					minValue : 0,
					maxValue : 100,
					value : '100'
				},{
					fieldLabel : '状态',
					xtype : 'radiogroup',
					items : [{
								boxLabel : '上架',
								name : 'visible',
								inputValue : true,
								   checked: true
							}, {
								boxLabel : '下架',
								name : 'visible',
								inputValue : false
							}]
				}, {
					fieldLabel : '搜索关键词',
					name : 'note',
					xtype : 'textarea',
					width : 350,
					minValue : 0,
					maxValue : 200
				}],
		buttons : [{
			text : '保存',
			handler : function() {
				productTypeForm.getForm().submit({
							method : 'post',
							success : function(form, action) {
								query();//重新加载
								Ext.MessageBox.alert('友情提示', action.result.obj);
							},
							failure : function(form, action) {
								Ext.MessageBox.alert('友情提示', "操作失败！");
							}
						});
			}
		}, {
			text : '取消',
			handler : function() {
				productTypeWin.close();
			}
		}]
	});

	var productTypeWin = Ext.create('Ext.window.Window', {
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
										items : [productTypeForm]
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
	if (record.raw!=null){
		productTypeForm.loadRecord(record);
	}
	productTypeWin.show();
}
function deleteType(){
	
	var selects = productTypeGrid.getSelectionModel().getSelection();
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
							$.post('../../admin/producttype/deleteProductTypes.htm', {
								ids : actionList
							}, function(json) {
								if (json) {
										query();
										Ext.MessageBox.alert('提示', json.obj);
								} else {
									Ext.MessageBox.alert('提示', '网络异常');
								}
							}, 'json');
						}

					});
		}
	}
}
function query(){
   productTypeStore.load({
           url:'../../admin/producttype/productTypeList.htm',
           actionMethods : {
					create : 'POST',
					read : 'POST', // by default GET
					update : 'POST',
					destroy : 'POST'
				}
          /* params:{
            brandName : Ext.getCmp('brandname').getValue(),
            visible : $('#visible').val()
           }*/
   });
}
Ext.define('ProductType',{
      extend: 'Ext.data.Model',
   fields : [{
						name : 'id'
					}, {
						name : 'name'
					} ,{
					   name : 'note'
					} ,{
					   name : 'visible'
					},{
					   name : 'createTime'
					},{
					   name : 'updateTime'
					},{
					   name : 'recommendRank'
					},{
					   name : 'parent'
					}]
});
var productTypeStore = new Ext.data.Store({
     model: 'ProductType',
     pageSize:20,
     proxy: {
         type: 'ajax',
         url : '../../admin/producttype/productTypeList.htm',
         actionMethods : {
					create : 'POST',
					read : 'POST', // by default GET
					update : 'POST',
					destroy : 'POST'
				},
         reader: {
           root : 'rows',
		   totalProperty : 'total'
         }
     },
     autoLoad: true

});
var selModel = Ext.create('Ext.selection.CheckboxModel', {
			listeners : {
				selectionchange : function(sm, selections) {
					productTypeGrid.down('#removeButton')
							.setDisabled(selections.length === 0);
				}
			}
		});
var productTypeGrid = Ext.create('Ext.grid.Panel', {
	id : 'button-grid',
	store : productTypeStore,
	columns : [{
				text : "分类ID",
				width : 80,
				sortable : true,
				dataIndex : 'id'
			}, {
				text : "分类名称",
				width : 120,
				sortable : true,
				dataIndex : 'name'
			}, {
				text : "父类",
				width : 120,
				sortable : true,
				dataIndex : 'parent',
				renderer : function (value){
				   var result;
				   if(value!=null){
				   	 result = value.name;
				   }else{
				     result = "无"
				   }
				   return result;
				}
			}, {
				text : "搜索关键词",
				width : 150,
				sortable : true,
				dataIndex : 'note'
			}, {
				text : "状态",
				width : 50,
				sortable : true,
				dataIndex : 'visible',
				renderer : function (value){
				   return value==true?"上架":"下架";
				}
			}, {
				text : "添加日期",
				width : 150,
				sortable : true,
				dataIndex : 'createTime'
			}, {
				text : "更新日期",
				width : 140,
				sortable : true,
				dataIndex : 'updateTime'
			}, {
				text : "推荐指数",
				width : 100,
				sortable : true,
				dataIndex : 'recommendRank'
			},{
			
				xtype : 'actioncolumn',
				text : '操作',
				align : 'center',
				width : 150,
				items : [{
							icon : '../../image/extimage/add_chiid.png', // Use a URL in the icon config
							tooltip : '添加子分类',
							handler : function(grid, rowIndex, colIndex) {
								var rec = grid.getStore().getAt(rowIndex);
								var  typeId =  rec.get('id');
								 saveOrUpdate(typeId);
							}
						},"->",{
							icon : '../../image/extimage/remove.png', // Use a URL in the icon config
							tooltip : '删除',
							handler : function(grid, rowIndex, colIndex) {
								var rec = grid.getStore().getAt(rowIndex);
								var id = rec.get('id');
								$.post('../../admin/producttype/deleteProductType.htm', {
											id : id
										}, function(result) {
											if (result.success) {
												query();
												Ext.Msg.alert('提示', result.obj);
											} else {
												Ext.Msg.alert('提示',  result.obj);
											}
										}, 'json');
							}
						},"->",{
							icon : '../../image/extimage/edit.png', // Use a URL in the icon config
							tooltip : '编辑',
							handler : function(grid, rowIndex, colIndex) {
								var record = grid.getStore().getAt(rowIndex);
							 saveOrUpdate(record);
							}
						},"->",{
							icon : '../../image/extimage/visible.png', // Use a URL in the icon config
							tooltip : '上下架',
							handler : function(grid, rowIndex, colIndex) {
								var record = grid.getStore().getAt(rowIndex);
							     var id = record.get('id');
							     var visible = record.get('visible');
							      var waitMes = new Ext.window.MessageBox();
							     waitMes.wait('请稍等，正在操作！','提示');
							     $.post('../../admin/producttype/updateVisibleProductType.htm', {
											id : id,
											visible:visible
										}, function(result) {
										if(result.success){
									    query();
									    waitMes.destroy();
										Ext.MessageBox.alert('提示',
														result.obj);
										}
										},'json');
							}
						}]
			
			}],
	columnLines : true,
	selModel : selModel,

	// inline buttons
	dockedItems : [{
				xtype : 'toolbar',
				items : [{
							text : '添加分类',
							tooltip : '添加分类',
							icon : '../../image/extimage/add.png',
							handler : saveOrUpdate
						},'-', {
							itemId : 'removeButton',
							text : '删除分类',
							tooltip : '删除分类',
							icon : '../../image/extimage/delete.png',
							disabled : true,
							handler : deleteType
						}]
			}],

    width : $(window).width(),
	height : $(window).height()-5,
	title : '商品分类管理',
	listeners : {
		itemdblclick : function(t, r) {
			saveOrUpdate(r);
		}
	},
	bbar : Ext.create('Ext.PagingToolbar', {
				store : productTypeStore,
				displayInfo : true,
				displayMsg : '显示{0}-{1}共{2}条',
				emptyMsg : "没有数据"
			})
});
