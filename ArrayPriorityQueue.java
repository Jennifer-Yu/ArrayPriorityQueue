//Team VIP - Mei Huang & Jennifer Yu
//APCS2 - pd 10
//HW #35: Privileged Status Gets You to the Front of the Line
//2016 - 5 - 4 
import java.util.ArrayList;

public class ArrayPriorityQueue implements PriorityQueue {

    private ArrayList<Integer> pq;   

    //add(x)
    //adds to the end of queue
    public ArrayPriorityQueue(ArrayList<Integer> x) {
	pq = x;
    }
    
    public void add(int x) {
	pq.add(x);
    }
    
 //isEmpty()
//checks if its empty
    public boolean isEmpty() {
	return (pq.size() == 0);
    }
    
//peekMin()
//traverses list to find smallest element
    public int peekMin() {
	if (pq.isEmpty()) {
	    return -1;
	}
	int champ = pq.get(0); 
	for (int x = 1; x < pq.size(); x++) {
	    if (pq.get(x) < champ) {
		champ = pq.get(x);
	    }
	}
	return champ; 
    }

//removeMin()
//traverses list to remove smallest element    
    public int removeMin() {
	if (pq.isEmpty()) { 
	    return -1; 
	}
	int champ = pq.get(0); 
	int champIndex = 0;
	for (int x = 1; x < pq.size(); x++) {
	    if (pq.get(x) < champ) {
		champIndex = x;
	    }
	}
        return pq.remove(champIndex);
    }

    public String toString() {
	String s = "["; 
	for (int a : pq) {
	    s += a + ",";
		}
	s = s.substring(0,s.length()-1); 
	s += "]";
	return s; 
    }

    public static void main(String[] args) {
	ArrayList<Integer> aL = new ArrayList<Integer>();
	ArrayPriorityQueue pueue = new ArrayPriorityQueue(aL);
	System.out.println(aL.isEmpty());
	pueue.add(1);
	System.out.println(pueue);
        System.out.println(pueue.peekMin());
	System.out.println(pueue.removeMin()); 
	pueue.add(2);
	pueue.add(10);
	System.out.println(pueue);
	System.out.println(pueue.peekMin());
	System.out.println(pueue.removeMin()); 
	pueue.add(9);
	pueue.add(3);
	System.out.println(pueue);
	System.out.println(pueue.peekMin());
	System.out.println(pueue.removeMin()); 
       	System.out.println(pueue);
	System.out.println(pueue.peekMin());
	System.out.println(pueue.removeMin()); 
       	System.out.println(pueue);
	System.out.println(aL.isEmpty());
	System.out.println(pueue.peekMin());
	System.out.println(pueue.removeMin()); 
	System.out.println(aL.isEmpty());
	pueue.add(5);
	pueue.add(2);
	pueue.add(6);
	System.out.println(pueue.peekMin());
	System.out.println(pueue.removeMin()); 
	
}

   
}
