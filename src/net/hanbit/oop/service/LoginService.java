package net.hanbit.oop.service;
public class LoginService {
	public static final String USER_ID="kim";
	public static final String USER_PASS="1";
	public String execute(String id, String pass){


		String loginresult="";
		if(!id.equals(USER_ID)){
			loginresult="id가 존재하지않습니다.";			
		}else if(!pass.equals(USER_PASS)){
			loginresult="pass가 올바르지 않습니다.";
		}else{
			loginresult="Welcome";
		}
		return loginresult;
	}
}
