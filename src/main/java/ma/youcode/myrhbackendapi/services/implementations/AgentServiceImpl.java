package ma.youcode.myrhbackendapi.services.implementations;

import ma.youcode.myrhbackendapi.dto.requests.AgentRequest;
import ma.youcode.myrhbackendapi.dto.responses.AgentResponse;
import ma.youcode.myrhbackendapi.services.AgentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class AgentServiceImpl implements AgentService {
    @Override
    public List<AgentResponse> getAll() {
        return null;
    }

    @Override
    public Page<AgentResponse> getAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<AgentResponse> find(UUID uuid) {
        return Optional.empty();
    }

    @Override
    public Optional<AgentResponse> create(AgentRequest agentRequest) {
        return Optional.empty();
    }

    @Override
    public Optional<AgentResponse> update(AgentRequest agentRequest, UUID uuid) {
        return Optional.empty();
    }

    @Override
    public boolean destroy(UUID uuid) {
        return false;
    }
}
