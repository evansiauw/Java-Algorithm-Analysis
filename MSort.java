public class MSort {

	int count = 0;
	public void MSortApp(int []num){
		int p = 0;
		int r = num.length - 1;
		MergeSort(num, p, r);
		printSortedArray(num);
	}
	
	public void MergeSort(int []num, int p, int r){
	
	if (p < r) {
		int q = (p + r) / 2;
		MergeSort(num, p, q);
		MergeSort(num, q + 1, r);
		Merge(num, p, q, r); }
	}

	public void Merge(int []num, int p, int q, int r){
		int n1 = (q-p) + 2;
		int n2 = (r-q) + 1;
		int []L = new int [n1];
		int []R = new int [n2];
		
		for(int i = 0; i < n1-1; i++){
			L[i] = num[(p + i)];
		}
		
		for(int j = 0; j < n2-1; j++){
			R[j] = num [(q + 1 + j)];
		}
		
		L[n1-1] = Integer.MAX_VALUE;
		R[n2-1] = Integer.MAX_VALUE;
		
		int i = 0;
		int j = 0;
		
		for (int k = p; k < r+1; k++){
			count++;
			if (L[i] <= R[j]){
				num[k] = L[i];
				i++; }
			else {
				num[k] = R[j];
				j++; }
		}
	}
	
	public void printSortedArray(int[] num){
		if(num.length <= 64){
			for (int k = 0;k < num.length ;k++){
				System.out.print( num[k] + " "); }
			System.out.print("\nTotal Merge Sort Count for Num" + num.length +".txt is " + count + "\n\n"); }
		
		if(num.length > 64){
			for (int k = 51;k <= 100 ;k++){
		        System.out.print( num[k] + " "); }
			System.out.print("\nTotal Merge Sort Count for Num" + num.length +".txt is " + count + "\n\n"); }
	}
}

