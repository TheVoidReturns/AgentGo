package com.scatterlogical.AgentGo;

import android.content.Context;
import android.media.MediaPlayer;

public class SimpleMusicPlayer implements iMusicPlayer
{
    MediaPlayer mediaPlayer;
	String [] allMusicToPlay;
	String [] allPowerMusicToPlay;
    boolean running;
    boolean playing;

	public SimpleMusicPlayer(Context context){
		allMusicToPlay = new String[] {"bvtwtest.mp3"};
        mediaPlayer = MediaPlayer.create(context, R.raw.bvtwtest);
        running = true;
	}
	@Override
	public Boolean isRunning()
	{
		return running;
	}

	@Override
	public Boolean isPlaying()
	{
		return playing;
	}

	@Override
	public void Play()
	{
        if (running)
            mediaPlayer.start();
	}

	@Override
	public void Pause()
	{
		if (playing)
            mediaPlayer.pause();
	}

	@Override
	public void Stop()
	{
		mediaPlayer.stop();
	}

	@Override
	public void PowerStart()
	{
		// TODO: Implement this method
	}

	@Override
	public void PowerPause()
	{
		// TODO: Implement this method
	}

	@Override
	public void PowerStop()
	{
		// TODO: Implement this method
	}

		
}
