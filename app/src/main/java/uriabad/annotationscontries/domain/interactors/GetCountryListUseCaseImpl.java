package uriabad.annotationscontries.domain.interactors;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;

import java.util.Collection;

import uriabad.annotationscontries.data.repository.CountryDataRepository;
import uriabad.annotationscontries.domain.Exception.ErrorBundle;
import uriabad.annotationscontries.domain.classes.Country;
import uriabad.annotationscontries.domain.repository.CountryRepository;

/**
 * Created by Uri Abad on 26/09/2016.
 * Seidor S.A.
 * oabad@seidor.es
 */

@EBean
public class GetCountryListUseCaseImpl implements GetCountryListUseCase {

    @Bean(CountryDataRepository.class)
    CountryRepository countryRepository;
    Callback callback;

    @Override
    public void Execute(Callback callback) {
        this.callback = callback;
        countryRepository.getCountryList(repositoryCallback);
    }

    public final CountryRepository.CountryListCallback repositoryCallback = new CountryRepository
            .CountryListCallback() {
        @Override
        public void onCountryListLoaded(Collection<Country> countryCollection) {
            notifyCountryListLoaded(countryCollection);
        }

        @Override
        public void onError(ErrorBundle errorBundle) {
            notifyCountryListFailure(errorBundle.getErrorMessage());
        }
    };

    private void notifyCountryListFailure(String error) {
        callback.onError(error);
    }

    private void notifyCountryListLoaded(Collection<Country> countryCollection) {
        callback.onCountryListLoaded(countryCollection);
    }
}
