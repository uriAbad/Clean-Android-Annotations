package uriabad.annotationscontries.presentation.ui.main;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

import uriabad.annotationscontries.R;
import uriabad.annotationscontries.presentation.ui.base.BaseActivity;

@EActivity(R.layout.activity_main)
public class MainActivity extends BaseActivity {

    @Click(R.id.btnMain)
    public void goToCountryListActivity(){
        navigator.goToCountryListActivity();
    }

}
