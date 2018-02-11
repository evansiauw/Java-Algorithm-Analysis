
public class QSort {
	int count;
	
	public void QuickSortApp(int []num){
		count = 0;
		QuickSort(num,0,num.length-1);
		printSortedArray(num);
		}
	
	
	public void QuickSort(int []num, int p, int r){
		if (p < r){
			int q = Partition(num, p, r);
			QuickSort(num, p, q);
			QuickSort(num,q + 1, r);
		}
	}
		
	public int Partition(int []num, int p, int r){
		int x = num[r];
		int i = p-1;
		
		for(int j = p;j < r; j++){
			count++;
			
			if(num[j] <= x){
				i++; 
				int temp = num[i];
				num[i] = num[j];
				num[j] = temp;
			}
			
		}
		int temp = num[i+1];
		num[i+1] = num[r];
		num [r] = temp;
		return i++;
		}
	
	public void printSortedArray(int[] num){
		if(num.length <= 64){
			for (int k = 0;k < num.length ;k++){
				System.out.print( num[k] + " "); }
			System.out.print("\nTotal Quick Sort Count for Num" + num.length +".txt is " + count + "\n\n"); }
		
		if(num.length > 64){
			for (int k = 51;k <= 100 ;k++){
		        System.out.print( num[k] + " "); }
			System.out.print("\nTotal Quick Sort Count for Num" + num.length +".txt is " + count + "\n\n"); }
	}
	
	
}
