package com.example.demo.demo03_method

// 演示如何在类中定义成员方法
object ClassDemo01 {

  class Customer {

    // 姓名
    var name:String = _

    // 性别
    var sex = ""

    // 定义成员方法
//    def printHello(msg:String): Unit = {
//      println(msg)
//    }

    def printHello(msg:String) = println(msg)
  }

  def main(args: Array[String]): Unit = {
    val c = new Customer

    c.name = "张三"

    c.sex = "男"

    c.printHello("Hello,Scala")
  }

}
