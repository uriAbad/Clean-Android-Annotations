package uriabad.annotationscontries.presentation.ui.countryList;

import android.content.Context;
import android.view.ViewGroup;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

import uriabad.annotationscontries.presentation.ui.base.RecyclerViewAdapterBase;
import uriabad.annotationscontries.presentation.ui.base.ViewWrapper;
import uriabad.annotationscontries.presentation.ui.model.CountryModel;

/**
 * Created by Uri Abad on 25/09/2016.
 * Seidor S.A.
 * oabad@seidor.es
 */
@EBean
public class CountryAdapter extends RecyclerViewAdapterBase<CountryModel, CountryItemView> {

    @RootContext
    Context context;

    @Override
    protected CountryItemView onCreateItemView(ViewGroup parent, int viewType) {
        return CountryItemView_.build(context);
    }


    @Override
    public void onBindViewHolder(ViewWrapper<CountryItemView> viewHolder, int position) {
        CountryItemView view = viewHolder.getView();
        CountryModel country = items.get(position);

        view.bind(country);
    }

}
