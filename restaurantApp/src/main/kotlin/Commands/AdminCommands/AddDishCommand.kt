package Commands.AdminCommands
import Command
import ConsoleUI
import Objects.Dish
import Utilities.DataBase.WriterService

class AddDishCommand : Command{
    private val writer : WriterService = WriterService()
    override fun execute(request: String, program: ConsoleUI) {
        print("Input the name of the dish: ")
        val name = readln()
        print("Input amount of dish: ")
        val count = Methods.validateInput()
        print("Input the price of the dish: ")
        val price = Methods.validateInput()
        print("Input the cooking time of the dish: (in seconds) ")
        val time = Methods.validateInput()
        program.dishes.add(Dish(name, count, price, time))
        writer.writeInCsv(program.dishes)
        print("The dish has been successfully added!\n")
    }
}