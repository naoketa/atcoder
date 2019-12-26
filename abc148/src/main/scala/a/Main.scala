package a

import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val a, b = sc.nextInt
  (1 to 3).filter(n => n != a && n != b).foreach(println)
}
