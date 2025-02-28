/*The HashTableRunner class acts as the main method for this code, while also simulating what 
a Hash table can accomplish.
@author Kenedi Carson*/

//Import needed utilities
import java.util.LinkedList;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import static java.lang.System.*;

public class HashTableRunner{  
  public static void main ( String[] args ) throws FileNotFoundException{
		try{
			//Create an Array of LinkedLists, then instantiate each one.
			LinkedList[] test = new LinkedList[10];
			for(int i = 0; i < test.length; i++){
			    test[i] = new LinkedList<Number>();
			}
			
			//Use the Scanner class to read in the file "numbers.dat" and 
			//Use those values as parameters from each Number object in the Array.
			Scanner scan = new Scanner(new File("numbers.dat"));
			while(scan.hasNextInt()){
			    Number temp = new Number(scan.nextInt());
			    //Use the hash code of temp to act as an index variable for the test Array. 
                    if (!test[temp.hashCode()].contains(temp)) { 
                        test[temp.hashCode()].add(temp);
                    }
			}
			//Output the list using a nested for loop
			for(int i = 0; i < test.length; i++){
			    System.out.print("bucket " + i + " ");
			    for(int j = 0; j < test[i].size(); j++){
			        System.out.print(test[i].get(j));
			    }
			    System.out.print("\n");
			}
            
		}
		catch(Exception e){
			System.out.println("Houston, we have a problem!");
		}
	}
}
