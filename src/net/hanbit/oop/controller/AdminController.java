package net.hanbit.oop.controller;

import javax.swing.JOptionPane;

import net.hanbit.oop.domain.MemberBean;
import net.hanbit.oop.service.AdminService;
import net.hanbit.oop.serviceImpl.AdminServiceImpl;

public class AdminController {
	public static void main(String[] args){
		String sCount=JOptionPane.showInputDialog("관리자님 총회원수를 입력해주세요");
		int count=Integer.parseInt(sCount);
		AdminService service=new AdminServiceImpl(count);
		MemberBean member=new MemberBean();
		while(true){
			switch(JOptionPane.showInputDialog("0.종료  1.회원추가  2.회원수  3.회원 목록")){
			case "0":
				JOptionPane.showMessageDialog(null,  "End");
				return;
	
			case "1":
				member.setName(JOptionPane.showInputDialog("이름:"));
				member.setId(JOptionPane.showInputDialog("ID:"));
				member.setPassword(JOptionPane.showInputDialog("Password:"));
				member.setSsn(JOptionPane.showInputDialog("주민번호:"));			
				service.addMember(member);
				JOptionPane.showMessageDialog(null, "회원가입 성공");
				break;
				
			case "2":
				JOptionPane.showMessageDialog(null, "회원수:");
				break;
			case "3":
				break;
			
			default:
				break;
			}
		}
	}
}
