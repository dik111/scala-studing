package com.example.collectiondemo.demo07_function

// 案例: 演示默认排序(sorted)
object SortedDemo {

  def main(args: Array[String]): Unit = {
//    1. 定义一个列表，包含以下元素: 3, 1, 2, 9, 7
    val list1 = List(3, 1, 2, 9, 7)
//    2. 对列表进行升序排序
    val list2 = list1.sorted
//    3. 对列表进行降序排列.
    val list3 = list2.reverse
    println(list3)
  }

}
