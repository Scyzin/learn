//选择排序
public class SelectionSort {
	double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
	
	public static void SelectionSort(double[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			//寻找list数组中最小的元素
			double currentMin = list[i];
			int currentMinIndex = i;
			
			for(int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			//如果必要，交换list i 和最小的list index
			if (currentMinIndex != i ) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
		
	}
	SelectionSort.selectionSort(list);
}
