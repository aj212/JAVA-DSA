package basicprograms;

import java.util.Scanner;

public class merge {

	public static void mergeSort(int[] input){
		// Write your code here
		  if(input.length<=1)
        {
          return; 
        }
        
        
        int h1[]=new int[input.length/2];
        int h2[]=new int[input.length-h1.length];
        
        for(int i=0;i<h1.length;i++)
        {
          h1[i]=input[i]; 
        }
        
        for(int j=0;j<h2.length;j++)
        {
            h2[j]=input[h1.length+j];
        }
        
        mergeSort(h1);
        mergeSort(h2);
        
        int arr[]=new int [input.length];
        int k=0;
        int i=0;
        int j=0;
        while(i<h1.length&&j<h2.length)
        {
         if(h2[j]<h1[i])
         {
             arr[k++]=h2[j];
             j++;
         }
            else
            {
                arr[k++]=h1[i];
                i++;
            }
        
        }
        while(i<h1.length)
        {
            arr[k++]=h1[i];
            i++;
        }
        
        while(j<h2.length)
        {
        
            arr[k++]=h2[j];
            j++;
        }
        for(int l = 0; l < arr.length; l++){
            input[l] = arr[l];
        }
       
        
	}   

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter elements of array");
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		s.close();
		return arr;
		
	}
	
	public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	public static void main(String[] args) {
		int[] input = takeInput();
		mergeSort(input);
		printArray(input);
	}
	
}
