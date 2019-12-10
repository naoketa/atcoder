package b

import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val s = sc.next
  val former = s.take(s.length / 2)
  val latter = s.takeRight(s.length / 2).reverse
  println(former.zip(latter).count(t => t._1 != t._2))
}
