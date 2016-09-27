package uriabad.annotationscontries.domain.repository;

import java.util.Collection;

import uriabad.annotationscontries.domain.Exception.ErrorBundle;
import uriabad.annotationscontries.domain.classes.Country;

/**
 * Created by Uri Abad on 26/09/2016.
 * Seidor S.A.
 * oabad@seidor.es
 */

public interface CountryRepository {

    /**
     * GET ALL COUNTRIES
     */
    interface CountryListCallback{
        void onCountryListLoaded(Collection<Country> countryCollection);
        void onError(ErrorBundle errorBundle);
    }

    void getCountryList(CountryListCallback countryListCallback);


    /**
     * GET ONE COUNTRY
     */
    interface CountryCallback{
        void onCountryLoaded(Country country);
        void onError(String Error);
    }

    void getCountryByName(String name,CountryCallback countryCallback);
}
