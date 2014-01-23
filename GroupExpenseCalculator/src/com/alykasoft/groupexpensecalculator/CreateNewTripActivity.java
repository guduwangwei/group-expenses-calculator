package com.alykasoft.groupexpensecalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class CreateNewTripActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_create_new_trip);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.create_new_trip, menu);
		return true;
	}

}
