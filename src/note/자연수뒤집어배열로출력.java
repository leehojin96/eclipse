package note;

public class 자연수뒤집어배열로출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 620830;
		int[] answer = new int[7];
		int x = 0;
	    int i = 0;
	    
	    while(true){
	        if(n >0){
	            x = n %10;
	            if(x==0){
	                n/=10;
	            }else{
	            n /= 10;
	            answer[i] = x ;
	            i++;
	            }
	        }else{
	            break;
	        }
	        
	        
	    for(int z = 0 ; z < answer.length;z++) {
			
			System.out.print(answer[z]);
		}
	}
}
}