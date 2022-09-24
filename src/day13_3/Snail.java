package day13_3;

public class Snail extends Monster{
	
	//Snail의 인스턴스 변수
	private String skill;
	
	//Monster 기본생성자
	Snail(){
	}
	
	public Snail(String name,int level) {
		super(name,level);
	}
	public Snail(String name,int level,String skill) {
		super(name,level);
		this.skill = skill;
	}

	public void printInfo() {
		System.out.println("name : "+name);
		System.out.println("level : "+level);
		System.out.println("armor : "+armor);
		System.out.println("skill : "+skill);
		System.out.println(" ");
	}
}
