package com.scatterlogical.AgentGo;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		TextView uppererDaterer = (TextView) findViewById(R.id.textviewforupdates);
		uppererDaterer.setText("Launching game activity...");
        SimpleMusicPlayer mp = new SimpleMusicPlayer(this);
        mp.Play();
    }
}
