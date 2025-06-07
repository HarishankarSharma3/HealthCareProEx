package CodewithHarry.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Specialization_tab")
public class Specialization {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "spec_id_col")
	private Long id;
	
	@Column(name = "spec_code_col")
	private String specCode ;
	
	@Column(name = "spec_name_col")
	private String specName ;
	
	@Column(name = "spec_note_col")
	private String specNote ;
	
	
	
	
}
