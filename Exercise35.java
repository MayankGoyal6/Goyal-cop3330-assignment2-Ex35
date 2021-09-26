/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 35
 *  Copyright 2021 Mayank Goyal
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main
{
  public static void main(String[] args) 
  {

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    String inputName;
    ArrayList<String> names = new ArrayList<String>();
    
    do 
    {

      System.out.print("Enter a name : ");
      inputName = scanner.nextLine();
      names.add(inputName);
    }
    while(!inputName.isEmpty());
    {

      names.remove(names.size() - 1);
      System.out.println("The winner is... " + names.get(random.nextInt(names.size())) + ".");

    }
          
  }
}