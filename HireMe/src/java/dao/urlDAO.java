package dao;

import domain.url;

public interface urlDAO {

	public url retrieve(Long id);
	public url create(url url);
	
}
