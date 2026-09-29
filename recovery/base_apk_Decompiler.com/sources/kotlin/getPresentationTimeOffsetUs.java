package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class getPresentationTimeOffsetUs implements getApplicationLabel {
    public final TextView AudioAttributesCompatParcelizer;
    public final TextView IconCompatParcelizer;
    public final TextView read;
    private final FrameLayout write;

    private getPresentationTimeOffsetUs(FrameLayout frameLayout, TextView textView, TextView textView2, TextView textView3) {
        this.write = frameLayout;
        this.IconCompatParcelizer = textView;
        this.AudioAttributesCompatParcelizer = textView2;
        this.read = textView3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public FrameLayout IconCompatParcelizer() {
        return this.write;
    }

    public static getPresentationTimeOffsetUs write(LayoutInflater layoutInflater) {
        return AudioAttributesCompatParcelizer(layoutInflater);
    }

    private static getPresentationTimeOffsetUs AudioAttributesCompatParcelizer(LayoutInflater layoutInflater) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.dialog_delete_queued_video, (ViewGroup) null, false));
    }

    private static getPresentationTimeOffsetUs AudioAttributesCompatParcelizer(View view) {
        int i = R.id.dialog_highlight_btn;
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.dialog_highlight_btn);
        if (textView != null) {
            i = R.id.dialog_msg;
            TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.dialog_msg);
            if (textView2 != null) {
                i = R.id.dialog_neglect_btn;
                TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.dialog_neglect_btn);
                if (textView3 != null) {
                    return new getPresentationTimeOffsetUs((FrameLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
