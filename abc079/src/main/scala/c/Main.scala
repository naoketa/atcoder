import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val str = sc.next
  val a = str.substring(0, 1).toInt
  val b = str.substring(1, 2).toInt
  val c = str.substring(2, 3).toInt
  val d = str.substring(3, 4).toInt
  val abcd = Seq(a, b, c, d)
  val digits = abcd.length - 1

  import scala.util.control.Breaks.{breakable,break}
  breakable {
    for (i <- 0 until 1 << digits) {
      val sb = new StringBuilder
      sb.append(abcd(0))
      var result = abcd(0)
      for (j <- 0 until digits; n = abcd(j + 1)) {
        if ((i >> j & 1) == 1) {
          sb.append('+')
          result += n
        } else {
          sb.append('-')
          result -= n
        }
        sb.append(n)
      }
      if (result == 7) {
        sb.append("=7")
        println(sb.toString)
        break
      }
    }
  }
}