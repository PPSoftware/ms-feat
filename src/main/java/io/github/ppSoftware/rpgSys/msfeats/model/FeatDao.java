package io.github.ppSoftware.rpgSys.msfeats.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "feats")
public class FeatDao extends AuditModel {

	private static final long serialVersionUID = -6785228446896120655L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FEATS_SEQUENCE_GENERATOR")
	@SequenceGenerator(name = "FEATS_SEQUENCE_GENERATOR", sequenceName = "SQ_FEATS")
	private Long id;
	private String name;
	private String benefit;
	private String normal;
	private String requirements;
	private Long referenceBookId;

}
