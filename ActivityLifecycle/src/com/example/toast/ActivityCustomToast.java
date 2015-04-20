/* Ref From :https://www.youtube.com/watch?v=I-I7ndk3jnU&list=PLonJJ3BVjZW6hYgvtkaWvwAVvOFB7fkLa&index=34*/

package com.example.toast;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.activitylifecycle.R;

public class ActivityCustomToast extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void onProcess(View v) {
		Toast t = new Toast(this);
		t.setDuration(Toast.LENGTH_SHORT);
		t.setGravity(Gravity.CENTER, 50, 50);
		LayoutInflater layInf = getLayoutInflater();
		ViewGroup vg = (ViewGroup)findViewById(R.id.ll_main);
		
		/**If passing vg as a second parameter it is crashing*/
		View custom = layInf.inflate(R.layout.toast_custom, null);
		custom.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
		t.setView(custom);
		t.show();
	}
}
