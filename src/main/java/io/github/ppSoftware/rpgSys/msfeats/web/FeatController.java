package io.github.ppSoftware.rpgSys.msfeats.web;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ppSoftware.rpgSys.msfeats.model.FeatDao;
import io.github.ppSoftware.rpgSys.msfeats.service.FeatService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/feats")
@AllArgsConstructor
public class FeatController {

    private FeatService featService;

    @GetMapping("/{feat}")
    Optional<FeatDao> getFeat(@PathVariable String feat) {
        return featService.findByName(feat);
    }

    @GetMapping("/list")
    Page<FeatDao> getFeats(Pageable pageable) {
        return featService.findAll(pageable);
    }

    @PostMapping("/add")
    public FeatDao createFeat(@Valid @RequestBody FeatDao feat) {
	 
        return featService.save(feat);
    }

    @PutMapping("/update/{featId}")
    public FeatDao update(@Valid @RequestBody FeatDao feat, @PathVariable Long featId) {
	 
        return featService.update(feat, featId);
    }
    
    @DeleteMapping("/delete/{featName}")
    public ResponseEntity<?> deleteFeat(@PathVariable String featName) {
	 
        return featService.delete(featName);
    }
    
    
}
