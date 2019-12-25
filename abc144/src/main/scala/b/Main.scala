package b

import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val n = sc.nextLong
  val answer = if ((1 to 9).filter(n % _ == 0).exists(n / _ < 10)) "Yes" else "No"
  println(answer)
}
