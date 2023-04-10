package com.example.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Agent;
import com.example.Repository.AgentRepository;
import com.example.Service.AgentService;

@Service
public class AgentServiceImpl implements AgentService {

    @Autowired
    private AgentRepository agentRepository;

    @Override
    public Agent createAgent(Agent agent) {
        return agentRepository.save(agent);
    }

    @Override
    public List<Agent> getAllAgent() {
        return agentRepository.findAll();
    }

    @Override
    public void deleteAgent(int id) {
        agentRepository.deleteById(id);
    }

    @Override
    public Agent UpdateAgent(Agent agent) {
        return agentRepository.save(agent);
    }

    @Override
    public Agent addAgent(Agent agent) {
        return agentRepository.save(agent);
    }
}