/* This is a class to using linear search to search an item in an array.
 * @author Chris Li
 */
import java.util.*;
public class LinearSearch implements Practice03Search{
	/** @Override
	Return the name of the search*/
	public String searchName(){
		return "LinearSearch";
	}
	/** @Overload
	 * Linear search function
	 * @param arr the array of random numbers
	 * @param target the target item to be searched
	 */
	public int search(int [] arr, int target){
		for(int i = 0; i < arr.length; i++){
			if(target == arr[i]){
				return i;
			}
		}
		return -1;
	}
}