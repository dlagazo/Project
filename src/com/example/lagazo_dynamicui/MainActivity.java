package com.example.lagazo_dynamicui;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		LayoutParams lpButton = new LayoutParams(200, 100);
		lpButton.setMargins(50, 100, 0, 0); 
		int screenWidth = getWindowManager().getDefaultDisplay().getWidth();
		int screenHeight = getWindowManager().getDefaultDisplay().getHeight();
		LayoutParams lpLL = new LayoutParams(screenWidth, screenHeight);
		lpLL.setMargins(0, 0, 0, 0);
		
		Button btn = new Button(this);
		btn.setLayoutParams(lpButton);
		
		btn.setText(R.string.one);
		
		LinearLayout ll = new LinearLayout(this);
		ll.setOrientation(LinearLayout.VERTICAL);
		ll.setLayoutParams(lpLL);
		ll.setBackgroundColor(Color.BLUE);
		TextView tv = new TextView(this);
		tv.setText(R.string.one);
		
		
		LinearLayout.LayoutParams lpl1 = new LinearLayout.LayoutParams(screenWidth, screenHeight/6);
		LinearLayout l1 = new LinearLayout(this);
		l1.setBackgroundColor(Color.GREEN);
		l1.setLayoutParams(lpl1);
		
		LinearLayout l2 = new LinearLayout(this);
		l2.setBackgroundColor(Color.RED);
		l2.setLayoutParams(lpl1);
		
		LinearLayout l3 = new LinearLayout(this);
		l3.setBackgroundColor(Color.MAGENTA);
		l3.setLayoutParams(lpl1);
		
		ImageView flag = new ImageView(this);
		flag.setImageResource(R.drawable.ic_launcher);
		
		android.widget.LinearLayout.LayoutParams lpFlag =
				new android.widget.LinearLayout.LayoutParams(screenWidth/2, android.widget.LinearLayout.LayoutParams.FILL_PARENT);
		flag.setLayoutParams(lpFlag);
		
		l1.addView(flag);
		l1.addView(tv);
		ll.addView(l1);
		ll.addView(l2);
		ll.addView(l3);
		RelativeLayout rl = (RelativeLayout) findViewById(R.id.rl);
		
		
		//start adding the views to the screen
		rl.addView(ll);
		//rl.addView(tv);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void calculateString(String temp)
	{
		String str = "456x32";
		String number1 = "";
		for(char c:str.toCharArray())
		{
			if(c != '+' || c!= 'x')
			{
				number1 = number1 + str;
			}
		}
	}
}
