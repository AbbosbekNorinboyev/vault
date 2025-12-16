package uz.brb.vault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import uz.brb.vault.config.VaultConfig;

@SpringBootApplication
@EnableConfigurationProperties(VaultConfig.class)
public class VaultApplication {

    public static void main(String[] args) {
        SpringApplication.run(VaultApplication.class, args);
    }

}
