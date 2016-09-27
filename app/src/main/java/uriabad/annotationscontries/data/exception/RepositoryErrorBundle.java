package uriabad.annotationscontries.data.exception;

import org.androidannotations.annotations.EBean;

import uriabad.annotationscontries.domain.Exception.ErrorBundle;

/**
 * Created by Uri Abad on 27/09/2016.
 * Seidor S.A.
 * oabad@seidor.es
 */

@EBean
public class RepositoryErrorBundle implements ErrorBundle {

    private Exception exception;

    @Override
    public void setException(Exception exception) {
        this.exception = exception;
    }

    @Override
    public Exception getException() {
        return null;
    }

    @Override
    public String getErrorMessage() {
        return null;
    }
}
