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
		MemberBean member=null; //declaration
		String sList="";
		
		while(true){
			switch(JOptionPane.showInputDialog("0.종료  1.회원추가  2.회원수  3.회원 목록  4.findById 5.findByName  6.update")){
			case "0":
				JOptionPane.showMessageDialog(null,  "End");
				return;
	
			case "1":
				member=new MemberBean(); //초기화
				String[] arr=(JOptionPane.showInputDialog("이름:/ID/Password/SSN")).split("/");
				member.setName(arr[0]);
				member.setId(arr[1]);
				member.setPassword(arr[2]);
				member.setSsn(arr[3]);
				service.addMember(member);
				JOptionPane.showMessageDialog(null, "회원가입 성공");
				break;
				
			case "2":				
				service.countMembers();
				JOptionPane.showMessageDialog(null, "회원 수:"+count);
				break;
			
			case "3":
				MemberBean[] list=service.getMembers();
				JOptionPane.showMessageDialog(null,"첫번째"+list[0]);
				JOptionPane.showMessageDialog(null,"두번째"+list[1]);
				JOptionPane.showMessageDialog(null, "세번째"+list[2]);
				for(int i=0; i<list.length; i++){
					sList+=list[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, "리스트"+sList);
				break;

			case "4":
				JOptionPane.showMessageDialog(null, service.findById((JOptionPane.showInputDialog(null, "조회하려는 ID를 입력하세요"))).toString());
				break;
				
			case "5":
				
				 String name=JOptionPane.showInputDialog("조회할 이름을 입력");
				 MemberBean[] members=service.findByName(name);
				 String result="";
				 if(members.length==0){
				 	result="조회할 이름이 없습니다";
				 }else{
				 	for(int i=0; i<members.length; i++){
				 	result+=members[i].toString()+"\n";
				 	}
				 }
				 JOptionPane.showMessageDialog(null, result);
				
				//JOptionPane.showMessageDialog(null, service.findByName((JOptionPane.showInputDialog(null, "찾으려는 이름을 입력하세요"))));
				break;
				
			case "6":
				MemberBean enterId=service.findById(JOptionPane.showInputDialog("ID를 입력하세요."));
				String id="";
				if(enterId.length==0){
					result="id가 없습니다";
				}
				String password=JOptionPane.showInputDialog("바꿀 비밀번호를 입력하세요");
				//MemberBean[] members=service.updatePass(member);
				JOptionPane.showMessageDialog(null, "비밀번호 변경 성공");
			}
		}
	}
}
