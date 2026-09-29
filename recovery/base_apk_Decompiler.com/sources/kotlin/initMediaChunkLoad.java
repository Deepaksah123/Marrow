package kotlin;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class initMediaChunkLoad implements getApplicationLabel {
    public final TextView AudioAttributesCompatParcelizer;
    private final ConstraintLayout AudioAttributesImplApi26Parcelizer;
    private View IconCompatParcelizer;
    private TextView MediaBrowserCompatItemReceiver;
    private ConstraintLayout RemoteActionCompatParcelizer;
    private View read;
    public final TextView write;

    private initMediaChunkLoad(ConstraintLayout constraintLayout, View view, View view2, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, TextView textView3) {
        this.AudioAttributesImplApi26Parcelizer = constraintLayout;
        this.read = view;
        this.IconCompatParcelizer = view2;
        this.RemoteActionCompatParcelizer = constraintLayout2;
        this.write = textView;
        this.AudioAttributesCompatParcelizer = textView2;
        this.MediaBrowserCompatItemReceiver = textView3;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public static initMediaChunkLoad AudioAttributesCompatParcelizer(View view) {
        int i = R.id.callbackBaseline;
        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.callbackBaseline);
        if (viewIconCompatParcelizer != null) {
            i = R.id.emailBaseLine;
            View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.emailBaseLine);
            if (viewIconCompatParcelizer2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.tvCallText;
                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCallText);
                if (textView != null) {
                    i = R.id.tvEmailText;
                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvEmailText);
                    if (textView2 != null) {
                        i = R.id.tvQueriesTitle;
                        TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvQueriesTitle);
                        if (textView3 != null) {
                            return new initMediaChunkLoad(constraintLayout, viewIconCompatParcelizer, viewIconCompatParcelizer2, constraintLayout, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
