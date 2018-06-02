package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import java.time.Instant;
import java.util.Date;

@Entity
public class PlayDate {

    @Id
    private int id;

    @Column(nullable = false, name = "start_time",columnDefinition= "TIMESTAMP WITH TIME ZONE")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date firstTimestamp = new Date();

    @Column(nullable = false, name = "start_time2",columnDefinition= "TIMESTAMP WITH TIME ZONE")
    private Instant secondTimestamp = Instant.now();
}
