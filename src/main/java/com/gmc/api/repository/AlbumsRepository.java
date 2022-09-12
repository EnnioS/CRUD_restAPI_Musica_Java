package com.gmc.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmc.api.entity.Album;

public interface AlbumsRepository extends JpaRepository<Album, Integer> {

}
