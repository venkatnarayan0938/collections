package project1.mavenprojecttest;
import java.util.Arrays;
public class CustomList<L> {

	public Object ob[]=new Object[10];
	
	public int lk=0;
	
	public int sr=10;
	
	public CustomList()
	{
		for(int i=0;i<10;i++)
			ob[l++]=String.valueOf(i+1);
	}
	
	
	public void add(L data)
	{
	
		if(lk>=sr)
		
		{
		
			memoryAllocate();
		
		}
		ob[lk++]=String.valueOf(data);
	}
	private void memoryAllocate() 
	{
	       int newSize = (ob.length*3)/2+1;
	       sr=newSize;
	       ob = Arrays.copyOf(ob, newSize);
	}
	
	public Object get(int index) 
	{
		if(index>=0 && index<l)
			return ob[index];
		return null;
	}
	
	public int remove(int index)
	{
		if(index>=0 && index<l)
		{
			int del = lk - ( index + 1 ) ;
		    System.arraycopy(ob, index + 1,ob,index,del) ;
		    lk=lk-1;
		    return 1;
		}		
		return 0;
	}
	
	public int size() 
	{
		return lk;
	}
}
