package uriabad.annotationscontries.presentation.ui.countryList;

import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.UiThread;

import java.util.Collection;

import uriabad.annotationscontries.domain.classes.Country;
import uriabad.annotationscontries.domain.interactors.GetCountryListUseCase;
import uriabad.annotationscontries.domain.interactors.GetCountryListUseCaseImpl;
import uriabad.annotationscontries.presentation.ui.CountryListView;
import uriabad.annotationscontries.presentation.ui.mapper.CountryModelDataMapper;
import uriabad.annotationscontries.presentation.ui.model.CountryModel;

/**
 * Created by Uri Abad on 26/09/2016.
 * Seidor S.A.
 * oabad@seidor.es
 */

@EBean
public class CountryPresenterImpl implements CountryPresenter{

    CountryListView countryListView;

    @Bean
    CountryModelDataMapper countryModelDataMapper;

    @Bean(GetCountryListUseCaseImpl.class)
    GetCountryListUseCase getCountryUseCase;

    public void initialize() {
        countryListView.showLoading();
        requestCountryCollection();
    }

    @Override
    public void retry() {
        countryListView.hideRetry();
        countryListView.showLoading();
        requestCountryCollection();
    }

    @Override
    public void setView(CountryListView countryListView) {
        this.countryListView = countryListView;
    }

    @Background
    void requestCountryCollection(){
        getCountryUseCase.Execute(listCallback);
    }

    @UiThread
    void showCountryCollectionInView(Collection<Country> countryCollection){
        final Collection<CountryModel> countryModelCollection = countryModelDataMapper
                .transform(countryCollection);
        countryListView.renderCountryList(countryModelCollection);
        countryListView.hideLoading();
    }

    @UiThread
    void showErrorInView(String error){
        countryListView.hideLoading();
        countryListView.showError(error);
        countryListView.showRetry();
    }

    private final GetCountryListUseCase.Callback listCallback = new GetCountryListUseCase
            .Callback() {
        @Override
        public void onCountryListLoaded(Collection<Country> countryCollection) {
            showCountryCollectionInView(countryCollection);
        }

        @Override
        public void onError(String error) {

        }
    };
}
