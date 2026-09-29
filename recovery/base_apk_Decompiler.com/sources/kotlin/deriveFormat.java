package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class deriveFormat implements getApplicationLabel {
    public final TextView IconCompatParcelizer;
    private final TextView RemoteActionCompatParcelizer;

    private deriveFormat(TextView textView, TextView textView2) {
        this.RemoteActionCompatParcelizer = textView;
        this.IconCompatParcelizer = textView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final TextView IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static deriveFormat RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.item_year_signup, viewGroup, false));
    }

    private static deriveFormat write(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new deriveFormat(textView, textView);
    }
}
