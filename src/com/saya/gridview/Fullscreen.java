package com.saya.gridview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;

public class Fullscreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fullscreen);
		
		int position = getIntent().getExtras().getInt("id");
		ImageView iv = (ImageView) findViewById(R.id.imageView1);
		
		myadapter ma = new myadapter( getApplicationContext() );
		iv.setImageResource(ma.myimages[position]);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fullscreen, menu);
		return true;
	}

}
