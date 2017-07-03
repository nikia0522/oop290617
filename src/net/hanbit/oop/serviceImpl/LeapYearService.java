package net.hanbit.oop.serviceImpl;


public class LeapYearService {
	public String execute(int leapYear){
		String LYresult="";
		if(leapYear%400==0){
			LYresult="윤년입니다.\n";
		}else if(leapYear%100==0){
			LYresult="평년입니다.\n";
		}else if(leapYear%4==0){
			LYresult="윤년입니다.\n";
		}else{
			LYresult="평년입니다.\n";
		}
		return LYresult;
	}
}
