package org.concertManagement.repo;

import org.concertManagement.entities.Lessee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LesseeRepository extends JpaRepository<Lessee, UUID> {
}
