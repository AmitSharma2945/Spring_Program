package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class ResturantDAO {
	
	JdbcTemplate jt;

	public final static String GET_RESTURANT="SELECT RESTID,RESTNAME,RATING,LOCATION FROM RESTURANT WHERE LOCATION=?";
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public List getResturant(String[] loca) {
		List<Map<String,Object>>list=jt.queryForList(GET_RESTURANT,loca,new Object(){});
		return list;
	}
	
}
