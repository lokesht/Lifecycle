package com.example.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.Logging.AppLogger;
import com.example.activitylifecycle.R;

public class FragmentModuleA extends Fragment {

	String TAG = "FragmentModuleA";

	Bridge bridgeCommunication;
	ListView lsView;

	@Override
	public void onAttach(Activity activity) {

		super.onAttach(activity);

		Log.e(TAG, "F-A-onAttach");
		AppLogger.writeLog("F-A-onAttach");
		AppLogger.ToastShort(getActivity(), "F-A-onAttach");
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Log.e(TAG, "F-A-onCreate");
		AppLogger.ToastShort(getActivity(), "F-A-onCreate");
		AppLogger.writeLog("F-A-onCreate");
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		Log.e(TAG, "F-A-onCreateView");
		AppLogger.ToastShort(getActivity(), "F-A-onCreateView");
		AppLogger.writeLog("F-A-onCreateView");
		View v = inflater.inflate(R.layout.fragment_module_a, container, false);

		lsView = (ListView) v.findViewById(R.id.lv_main);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), R.array.Header, android.R.id.text1);
		lsView.setAdapter(adapter);
		return v;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		/** Assigning referenced to activity */
		bridgeCommunication = (Bridge) getActivity();

		lsView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 bridgeCommunication.onSubjectChange(position);
			}
		});

		Log.e(TAG, "F-A-onActivityCreated");
		AppLogger.ToastShort(getActivity(), "F-A-onActivityCreated");
		AppLogger.writeLog("F-A-onActivityCreated");
	}

	@Override
	public void onStart() {

		super.onStart();
		Log.e(TAG, "F-A-onStart");
		AppLogger.writeLog("F-A-onStart");
		AppLogger.ToastShort(getActivity(), "F-A-onStart");
	}

	@Override
	public void onResume() {

		super.onResume();
		Log.e(TAG, "F-A-onResume");
		AppLogger.ToastShort(getActivity(), "F-A-onResume");
		AppLogger.writeLog("F-A-onResume");
	}

	@Override
	public void onPause() {

		super.onPause();
		Log.e(TAG, "F-A-onPause");
		AppLogger.ToastShort(getActivity(), "F-A-onPause");
		AppLogger.writeLog("F-A-onPause");
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		Log.e(TAG, "F-A-onSaveInstanceState");
		AppLogger.ToastShort(getActivity(), "F-A-onSaveInstanceState");
		AppLogger.writeLog("F-A-onSaveInstanceState");
	}

	@Override
	public void onStop() {

		super.onStop();
		Log.e(TAG, "F-A-onStop");
		AppLogger.ToastShort(getActivity(), "F-A-onStop");
		AppLogger.writeLog("F-A-onStop");
	}

	@Override
	public void onDestroyView() {

		super.onDestroyView();
		Log.e(TAG, "F-A-onDestroyView");
		AppLogger.ToastShort(getActivity(), "F-A-onDestroyView");
		AppLogger.writeLog("F-A-onDestroyView");
	}

	@Override
	public void onDestroy() {

		super.onDestroy();
		Log.e(TAG, "F-A-onDestroy");
		AppLogger.ToastShort(getActivity(), "F-A-onDestroy");
		AppLogger.writeLog("F-A-onDestroy");
	}

	@Override
	public void onDetach() {

		super.onDetach();
		Log.e(TAG, "F-A-onDetach");
		AppLogger.ToastShort(getActivity(), "F-A-onDetach");
		AppLogger.writeLog("F-A-onDetach");
	}

	public interface Bridge {

		public void onSubjectChange(int index);

	}

}
