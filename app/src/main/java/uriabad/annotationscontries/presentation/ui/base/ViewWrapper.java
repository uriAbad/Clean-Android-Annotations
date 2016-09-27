package uriabad.annotationscontries.presentation.ui.base;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Uri Abad on 25/09/2016.
 * Seidor S.A.
 * oabad@seidor.es
 */

public class ViewWrapper<V extends View> extends RecyclerView.ViewHolder {

    private V view;

    public ViewWrapper(V itemView) {
        super(itemView);
        view = itemView;
    }

    public V getView() {
        return view;
    }
}
