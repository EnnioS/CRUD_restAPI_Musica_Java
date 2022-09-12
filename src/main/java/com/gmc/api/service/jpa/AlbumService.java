package com.gmc.api.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmc.api.entity.Album;
import com.gmc.api.repository.AlbumsRepository;
import com.gmc.api.service.IAlbumService;


@Service
public class AlbumService implements IAlbumService {

	@Autowired
	private AlbumsRepository repoAlbums;
	
	
	@Override
	public List<Album> buscarTodos() {
		return repoAlbums.findAll();
		
	}


	@Override
	public void guardar(Album album) {
		repoAlbums.save(album);
		
	}


	@Override
	public void eliminar(int idAlbum) {
		repoAlbums.deleteById(idAlbum);
		
	}

}
