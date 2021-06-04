package com.foxmula.Assignment3;
import java.util.*;

public class FreqSort {
	ArrayList<Integer> a = new ArrayList<Integer>();
	
	void push(int n) {
		a.add(n);
	}
	
	HashMap<Integer, Integer> createmap() {
		HashSet<Integer> set = new HashSet<>(a);
		
		// Storing unique numbers and their frequencies in hashmap
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i : set) {
			map.put(i, Collections.frequency(a, i));
		}
		
		return map;
	}
	
	
	public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Integer, Integer> > list =
               new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
         
        // put data from sorted list to hashmap
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
	
	public static void main(String args[]) {
		FreqSort ob = new FreqSort();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Number: ");
			int num = sc.nextInt();
			ob.push(num);
		}
		
		HashMap<Integer, Integer> hm = ob.createmap();
		HashMap<Integer, Integer> fm = ob.sortByValue(hm);
		
		for (Map.Entry<Integer, Integer> en : fm.entrySet()) {
            System.out.println("Number " + en.getKey() +
                          " was there " + en.getValue() + " times");
            }
	}
}
