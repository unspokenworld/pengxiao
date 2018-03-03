package com.qfedu.common.util;

import java.util.UUID;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.util.StringUtils;
import org.springframework.web.context.ContextLoader;

public class WoUtil {

	private final static Logger LOG = LogManager.getLogger(WoUtil.class);

	/**
	 * @param obj
	 * @return
	 */
	public static Boolean isEmpty(Object obj) {
		return StringUtils.isEmpty(obj);
	}

	/**
	 * 把id字符串解析为非null字符串数组。
	 * 
	 * @param strIds
	 *            以逗号隔开的id字符串
	 * @return
	 */
	public static String[] splitIds(String strIds) {
		String[] ids = new String[0];
		if (!WoUtil.isEmpty(strIds)) {
			ids = strIds.split(",");
		}
		return ids;
	}

	/**
	 * 获取value对应的模糊匹配表达式，例如：value是'vvv'，则表达式为'%vvv%'
	 * 
	 * @param value
	 * @return
	 */
	public static String getLikeValue(String value) {
		String val = "%";
		if (!WoUtil.isEmpty(value)) {
			val = "%" + value + "%";
		}
		return val;
	}

	/**
	 * if len is 4 and idx is 23 then re is 0023.
	 * 
	 * @param len
	 * @param idx
	 * @return re
	 */
	public static String generateFixedLenNo(int len, int idx) {
		return String.format("%0" + len + "d", idx);
		/*
		 * String re = String.valueOf(idx); if (re.length() >= len) { return
		 * re.substring(0, len); } len = len - re.length(); for (int i = 0; i <
		 * len; i++) { re = '0' + re; } return re;
		 */
	}

	/**
	 * 生成uuid
	 * 
	 * @return
	 */
	public static String uuid() {
		return UUID.randomUUID().toString();
	}

	/**
	 * @param objs
	 * @param obj
	 * @return
	 */
	public static Boolean contains(Object[] objs, Object obj) {
		for (Object o : objs) {
			if (o.equals(obj)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @param name
	 * @param cls
	 * @return
	 */
	public static <T> T getBean(String name, Class<T> cls) {
		// bean名称：woSceneRoleExtension + bean类型：IRoleExtensionService
		return ContextLoader.getCurrentWebApplicationContext().getBean(name, cls);
	}

	/**
	 * @param name
	 * @param cls
	 * @return
	 */
	public static <T> T getBean(Class<T> cls) {
		// bean名称：woSceneRoleExtension + bean类型：IRoleExtensionService
		return ContextLoader.getCurrentWebApplicationContext().getBean(cls);
	}

	/**
	 * @param s
	 * @return
	 */
	public static String getUpperFirstChar(String s) {
		char[] cs = s.toCharArray();
		cs[0] -= 32;
		return String.valueOf(cs);
	}
}