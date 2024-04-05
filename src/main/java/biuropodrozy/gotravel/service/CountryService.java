package biuropodrozy.gotravel.service;

import biuropodrozy.gotravel.model.Country;

import java.util.List;

/**
 * The interface Country service.
 */
public interface CountryService {

    /**
     * Get all countries.
     *
     * @return list of countries.
     */
    List<Country> getAllCountries();

}
