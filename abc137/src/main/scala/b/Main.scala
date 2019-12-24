package b

import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val k, x = sc.nextInt
  val min = x - k + 1
  val max = x + k - 1
  println((min to max).mkString(" "))
}
