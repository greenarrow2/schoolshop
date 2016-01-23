package com.schoolcloud.schoolshop.bean.book;

public enum PaymentWay {
	/** 网上支付 */
	NET
	{
		public String getName()
		{
			return "网上支付";
		}
	},
	/** 货到付款 */
	COD
	{
		public String getName()
		{
			return "货到付款";
		}
	},
	/** 银行电汇 */
	BANKREMITTANCE
	{
		public String getName()
		{
			return "银行电汇";
		}
	};
	public abstract String getName();
}
