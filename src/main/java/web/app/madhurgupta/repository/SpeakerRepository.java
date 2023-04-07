package web.app.madhurgupta.repository;

import web.app.madhurgupta.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
