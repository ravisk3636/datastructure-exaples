package com.ds.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BinarySearch_java8 {
	
	public static boolean binarySearchIterative(List<Integer> arrList, int key, int low, int high) {
		int mid;
		while(low <= high) {
			// calculate mid
			mid = (low+high)/2;
			// compare key with mid value
			if(arrList.get(mid)==key) {
				System.out.println("Key at MID" + mid);
				return true;
			}else if(key < arrList.get(mid)) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// create numeric list
		List<Integer> arrayList = Arrays.asList(1,10,55,66,68,85,101,110,125,179,201,356,1000);
		// get key from keyboard
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Key to Search ::");
		String keyString = scan.nextLine();
		Integer key = Integer.parseInt(keyString);
	
		// sort the list
		arrayList.sort(Integer::compareTo);
		
		int low = 0;
		int high = arrayList.size()-1;
		
		boolean found = binarySearchIterative(arrayList,key,low,high);
		if(found) {
			System.out.println("The found Hurray!!!" + key);
		}else {
			System.out.println("ANNA Illa" + key);
		}
		scan.close();
	}
}
