import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Shiritori {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		String [] word =new String [num];
		StringTokenizer st =null;
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<num; i++) {
			word[i]=st.nextToken();
		}
		int i=0;
		while(i<num-1) {
			if(word[i].charAt(0)!=word[++i].charAt(0)) {
				System.out.println("0");
				break;
			}
		}
		if(i==num-1) {
		System.out.println("1");
		}
		
	}

}
