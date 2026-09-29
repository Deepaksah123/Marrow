package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class setPlaylistTrackerFactory implements getApplicationLabel {
    public final TextView AudioAttributesCompatParcelizer;
    private ConstraintLayout AudioAttributesImplApi21Parcelizer;
    public final TextView IconCompatParcelizer;
    public final View RemoteActionCompatParcelizer;
    public final View read;
    private final ConstraintLayout write;

    private setPlaylistTrackerFactory(ConstraintLayout constraintLayout, View view, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, View view2) {
        this.write = constraintLayout;
        this.read = view;
        this.AudioAttributesImplApi21Parcelizer = constraintLayout2;
        this.AudioAttributesCompatParcelizer = textView;
        this.IconCompatParcelizer = textView2;
        this.RemoteActionCompatParcelizer = view2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.write;
    }

    public static setPlaylistTrackerFactory read(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return IconCompatParcelizer(layoutInflater.inflate(R.layout.item_lesson_index, viewGroup, false));
    }

    private static setPlaylistTrackerFactory IconCompatParcelizer(View view) {
        int i = R.id.divider;
        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.divider);
        if (viewIconCompatParcelizer != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.tvIndexCount;
            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvIndexCount);
            if (textView != null) {
                i = R.id.tvIndexTitle;
                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvIndexTitle);
                if (textView2 != null) {
                    i = R.id.viewHighlight;
                    View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.viewHighlight);
                    if (viewIconCompatParcelizer2 != null) {
                        return new setPlaylistTrackerFactory(constraintLayout, viewIconCompatParcelizer, constraintLayout, textView, textView2, viewIconCompatParcelizer2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
