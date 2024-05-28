package week1.day2;

public class LearnForLoop {
	
	public static void main(String [] args) {
		
		int num=10;
		
		
		for (int i = 1; i < num; i++) {
			if (i==5) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("");
		
		for (int i = 9; i > 0; i--) {
			if (i==4 || i==5) {
				continue;
			}
			System.out.println(i);
						
		}
	}

}
