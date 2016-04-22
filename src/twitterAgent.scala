import examples.singleObject

/**
 * Created by Aneta Skoniecka on 2016-04-22.
 */
object twitterAgent {
    def main(args: Array[String]) {
      tryExamples()
    }

    def tryExamples(): Unit = {
      println("Hello, world!")
      singleObject.simpleMethod()
      singleObject.methodWithMethodArgument(()=> println("moj callback"))

      val method = singleObject.methodReturnsMethod()
      method()
    }
}
