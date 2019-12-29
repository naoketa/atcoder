package b

import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val a, b, k = sc.nextLong
  val notEnough = (a - k) >= 0
  val ta = if (notEnough) a - k else 0
  val ans1 = if(ta > 0) ta else 0
  val ao = if (notEnough) b else b - (k - a)
  val ans2 = if(ao > 0) ao else 0
  println(ans1 + " " + ans2)
}
