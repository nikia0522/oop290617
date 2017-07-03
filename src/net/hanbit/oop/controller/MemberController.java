package net.hanbit.oop.controller;
import java.util.Scanner;
import net.hanbit.oop.domain.MemberBean;
import net.hanbit.oop.service.MemberService;
import net.hanbit.oop.serviceImpl.MemberServiceImpl;

import javax.swing.*;
public class MemberController {  
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    MemberService a= new MemberServiceImpl(); 
	    MemberBean member=new MemberBean();
	    while(true){
	    	switch (JOptionPane.showInputDialog("0.end 1.회원가입 2.로그인")) {
	    		case "0":
	    			System.out.println("end");
	    			return;
	    		case"1":
	    			member.setName(JOptionPane.showInputDialog("name"));
	    			member.setId(JOptionPane.showInputDialog("ID"));
	    			member.setPassword(JOptionPane.showInputDialog("PASSWORD"));	
	    			member.setSsn(JOptionPane.showInputDialog("SSN"));
	    			JOptionPane.showMessageDialog(null, a.join(member));
	    			break;	         
	    		case"2":	    			
	    			member.setId(JOptionPane.showInputDialog("ID"));
	    			member.setPassword(JOptionPane.showInputDialog("Password"));
	    			JOptionPane.showMessageDialog(null, a.login(member));
	    			
	    			/*MemberBean temp=new MemberBean();
	    			System.out.println("id:");
	    			temp.setId(s.next());
	    			System.out.println("password");
	    			temp.setPassword(s.next());
	    			//ms.setLogin(InputId, InputPassword);
	    			System.out.println(a.login(temp));*/
	    			break;
	    		
	    		default:
	    			break;
	    	}
	    }
	}
}
