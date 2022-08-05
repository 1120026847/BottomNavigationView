package com.example.fragmentcontainerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

//todo https://blog.csdn.net/weixin_44902943/article/details/115618012
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }
    private fun initView() {
        val bottomNavigationView:BottomNavigationView=findViewById(R.id.bottomNavigationView)
        //让BottomNavigationView与NavController相关联
        //方法一：去fragment管理器里通过id找到NavHostFragment
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        bottomNavigationView.setupWithNavController(navHostFragment.navController)
        //方法二：把androidx.fragment.app.FragmentContainerView改成fragment
        //val navController = findNavController(R.id.nav_host_fragment)
        //bottomNavigationView.setupWithNavController(navController)

    }
}