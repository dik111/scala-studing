package com.example.collectiondemo.demo07_function

// 案例: 演示分组函数(groupBy)
object GroupbyDemo {
  def main(args: Array[String]): Unit = {
    //1. 有一个列表，包含了学生的姓名和性别: "刘德华" -> "男", "刘亦菲" -> "女", "胡歌" -> "男"
    val list1 = List("刘德华" -> "男", "刘亦菲" -> "女", "胡歌" -> "男")

    //2. 请按照性别进行分组.
//    val map1 = list1.groupBy(x => x._2)
    val map1 = list1.groupBy(_._2)
//    println(map1)
//
    val map2 = map1.map(x => x._1 -> x._2.size)
    println(map2)
  }
}
