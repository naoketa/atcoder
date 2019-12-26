package b

import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val n = sc.nextInt
  val s, t = sc.next
  println(s.zip(t).map(c => c._1.toString + c._2.toString).mkString)
}
