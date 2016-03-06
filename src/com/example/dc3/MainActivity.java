package com.example.dc3;

import java.util.Random;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MainActivity extends Activity {
	int currentapi = android.os.Build.VERSION.SDK_INT;
	int minSpApi = android.os.Build.VERSION_CODES.LOLLIPOP;
	int minImmersiveApi = android.os.Build.VERSION_CODES.JELLY_BEAN;

	static Random rand = new Random();
	
	public static int randInt(double min, double max) {
	    return rand.nextInt(((int)max - (int)min) + 1) + (int)min;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
//		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		FragmentManager fragmentManager = getFragmentManager();
		Fragment fragment = new Sketch();
		fragmentManager.beginTransaction()
		              .replace(R.id.container, fragment)
		              .commit();
		}
	
	public void onResume() {
		  super.onResume();
		  //p3
		  View decorView = getWindow().getDecorView();
		  int uiOptions;
		  if (currentapi>minImmersiveApi){
			  uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
		                 | View.SYSTEM_UI_FLAG_FULLSCREEN
		                 | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
		  }else{
			  uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
		                 | View.SYSTEM_UI_FLAG_FULLSCREEN;
		  }
	      decorView.setSystemUiVisibility(uiOptions);	
	}
}
