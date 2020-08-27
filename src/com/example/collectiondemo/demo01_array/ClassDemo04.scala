package com.example.collectiondemo.demo01_array

object ClassDemo04 {

  def main(args: Array[String]): Unit = {
    val arr1 = Array(1,2,3,4,5)

    for (i <- arr1.indices){
//      println(arr1(i))
    }

    for (i <- arr1) println(i)
  }
}
