package twntyfourbatch;

public class Armstrongnumber {

	public static void main(String[] args) {
		System.out.println("welcome");
		System.out.println("hello world");
		
		int num=153;
		int t1=num;
		
		int leng=0;
		int rem;
		
		while(t1!=0) {
			
			leng=leng+1;
			t1=t1/10;
		}
		int t2=num;
		int arm=0;
		
		while(t2!=0) {
			
			int mult=1;
			rem=t2%10;
			for(int i=1;i<=leng;i++) {
				
				mult=mult*rem;
			}
			arm=arm+mult;
			t2=t2/10;
		}
		if(arm==num) {
			System.out.println("number is armstrong");
		}
		else {
			System.out.println("number is not armstrong");
			
		}

	}




	}


