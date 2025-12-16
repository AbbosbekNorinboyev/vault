package uz.brb.vault.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.brb.vault.entity.Card;
import uz.brb.vault.service.CardService;

@RestController
@RequestMapping("/api/v1/cards")
@RequiredArgsConstructor
public class CardController {
    private final CardService cardService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Card card) {
        return cardService.create(card);
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll() {
        return cardService.getAll();
    }
}
