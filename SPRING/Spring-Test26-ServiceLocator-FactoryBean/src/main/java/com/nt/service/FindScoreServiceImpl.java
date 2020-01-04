package com.nt.service;

import com.nt.extenal.ScoreCamp;

public class FindScoreServiceImpl implements FindScoreService {

	private ScoreCamp extComp;
	
	
	 public void setExtComp(ScoreCamp extComp) {
		this.extComp = extComp;
	}


	@Override
	public String getScore(int mid) {
		String scoreCard=null;
		//score find
		scoreCard=extComp.findScore(mid);

		return scoreCard;
	}

}
