package day13_3;

public class Monster {
	
	//Monster의 클래스변수 
	private static int armor=3;
	
	//Monster의 인스턴스 변수
	private String name;
	private int level;
	
	//Monster 기본생성자
	public Monster() {
		
	}
	
	public Monster(String name,int level) {
		this.name = name;
		this.level = level;
	}
	

}
