package pl.bykowski.springbootimageuploader.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.bykowski.springbootimageuploader.model.AppUser;
import pl.bykowski.springbootimageuploader.model.Image;

@Repository
public interface ImageRepo extends JpaRepository<Image, Long> {

}
