package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class UrlTemplate implements getApplicationLabel {
    public final TextView AudioAttributesCompatParcelizer;
    public final Button IconCompatParcelizer;
    private final ScrollView RemoteActionCompatParcelizer;
    public final TextView read;

    private UrlTemplate(ScrollView scrollView, Button button, TextView textView, TextView textView2) {
        this.RemoteActionCompatParcelizer = scrollView;
        this.IconCompatParcelizer = button;
        this.read = textView;
        this.AudioAttributesCompatParcelizer = textView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final ScrollView IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static UrlTemplate IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return read(layoutInflater.inflate(R.layout.dialog_fragment_tnc, viewGroup, false));
    }

    private static UrlTemplate read(View view) {
        int i = R.id.dialog_confirmation_highlight_button;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.dialog_confirmation_highlight_button);
        if (button != null) {
            i = R.id.tvMsg;
            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvMsg);
            if (textView != null) {
                i = R.id.tvTitle;
                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTitle);
                if (textView2 != null) {
                    return new UrlTemplate((ScrollView) view, button, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
