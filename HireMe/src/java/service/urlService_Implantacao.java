package service;

import dao.urlDAO_Implantacao;
import domain.url;

public class urlService_Implantacao implements urlService {

	//TODO injetar depend�ncia
	urlDAO_Implantacao connect = new urlDAO_Implantacao();

	@Override
	public url retrieve(Long id) {
		return connect.retrieve(id);
	}

	@Override
	public url create(url url) {
		return connect.create(url);
	}

}
