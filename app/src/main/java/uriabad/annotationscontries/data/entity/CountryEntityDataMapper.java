package uriabad.annotationscontries.data.entity;

import org.androidannotations.annotations.EBean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import uriabad.annotationscontries.domain.classes.Country;

/**
 * Created by Uri Abad on 27/09/2016.
 * Seidor S.A.
 * oabad@seidor.es
 */

@EBean
public class CountryEntityDataMapper {

    public Country transform(CountryEntity countryEntity){
        Country country = null;
        if(countryEntity!=null){
            country = new Country();
            country.setName(countryEntity.getName());
            country.setCapital(countryEntity.getCapital());
        }
        return country;
    }

    public Collection<Country> transform(Collection<CountryEntity> countryEntities){
        List<Country> countryList = new ArrayList<>();
        Country country = null;
        for(CountryEntity countryEntity: countryEntities){
            country = transform(countryEntity);
            if(country!=null){
                countryList.add(country);
            }
        }
        return countryList;
    }
}
