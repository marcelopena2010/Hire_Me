package controller;

import com.sun.faces.action.RequestMapping;
import java.sql.SQLException;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import domain.url;
import dto.urlDTO;
import dto.converter.urlDTO_Converter;
import service.urlService_Implantacao;
import service.urlService;

@Path("/url")
@RequestMapping("urlController")
public class urlController {
        
        urlService service = new urlService_Implantacao();
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public url getJSON(@PathParam("id") Long id) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		return service.retrieve(id);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public urlDTO create(@QueryParam("url") String url) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {		
		System.out.println(url);
		return null;
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public urlDTO create(@QueryParam("url") String url, @QueryParam("alias") String alias) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {		
		System.out.println(url + alias);
		return null;
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public urlDTO create(url url) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		long start = new Date().getTime();
		url response = service.create(url);
		long timetaken = new Date().getTime() - start;
		return urlDTO_Converter.convertToDTO(response, timetaken);
	}

}