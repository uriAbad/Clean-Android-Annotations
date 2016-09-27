package uriabad.annotationscontries.presentation.ui.countryList;


import android.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.Collection;

import uriabad.annotationscontries.R;
import uriabad.annotationscontries.presentation.ui.CountryListView;
import uriabad.annotationscontries.presentation.ui.model.CountryModel;

@EFragment(R.layout.fragment_country_list)
public class CountryListFragment extends Fragment implements CountryListView{

    @ViewById
    RecyclerView rvCountries;

    @ViewById
    RelativeLayout rlRetry;

    @ViewById
    Button btnRetry;

    @ViewById
    RelativeLayout rlProgressBar;

    @Bean
    CountryAdapter countryAdapter;

    @Bean(CountryPresenterImpl.class)
    CountryPresenter countryPresenter;


    @Click(R.id.btnRetry)
    void retry(){
        countryPresenter.retry();
    }

    @AfterViews
    void bindAdapter(){
        rvCountries.setAdapter(countryAdapter);
//        test();
    }

    @AfterViews
    void initialize(){
        countryPresenter.setView(this);
        countryPresenter.initialize();
    }

    void test(){
        ArrayList<CountryModel> countries = new ArrayList<>();
        for(int i = 0;i<10; i++){
            CountryModel countryModel = new CountryModel();
            countryModel.setName("name " + i);
            countryModel.setCapital("capital" + i);
            countries.add(countryModel);
        }
        countryAdapter.clear();
        countryAdapter.addAll(countries);
    }

    @Override
    public void renderCountryList(Collection<CountryModel> countryModelCollection) {
        countryAdapter.clear();
        countryAdapter.addAll(countryModelCollection);
    }

    @Override
    public void viewCountry(CountryModel countryModel) {
        //TODO : To implement
    }

    @Override
    public void showLoading() {
        rlProgressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
        rlProgressBar.setVisibility(View.INVISIBLE);
    }

    @Override
    public void showRetry() {
        rlRetry.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideRetry() {
        rlRetry.setVisibility(View.INVISIBLE);
    }

    @Override
    public void showError(String message) {
        Toast.makeText(getActivity(),message,Toast.LENGTH_SHORT).show();
    }
}
