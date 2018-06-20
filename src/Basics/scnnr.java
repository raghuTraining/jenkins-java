package Basics;

import java.util.Scanner;

public class scnnr {

	
	public static void main(String args[]){  
		
		int arr[]= {1, 2, 8 ,2 ,4 ,5 ,7 ,9};
	

for(int i=0 ; i<=arr.length-1;i++){

for(int j=i ; j<=arr.length-1;j++){

if(arr[i]+arr[j]==9){

	System.out.println(arr[i]+" "+arr[j]);

}}}
}
}