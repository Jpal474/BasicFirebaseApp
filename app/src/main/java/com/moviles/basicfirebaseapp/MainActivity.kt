package com.moviles.basicfirebaseapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val database = Firebase.database
        val myRef = database.reference
//        myRef.child("ejemplo").child("1").setValue(Card("1", "rojo", "corazones"))
//        myRef.child("ejemplo").child("2").setValue(Card("9", "negro", "corazones"))
//        myRef.child("ejemplo").child("3").setValue(Card("3", "rojo", "diamantes"))

//          myRef.child("usuarios").child("1").setValue(User(21, "Juan", 1))
//          myRef.child("usuarios").child("2").setValue(User(22, "Abigail", 2))
//          myRef.child("usuarios").child("3").setValue(User(30, "Alejandro", 3))


        myRef.child("ejemplo").get().addOnSuccessListener { response ->
            Log.d("firebaseResponse", response.value.toString())
        } .addOnFailureListener{
            Log.e("firebaseResponse", "Error getting data", it)
        }

        myRef.child("usuarios").get().addOnSuccessListener { response ->
            Log.d("firebaseResponseUsers", response.value.toString())
        } .addOnFailureListener{
            Log.e("firebaseResponseUsers", "Error getting data", it)
        }

    }
}