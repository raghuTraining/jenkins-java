package Basics;

public class thisKeyword {
		
	int count=0;
	boolean b1;
	boolean b2;
	public boolean repeatele(int[] arr) {
		
	  for(int i=0;i<=arr.length-1;i++) {
		  
		  for(int j=0;j<=arr.length-1;j++) {
			  
			  
			if(  arr[i]==arr[j] ) {
				
				count++;	
			}
		  
		  if(count==3) {
            b1=true		;  
          System.out.println(arr[i]+" "+"is true");  
		  }
		  else {
			  
			  b1=false;}
		   
		 	  }				  count=0;

		  }
	return b1;}

			public static void main(String args[]){  

				int[] ar= {2,2,2,2,3,3,3,4,4,5,5,5};
				
				thisKeyword tk= new thisKeyword();
			boolean b1=	tk.repeatele(ar);
				//System.out.println(b1);
				
	}}