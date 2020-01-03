package a

import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val today = sc.next
  val tomorrow = today match {
    case "Sunny" => "Cloudy"
    case "Cloudy" => "Rainy"
    case "Rainy" => "Sunny"
  }
  println(tomorrow)

}
