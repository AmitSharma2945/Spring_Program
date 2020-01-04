package com.nt.locator;

import com.nt.extenal.ScoreCamp;
import com.nt.extenal.ScoreCampImpl;

public class ScoreServiceLocator {
 
	public static ScoreCamp getService() {
	  ScoreCamp score=null;
		
	  score=new ScoreCampImpl();
		return score;
		
	}
	
}
