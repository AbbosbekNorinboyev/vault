package uz.brb.vault.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.brb.vault.entity.Card;
import uz.brb.vault.repository.CardRepository;
import uz.brb.vault.service.CardService;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {
    private final CardRepository cardRepository;

    @Override
    public ResponseEntity<?> create(Card card) {
        return ResponseEntity.ok(cardRepository.save(card));
    }

    @Override
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(cardRepository.findAll());
    }
}
