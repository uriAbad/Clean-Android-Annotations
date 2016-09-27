package uriabad.annotationscontries.presentation.ui.navigation;

import android.content.Context;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

import uriabad.annotationscontries.presentation.ui.countryList.CountryListActivity_;

/**
 * Created by Uri Abad on 22/09/2016.
 * Seidor S.A.
 * oabad@seidor.es
 */

@EBean
public class Navigator {

    @RootContext
    Context context;

    public void goToCountryListActivity() {
        CountryListActivity_.intent(context).start();
    }
}
