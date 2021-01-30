package recursion1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class factorial {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			int num =Integer.parseInt(br.readLine());
			br.close();
			System.out.println(fac(1,num));
			
	}
	public static int fac(int sum,int n) {
		if(n>0) {
		sum=n*fac(sum,n-1);
		}
		return sum;
	}
}
