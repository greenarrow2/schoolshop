var buttonGroup = new Ext.ButtonGroup({
	columns : 10,
	margin : {
		left : 0,
		top : -2,
		bottom :-5
	},
	frame : false,
	items : [{
				id : 'brandname',
				xtype : 'textfield',
				fieldLabel : '品牌',
				name : 'brandName',
				labelWidth : 40,
				width : 200
			}, {
				xtype : 'label',
				fieldLabel:'上架',
				html : '上架：&nbsp;&nbsp;&nbsp;&nbsp;<select id="visible"><option value="" select="true">全部</option><option value=true >正常</option></option><option value=false >冻结</option></select>'
			}, {
				text : '查询',
				scale : 'medium',
                handler:query
			}]
});
function saveOrUpdate(record) {
	var brandForm = new Ext.form.Panel({
		width : 495,
		height : 415,
		bodyPadding : 5,
		id : "brandForm",
		layout : 'form',//表单布局
		url : '../brand/addOrUpdateBrand.htm', //保存路径
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
					xtype : 'hiddenfield',
					name : 'id',
					id : 'id'
				}, {
					fieldLabel : '品牌',
					name : 'brandName',
					allowBlank : false
				}, {
					fieldLabel : '公司',
					name : 'company',
					width : 100
				}, {
					fieldLabel : '公司地址',
					name : 'address',
					width : 100
				}, {
					fieldLabel : '等级',
					name : 'grade',
					xtype : 'numberfield',
					minValue : 0,
					maxValue : 100,
					value : '100'
				}, {
					fieldLabel : '评价',
					name : 'evaluation',
					xtype : 'textarea',
					width : 350,
					minValue : 0,
					maxValue : 200
				}, {
					fieldLabel : '上架',
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
				brandForm.getForm().submit({
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

	})

	var brandWin = Ext.create('Ext.window.Window', {

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
										items : [brandForm]
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
	if (record.raw)
		brandForm.loadRecord(record);
	brandWin.show();
}

function query(){
       brandStore.load({
           url:'../../admin/brand/brandList.htm',
           actionMethods : {
					create : 'POST',
					read : 'POST', // by default GET
					update : 'POST',
					destroy : 'POST'
				},
           params:{
            brandName : Ext.getCmp('brandname').getValue(),
            visible : $('#visible').val()
           }
       });
}
Ext.define('Brand', {
			extend : 'Ext.data.Model',
			fields : [{
						name : 'id'
					}, {
						name : 'brandName'
					}, {
						name : 'company'
					}, {
						name : 'address'
					}, {
						name : 'grade'
					}, {
						name : 'evaluation'
					}, {
						name : 'visible'
					}]

		});

var brandStore = Ext.create('Ext.data.Store', {
			model : 'Brand',
			pageSize : 20,
			proxy : {
				type : 'ajax',
				url : '../../admin/brand/brandList.htm',
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

var brandGrid = Ext.create('Ext.grid.Panel', {
	autoScroll : true,
	title : '品牌列表',
	store : brandStore,
	width : $(window).width(),
	height : $(window).height(),
	multiSelect : true,
	margin : {
		left : 0
	},
	columns : [{
				header : '品牌ID',
				dataIndex : 'id'
			}, {
				header : '品牌名称',
				dataIndex : 'brandName'
			}, {
				header : '公司',
				dataIndex : 'company'
			}, {
				header : '地址',
				dataIndex : 'address'
			}, {
				header : '等级',
				dataIndex : 'grade'
			}, {
				header : '评价',
				dataIndex : 'evaluation'
			}, {
				header : '上架',
				dataIndex : 'visible',
				renderer : function (value){
				  return value == true?'是':'否';
				}
			}, {
				xtype : 'actioncolumn',
				text : '操作',
				width : 100,
				items : [{
							icon : '../../image/extimage/remove.png', // Use a URL in the icon config
							tooltip : 'Edit',
							handler : function(grid, rowIndex, colIndex) {
								var rec = grid.getStore().getAt(rowIndex);
								var id = rec.get('id');
								$.post('../../admin/brand/deleteBrand.htm', {
											id : id
										}, function(result) {
											if (result.success) {
												query();
												Ext.Msg.alert('提示', result.obj);
											} else {
												Ext.Msg.alert('提示', "删除失败！");
											}
										}, 'json');
							}
						},"->",{
							icon : '../../image/extimage/edit.png', // Use a URL in the icon config
							tooltip : 'Edit',
							handler : function(grid, rowIndex, colIndex) {
								var record = grid.getStore().getAt(rowIndex);
							 saveOrUpdate(record);
							}
						},"->",{
							icon : '../../image/extimage/visible.png', // Use a URL in the icon config
							tooltip : 'Edit',
							handler : function(grid, rowIndex, colIndex) {
								var record = grid.getStore().getAt(rowIndex);
							     var id = record.get('id');
							     var visible = record.get('visible')==true?false:true;
							      var waitMes = new Ext.window.MessageBox();
							     waitMes.wait('请稍等，正在操作！','提示');
							     $.post('../../admin/brand/visibleBrand.htm', {
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
			dockedItems : [{
					xtype : 'toolbar',
						items : [buttonGroup]
					},{
						xtype : 'toolbar',
						items : [{
									text : '添加',
									tooltip : 'Add a new row',
									icon : '../../image/extimage/add.png',
									handler : saveOrUpdate
								}, '-', {
									itemId : 'removeButton',
									text : '删除',
									tooltip : 'Remove the selected item',
									icon : '../../image/extimage/delete.png',
									disabled : true
									//handler : deleteProducts
								}]
					}],
	listeners : {
		itemdblclick : function(t, r) {
			saveOrUpdate(r);
		}
	},
	bbar : Ext.create('Ext.PagingToolbar', {
				store : brandStore,
				displayInfo : true,
				displayMsg : '显示{0}-{1}共{2}条',
				emptyMsg : "没有数据"
			})
});