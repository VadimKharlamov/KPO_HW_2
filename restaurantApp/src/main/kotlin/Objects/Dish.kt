package Objects

class Dish (val dishName : String, var dishAmount : Int, var dishPrice : Int, var dishDifficulty : Int){
    override fun toString() : String {
        return "$dishName,$dishAmount,$dishPrice,$dishDifficulty"
    }
}