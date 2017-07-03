package net.hanbit.oop.service;

import net.hanbit.oop.domain.MemberBean;

public interface AdminService {
	public void addMember(MemberBean member); // 객체에 대한 setter (void, parameter 있음)
	public int countMembers(); //getter (return type 있고 parameter 없음)
	public MemberBean[] getMembers(); //getter (return type 있고 parameter 없음)

	
}
