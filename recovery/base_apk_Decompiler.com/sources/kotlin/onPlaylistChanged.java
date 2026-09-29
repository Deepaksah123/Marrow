package kotlin;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class onPlaylistChanged implements getApplicationLabel {
    private final MaterialCardView AudioAttributesCompatParcelizer;
    public final TextView IconCompatParcelizer;
    public final ImageView read;

    private onPlaylistChanged(MaterialCardView materialCardView, ImageView imageView, TextView textView) {
        this.AudioAttributesCompatParcelizer = materialCardView;
        this.read = imageView;
        this.IconCompatParcelizer = textView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final MaterialCardView IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static onPlaylistChanged write(View view) {
        int i = R.id.ivVideoItemType;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivVideoItemType);
        if (imageView != null) {
            i = R.id.tvVideoItemTitle;
            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvVideoItemTitle);
            if (textView != null) {
                return new onPlaylistChanged((MaterialCardView) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
