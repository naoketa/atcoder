package c

import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val n = sc.nextLong
  val max: (Long,Long,Long) = (1L to n / 2L)
    .collect { case i if n % i == 0 => (i, n / i, i + n / i) }
    .minBy(_._3)
  val answer = max._1 + max._2 - 2
  println(answer)
}
