package com.scatterlogical.AgentGo;

public interface iDB
{
	int lastIndexCommitted = 0;
	
	void initialise();
	void finalise();
	
	void Commit (String fileName, Monitors submission);
	Monitors pull(String fileName);
}
