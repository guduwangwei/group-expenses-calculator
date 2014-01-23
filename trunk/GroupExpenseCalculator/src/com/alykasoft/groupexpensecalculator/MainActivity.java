package com.alykasoft.groupexpensecalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btnCreateNewTrip = (Button) findViewById(R.id.btnCreateNewTrip);
        btnCreateNewTrip.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent intntCreateNewTrip = new Intent(MainActivity.this, CreateNewTripActivity.class);
				startActivity(intntCreateNewTrip);
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
