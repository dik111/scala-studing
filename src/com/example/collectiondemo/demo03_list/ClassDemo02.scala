package com.example.collectiondemo.demo03_list

import scala.collection.mutable.ListBuffer

object ClassDemo02 {

  def main(args: Array[String]): Unit = {
    val list1 = ListBuffer[Int]()

    val list2 = ListBuffer(1,2,3,4)

    println(s"list1:$list1")
    println(s"list2:$list2")
  }

}
