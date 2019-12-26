package a

import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val a = sc.nextInt
  val s = sc.next
  println(if (a < 3200) "red" else s)
}
