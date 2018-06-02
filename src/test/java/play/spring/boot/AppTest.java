package play.spring.boot;

import model.PlayDate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import repository.PaymentsRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class, properties = "spring.config.name: db, http")
public class AppTest{

    @Autowired
    private PaymentsRepository paymentsRepository;

    @Test
    public void testTimestamp(){

        paymentsRepository.save(new PlayDate());
    }
}
