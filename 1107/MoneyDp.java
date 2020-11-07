import java.util.Scanner;

public class MoneyDp {
	static int[] cache;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int coin_s[]= {5,2};
		cache=new int[n+1];
		for(int i=0; i<n+1;i++) {
			cache[i]=1000000;
		}
//		int result=change3(n,coin_s);
//		System.out.println(result);
		change(n,coin_s);
	}
	public static int change3(int money,int coin[]) {//
		
		if(money==0) {
			cache[0]=0;
			return cache[money];
		}
		if(money<0) {//1이나 3이 money값으로 들어오면 -1 내보내야함
			return -1;
		}
		int ret=cache[money];//이전값
		
		for(int i=0;i<coin.length;i++) {//coin 종류가 2개이다.
			ret=Math.min(ret,cache[money-coin[i]]+1);//change3(money-coin[i],coin)
		}
		return ret;
		
	}
	public static void change(int n,int coin[]) {
//		int n;
//		scanf("%d", &n);
//		memset(dp, 0x5f, sizeof(dp));
		cache[0] = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = coin[i]; j <= n; j++) {
				cache[j] = Math.min(cache[j],cache[j - coin[i]]+1);
			}
		}
		if (cache[n] > 100000)
			System.out.println(-1);
		else
			System.out.println(cache[n]);
	}
}
