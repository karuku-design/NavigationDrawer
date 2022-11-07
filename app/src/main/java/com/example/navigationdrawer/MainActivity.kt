package com.example.navigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout

class MainActivity : AppCompatActivity() {

    private lateinit var drawer :DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //find the toolbar
        var toolbar:Toolbar=findViewById(R.id.toolBar)
        setSupportActionBar(toolbar)

        //find the drawer layout
        drawer=findViewById(R.id.drawerLyt)


    }
}