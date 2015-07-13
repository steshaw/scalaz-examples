package steshaw

object Main extends App {
  while(true) {
    println("Hello, scalaz-examples!")
    (1 to 3).foreach { n =>
      println(s"n = ${n}")
    }
    Thread.sleep(1000)
  }
}
