package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Agent;

import com.example.Service.AgentService;

@RestController
@RequestMapping("/agents")
public class AgentController {


    
    @Autowired
    private AgentService agentService;
    
    @PostMapping
    public void createAgent(@RequestBody Agent agent) {
        agentService.createAgent(agent);
    }
    
    @PutMapping
    public void updateAgent(@RequestBody Agent agent) {
        agentService.UpdateAgent(agent);
    }
    
    @DeleteMapping("/{id}")
    public void deleteAgent(@PathVariable int id) {
        agentService.deleteAgent(id);
    }
    @GetMapping(value="/agents")
    public List<Agent> getAllAgent() {
        return agentService.getAllAgent();
    }
    @RequestMapping(value ="/agents", produces ="application/jason", method=RequestMethod.PUT)
	public Agent updateagent(@RequestBody Agent agent)
	{
		return agentService.UpdateAgent(agent);
	}
}