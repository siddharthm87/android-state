package com.example.statechangeactivity;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private static final String TAG = "com.example.statechangeactivity";
	TextView tv;
	Button b1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv = (TextView) findViewById(R.id.textView1);
		tv.setVisibility(View.GONE);
		b1 = (Button) findViewById(R.id.button1);
		b1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
                tv.setVisibility(View.VISIBLE);
			  
 
			}
		});
		Log.i(TAG, "onCreate" );
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	protected void onStart() {
		
		super.onStart();
		Log.i(TAG, "onStart");
	}
	
	protected void onResume() {
		super.onResume();
		Log.i(TAG, "onResume");
	}
	
	protected void onPause() {
		super.onPause();
		Log.i(TAG, "onPause");
	}
	
	protected void onStop() {
		super.onStop();
		Log.i(TAG, "onStop");
	}

	protected void onRestrart() {
		super.onRestart();
		Log.i(TAG, "onRestart");
	}
	
	protected void onDestroy() {
		super.onDestroy();
		Log.i(TAG, "onDestroy");
	}
	
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		Log.i(TAG, "savedInstance");
	}
	
	protected void onRestoreInstanceState(Bundle savedState) {
		Log.i(TAG, "onRestoreInstaneState");
	}
}
