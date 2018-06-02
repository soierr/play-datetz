package play.spring.boot;

import model.PlayDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import repository.PaymentsRepository;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.util.Date;

@SpringBootApplication(scanBasePackageClasses = PaymentsRepository.class)
@EnableJpaRepositories(basePackageClasses = PaymentsRepository.class)
@EntityScan(basePackageClasses = PlayDate.class)
public class App {

    public static void main( String[] args ){
        new SpringApplicationBuilder()
                .properties("spring.config.name: db, http")
                .sources(App.class)
                .build()
                .run();

/*        Instant instantNow = Instant.now();
        Date date = Date.from(instantNow);
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instantNow, ZoneId.of("America/New_York"));
        Timestamp timestamp = new Timestamp(instantNow.toEpochMilli())

        System.out.println("Instant get result: " + instantNow.toEpochMilli());
        System.out.println("Instant date formatted: " + instantNow.toString());
        System.out.println("Date get result: " + date.getTime());
        System.out.println("ZonedDateTime get result: " + zonedDateTime.toEpochSecond() + "." + zonedDateTime.get(ChronoField.MILLI_OF_SECOND));
        System.out.println("ZonedDateTime formatted: " + zonedDateTime.toString());
        System.out.println("Timestamp: " + timestamp);
        System.out.println("Timestamp: " + timestamp);*/
    }
}
