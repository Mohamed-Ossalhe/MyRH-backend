package ma.youcode.myrhbackendapi.services;

import ma.youcode.myrhbackendapi.dto.requests.RecruiterRequest;
import ma.youcode.myrhbackendapi.dto.responses.RecruiterResponse;
import ma.youcode.myrhbackendapi.interfaces.CrudInterface;

import java.util.UUID;

public interface RecruiterService extends CrudInterface<RecruiterResponse, RecruiterRequest, UUID> {
}
