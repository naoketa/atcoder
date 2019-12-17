package c

import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val n = sc.nextDouble
  val points: Array[(Double, Double)] = Array.fill(n.toInt)((sc.nextDouble, sc.nextDouble))
  val sum: Double = points.permutations.map(a => a.sliding(2).map(p => Math.sqrt(Math.pow(p(1)._2 - p(0)._2, 2) + Math.pow(p(1)._1 - p(0)._1, 2))).sum).sum
  println(sum / points.permutations.size)
}