package com.example.jasminvucelj.transitiontestapplication;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Explode;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setAnimation();

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ButterKnife.bind(this);
	}

	private void setAnimation() {
		getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
		Explode explode = new Explode();
		explode.setDuration(3000);
		getWindow().setExitTransition(explode);
	}

	@OnClick(R.id.button)
	void buttonClicked() {
		Intent intent = new Intent(MainActivity.this, SecondActivity.class);
		startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
	}

}
