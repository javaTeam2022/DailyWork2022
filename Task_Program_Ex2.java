package vector;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Task_Program_Ex2 {

	public static void main(String[] args) throws IOException {
		 LinkedList<String>  item = new LinkedList<String>();
	      System.out.println("Items "+item);
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      String element;
	      int position,choice;
	      while (true) {
			System.out.println("LINKED LIST OPERATIONS");
			System.out.println("1.Add an element");
			System.out.println("2.Remove an element");
			System.out.println("3.Exit");
			System.out.println("Select Any operation");
			choice = Integer.parseInt(br.readLine());
		
			switch (choice) { 
			case 1:
				System.out.println("Enter the item name");
				element = br.readLine();
				System.out.println("What is the position");
				position = Integer.parseInt(br.readLine());
				item.add(position-1,element);
				break; 
			case 2:
				System.out.println("Enter the position");
				//element = br.readLine();
				position = Integer.parseInt(br.readLine());
				item.remove(position-1);
				break;
			default:
				System.out.println("You are exit from the programm./program End");
				break;
			}
			System.out.println("LIST :"+item);
		}

	}
}
/*
 * add,remove,exit,*/
