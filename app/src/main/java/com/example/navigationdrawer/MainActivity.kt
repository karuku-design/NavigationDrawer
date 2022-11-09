package com.example.navigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout

class MainActivity : AppCompatActivity() {

    private lateinit var drawer :DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTheme(R.style.CustomTheme)

        //find the toolbar
        var toolbar:Toolbar=findViewById(R.id.toolBar)
        setSupportActionBar(toolbar)

        //find the drawer layout
        drawer=findViewById(R.id.drawerLyt)

        //toogle the navDrawer using a hamburger icon.
        var toogle: ActionBarDrawerToggle=ActionBarDrawerToggle(this,drawer,toolbar,
        R.string.navigation_drawer_open,R.string.navigation_drawer_close)

        drawer.addDrawerListener(toogle)
        toogle.syncState()

    }

    override fun onBackPressed() {

        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START)
        }else{
            super.onBackPressed()
        }
    }
}