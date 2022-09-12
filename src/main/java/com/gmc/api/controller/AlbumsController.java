package com.gmc.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gmc.api.entity.Album;
import com.gmc.api.service.IAlbumService;

@RestController
@RequestMapping("/api")
public class AlbumsController {

	@Autowired
	private IAlbumService ServiceAlbums;
	
	@GetMapping("/albums")
	public List<Album> buscaraTodos(){
		return ServiceAlbums.buscarTodos();
		
	}
	
	@PostMapping("/albums")
	public Album modificar(@RequestBody Album album) {
		ServiceAlbums.guardar(album);
		return album;
	}
	
	@PutMapping("/albums")
	public Album guardar(@RequestBody Album album) {
		ServiceAlbums.guardar(album);
		return album;
	}
	
	@DeleteMapping("/albums/{id}")
	public String eliminar(@PathVariable("id") int idAlbum) {
		ServiceAlbums.eliminar(idAlbum);
		return "Registro eliminado";
	}
	
	
}
