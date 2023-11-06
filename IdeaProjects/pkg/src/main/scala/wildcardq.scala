object wildcardq {
def main(args:Array[String]): Unit = {
  val list1=List.range(1,6)
  val list_twice=list1.map(_*2)
  list_twice.foreach(println)
  def f(x:Int)=if (x>2) x*x else None
  val sqr=list1.map(f(_))
  sqr.foreach(println)

}
}
