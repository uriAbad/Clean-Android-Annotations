package uriabad.annotationscontries.presentation.ui.countryList;

import uriabad.annotationscontries.presentation.ui.CountryListView;
import uriabad.annotationscontries.presentation.ui.base.BasePresenter;

/**
 * Created by Uri Abad on 26/09/2016.
 * Seidor S.A.
 * oabad@seidor.es
 */

public interface CountryPresenter extends BasePresenter {

    void setView(CountryListView countryListView);

    void initialize();

    void retry();
}
