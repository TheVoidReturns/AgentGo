package com.scatterlogical.AgentGo;
import java.util.*;

public class Milestone
{
	String title;
	String briefingWords;
	
	String monitorBitToCheck; //this will tell us which monitor to, er... monitor
	
	//Strings for success and failure
	String failUp;
	String inZoneFromUp;
	String inZoneFromDown;
	String failDown;
	
	//Strings for target zone
	String finishMilestoneWhen; //Check a monitor for this value
	String alertLowWhen;
	String AlertHighWhen;
	
	//TODO: Some sort of array of SOUNDS, taken from the MileStoneToLoad
	
	private boolean isFinished;
	
	public Milestone(String MilestoneToLoad, Monitors reference){
		//TODO: load all the blobs, set a thread to monitor the monitors
	}
	public Boolean IsFinished(){return isFinished;}
}
