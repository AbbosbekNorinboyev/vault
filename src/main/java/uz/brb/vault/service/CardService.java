package uz.brb.vault.service;

import org.springframework.http.ResponseEntity;
import uz.brb.vault.entity.Card;

public interface CardService {
    ResponseEntity<?> create(Card card);

    ResponseEntity<?> getAll();
}
