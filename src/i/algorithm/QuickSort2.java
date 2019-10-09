package i.algorithm;

public class QuickSort2 {

	public static void sort(int[] a, int low, int high) {
		if (low < high) {
			int index = Quicksort2(a, low, high);
			sort(a, low, index - 1);
			sort(a, index+1, high);
		}

	}

	public static int Quicksort2(int[] a, int low, int high) {
		int temp = a[low];
		
		int m = low;
		for (int i = low + 1; i <= high; i++) {
			if (a[i] < temp) {
				low++;
				swap(a,low, i);
			}
		}
		swap(a,low, m);
		return low;
	}

	public static void swap(int [] a,int a1, int a2) {
		int temp;							//java��֧����ͨ���͵����ô���,���Խ���ֵֻ��ͨ�����齻��
		temp = a[a1];
		a[a1] = a[a2];
		a[a2] = temp;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 9, 1, 7, 6, 88 };
		sort(a, 0, 4);
		for (int i : a) {
			System.out.println(i);
		}

	}

}
