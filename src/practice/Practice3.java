package practice;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int no = 1; no <= 100; no++) {

			int in = 0;
			for (int i = 2; i < no;i++ )
			{
				if (no % i == 0)
					in = 1;
		

			}
			  if(in==0)
		           System.out.println(no);

		}

	}

}
