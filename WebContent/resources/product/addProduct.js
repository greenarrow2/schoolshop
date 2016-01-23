var productId = null;
function photoSubmit() {
	var id = productId;
	if (!id) {
		Ext.MessageBox.alert('友情提示', '请先提交商品信息');
		return;
	}
	Ext.getCmp("photos").getForm().submit({
		url : "../../admin/product/saveProductImage.htm?id=" + id,
		method : "POST",
		waitMsg : "操作执行中...",
		success : function(form, action) {
			var imagePaths = action.result.obj;
			for (var index = 0; index < imagePaths.length; index++) {
				if(index/3==0){
					$("#photosDiv")
						.prepend('<br>');
				}
				$("#photosDiv")
						.prepend('<img style="width:150px;height:auto" src="'
								+ "../../" + imagePaths[index]
								+ '" />&nbsp;&nbsp;');
			}
			Ext.MessageBox.alert('友情提示', "图片上传成功！");
		},
		failure : function(form, action) {
			Ext.MessageBox.alert('友情提示', action.result.obj);
		}
	});
}
function coverSubmit() {
	var id = productId;
	if (!id) {
		Ext.MessageBox.alert('友情提示', '请先提交商品信息');
		return;
	}
	Ext.getCmp("cover").getForm().submit({
		url : "../../admin/product/saveProductCover.htm?id=" + id,
		method : "POST",
		waitMsg : "操作执行中...",
		success : function(form, action) {
			var imagePath = action.result.obj;
			$("#coverDiv").empty();
			$("#coverDiv").prepend('<img style="width:auto;height:auto" src="'
					 + imagePath + '" />');
			Ext.MessageBox.alert('友情提示', "图片上传成功！");
		},
		failure : function(form, action) {
			Ext.MessageBox.alert('友情提示', action.result.obj);
		}
	});
}
var productPhotos = Ext.create('Ext.form.Panel', {
			fileUpload : true,
			enctype : 'multipart/form-data',
			width : 400,
			height : $(window).height() - 10,
			layout : 'vbox',
			id : "photos",
			items : [{
						xtype : 'label',
						text : '上传相册'
					}, {
						id : 'photoOne',
						name : 'photos',
						width : 180,
						xtype : 'filefield',
						buttonText : '选择文件'
					}, {
						fieldLabel : '样式名称',
						xtype : 'textfield',
						name : 'styleName',
						width : 300,
						allowBlank : false
					}, {
						id : 'photoTwo',
						name : 'photos',
						width : 180,
						xtype : 'filefield',
						buttonText : '选择文件'
					}, {
						fieldLabel : '样式名称',
						xtype : 'textfield',
						name : 'styleName',
						width : 300,
						allowBlank : false
					}, {
						id : 'photoThree',
						name : 'photos',
						width : 180,
						xtype : 'filefield',
						buttonText : '选择文件'
					}, {
						fieldLabel : '样式名称',
						xtype : 'textfield',
						name : 'styleName',
						width : 300,
						allowBlank : false
					}, {
						id : 'photoFour',
						name : 'photos',
						width : 180,
						xtype : 'filefield',
						buttonText : '选择文件'
					}, {
						fieldLabel : '样式名称',
						xtype : 'textfield',
						name : 'styleName',
						width : 300,
						allowBlank : false
					}, {
						xtype : 'button',
						text : "提交",
						name : "submit",
						handler : photoSubmit
					}]
		});

var productCover = Ext.create('Ext.form.Panel', {
	fileUpload : true,
	enctype : 'multipart/form-data',
	width : $(window).width() - 10,
	height : $(window).height() - 40,
	layout : 'vbox',
	id : "cover",
	items : [{
				id : 'coverid',
				name : 'cover',
				fieldLabel : '上传封面',
				width : 280,
				xtype : 'filefield',
				buttonText : '选择文件'
			}, {
				xtype : 'button',
				text : "提交",
				name : "submit",
				handler : coverSubmit
			}, {
				xtype : 'label',
				html : '<div id="coverDiv" style="$(window).width()-10;height:450px;"></div>'
			}]
});

