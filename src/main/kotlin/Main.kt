import org.slf4j.Logger
import org.slf4j.LoggerFactory
import kotlinx.coroutines.*

val logger: Logger = LoggerFactory.getLogger("CoroutinesPlayground")

suspend fun bathTime() {
    logger.info("Going to the bathroom")
    delay(500L)
    logger.info("Exiting the bathroom")
}

fun main(args: Array<String>) {
    logger.info("Hello world")
    runBlocking {
        bathTime()
    }
}