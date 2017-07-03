package net.hanbit.oop.serviceImpl;
public class CalcService {
	public String calcBMI(double height, double weight){
		double bmi=weight/(height*height);
		String state="";
		if(30<bmi){
			state="과체중";
		}else if (25<bmi){
			state="정상";
		}else if(18.5<bmi){
			state="저체중";
		}else{
			state="비만";
		}
		return state;
	}
	public String calcPlus(String a, String b){
		return String.valueOf(Integer.parseInt(a)+Integer.parseInt(b)); //(num1+num2)+""
	}
	public String calcMinus(String a, String b){
		return String.valueOf(Integer.parseInt(a)-Integer.parseInt(b));
	}
	public String calcMul(String a, String b){
		return String.valueOf(Integer.parseInt(a)*Integer.parseInt(b));
	}
	public String calcDiv(String a, String b){
		return String.valueOf(Integer.parseInt(a)/Integer.parseInt(b));
	}
	public String calcTax(String salary){
		String result="";
		return result;
	}
	public String calcTime(String sec){
		String result="";
		return result;
	}
}
