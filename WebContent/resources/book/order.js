Ext.QuickTips.init();
function updateStatus(id,state){
	var statusForm = new Ext.form.Panel({
	       width : 400,
	       height : 200,
	       id : "productForm",
			layout : 'form',//表单布局
			url : '../../admin/order/updateOrderState.htm', //保存路径
			frame : false,//
			autoScroll : true,
			buttonAlign : 'center',
			fieldDefaults : {
				msgTarget : 'side',
				labelWidth : 75
			},
			defaultType : 'textfield',
			defaults : {
				anchor : '50%'
			},
			items : [{
									xtype : 'numberfield',
									id : 'id',
									name : 'id',
									width : 200,
									value : id,
									hidden : true
								} , {
									fieldLabel : '发货状态',
									xtype : 'radiogroup',
									items : [{
												boxLabel : '取消',
												name : 'state',
												inputValue : 'CANCEL',
												checked : state=='CANCEL'?true:false

											},{
												boxLabel : '等待发货',
												name : 'state',
												inputValue : 'WAITDELIVER',
												checked : state=='WAITDELIVER'?true:false

											}, {
												boxLabel : '已发货',
												name : 'state',
												inputValue : 'DELIVERED',
												checked : state=='DELIVERED'?true:false
											}, {
												boxLabel : '已收货',
												name : 'state',
												inputValue : 'RECEIVED',
												checked : state=='RECEIVED'?true:false
											}]
								} 
					],
			buttons : [{
				text : '提交',
				handler : function() {
					statusForm.getForm().submit({
								method : 'post',
								success : function(form, action) {
									queryOrder();
									Ext.MessageBox.alert('友情提示',
											action.result.obj);
								},
								failure : function(form, action) {
									Ext.MessageBox.alert('友情提示',
											"操作失败！");
								}
							});
				}
			}, {
				text : '清空',
				handler : function() {
					productId = null;
					Ext.getCmp('statusForm').form.reset();
				}
			}]
	});

	var statusWin = Ext.create('Ext.window.Window', {

				title : '商品信息',
				collapsible : true,
				animCollapse : true,
				maximizable : true,
				autoScroll : true,
				width : 415,
				height : 260,
				minWidth : 300,
				minHeight : 200,
				modal : true,
				items : [statusForm],
				listeners : {
					beforeclose : function() {

					}
				}
			});
	statusWin.show();
}
var orderWin;
function orderDetail(record){
	if(orderWin){
		orderWin.destroy();
	}
	  var orderDetailForm = Ext.create('Ext.panel.Panel', {
			width : $(window).width() - 150,
			height : $(window).height(),
			id : "orderDetailForm",
			layout : 'form',//表单布局
			frame : false,//
			autoScroll : true,
			buttonAlign : 'center',
			fieldDefaults : {
				msgTarget : 'side',
				labelWidth : 75
			},
			defaultType : 'textfield',
			defaults : {
				anchor : '50%'
			},
			items : [{
						layout : 'form',
						xtype : 'fieldset',
						title : '订单详情',
						columnWidth : '5',
						items : [{
									xtype : 'label',
									fieldLabel : '订单：',
									html :'<div id="orderId"></div>'
								}]
					            }],
			buttons : [{
				text : '保存',
				handler : function() { 
					
				}
			}, {
				text : '关闭',
				handler : function() {
					 orderWin.close();
				}
			}]

		})
		$.post('../../admin/order/getOrderDetail.htm',{id:record.raw.id},function (result){$('#orderId').html(result)},'html')
      orderWin = new Ext.window.Window({
        title : '订单详情',
        collapsible : true,
				animCollapse : true,
				maximizable : true,
				autoScroll : true,
				width : $(window).width() - 150,
			    height : $(window).height() - 60,
				minWidth : 300,
				minHeight : 200,
				modal : true,
				items : [orderDetailForm],
				listeners : {
					beforeclose : function() {

					}
				}
      }
      );
      orderWin.show();
	}
