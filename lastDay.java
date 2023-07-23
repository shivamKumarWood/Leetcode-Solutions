import java.util.*;
class lastDay {
    public static void main(String args[]) {
        int row=2,col=2,cells[][]={{1,1},{1,2},{2,1},{2,2}};
        int left=0,right=row*col,ans=0;
        while(left<right-1){
            int mid=left+(right-left)/2;
            System.out.println("mid="+mid);
            if(possible(row,col,mid,cells)){
                left=mid;
                ans=mid;
                System.out.println("ans="+ans);
            }else{
                right=mid;
            }
        }
        System.out.println("final ans="+ans);
    }
    public static boolean possible(int row,int col,int mid,int[][] cells){
        int [][]grid=new int[row][col];
        int moves[][]={{1,0},{-1,0},{0,1},{0,-1}};
        for(int i=0;i<mid;i++){
            grid[cells[i][0]-1][cells[i][1]-1]=1;
        }
        System.out.println("------------");
        for(int i=0;i<row;i++){
          for(int j=0;j<col;j++){
             System.out.print(grid[i][j]+"\t");
            }
            System.out.println();
        }
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<col;i++){
            if(grid[0][i]==0){
                q.offer(new int[]{0,i});
                grid[0][i]=1;
            }
        }
        System.out.println("------------");
        for(int i=0;i<row;i++){
          for(int j=0;j<col;j++){
             System.out.print(grid[i][j]+"\t");
            }
            System.out.println();
        }
        while(!q.isEmpty()){
            int box[]=q.poll();
            int r=box[0],c=box[1];
            for(int move[]:moves){
                int nr=r+move[0],nc=c+move[1];
                if(nr>=0&&nr<row&&nc>=0&&nc<col&&grid[nr][nc]==0){
                    grid[nr][nc]=1;
                    if(nr+1==row) return true;
                    q.offer(new int[]{nr,nc});
                    System.out.println("-------");
                    for(int i=0;i<row;i++){
                      for(int j=0;j<col;j++){
                         System.out.print(grid[i][j]+"\t");
                      }
                      System.out.println();
                   }
                }
            }
        }
        return false;
    }
}