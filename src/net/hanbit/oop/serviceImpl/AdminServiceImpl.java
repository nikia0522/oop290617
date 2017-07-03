package net.hanbit.oop.serviceImpl;

import net.hanbit.oop.domain.MemberBean;
import net.hanbit.oop.service.AdminService;

public class AdminServiceImpl implements AdminService{
	
	int count;
	MemberBean member;
	MemberBean[] list;
	
	public AdminServiceImpl(int count){
		list=new MemberBean[count];
		member=new MemberBean();
		count=0;
	}
	
	@Override
	public void addMember(MemberBean member) {
		for(i=0;i<=count;i++){
			
		}
	}

	@Override
	public MemberBean[] getMembers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countMembers() {

		return 0;s
	}

}
