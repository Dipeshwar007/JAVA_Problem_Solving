import java.lang.Math;

class PerimeterRunner {
    public static int[][] data = {{2,8},{2,2},{9,2},{9,8}};
    public int pointDistanceCalc(int[] firstpoint, int[] secondPOint){
        int firstCalc = firstpoint[1]-firstpoint[0];
        int secondCalc = secondPOint[1]-secondPOint[0];
        int distance = (int)Math.sqrt((Math.pow(firstCalc,2) + Math.pow(secondCalc,2)));
        return distance;
    }
    public int getPerimeter(int[][] cordinates){
        int totalPerim = 0;
        int lastPointPosition = cordinates[0].length;
        int [] LastPoint = cordinates[lastPointPosition-1];
        for (int[] currentPt : cordinates){
            int currentDist = pointDistanceCalc(LastPoint,currentPt);
            totalPerim += currentDist;
            LastPoint = currentPt;
        }
        return totalPerim;
    }
    public static void main(String[] args) {
        PerimeterRunner pr = new PerimeterRunner();
        int gp = pr.getPerimeter(data);
        System.out.println("The perimeter is = "+gp);
    }
}
