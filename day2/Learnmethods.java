package week1.day2;

public class Learnmethods {
	
	public void browser() {
		System.out.println("Edge Browser");
	}

	public int browserVersion() {
		return 150;
	}

	public int browserValue(int a, int b) {
		return a+b; 
	}
	
	public String launchBrowser(String browserName) {
				return browserName;
	}
	public void URL() {
		System.out.println("URL application");
			}
	public static void main(String [] args) {
		Learnmethods method1=new Learnmethods();
		System.out.println(method1.browserValue(9, 8));
		System.out.println(method1.browserVersion());
		System.out.println(method1.launchBrowser("Edge Browser"));
							
	}
}
