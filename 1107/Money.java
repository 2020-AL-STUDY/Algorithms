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
				money=rest(money,coin_s[i]);//������
				c_num+=1;//���� �ϳ� ��
				return change(money,coin_s,c_num);//�Է��� ������ � ��������  :���� ����
			}else {
				return -1;
			}
		}
	
		return change(money,coin_s,c_num);//�̶� ���� �Ǵ°� �Ⱦ�
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
		if(money%2==0) {//5�ǹ�� �ƴϸ鼭 2�� ����ΰ� 2,6,8,12,14
			money=rest(money,2);
			c_num+=1;
			return change2(money,2,c_num);
		}else {//5�� ��� ���ƴϰ� 2�ǹ���� �ƴѰ� 1,3������
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
//	[��ó] ���� 14916�� �Ž����� #�⺻#����|�ۼ��� ū��
//
//
//	}
		
	public static int rest(int money,int coin_s) {
		if(money>=coin_s) {
			money=money-coin_s;//�Է��ѸӴϰ� �������� ũ�ų� ��������
		}
		return money;//�Է¹��� ������ ������ŭ ���� :���� �� 
	}

}
