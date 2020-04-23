package com.example.constrainlayoutdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.TransitionManager
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.constraintlayout.widget.Placeholder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_start)
    }

    /**
     * 从一种布局平滑过度到另一种布局
     */
    fun onClick(view:View) {
        val constraintLayout = view as ConstraintLayout
        TransitionManager.beginDelayedTransition(constraintLayout)

        val constraintSet = ConstraintSet().apply {
            clone(this@MainActivity, R.layout.activity_constraint_end)
        }
        constraintSet.applyTo(constraintLayout)
    }
}
