
// Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows>0){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            result.add(temp);
        } 
        
        if(numRows>1){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            temp.add(1);
            result.add(temp);
        }
        numRows-=2;
        int count = 3;
        while(numRows-->0){
            List<Integer> temp = new ArrayList<>();
            for(int i =0;i<count;i++){
                if(i==0 || i==count-1)    temp.add(1);
                else{
                    List<Integer> prev = result.get(count-2);
                    int sum = prev.get(i-1)+prev.get(i);
                    temp.add(sum);
                }
            }
            result.add(temp);
            count+=1;
        }
        return result;
    }
}