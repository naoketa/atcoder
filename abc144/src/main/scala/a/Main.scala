package a

import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val a, b = sc.nextLong
  val answer = if (a > 9 || b > 9) -1 else a * b
  println(answer)
}
