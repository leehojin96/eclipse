package day05;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor, eng, math;
		double  person_avg , kor_avg , eng_avg, math_avg; 
		int person_tot , kor_tot=0, eng_tot=0, math_tot=0;		
		
		Scanner sc = new Scanner(System.in);
		
		final int MAX=3;  
		
		for( int i=1; i<=MAX; i++) {
		    kor = sc.nextInt();
		    eng=sc.nextInt();
		    math = sc.nextInt();		    
		    person_tot = kor+ eng+ math;
		    person_avg = person_tot/ 3.0;		    
		    System.out.println("개인평균="+ person_avg);
		    kor_tot += kor;
		    eng_tot +=  eng;
		    math_tot += math; 			
		}
		
		kor_avg = (double)kor_tot/MAX;
		eng_avg = eng_tot/3.0;
		math_avg = math_tot  /3.0;				
		System.out.println( kor_avg);
		System.out.println( eng_avg);
		System.out.println( math_avg);

	}

}
