package com.syhbuy.spay.admin.entity;

import org.jeecgframework.poi.excel.annotation.Excel;
import org.jeecgframework.poi.excel.annotation.ExcelTarget;

@ExcelTarget("parameter")
public class Parameter {

	private String id;// 主键

	// @ExcelVOAttribute(name = "业务Key", column = "A")
	@Excel(name = "业务Key")
	private String reskey;// 业务Key

	// @ExcelVOAttribute(name = "业务名称", column = "B")
	@Excel(name = "业务名称")
	private String resName;// 业务名称

	@Excel(name = "规则key")
	private String indexKey;// 规则key

	private String indexName;// 规则名称

	private String code;// 规则code

	private String description;// 描述

	private String paramType;// 参数类型

	private String value;

	private String isDel;

	public String getIsDel() {
		return isDel;
	}

	public void setIsDel(String isDel) {
		this.isDel = isDel;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getReskey() {
		return reskey;
	}

	public void setReskey(String reskey) {
		this.reskey = reskey;
	}

	public String getResName() {
		return resName;
	}

	public void setResName(String resName) {
		this.resName = resName;
	}

	public String getIndexKey() {
		return indexKey;
	}

	public void setIndexKey(String indexKey) {
		this.indexKey = indexKey;
	}

	public String getIndexName() {
		return indexName;
	}

	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getParamType() {
		return paramType;
	}

	public void setParamType(String paramType) {
		this.paramType = paramType;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Parameter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Parameter(String id, String reskey, String resName, String indexKey, String indexName, String code, String description, String paramType, String value, String isDel) {
		super();
		this.id = id;
		this.reskey = reskey;
		this.resName = resName;
		this.indexKey = indexKey;
		this.indexName = indexName;
		this.code = code;
		this.description = description;
		this.paramType = paramType;
		this.value = value;
		this.isDel = isDel;
	}

}