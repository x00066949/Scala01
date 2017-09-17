import org.scalatest._
import Matchers._

object Main extends App {
  println("Hello, Dublin!"+"How are you")
  
  val left =2
  val right = 2
  
  assert(left == right)
  
  val pt = new Point(3,2)
  println(pt)
  val aClass = new ClassWithValParameter("Gandalf")
	aClass.name should be("Gandalf")

}

class Point(x: Int, y: Int){

	override def toString(): String = "( point x is: "+x+", point y is: "+y+")"

}

object Classes {
  def main(args: Array[String]) {
    val pt = new Point(1, 2)
    println(pt)
  }
}

class ClassWithValParameter(val name: String)
