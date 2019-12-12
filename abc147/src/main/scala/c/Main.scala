import java.util.Scanner

object Main extends App {

  val sc = new Scanner(System.in)
  val n = sc.nextInt
  val input: Array[Map[Int, Int]] = Array.fill(n) {
    Array.fill(sc.nextInt)(sc.nextInt - 1, sc.nextInt).toMap
  }

  var result = 0
  for (i <- 0 until (1 << n)) {
    val c = f"${i.toBinaryString.toInt}%03d".reverse
    println(c)
    var isValid = true
    import scala.util.control.Breaks.{break, breakable}
    breakable {
      for (j <- 0 until n) {
        print("j人目:" + j)
        if (((i >> j) & 1) == 1) {
          println(":親切1")
          val ok = input(j).forall { pair => {
            println("c:"+c(pair._1))
            println("2:"+pair._2)
            c(pair._1).asDigit == pair._2 }
          }
          println(ok)
          if (!ok) {
            isValid = false
            break
          }
        } else {
          println(":不親切0")
        }
      }
    }
    if (isValid) {
      result = Math.max(result, c.count(c => c.equals('1')))
    }

  }

  println(result)
}
