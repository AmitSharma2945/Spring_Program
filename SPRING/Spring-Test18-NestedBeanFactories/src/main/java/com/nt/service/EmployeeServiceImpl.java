package com.nt.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.BeanUtils;
import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDAO dao;
	
 public EmployeeServiceImpl(EmployeeDAO dao) {
		this.dao = dao;
	}
public List<EmployeeDTO> findEmpByJob(String[] job)throws Exception {
	  StringBuffer sb=new StringBuffer(); 
	   List<EmployeeBO> listBO=null;
	   List<EmployeeDTO> listDTO=null;  
	   EmployeeDTO dto=null;
	   
	  sb.append("(");
	  for (int i = 0; i < job.length; i++) {
		if (i==job.length-1)
			
			sb.append("'"+job[i]+"'");
		else 
			sb.append("'"+job[i]+"',");
		}
		sb.append(")");
		System.out.println(sb);
	//use Dao
	listBO=dao.searchEmpByJob(sb);
	//convert listBO to listDTO
	listDTO= new ArrayList();
	for (EmployeeBO bo:listBO) {
		dto=new EmployeeDTO();
		BeanUtils.copyProperties(bo,dto);
		listDTO.add(dto);
	}//for
	System.out.println("service");
	
	return listDTO;
	}

}
