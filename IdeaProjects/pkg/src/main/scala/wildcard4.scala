//object wildcard4 {
//  def main(args: Array[String]): Unit = {
//    var umap = Map('a' -> 2, 'b' -> 4, 'c' -> 6)
//    val mapValue = umap.mapValues(_ * 2).toMap
//    println(s"$mapValue")
//
//    def h(k: Char, v: Int) = Some(k -> (v * 2))
//
//    var umaps = umap.map { case (k, v) => (k, v) -> ((_: Char, _: Int) => h(_, _)) }.toMap
//    println(s"$umaps")
//
//    val umaps2 = umap.flatMap { case (k, v) => h(_: Char, _: Int).map((k, v) -> _) };
//    println(s"$umaps2")
//  }
//}
