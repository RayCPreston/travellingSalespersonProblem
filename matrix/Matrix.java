package matrix;

import java.util.*;
import java.lang.*;

public class Matrix{
    
    //method used to prompt user for input of cities and their X and Y coordinates
    public double[][] createMatrix(){
        Scanner scan = new Scanner(System.in);
        //ask user to input the size number of coordinates they have
        System.out.println("How many cities do you have to input? ");
        int size = scan.nextInt();
        double[][] cities = new double[size][2];
        for(int i = 0; i < size; i++){
            //while there are more cities to input, continue to fill the X & Y coordinates
            System.out.println("Enter the X value for city number " + (i + 1) + ": ");
            cities[i][0] = scan.nextDouble();
            System.out.println("Enter the Y value for city number " + (i + 1) + ": ");
            cities[i][1] = scan.nextDouble(); 
        }
        return cities;
    }
    
    //method to turn the city matrix into a square matrix
    public double[][] createSquare(){
        double cities[][] = createMatrix();
        double[][] square = new double[cities.length][cities.length];
        for(int i = 0; i < cities.length; i++){
            for(int j = 0; j < cities.length; j++){
                //inner loop will fill columns of array for i'th row
                //(i'th row X value - j'th row X value) = x length 
                //(i'th row Y value - j'th row Y value) = y length
                //Use Pythagorean theorem to determine straight line distance to each city
                square[i][j] = Math.sqrt(Math.pow((cities[i][0] - cities[j][0]), 2) + Math.pow((cities[i][1] - cities[j][1]), 2));
            }
        }
        return square;
    }
}
