//Rebecca Amarh-Adjei
//WW Code Exercise
//Question 3:
//Generate 500 random numbers and print the nth smallest number
//in a programming language of your choice


package test;

import java.util.ArrayList;
import java.util.Random;

public class Random500MinValue {

	public static void main (String[] showArray)
    {


        ShowArray(RandomArray(500));


    }

    private static ArrayList<Integer> RandomArray(int n) {

        ArrayList<Integer> arrayRandom = new ArrayList<Integer>(n);

        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());
        for (int i = 0; i < n; i++)

        {
            Integer r = rand.nextInt(); //% 256;
            arrayRandom.add(r);

        }

        return arrayRandom;

    }

    private static void ShowArray(ArrayList<Integer> randomArray) {
        int n = randomArray.size();
        int min = Integer.MIN_VALUE;

        ArrayList<Integer> showArray = new ArrayList<Integer>(n);

        for (int i = 0; i < n; i++) {
            int r = randomArray.get(i);
            showArray.add(r);
            System.out.println(showArray);
            
          


        }
        
        min = showArray.get(0);
        int index;

        for (int i = 0; i < showArray.size(); i++) {
            if (showArray.get(i)< min) {
                min = showArray.get(i);
                index = i;

            }


            System.out.println("Min Value: " +min + " Index "+ i);
            break;
        }



    }
}