package kotlin;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class onNewExtractor implements getApplicationLabel {
    public final TextView IconCompatParcelizer;
    private final TextView read;

    private onNewExtractor(TextView textView, TextView textView2) {
        this.read = textView;
        this.IconCompatParcelizer = textView2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public TextView IconCompatParcelizer() {
        return this.read;
    }

    public static onNewExtractor write(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new onNewExtractor(textView, textView);
    }
}
