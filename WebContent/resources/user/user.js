 Ext.define('User',{
   extend : 'Ext.data.Model',
     fields: [
            { name: 'id'},
            { name: 'nickName'},
            { name: 'realName'},
            { name: 'grade'},
            { name: 'email'},
            { name: 'qq'},
            { name: 'phone'},
            { name: 'password'},
            { name: 'skyId'},
            { name: 'createTime'},
            { name: 'updateTime'}
        ]
});
 
var userStore =   Ext.create('Ext.data.Store', {
             model:'User',
            pageSize:20,
            proxy: {
                type: 'ajax',
                url: '../../admin/user/userList.htm',
                reader:{
                    root : 'rows',
		           totalProperty : 'total'
                }
            },
            autoLoad: true
        });
var userGrid = Ext.create('Ext.grid.Panel',{
	    autoScroll : true,
        title: '用户列表',
       // margin: '0 0 0 0',
        store: userStore,
        width : $(window).width() - 20,
	    height : $(window).height() - 30,
	    multiSelect : true,
		margin : {
				left : 1
			},
        columns: [
            { text: '用户ID', dataIndex: 'id', width: 80 },
            { text: '昵称', dataIndex: 'nickName', width: 100},
            { text: '真实姓名', dataIndex: 'realName', width: 90},
            { text: '年级', dataIndex: 'grade', width: 70},
            { text: '邮箱', dataIndex: 'email', width: 130},
            { text: 'QQ', dataIndex: 'qq', width: 100},
            { text: '手机号', dataIndex: 'phone', width: 130},
            { text: '密码', dataIndex: 'password', width: 130},
            { text: 'skyId', dataIndex: 'skyId', width: 140},
            { text: '注册日期', dataIndex: 'createTime', width: 150},
            { text: '更新日期', dataIndex: 'createTime', width: 150},{
             xtype:'actioncolumn',
             text :'操作',
            width:50,
            items: [{
                icon: '../../image/extimage/remove.png',  // Use a URL in the icon config
                tooltip: 'Edit',
                handler: function(grid, rowIndex, colIndex) {
                    var rec = grid.getStore().getAt(rowIndex);
                     var id = rec.get('id');
                     $.post('../../admin/user/userDelete.htm',{id:id},function (result){
                     	if(result.flag){
                        Ext.Msg.alert('提示', result.obj);
                        }else{
                        Ext.Msg.alert('提示', "删除失败！");
                        }
                     },'json');
                }
            }]
            }
        ],
        listeners : {
				itemdblclick : function(t, r) {
					save(r);
				}
			},
	   bbar : Ext.create('Ext.PagingToolbar', {
						store : userStore,
						displayInfo : true,
						displayMsg : '显示{0}-{1}共{2}条',
						emptyMsg : "没有数据"

					})
    });