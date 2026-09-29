package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class onPlaylistUpdated implements getApplicationLabel {
    public final MaterialCardView AudioAttributesCompatParcelizer;
    private ImageView IconCompatParcelizer;
    public final TextView RemoteActionCompatParcelizer;
    private TextView read;
    private final MaterialCardView write;

    private onPlaylistUpdated(MaterialCardView materialCardView, MaterialCardView materialCardView2, ImageView imageView, TextView textView, TextView textView2) {
        this.write = materialCardView;
        this.AudioAttributesCompatParcelizer = materialCardView2;
        this.IconCompatParcelizer = imageView;
        this.read = textView;
        this.RemoteActionCompatParcelizer = textView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final MaterialCardView IconCompatParcelizer() {
        return this.write;
    }

    public static onPlaylistUpdated AudioAttributesCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return RemoteActionCompatParcelizer(layoutInflater.inflate(R.layout.layout_hc_recent_updates, viewGroup, false));
    }

    private static onPlaylistUpdated RemoteActionCompatParcelizer(View view) {
        MaterialCardView materialCardView = (MaterialCardView) view;
        int i = R.id.ivRecentUpdate;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivRecentUpdate);
        if (imageView != null) {
            i = R.id.tvRecentUpdate;
            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvRecentUpdate);
            if (textView != null) {
                i = R.id.tvRecentUpdateCount;
                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvRecentUpdateCount);
                if (textView2 != null) {
                    return new onPlaylistUpdated(materialCardView, materialCardView, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
