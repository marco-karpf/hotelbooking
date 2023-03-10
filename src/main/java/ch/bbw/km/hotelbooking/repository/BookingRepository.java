package ch.bbw.km.hotelbooking.repository;

import ch.bbw.km.hotelbooking.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
    List<Booking> findByUserEmail(String email);

    void deleteByUserId(int id);
}
