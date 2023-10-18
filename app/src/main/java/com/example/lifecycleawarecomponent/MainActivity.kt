package com.example.lifecycleawarecomponent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lifecycleawarecomponent.observer.MyLifeCycleObserver

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(MyLifeCycleObserver())
    }
}