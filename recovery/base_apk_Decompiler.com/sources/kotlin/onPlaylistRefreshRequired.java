package kotlin;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class onPlaylistRefreshRequired implements getApplicationLabel {
    public final TextView IconCompatParcelizer;
    private final MaterialCardView RemoteActionCompatParcelizer;
    public final ImageView write;

    private onPlaylistRefreshRequired(MaterialCardView materialCardView, ImageView imageView, TextView textView) {
        this.RemoteActionCompatParcelizer = materialCardView;
        this.write = imageView;
        this.IconCompatParcelizer = textView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final MaterialCardView IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static onPlaylistRefreshRequired RemoteActionCompatParcelizer(View view) {
        int i = R.id.ivVideoItemType;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivVideoItemType);
        if (imageView != null) {
            i = R.id.tvVideoItemTitle;
            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvVideoItemTitle);
            if (textView != null) {
                return new onPlaylistRefreshRequired((MaterialCardView) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
