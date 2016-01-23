package com.schoolcloud.schoolshop.bean.shopping;

import com.schoolcloud.schoolshop.bean.product.Product;
import com.schoolcloud.schoolshop.bean.product.ProductStyle;
/**
 * 购物项
 * @author 长润
 *
 */
public class BuyItem {	/* 所购商品 */
	private Product product;
	
	/* 购买数量 */
	private int amount = 1;
	
	private ProductStyle productStyle;
	
	public BuyItem()
	{
		
	}

	public BuyItem(Product product)
	{
		this.product = product;
	}
	public BuyItem(Product product,ProductStyle productStyle)
	{
		this.product = product;
		this.productStyle = productStyle;
	}
	
	
	
	public BuyItem(Product product, int amount, ProductStyle productStyle) {
		this.product = product;
		this.amount = amount;
		this.productStyle = productStyle;
	}

	public BuyItem(Product product , int amount)
	{
		this.product = product;
		
		this.amount = amount;
	}

	public Product getProduct()
	{
		return product;
	}

	public void setProduct(Product product)
	{
		this.product = product;
	}

	public int getAmount()
	{
		return amount;
	}

	public void setAmount(int amount)
	{
		this.amount = amount;
	}

	public ProductStyle getProductStyle() {
		return productStyle;
	}

	public void setProductStyle(ProductStyle productStyle) {
		this.productStyle = productStyle;
	}

	@Override
	public int hashCode()
	{
		String result = product.getId() + "_";
		
		//这个产品的样式集合里面只会有一个样式。
		result += product.getStyles().iterator().next().getId();
		
		return result.hashCode();
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final BuyItem other = (BuyItem) obj;
		if (product == null)
		{
			if (other.product != null)
				return false;
		}
		else if (!product.equals(other.product))
			return false;

		/**
		 *	一个有样式，一个没有样式，那么这肯定不是一个产品 
		*/
		if (product.getStyles().size() != other.product.getStyles().size())
		{
			return false;
		}

		/**
		 * 如果说产品的样式的个数都一样，那么在去判断产品的样式的id是否一样。
		*/
		if(product.getStyles().size() > 0)
		{
			ProductStyle style = product.getStyles().iterator().next();
			
			ProductStyle otherStyle = other.product.getStyles().iterator().next();
			
			if (!style.equals(otherStyle))
			{
				return false;
			}
		}
		return true;
	}
}
