package c

import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val n = sc.nextInt
  val vs: List[Double] = List.fill(n)(sc.nextDouble)
  val sorted: List[Double] = vs.sorted
  val result = sorted.tail.foldLeft(sorted.head)((v1, v2) => (v1 + v2) / 2)
  println(result)
}
