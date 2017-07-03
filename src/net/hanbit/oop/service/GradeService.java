package net.hanbit.oop.service;

import net.hanbit.oop.domain.GradeBean;

public interface GradeService {
	public String getGrade(int avg);
	public int calcTotal(GradeBean grade);
	public int calcAvg(int total);	
}
