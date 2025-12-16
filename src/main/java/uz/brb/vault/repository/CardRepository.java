package uz.brb.vault.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.brb.vault.entity.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
}