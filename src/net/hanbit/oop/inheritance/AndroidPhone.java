package net.hanbit.oop.inheritance;

public class AndroidPhone extends IPhone {
	// BRAND 갤럭시 노트 
	// data를 오버라이딩해서 카톡 메세지라고 출력시킴
	private String size, appl;
	public final static String BRAND="갤럭시 노트";
	
	public void setAppl (String appl){
		this.appl=appl;
	}
	public String getAppl(){
		return appl;
	}
	public void setSize (String size){
		this.size=size;
	}
	public String getSize(){
		return size;
		
	}
	@Override
	public String toString(){
		//스마트폰이기 때문에 이동 가능한 상태로 홍길동에게 010 번호로 갤럭시노트 6인치를 사용해서 안녕이라고 카톡을 전송했다.
		return String.format("%s이기 때문에  %s 한 상태로  %s에게  %s번호로  %s %s를사용해서  %s이라고 %s을 전송했다.", KIND, move, name, phoneNo, BRAND, size, data, appl);
	}

}
