import Utilities.DataBase.ReaderService

fun main() {
    val program = ConsoleUI()
    val reader = ReaderService(program)
    reader.readCsv("DataFiles/Users.csv")
    reader.readCsv("DataFiles/Dishes.csv")
    var input : String? = ""
        while (true) {
            program.showStartMenu()
            input = readln()
            when (input) {
                "1","2" -> program.invoker.executeCommand("$input-Account", program)
                "3" -> {println("Closing..."); break}
                else -> println("Wrong input")
            }
        }

}
