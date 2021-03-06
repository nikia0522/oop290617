package net.hanbit.oop.controller;
import java.util.Scanner;
import net.hanbit.oop.domain.GradeBean;
import net.hanbit.oop.service.GradeService;
import net.hanbit.oop.serviceImpl.GradeServiceImpl;
import javax.swing.*;
public class GradeController {
	public static void main(String[] args) {
	    GradeService service= new GradeServiceImpl(); 
	    GradeBean grade=new GradeBean();
		while(true){
			switch(JOptionPane.showInputDialog("0.end  1.Grade")){
			case "0":
				JOptionPane.showMessageDialog(null, "End");
				return;
			case "1":
				grade.setName(JOptionPane.showInputDialog("이름:"));
				grade.setMajor(JOptionPane.showInputDialog("전공:"));
				grade.setKor(Integer.parseInt(JOptionPane.showInputDialog("Kor:")));
				grade.setEng(Integer.parseInt(JOptionPane.showInputDialog("Eng:")));
				grade.setMath(Integer.parseInt(JOptionPane.showInputDialog("Math:")));
				int total=service.calcTotal(grade);
				int avg=service.calcAvg(total);
				String g=service.getGrade(avg);
				JOptionPane.showMessageDialog(null, g);
			}
		}
	}
}
