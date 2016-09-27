package uriabad.annotationscontries.data;

import org.androidannotations.rest.spring.annotations.Get;
import org.androidannotations.rest.spring.annotations.Rest;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.util.List;

import uriabad.annotationscontries.data.entity.CountryEntity;

/**
 * Created by Uri Abad on 26/09/2016.
 * Seidor S.A.
 * oabad@seidor.es
 */


@Rest(rootUrl = "https://restcountries.eu/rest/v1",
    converters = { MappingJackson2HttpMessageConverter.class, StringHttpMessageConverter.class })
public interface RestCountries {

    @Get("/all")
    List<CountryEntity> getCountries();
}
