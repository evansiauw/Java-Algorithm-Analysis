
public class ISort {
	int count = 0;
	
	public void InsertionSort(int [] num){
		 for (int j = 1; j < num.length; j++){
		        int key = num[j];
		        int i = j-1;
		        
		  while(i >= 0 && num[i] > key){
			  	count++;
		        num[i+1] = num[i];
		        i--; }
		  num[i+1] = key; }
		 
		 printSortedArray(num);
	}
		 
	public void printSortedArray(int[] num){
		if(num.length <= 64){
			for (int k = 0;k < num.length ;k++){
				System.out.print( num[k] + " "); }
			System.out.print("\nTotal Insertion Sort Count for Num" + num.length +".txt is " + count + "\n\n"); }
		
		if(num.length > 64){
			for (int k = 51;k <= 100 ;k++){
		        System.out.print( num[k] + " "); }
			System.out.print("\nTotal Insertion Sort Count for Num" + num.length +".txt is " + count + "\n\n"); }
	}
	
}
