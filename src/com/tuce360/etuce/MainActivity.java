package com.tuce360.etuce;

import android.support.v7.app.ActionBarActivity;
import android.view.Window;
import android.view.WindowManager;
import android.graphics.Bitmap;
import android.os.Bundle;

import com.aphidmobile.flip.FlipViewController;

public class MainActivity extends ActionBarActivity {
	private com.aphidmobile.flip.FlipViewController flipView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		flipView =new FlipViewController(this,FlipViewController.HORIZONTAL);
		flipView.setAnimationBitmapFormat(Bitmap.Config.RGB_565);
		flipView.setAdapter(new TravelAdapter(this));
		
		setContentView(flipView);
	}
	
	@Override
	protected void onResume(){
		super.onResume();
		flipView.onResume();
	}
	
	@Override
	protected void onPause(){
		super.onPause();
		flipView.onPause();
	}


}
