package ma.youcode.myrhbackendapi.services;

import ma.youcode.myrhbackendapi.dto.responses.VerificationCodeResponse;

import java.util.Optional;

public interface VerificationCodeService {
    public Optional<VerificationCodeResponse> generateCode(String email);
    public boolean verifyCode(String code);
    public Optional<VerificationCodeResponse> save(VerificationCodeResponse verificationCode);
}
