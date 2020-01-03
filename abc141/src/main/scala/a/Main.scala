package a

import java.util.Scanner

import scala.collection.mutable

object Main extends App {
  val sc = new Scanner(System.in)
  val n = sc.nextInt
  val k = sc.nextLong
  val q = sc.nextInt
  var map = mutable.Map.empty[Int, Int]
  (1 to q).foreach(_ => {
    val i = sc.nextInt
    if (map.contains(i)) {
      map.update(i, map(i) + 1)
    } else {
      map.update(i, 1)
    }
  })

  (1 to n).map(i => k - q + map.getOrElse(i, 0) > 0)
    .foreach(isOk => {
      if (isOk) {
        println("Yes")
      } else {
        println("No")
      }
    })

}
