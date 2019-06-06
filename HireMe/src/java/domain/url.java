package domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import validation.urlValidation;

@Entity
public class url implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(unique = true)
	private String alias;
	
	@urlValidation
	private String url; 

	@urlValidation
	private String shortened;
	
	public url() {
		super();
	}
	
	public url(Long id, String alias, String url, String shorted) {
		this(alias, url, shorted);
		this.id = id;
	}

	public url(String alias, String url, String shortened) {
		this();
		this.alias = alias;
		this.url = url;
		this.shortened = shortened;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getShortened() {
		return shortened;
	}

	public void setShortened(String shortened) {
		this.shortened = shortened;
	}

}