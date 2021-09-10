
public class Exercise {

	public static void main(String[] args) {
		int n=7;
		System.out.println(n);
		for (int i = 0; i < 16; i++) {
			if(i%2 == 0){
				n=n-2;
				System.out.println(n);
			}
			else{
				n=n*2;
				System.out.println(n);
			}
		}
	}

}
