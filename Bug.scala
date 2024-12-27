```scala
class MyClass[T](val value: T) {
  def myMethod(other: MyClass[T]): T = {
    value + other.value 
  }
}

object Main extends App {
  val intInstance1 = new MyClass(10)
  val intInstance2 = new MyClass(20)
  println(intInstance1.myMethod(intInstance2)) // Works fine for Int

  val stringInstance1 = new MyClass("Hello ")
  val stringInstance2 = new MyClass("World!")
  println(stringInstance1.myMethod(stringInstance2)) // Compilation error for Strings
}
```