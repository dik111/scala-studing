package com.example.collectiondemo.demo02_tuple

object ClassDemo02 {

  def main(args: Array[String]): Unit = {
    val tuple1 = "zhangsan" -> "male"

    println(tuple1._1)
    println(tuple1._2)

    println(s"姓名:${tuple1._1},性别：${tuple1._2}")

    val iterator = tuple1.productIterator
    for (elem <- iterator) {
      println(elem)
    }
  }
}
