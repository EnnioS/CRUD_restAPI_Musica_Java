package com.gmc.api.service;

import java.util.List;

import com.gmc.api.entity.Album;

public interface IAlbumService {
	
	List<Album> buscarTodos();
	void guardar(Album album);
	void eliminar(int idAlbum);
}
