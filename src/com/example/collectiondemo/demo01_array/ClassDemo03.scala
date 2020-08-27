package com.example.collectiondemo.demo01_array

import scala.collection.mutable.ArrayBuffer

object ClassDemo03 {

  def main(args: Array[String]): Unit = {
//    1. 定义一个变长数组，包含以下元素: "hadoop", "spark", "flink"
    val arr1 = ArrayBuffer("hadoop", "spark", "flink")
//    2. 往该变长数组中添加一个"flume"元素
    arr1 += "flume"
//    3. 从该变长数组中删除"hadoop"元素
    arr1 -= "hadoop"
//    4. 将一个包含"hive", "sqoop"元素的数组, 追加到变长数组中.
    arr1 ++= Array("hive", "sqoop")
//    5. 从该变长数组中删除"sqoop", "spark"这两个元素.
    arr1 --= Array("sqoop", "spark")
//    6. 打印数组, 查看结果.
    println(arr1)
  }

}
