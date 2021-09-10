
public class Teste {

	public static void main(String[] args) {
		int a[]={2, 1, 1, 4, 6, 5, 2, 12, 4, 19, 1, 1};
		a[3]=a[2]+a[2];
		a[6]=a[6]*a[6];
		while(a[3] < a[5]){
			a[3]=a[3]+a[1];
			a[6]=a[6]-a[1];
			a[3]=a[2]+a[2];
			a[6]=a[6]*a[6];
			System.out.println(a[3]+" "+a[6]);
		}
		a[9]=a[2]+a[8];
		a[10]=a[6]*a[9];
		
		System.out.println(a[10]);

	}

}
