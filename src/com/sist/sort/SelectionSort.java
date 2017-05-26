package com.sist.sort;

/**
 * Created by SIST on 2017-05-26.
 */


class Sort{
    public void selectionSort(int a[]){
        int i,j,min;
        for(i=0; i<a.length-1;i++){
            min=i;
            for(j=i+1;j<a.length;j++){
                if(a[j]<a[min])
                    min=j;
            }

            swap(a,min,i);
            System.out.printf("\n선택 정렬 %d 단계 :", i+1);
            for(j=0;j<a.length;j++){
                System.out.printf("%3d ",a[j]);
            }
        }
    }

    public void swap(int a[], int i, int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}

public class SelectionSort {
    public static void main(String[] args) {
        int a[] = {69, 10, 30, 2, 16, 8, 31, 22};
        Sort sort = new Sort();

        System.out.printf("\n정렬전 숫자 배열 원소 :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.printf("\n첫번째 정렬할 원소 :");

        System.out.printf(" %d", a[0]);
        System.out.println();
        sort.selectionSort(a);

    }
}
