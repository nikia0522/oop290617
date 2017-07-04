package net.hanbit.oop.serviceImpl;
import net.hanbit.oop.domain.MemberBean;
import net.hanbit.oop.service.AdminService;
public class AdminServiceImpl implements AdminService{
	
	//인스턴스 변수
	int count;
	MemberBean member;
	MemberBean[] list;
	MemberBean[] nameList;
	
	//생성자: 인스턴스 변수의 이니셜라이징이 목적
	//void가 없고 클래서 이름이랑 똑같아야함. 
	public AdminServiceImpl(int limit){
		count=0;
		list=new MemberBean[limit]; //지금은 정적이지만 countMembers()+5 <-동적으로 코딩
		member=new MemberBean();

	}
	
	@Override
	public void addMember(MemberBean member) {
		list[count]=member;
		for(int i=0; i<(count+1);i++){
			System.out.println(list[i].toString());
		}
		count++;
	}
	@Override
	public MemberBean[] getMembers() {		
		return list;
	}
	
	@Override
	public int countMembers() {
		return count;
	}
	@Override
	public MemberBean findById(String id) {
		member=new MemberBean();
		for(int i=0; i<list.length;i++){
			if(id.equals(list[i].getId())){
				member=list[i];
				break;
			}
		}
		return member;
	}

	@Override
	public MemberBean[] findByName(String name) {
		count=0;
		for(int i=0;i<list.length;i++){
			if(name.equals(list[i].getName())){
			count++;
			}
		}
		MemberBean[] temp= new MemberBean[count];
		int j=0;
		for(int i=0;i<temp.length;i++){
			if(name.equals(list[i].getName())){
				temp[j]=list[i];
				j++;
			}if(count==j){
				break;
			}
		}
		return temp;
	}

	@Override
	public void updatePass(MemberBean member) {
		
	}
}
