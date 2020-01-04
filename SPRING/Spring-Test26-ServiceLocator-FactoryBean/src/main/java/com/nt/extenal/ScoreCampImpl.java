package com.nt.extenal;

public class ScoreCampImpl implements ScoreCamp{

	@Override
	public String findScore(int mid) {
	  if(mid==355)
		  return "Test match:352/6";
	 else				  
	  if(mid==348)
		  return "One Day match:200/6";
	  else
		  return "Wrong Mathid";
	}

}
