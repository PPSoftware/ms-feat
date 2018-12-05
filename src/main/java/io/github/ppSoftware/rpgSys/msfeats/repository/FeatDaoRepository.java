package io.github.ppSoftware.rpgSys.msfeats.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.ppSoftware.rpgSys.msfeats.model.FeatDao;

@Repository
public interface FeatDaoRepository extends JpaRepository<FeatDao, Long> {

	Optional<FeatDao> findByName(String name);
}
