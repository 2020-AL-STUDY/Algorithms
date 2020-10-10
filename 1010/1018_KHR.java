import java.util.Scanner;

public class Chess {
	static String board[][];
	static String[][] board_white= {
			{"W","B","W","B","W","B","W","B"},
			{"B","W","B","W","B","W","B","W"},
			{"W","B","W","B","W","B","W","B"}, 
			{"B","W","B","W","B","W","B","W"},
			{"W","B","W","B","W","B","W","B"},
			{"B","W","B","W","B","W","B","W"},
			{"W","B","W","B","W","B","W","B"},
			{"B","W","B","W","B","W","B","W"}
	};
	
	static String[][] board_black= {
	        { "B","W","B","W","B","W","B","W" },
	        {"W","B","W","B","W","B","W","B" },
	        { "B","W","B","W","B","W","B","W" },
	        { "W","B","W","B","W","B","W","B"},
	        {"B","W","B","W","B","W","B","W" },
	        { "W","B","W","B","W","B","W","B"},
	        { "B","W","B","W","B","W","B","W" },
	        { "W","B","W","B","W","B","W","B" }
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String NM =sc.nextLine();
		String[] arr=NM.split(" ");
		int n,m;
		
			n=Integer.parseInt(arr[0]);
			m=Integer.parseInt(arr[1]);
			String Line;
			
			if(50>=n&&n>=8&&50>=m&&m>=8) {
				board= new String[n][m];
				for(int row=0; row<n;row++) {
					Line=sc.nextLine();
					for(int col=0; col<m; col++) {
						board[row][col]=Line.split("")[col];
					}
				}//´Ù ³ÖÀ½
				
				int result=Integer.MAX_VALUE;
				
				for(int y=0; y+7<n;y++) {
					for(int x=0;x+7<m; x++) {
						result=Math.min(result,Math.min(ChangeWhiteChess(y,x), ChangeBlackChess(y,x)));
					}
				}
				
			System.out.println(result);
				
			}
	}
	public static int ChangeWhiteChess(int y, int x) {
		int cnt=0;
		for(int i=y; i<y+8;i++) {
			for(int j=x;j<x+8;j++) {
				if(!board[i][j].equals(board_white[i-y][j-x])) {
					cnt++;
				}
			}
			
		}
		
		return cnt;
	}
	
	public static int ChangeBlackChess(int y, int x) {
		int cnt=0;
		for(int i=y; i<y+8;i++) {
			for(int j=x; j<x+8;j++) {
				if(!board[i][j].equals(board_black[i-y][j-x])) {
					cnt++;
				}
			}
		}
		return cnt;
	}

}
