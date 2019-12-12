import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val s = sc.next
  val week = Seq("SAT", "FRI", "THU", "WED", "TUE", "MON", "SUN")
  println(week.indexOf(s) + 1)
}