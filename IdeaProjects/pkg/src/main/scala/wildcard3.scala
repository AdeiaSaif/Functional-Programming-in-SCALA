object wildcard3 {
def main(arg :Array[String]): Unit = {
  val list1=List.range(1,6);
  def f(x:Int)=if(x> 2) Some(x) else None
  val list2=list1.map(f(_))
  val list3=list1.flatMap(f(_))
  print(s"list1: $list2 \nlist2: $list3")
}
}
