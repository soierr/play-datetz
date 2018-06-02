package repository;

import model.PlayDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PaymentsRepository extends JpaRepository<PlayDate, String> {


}
