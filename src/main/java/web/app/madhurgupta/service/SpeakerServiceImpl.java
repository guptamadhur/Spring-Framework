package web.app.madhurgupta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.app.madhurgupta.model.Speaker;
import web.app.madhurgupta.repository.HibernateSpeakerRepositoryImpl;
import web.app.madhurgupta.repository.SpeakerRepository;

import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl(){
        System.out.println("SpeakerServiceImpl no args Constructor");
    }
    
    @Autowired
    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        System.out.println("SpeakerServiceImpl repository Constructor");
        repository = speakerRepository;
    }

    public List<Speaker> findAll() {
        return repository.findAll();
    }

    @Autowired
    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl repository setter");
        this.repository = repository;
    }
}
