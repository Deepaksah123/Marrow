package kotlin;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ProgramInformation implements getApplicationLabel {
    private final CardView IconCompatParcelizer;
    public final TextView RemoteActionCompatParcelizer;
    private RelativeLayout read;
    public final TextView write;

    private ProgramInformation(CardView cardView, TextView textView, TextView textView2, RelativeLayout relativeLayout) {
        this.IconCompatParcelizer = cardView;
        this.write = textView;
        this.RemoteActionCompatParcelizer = textView2;
        this.read = relativeLayout;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final CardView IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static ProgramInformation AudioAttributesCompatParcelizer(View view) {
        int i = R.id.tvAnswersChangedDesc;
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvAnswersChangedDesc);
        if (textView != null) {
            i = R.id.tvAnswersChangedTitle;
            TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvAnswersChangedTitle);
            if (textView2 != null) {
                i = R.id.vGuessCardBackground;
                RelativeLayout relativeLayout = (RelativeLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.vGuessCardBackground);
                if (relativeLayout != null) {
                    return new ProgramInformation((CardView) view, textView, textView2, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
