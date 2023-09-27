package com.example.projectbp2607

class LoginModel {
    //Variabel
    var username = ""
    var password = ""

    //method
    fun loginCheck():Boolean{
        if (username.equals("hambali")&&password.equals("amikom")){
            return true
        }else{
            return false
        }
    }
}