/**
 *Akshay Badiger
 *
 *Boeing India Pvt Ltd
 *
 * Stackroute
 */
package com.stackroute.unittest.pe2;

/**TWrite a program, which reads number of students and n grades as input (of int between 0 and 100, inclusive) and
 * displays the average, minimum and maximum.Your program shall check for valid input. You should keep all the grades in an int[]
 * and use a method for each of the computations.
 .
 *
 * @version 1.0 11-1-2018
 *
 * @author Akshay Badiger
 */

public class StudentMarks {
        public int minimum(int number, int array[]){
            int min = array[0];
            for(int i = 0; i < number; i++){
                if(array[i] < min){
                    min = array[i];
                } }
            return min;
        }
        public int maximum(int number, int array[]){
            int max = array[0];
            for(int i = 0; i < number; i++){
                if(array[i] > max){
                    max = array[i]; }
            }
            return max; }
        public float average(int number , int array[]){
            float sum = 0;
            if(number != 0) {
                for (int i = 0; i < number; i++) {
                    sum += array[i]; }
                return (sum / number); }
            else
                return -1; }}
