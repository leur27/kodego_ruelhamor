import mu.KotlinLogging
private val  logger = KotlinLogging.logger{}

fun main(){
    logger.trace {"Trace log"}
    logger.debug {"Debug log"}
    logger.info {"Info log"}
    logger.warn {"Warn log"}
    logger.error {"Error log"}

}
