package com.scatterlogical.AgentGo;
//A class to arrange and access the monitors, committing their values to the DB
public class Monitors
{
	//Update the line below with the titles of new monitors as they are added.
	private static final String [] MONITORS_WE_HAVE_PROGRAMMED = {"NONE"};
	
	int secondsPerCommit; //seconds in between commits to the database
	int commitsPerSave;   //commits before saving to file
	String fileName;
	
	public Monitors(String monitorsToEstablish, String fileName){
		this.fileName = fileName + ".srf";
		//TODO: make a string array
		//TODO: go through the titles, establishing the identified monitors
		//TODO: Toast failures through the "HasFailed" method.
		//TODO: Update the monitors list
		//TODO: Start the counter thread
	}
	//TODO: Need a three dimensional list of monitors [][]
	//TODO: And a new thread per new monitor
	
	//TODO: for converting fieldContents to numbers for storage, we need to know how to convert the string...
	public String getFieldPrimitiveOf(String monitorName){
		return "Unimplemented";	
	}
	

	//TODO: instructions to each Monitor, an iterable version of this...
	
	public void Establish(){System.out.println("Establish sent to no-one <UNIMPLEMENTED>");}
	public void Start(){System.out.println("Start sent to no-one <UNIMPLEMENTED>");}
	public void Pause(){System.out.println("Pause sent to no-one <UNIMPLEMENTED>");}
	public void Stop(){System.out.println("Stop sent to no-one <UNIMPLEMENTED>");}

	public String GetMonitorName()  					{return "<UNIMPLEMENTED>";}
	public String GetFieldTitle()  						{return "<UNIMPLEMENTED>";}
	public String GetFieldContents(boolean UIFriendly) 	{return "Method has not been overridden.";}
	public String GetFieldUnits()  						{return "<UNIMPLEMENTED>";}

	public boolean IsRunning()							{return false;}	
	public boolean HasFailed()							{return false;}	
	
}
