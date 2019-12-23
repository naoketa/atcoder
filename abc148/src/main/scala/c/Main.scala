package c

import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val a, b = sc.nextLong
  println(lcm(a, b))

  def lcm(a: Long, b: Long): Long = {
    if (a == 0 || b == 0) 0 else (a * b) / gcd(a, b)
  }

  def gcd(a: Long, b: Long): Long = {
    if (b == 0) a else gcd(b, (a % b))
  }
}
