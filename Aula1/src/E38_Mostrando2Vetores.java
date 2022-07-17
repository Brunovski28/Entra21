
public class E38_Mostrando2Vetores {

	public static void main(String[] args) {

		int v1[] = new int[100];
		int v2[] = new int[100];

		for (int i = 0; i < v1.length; i++) {
			v1[i] = i * 10;
		}
		int n3 = (v1.length - 1);
		for (int i = 0; i < v1.length; i++) {
			v2[n3] = v1[i];
			n3--;
		}

		for (int i = 0; i < v1.length; i++) {
			System.out.println(v1[i]+" "+v2[i]);
		}
	}
	
}
