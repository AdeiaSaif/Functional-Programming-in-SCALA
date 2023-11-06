object applyfun {
  def main(args: Array[String]): Unit = {
    def apply(list: List[Any]): Unit = {
      list.foreach(println)
    }
    val myList = List(1, 60,"one",true)
    apply(myList)
  }
}
