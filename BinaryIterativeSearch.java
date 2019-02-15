
/* This is a class to using binary iterative to search an item in an array.
 * @author Chris Li
 */
import java.util.*;
public class BinaryIterativeSearch implements Practice03Search{
	/** @Override
	Return the name of the search*/
	public String searchName(){
		return "BinaryIterativeSearch";
	}
	/** Binary search iterative function
	 * @param arr the array of random numbers
	 * @param target the target item to be searched
	 */
	public int search(int [] arr, int target){
		int start = 0;
		int end = arr.length - 1;
		int mid = (start + end)/2;
		while(start < end){	
			if(arr[mid] < target){
				start = mid + 1;
				mid = (start + end) / 2;
			}
			else if(arr[mid] > target){
				end = mid - 1;
				mid = (start + end)/2;
			}
			else{
				return mid;
			}
		}
		return -1;
	}
}