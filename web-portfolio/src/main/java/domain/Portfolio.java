package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Portfolio {
	@Id
	@GeneratedValue
	private long id;
	
	@Size(min = 3, max = 100)
	@Column(unique = false, nullable = false, length = 100)
	private String title;
	
}
