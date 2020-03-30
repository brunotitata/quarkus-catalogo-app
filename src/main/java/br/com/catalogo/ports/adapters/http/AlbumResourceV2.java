package br.com.catalogo.ports.adapters.http;

import java.util.ArrayList;
import java.util.List;

import br.com.catalogo.ports.adapters.http.AlbumResource.Album;

public class AlbumResourceV2 {

	private String artista;
	private String foto;
	private List<Integer> albums;

	public AlbumResourceV2(String artista, String foto, List<Integer> albums) {
		this.artista = artista;
		this.foto = foto;
		this.albums = albums;
	}

	public AlbumResourceV2() {
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public List<Integer> getAlbums() {
		return albums;
	}

	public void setAlbums(List<Integer> albums) {
		this.albums = albums;
	}

	public static AlbumResourceV2 convert(Album album) {

		List<Integer> ids = new ArrayList<>();
		ids.add(album.getId());
		return new AlbumResourceV2(album.getArtist().getName(), album.getArtist().getPicture_big(), ids);
	}

	@Override
	public String toString() {
		return "AlbumResourceV2 [artista=" + artista + ", foto=" + foto + ", albums=" + albums + "]";
	}

}
