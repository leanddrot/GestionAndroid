package com.dimuthuupeksha.activity;

import com.example.isisandroid.R;

import android.os.Bundle;
import android.os.StrictMode;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (android.os.Build.VERSION.SDK_INT > 8) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
        setContentView(R.layout.signin);
       
    	Button submit = (Button)findViewById(R.id.signin_submit);
    	final EditText uname = (EditText)findViewById(R.id.uname);
	    final EditText pass = (EditText)findViewById(R.id.pass);
	    final EditText url = (EditText)findViewById(R.id.url);
        final EditText puerto = (EditText)findViewById(R.id.puerto);
        submit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent("android.intent.action.HOME");
				intent.putExtra("uname", uname.getText().toString());
				intent.putExtra("pass", pass.getText().toString());
				intent.putExtra("url", url.getText().toString());
                intent.putExtra("puerto", puerto.getText().toString());

				startActivity(intent);
			}
		});
    }
  
    
}
