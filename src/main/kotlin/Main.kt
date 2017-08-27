import org.apache.commons.cli.CommandLine
import org.apache.commons.cli.CommandLineParser
import org.apache.commons.cli.DefaultParser
import org.apache.commons.cli.Options
import foundation.Application

fun main(args: Array<String>) {
    val parser: CommandLineParser = DefaultParser()

    val options = Options()
    options.addOption("v", false, "verbose mode")
    // options.addOption("x", false, "safe mode")
    // options.addOption("f", false, "ignore hext caches")

    try {
        val line: CommandLine = parser.parse(options, args)

        val app = Application(line)
        // app.start()
    } catch (e: Exception) {
        //
    }
}