package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class excludePlaylist implements getApplicationLabel {
    public final TextView AudioAttributesCompatParcelizer;
    public final TextView IconCompatParcelizer;
    private ConstraintLayout RemoteActionCompatParcelizer;
    private View read;
    private final ConstraintLayout write;

    private excludePlaylist(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, View view, TextView textView, TextView textView2) {
        this.write = constraintLayout;
        this.RemoteActionCompatParcelizer = constraintLayout2;
        this.read = view;
        this.IconCompatParcelizer = textView;
        this.AudioAttributesCompatParcelizer = textView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.write;
    }

    public static excludePlaylist write(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return read(layoutInflater.inflate(R.layout.row_month_revamp_test, viewGroup, false));
    }

    private static excludePlaylist read(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.monthDivider;
        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.monthDivider);
        if (viewIconCompatParcelizer != null) {
            i = R.id.tvMonth;
            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvMonth);
            if (textView != null) {
                i = R.id.tvMonthTypeLabel;
                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvMonthTypeLabel);
                if (textView2 != null) {
                    return new excludePlaylist(constraintLayout, constraintLayout, viewIconCompatParcelizer, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
