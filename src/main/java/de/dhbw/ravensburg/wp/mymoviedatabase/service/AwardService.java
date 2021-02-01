package de.dhbw.ravensburg.wp.mymoviedatabase.service;

import de.dhbw.ravensburg.wp.mymoviedatabase.model.Award;
import org.springframework.transaction.annotation.Transactional;

public interface AwardService {
    @Transactional
    void addAward(Award award);
}
