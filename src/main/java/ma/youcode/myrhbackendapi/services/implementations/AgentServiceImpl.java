package ma.youcode.myrhbackendapi.services.implementations;

import lombok.RequiredArgsConstructor;
import ma.youcode.myrhbackendapi.dto.requests.AgentRequest;
import ma.youcode.myrhbackendapi.dto.responses.AgentResponse;
import ma.youcode.myrhbackendapi.repositories.AgentRepository;
import ma.youcode.myrhbackendapi.services.AgentService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AgentServiceImpl implements AgentService {

    private final AgentRepository agentRepository;
    private final ModelMapper mapper;
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
