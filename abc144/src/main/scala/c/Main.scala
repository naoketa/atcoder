package c

import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val n = sc.nextLong
  val answer = (1L to Math.sqrt(n).toLong)
    .collect { case i if n % i == 0 => i + n / i - 2 }
    .min
  println(answer)
}
