package uriabad.annotationscontries.presentation.ui.countryList;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

import uriabad.annotationscontries.R;
import uriabad.annotationscontries.presentation.ui.base.BaseActivity;

@EActivity(R.layout.activity_country_list)
public class CountryListActivity extends BaseActivity {

    @AfterViews
    void addFragment(){
        CountryListFragment countryListFragment = new CountryListFragment_().builder().build();
        replaceFragment(R.id.fl_fragment,countryListFragment);
    }
}
