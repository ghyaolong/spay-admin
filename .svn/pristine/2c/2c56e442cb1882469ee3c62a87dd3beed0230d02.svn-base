package com.syhbuy.spay.admin.base.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
/**
 * ID生成器工具类
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016-9-23 下午4:04:10
 * <p>
 * Company: 善友汇网络科技股份有限公司
 * <p>
 * @author 姚成龙
 * @version 1.0.0
 */
public class IDGeneratorUtils {
	
	/**
	 * 获取32位唯一标识符
	 * @return
	 */
	public static String getUUID32(){
		return UUID.randomUUID().toString().replace("-","");
	}
	
	/**
	 * 获取64位唯一标识符
	 * @return
	 */
	public static String getUUID64(){
		return UUID.randomUUID().toString();
	}
	
	/**
	 * 获取订单号
	 * @return
	 */
	public static String getOrderID(){
		//类型(2) +  
		return UUID.randomUUID().toString().replace("-","");
	}
	
	/**
	 * 生成交易号
	 * 日期+订单类型+交易类型+四位编号
	 * @return
	 */
	public static String getBusinessID(){
		return UUID.randomUUID().toString();
	}
	
	private String getDate(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
		return sdf.format(new Date());
	}
	
	/**
	 * 获取相对应的订单类型
	 * @param orderType
	 * @return
	 */
	private static String getOrderType(String orderType){
		return "";
	}
	
	/**
	 * 获取相对应的交易类型
	 * @param bussinessType
	 * @return
	 */
	private static String bussinessType(String bussinessType){
		return "";
	}
	
	
	/**
	 * 获得4位编码
	 * @return
	 */
	private static String getNum4(){
		return "0001";
	}
}
