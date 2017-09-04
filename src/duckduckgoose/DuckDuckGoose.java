/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duckduckgoose;

import java.util.Scanner;

/**
 *
 * @author Carmen_Lucia3
 */
public class DuckDuckGoose {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while (testCases < 1 && testCases > 50){
            testCases = scan.nextInt();
        }

        for (int i = 0; i < testCases; i++) {
            int numberOfStudents = scan.nextInt();
            while (testCases < 1 && testCases > 10000){
                numberOfStudents = scan.nextInt();
            } 
            lista list = new lista();
            int student = 1;
            for (int j = 0; j < numberOfStudents; j++) {
                list.add(student);
                student++;
            }

            for (int p = 1; p < numberOfStudents; p++) {
                int duck = scan.nextInt();
                while (testCases < 1 && testCases > 1000000){
                    duck = scan.nextInt();
                } 
                list.delete(duck);
            }

            list.print();

        }
    }

}
