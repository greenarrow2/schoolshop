package com.schoolcloud.schoolshop.bean.book;

public enum DeliverWay {
	/** 快递送货上门 */
	EXPRESSDELIVERY
	{
		public String getName()
		{
			return "送货上门";
		}
	},
	/** 加急快递送货上门 */
	EXIGENCEEXPRESSDELIVERY
	{
		public String getName()
		{
			return "加急快递送货上门";
		}
	};
	public abstract String getName();
}
