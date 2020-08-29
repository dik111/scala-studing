package com.example.collectiondemo.demo03_list

object ClassDemo05 {

  def main(args: Array[String]): Unit = {
//    1. 定义一个列表, 该列表有三个元素, 分别为：List(1,2)、List(3)、List(4,5)
    var list1 =List(List(1,2),List(3),List(4,5))
//    2. 使用flatten将这个列表转换为List(1,2,3,4,5)
    val list2 = list1.flatten
//    3. 打印结果.
    println(list1)
    println(list2)

  }

}
