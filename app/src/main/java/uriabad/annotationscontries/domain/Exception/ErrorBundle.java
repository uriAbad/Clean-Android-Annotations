package uriabad.annotationscontries.domain.Exception;

/**
 * Created by Uri Abad on 26/09/2016.
 * Seidor S.A.
 * oabad@seidor.es
 */

public interface ErrorBundle {
    void setException(Exception exception);
    Exception getException();
    String getErrorMessage();
}
