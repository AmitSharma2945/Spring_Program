package com.nt.service;

import java.util.List;

import com.nt.dto.BankDTO;

public interface BankServiceMgmt{

	public List<BankDTO> findBanksByArea(String desg[])throws Exception;
}
