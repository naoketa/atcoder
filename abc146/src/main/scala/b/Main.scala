package b

import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val n = sc.nextInt
  val s = sc.next

  val ans = s.map(c => ((c + n - 'A') % 26 + 'A').toChar)

  println(ans)
}
