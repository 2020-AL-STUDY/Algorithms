class Solution {
	public static void main(String[] args) {
		
	}
    public int numIslands(char[][] grid) {
    int rlen=grid.length;
    int clen=grid[0].length;
        System.out.println(grid.length);
        System.out.println(grid[0].length);
    int sum=0;
     for(int r=0; r<rlen;r++) {
    	  for(int c=0; c<clen;c++) {
    		  if(grid[r][c]=='1') {
        		  sum+=1;
        		  DFSUtil(rlen,clen,r,c,grid);
        	  }
    	  }
      }

		return sum;
    }
     public void DFSUtil(int rlen,int clen,int r,int c, char grid[][]){
    	if(r<0||c<0) {return;}//인덱스에러
    	if(r>rlen-1||c>clen-1) {return;}//인덱스 에러
    	if(grid[r][c]=='1') {//땅이다
    		grid[r][c]='0';//이건 체크한 땅이니까 바다로 바꿔
    		DFSUtil(rlen,clen,r+1,c,grid);//위
    		DFSUtil(rlen,clen,r-1,c,grid);//아래
    		DFSUtil(rlen,clen,r,c-1,grid);//왼쪽
    		DFSUtil(rlen,clen,r,c+1,grid);//오른족
    	}else {
    		return;
    	}
    }
  
}