function deleteOrders() {
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
									$.post('../../admin/order/deleteOrders.htm',
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
function queryOrder() {
	orderStore.load({
		url : '../../admin/order/orderList.htm',
		actionMethods : {
			create : 'POST',
			read : 'POST', // by default GET
			update : 'POST',
			destroy : 'POST'
		},
		params : {
			userName : Ext.getCmp('user_name').getValue(),
			realName : Ext.getCmp('real_name').getValue(),
			orderId : Ext.getCmp('order_num').getValue(),
			beginTime : Ext.getCmp('begin_time').getValue(),
			endTime : Ext.getCmp('end_time').getValue(),
			done : $('#statusId').val(),
			timeType : $('#timeType').val()
		}
	});
}

var buttonGroup = new Ext.ButtonGroup(
		{
			autoScroll : true,
			columns : 14,
			margin : {
				top : -5,
				bottom : -8
			},
			frame : false,
			items : [
					{
						id : 'user_name',
						xtype : 'textfield',
						fieldLabel : '用户名',
						name : 'userName',
						labelWidth : 50,
						width : 150
					},{
						id : 'real_name',
						xtype : 'textfield',
						fieldLabel : '姓名',
						name : 'realName',
						labelWidth : 40,
						width : 150
					},
					{
						id : 'order_num',
						xtype : 'textfield',
						fieldLabel : '订单号',
						name : 'orderId',
						labelWidth : 50,
						width : 200
					},
					{
						id : 'begin_time',
						xtype : 'datefield',
						fieldLabel : '时间段',
						name : 'beginTime',
						labelWidth : 50,
						width : 160
					},
					{
						xtype : 'label',
						html : '-'
					},
					{
						id : 'end_time',
						xtype : 'datefield',
						name : 'endTime',
						labelWidth : 40,
						width : 120
					},
					{
						xtype : 'label',
						html : '<select id="timeType" name="timeType">'
								+ '<option value=1 >创建</option>'
								+ '<option value=2 >更新</option>' + '</select>'
					},
					{
						xtype : 'label',
						html : '状态：&nbsp;<select id="statusId" name="state"><option value= "" select="true">全部</option>'
								+ '<option value="" >已处理</option>'
								+ '<option value="" >未处理</option>'
								+ '</select>'
					}, {
						text : '查询',
						icon : '../../image/extimage/zoom.png',
						scale : 'medium',
						handler : queryOrder
					} ]
		});
//订单模型
Ext.define('Order', {
	extend : 'Ext.data.Model',
	fields : [ {
		name : 'id'
	}, {
		name : 'orderId'
	}, {
		name : 'user'
	}, {
		name : 'productTotalPrice'
	},{
		 name : 'totalPrice'
	}, {
		name : 'amount'
	}, {
		name : 'state'
	}, {
		name : 'deliverFee'
	}, {
		name : 'paymentWay'
	}, {
		name : 'paymentstate'
	}, {
		name : 'createTime'
	}, {
		name : 'updateTime'
	},{
	    name : 'over'
	},{
	    name : 'orderDeliverInfo'
	} ]
});

var orderStore = Ext.create('Ext.data.Store', {
	model : 'Order',
	pageSize : 20,
	proxy : {
		type : 'ajax',
		url : '../../admin/order/orderList.htm',
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
orderStore.on('beforeload', function(store, options) {
	var new_params = {
		userName : Ext.getCmp('user_name').getValue(),
		realName : Ext.getCmp('real_name').getValue(),
		ordeId : Ext.getCmp("order_num").getValue(),
		beginTime : Ext.getCmp('begin_time').getValue(),
		endTime : Ext.getCmp('end_time').getValue(),
		done : $('#statusId').val(),
		timeType : $('#timeType').val()
	};
	Ext.apply(orderStore.proxy.extraParams, new_params);
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
	store : orderStore,
	id : 'button-grid',
	title : '商品列表管理',
	width : $(window).width() - 5,
	height : $(window).height() - 5,
	multiSelect : true,
	columns : [ {
		header : '订单项ID',
		dataIndex : 'id',
		width : 80
	},{
		header : '订单号',
		dataIndex : 'orderId',
		width : 170
	},{
		header : '状态',
		dataIndex : 'over',
		width : 45,
		renderer : function(value) {
			var status;
			if(value){
				status = 'checked';
			}
			return '<input type="checkbox" '+status+'>';
		}
	}, {
		header : '用户名',
		dataIndex : 'user',
		width : 80,
		renderer : function(value) {
			return value.userName;
		}
	}, {
		header : '姓名',
		dataIndex : 'user',
		width : 80,
		renderer : function(value) {
			return value.realName;
		}
	}, {
		header : '处理情况',
		dataIndex : 'state',
		width : 70,
		renderer : function(value) {
			var result;
			if(value=='CANCEL'){
			    result = '已取消';
			}
			if(value=='WAITDELIVER'){
			    result = '等待发货';
			}
			if(value=='DELIVERED'){
			    result = '已发货';
			}
			if(value=='RECEIVED'){
			    result = '已收货';
			}
			return result;
		}
	}, {
		header : '上架日期',
		dataIndex : 'createTime',
		width : 140 
	}, {
		header : '更新日期',
		dataIndex : 'updateTime',
		width : 140 
	}, {
		header : '商品总价',
		dataIndex : 'productTotalPrice',
		width : 80 
	}, {
		header : '总价',
		dataIndex : 'totalPrice',
		width : 80 
	}, {
		header : '支付方式',
		dataIndex : 'paymentWay',
		width : 70 ,
		renderer : function(value) {
			var result;
			if(value=='NET'){
			    result = '网上支付';
			}
			if(value=='COD'){
			    result = '货到付款';
			}
			return result;
		}
	}, {
		header : '支付状态',
		dataIndex : 'paymentstate',
		width : 70 ,
		renderer : function (value){
		      if(value){
		      return '<font color="blue">已支付</font>';
		      }else{
		       return '<font color="red">未支付</font>'
		      }
		}
	}, {
		xtype : 'actioncolumn',
		header : '操作',
		width : 140,
		items : [ {
			icon : '../../image/extimage/remove.png',
			tooltip : '删除订单',
			handler : function(grid, rindex, cindex) {
				var record = grid.getStore().getAt(rindex);
				var id = record.get("id");
				// showWait();
				$.post('../../admin/order/deleteOrder.htm', {
					id : id
				}, function(json) {
					if (json.success) {
						queryOrder();
						Ext.MessageBox.alert('提示', json.obj);
					} else {
						Ext.MessageBox.alert('提示', "审查失败！");
					}

				}, 'json');
			}
		}, "->", {
			icon : '../../image/extimage/edit.png',
			tooltip : '订单是否处理',
			handler : function(grid, rindex, cindex) {
				var record = grid.getStore().getAt(rindex);
				var id = record.get("id");
				var over = record.get("over");
				$.post('../../admin/order/updateOrderOver.htm',{id:id,over:over},function(json){
					if (json.success) {
						queryOrder();
						Ext.MessageBox.alert('提示', json.obj);
					} else {
						Ext.MessageBox.alert('提示', "订单处理失败！");
					}
				},'json');
			}
		}, "->", {
			icon : '../../image/extimage/visible.png',
			tooltip : '状态设置',
			handler : function(grid, rindex, cindex) {
				var record = grid.getStore().getAt(rindex);
				var id = record.get("id");
				var state = record.get("state");
				updateStatus(id,state);
			}
		},"->", {
			icon : '../../image/extimage/pay.png',
			tooltip : '支付状态',
			handler : function(grid, rindex, cindex) {
				var record = grid.getStore().getAt(rindex);
				var id = record.get("id");
				var paymentstate = record.get("paymentstate");
				$.post('../../admin/order/updateOrderPaymentState.htm',{id:id,paymentstate:paymentstate},function(json){
					if (json.success) {
						queryOrder();
						Ext.MessageBox.alert('提示', json.obj);
					} else {
						Ext.MessageBox.alert('提示', "审查失败！");
					}

				
				},'json');
			}
		} ]

	} ],
	columnLines : true,
	selModel : selModel,

	// inline buttons
	dockedItems : [ {
		xtype : 'toolbar',
		items : [ buttonGroup ]
	}, {
		xtype : 'toolbar',
		items : [{
			text : '添加',
			tooltip : '添加一个订单',
			icon : '../../image/extimage/add.png'
		//handler : addOrUpdate
		}, '-', {
			itemId : 'removeButton',
			text : '删除',
			tooltip : '多项删除',
			icon : '../../image/extimage/delete.png',
			disabled : true,
			handler : deleteOrders
		} ]
	} ],
	listeners : {
		itemdblclick : function(t, r) {
			orderDetail(r);
		}
	},
	bbar : Ext.create('Ext.PagingToolbar', {
		store : orderStore,
		displayInfo : true,
		displayMsg : '显示{0}-{1}共{2}条',
		emptyMsg : "没有数据"
	})
});
