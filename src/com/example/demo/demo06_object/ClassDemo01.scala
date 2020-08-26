package com.example.demo.demo06_object


// 演示如何创建单利对象
object ClassDemo01 {

  object Dog{
    val leg_num = 4
  }

  def main(args: Array[String]): Unit = {
    println(Dog.leg_num)
  }

}
