package com.example.implecitintent;

import java.io.File;
import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Picture;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;

import com.example.activitylifecycle.R;

public class ActivityImplicitIntent extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_intent);
	}

	public void onProcess(View v) {
		Intent in = null;
		Uri ur=null;
		switch (v.getId()) {
		case R.id.btn_map:
			in = new Intent(android.content.Intent.ACTION_VIEW);
			in.setData(Uri.parse("geo:19.000,17.000"));
			in = Intent.createChooser(in, "Maps");
			startActivity(in);
			break;
		case R.id.btn_market:
			in = new Intent(android.content.Intent.ACTION_VIEW);
			in.setData(Uri.parse("market://details?id=fm.clean&hl=en"));
			in = Intent.createChooser(in, "Store");
			startActivity(in);
			break;

		case R.id.btn_email:
			in = new Intent(android.content.Intent.ACTION_SEND);
			in.setData(Uri.parse("mailto:"));
			in.putExtra(Intent.EXTRA_EMAIL, new String[] { "lokesrrrocks@gmail.com" });
			in.putExtra(Intent.EXTRA_SUBJECT, "My app Test");
			in.putExtra(Intent.EXTRA_TEXT, "Body My app Test");
			/** Mime type vey Imp */
			in.setType("message/rfc822");
			in = Intent.createChooser(in, "Mail");
			startActivity(in);
			break;

		case R.id.btn_email_image:
			in = new Intent(android.content.Intent.ACTION_SEND);
			 ur = Uri.parse("android.resource://com.example.activitylifecycle/drawable/" + R.drawable.ic_launcher);
			in.putExtra(Intent.EXTRA_EMAIL, new String[] { "lokesrrrocks@gmail.com" });
			in.putExtra(Intent.EXTRA_SUBJECT, "My app Test");
			in.putExtra(Intent.EXTRA_TEXT, "Body My app Test");
			in.putExtra(Intent.EXTRA_STREAM, ur);
			/** Mime type vey Imp */
			in.setType("image/*");
			in = Intent.createChooser(in, "Mail");
			startActivity(in);
			break;

		case R.id.btn_send_multiple:

			File file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
			String[] listOfProject = file.list();

			ArrayList<Uri> lsURI = new ArrayList<Uri>();
			for (String pic : listOfProject) {
				ur = Uri.parse("file://" + file.toString() + "/" + pic);
				lsURI.add(ur);
			}
			in = new Intent(android.content.Intent.ACTION_SEND_MULTIPLE);
			in.setType("image/*");
			in.putExtra(Intent.EXTRA_STREAM, lsURI);
			/** Mime type vey Imp */
			in.setType("image/*");
			in = Intent.createChooser(in, "Send MUltiple Image");
			startActivity(in);
			break;

		}

	}
}
