import java.util.ArrayList;

public class ArrayPriorityQueue implements PriorityQueue {

//1st method
    
//add(x)
//adds to the end of queue

//isEmpty()
//checks if its empty

//peekMin()
//traverses list to find smallest element

//removeMin()
//traverses list to remove smallest element


    private ArrayList<Integer> pq;

    public ArrayPriorityQueue(ArrayList<Integer> x) {
	pq = x;
    }

    public void add(int x) {
	pq.add(x);
    }
    
    public boolean isEmpty() {
	return (pq.size() == 0);
    }

    public int peekMin() {
	if (pq.isEmpty()) {
	    return -1;
	}
	int champ = 0;
	for (int x = 0; x < pq.size(); x++) {
	    if (pq.get(x) < champ) {
		champ = pq.get(x);
	    }
	}
	return champ;
    }

    public int removeMin() {
	if (pq.isEmpty()) { 
	    return -1; 
	} 
	int champ = 0;
	for (int x = 0; x < pq.size(); x++) {
	    if (pq.get(x) < champ) {
		champ = pq.get(x);
	    }
	}
	return champ;


}
