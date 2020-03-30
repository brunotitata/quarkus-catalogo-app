package br.com.catalogo.ports.adapters.http;

import java.util.List;

public class AlbumResource {

	private List<Album> data;

	public AlbumResource(List<Album> data) {
		this.data = data;
	}

	public AlbumResource() {
		// TODO Auto-generated constructor stub
	}

	public List<Album> getData() {
		return data;
	}

	public void setData(List<Album> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "AlbumResource [data=" + data + "]";
	}

	public static class Album {

		private Integer id;
		private String title;
		private String link;
		private String cover;
		private String cover_small;
		private String cover_medium;
		private String cover_big;
		private String cover_xl;
		private Integer genre_id;
		private Integer nb_tracks;
		private String record_type;
		private String tracklist;
		private Boolean explicit_lyrics;
		private Artist artist;
		private String type;

		public Album(Integer id, String title, String link, String cover, String cover_small, String cover_medium,
				String cover_big, String cover_xl, Integer genre_id, Integer nb_tracks, String record_type,
				String tracklist, Boolean explicit_lyrics, Artist artist, String type) {
			this.id = id;
			this.title = title;
			this.link = link;
			this.cover = cover;
			this.cover_small = cover_small;
			this.cover_medium = cover_medium;
			this.cover_big = cover_big;
			this.cover_xl = cover_xl;
			this.genre_id = genre_id;
			this.nb_tracks = nb_tracks;
			this.record_type = record_type;
			this.tracklist = tracklist;
			this.explicit_lyrics = explicit_lyrics;
			this.artist = artist;
			this.type = type;
		}

		public Album() {
			// TODO Auto-generated constructor stub
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getLink() {
			return link;
		}

		public void setLink(String link) {
			this.link = link;
		}

		public String getCover() {
			return cover;
		}

		public void setCover(String cover) {
			this.cover = cover;
		}

		public String getCover_small() {
			return cover_small;
		}

		public void setCover_small(String cover_small) {
			this.cover_small = cover_small;
		}

		public String getCover_medium() {
			return cover_medium;
		}

		public void setCover_medium(String cover_medium) {
			this.cover_medium = cover_medium;
		}

		public String getCover_big() {
			return cover_big;
		}

		public void setCover_big(String cover_big) {
			this.cover_big = cover_big;
		}

		public String getCover_xl() {
			return cover_xl;
		}

		public void setCover_xl(String cover_xl) {
			this.cover_xl = cover_xl;
		}

		public Integer getGenre_id() {
			return genre_id;
		}

		public void setGenre_id(Integer genre_id) {
			this.genre_id = genre_id;
		}

		public Integer getNb_tracks() {
			return nb_tracks;
		}

		public void setNb_tracks(Integer nb_tracks) {
			this.nb_tracks = nb_tracks;
		}

		public String getRecord_type() {
			return record_type;
		}

		public void setRecord_type(String record_type) {
			this.record_type = record_type;
		}

		public String getTracklist() {
			return tracklist;
		}

		public void setTracklist(String tracklist) {
			this.tracklist = tracklist;
		}

		public Boolean getExplicit_lyrics() {
			return explicit_lyrics;
		}

		public void setExplicit_lyrics(Boolean explicit_lyrics) {
			this.explicit_lyrics = explicit_lyrics;
		}

		public Artist getArtist() {
			return artist;
		}

		public void setArtist(Artist artist) {
			this.artist = artist;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		@Override
		public String toString() {
			return "Album [id=" + id + ", title=" + title + ", link=" + link + ", cover=" + cover + ", cover_small="
					+ cover_small + ", cover_medium=" + cover_medium + ", cover_big=" + cover_big + ", cover_xl="
					+ cover_xl + ", genre_id=" + genre_id + ", nb_tracks=" + nb_tracks + ", record_type=" + record_type
					+ ", tracklist=" + tracklist + ", explicit_lyrics=" + explicit_lyrics + ", artist=" + artist
					+ ", type=" + type + "]";
		}

		public static class Artist {
			private Integer id;
			private String name;
			private String link;
			private String picture;
			private String picture_small;
			private String picture_medium;
			private String picture_big;
			private String picture_xl;
			private String tracklist;
			private String type;

			public Artist(Integer id, String name, String link, String picture, String picture_small,
					String picture_medium, String picture_big, String picture_xl, String tracklist, String type) {
				this.id = id;
				this.name = name;
				this.link = link;
				this.picture = picture;
				this.picture_small = picture_small;
				this.picture_medium = picture_medium;
				this.picture_big = picture_big;
				this.picture_xl = picture_xl;
				this.tracklist = tracklist;
				this.type = type;
			}

			public Artist() {
				// TODO Auto-generated constructor stub
			}

			public Integer getId() {
				return id;
			}

			public void setId(Integer id) {
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getLink() {
				return link;
			}

			public void setLink(String link) {
				this.link = link;
			}

			public String getPicture() {
				return picture;
			}

			public void setPicture(String picture) {
				this.picture = picture;
			}

			public String getPicture_small() {
				return picture_small;
			}

			public void setPicture_small(String picture_small) {
				this.picture_small = picture_small;
			}

			public String getPicture_medium() {
				return picture_medium;
			}

			public void setPicture_medium(String picture_medium) {
				this.picture_medium = picture_medium;
			}

			public String getPicture_big() {
				return picture_big;
			}

			public void setPicture_big(String picture_big) {
				this.picture_big = picture_big;
			}

			public String getPicture_xl() {
				return picture_xl;
			}

			public void setPicture_xl(String picture_xl) {
				this.picture_xl = picture_xl;
			}

			public String getTracklist() {
				return tracklist;
			}

			public void setTracklist(String tracklist) {
				this.tracklist = tracklist;
			}

			public String getType() {
				return type;
			}

			public void setType(String type) {
				this.type = type;
			}

			@Override
			public String toString() {
				return "Artist [id=" + id + ", name=" + name + ", link=" + link + ", picture=" + picture
						+ ", picture_small=" + picture_small + ", picture_medium=" + picture_medium + ", picture_big="
						+ picture_big + ", picture_xl=" + picture_xl + ", tracklist=" + tracklist + ", type=" + type
						+ "]";
			}

		}
	}
}
