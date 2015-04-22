package com.example.activitylifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;

import com.example.fragment.FragmentModuleB;
import com.example.fragment.FragmentModuleA;

public class ActivityFragmentModulerUI extends Activity implements FragmentModuleA.Bridge{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_fragment_manager);
		if (savedInstanceState != null) {
			/** Restore Status */
		}

		init();
	}

	public void init() {
		FragmentModuleB fragb = new FragmentModuleB();
		FragmentModuleA fraga = new FragmentModuleA();

		FragmentManager fragManage = getFragmentManager();
		FragmentTransaction fragTrans = fragManage.beginTransaction();
		fragTrans.add(R.id.ll_parent, fraga, "FragA");
		fragTrans.add(R.id.ll_parent, fragb, "FragB");
		//fragTrans.
		fragTrans.commit();

	}

//	@Override
//	public void onConfigurationChanged(Configuration newConfig) {
//		super.onConfigurationChanged(newConfig);
//
//		if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
//
//		} else {
//
//		}
//	}

	@Override
	public void onSubjectChange(int index) {
      
		FragmentModuleB fragB= (FragmentModuleB)getFragmentManager().findFragmentByTag("FragB");
		fragB.onChange(index);
	}
}
