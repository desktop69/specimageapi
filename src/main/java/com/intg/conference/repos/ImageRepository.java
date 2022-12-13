package com.intg.conference.repos;
import java.util.Optional;
import  com.intg.conference.entities.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
public interface ImageRepository extends JpaRepository<Image , Long> {
    @Query("select i from Image i where i.name = ?1")
    public Image findImageByName(String name) ;

    @Query("select i from Image i where i.idImage = ?1")
    public Optional<Image> findImageById(Long id) ;

}
