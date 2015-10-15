package com.scatterlogical.AgentGo;
//this is an abstract class for subtypes of monitor to draw from.  They must all behave in the same way.

public abstract class Monitor
{
	//reporting sections of the monitor
	protected String monitorName;
	protected String fieldTitle;
	protected String fieldContent;
	protected String fieldUnits;
	
	protected boolean isRunning;
	protected boolean hasFailed;
	//for converting fieldContents to numbers for storage, we need to know how to convert the string...
	String fieldPrimitive;

	//instructions to the Monitor
	public void Establish(){System.out.println("Establish received by " + monitorName);}
	public void Start(){System.out.println("Start received by " + monitorName);}
	public void Pause(){System.out.println("Pause received by " + monitorName);}
	public void Stop(){System.out.println("Stop received by " + monitorName);}
	
	public String GetMonitorName()  					{return monitorName;}
	public String GetFieldTitle()  						{return fieldTitle;}
	public String GetFieldContents(boolean UIFriendly) 	{return "Method has not been overridden.";}
	public String GetFieldUnits()  						{return fieldUnits;}

	public boolean IsRunning()							{return isRunning;}	
	public boolean HasFailed()							{return hasFailed;}	
}
