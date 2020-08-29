package com.example.collectiondemo.demo07_function

//演示映射扁平化(flatMap)
object FlatMapDemo {

  def main(args: Array[String]): Unit = {
//    1. 有一个包含了若干个文本行的列表："hadoop hive spark flink flume", "kudu hbase sqoop storm"
    val list1 = List("hadoop hive spark flink flume", "kudu hbase sqoop storm")
//    2. 获取到文本行中的每一个单词，并将每一个单词都放到列表中.

    //方式一: 通过map, flatten实现.
    val list2 = list1.map((x:String) => {x.split(" ")})
    val list3 = list2.flatten
    println(list3)

    //方式二: 通过flatMap实现.
//    val list4 = list1.flatMap((x:String) => {x.split(" ")})
//    val list4 = list1.flatMap(x => x.split(" "))
    val list4 = list1.flatMap(_.split(" "))
    println(list4)
  }
}
