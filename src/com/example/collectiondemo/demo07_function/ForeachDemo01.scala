package com.example.collectiondemo.demo07_function

object ForeachDemo01 {
  // 演示foreach函数
  def main(args: Array[String]): Unit = {
    // 有一个列表，包含以下元素1,2,3,4，请使用foreach方法遍历打印每个元素
    val list1 = List(1,2,3,4)

    list1.foreach(x => println(x))

  }
}
