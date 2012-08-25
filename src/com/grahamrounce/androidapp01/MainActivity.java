package com.grahamrounce.androidapp01;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView theTextView;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        theTextView = (TextView) findViewById(R.id.textView1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void evt_button1_onClick(View v) {
    	String curText = theTextView.getText().toString();
    	
    	if(curText == "dlroW") {
    		curText = "World";
    	} else {
    		curText = "dlroW";
    	}
    	
    	theTextView.setText(curText);
    }
}
