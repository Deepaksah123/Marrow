package kotlin;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class getMultivariantPlaylist implements getApplicationLabel {
    private TextView RemoteActionCompatParcelizer;
    private final TextView read;

    private getMultivariantPlaylist(TextView textView, TextView textView2) {
        this.read = textView;
        this.RemoteActionCompatParcelizer = textView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final TextView IconCompatParcelizer() {
        return this.read;
    }

    public static getMultivariantPlaylist write(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new getMultivariantPlaylist(textView, textView);
    }
}
