package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class getPrimaryTrackGroupIndex implements getApplicationLabel {
    private final MaterialCardView AudioAttributesCompatParcelizer;
    public final TextView IconCompatParcelizer;
    private TextView RemoteActionCompatParcelizer;
    public final MaterialCardView read;
    private ImageView write;

    private getPrimaryTrackGroupIndex(MaterialCardView materialCardView, MaterialCardView materialCardView2, ImageView imageView, TextView textView, TextView textView2) {
        this.AudioAttributesCompatParcelizer = materialCardView;
        this.read = materialCardView2;
        this.write = imageView;
        this.RemoteActionCompatParcelizer = textView;
        this.IconCompatParcelizer = textView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final MaterialCardView IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static getPrimaryTrackGroupIndex RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.layout_hc_magic_module, viewGroup, false));
    }

    private static getPrimaryTrackGroupIndex AudioAttributesCompatParcelizer(View view) {
        MaterialCardView materialCardView = (MaterialCardView) view;
        int i = R.id.ivMagicModule;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivMagicModule);
        if (imageView != null) {
            i = R.id.tvMagicModule;
            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvMagicModule);
            if (textView != null) {
                i = R.id.tvMagicModuleSubTitle;
                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvMagicModuleSubTitle);
                if (textView2 != null) {
                    return new getPrimaryTrackGroupIndex(materialCardView, materialCardView, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
