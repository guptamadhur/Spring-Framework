package web.app.madhurgupta.repository;

import web.app.madhurgupta.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Madhur");
        speaker.setLastName("Gupta");

        speakers.add(speaker);

        return speakers;
    }

}
