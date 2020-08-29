package com.example.collectiondemo.demo07_function
// 演示聚合计算
object ReduceDemo {

  def main(args: Array[String]): Unit = {
//    1. 定义一个列表，包含以下元素：1,2,3,4,5,6,7,8,9,10
    val list1 = (1 to 10 ).toList
//    2. 使用reduce计算所有元素的和
    val list2 = list1.reduce( _+_)

  }
}
