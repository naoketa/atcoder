package c

import java.util.Scanner

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Main extends App {
  val sc = new Scanner(System.in)
  val r, c = sc.nextInt
  val sy, sx, gy, gx = sc.nextInt - 1
  val maze: Array[Array[Char]] = Array.fill(r)(sc.next.toCharArray)

  var distance: ArrayBuffer[ArrayBuffer[Int]] =
    mutable.ArrayBuffer.fill(r)(ArrayBuffer.fill(c)(-1))
  var queue: mutable.Queue[(Int, Int)] = mutable.Queue.empty

  val directions: Seq[(Int, Int)] = List((1, 0), (-1, 0), (0, 1), (0, -1))

  val start: (Int, Int) = (sx, sx)
  queue += start

  distance(sy)(sx) = 0

  while (queue.nonEmpty) {
    val previous = queue.dequeue()
    val next: Seq[(Int, Int)] = directions
      .map(d => (d._1 + previous._1, d._2 + previous._2))
      .filter(p => p._1 >= 0 && p._1 < r - 1 && p._2 >= 0 && p._2 < c - 1)
      .filter(p => maze(p._1)(p._2) != '#')
      .filter(p => distance(p._1)(p._2) == -1)
    next.foreach(p => distance(p._1)(p._2) = distance(previous._1)(previous._2) + 1)
    queue ++= next
  }

  println(distance(gy)(gx))

}
