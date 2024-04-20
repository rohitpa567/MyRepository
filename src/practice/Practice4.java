package practice;

public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int no = 1; no <= 100; no++) {
			int sum = 0;
			for (int i = 1; i < no; i++) {
				if (no % i == 0)

					sum = sum + i;
			}

			if (sum == no)
				System.out.println("The  perfect no are=" + no);
		}

	}

}
