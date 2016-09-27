package uriabad.annotationscontries.presentation.ui;

import java.util.Collection;

import uriabad.annotationscontries.presentation.ui.model.CountryModel;

/**
 * Created by Uri Abad on 26/09/2016.
 * Seidor S.A.
 * oabad@seidor.es
 */

public interface CountryListView extends LoadDataView {

    void renderCountryList(Collection<CountryModel> countryModelCollection);
    void viewCountry(CountryModel countryModel);

}
