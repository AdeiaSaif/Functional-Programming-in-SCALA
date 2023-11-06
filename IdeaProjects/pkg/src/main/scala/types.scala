object types{
  case class ToDouble (value: Double)
  def main(args: Array[String]): Unit = {
    val a = ToDouble (25.0)
    val b: Double = a.value
    println (s" $a.value")
    println (s" $b")
  }
}