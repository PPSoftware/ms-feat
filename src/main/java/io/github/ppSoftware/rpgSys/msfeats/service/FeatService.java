package io.github.ppSoftware.rpgSys.msfeats.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import io.github.ppSoftware.rpgSys.msfeats.exception.ResourceNotFoundException;
import io.github.ppSoftware.rpgSys.msfeats.model.FeatDao;
import io.github.ppSoftware.rpgSys.msfeats.repository.FeatDaoRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class FeatService {

	private FeatDaoRepository featDaoRepository;

	public Optional<FeatDao> findByName(String name) {

		return featDaoRepository.findByName(name);
	}

	public Page<FeatDao> findAll(Pageable pageable) {
		return featDaoRepository.findAll(pageable);
	}

	public FeatDao save(FeatDao feat) {
		return featDaoRepository.save(feat);
	}

	public ResponseEntity<?> delete(String featName) {
		return featDaoRepository.findByName(featName).map(feat -> {
			featDaoRepository.delete(feat);
			return ResponseEntity.ok().build();
		}).orElseThrow(() -> new ResourceNotFoundException("Feat not found with id " + featName));

	}

	public FeatDao update(@Valid FeatDao feat, Long featId) {

		return featDaoRepository.findById(featId).map(featDao -> {
			featDao.setBenefit(feat.getBenefit());
			featDao.setName(feat.getName());
			featDao.setNormal(feat.getNormal());
			featDao.setReferenceBookId(feat.getReferenceBookId());
			featDao.setRequirements(feat.getRequirements());
			featDao.setUpdatedAt(feat.getCreatedAt());
			return featDaoRepository.save(featDao);
		}).orElseThrow(() -> new ResourceNotFoundException("Feat not found with id " + featId));
	}

}
