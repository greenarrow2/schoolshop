Ext.QuickTips.init();
var adminWin;
function addOrUpdate(record){
	if(adminWin){
	   adminWin.destroy();
	}
	var status;
	if(record.raw){
	   status = record.raw.visible;
	}
	var sex=1;
	if(record.raw){
	   sex = record.raw.sex;
	}
     var  adminForm = new Ext.form.Panel({
		width : 485,
		height : 430,
		bodyPadding : 5,
		id : "adminForm",
		layout : 'form',// 表单布局
		url : '../admin/addOrUpdateAdmin.htm', // 保存路径
		frame : false,
		buttonAlign : 'center',
		fieldDefaults : {
			msgTarget : 'side',
			labelWidth : 75
		},
		defaultType : 'textfield',
		defaults : {
			anchor : '90%'
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
					fieldLabel : '管理员名称',
					name : 'adminName',
					allowBlank : false,
					emptyText : '不能为空',
					blankText : '管理员名称不能为空',
					allowBlank : false
				}, {
					fieldLabel : '管理员姓名',
					name : 'realName',
					emptyText : '不能为空',
					allowBlank : false,
					blankText : '管理员姓名不能为空',
					width : 120
				}, {
					fieldLabel : '手机号',
					name : 'phone',
					allowBlank : false,
					blankText : '手机号不能为空',
					regex : /\d{11}|/,
                    regexText : '手机号输入错误',
					width : 120
				}, {
					fieldLabel : 'QQ号',
					name : 'qq',
					regex : /[1-9][0-9]{4,}/,
                    regexText : 'QQ号输入错误',
					width : 120
				}, {
					fieldLabel : '邮箱',
					name : 'email',
					inputType :'email',
					 regex : /\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*/,
                     regexText : '输入邮箱格式有误',
					width : 120
				}, {
					fieldLabel : '管理员姓名',
					name : 'realName',
					width : 120
				}, {
					fieldLabel : '密码',
					name : 'password',
					inputType:'password',
                    id : 'password',
                    regex : /^\w+$/,
                   regexText : '密码只能用字母和数字组成',
                    minLength : 6,
                    minLengthText : '你输入的密码长度少于6',
					width : 120
				}, {
					fieldLabel : '确认密码',
					name : 'rePassword',
					id : 'rePassword',
					inputType:'password',
					 minLength : 6,
					regex : /^\w+$/,
                    regexText : '密码只能用字母和数字组成',
                    minLengthText : '你输入的确认密码长度少于6',
					width : 120
				},{
				   
					fieldLabel : '性别',
					xtype : 'radiogroup',
					items : [{
								boxLabel : '男',
								name : 'sex',
								inputValue : 1,
								checked : sex == 1? true:false

							}, {
								boxLabel : '女',
								name : 'sex',
								inputValue : 2,
								checked : sex != 1? true:false
							}]
				
				}, {
					fieldLabel : '状态',
					xtype : 'radiogroup',
					items : [{
								boxLabel : '可用',
								name : 'visible',
								inputValue : true,
								checked : status !=null? status:true

							}, {
								boxLabel : '冻结',
								name : 'visible',
								inputValue : false,
								checked : status !=null? !status:false
							}]
				}],
		buttons : [{
			text : '提交',
			handler : function() {
				adminForm.getForm().submit({
							method : 'post',
							success : function(form, action) {
								queryAdmins();// 重新加载
								Ext.MessageBox.alert('友情提示', action.result.obj);
							},
							failure : function(form, action) {
								Ext.MessageBox.alert('友情提示', action.result.obj);
							}
						});
			}
		}, {
			text : '清空',
			handler : function() {
				adminForm.form.reset();
			}
		}]

	
     });
    adminWin = new Ext.window.Window({
                closable : true,
                title : '录入管理员信息',
				collapsible : true,
				animCollapse : true,
				maximizable : true,
				autoScroll : true,
				width : 500,
				height : 480,
				minWidth : 300,
				minHeight : 200,
				modal : true,
				items : [adminForm],
				listeners : {
					beforeclose : function() {

					}
				}
			
    }); 
     if(record.raw){
     adminForm.loadRecord(record);
     }
     adminWin.show();
}

