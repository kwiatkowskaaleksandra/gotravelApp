package biuropodrozy.gotravel.Service.ServiceImpl;/*
 * @project gotravel
 * @author kola
 */

import biuropodrozy.gotravel.Model.Reservation;
import biuropodrozy.gotravel.Repository.ReservationRepository;
import biuropodrozy.gotravel.Service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository reservationRepository;

    @Override
    public Reservation saveReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation getReservationsByIdReservation(Long idReservation) {
        return reservationRepository.findReservationsByIdReservation(idReservation);
    }

    @Override
    public Reservation getTopByOrderByIdReservation() {
        return reservationRepository.findTopByOrderByIdReservationDesc();
    }

    @Override
    public List<Reservation> getReservationByIdUser(Long idUser) {
        return reservationRepository.findReservationsByUser_Id(idUser);
    }

    @Override
    public void deleteReservation(Reservation reservation) {
        reservationRepository.delete(reservation);
    }
}
