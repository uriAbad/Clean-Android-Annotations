package uriabad.annotationscontries.presentation.ui.base;


import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;

import uriabad.annotationscontries.presentation.ui.navigation.Navigator;

/**
 * Created by Uri Abad on 22/09/2016.
 * Seidor S.A.
 * oabad@seidor.es
 */

@EActivity
public abstract class BaseActivity extends FragmentActivity {

    @Bean
    public Navigator navigator;

    protected void replaceFragment(int containerViewId, Fragment fragment) {
        FragmentTransaction fragmentTransaction = this.getFragmentManager().beginTransaction();
//        fragmentTransaction.add(containerViewId, fragment);
        fragmentTransaction.replace(containerViewId,fragment);
        fragmentTransaction.commit();
    }
}
