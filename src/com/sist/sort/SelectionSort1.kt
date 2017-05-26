package com.sist.sort

/**
 * Created by SIST on 2017-05-26.
 */


internal class Sort1 {
    fun selectionSort(a: IntArray) {
        var i: Int
        var j: Int
        var min: Int
        i = 0
        while (i < a.size - 1) {
            min = i
            j = i + 1
            while (j < a.size) {
                if (a[j] < a[min])
                    min = j
                j++
            }

            swap(a, min, i)
            System.out.printf("\n선택 정렬 %d 단계 :", i + 1)
            j = 0
            while (j < a.size) {
                System.out.printf("%3d ", a[j])
                j++
            }
            i++
        }
    }

    fun swap(a: IntArray, i: Int, j: Int) {
        val temp = a[i]
        a[i] = a[j]
        a[j] = temp
    }
}

object SelectionSort1 {
    @JvmStatic fun main(args: Array<String>) {
        val a = intArrayOf(69, 10, 30, 2, 16, 8, 31, 22)
        val sort1 = Sort1()

        System.out.printf("\n정렬전 숫자 배열 원소 :")
        for (i in a.indices) {
            print(a[i].toString() + " ")
        }

        println()
        System.out.printf("\n첫번째 정렬할 원소 :")

        System.out.printf(" %d", a[0])
        println()
        sort1.selectionSort(a)

    }
}
