package com.example.a10118349_uas_akb.member.ui.infobdg


import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.a10118349_uas_akb.R
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_infobdg.*


class InfoBdg : AppCompatActivity() {
    lateinit var ref : DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_infobdg)

        ref = FirebaseDatabase.getInstance().getReference("USERS")

        btn_tambah.setOnClickListener {
            savedata()
        }
    }




    private fun savedata() {
        val nama = input_nama.text.toString()
        val status = input_des.text.toString()

        val user = `var`.Users(nama, status)
        val userId = ref.push().key.toString()

        ref.child(userId).setValue(user).addOnCompleteListener {
            Toast.makeText(this, "Successs",Toast.LENGTH_SHORT).show()
            input_nama.setText("")
            input_des.setText("")
        }
    }
}