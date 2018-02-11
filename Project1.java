// Name: Iwan Siauw
// Subject: Cs323 Project 1
// Term: Fall 2017
// Professor: Dr.Changhe Yuan

import java.lang.Math;

public class Project1 {
	
	public static void main(String[] args) {	
	reader getNum = new reader();
	
	for (int exp = 3; exp <= 14; exp++){
		int Num = (int) Math.pow(2,exp);
		ISort I = new ISort();
		I.InsertionSort(getNum.textreader(Num)); } 
	
	for (int exp = 3; exp <= 14; exp++){
		int Num = (int) Math.pow(2,exp);
		MSort M = new MSort();
		M.MSortApp(getNum.textreader(Num)); } 
	
	for (int exp = 3; exp <= 14; exp++){
		int Num = (int) Math.pow(2,exp);
		HSort H = new HSort();
		H.HeapSort(getNum.textreader(Num)); } 
	
	for (int exp = 3; exp <= 14; exp++){
		int Num = (int) Math.pow(2,exp);
		QSort Q = new QSort();
		Q.QuickSortApp(getNum.textreader(Num)); } 
	}
}
