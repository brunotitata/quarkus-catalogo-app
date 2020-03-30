package br.com.catalogo.application;

import br.com.catalogo.ports.adapters.http.AlbumResourceV2;

public interface CatalogoService {

	AlbumResourceV2 listarAlbumPorArtista(String artista);

}
