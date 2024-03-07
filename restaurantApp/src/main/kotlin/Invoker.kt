import Commands.AdminCommands.*
import Commands.VisitorCommands.*

class Invoker {
    private var map: MutableMap<String, Command> = HashMap()

    init {
        map["1-Account"] = GetUserCommand()
        map["2-Account"] = GetAdminCommand()
        map["1-Order"] = GetDishesCommand()
        map["2-Order"] = StartCookingCommand()
        map["Delete dish"] = DeleteDishCommand()
        map["1-UserOption"] = MakeOrderCommand()
        map["2-UserOption"] = ChangeDishCommand()
        map["3-UserOption"] = CancelOrderCommand()
        map["4-UserOption"] = CheckOrderCommand()
        map["5-UserOption"] = PayForOrderCommand()
        map["6-UserOption"] = FillWalletCommand()
        map["1-Review"] = MakeReviewCommand()
        map["1-AdminOption"] = PrintAllDishes()
        map["2-AdminOption"] = AddDishCommand()
        map["3-AdminOption"] = ChangeMenuCommand()
        map["4-AdminOption"] = DeleteDishCommand()
        map["5-AdminOption"] = CheckIncomeCommand()
        map["6-AdminOption"] = GetStatisticCommand()
    }

    fun executeCommand(request: String, program: ConsoleUI) {
        val command = map[request]
        if (command != null) {
            command.execute(request, program)
        } else {
            throw IllegalArgumentException("Wrong command! Try again, please")
        }
    }
}