package inshuffle;

import java.util.LinkedList;
import java.io.*;

public class Inshuffle {

	public static void main(String[] args) {
int k=0,lock=0;
LinkedList <Integer> shuffle= new LinkedList <Integer>();
for(int i=1;i<53;i++)
{	shuffle.add(i);
	
}	
/*for(int l=1;lock!=1;l++)	//condition for 1 and 52 card touch
{for(int i=26,j=0;j<52;i++,j=j+2)
  {	k=shuffle.remove(i);
	shuffle.add(j, k);
  }
System.out.println("shuffle count:"+ l + "\n");
for(int i=0;i<52;i++)
{	if(shuffle.get(i)==1&&(shuffle.get(i-1)==52||shuffle.get(i+1)==52))
		lock=1;
}	
		
		
}*/

/*for(int l=1;l<8;l++)	//condition for 7 rounds of shuffling
{for(int i=26,j=0;j<52;i++,j=j+2)
  {	k=shuffle.remove(i);
	shuffle.add(j, k);
  }
//System.out.println("shuffle count:"+ l + "\n");
}*/

for(int l=1;shuffle.peekLast()!=1;l++)	//condition for 1st card to be at last position
{for(int i=26,j=0;j<52;i++,j=j+2)
  {	k=shuffle.remove(i);
	shuffle.add(j, k);
  }
System.out.println("shuffle count:"+ l + "\n");
}

for(int i=0;i<52;i++)
	System.out.println(shuffle.get(i));

	}
	
}
