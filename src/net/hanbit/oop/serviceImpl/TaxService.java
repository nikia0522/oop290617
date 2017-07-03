package net.hanbit.oop.serviceImpl;
public class TaxService {
	public String[] execute(String name, int salary){
		double taxrate=0.0;
		if(salary<=1200){
			taxrate=0.08;
		}else if(salary<=4600){
			taxrate=0.17;
		}else if(salary<=8800){
			taxrate=0.26;
		}else{
			taxrate=0.35;
		}
		int paytax = (int)(salary*taxrate);	
		String sPaytax=paytax+"";
		String sTaxrate=taxrate+"";
		String[] result=new String[2];
		result[0]=sTaxrate;
		result[1]=sPaytax;
		return result;
	}
}

