// You are given an array coordinates, coordinates[i] = [x, y], 
// where [x, y] represents the coordinate of a point.
// Check if these points make a straight line in the XY plane.

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int length = coordinates.length;
        float slope;
        if(length >= 2){
            slope =  (float)(coordinates[1][1] - coordinates[0][1])/(coordinates[1][0] - coordinates[0][0]);
            for(int i =1;i<length-1;i++){
                float tempSlope =  (float)(coordinates[i+1][1] - coordinates[i][1])/(coordinates[i+1][0] - coordinates[i][0]);
                if(tempSlope != slope)  return false;
            }
        }
        // System.out.println(coordinates.length);
        return true;
    }
}