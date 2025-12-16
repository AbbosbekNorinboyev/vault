package uz.brb.vault.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.brb.vault.config.VaultConfig;

@RestController
@RequiredArgsConstructor
public class VaultController {
    private final VaultConfig vaultConfig;

    @GetMapping("/secrets")
    public String getSecrets() {
        return "Username: " + vaultConfig.getUsername() + ", Password: " + vaultConfig.getPassword();
    }
}