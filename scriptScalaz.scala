/***
"org.scalaz" % "scalaz-concurrent_2.11" % "7.2.1"
*/


import scalaz.concurrent.Task

object HelloWorld {
  val i: Task[Int] = Task.now(1)
  i.run
}
HelloWorld.main(args)