function deleteAdmins(){
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
			Ext.MessageBox
					.confirm(
							'确认框',
							'已保存的数据删除后将不能恢复，您确定继续吗？',
							function(r) {
								if ('yes' == r) {
									$.post('../../admin/admin/deleteAdmins.htm',
													{
														ids : actionList
													},
													function(json) {
														if (json) {
															queryOrderItem();
															Ext.MessageBox
																	.alert(
																			'提示',
																			json.obj);
														} else {
															Ext.MessageBox
																	.alert(
																			'提示',
																			'网络异常');
														}
													}, 'json');
								}

							});
		}
	}

}
function queryAdmins(){
    adminStore.load({
       
		url : '../../admin/admin/adminList.htm',
		actionMethods : {
			create : 'POST',
			read : 'POST', // by default GET
			update : 'POST',
			destroy : 'POST'
		}
    });
}
Ext.define('Admin',{
	extend : 'Ext.data.Model',
	fields : [ {
		name : 'id'
	}, {
		name : 'adminName'
	}, {
		name : 'password'
	}, {
		name : 'realName'
	},{
		 name : 'createTime'
	}, {
		name : 'updateTime'
	}, {
		name : 'phone'
	}, {
		name : 'email'
	}, {
		name : 'qq'
	},{
	    name : 'visible'
	}]
})

var adminStore = Ext.create('Ext.data.Store',{
   model : 'Admin',
   proxy : {
		type : 'ajax',
		url : '../../admin/admin/adminList.htm',
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
			grid.down('#removeButton').setDisabled(selections.length === 0);
		}
	}
});
var grid = Ext.create('Ext.grid.Panel', {
	autoScroll : true,
	store : adminStore,
	id : 'button-grid',
	title : '管理员列表管理',
	width : $(window).width() - 5,
	height : $(window).height() - 5,
	multiSelect : true,
	columns : [ {
		header : 'ID',
		dataIndex : 'id',
		width : 50
	}, {
		header : '用户名',
		dataIndex : 'adminName',
		width : 80
	}, {
		header : '密码',
		dataIndex : 'password',
		width : 80 
	}, {
		header : '真实姓名',
		dataIndex : 'realName',
		width : 80
	}, {
		header : '创建日期',
		dataIndex : 'createTime',
		width : 150 
	}, {
		header : '更新日期',
		dataIndex : 'updateTime',
		width : 150 
	}, {
		header : '手机号',
		dataIndex : 'phone',
		width : 150 
	}, {
		header : '邮箱',
		dataIndex : 'email',
		width : 130 
	}, {
		header : 'QQ',
		dataIndex : 'qq',
		width : 100 
	}, {
		header : '性别',
		dataIndex : 'sex',
		width : 50,
		renderer : function (value){
		   if(value==1){
		      return '男';
		   }else{
		      return '女';
		   }
		}
	}, {
		header : '状态',
		dataIndex : 'visible',
		width : 50,
		renderer : function (value){
		    if(value){
		    	return '可用';
		    }else{
		       return '冻结';
		    }
		}
	}, {
		xtype : 'actioncolumn',
		header : '操作',
		width : 110,
		items : [ {
			icon : '../../image/extimage/remove.png',
			tooltip : '删除管理员',
			handler : function(grid, rindex, cindex) {
				var record = grid.getStore().getAt(rindex);
				var id = record.get("id");
				$.post('../../admin/admin/deleteAdmin.htm', {
					id : id
				}, function(json) {
					if (json.success) {
						queryAdmins();
						Ext.MessageBox.alert('提示', json.obj);
					} else {
						Ext.MessageBox.alert('提示', json.obj);
					}

				}, 'json');
			}
		}, "->", {
			icon : '../../image/extimage/edit.png',
			tooltip : '编辑管理员',
			handler : function(grid, rindex, cindex) {
				var record = grid.getStore().getAt(rindex);
				addOrUpdate(record);
			}
		}, "->", {
			icon : '../../image/extimage/visible.png',
			tooltip : '设置管理员状态',
			handler : function(grid, rindex, cindex) {
				var record = grid.getStore().getAt(rindex);
				var id = record.get("id");
				var visible = record.get("visible");
				$.post('../../admin/admin/updateAdminVisible.htm', {
					id : id,
					visible : visible
				}, function(json) {
					if (json.success) {
						queryAdmins();
						Ext.MessageBox.alert('提示', json.obj);
					} else {
						Ext.MessageBox.alert('提示', "服务器内部错误！");
					}

				}, 'json');
			}
		} ]

	} ],
	columnLines : true,
	selModel : selModel,
 
	 dockedItems : [{
		xtype : 'toolbar',
		items : [{
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
			handler : deleteAdmins
		} ]
	} ],
	listeners : {
		itemdblclick : function(t, r) {
			addOrUpdate(r);
		}
	},
	bbar : Ext.create('Ext.PagingToolbar', {
		store : adminStore,
		displayInfo : true,
		displayMsg : '显示{0}-{1}共{2}条',
		emptyMsg : "没有数据"
	})
});

