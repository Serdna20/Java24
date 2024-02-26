package com.clasearrays.arrays;
import java.util.Arrays;
//import java.util.Scanner;

public class ArraysClass {
    
    /* 
        
    static int[] pushIntArray(int[] array, int element) {
        final int arrayLength = array.length;
        final int[] newArray = new int[arrayLength+1]; 
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[arrayLength] = element;
        return newArray;
    } 
    
    */
    
    static class Student {
        String name;
        int age;
        
        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
    
    public static void main(String[] args) {
        
        Student student = new Student("Pepe", 18);
        System.out.println(student.name + student.age);
        
        
        //Scanner scanner = new Scanner(System.in);        
        
        /*
        
        int[] numbers = new int[3];
        
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index;
        }        
        
        Arrays.fill(numbers, 10);
        //numbers = pushIntArray(numbers, 5);
        
        System.out.println(Arrays.toString(numbers));
        
        //System.out.println("Hello World! " + numbers[0]);
        //scanner.close();
        
        */
    }
}