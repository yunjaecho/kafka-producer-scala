package com.yunjae.producer

object Main extends App {
  val scanner = new java.util.Scanner(System.in)
  print("brokers : ")
  val brokers = scanner.nextLine()
  print("topic : ")
  val topic = scanner.nextLine()

  val producer = new Producer(brokers = brokers, topic = topic)
  producer.sendMessages()
}
