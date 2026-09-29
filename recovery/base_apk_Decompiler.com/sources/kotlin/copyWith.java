package kotlin;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class copyWith implements getApplicationLabel {
    public final ImageView AudioAttributesCompatParcelizer;
    public final LinearLayout IconCompatParcelizer;
    public final TextView RemoteActionCompatParcelizer;
    public final ImageView read;
    private final LinearLayout write;

    private copyWith(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, TextView textView, LinearLayout linearLayout2) {
        this.write = linearLayout;
        this.read = imageView;
        this.AudioAttributesCompatParcelizer = imageView2;
        this.RemoteActionCompatParcelizer = textView;
        this.IconCompatParcelizer = linearLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.write;
    }

    public static copyWith AudioAttributesCompatParcelizer(View view) {
        int i = R.id.action_back;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.action_back);
        if (imageView != null) {
            i = R.id.action_search;
            ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.action_search);
            if (imageView2 != null) {
                i = R.id.title_bar_center_title;
                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.title_bar_center_title);
                if (textView != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    return new copyWith(linearLayout, imageView, imageView2, textView, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
