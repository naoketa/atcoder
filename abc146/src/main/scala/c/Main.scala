package c

import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val a, b, x = sc.nextLong

  println(binarySearch(0L, 1000000001L))

  def binarySearch(start: Long, end: Long): Long = {
    if (end - start <= 1) {
      start
    } else {
      val middle: Long = start + (end - start) / 2
      val num = a * middle + b * middle.toString.length
      if (num == x) {
        middle
      } else if (num > x) {
        binarySearch(start, middle)
      } else {
        binarySearch(middle, end)
      }
    }
  }
}
