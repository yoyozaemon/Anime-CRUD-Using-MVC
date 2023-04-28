package com.mvcassignment.pes2ug20cs815.repo;

import com.mvcassignment.pes2ug20cs815.model.Anime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAnimeRepository extends JpaRepository<Anime, Long> {
}
