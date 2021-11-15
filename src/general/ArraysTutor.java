package general;

import object_oriented_programming.Point;

public class ArraysTutor {
    public static void main(String[] args) {
        int [] x = new int[5];

        x[0] = 10;
        x[1] = 12;

        for(int i = 0; i < x.length; i++){
            x[i] = 10 + i;
            //This approach is useful when I'm iterating through an array and I want to change something in
            //the stored values
        }

        /*
        Enhanced FOR
        for(local declaration of the data-type through which I am iterating : collection through which I iterate

        Can not be used to modify directly in the array
        This syntax copies the current value in the local declaration of the j variable
         */

        for (int j:x){
            System.out.print(j + ", ");
        }

        Point[] collection = new Point[5];
        collection[0] = new Point(1,1);
        collection[1] = new Point(2,3);
        System.out.println("");
        System.out.println(collection[1].x);
        //System.out.println(collection[2].y);  NPE due to collection[2] doesn't exists

        for (Point p: collection) {
            if (p != null) {
                System.out.println(p.x + " " + p.y);
            }
        }

        int[] q1 = {5, 6, 7, 8, 9, 10};
        int[] q2 = new int[]{20, 20, 30, 40, 50};

        //1. For q1 - calculate the total sum of the elements in the array
        //2. For q1 - increment all the elements in the array with 3

        //Add 1
        int mySum = 0;
        for (int element:q1){
            mySum += element;
        }
        System.out.println(mySum);

        //Add 2
        for (int i = 0; i< q1.length; i++){
            q1[i] += 3;
        }

        for ( int el:q1){
            System.out.print(el + " ");
        }

        //we can create matrices (multi-size arrays) using the initial concept of arrays
        int[][] m = new int[3][3];
        for(int i=0; i < m.length; i++){
            for(int j=0; j < m[i].length; j++){
                m[i][j] = i + j;
            }
        }
        System.out.println("");
        //using an enhanced for iterate through the multi-size array called m and display all its values in
        //following format
        // 0 1 2
        // 1 2 3
        // 2 3 4
        for(int[] a:m){
            for(int b:a){
                System.out.print(b + " ");
            }
            System.out.println("");
        }

        int[][] q3 = {{1, 3, 4}, {4, 6, 7}, {7, 6, 3}};
        for(int[] a:q3){
            for(int b:a){
                System.out.print(b + " ");
            }
            System.out.println("");
        }

        int[][] n = new int [3][];
        n[0] = new int[10];
        n[1] = new int[3];
        n[2] = new int[6];
    }
 }
