package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes5.dex */
public final class HlsSampleStreamWrapper implements getApplicationLabel {
    public final TextView AudioAttributesCompatParcelizer;
    public final TextView IconCompatParcelizer;
    private final LinearLayout RemoteActionCompatParcelizer;
    public final LinearLayout read;

    private HlsSampleStreamWrapper(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        this.RemoteActionCompatParcelizer = linearLayout;
        this.read = linearLayout2;
        this.AudioAttributesCompatParcelizer = textView;
        this.IconCompatParcelizer = textView2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public LinearLayout IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static HlsSampleStreamWrapper RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return read(layoutInflater.inflate(R.layout.item_setting_nav, viewGroup, false));
    }

    private static HlsSampleStreamWrapper read(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.title;
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.title);
        if (textView != null) {
            i = R.id.value;
            TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.value);
            if (textView2 != null) {
                return new HlsSampleStreamWrapper(linearLayout, linearLayout, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
