package com.androidcorpo.activitylifecycle

import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.androidcorpo.activitylifecycle.databinding.ActivityScenarioListBinding

class ScenarioListActivity : AppCompatActivity(), View.OnClickListener {

    private val SCENARIO_NO = "scenarioNo"
    private lateinit var binding: ActivityScenarioListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_scenario_list)
        binding.scenario1CardVw.setOnClickListener(this)
        binding.scenario2CardVw.setOnClickListener(this)
        binding.scenario3CardVw.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        intent = Intent(this, ScenarioActivityA::class.java)
        when (v?.id) {
            R.id.scenario1_card_vw -> {
                intent.putExtra(SCENARIO_NO, 1)
                startActivity(intent)
            }

            R.id.scenario2_card_vw -> {
                intent.putExtra(SCENARIO_NO, 2)
                startActivity(intent)
            }

            R.id.scenario3_card_vw -> {
                intent.putExtra(SCENARIO_NO, 3)
                startActivity(intent)
            }
        }
    }

}
