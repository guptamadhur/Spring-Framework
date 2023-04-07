package web.app.madhurgupta.service;

import web.app.madhurgupta.model.Speaker;
import web.app.madhurgupta.repository.HibernateSpeakerRepositoryImpl;
import web.app.madhurgupta.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    public List<Speaker> findAll() {
        return repository.findAll();
    }

}
