/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mid;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Mid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
    Scanner in =new Scanner(System.in);
    System.out.println("Enter the day number (one,two,three,four,five) in string");
    String code = in.next();
    Weekdays t= new Weekdays();
    t.nameOfDay(code); 
    }// TODO code application logic here
        // TODO code application logic here
    }
    

