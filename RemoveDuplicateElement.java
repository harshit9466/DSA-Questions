import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateElement {
	   
// 1. function to find duplicate  indexes of the element in the array.
	public static ArrayList<Integer> findDuplicates(int[] arr) {
	    Map<Integer,Integer> map = new HashMap<>();
	    ArrayList<Integer> duplicateindexes = new ArrayList<>();
	        for(int i=0; i<arr.length; i++)
	        {
	        	int element = arr[i];
	            map.put(element, map.getOrDefault(element,0)+1);
                 if(map.get(element) > 1)
                 {
                	 duplicateindexes.add(i);
                 }
	        }
	        return duplicateindexes;
	}

// 2. function to remove the duplicate elements from the particular indexes returned from the find duplicate method.
    public ArrayList<Integer> removeDuplicates(int arr[]){
	    	ArrayList<Integer> arra = new ArrayList<>(); // ArrayList which will be returned as the new array after removing Duplicate elements.
	    	for(int i=0; i<arr.length; i++)
	    	{
	    	arra.add(arr[i]);
	    	}
	    	//System.out.println(arra);
	    	ArrayList<Integer> ans = new ArrayList<>(findDuplicates(arr)); // ArrayList to store the duplicate elements indexes returned from find duplicate method.    
	    	//System.out.println(ans);
	    	for(int i=0; i<ans.size(); i++)
	    	{
	    		int index = ans.get(i);
	    		//System.out.println(index);
	    	    arra.remove(index-i);
	    	}
			return arra;
	    }
    
//  MAIN
   public static void main(String args[]) {
	int arr[] = {2,2,3,2,4,3,6};
	int arr1[] = {1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6};
	RemoveDuplicateElement obj = new RemoveDuplicateElement();
	//System.out.println(obj.findDuplicates(arr));
	System.out.println(obj.removeDuplicates(arr));
}
 
}
