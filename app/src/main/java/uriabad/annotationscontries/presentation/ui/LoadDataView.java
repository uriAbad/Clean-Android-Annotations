package uriabad.annotationscontries.presentation.ui;

/**
 * Created by Uri Abad on 26/09/2016.
 * Seidor S.A.
 * oabad@seidor.es
 */

public interface LoadDataView {

    void showLoading();
    void hideLoading();
    void showRetry();
    void hideRetry();
    void showError(String message);
}
