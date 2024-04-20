package practice;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int no = 153, sum = 0, r,temp=no;

		while (no != 0) {
			r = no % 10;

			sum = sum + r * r * r;
			no = no / 10;

		}
		if (sum == temp)
			System.out.println(temp+" no is armstrg");
		else
			System.out.println(temp+" no is not armstrng");

	}
	
	
	

}
