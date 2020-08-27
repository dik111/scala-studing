package com.example.collectiondemo.demo01_array

object ClassDemo01 {

  def main(args: Array[String]): Unit = {

    var  arr1 = new Array[Int](10)

    arr1(0) = 11

    println(arr1(0))

    val arr2 = Array("java","scala","python")

    println(arr2.size)
  }

}
