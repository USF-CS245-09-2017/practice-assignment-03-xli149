/* This is a class to using binary recursive to search an item in an array.
 * @author Chris Li
 */

import java.util.*;
public class BinaryRecursiveSearch implements Practice03Search{
	/** @Override
	Return the name of the search*/
	public String searchName(){
		return "BinaryRecursiveSearch";
	}
	/** @Override
	 * This function calls the overloaded search function
	 * @param arr the array of random numbers
	 * @param target the target item to be searched
	 */
	public int search(int [] arr, int target){
		int index = search(arr, target, 0, arr.length -1);
		return 0;	
	}
	/** @Overload
	 * Binary search recursive function
	 * @param arr the array of random numbers
	 * @param target the target item to be searched
	 */
	public int search(int[] arr, int target, int start, int end){
		int mid = (start + end)/2;
		if(start > end){
			return - 1;
		}
		if(arr[mid] < target)
			search(arr, target, start, mid - 1);
		else if(arr[mid] > target)
			search(arr, target, mid + 1, end);
		else
			return mid;
		return -1;	
	} 
}