function deleteOrderItems() {
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
									$
											.post(
													'../../admin/orderitem/deleteOrderItems.htm',
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
function queryOrderItem() {
	orderItemStore.load({
		url : '../../admin/orderitem/orderItemList.htm',
		actionMethods : {
			create : 'POST',
			read : 'POST', // by default GET
			update : 'POST',
			destroy : 'POST'
		},
		params : {
			productName : Ext.getCmp('product_name').getValue(),
			ordeId : Ext.getCmp("order_num").getValue(),
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
			columns : 10,
			margin : {
				top : -5,
				bottom : -8
			},
			frame : false,
			items : [
					{
						id : 'product_name',
						xtype : 'textfield',
						fieldLabel : '品名',
						name : 'productName',
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
						width : 170
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
						html : '状态：&nbsp;<select id="statusId" name="status"><option value= "" select="true">全部</option>'
								+ '<option value=true >已处理</option>'
								+ '<option value=false >未处理</option>'
								+ '</select>'
					}, {
						text : '查询',
						icon : '../../image/extimage/zoom.png',
						scale : 'medium',
						handler : queryOrderItem
					} ]
		});
//订单模型
Ext.define('OrderItem', {
	extend : 'Ext.data.Model',
	fields : [ {
		name : 'id'
	}, {
		name : 'productId'
	}, {
		name : 'productName'
	}, {
		name : 'productPrice'
	}, {
		name : 'amount'
	}, {
		name : 'done'
	}, {
		name : 'styleName'
	}, {
		name : 'styleId'
	}, {
		name : 'order'
	} ]
})

var orderItemStore = Ext.create('Ext.data.Store', {
	model : 'OrderItem',
	pageSize : 20,
	proxy : {
		type : 'ajax',
		url : '../../admin/orderitem/orderItemList.htm',
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

/*orderItemStore.on('beforeload', function(store, options) {
	var new_params = {
		productName : Ext.getCmp('product_name').getValue(),
		ordeId : Ext.getCmp("order_num").getValue(),
		beginTime : Ext.getCmp('begin_time').getValue(),
		endTime : Ext.getCmp('end_time').getValue(),
		done : $('#statusId').val(),
		timeType : $('#timeType').val()
	};
	Ext.apply(orderItemStore.proxy.extraParams, new_params);
});*/
var selModel = Ext.create('Ext.selection.CheckboxModel', {
	listeners : {
		selectionchange : function(sm, selections) {
			grid.down('#removeButton').setDisabled(selections.length === 0);
		}
	}
});
var grid = Ext.create('Ext.grid.Panel', {
	autoScroll : true,
	store : orderItemStore,
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
		header : '所属订单号',
		dataIndex : 'order',
		width : 150,
		renderer : function (value){
		  return  value.orderId;
		}
	}, {
		header : '商品名称',
		dataIndex : 'productName',
		width : 100
	}, {
		header : '商品ID',
		dataIndex : 'productId',
		width : 100
	}, {
		header : '样式名称',
		dataIndex : 'styleName',
		width : 100
	}, {
		header : '样式ID',
		dataIndex : 'styleId',
		width : 100
	}, {
		header : '处理情况',
		dataIndex : 'done',
		width : 80,
		renderer : function(value) {
			return value == true ? '已处理' : '未处理';
		}
	}, {
		header : '上架日期',
		dataIndex : 'order',
		width : 150,
		renderer : function(value) {
			return value.createTime;
		}
	}, {
		header : '更新日期',
		dataIndex : 'order',
		width : 150,
		renderer : function(value) {
			return value.updateTime;
		}
	}, {
		header : '用户',
		dataIndex : 'order',
		width : 80,
		renderer : function(value) {
			return value.user.userName;
		}
	}, {
		xtype : 'actioncolumn',
		header : '操作',
		width : 110,
		items : [ {
			icon : '../../image/extimage/remove.png',
			handler : function(grid, rindex, cindex) {
				var record = grid.getStore().getAt(rindex);
				var id = record.get("id");
				// showWait();
				$.post('../../admin/orderitem/deleteOrderItem.htm', {
					id : id
				}, function(json) {
					if (json.success) {
						queryProduct();
						Ext.MessageBox.alert('提示', json.obj);
					} else {
						Ext.MessageBox.alert('提示', "审查失败！");
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
				$.post('../../admin/orderitem/updateProductDone.htm', {
					id : id,
					visible : visible
				}, function(json) {
					if (json.success) {
						queryProduct();
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

	// inline buttons
	dockedItems : [ {
		xtype : 'toolbar',
		items : [ buttonGroup ]
	}, {
		xtype : 'toolbar',
		items : [{
			text : '添加',
			tooltip : 'Add a new row',
			icon : '../../image/extimage/add.png'
		//handler : addOrUpdate
		}, '-', {
			itemId : 'removeButton',
			text : '删除',
			tooltip : 'Remove the selected item',
			icon : '../../image/extimage/delete.png',
			disabled : true,
			handler : deleteOrderItems
		} ]
	} ],
	listeners : {
		itemdblclick : function(t, r) {
			addOrUpdate(r);
		}
	},
	bbar : Ext.create('Ext.PagingToolbar', {
		store : orderItemStore,
		displayInfo : true,
		displayMsg : '显示{0}-{1}共{2}条',
		emptyMsg : "没有数据"
	})
});
