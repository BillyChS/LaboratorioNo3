package com.example.laboratoriono3

import java.io.Serializable

class Usuario:Serializable {
    var user:String = ""
    var password:String = ""
    var name:String = ""
    var role:String = ""

    internal constructor(user:String,password:String,name:String,role:String){
        this.user = user
        this.user = name
        this.password = password
        this.role = role
    }
}