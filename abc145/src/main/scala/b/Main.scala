package b

import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val n = sc.nextInt
  val s = sc.next

  val result = if (s.substring(0, n / 2).equals(s.substring(n / 2))) "Yes" else "No"

  println(result)

}