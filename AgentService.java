package com.example.Service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.Entity.Agent;

@Service
public interface AgentService 
{
	public Agent addAgent(Agent agent);
	public List<Agent> getAllAgent();
	public void deleteAgent(int id);
	public Agent UpdateAgent(Agent agent);
	public Agent createAgent(Agent agent);
	
}