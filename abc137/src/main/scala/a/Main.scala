package a

import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val a, b = sc.nextInt
  val x = Math.max(a + b, a - b)
  val y = Math.max(x, a * b)
  println(y)
}
