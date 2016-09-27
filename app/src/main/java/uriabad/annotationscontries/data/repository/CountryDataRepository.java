package uriabad.annotationscontries.data.repository;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.rest.spring.annotations.RestService;
import org.springframework.web.client.RestClientException;

import java.util.List;

import uriabad.annotationscontries.data.RestCountries;
import uriabad.annotationscontries.data.entity.CountryEntity;
import uriabad.annotationscontries.data.entity.CountryEntityDataMapper;
import uriabad.annotationscontries.data.exception.RepositoryErrorBundle;
import uriabad.annotationscontries.domain.repository.CountryRepository;

/**
 * Created by Uri Abad on 26/09/2016.
 * Seidor S.A.
 * oabad@seidor.es
 */

@EBean
public class CountryDataRepository implements CountryRepository {

    @RestService RestCountries restCountries;
    @Bean CountryEntityDataMapper countryEntityDataMapper;
    @Bean RepositoryErrorBundle repositoryErrorBundle;

    @Override
    public void getCountryList(CountryListCallback countryListCallback) {
        try {
            final List<CountryEntity> countryEntityList = restCountries.getCountries();
            countryListCallback.onCountryListLoaded(countryEntityDataMapper.transform(countryEntityList));
        } catch (RestClientException e) {
            e.printStackTrace();
            repositoryErrorBundle.setException(e);
            countryListCallback.onError(repositoryErrorBundle);
        }
    }

    @Override
    public void getCountryByName(String name, CountryCallback countryCallback) {

    }
}
