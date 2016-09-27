package uriabad.annotationscontries.presentation.ui.countryList;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

import uriabad.annotationscontries.R;
import uriabad.annotationscontries.presentation.ui.model.CountryModel;

/**
 * Created by Uri Abad on 25/09/2016.
 * Seidor S.A.
 * oabad@seidor.es
 */

@EViewGroup(R.layout.card_country)
public class CountryItemView extends LinearLayout {

    @ViewById
    TextView tvName;

    @ViewById
    TextView tvCapital;

    public CountryItemView(Context context) {
        super(context);
    }

    public void bind(CountryModel country){
        tvName.setText(country.getName());
        tvCapital.setText(country.getCapital());
    }

}
