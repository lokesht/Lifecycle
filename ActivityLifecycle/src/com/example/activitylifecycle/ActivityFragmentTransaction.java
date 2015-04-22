package com.example.activitylifecycle;

import com.example.Logging.AppLogger;
import com.example.fragment.FragmentA;
import com.example.fragment.FragmentB;
import com.example.listener.Bridge;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ActivityFragmentTransaction extends Activity implements Bridge {

	String TAG = "ActivityFragmentTransaction";
	FragmentManager fragManage;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fragment_transaction);
		fragManage = getFragmentManager();
	}

	public void onAdd(View v) {
		Log.d(TAG, "onAdd");
		FragmentTransaction fragTrasac = fragManage.beginTransaction();

		switch (v.getId()) {
		case R.id.btn_add_fragment_a:

			if (fragManage.findFragmentByTag("FragA") != null) {
				FragmentA fragA = new FragmentA();

				fragTrasac.remove(fragManage.findFragmentByTag("FragA"));
				fragTrasac.add(R.id.ll_transaction, fragA, "FragA");

				// fragTrasac.replace(R.id.ll_transaction, fragA, "FragA");
				Log.d(TAG, "rem-add");
			} else {
				FragmentA fragA = new FragmentA();
				fragTrasac.add(R.id.ll_transaction, fragA, "FragA");
				Log.d(TAG, "add");
			}

			fragTrasac.commit();
			break;

		case R.id.btn_add_fragment_b:

			if (fragManage.findFragmentByTag("FragB") != null) {
				FragmentB fragB = new FragmentB();
				fragTrasac.remove(fragManage.findFragmentByTag("FragB"));
				fragTrasac.add(R.id.ll_transaction, fragB, "FragB");
				// fragTrasac.replace(R.id.ll_transaction, fragB, "FragB");
				Log.d(TAG, "rem -add");
			} else {
				FragmentB fragB = new FragmentB();
				fragTrasac.add(R.id.ll_transaction, fragB, "FragB");
				Log.d(TAG, "add");

			}
			fragTrasac.commit();
			break;

		default:
			break;
		}
	}

	public void onRemove(View v) {
		Log.d(TAG, "onRemove");
		FragmentTransaction fragTrasac = fragManage.beginTransaction();
		switch (v.getId()) {
		case R.id.btn_add_remove_fragment_a:

			if (fragManage.findFragmentByTag("FragA") != null) {
				fragTrasac.remove(fragManage.findFragmentByTag("FragA"));
				Log.d(TAG, "remove");
			} else {
				AppLogger.ToastShort(this, "No fragment remove");
			}
			fragTrasac.commit();
			break;
		case R.id.btn_add_remove_fragment_b:

			if (fragManage.findFragmentByTag("FragB") != null) {
				fragTrasac.remove(fragManage.findFragmentByTag("FragB"));
				Log.d(TAG, "remove");
			} else {
				AppLogger.ToastShort(this, "No fragment remove");
			}

			fragTrasac.commit();
			break;

		default:
			break;
		}
	}

	public void onAttach(View v) {
		Log.d(TAG, "onAttach");
		FragmentTransaction fragTrasac = fragManage.beginTransaction();

		switch (v.getId()) {
		case R.id.btn_attach_fragment_a:

			if (fragManage.findFragmentByTag("FragA") != null) {
				fragTrasac.attach(fragManage.findFragmentByTag("FragA"));

			}
			// else {
			// AppLogger.ToastShort(this, "No fragment remove");
			// }
			fragTrasac.commit();

			break;
		case R.id.btn_attach_fragment_b:
			if (fragManage.findFragmentByTag("FragB") != null) {
				fragTrasac.attach(fragManage.findFragmentByTag("FragB"));
			}
			fragTrasac.commit();
			break;

		default:
			break;
		}
	}

	public void onDettach(View v) {
		Log.d(TAG, "onDettach");
		FragmentTransaction fragTrasac = fragManage.beginTransaction();
		switch (v.getId()) {
		case R.id.btn_detach_a:
			if (fragManage.findFragmentByTag("FragA") != null) {
				fragTrasac.detach(fragManage.findFragmentByTag("FragA"));
				fragTrasac.commit();
			}
			break;
		case R.id.btn_detach_b:
			if (fragManage.findFragmentByTag("FragB") != null) {
				fragTrasac.detach(fragManage.findFragmentByTag("FragB"));
				fragTrasac.commit();
			}
			break;

		default:
			break;
		}
	}

	public void onReplace(View v) {
		Log.d(TAG, "onReplace");
		switch (v.getId()) {
		case R.id.btn_replace_fragment_a_b:

			break;
		case R.id.btn_replace_fragment_b_a:

			break;

		default:
			break;
		}
	}

	@Override
	public void onChangeColorFragment(Fragment frag) {

	}

}
