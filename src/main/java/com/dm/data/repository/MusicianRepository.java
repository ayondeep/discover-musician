package com.dm.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import com.dm.data.entities.Musician;

@Repository
public interface MusicianRepository extends PagingAndSortingRepository<Musician, Long> {
}
