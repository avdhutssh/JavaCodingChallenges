package Java.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class _60_Heap_Insert {

	private List<Integer> heap;

	public _60_Heap_Insert() {
	        this.heap = new ArrayList<>();
	    }

	public List<Integer> getHeap() {
		return new ArrayList<>(heap);
	}

	private int leftChild(int index) {
		return 2 * index + 1;
	}

	private int rightChild(int index) {
		return 2 * index + 2;
	}

	private int parent(int index) {
		return (index - 1) / 2;
	}

	private void swap(int index1, int index2) {
		int temp = heap.get(index1);
		heap.set(index1, heap.get(index2));
		heap.set(index2, temp);
	}

	public void insert(int value) {
		heap.add(value);
		int current = heap.size() - 1;

		while (current > 0 && heap.get(current) > heap.get(parent(current))) {
			swap(current, parent(current));
			current = parent(current);
		}
	}

	public static void main(String[] args) {
		_60_Heap_Insert myHeap = new _60_Heap_Insert();
		System.out.println(myHeap.getHeap());
        myHeap.insert(95);
        myHeap.insert(75);
        myHeap.insert(80);
        System.out.println(myHeap.getHeap());
        myHeap.insert(55);
        myHeap.insert(60);
        myHeap.insert(50);
        System.out.println(myHeap.getHeap());
        myHeap.insert(65);

        System.out.println(myHeap.getHeap());

	}

}
