package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes5.dex */
public final class setElapsedRealTimeOffsetMs implements getApplicationLabel {
    private FrameLayout AudioAttributesCompatParcelizer;
    private final FrameLayout IconCompatParcelizer;
    public final TextView RemoteActionCompatParcelizer;
    public final View read;
    public final View write;

    private setElapsedRealTimeOffsetMs(FrameLayout frameLayout, View view, FrameLayout frameLayout2, TextView textView, View view2) {
        this.IconCompatParcelizer = frameLayout;
        this.write = view;
        this.AudioAttributesCompatParcelizer = frameLayout2;
        this.RemoteActionCompatParcelizer = textView;
        this.read = view2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public FrameLayout IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static setElapsedRealTimeOffsetMs RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.interactive_panel_text_layout, viewGroup, false);
        viewGroup.addView(viewInflate);
        return RemoteActionCompatParcelizer(viewInflate);
    }

    private static setElapsedRealTimeOffsetMs RemoteActionCompatParcelizer(View view) {
        int i = R.id.rectangleView;
        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.rectangleView);
        if (viewIconCompatParcelizer != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            i = R.id.tvLabel;
            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvLabel);
            if (textView != null) {
                i = R.id.verticalLine;
                View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.verticalLine);
                if (viewIconCompatParcelizer2 != null) {
                    return new setElapsedRealTimeOffsetMs(frameLayout, viewIconCompatParcelizer, frameLayout, textView, viewIconCompatParcelizer2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
