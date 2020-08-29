package com.example.collectiondemo.demo07_function

//  简化函数定义
object SimplifyDefineFunctionDemo {
  def main(args: Array[String]): Unit = {
    val list1 = List(1,2,3,4)
//    1. 有一个列表，包含元素1,2,3,4，请使用foreach方法遍历打印每个元素.
    list1.foreach((x:Int) =>{
      println(x)
    })
//    2. 使用类型推断来简化函数定义.
    list1.foreach(x => println(x))
//    3. 使用下划线来简化函数定义
    list1.foreach(println(_))
  }
}
