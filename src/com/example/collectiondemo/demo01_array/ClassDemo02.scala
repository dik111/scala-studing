package com.example.collectiondemo.demo01_array

import scala.collection.mutable.ArrayBuffer

object ClassDemo02 {

  def main(args: Array[String]): Unit = {
    val arr1 = ArrayBuffer[Int]()

    val arr2 = ArrayBuffer("hadoop", "storm", "spark")

    println("arr1 "+arr1)
    println("arr2 "+arr2)
  }
}
