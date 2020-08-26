package com.example.demo.demo06_object


// 演示如何在单例对象中定义成员方法
object ClassDemo02 {

  object PrintUtil{
    def printSpliter(): Unit ={
      println("-" * 15)
    }
  }

  def main(args: Array[String]): Unit = {
    PrintUtil.printSpliter()
  }
}
