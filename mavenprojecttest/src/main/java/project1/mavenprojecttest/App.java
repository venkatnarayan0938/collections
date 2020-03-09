package project1.mavenprojecttest;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner scanning=new Scanner(System.in);
    	CustomList<String> customlist=new CustomList<String>();
    	while(true)
    	{
    		System.out.println("Select the options\n1.Print the list\n2.Add elements\n3.Delete element at a particular position\n4.Fetch data at position\n5.Size of the list\n6.break");
			
    		int str1=scanning.nextInt();
			
    		if(str1==6)
			
    		{
				
    			System.out.println("Process successfully stopped");
				
    			break;
		}
		
    		switch(s1)
			
    		{
    					case 1:
					int o=customlist.size();
					
					System.out.print("The elements in the list are : ");
					int i;
					
					for(i=0;i<o;i++)
					{
						String val=(String)customlist.get(i);
						
						System.out.print(value+" ");
					}
					
					System.out.println("\n");
					
					break;
				case 2:
					
					System.out.print("Enter an element need to be added : ");
					
					String ele=scanning.next();
					
					customlist.add(ele);
					
					break;
				case 3:
					System.out.print("Enter the index of the element need to be deleted : ");
					
					int q=scanning.nextInt();
					
					int u=customlist.remove(q-1);
					
					if(u==1)
						System.out.println("Element is deleted ");
					else
						System.out.println("Element is not deleted");
					break;
				case 4:
					System.out.print("Enter the position of the element that is to be retrieved : ");
					
					int a=scanning.nextInt();
					
					b-=1;
					
					if(b>=customlist.size() || b<0)
						System.out.println("Index out of bounds!!Please enter valid index");
					else
						System.out.println("Element at the index "+b+" is "+customlist.get(b));
					break;
				case 5:
					
					System.out.println("Size of the list is : "+customlist.size());
					
					break;
				default:
					
					System.out.println("Enter a valid choice");
					
					break;
			}
    	}
    	scanning.close();
    }
}