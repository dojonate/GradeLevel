/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradeleveltest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author dojonate
 */
public class GradeLevel {
    
    private File myFile;
    private Scanner reader;
    GradeLevel(String loc){
        myFile = new File(loc);
        try {
            reader = new Scanner(myFile);
        } catch (FileNotFoundException ex) {
            System.err.printf("Exception: %s%nFile not found%n", ex);
        }
    }
    
    int wordCount(){
        int count = 0;
        while (reader.hasNext()){
            reader.next();
            count++;
        }
        reader.close();
        try {
            reader = new Scanner(myFile);
        } catch (FileNotFoundException ex) {
            System.err.printf("Exception: %s%nFile not found%n", ex);
        }
        return count;
    }
    
    int sentenceCount( ) /*throws FileNotFoundException*/{
        int count=0;
        reader.useDelimiter("[\.!]");
        while (reader.hasNext()){
            reader.next();
            count++;
        }
        reader.reset();
        reader.close();
        try {
            reader = new Scanner(myFile);
        } catch (FileNotFoundException ex) {
            System.err.printf("Exception: %s%nFile not found%n", ex);
        }
        
        return count;
    }
    
    int syllableCount(){
        int count=0;
        while (reader.hasNext()){
            count += reader.next().length();
        }
        reader.close();
        try {
            reader = new Scanner(myFile);
        } catch (FileNotFoundException ex) {
            System.err.printf("Exception: %s%nFile not found%n", ex);
        }
        return count/3;
    }
    
    float grade(){
        //System.out.println(this.wordCount()); //console test for this.commands
        float grade = (float) ((0.39*(this.wordCount()/this.sentenceCount()))+(11.8*(this.syllableCount()/this.wordCount())) - 15.59);
        return grade;
    }
    
}
