package kotlin;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes.dex */
public final class getAdaptationSetIndex implements getApplicationLabel {
    private LinearLayout AudioAttributesCompatParcelizer;
    public final Button IconCompatParcelizer;
    private TextView RemoteActionCompatParcelizer;
    private final LinearLayout write;

    private getAdaptationSetIndex(LinearLayout linearLayout, Button button, LinearLayout linearLayout2, TextView textView) {
        this.write = linearLayout;
        this.IconCompatParcelizer = button;
        this.AudioAttributesCompatParcelizer = linearLayout2;
        this.RemoteActionCompatParcelizer = textView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.write;
    }

    public static getAdaptationSetIndex RemoteActionCompatParcelizer(View view) {
        int i = R.id.btnUpdateYear;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnUpdateYear);
        if (button != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvYearUpdateText);
            if (textView != null) {
                return new getAdaptationSetIndex(linearLayout, button, linearLayout, textView);
            }
            i = R.id.tvYearUpdateText;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
