package com.androidcorpo.activitylifecycle

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.ActionBar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.MenuItem
import android.view.View
import com.androidcorpo.activitylifecycle.databinding.ActivityScenarioABinding

class ScenarioActivityA : AppCompatActivity() {

    private val TAG = ScenarioActivityA::class.java.name
    private val SCENARIO_NO = "scenarioNo"
    private var scenarioNo = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityScenarioBinding = DataBindingUtil.setContentView<ActivityScenarioABinding>(this,
                R.layout.activity_scenario_a)

        scenarioNo = intent.getIntExtra(SCENARIO_NO, 0)

        setTitle(String.format(getString(R.string.scenario_title), scenarioNo))

        when (scenarioNo) {
            1 -> {
                activityScenarioBinding.scenario1Container.visibility = View.VISIBLE
            }

            2 -> {
                activityScenarioBinding.scenario2Container.visibility = View.VISIBLE
                finish()
            }

            3 -> {
                val actionBar = supportActionBar
                actionBar?.setDisplayHomeAsUpEnabled(true)
                activityScenarioBinding.scenario3Container.visibility = View.VISIBLE
            }
        }

        Log.i(TAG, "onCreate()")
        ToastUtils.showToast(this, TAG + ": onCreate()")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart()")
        ToastUtils.showToast(this, TAG + ": onStart()")
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        Log.i(TAG, "onPostCreate()")
        ToastUtils.showToast(this, TAG + ": onPostCreate()")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume()")
        ToastUtils.showToast(this, TAG + ": onResume()")
    }

    override fun onPostResume() {
        super.onPostResume()
        Log.i(TAG, "onPostResume()")
        ToastUtils.showToast(this, TAG + ": onPostResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause()")
        ToastUtils.showToast(this, TAG + ": onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop()")
        ToastUtils.showToast(this, TAG + ": onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy()")
        ToastUtils.showToast(this, TAG + ": onDestroy()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart()")
        ToastUtils.showToast(this, TAG + ": onRestart()")
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        Log.i(TAG, "onSaveInstanceState()")
        ToastUtils.showToast(this, TAG + ": onSaveInstanceState()")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i(TAG, "onRestoreInstanceState()")
        ToastUtils.showToast(this, TAG + ": onRestoreInstanceState()")
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }

}
