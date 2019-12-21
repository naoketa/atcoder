package c

import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val n = sc.nextInt
  val hs = List.fill(n)(sc.nextLong)

  val max = execute(hs.head, hs.tail, 0, 0)
  println(max)

  @scala.annotation.tailrec
  def execute(target: Long, remains: List[Long], accum: Int, max: Int): Long =
    remains match {
      case Nil => max
      case _ if target >= remains.head => execute(remains.head, remains.tail, accum + 1, Math.max(accum + 1, max))
      case _ => execute(remains.head, remains.tail, 0, max)
    }
}
