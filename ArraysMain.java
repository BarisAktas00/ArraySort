import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysMain {
	
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("input your arr length");
			int len = scan.nextInt();
			Random rand = new Random();
			int[] arr = new int[len];
			System.out.print("Random array: ");
			for (int i = 0; i < len; i++) {
				arr[i] = rand.nextInt(10);
				
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			
			findMinMax(sortClone(cloneArr(arr)));
			sumOfArray(arr);
			average(arr);
			oddNumbers(arr);
			evenNumbers(arr);
			compare(sortClone(arr));
			searchNum(arr);
			removeDuplicateElements(arr, arr.length);
			
		}
	}
	
	public static int[] cloneArr(int[] temp) {
		System.out.print("Clone array ");
		int[] clone = temp.clone();
		for (int i = 0; i < clone.length; i++) {
			System.out.print(clone[i] + " ");
		}
		return clone;
	}
	
	public static int[] sortClone(int[] temp) {
		System.out.println();
		System.out.print("Sorted Array: ");
		Arrays.sort(temp);
		for (int sorted : temp) {
			System.out.print(sorted + " ");
		}
		return temp;
	}
	
	public static void findMinMax(int[] temp) {
		System.out.println();
		System.out.println("Min number of sorted array");
		int min = temp[0];
		System.out.println(min);
		System.out.println();
		System.out.println("Max number of sorted array");
		int max = temp[temp.length - 1];
		System.out.println(max);
	}
	
	public static void sumOfArray(int[] temp) {
		int sum = 0;
		for (int i = 0; i < temp.length; i++) {
			sum += temp[i];
		}
		
		System.out.println("Sum of the sorted array numbers: " + sum);
	}
	
	public static void average(int[] temp) {
		int sum = 0;
		for (int i = 0; i < temp.length; i++) {
			sum += temp[i];
			
		}
		double average = (sum / (double) (temp.length));
		System.out.println("Average of sorted array numbers :" + average);
	}
	
	public static void oddNumbers(int[] temp) {
		int counter = 0;
		int sum = 0;
		System.out.println();
		System.out.print("Odd numbers: ");
		for (int i = 0; i < temp.length; i++) {
			int a = temp[i];
			if (a % 2 == 1) {
				
				sum += a;
				counter++;
				System.out.print(a + " ");
			}
		}
		System.out.println();
		System.out.println("Sum of odd numbers: " + sum + " count of odd numbers " + counter);
	}
	
	public static void evenNumbers(int[] temp) {
		int counter = 0;
		int sum = 0;
		System.out.println();
		System.out.print("Even numbers: ");
		for (int i = 0; i < temp.length; i++) {
			int a = temp[i];
			if (a % 2 == 0) {
				
				sum += a;
				counter++;
				System.out.print(a + " ");
			}
		}
		System.out.println();
		System.out.println("Sum of even numbers: " + sum + " count of odd numbers " + counter);
	}
	
	public static void compare(int[] temp) {
		System.out.println();
		System.out.println();
		if (temp[temp.length - 1] > 25) {
			System.out.println("there is number grater than 25");
		} else {
			System.out.println("there is NOT number grater than 25");
		}
		
	}
	
	public static void searchNum(int[] temp) {
		int check=Arrays.binarySearch(temp, 5);
		System.out.println();
		if(check>=0) {
			System.out.println("There is 5 in array. Index of 5 is : "+check);
			
		}
		
	}
	
	public static int removeDuplicateElements(int arr[], int n){  
		System.out.println();
		System.out.print("Array without duplicated elements :");
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        
        for(int i=0;i<arr.length;i++) {
        	
        	System.out.print(arr[i]+" ");
        	if(arr[i]==arr[arr.length-1]) {
        		break;
        	}
        }
        
        
        return j;  
    }  
}
