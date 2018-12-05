package io.github.ppSoftware.rpgSys.msfeats.model;

import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import io.github.ppSoftware.rpgSys.msfeats.model.AuditModel;
import lombok.Data;

@Entity
@Data
@Table(name = "skills")
public class SkillDao extends AuditModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5847043166825110667L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SKILLS_SEQUENCE_GENERATOR")
	@SequenceGenerator(name = "SKILLS_SEQUENCE_GENERATOR", sequenceName = "SQ_SKILLS")
	@Column(name = "id")
	private BigInteger id;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

}
