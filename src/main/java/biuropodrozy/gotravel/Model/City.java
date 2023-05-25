package biuropodrozy.gotravel.Model;/*
 * @project gotravel
 * @author kola
 */

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cities")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCity;

    private String nameCity;

    @OneToMany(mappedBy = "idTrip")
    private Set<Trip> trips;

    @OneToMany(mappedBy = "idOwnOffer")
    private Set<OwnOffer> ownOffers;

    @ManyToOne
    @JoinColumn(name = "idCountry")
    private Country country;
}
