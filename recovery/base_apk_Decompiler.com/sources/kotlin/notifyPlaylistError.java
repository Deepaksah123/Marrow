package kotlin;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class notifyPlaylistError implements getApplicationLabel {
    private final ConstraintLayout AudioAttributesCompatParcelizer;
    private TextView IconCompatParcelizer;
    public final TextView RemoteActionCompatParcelizer;
    public final TextView write;

    private notifyPlaylistError(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        this.AudioAttributesCompatParcelizer = constraintLayout;
        this.RemoteActionCompatParcelizer = textView;
        this.write = textView2;
        this.IconCompatParcelizer = textView3;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static notifyPlaylistError read(View view) {
        int i = R.id.tvFilter;
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvFilter);
        if (textView != null) {
            i = R.id.tvSubtitle;
            TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSubtitle);
            if (textView2 != null) {
                i = R.id.tvTitle;
                TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTitle);
                if (textView3 != null) {
                    return new notifyPlaylistError((ConstraintLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
