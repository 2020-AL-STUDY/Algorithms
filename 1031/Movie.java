import java.util.Scanner;

public class Movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(n<=10000) {
			int count=0;
			int title=666;
			while(title>0) {
				String temp = title+"";
				if(temp.indexOf("666")>=0) {//ã��
					count++;
				}
				if(count==n) {
					break;
				}
				title++;
			}
			System.out.println(title);
			//6�� n=1~6
			//6660~6669 10�� n=7~16
			//7666 8666 9666 //3�� n=17~19
			
			//10666... //6��
			//16660 ~16669 //10��
			//17666~19666 //3��
		}
	}

}
