package net.hanbit.oop.inheritance;

public class CellPhone extends Phone{
	private boolean portable;
	protected String move;
	public final static String KIND="휴대폰";// 컨트롤러에 인스턴스들이 공유하는 것!
	
	public void setMove(String move){
		this.move=move;
	}
	public String getMove(){
		return move;
	}
	public void setPortable(boolean portable){
		if(portable){
			this.setMove("이동 가능");
		}else{
			this.setMove("이동 불가능");
		}
		this.portable=portable;
	}
	public boolean isPortable(){
		return portable;
	}

	@Override //parent와 똑같은 이름이 있으면 바꿔치기(override)할 것임. 부모의 기능을 죽이는 것. 
	public String toString(){
		return String.format("%s이기 때문에 %s 상태로  %s에게  %s번호로  %s %s 를사용해서 %s이라고 통화했다", KIND, move, super.name, super.phoneNo, super.brand, KIND, super.call);
	}
}
