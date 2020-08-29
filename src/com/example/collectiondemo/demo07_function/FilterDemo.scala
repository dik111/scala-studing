package com.example.collectiondemo.demo07_function

// 案例: 演示过滤(filter)
object FilterDemo {

  def main(args: Array[String]): Unit = {
    val list1 = (1 to 9).toList
//    println(list1)

    val list2 = list1.filter(_%2 ==0)
    println(list2)
  }
}
