package c

import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val x = sc.nextInt
  println(if(x == 2)2 else nextPrime(x))

  def isPrime(n: Int): Boolean = (2 to math.sqrt(n).toInt).forall(n % _ != 0)

  @scala.annotation.tailrec
  def nextPrime(n: Int): Int = if (isPrime(n)) n else nextPrime(n + 1)
}
