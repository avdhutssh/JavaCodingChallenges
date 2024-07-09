package Java.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class _64_Heap_Kth_Smallest {

	private static class Heap {
		private List<Integer> heap;

		public Heap() {
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

		private void sinkDown(int index) {
			int maxIndex = index;
			while (true) {
				int leftIndex = leftChild(index);
				int rightIndex = rightChild(index);

				if (leftIndex < heap.size() && heap.get(leftIndex) > heap.get(maxIndex)) {
					maxIndex = leftIndex;
				}

				if (rightIndex < heap.size() && heap.get(rightIndex) > heap.get(maxIndex)) {
					maxIndex = rightIndex;
				}

				if (maxIndex != index) {
					swap(index, maxIndex);
					index = maxIndex;
				} else {
					return;
				}
			}
		}

		public Integer remove() {
			if (heap.size() == 0) {
				return null;
			}

			if (heap.size() == 1) {
				return heap.remove(0);
			}

			int maxValue = heap.get(0);
			heap.set(0, heap.remove(heap.size() - 1));
			sinkDown(0);

			return maxValue;
		}
	}

	public static int findKthSmallest(int[] nums, int k) {
		Heap maxHeap = new Heap();
		for (int num : nums) {
			maxHeap.insert(num);
			if (maxHeap.getHeap().size() > k) {
				maxHeap.remove();
			}
		}
		return maxHeap.remove();
	}

	public static void main(String[] args) {
		// Test case 1
		int[] nums1 = { 7, 10, 4, 3, 20, 15 };
		int k1 = 3;
		System.out.println("Test case 1:");
		System.out.println("Expected output: 7");
		System.out.println("Actual output: " + findKthSmallest(nums1, k1));
		System.out.println();

		// Test case 2
		int[] nums2 = { 2, 1, 3, 5, 6, 4 };
		int k2 = 2;
		System.out.println("Test case 2:");
		System.out.println("Expected output: 2");
		System.out.println("Actual output: " + findKthSmallest(nums2, k2));
		System.out.println();

		// Test case 3
		int[] nums3 = { 9, 3, 2, 11, 7, 10, 4, 5 };
		int k3 = 5;
		System.out.println("Test case 3:");
		System.out.println("Expected output: 7");
		System.out.println("Actual output: " + findKthSmallest(nums3, k3));
		System.out.println();
	}
}
