package service;

import domain.url;

public interface urlService {

	public url retrieve(Long id);
	public url create(url url);
	
}
