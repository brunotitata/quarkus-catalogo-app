package br.com.catalogo.application;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import br.com.catalogo.ports.adapters.http.AlbumResource;
import br.com.catalogo.ports.adapters.http.AlbumResourceV2;
import br.com.catalogo.ports.adapters.http.DeezerService;

@ApplicationScoped
public class CatalogoServiceImpl implements CatalogoService {

	private DeezerService deezer;

	public CatalogoServiceImpl(@RestClient DeezerService deezer) {
		this.deezer = deezer;
	}

	@Override
	public AlbumResourceV2 listarAlbumPorArtista(String artista) {

		AlbumResource albumResource = deezer.listarTodosAlbunsPorArtista(artista);
		List<Integer> ids = new ArrayList<>();

		albumResource.getData().forEach(p -> ids.add(p.getId()));

		return new AlbumResourceV2(
				albumResource.getData().stream().map(nome -> nome.getArtist().getName()).findFirst().orElse(""),
				albumResource.getData().stream().map(foto -> foto.getArtist().getPicture_big()).findFirst().orElse(""),
				ids);
	}

}
