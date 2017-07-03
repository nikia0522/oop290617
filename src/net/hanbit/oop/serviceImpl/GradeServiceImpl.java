package net.hanbit.oop.serviceImpl;

import net.hanbit.oop.domain.GradeBean;
import net.hanbit.oop.service.GradeService;

public class GradeServiceImpl implements GradeService{
	GradeBean grade=new GradeBean();
	public GradeServiceImpl(){
		grade=new GradeBean();
}
	@Override
	public String getGrade(int avg) {
		String grade="";
		switch(avg/10){
      		case 9: case 10: 
      			grade="A학점";
      			break;
      		case 8: case 7:
      			grade="B학점";
      			break;
      		case 6: case 5:
      			grade="C학점";
      			break;
      		case 4: case 3:
      			grade="D학점";
      			break;
      		case 2: case 1:
      			grade="F학점";
      			break;
		}
		return grade;
	}
	@Override
	public int calcTotal(GradeBean grade) {
		return grade.getKor()+grade.getEng()+grade.getMath();
	}
	@Override
	public int calcAvg(int total) {
		return total/3;
	}
}
