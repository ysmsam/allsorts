/**
 * 
 */
package allsorts;

import java.util.Arrays;

/**
 * @author Sheng Ming Yan
 *
 */
public class sorts {
	
//	public <T> void bubbleSort(Comparable<T>[] array) {
	public double[] bubbleSort(double[] array) {

		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-i-1;j++) {
				double min;
				if(array[j]<array[j+1]) {
					min=array[j];
					array[j]=array[j+1];
					array[j+1]=min;
				}
			}
		}
		return array;
		
	}
	
	public double[] selectionSort(double[] array) {
		
		double max=0;
		int index=0;
		for(int i=0;i<array.length;i++) {
			max=array[i];
			index=i;
			for(int j=i;j<array.length;j++) {
				if(array[j]>max) {
					max=array[j];
					index=j;
				}
			}
			array[index]=array[i];
			array[i]=max;
		}
		
		// another way of selection sort:
//		for(int i=0;i<array.length-1;i++) {
//			for(int j=i+1;j<array.length;j++) {
//				int m;
//				if(array[j]<array[i]) { 
//					m=array[i];
//					array[i]=array[j];
//					array[j]=m;
//					}
//			}
		
		return array;
		
	}
	

	
	public double[] insertionSort(double[] array) {

		for(int i=1;i<array.length-1;i++) {
			for(int j=i;j>0;j--) {
				double temp;
				if(array[j]>array[j-1]) {
					temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
			}

		}
		return array;
	}
	
class QuickSort {

    public double[] pivotSort(double[] array) {
        // copy array
        double[] arr = Arrays.copyOf(array, array.length);

        return quickSort(arr, 0, arr.length - 1);
    }

    private double[] quickSort(double[] arr, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(arr, left, right);
            quickSort(arr, left, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, right);
        }
        return arr;
    }

    private int partition(double[] arr, int left, int right) {
        // setup pivot
        int pivot = left;
        int index = pivot + 1;
        for (int i = index; i <= right; i++) {
            if (arr[i] < arr[pivot]) {
                swap(arr, i, index);
                index++;
            }
        }
        swap(arr, pivot, index - 1);
        return index - 1;
    }

    private void swap(double[] arr, int i, int j) {
    	double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
	
	
	// for testing
	public static void main(String[] args) {
		double[] x = {2,1,3,5,4,6.6,7,3.5,2,8,6,9,0};
		
		sorts sorts = new sorts();
		
		//test bubble sort
//		double[] y = sorts.bubbleSort(x);
//		for(int i=0;i<y.length;i++) {
//			System.out.print(y[i]+" ");
//		}

		//test selection sort
//		double[] y = sorts.selectionSort(x);
//		for(int i=0;i<y.length;i++) {
//			System.out.print(y[i]+" ");
//		}
		
		//test insertion sort
//		double[] y = sorts.insertionSort(x);
//		for(int i=0;i<y.length;i++) {
//			System.out.print(y[i]+" ");
//		}
		
		

	}

}


