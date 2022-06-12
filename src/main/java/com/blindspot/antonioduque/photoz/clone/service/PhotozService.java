package com.blindspot.antonioduque.photoz.clone.service;

import com.blindspot.antonioduque.photoz.clone.model.Photo;
import com.blindspot.antonioduque.photoz.clone.repository.PhotozRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Component
@Service
public class PhotozService {

    private final PhotozRepository photozRepository;

    @Autowired
    public PhotozService(PhotozRepository photozRepository) {
        this.photozRepository = photozRepository;
    }

    public Iterable<Photo> findAll() {
        return photozRepository.findAll();
    }

    public Photo getOne(Integer id) {
        return photozRepository.findById(id).orElse(null);
    }

    public void remove(Integer id) {
        photozRepository.deleteById(id);
    }

    public Photo save(String fileName, String contentType, byte[] data) {
        Photo photo = new Photo();
        photo.setContentType(contentType);
        photo.setFileName(fileName);
        photo.setData(data);
        photozRepository.save(photo);
        return photo;
    }
}
