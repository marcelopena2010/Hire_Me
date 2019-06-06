package dto.converter;

import domain.url;
import dto.urlDTO;

public class urlDTO_Converter {

	public static urlDTO convertToDTO(url url){
		urlDTO dto = new urlDTO();
		
		dto.setId(url.getId());
		dto.setAlias(url.getAlias());
		dto.setUrl(url.getUrl());
		dto.setShortened(url.getShortened());
		
		return dto;
	}
	
	public static urlDTO convertToDTO(url url, long timeTaken) {
		urlDTO dto = convertToDTO(url);
		dto.setTimeTaken(timeTaken);
		
		return dto;
	}
	
	public static url convertToDomain(urlDTO dto) {
		url url = new url();
		
		url.setId(dto.getId());
		url.setAlias(dto.getAlias());
		url.setUrl(dto.getUrl());
		url.setShortened(dto.getShortened());

		return url;
	}
	
}