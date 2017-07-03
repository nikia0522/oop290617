package net.hanbit.oop.serviceImpl;

import net.hanbit.oop.domain.MemberBean;
import net.hanbit.oop.service.MemberService;

public class MemberServiceImpl implements MemberService{
	MemberBean session; //임시 값 저장 Think of Natwest Session Out. 
	public MemberServiceImpl(){ //constructor=return type이 아예 없음
		session=new MemberBean();
	}
	@Override
	public String getGender(MemberBean member) {
		String gender="";
	    char ch =member.getSsn().charAt(7);
	    switch(ch){
	    case'1': case'3':
	        gender="남";
	        break;
	    case'2': case'4':
	        gender="여";
	        break;
	    case'5': case'6':
	        gender="외국인";
	        break;
	        default:
	        gender="틀림";
	        break;
	        }
		return gender;
	}
	

	@Override
	public String getAge(MemberBean member) {
		int age=0;
		String birth=member.getSsn().substring(0,2); 
		if(Integer.parseInt(birth)>=17){
			age= 2017-Integer.parseInt(birth)-1900+1;
		}else{
			age= 2017-Integer.parseInt(birth)-2000+1;
		}
		return String.valueOf(age);
	}

	@Override
	public String join(MemberBean member){	 
		session=member;
		String result="Thanks for joining "+session.getName();
		return result;
	}

	@Override
	public String login(MemberBean member) {
		 return (session.getId().equals(member.getId())&&session.getPassword().equals(member.getPassword()))?
				 "Success "+getAge(session)+" "+getGender(session):"로그인실패";
			 
	
	}

}
