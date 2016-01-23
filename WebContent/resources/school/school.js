var buttonGroup = new Ext.ButtonGroup({
	columns : 10,
	margin : {
		left : 0,
		top : -2,
		bottom :-5
	},
	frame : false,
	items : [{
				id : 'schoolName',
				xtype : 'textfield',
				fieldLabel : '学校名字',
				name : 'schoolName',
				labelWidth : 60,
				width : 200
			},{
				id : 'schoolAddress',
				xtype : 'textfield',
				fieldLabel : '地址',
				name : 'schoolAddress',
				labelWidth : 60,
				width : 200
			}, {
				xtype : 'label',
				fieldLabel:'可用',
				html : '可用：&nbsp;&nbsp;&nbsp;&nbsp;<select id="visible"><option value="" select="true">全部</option><option value=true >是</option></option><option value=false >否</option></select>'
			}, {
				text : '查询',
				scale : 'medium',
                handler:query
			}]
});

function query(){
       schoolStore.load({
           url:'../../admin/school/schoolList.htm',
           actionMethods : {
					create : 'POST',
					read : 'POST', // by default GET
					update : 'POST',
					destroy : 'POST'
				},
           params:{
            schoolName : Ext.getCmp('schoolName').getValue(),
            schoolAddress : Ext.getCmp('schoolAddress').getValue(),
            visible : $('#visible').val()
           }
       });
}

function saveOrUpdate(record) {
	var schoolForm = new Ext.form.Panel({
		width : '100%',
		height : 455,
		bodyPadding : 5,
		buttonAlign : 'center',
		id : "schoolForm",
		layout : 'form',//表单布局
		url : '../school/saveOrUpdateSchool.htm', //保存路径
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
					xtype : 'hiddenfield',
					name : 'id',
					id : 'id'
				}, {
					fieldLabel : '学校名称',
					name : 'schoolName',
					allowBlank : false
				}, {
					fieldLabel : '学校人数',
					name : 'peopleCount',
					width : 100
				}, {
					fieldLabel : '学院数量',
					name : 'yuanXiCount',
					width : 100,
					xtype : 'numberfield',
					minValue : 1
				}, {
					fieldLabel : '班级数量',
					name : 'classCount',
					xtype : 'numberfield',
					minValue : 1
				},{
				    fieldLabel : '学校地址',
					name : 'schoolAddress'
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
								inputValue : false,
								checked: true
							}]
				}],
		buttons : [{
			text : '保存',
			handler : function() {
				schoolForm.getForm().submit({
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
			text : '重置',
			handler : function() {
				schoolForm.getForm().reset();
			}
		}, {
			text : '关闭',
			handler : function() {
				schoolWin.close();
			}
		}]

	})

	var schoolWin = Ext.create('Ext.window.Window', {

				title : '校园信息',
				collapsible : true,
				animCollapse : true,
				maximizable : true,
				autoScroll : true,
				width : 500,
				height : 500,
				minWidth : 300,
				minHeight : 200,
				modal : true,
				items : [schoolForm],
				listeners : {
					beforeclose : function() {

					}
				}
			});
	if (record.raw)
		schoolForm.loadRecord(record);
	schoolWin.show();
}
Ext.define('School',{
			extend : 'Ext.data.Model',
			fields : [{
						name : 'id'
					}, {
						name : 'schoolName'
					}, {
						name : 'classCount'
					}, {
						name : 'classCount'
					}, {
						name : 'yuanXiCount'
					}, {
						name : 'peopleCount'
					}, {
						name : 'visible'
					},{
					    name : 'schoolAddress'
					}]

		});
var schoolStore = Ext.create('Ext.data.Store', {
			model : 'School',
			pageSize : 20,
			proxy : {
				type : 'ajax',
				url : '../../admin/school/schoolList.htm',
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
var selModel = Ext.create('Ext.selection.CheckboxModel', {
			listeners : {
				selectionchange : function(sm, selections) {
					schoolGrid.down('#removeButton')
							.setDisabled(selections.length === 0);
				}
			}
		});
		
		
var schoolGrid = Ext.create('Ext.grid.Panel', {
	autoScroll : true,
	title : '学校列表',
	store : schoolStore,
	width : $(window).width(),
	height : $(window).height(),
	multiSelect : true,
	margin : {
		left : 0
	},
	columns : [{
				header : '校园ID',
				dataIndex : 'id'
			}, {
				header : '学校名称',
				dataIndex : 'schoolName'
			}, {
				header : '学校人数',
				dataIndex : 'peopleCount'
			}, {
				header : '院系数量',
				dataIndex : 'yuanXiCount'
			}, {
				header : '班级数量',
				dataIndex : 'classCount'
			}, {
				header : '学校地址',
				dataIndex : 'schoolAddress',
				width : 200
			}, {
				header : '可用',
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
								$.post('../../admin/school/deleteSchool.htm', {
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
							     var visible = record.get('visible');
							      var waitMes = new Ext.window.MessageBox();
							     waitMes.wait('请稍等，正在操作！','提示');
							     $.post('../../admin/school/updateSchoolVisible.htm', {
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
				store : schoolStore,
				displayInfo : true,
				displayMsg : '显示{0}-{1}共{2}条',
				emptyMsg : "没有数据"
			})
});