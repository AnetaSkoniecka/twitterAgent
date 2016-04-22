package examples

/**
 * Created by Aneta Skoniecka on 2016-04-22.
 */
object singleObject {
  def methodWithMethodArgument(callback: () => Unit) {
    callback()
  }
  def methodReturnsMethod() = () => {
    println("zwrocona metoda")
  }
  def simpleMethod() {
    println("zwykla metoda")
  }
}
