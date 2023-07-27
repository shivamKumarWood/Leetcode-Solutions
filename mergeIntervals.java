class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<int[]>res=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            if(res.size()==0||intervals[i][0]>res.get(res.size()-1)[1]){
                res.add(intervals[i]);
            }else{
                res.get(res.size()-1)[1] = Math.max(res.get(res.size()-1)[1], intervals[i][1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}