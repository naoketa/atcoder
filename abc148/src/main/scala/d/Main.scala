package d

import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val n = sc.nextInt
  val as = List.fill(n)(sc.nextInt)
  val result = execute(as, 1, 0)
  println(if (result < n) result else -1)

  def execute(list: List[Int], next: Int, deleted: Int): Int = list match {
    case _ if list.isEmpty => deleted
    case _ if list.head == next => execute(list.tail, next + 1, deleted)
    case _ => execute(list.tail, next, deleted + 1)
  }
}
