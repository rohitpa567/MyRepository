package practice;

public class Arraysum {
                     public static void main(String[] args) {
						
                    	int[]arr= {29,34,5,37,56,11,34,111,23,6,8128};
                    	int x;
                    	for(int i=0;i<arr.length;i++)
                    	{
                    		x=arr[i];
                    		int in=0,r;
                    	  for(int j=2;j<x;j++)
                    	  {
                    		r=x%j;
                    		if(r==0)
                    		{		
                    	    in=1;
                    		break;
                    		}
                    			
                    	  }
                    	  if(in==0)
                    	  System.out.println("prime nos are =" + x);

                    	}	
                    		                    	
                     }
}
