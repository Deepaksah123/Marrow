package kotlin;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class addMediaPlaylistUrls implements getApplicationLabel {
    private LinearLayout IconCompatParcelizer;
    private final ConstraintLayout RemoteActionCompatParcelizer;
    public final ConstraintLayout read;
    private ImageView write;

    private addMediaPlaylistUrls(ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, LinearLayout linearLayout) {
        this.RemoteActionCompatParcelizer = constraintLayout;
        this.write = imageView;
        this.read = constraintLayout2;
        this.IconCompatParcelizer = linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static addMediaPlaylistUrls RemoteActionCompatParcelizer(View view) {
        int i = R.id.ivMockTestIcon;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivMockTestIcon);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llMockTag);
            if (linearLayout != null) {
                return new addMediaPlaylistUrls(constraintLayout, imageView, constraintLayout, linearLayout);
            }
            i = R.id.llMockTag;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
