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
    	if(r<0||c<0) {return;}//�ε�������
    	if(r>rlen-1||c>clen-1) {return;}//�ε��� ����
    	if(grid[r][c]=='1') {//���̴�
    		grid[r][c]='0';//�̰� üũ�� ���̴ϱ� �ٴٷ� �ٲ�
    		DFSUtil(rlen,clen,r+1,c,grid);//��
    		DFSUtil(rlen,clen,r-1,c,grid);//�Ʒ�
    		DFSUtil(rlen,clen,r,c-1,grid);//����
    		DFSUtil(rlen,clen,r,c+1,grid);//������
    	}else {
    		return;
    	}
    }
  
}