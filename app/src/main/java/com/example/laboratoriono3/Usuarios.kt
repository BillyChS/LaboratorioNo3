package com.example.laboratoriono3

class Usuarios {
    private var usuarios:ArrayList<Usuario> = ArrayList()

    init {

    }
    private object HOLDER {
        val INSTANCE = Usuarios()
    }

    companion object{
        val instance:Usuarios by lazy {
            HOLDER.INSTANCE
        }
    }


    fun forgotPassword(user:String,newPassword:String){

        var aux = usuarios!!.get(getPosition(user))
        aux.password = newPassword

    }


    //Return true if we find the the user and the password in the list
    fun login(user: String?, password: String?):Boolean{
        for(p: Usuario in usuarios!!){
            if(p.user.equals(user) && p.password.equals(password)){
                return true
            }
        }
        return false
    }

    //Return the person if we find the the user and the password in the list
    fun loginP(user: String?, password: String?):Usuario?{
        for(p: Usuario in usuarios!!){
            if(p.user.equals(user) && p.password.equals(password)){
                return p
            }
        }
        return null
    }


    //Ecuentra la posicion del usuario
    fun getPosition(user:String):Int{
        var count:Int = 0
        for (i:Usuario in usuarios){
            if(user.equals(i.user)){
                return count
            }
            count++
        }
        return -1
    }

    //Get a specific user in the list
    fun getUser(user:String):Usuario?{
        if(getPosition(user)  != -1){
            var aux = usuarios!!.get(getPosition(user))
        }
        return null
    }

    //Delete a user
    fun deleteUser(position: Int){
        usuarios!!.removeAt(position)
    }

    //Add a user to the list
    fun addUser(user:Usuario){
        usuarios?.add(user)
    }

    //Get all the users of the list
    fun getUsers():ArrayList<Usuario>{
        return this.usuarios
    }

    //edit a user of the list
    fun editUser(p:Usuario){

        var aux = usuarios!!.get(getPosition(p.user))

        aux.role = p.role
        aux.password = p.password
        aux.user = p.user
        aux.name = p.name

    }


}