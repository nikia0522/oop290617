package net.hanbit.oop.inheritance;

public class IPhone extends CellPhone{
	protected String data;
	// KIND 는 스마트폰이라고 오버라이딩..
	public final static String KIND="스마트폰";
	public final static String BRAND="아이폰";
	
	public void setData(String data){
		this.data=data;
		setPortable(true);
	}
	public String getData(){
		return data;
	}
	
	@Override
	public String toString(){
		//스마트폰이기 때문에 이동 가능한 상태로 홍길동에게 010 번호로 아이폰을 사용해서 안녕이라고 문자를 전송했다.
		return String.format("%s이기 때문에  %s 한 상태로  %s에게  %s번호로  %s 를사용해서  %s이라고 문자를 전송했다.", KIND, move, name, phoneNo, BRAND, data);
	}

}
