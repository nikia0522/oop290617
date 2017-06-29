package net.hanbit.oop.service;
public class SSNService {
	public String execute(String name){

		
		String gender="";

		switch(ch){
			case '1': case '3':
				gender="남";
				break;
			case '2': case '4':
				gender="여";
				break;
			case 5: case 6:
				gender="외국인";
				break;
			default:
				gender="틀림";
				break;
		}
		return gender;
	}
}
