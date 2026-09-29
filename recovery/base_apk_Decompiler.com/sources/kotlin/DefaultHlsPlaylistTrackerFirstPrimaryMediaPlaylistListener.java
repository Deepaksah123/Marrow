package kotlin;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.marrow.R;
import de.hdodenhof.circleimageview.CircleImageView;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener implements getApplicationLabel {
    public final CircleImageView AudioAttributesCompatParcelizer;
    public final TextView AudioAttributesImplApi21Parcelizer;
    private final ConstraintLayout AudioAttributesImplApi26Parcelizer;
    public final MaterialCardView IconCompatParcelizer;
    public final MaterialCardView RemoteActionCompatParcelizer;
    public final TextView read;
    public final ImageView write;

    private DefaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener(ConstraintLayout constraintLayout, ImageView imageView, CircleImageView circleImageView, MaterialCardView materialCardView, MaterialCardView materialCardView2, TextView textView, TextView textView2) {
        this.AudioAttributesImplApi26Parcelizer = constraintLayout;
        this.write = imageView;
        this.AudioAttributesCompatParcelizer = circleImageView;
        this.RemoteActionCompatParcelizer = materialCardView;
        this.IconCompatParcelizer = materialCardView2;
        this.read = textView;
        this.AudioAttributesImplApi21Parcelizer = textView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public static DefaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener read(View view) {
        int i = R.id.btnEditProfilePicture;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.btnEditProfilePicture);
        if (imageView != null) {
            i = R.id.ivProfilePicture;
            CircleImageView circleImageView = (CircleImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivProfilePicture);
            if (circleImageView != null) {
                i = R.id.profileImageContainer;
                MaterialCardView materialCardView = (MaterialCardView) getApplicationIcon.IconCompatParcelizer(view, R.id.profileImageContainer);
                if (materialCardView != null) {
                    i = R.id.profileInitialsContainer;
                    MaterialCardView materialCardView2 = (MaterialCardView) getApplicationIcon.IconCompatParcelizer(view, R.id.profileInitialsContainer);
                    if (materialCardView2 != null) {
                        i = R.id.tvProLabel;
                        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvProLabel);
                        if (textView != null) {
                            i = R.id.tvProfileInitials;
                            TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvProfileInitials);
                            if (textView2 != null) {
                                return new DefaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener((ConstraintLayout) view, imageView, circleImageView, materialCardView, materialCardView2, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
