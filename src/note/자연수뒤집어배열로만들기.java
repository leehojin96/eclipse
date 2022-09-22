package note;

public class 자연수뒤집어배열로만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 621830;
		int[] answer = new int[7];
		int[] abc = new int[7];
	    int x = 0;
	    int i = 0;
	    
	    while(true){
	        if(n >0){
	            x = n %10;
	            n /= 10;
	            abc[i] = x ;
	            i++;
	        }else{
	            break;
	        }
	        
	    }
	    for(int z = 1 ; z <= i ; z++){
	        answer[i - z] = abc[z-1];
	    }
	    
	
	for(int z = 0 ; z < answer.length;z++) {
		
		System.out.print(answer[z]);
	}
	}
	
	
	
}