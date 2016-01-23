package com.schoolcloud.schoolshop.action.admin;

import javax.annotation.Resource;
import net.sf.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.schoolcloud.schoolshop.bean.menu.Menu;
import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.service.menu.MenuService;
import com.schoolcloud.schoolshop.service.product.ProductTypeService;



@Controller
@RequestMapping("admin/menu")
public class MenuController {
@Resource(name="menuService")
private MenuService menuService;
@Resource(name="productTypeService")
private ProductTypeService productTypeService;

public ProductTypeService getProductTypeService() {
	return productTypeService;
}

public void setProductTypeService(ProductTypeService productTypeService) {
	this.productTypeService = productTypeService;
}

public MenuService getMenuService() {
	return menuService;
}

public void setMenuService(MenuService menuService) {
	this.menuService = menuService;
}

/**
 * 
 * @return
 */
@RequestMapping(value="nodeList.htm",produces = "text/html;charset=UTF-8")
@ResponseBody
public Object nodeList() {
  QueryResult<Menu> qr = menuService.getScrollMenuData();
  String json =  JSONArray.fromObject(menuService.getTreeList(qr)).toString();
  System.out.println(json);
	return json;
}
/**
 * 商品列表
 * @return
 */
@RequestMapping(value="productList.htm")
public String productList() {
	return "product/productList";
} 
/**
 * 添加商品
 * @return
 */
@RequestMapping(value="addProduct.htm")
public String addProduct() {
	return "product/addProduct";
} 
/**
 * 用户列表
 * @return
 */
@RequestMapping(value="userList.htm")
public String userList() {
	return "user/userList";
} 
/**
 * 品牌列表
 * @return
 */
@RequestMapping(value="brandList.htm")
public String brandList() {
	return "product/brandList";
} 
/**
 * 类型列表
 * @return
 */
@RequestMapping(value="productGenreList.htm")
public String productGenreList() {
	return "product/productGenreList";
} 
/**
 * 分类列表
 * @return
 */
@RequestMapping(value="typeList.htm")
public String typeList() {
	return "product/productTypeList";
} 
/**
 * 分类列表
 * @return
 */
@RequestMapping(value="styleList.htm")
public String styleList() {
	return "product/productStyleList";
} 
/**
 * 订单项列表
 * @return
 */
@RequestMapping(value="orderItemList.htm")
public String orderItemList() {
	return "book/orderItemList";
} 
/**
 * 订单列表
 * @return
 */
@RequestMapping(value="orderList.htm")
public String orderList() {
	return "book/orderList";
} 
/**
 * 管理员列表
 * @return
 */
@RequestMapping(value="adminList.htm")
public String adminList() {
	return "admin/adminList";
} 
/**
 * 管理员列表
 * @return
 */
@RequestMapping(value="schoolList.htm")
public String schoolList() {
	return "school/schoolList";
} 

}
