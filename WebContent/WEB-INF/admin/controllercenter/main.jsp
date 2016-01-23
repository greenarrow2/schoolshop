<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/admin/share/public.jsp"%>
<html>
<%@ include file="/WEB-INF/admin/share/jspublic.jsp"%>
<head>
<title>校园云后台管理系统</title>

    <!-- GC -->

<style type="text/css">
p {
    margin:5px;
}
/* .settings {
    background-image:url(../shared/icons/fam/folder_wrench.png);
}
.nav {
    background-image:url(../shared/icons/fam/folder_go.png);
}
.info {
    background-image:url(../shared/icons/fam/information.png);
} */
</style>
<script type="text/javascript">
    Ext.require(['*']);
    Ext.onReady(function() {

        Ext.QuickTips.init();
        
        // NOTE: This is an example showing simple state management. During development,
        // it is generally best to disable state management as dynamically-generated ids
        // can change across page loads, leading to unpredictable results.  The developer
        // should ensure that stable state ids are set for stateful components in real apps.
        Ext.state.Manager.setProvider(Ext.create('Ext.state.CookieProvider'));
    	var tabs =  Ext.create('Ext.tab.Panel', {
            region: 'center', // a center region is ALWAYS required for border layout
            deferredRender: false,
            activeTab : 20 // first tab initially active
           
        })
        //商品池
    	var store = Ext.create('Ext.data.TreeStore',{
    		root : {
    			expanded : true,
    			children : [ {
    				text : "商品管理", 
    				leaf : false,
    				expanded : false,
    				children : [ {
    					id:1,
    					text : "商品列表",
    					url : "menu/productList.htm",
    					leaf : true
    				} ,{
    					id:2,
    					text : "添加商品",
    					url : "menu/addProduct.htm",
    					leaf : true
    				},{
    					id:3,
    					text : "商品样式",
    					url : "menu/styleList.htm",
    					leaf : true
    			   }
    				]
    			   }, {
    				text : "商品设置",
    				leaf : false,
    				expanded : true,
    				children : [ {
    					id:6,
    					text : "分类列表",
    					url : "menu/typeList.htm",
    					leaf : true
    				}, {
    					id:7,
    					text : "品牌列表",
    					url : "menu/brandList.htm",
    					leaf : true
    				}, {
    					id:8,
    					text : "类型列表",
    					url : "menu/productGenreList.htm",
    					leaf : true
    				},{
    					id:9,
    					text : "规格列表",
    					url : "menu/brandList.htm",
    					leaf : true
    				}]
    			}, {
    				text : "标签管理",
    				leaf : false,
    				expanded : true,
    				children : [ {
    					id:11,
    					text : "标签列表",
    					url : "feedback.jsp",
    					leaf : true
    				},{
    					id:12,
    					text : "标签商品设置",
    					url : "report.jsp",
    					leaf : true
    				},{
    					id:13,
    					text : "照片管理",
    					url : "managephotos.jsp",
    					leaf : true
    				} ]
    			} ]
    		}
    	})
    	//用户池
    	var storeUser  = Ext.create('Ext.data.TreeStore',{
    		root : {
    			expanded : true,
    			children : [ {
    				text : "用户管理", 
    				leaf : false,
    				expanded : false,
    				children : [ {
    					id:21,
    					text : "用户列表",
    					url : "menu/userList.htm",
    					leaf : true
    				} ,{
    					id:22,
    					text : "机器人消息回复",
    					url : "messageRobot.jsp",
    					leaf : true
    				} ]
    			}, {
    				text : "系统",
    				leaf : false,
    				expanded : true,
    				children : [ {
    					id:23,
    					text : "系统通知",
    					url : "sysnotify.jsp",
    					leaf : true
    				} ]
    			}, {
    				text : "客服",
    				leaf : false,
    				expanded : true,
    				children : [ {
    					id:24,
    					text : "意见反馈",
    					url : "feedback.jsp",
    					leaf : true
    				},{
    					id:25,
    					text : "用户举报",
    					url : "report.jsp",
    					leaf : true
    				},{
    					id:26,
    					text : "照片管理",
    					url : "managephotos.jsp",
    					leaf : true
    				} ]
    			},{
    				text : "夜吧管理",
    				leaf : false,
    				expanded : true,
    				children : [ {
    					id:27,
    					text : "夜场信息管理",
    					url : "nightmarinfo.jsp",
    					leaf : true
    				},{
    					id:28,
    					text : "夜场经理管理",
    					url : "report.jsp",
    					leaf : true
    			},{
    				id:29,
    				text : "订房记录管理",
    				url : "report.jsp",
    				leaf : true
    			} ]
    			
    			}]
    		}
    	})
    	var storeAdmin  = Ext.create('Ext.data.TreeStore',{
    		root : {
    			expanded : true,
    			children : [ {
    				text : "管理员管理", 
    				leaf : false,
    				expanded : false,
    				children : [ {
    					id:21,
    					text : "管理员列表",
    					url : "menu/adminList.htm",
    					leaf : true
    				} ,{
    					id:22,
    					text : "管理员角色",
    					url : "messageRobot.jsp",
    					leaf : true
    				} ]
    			} ]
    		}
    	})
    	var orderStore =  Ext.create('Ext.data.TreeStore',{
    		root : {
    			expanded : true,
    			children : [ {
    				text : "订单管理", 
    				leaf : false,
    				expanded : false,
    				children : [{
    					id:30,
    					text : "订单列表",
    					url : "menu/orderList.htm",
    					leaf : true
    				} , {
    					id:31,
    					text : "订单项列表",
    					url : "menu/orderItemList.htm",
    					leaf : true
    				} ,{
    					id:32,
    					text : "添加商品",
    					url : "menu/addProduct.htm",
    					leaf : true
    				},{
    					id:33,
    					text : "商品样式",
    					url : "menu/styleList.htm",
    					leaf : true
    			   }
    				]
    			   }, {
    				text : "商品设置",
    				leaf : false,
    				expanded : true,
    				children : [ {
    					id:34,
    					text : "分类列表",
    					url : "menu/typeList.htm",
    					leaf : true
    				}, {
    					id:35,
    					text : "品牌列表",
    					url : "menu/brandList.htm",
    					leaf : true
    				}, {
    					id:36,
    					text : "类型列表",
    					url : "menu/productGenreList.htm",
    					leaf : true
    				},{
    					id:37,
    					text : "规格列表",
    					url : "menu/brandList.htm",
    					leaf : true
    				}]
    			}, {
    				text : "标签管理",
    				leaf : false,
    				expanded : true,
    				children : [ {
    					id:38,
    					text : "标签列表",
    					url : "feedback.jsp",
    					leaf : true
    				},{
    					id:39,
    					text : "标签商品设置",
    					url : "report.jsp",
    					leaf : true
    				}]
    			} ]
    		}
    	})
    	var tree = Ext.create('Ext.tree.Panel', {
    		width : '100%',
    		height : '100%',
    		store : store,
    		rootVisible : false,
    		listeners:{
    			itemclick:{
    				fn:function(t,r,h){
    					if(!r.raw.url){
    						return;
    					}
    					if(tabs.items.length==0){
    						tab= tabs.add(Ext.widget('panel', { 
    							id:r.raw.id,
    							index:r.raw.id,
    					        title: r.raw.text,  
    					        html: '<iframe style="width:100%;height:100%" src="'+r.raw.url+'"></iframe>',
    					        closable: true 
    					    }));  
    						tabs.setActiveTab(tab); 
    						return;
    					}
    					var isnew=true;
    					var tab=null;
    					tabs.items.each(function(item){
    						console.log(item);
    						if(item.id==r.raw.id){
    							isnew =false;
    							tab = item;
    						}
    					});
    					if(isnew){
    						tab= tabs.add(Ext.widget('panel', { 
    							id:r.raw.id,
    							index:r.raw.id,
    					        title: r.raw.text,  
    					        html: '<iframe style="width:100%;height:100%" src="'+r.raw.url+'"></iframe>',
    					        closable: true 
    					    }));  
    						tabs.setActiveTab(tab); 
    					}else{
    						tabs.setActiveTab(tab); 
    					}
    				}
    			}
    		}
    	});
    	//用户树
    	var treeUser = Ext.create('Ext.tree.Panel', {
    		width : '100%',
    		height : $(window).height() - 20,
    		store : storeUser,
    		rootVisible : false,
    		listeners:{
    			itemclick:{
    				fn:function(t,r,h){
    					if(!r.raw.url){
    						return;
    					}
    					if(tabs.items.length==0){
    						tab= tabs.add(Ext.widget('panel', { 
    							id:r.raw.id,
    							index:r.raw.id,
    					        title: r.raw.text,  
    					        html: '<iframe style="width:100%;height:100%" src="'+r.raw.url+'"></iframe>',
    					        closable: true 
    					    }));  
    						tabs.setActiveTab(tab); 
    						return;
    					}
    					var isnew=true;
    					var tab=null;
    					tabs.items.each(function(item){
    						console.log(item);
    						if(item.id==r.raw.id){
    							isnew =false;
    							tab = item;
    						}
    					});
    					if(isnew){
    						tab= tabs.add(Ext.widget('panel', { 
    							id:r.raw.id,
    							index:r.raw.id,
    					        title: r.raw.text,  
    					        html: '<iframe style="width:100%;height:100%" src="'+r.raw.url+'"></iframe>',
    					        closable: true 
    					    }));  
    						tabs.setActiveTab(tab); 
    					}else{
    						tabs.setActiveTab(tab); 
    					}
    				}
    			}
    		}
    	});
    	//用户树
    	var treeAdmin = Ext.create('Ext.tree.Panel', {
    		width : '100%',
    		height : $(window).height() - 20,
    		store : storeAdmin,
    		rootVisible : false,
    		listeners:{
    			itemclick:{
    				fn:function(t,r,h){
    					if(!r.raw.url){
    						return;
    					}
    					if(tabs.items.length==0){
    						tab= tabs.add(Ext.widget('panel', { 
    							id:r.raw.id,
    							index:r.raw.id,
    					        title: r.raw.text,  
    					        html: '<iframe style="width:100%;height:100%" src="'+r.raw.url+'"></iframe>',
    					        closable: true 
    					    }));  
    						tabs.setActiveTab(tab); 
    						return;
    					}
    					var isnew=true;
    					var tab=null;
    					tabs.items.each(function(item){
    						console.log(item);
    						if(item.id==r.raw.id){
    							isnew =false;
    							tab = item;
    						}
    					});
    					if(isnew){
    						tab= tabs.add(Ext.widget('panel', { 
    							id:r.raw.id,
    							index:r.raw.id,
    					        title: r.raw.text,  
    					        html: '<iframe style="width:100%;height:100%" src="'+r.raw.url+'"></iframe>',
    					        closable: true 
    					    }));  
    						tabs.setActiveTab(tab); 
    					}else{
    						tabs.setActiveTab(tab); 
    					}
    				}
    			}
    		}
    	});
    	//用户树
    	var orderTree = Ext.create('Ext.tree.Panel', {
    		width : '100%',
    		height : $(window).height() - 20,
    		store : orderStore,
    		rootVisible : false,
    		listeners:{
    			itemclick:{
    				fn:function(t,r,h){
    					if(!r.raw.url){
    						return;
    					}
    					if(tabs.items.length==0){
    						tab= tabs.add(Ext.widget('panel', { 
    							id:r.raw.id,
    							index:r.raw.id,
    					        title: r.raw.text,  
    					        html: '<iframe style="width:100%;height:100%" src="'+r.raw.url+'"></iframe>',
    					        closable: true 
    					    }));  
    						tabs.setActiveTab(tab); 
    						return;
    					}
    					var isnew=true;
    					var tab=null;
    					tabs.items.each(function(item){
    						console.log(item);
    						if(item.id==r.raw.id){
    							isnew =false;
    							tab = item;
    						}
    					});
    					if(isnew){
    						tab= tabs.add(Ext.widget('panel', { 
    							id:r.raw.id,
    							index:r.raw.id,
    					        title: r.raw.text,  
    					        html: '<iframe style="width:100%;height:100%" src="'+r.raw.url+'"></iframe>',
    					        closable: true 
    					    }));  
    						tabs.setActiveTab(tab); 
    					}else{
    						tabs.setActiveTab(tab); 
    					}
    				}
    			}
    		}
    	});

        var viewport = Ext.create('Ext.Viewport', {
            id: 'border-example',
            layout: 'border',
            autoScroll : true,
            items: [
            // create instance immediately
            Ext.create('Ext.Component', {
                region: 'north',
                height: 32, // give north and south regions a height
                autoEl: {
                    tag: 'div',
                    html:'<p>欢迎呵呵！</p>'
                }
            }), {
                // lazily created panel (xtype:'panel' is default)
                region: 'south',
                contentEl: 'south',
                split: true,
                height: 100,
                minSize: 100,
                maxSize: 200,
                collapsible: true,
                collapsed: true,
                title: 'South',
                margins: '0 0 0 0'
            }, {
                xtype: 'tabpanel',
                region: 'east',
                title: '用户信息',
                dockedItems: [{
                    dock: 'top',
                    xtype: 'toolbar',
                    items: [ '->', {
                       xtype: 'button',
                       text: 'test',
                       tooltip: 'Test Button'
                    }]
                }],
                animCollapse: true,
                collapsible: true,
                collapsed : true,
                split: true,
                width: 225, // give east and west regions a width
                minSize: 175,
                maxSize: 400,
                margins: '0 5 0 0',
                activeTab: 1,
                tabPosition: 'bottom',
                items: [{
                    html: '<p>A TabPanel component can be a region.</p>',
                    title: 'A Tab',
                    autoScroll : true,
                }, Ext.create('Ext.grid.PropertyGrid', {
                        title: 'Property Grid',
                        closable: true,
                        source: {
                            "(name)": "Properties Grid",
                            "grouping": false,
                            "autoFitColumns": true,
                            "productionQuality": false,
                            "created": Ext.Date.parse('10/15/2006', 'm/d/Y'),
                            "tested": false,
                            "version": 0.01,
                            "borderWidth": 1
                        }
                    })]
            }, {
                region: 'west',
                stateId: 'navigation-panel',
                id: 'west-panel', // see Ext.getCmp() below
                title: '系统管理',
                split: true,
                width: 200,
                height :'100%',
                minWidth: 175,
                maxWidth: 400,
                collapsible: true,
                animCollapse: true,
                autoScroll : true,
                scroll : 'vertical',
                margins: '0 0 0 5',
                layout: 'accordion',
                items: [{
                    title: '商品',
                    iconCls: 'nav',
                    autoScroll : true,
                    scroll : 'vertical',
                    items : [tree]
                }, {
                    title: '订单',
                    iconCls: 'settings',
                    items : [orderTree]
                }, {
                    title: '用户',
                    items:[treeUser],
                    iconCls: 'info'
                }, {
                    title: '校园',
                    html: '<p>Some info in here.</p>',
                    iconCls: 'info'
                }, {
                    title: '促销',
                    html: '<p>Some info in here.</p>',
                    iconCls: 'info'
                }, {
                    title: '页面',
                    html: '<p>Some info in here.</p>',
                    iconCls: 'info'
                },{
                	 title: '设置',
                     html: '<p>Some info in here.</p>',
                     iconCls: 'info'
                },{
               	 title: '权限',
               	items : [treeAdmin],
                 iconCls: 'info'
            }]
            }, 
            // in this instance the TabPanel is not wrapped by another panel
            // since no title is needed, this Panel is added directly
            // as a Container
            tabs
           ]
        });
        // get a reference to the HTML element with id "hideit" and add a click listener to it
    /*     Ext.get("hideit").on('click', function(){
            // get a reference to the Panel that was created with id = 'west-panel'
            var w = Ext.getCmp('west-panel');
            // expand or collapse that Panel based on its collapsed property state
            w.collapsed ? w.expand() : w.collapse();
        }); */
    });
    </script>
</head>
<body>
    <!-- use class="x-hide-display" to prevent a brief flicker of the content -->
    <div id="west" class="x-hide-display">
        <p>Hi. I'm the west panel.</p>
    </div>
     
    <div id="props-panel" class="x-hide-display" style="width:200px;height:200px;overflow:hidden;">
    </div>
    <div id="south" class="x-hide-display">
            <center>版权归校园云所有</center>
    </div>
</body>
</html>
