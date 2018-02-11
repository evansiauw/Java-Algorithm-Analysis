public class HSort {
	int count = 0;
	int size, n;
	
	public void HeapSort(int[]num){
	n = num.length;	
	Build_Max_Heap(num);
	for(int i = size-1; i >= 0; i--){
		int temp = num[0];
		num[0] = num [i];
		num[i] = temp;
		size--;
		Max_Heapify(num, 0); }
		printSortedArray(num);
	}
	
	public void Max_Heapify(int[] num, int i){
		int largest = i;
	    int l = 2*i + 1;
	    int r = 2*i + 2;
	 
	    if (l < size && num[l] > num[largest]){
	            largest = l; }
	 
	    if (r < size && num[r] > num[largest]){
	            largest = r; }
	 
	    if (largest != i){
	            int swap = num[i];
	            num[i] = num[largest];
	            num[largest] = swap;
	            count++;
	            Max_Heapify(num,largest); }
	}
	
	public void Build_Max_Heap(int []num){
		size = num.length;
		for(int i = ((size/2) - 1); i >= 0; i--){
			Max_Heapify(num,i);
		}
	}
	
	public void printSortedArray(int[] num){
		if(num.length <= 64){
			for (int k = 0;k < num.length ;k++){
				System.out.print( num[k] + " "); }
			System.out.print("\nTotal Heap Sort Count for Num" + num.length +".txt is " + count + "\n\n"); }
		
		if(num.length > 64){
			for (int k = 51;k <= 100 ;k++){
		        System.out.print( num[k] + " "); }
			System.out.print("\nTotal Heap Sort Count for Num" + num.length +".txt is " + count + "\n\n"); }
	}
}