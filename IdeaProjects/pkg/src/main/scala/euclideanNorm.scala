import scala.math.sqrt
object euclideanNorm {
  def euclidean(vector: List[Int]): Double = {
    val squaredSum = vector.map(x => x * x).sum
    sqrt(squaredSum)
  }
  def main(args: Array[String]): Unit = {
    val myVector = List(3, 4, 5)
    val norm = euclidean(myVector)
    println(s"$norm")
  }
}
