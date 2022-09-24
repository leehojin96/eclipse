package day13_3;

public class SnailTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Snail snail_1 = new Snail("RedSnail",2);
		Snail snail_2 = new Snail("GreenSnail",3);
		Snail snail_4 = new Snail("BossSnail",10,"몸통박치기");
		
		Snail snail_5 = new Snail();
		
		Monster m;
		m=snail_1;
		
		
		System.out.println(m.name);
		System.out.println(m.level);
		System.out.println(m.armor);
//		System.out.println(m.skill);
//		Monster 형으로는 Snail이 가지는 멤버에 접근 할 수 없음
		System.out.println(" ");
		
		
		
		snail_1.printInfo();
		snail_2.printInfo();
		snail_4.printInfo();
		
		snail_5.printInfo();
		
		
	}

}
