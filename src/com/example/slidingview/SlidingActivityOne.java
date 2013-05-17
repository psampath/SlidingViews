package com.example.slidingview;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SlidingActivityOne extends Activity implements OnClickListener {

	private Button left;
	private Button right;
	private Button top;
	private Button bottom;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sliding_activity_one);
		left = (Button) this.findViewById(R.id.left);
		right = (Button) this.findViewById(R.id.right);
		top = (Button) this.findViewById(R.id.top);
		bottom = (Button) this.findViewById(R.id.bottom);
		left.setOnClickListener(this);
		right.setOnClickListener(this);
		top.setOnClickListener(this);
		bottom.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_sliding_activity_one, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		Intent intent = new Intent(getApplicationContext(),
				SlidingActivityOne.class);
		if (v.getId() == R.id.left) {
			startActivity(intent);
			finish();
			this.overridePendingTransition(R.anim.from_left, R.anim.to_right);
		}else if(v.getId() == R.id.right){
			startActivity(intent);
			finish();
			this.overridePendingTransition(R.anim.from_right, R.anim.to_left);
		}else if(v.getId() == R.id.bottom){
			startActivity(intent);
			finish();
			this.overridePendingTransition(R.anim.from_bottom, R.anim.to_top);
		}else if(v.getId() == R.id.top){
			startActivity(intent);
			finish();
			this.overridePendingTransition(R.anim.from_top, R.anim.to_bottom);
		}

	}
}
