import java.util.*;
import java.lang.*;
import matrix.*;
import tsp.*;

public class solveTSP{

    public static void main(String[] args){
        //create new Matrix object
        Matrix m = new Matrix();
        //function to create square matrix
        double[][] sq = m.createSquare();
        tsp t = new tsp();
        int[] route = t.findPath(sq);
        String[] cityRoute = t.getCityRoute(route);
        t.printRoute(cityRoute); 
    }
}
