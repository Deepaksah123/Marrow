package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class getSegmentTimeUs implements getApplicationLabel {
    public final EditText AudioAttributesCompatParcelizer;
    private final ScrollView AudioAttributesImplApi21Parcelizer;
    private LinearLayout AudioAttributesImplBaseParcelizer;
    public final TextView IconCompatParcelizer;
    public final ProgressBar MediaBrowserCompatItemReceiver;
    public final TextView RemoteActionCompatParcelizer;
    public final TextView read;
    public final Button write;

    private getSegmentTimeUs(ScrollView scrollView, Button button, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout, EditText editText, ProgressBar progressBar) {
        this.AudioAttributesImplApi21Parcelizer = scrollView;
        this.write = button;
        this.IconCompatParcelizer = textView;
        this.read = textView2;
        this.RemoteActionCompatParcelizer = textView3;
        this.AudioAttributesImplBaseParcelizer = linearLayout;
        this.AudioAttributesCompatParcelizer = editText;
        this.MediaBrowserCompatItemReceiver = progressBar;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final ScrollView IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public static getSegmentTimeUs IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return read(layoutInflater.inflate(R.layout.dialog_fragment_feedback, viewGroup, false));
    }

    private static getSegmentTimeUs read(View view) {
        int i = R.id.btnSubmit;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnSubmit);
        if (button != null) {
            i = R.id.character_count_text;
            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.character_count_text);
            if (textView != null) {
                i = R.id.dialogSubTitleView;
                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.dialogSubTitleView);
                if (textView2 != null) {
                    i = R.id.dialogTitleView;
                    TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.dialogTitleView);
                    if (textView3 != null) {
                        i = R.id.errorReportView;
                        LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.errorReportView);
                        if (linearLayout != null) {
                            i = R.id.feedbackMsgView;
                            EditText editText = (EditText) getApplicationIcon.IconCompatParcelizer(view, R.id.feedbackMsgView);
                            if (editText != null) {
                                i = R.id.progressBar;
                                ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.progressBar);
                                if (progressBar != null) {
                                    return new getSegmentTimeUs((ScrollView) view, button, textView, textView2, textView3, linearLayout, editText, progressBar);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
