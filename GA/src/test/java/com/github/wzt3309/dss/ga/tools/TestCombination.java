package com.github.wzt3309.dss.ga.tools;

import com.github.wzt3309.dss.ga.error.math.FactorialOutOfcapabError;
import com.github.wzt3309.dss.ga.error.math.ValInputIsnRightError;
import org.junit.Test;

public class TestCombination {

	@Test
	public void testCombina() {
		int n=4,m=0,res=6;
		try {
			long myres=Combination.combina(n,m);
			System.out.println(myres);
			//assertEquals(res,Combination.combina(n,m));
		} catch (FactorialOutOfcapabError e) {
			e.printStackTrace();
		} catch (ValInputIsnRightError e) {
			e.printStackTrace();
		}	
	}
	
	@Test
	public void testCombianAvg(){
		int n=4,p=0,q=3;
		double res=12.0/7;		
		try {
			double myres=Combination.combianAvg(n, p, q);
			System.out.println(myres);
			//assertEquals(res,myres,0.01);
		} catch (FactorialOutOfcapabError e) {
			e.printStackTrace();
		} catch (ValInputIsnRightError e) {
			e.printStackTrace();
		}
	}

}
