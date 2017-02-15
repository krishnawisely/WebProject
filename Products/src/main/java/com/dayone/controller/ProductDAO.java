package com.dayone.controller;


public class ProductDAO {
	public void add(Model model)
	{
		String query="insert into product(pro_name,pro_price,pro_details)values(?,?,?)";
		Object[] params={model.getPro_name(),model.getPro_price(),model.getPro_details()};
		ConnectionUtil.gettemplate().update(query,params);
	}
}
