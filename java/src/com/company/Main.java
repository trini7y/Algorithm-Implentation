package com.company;


public class Main {

    public static void main(String[] args) {
        int[] newArray = new int[10];
        for(int i = 0; i < 10; i++){
            newArray[i] = randomNumbers()[i];
        }
        System.out.print(" Generated random numbers :");
        for(int i = 0; i < 10; i++){
            System.out.print('\t');
            System.out.print(newArray[i]);
        }
        System.out.print('\n');

        System.out.print(" Sorted :");
        for(int i = 0; i < 10; i++){
            System.out.print('\t');
            System.out.print( insertionSort( newArray )[i] );
        }
        System.out.print('\n');
        System.out.print(" Reverse Sorted :");
        for(int i = 0; i < 10; i++){
            System.out.print('\t');
            System.out.print( RinsertionSort( newArray )[i] );
        }
    }

    public static int[] randomNumbers(){
        int[] array = new int[10];
        int randNum = 1 + (int)(Math.random() * 50);
        for(int i = 0; i < array.length; i++){
            array[i] = randNum;
        }
        return array;
    }
    public static int[] insertionSort(int[] Array){
        for (int j = 1; j < Array.length; j++){
            int key = Array[j];
            int i = j - 1;
            while( i >= 0 && Array[i] > key){
                Array[i + 1] = Array[i];
                i = i - 1;
            }
            Array[i + 1] = key;
        }
        return (Array);
    }

    public static int[] RinsertionSort(int[] Array){
        for (int j = 1; j < Array.length; j++){
            int key = Array[j];
            int i = j - 1;
            while( i >= 0 && Array[i] < key){
                Array[i + 1]  = Array[i];
                i = i - 1;
            }
            Array[i + 1] = key;
        }
        return (Array);
    }


}
