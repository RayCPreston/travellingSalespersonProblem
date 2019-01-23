package tsp;

import java.lang.*;
import java.util.*;
import matrix.*;

public class tsp{
    
    //method to see if the city has been visited yet
    public boolean visited(int check, int[] arr){
        boolean found = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == check)
                found = true; 
        }
        return found;
    }


    public int[] findPath(double[][] m){
        //create variables that do the following
        //denotes in which city the salesman is currently located for the next leg
        int curr = 0;
        //an array to add each step of the journey
        int[] route = new int[m.length];
        //this will make sure cities are added in the proper order to route array
        int routeCounter = 0;
        int nextCity = 0;
        //while all cities have not been visited
        while(routeCounter < (m.length - 1)){
            //the current route is added to the route array
            route[routeCounter] = (curr + 1);
            //the routeCounter increments so the next city will be be placed next in array
            routeCounter ++;
            //arbitrary number to start
            double shortest = 1000000;
            //loop from the current city to go through all cities and find the shortest path next
            for(int i = 0; i < m.length; i++){
                //if the next path is shorter than the last, does not equal 0, and is not in the 
                //current route, place the distance to the new destination in the shortest variable, and
                //update nextCity variable
                if(m[curr][i] < shortest && m[curr][i] != 0.0 && visited((i + 1), route) == false){
                    shortest = m[curr][i];
                    nextCity = i; 
                }
                else{}
            }
            //the shortest destination city is put in curr variable
            //when the loop restarts, it will be added to route 
            curr = nextCity;
        }
        route[routeCounter] = (curr + 1);
        return route;
    }

    public String[] getCityRoute(int[] arr){
        String[] named = new String[arr.length];
        int hold;
        String result;
        for(int i = 0; i < arr.length; i++){
            hold = arr[i];
            //this can be expanded with a longer switch statement if necessary
            switch(hold){
                case 1:
                    result = "City A";
                    break;
                case 2:
                    result = "City B";
                    break;
                case 3:
                    result = "City C";
                    break;
                case 4:
                    result = "City D";
                    break;
                case 5:
                    result = "City E";
                    break;
                case 6:
                    result = "City F";
                    break;
                case 7:
                    result = "City G";
                    break;
                case 8:
                    result = "City H";
                    break;
                case 9:
                    result = "City I";
                    break;
                case 10:
                    result = "City J";
                    break;
                default:
                    result = "Error processing city list";
            }
            named[i] = result;
        }
        return named;
    }

    //print cityRoute
    public void printRoute(String[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i] + " ");
        }
    }
}
