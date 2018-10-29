package com.example.alanvan.navdrawerexperiment

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.design.widget.Snackbar
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        val drawer: DrawerLayout = findViewById(R.id.drawer_layout)
        val toggle =
                ActionBarDrawerToggle(this, drawer, toolbar,
                    R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer.addDrawerListener(toggle)
        toggle.syncState()

        val navigationView: NavigationView = findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val drawer: DrawerLayout = findViewById(R.id.drawer_layout)

        // Handle navigation view item clicks here
        when(item.itemId) {
            R.id.nav_camera -> {
                // Handle the camera import action
                drawer.closeDrawer(GravityCompat.START)
                displayToast(getString(R.string.chose_camera))
                return true
            }

            R.id.nav_gallery -> {
                // Handle the gallery action
                drawer.closeDrawer(GravityCompat.START)
                displayToast(getString(R.string.chose_gallery))
                return true
            }

            R.id.nav_slideshow -> {
                // Handle the slideshow action
                drawer.closeDrawer(GravityCompat.START)
                displayToast(getString(R.string.chose_slideshow))
                return true
            }

            R.id.nav_manage -> {
                // Handle the manage action
                drawer.closeDrawer(GravityCompat.START)
                displayToast(getString(R.string.chose_manage))
                return true
            }

            R.id.nav_send -> {
                // Handle the send action
                drawer.closeDrawer(GravityCompat.START)
                displayToast(getString(R.string.chose_send))
                return true
            }

            R.id.nav_share -> {
                // Handle the share action
                drawer.closeDrawer(GravityCompat.START)
                displayToast(getString(R.string.chose_share))
                return true
            }

            else -> return false
        }
    }

    private fun displayToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
