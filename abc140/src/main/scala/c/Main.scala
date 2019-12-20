package c

import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val n = sc.nextInt
  val array = Array.fill(n - 1)(sc.nextLong)
  val ai = if (n > 2) {
    array
      .sliding(2)
      .map(b => Math.min(b(0), b(1)))
      .sum
  } else 0

  println(array(0) + array(n - 2) + ai)
}
