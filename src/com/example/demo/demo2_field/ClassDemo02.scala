package com.example.demo.demo2_field

// 演示在类中如何定义成员变量
object ClassDemo02 {

  class Person {
    // 姓名
    var name = ""
    // 年龄
    var age = 0
  }

  def main(args: Array[String]): Unit = {

    val person = new Person

    person.name = "张三"

    person.age = 23

    println(person.name,person.age)
  }

}
