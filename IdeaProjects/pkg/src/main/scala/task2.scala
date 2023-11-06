object task2 {
  def equ(a: Int, b: Int, c: Int, x: Int) = (a * (x * x)) + (b * x) + c

  def main(args: Array[String]): Unit = {
    //task1
    var list = List.range(-3, 3)
    var res = Map(-3 -> 19, -2 -> 9, -1 -> 5, 0 -> 7, 1 -> 15, 2 -> 29, 3 -> 49)
    var resList = list.map(equ(3, 5, 7, _));
    var check = false;
    for (i <- 0.to(list.length - 1))
      check = if (res.get(list(i)).get == resList(i)) true else false
    print(check)

    //task2
    var zipped=list.zip(resList)
    println(zipped)
    var mean=(zipped.map(_._1).sum)/zipped.length.toDouble
    print(mean)
  }
}