var photos = Ext.create('Ext.form.Panel', {
	fileUpload : true,
	width : 500,
	height : 800,
	layout : 'vbox',
	id : "photoList",
	items : [{
				xtype : 'label',
				text : '相册'
			}, {
				xtype : 'label',
				html : '<div id="photosDiv" style="$(window).width()-10;height:450px;"></div>'
			}]
});
/*	$.post("../../admin/getUserPhotos.do",{skyId:record.raw.skyId},function(html){
 $("#photosDiv").empty();
 $("#photosDiv").html(html);
 },'html');*/

//标签数据
var dataMark = [['0', '普通'], ['1', '抢购'], ['2', '热卖'], ['3', '特卖'],
		['4', '猜你喜欢'], ['5', '热评商品'], ['6', '新品上架'], ['7', '一元云购']];
//标签store
var storeMark = new Ext.data.ArrayStore({
			fields : ['value', 'text'],
			data : dataMark
		});
//品牌store
var brandStore = Ext.create('Ext.data.Store', {
			proxy : {
				type : 'ajax',
				url : '../../admin/brand/getBrandList.htm',
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
						name : 'id'
					}, {
						name : 'brandName'
					}]

		});
var brandCom = new Ext.form.ComboBox({
			id : 'brandId',
			name : 'brandId',
			store : brandStore,
			fieldLabel : '品牌',
			labelWidth : 40,
			emptyText : '请选择',
			mode : 'remote',
			triggerAction : 'all',
			valueField : 'id',
			displayField : 'brandName'
		});
var product = Ext.create('Ext.form.Panel', {
			width : $(window).width() - 10,
			height : $(window).height() - 60,
			//bodyPadding : 5,
			id : "productForm",
			layout : 'form',//表单布局
			url : '../product/addProduct.htm', //保存路径
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
						title : '商品',
						columnWidth : '5',
						items : [{
									xtype : 'numberfield',
									id : 'id',
									name : 'id',
									width : 200,
									hidden : true
								}, {
									id : 'createTime',
									name : 'createTime',
									width : 200,
									hidden : true
								}, {
									fieldLabel : '商品名称',
									xtype : 'textfield',
									name : 'productName',
									width : 200,
									allowBlank : false
								}, {
									fieldLabel : '商品编号',
									xtype : 'textfield',
									name : 'code',
									width : 200,
									allowBlank : false
								}, {
									fieldLabel : '推荐指数',
									name : 'recommendRank',
									xtype : 'numberfield',
									width : 200,
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
								}, {
									xtype : 'combobox',
									fieldLabel : '标签',
									store : storeMark,
									name : 'mark',
									mode : 'local',
									maxWidth : 100,
									triggerAction : 'all',
									valueField : 'value',
									displayField : 'text',
									value : '0'
								}, brandCom, {
									fieldLabel : '商品描述',
									xtype : 'htmleditor',
									enableColors : false,
									enableAlignments : false,
									name : 'description',
									width : 350
								}]
					}, {
						layout : 'form',
						xtype : 'fieldset',
						columnWidth : '5',
						title : '商品',
						items : [{
									fieldLabel : '商品低价',
									xtype : 'textfield',
									name : 'basePrice',
									width : 200,
									allowBlank : false
								}, {
									fieldLabel : '商品市场价',
									xtype : 'textfield',
									name : 'marketPrice',
									width : 200,
									allowBlank : false
								}, {
									fieldLabel : '商品售价',
									xtype : 'textfield',
									name : 'sellPrice',
									width : 200,
									allowBlank : false
								}]
					}],
			buttons : [{
				text : '保存',
				handler : function() {
					product.getForm().submit({
								method : 'post',
								success : function(form, action) {
									Ext.MessageBox.alert('友情提示',
											action.result.obj);
									$("#photosDiv").empty();
									productId = action.result.data;
								},
								failure : function(form, action) {
									Ext.MessageBox.alert('友情提示',
											action.result.obj);
								}
							});
				}
			}, {
				text : '清空',
				handler : function() {
					productId = null;
					Ext.getCmp('productForm').form.reset();
				}
			}]

		})

var type = Ext.create('Ext.tab.Panel', {
			autoScroll : true,
			width : $(window).width(),
			height : $(window).height(),
			multiSelect : true,
			items : [{
						title : '商品属性',
						html : '<div id = "productAttr"></div>'
					}, {
						title : '基本信息',
						items : [product]
					}, {
						title : '商品封面',
						items : [productCover]
					}, {
						title : '商品样式',
						layout : 'hbox',
						items : [productPhotos, photos]
					}]
		});
