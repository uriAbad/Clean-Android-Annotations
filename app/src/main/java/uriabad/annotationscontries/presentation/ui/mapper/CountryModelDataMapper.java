package uriabad.annotationscontries.presentation.ui.mapper;

import org.androidannotations.annotations.EBean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import uriabad.annotationscontries.domain.classes.Country;
import uriabad.annotationscontries.presentation.ui.model.CountryModel;

/**
 * Created by Uri Abad on 26/09/2016.
 * Seidor S.A.
 * oabad@seidor.es
 */

@EBean
public class CountryModelDataMapper {

    public CountryModel transform(Country country){
        if (country == null) {
            throw new IllegalArgumentException("Cannot transform a null value");
        }
        CountryModel countryModel = new CountryModel();
        countryModel.setName(country.getName());
        countryModel.setCapital(country.getCapital());
        return countryModel;
    }

    public Collection<CountryModel> transform(Collection<Country> countries){
        Collection<CountryModel> countryModels;
        if(countries!=null && !countries.isEmpty()){
            countryModels = new ArrayList<>();
            for(Country country: countries){
                countryModels.add(transform(country));
            }
        }else{
            countryModels = Collections.emptyList();
        }
        return countryModels;
    }

    }