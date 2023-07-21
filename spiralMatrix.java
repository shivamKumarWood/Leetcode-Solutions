
import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    public List<Integer> spiralOrder(int[][] arr) {
        ArrayList<Integer>list=new ArrayList<>();
        int count1=0;
        int row=arr.length;
        int column=arr[0].length;
        int a=0,n=column,p=0;
        int b=1,m=row-1,q=column-1;
        int c=column-1,o=0,r=row-1;
        int d=row-2,s=1,t=0;
        outer:while(true)
        {

            for(int i=a;i<n;i++){
                list.add(arr[p][i]);++count1;
                if(count1==row*column)
                    return list;
            }p++;a++;n--;

            for(int i=b;i<m;i++){
                 list.add(arr[i][q]);
                ++count1;
                if(count1==row*column)
                    return list;
            }q--;b++;m--;

            for(int i=c;i>=o;i--){
                 list.add(arr[r][i]);
                ++count1;
                if(count1==row*column)
                    return list;
            }r--;c--;o++;

            for(int i=d;i>=s;i--){
                 list.add(arr[i][t]);
                ++count1;
                if(count1==row*column)
                    return list;
            }t++;d--;s++;
        }      
    }
    
}
