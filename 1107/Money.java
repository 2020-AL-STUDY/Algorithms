import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int coin_s[]= {5,2};
		
		int coin=0;
		while(n>0) {
			if(n%5==0) {
				coin=coin+n/5;
				n=0;
				break;
			}else {
				n-=2;
				coin++;
			}
		}
		if(n==0) {
			System.out.println(coin);
		}else {
			System.out.println(-1);
		}
//		cache=new int[n+1];
//		for(int i=0; i<n+1;i++) {
//			cache[i]=Integer.MAX_VALUE;
//		}
//		cache[0] = 0;
//		for(int i = 2; i <= n; i++){
//			cache[i] = Math.min(cache[i - 2] + 1, cache[i]);
//		}
//		for(int i = 5; i <= n; i++){
//			cache[i] = Math.min(cache[i - 5] + 1, cache[i]);
//		}
//		
//		 int result=(cache[n] == Integer.MAX_VALUE ? -1 : cache[n]); 
//		System.out.println(result);
	
	}
	public static int change(int money, int coin_s[],int c_num ) {
		if(money==0){
			return c_num;
		}
		for(int i=0; i<coin_s.length;i++) {
//			if(money==0){
//				return c_num;
//			}
			if(money%coin_s[i]==0) {
				money=rest(money,coin_s[i]);//남은돈
				c_num+=1;//동전 하나 씀
				return change(money,coin_s,c_num);//입력한 코인이 몇개 쓰였는지  :동전 개수
			}else {
				return -1;
			}
		}
	
		return change(money,coin_s,c_num);//이때 리턴 되는건 안씀
	}
	
	public int change2(int money,int coin,int c_num) {
		if(money==0) {
			return c_num;
		}
		if(money%5==0) {
			money=rest(money,5);
			c_num+=1;
			return change2(money,5,c_num);
		}
		if(money%2==0) {//5의배수 아니면서 2의 배수인것 2,6,8,12,14
			money=rest(money,2);
			c_num+=1;
			return change2(money,2,c_num);
		}else {//5의 배수 도아니고 2의배수도 아닌것 1,3같은거
			return -1;
		}
	}
	
//	public static int change4(int money,int coin[]) {
//	
//		cache[0] = 0;
//		for(int i = 2; i <= n; i++){
//			cache[i] = min(cache[i - 2] + 1, cache[i]);
//		}
//		for(int i = 5; i <= n; i++){
//			cache[i] = min(cache[i - 5] + 1, cache[i]);
//		}
//		
//		cout << (cache[n] == INF ? -1 : cache[n]) << "\n"; 
//		return 0;
//	[출처] 백준 14916번 거스름돈 #기본#냅색|작성자 큰돌
//
//
//	}
		
	public static int rest(int money,int coin_s) {
		if(money>=coin_s) {
			money=money-coin_s;//입력한머니가 동전보다 크거나 같을때만
		}
		return money;//입력받은 값에서 동전만큼 뺀값 :남은 돈 
	}

}
