package com.nt.service;

import java.util.List;
import java.util.Map;

import com.nt.dao.ResturantDAO;

public class ResturantService {
	
	ResturantDAO dao;

	public void setDao(ResturantDAO dao) {
		this.dao = dao;
	}
	
	public List ResturantSearch(String location[]) {
		List<Map<String,Object>>list=dao.getResturant(location);	
		return list;
	}

}
