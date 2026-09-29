package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class prepareWithMultivariantPlaylistInfo implements getApplicationLabel {
    public final TextView AudioAttributesCompatParcelizer;
    private final ConstraintLayout IconCompatParcelizer;
    public final RecyclerView write;

    private prepareWithMultivariantPlaylistInfo(ConstraintLayout constraintLayout, RecyclerView recyclerView, TextView textView) {
        this.IconCompatParcelizer = constraintLayout;
        this.write = recyclerView;
        this.AudioAttributesCompatParcelizer = textView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static prepareWithMultivariantPlaylistInfo IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return IconCompatParcelizer(layoutInflater.inflate(R.layout.layout_hc_test_main, viewGroup, false));
    }

    private static prepareWithMultivariantPlaylistInfo IconCompatParcelizer(View view) {
        int i = R.id.rvTestList;
        RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rvTestList);
        if (recyclerView != null) {
            i = R.id.tvMainHeading;
            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvMainHeading);
            if (textView != null) {
                return new prepareWithMultivariantPlaylistInfo((ConstraintLayout) view, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
