package br.com.catalogo;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import javax.inject.Inject;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.catalogo.application.CatalogoService;
import br.com.catalogo.ports.adapters.http.AlbumResourceV2;
import br.com.catalogo.ports.adapters.http.DeezerService;
import br.com.catalogo.ports.adapters.http.TrackResource;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class ExampleResourceTest {

	@Inject
	@RestClient
	DeezerService deezer;

	@Inject
	CatalogoService service;

	@Test
	public void testHelloEndpoint() {
		given().when().get("/hello").then().statusCode(200).body(is("hello"));
	}

	@Test
	public void albumArtista() {

		System.out.println(deezer.listarTodosAlbunsPorArtista("eminem"));
	}

	@Test
	public void testservice() throws JsonProcessingException {

		AlbumResourceV2 artista = service.listarAlbumPorArtista("Anitta");

		System.out.println(new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(artista));

	}
	
	@Test
	public void albumTest() throws JsonProcessingException {
		
		TrackResource tracks = deezer.listarMusicasPorAlbum2();
		
		System.out.println(new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(tracks));
	}

}