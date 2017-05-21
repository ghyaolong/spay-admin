package com.syhbuy.spay.admin.base.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author
 * 
 */
public class ValidUtils {

	public static boolean isNum(String amount) {

		Pattern p1 = Pattern.compile("^([1-9]+(\\.[0-9]{2})?|0\\.[1-9][0-9]|0\\.0[1-9])$ ");//允许输入正整数 小数点后两位
		Matcher m = p1.matcher(amount);
		Boolean flg = m.matches();
    
		return flg;
	}
}
