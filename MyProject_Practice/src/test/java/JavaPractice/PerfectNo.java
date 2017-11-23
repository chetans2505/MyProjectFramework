package JavaPractice;

public class PerfectNo {
	public static void main(String[] args) {
		int n = 0,temp=0;
		for(int i=1;i<=n/2;i++){
			if(n%i==0){
				temp+=i;
			}
			
	}if(temp==n){
		System.out.println("perfect no");
	}
		else
			System.out.println("not a perfect no");
	}

}
