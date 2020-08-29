package com.example.collectiondemo.demo07_function

//演示map函数映射
object MapDemo {

  def main(args: Array[String]): Unit = {
//    1. 创建一个列表，包含元素1,2,3,4
    val list1 = List(1,2,3,4)
//    2. 将上述的数字转换成对应个数的 * , 即: 1变为*, 2变为**, 以此类推
    // 普通方式
    val list2 = list1.map((x:Int) => {"*" * x})
    println(list2)
    // 类型推断
    val list3 = list1.map(x => "*"*x)
    println(list3)
    // 下划线
    val list4 = list1.map("*"*_)
    println(list4)
  }

}
