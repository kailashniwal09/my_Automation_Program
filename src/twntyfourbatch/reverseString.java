package twntyfourbatch;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="kailash";
		int leng=name.length();
		String rev=" ";
		
		for(int i=leng-1;i>=0;i--) {
			
			rev=rev+name.charAt(i);
		}
		
		System.out.println(rev);


	}

}
