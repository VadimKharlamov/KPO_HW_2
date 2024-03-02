package Builders

import Objects.User

interface Builder {
    fun setUUID(id : String?)
    fun setUserLogin(login : String)
    fun setUserPassword(password : String, isHashed : Boolean)
    fun getResult() : User
}