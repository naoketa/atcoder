package b

import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val n = sc.nextInt
  val as = List.fill(n)(sc.nextInt)
  println(1d / as.map(1d / _).sum)
}
