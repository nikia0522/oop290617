package net.hanbit.oop.controller;

import javax.swing.*;

import net.hanbit.oop.inheritance.AndroidPhone;
import net.hanbit.oop.inheritance.CellPhone;
import net.hanbit.oop.inheritance.IPhone;
import net.hanbit.oop.inheritance.Phone;

public class PhoneController {
	public static void main(String[] args){
		Phone phone=new Phone();
		CellPhone nokia=new CellPhone();
		IPhone iphone=new IPhone();
		AndroidPhone gal=new AndroidPhone();
		
		while(true){
			switch(JOptionPane.showInputDialog("0.end  1.집전화   2.휴대전화   3.아이폰   4.갤놋")){
			case "0":
				JOptionPane.showMessageDialog(null, "end");
				return;
			
			case "1":
				phone.setName(JOptionPane.showInputDialog("이름:"));
				phone.setPhoneNo(JOptionPane.showInputDialog("전화번호"));
				phone.setBrand(JOptionPane.showInputDialog("브랜드"));
				phone.setCall(JOptionPane.showInputDialog("통화내역"));
				JOptionPane.showMessageDialog(null, phone.toString());
				
			case "2":
				nokia.setName(JOptionPane.showInputDialog("이름:"));
				nokia.setPhoneNo(JOptionPane.showInputDialog("전화번호"));
				nokia.setBrand(JOptionPane.showInputDialog("브랜드"));
				nokia.setCall(JOptionPane.showInputDialog("통화내역"));
				nokia.setPortable(true);
				JOptionPane.showMessageDialog(null, nokia.toString());
				
			case "3":
				iphone.setName(JOptionPane.showInputDialog("이름:"));
				iphone.setPhoneNo(JOptionPane.showInputDialog("전화번호"));
				iphone.setData(JOptionPane.showInputDialog("Message"));
				JOptionPane.showMessageDialog(null, iphone.toString());
				
			case "4":
				gal.setName(JOptionPane.showInputDialog("이름:"));
				gal.setPhoneNo(JOptionPane.showInputDialog("전화번호"));
				gal.setData(JOptionPane.showInputDialog("Message"));
				gal.setSize(JOptionPane.showInputDialog("사이즈:"));
				gal.setAppl(JOptionPane.showInputDialog("어플 이름:"));	
				JOptionPane.showMessageDialog(null, gal.toString());
					
			}
		}
	}
}
