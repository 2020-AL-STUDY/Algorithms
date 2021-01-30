package recursion1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibonachi {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		br.close();
		System.out.println(fibo(0,num));
	}
	public static int fibo(int sum, int n) {
		if(n==1) {
			return 1;
		} 
		if(n==0) {
			return 0;
		}
		if(n>0) {
		 sum=fibo(sum,n-2)+fibo(sum,n-1);	
		}
		return sum;
		
	}
}
