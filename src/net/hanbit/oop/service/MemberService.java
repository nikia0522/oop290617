package net.hanbit.oop.service;

import net.hanbit.oop.domain.MemberBean;

public interface MemberService {
	public String getGender(MemberBean member); //interface(all abstract)기 때문에 abstract keyword가 필요없음
	public String getAge(MemberBean member);
	public String join(MemberBean member);
	public String login(MemberBean member);
}
