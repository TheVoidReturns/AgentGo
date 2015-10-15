package com.scatterlogical.AgentGo;

public interface iMusicPlayer
{
	public Boolean isRunning();
	public Boolean isPlaying();
	public void Play();
	public void Pause();
	public void Stop();
	
	// two functions to engage motivational music...
	public void PowerStart();
	public void PowerPause();
	public void PowerStop();
}
