package br.com.catalogo.ports.adapters.http;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

@RegisterRestClient(baseUri = "https://api.deezer.com")
public interface DeezerService {

	@GET
	@Path("/search/album")
	@Produces(MediaType.APPLICATION_JSON)
	public AlbumResource listarTodosAlbunsPorArtista(@QueryParam("q") String artista);

	@GET
	@Path("/search/album/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public TrackResource listarMusicasPorAlbum(@PathParam("id") String albumId);

	@GET
	@Path(value = "/search/album/6710723")
	@Produces(MediaType.APPLICATION_JSON)
	public TrackResource listarMusicasPorAlbum2();
}
