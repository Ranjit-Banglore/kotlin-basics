package objectsAndClasses

fun main() {

    val createAnnonymousObject = object : Runnable, AutoCloseable {
        override fun run() {
            println("hello from run method.")
        }

        override fun close() {
            println("hello from autoclosable.")
        }
    }

    createAnnonymousObject.run()
    createAnnonymousObject.close()

    /*
    val createRunnable = Runnable { print("Hello guys") }

    createRunnable.run()
*/

    /* val runnable = object : Runnable {
         override fun run() {
             print("I am running in separate thread.")
         }
     }

     runnable.run()*/
}