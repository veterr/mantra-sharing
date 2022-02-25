package org.bhaktimarga.mantrasharing.repository;

import org.bhaktimarga.mantrasharing.model.MantraUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MantraUserRepository extends JpaRepository<MantraUser, UUID> {
}
