/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradeleveltest;

/**
 *
 * @author dojonate
 */
public class GradeLevelTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GradeLevel mGL = new GradeLevel ("/Users/dojonate/NetBeansProjects/GradeLevelTest/src/gradeleveltest/declaration.txt");
        System.out.println("declaration.txt");
        System.out.printf("Total Words: %d%n", mGL.wordCount());
        System.out.printf("Total Sentences: %d%n", mGL.sentenceCount());
        System.out.printf("Total Syllables: %d%n", mGL.syllableCount());
        System.out.printf("Grade level: %.2f%n", mGL.grade());
        System.out.println("\n");
        mGL = new GradeLevel ("/Users/dojonate/NetBeansProjects/GradeLevelTest/src/gradeleveltest/gettysburg.txt");
        System.out.println("gettysburg.txt");
        System.out.printf("Total Words: %d%n", mGL.wordCount());
        System.out.printf("Total Sentences: %d%n", mGL.sentenceCount());
        System.out.printf("Total Syllables: %d%n", mGL.syllableCount());
        System.out.printf("Grade level: %.2f%n", mGL.grade());
        System.out.println("\n");
        mGL = new GradeLevel ("/Users/dojonate/NetBeansProjects/GradeLevelTest/src/gradeleveltest/green_eggs_and_ham.txt");
        System.out.println("green_eggs_and_ham.txt");
        System.out.printf("Total Words: %d%n", mGL.wordCount());
        System.out.printf("Total Sentences: %d%n", mGL.sentenceCount());
        System.out.printf("Total Syllables: %d%n", mGL.syllableCount());
        System.out.printf("Grade level: %.2f%n", mGL.grade());
    }
}