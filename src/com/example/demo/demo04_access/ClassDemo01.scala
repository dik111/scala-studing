package com.example.demo.demo04_access

// 演示访问权限修饰符：private，默认
object ClassDemo01 {

  class Person {
    private var name:String = _

    private var age = 0

    def getName() :String = name

    def setName(name:String) = this.name = name

    def getAge() = age

    def setAge(age:Int) = this.age = age

    private def sayHello() = println("Hello scala")
  }

  def main(args: Array[String]): Unit = {
    val person = new Person

    person.setName("张三")
    person.setAge(23)

    println(person.getName(),person.getAge())

  }
}
