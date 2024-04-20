package practice;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//0,1,1,2,3,5,8
		/*
		 * int n1 = 0, n2 = 1, n3, cnt = 20;
		 * 
		 * System.out.print(n1 + " " + n2);
		 * 
		 * for (int i = 2; i < cnt; i++) {
		 * 
		 * n3 = n1 + n2; 
		 * System.out.print(" " + n3); 
		 * n1 = n2; 
		 * n2 = n3;
		 * 
		 * }
		 */

		// armstrong

		int no = 121, remain, rev = 0, temp = no;

		while (no != 0) {

			remain = no % 10;

			rev = rev * 10 + remain;
			no = no / 10;

		}

		if (rev == temp)
			System.out.println("no is palingdorme");
		else

			System.out.println("no is not palingdrome");

	}
	
	
	

}
