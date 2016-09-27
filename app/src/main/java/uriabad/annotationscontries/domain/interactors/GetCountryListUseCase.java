package uriabad.annotationscontries.domain.interactors;

import java.util.Collection;

import uriabad.annotationscontries.domain.classes.Country;

/**
 * Created by Uri Abad on 26/09/2016.
 * Seidor S.A.
 * oabad@seidor.es
 */

public interface GetCountryListUseCase {

    interface Callback {
        void onCountryListLoaded(Collection<Country> countryCollection);
        void onError(String error);
    }

    void Execute (Callback callback);
}
