package com.mvcassignment.pes2ug20cs815.service;

import com.mvcassignment.pes2ug20cs815.model.Anime;
import com.mvcassignment.pes2ug20cs815.repo.IAnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimeService {

    @Autowired
    IAnimeRepository animeRepo;

    public List<Anime> getAllAnime() {
        List<Anime> animeList = new ArrayList<>();
        animeRepo.findAll().forEach(anime -> animeList.add(anime));

        return animeList;
    }

    public Anime getAnimeById(Long id) {
        return animeRepo.findById(id).get();
    }

    public boolean saveOrUpdateAnime(Anime anime) {
        Anime updatedAnime = animeRepo.save(anime);

        if (animeRepo.findById(updatedAnime.getId()) != null) {
            return true;
        }

        return false;
    }

    public boolean deleteAnime(Long id) {
        animeRepo.deleteById(id);

        if (animeRepo.findById(id) != null) {
            return true;
        }

        return false;
    }

}
