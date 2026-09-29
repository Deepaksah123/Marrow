package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class assertIsPrepared implements getApplicationLabel {
    public final TextView RemoteActionCompatParcelizer;
    private final TextView write;

    private assertIsPrepared(TextView textView, TextView textView2) {
        this.write = textView;
        this.RemoteActionCompatParcelizer = textView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final TextView IconCompatParcelizer() {
        return this.write;
    }

    public static assertIsPrepared IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.item_recent_update_tag1, viewGroup, false));
    }

    private static assertIsPrepared write(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new assertIsPrepared(textView, textView);
    }
}
