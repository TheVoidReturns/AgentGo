package com.scatterlogical.AgentGo;

public class GameControl
{
	Monitors monitors;
	//TODO: Milestone array here
	int milestoneTicker;
	public GameControl(String fileNameOfMission, String monitorsToUse){
		//TODO: load up the file...
		//TODO: make the milestone array
		//TODO: Open the monitors
		monitors = new Monitors(monitorsToUse, fileNameOfMission + "The date or something");
		
		//TODO: Get the music ready
		//TODO: Initialise the sound manager...
		
		//TODO: Load the first milestone, and load a new one each time you see a "complete"
		//TODO: then carry on regardless...
	}
}
