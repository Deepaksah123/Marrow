package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class SegmentBaseSegmentList implements getApplicationLabel {
    public final ScrollView AudioAttributesCompatParcelizer;
    public final TextView IconCompatParcelizer;
    public final Button RemoteActionCompatParcelizer;
    private final ScrollView read;
    public final TextView write;

    private SegmentBaseSegmentList(ScrollView scrollView, Button button, ScrollView scrollView2, TextView textView, TextView textView2) {
        this.read = scrollView;
        this.RemoteActionCompatParcelizer = button;
        this.AudioAttributesCompatParcelizer = scrollView2;
        this.write = textView;
        this.IconCompatParcelizer = textView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ScrollView IconCompatParcelizer() {
        return this.read;
    }

    public static SegmentBaseSegmentList RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.dialog_fragment_info, viewGroup, false));
    }

    private static SegmentBaseSegmentList AudioAttributesCompatParcelizer(View view) {
        int i = R.id.btnHightlight;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnHightlight);
        if (button != null) {
            ScrollView scrollView = (ScrollView) view;
            i = R.id.tvContent;
            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvContent);
            if (textView != null) {
                i = R.id.tvTitle;
                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTitle);
                if (textView2 != null) {
                    return new SegmentBaseSegmentList(scrollView, button, scrollView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
