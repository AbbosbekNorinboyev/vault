package uz.brb.vault.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "db")
public class VaultConfig {
    private String username;
    private String password;

    public void printCredentials() {
        System.out.println("DB Username: " + username);
        System.out.println("DB Password: " + password);
    }
}