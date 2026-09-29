package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class setTimestampAdjusterInitializationTimeoutMs implements getApplicationLabel {
    public final TextView AudioAttributesCompatParcelizer;
    public final View AudioAttributesImplApi21Parcelizer;
    private ConstraintLayout AudioAttributesImplApi26Parcelizer;
    private ConstraintLayout AudioAttributesImplBaseParcelizer;
    public final ImageView IconCompatParcelizer;
    public final View MediaBrowserCompatCustomActionResultReceiver;
    private ImageView MediaBrowserCompatItemReceiver;
    private final ConstraintLayout MediaMetadataCompat;
    public final MaterialCardView RemoteActionCompatParcelizer;
    public final TextView read;
    public final TextView write;

    private setTimestampAdjusterInitializationTimeoutMs(ConstraintLayout constraintLayout, MaterialCardView materialCardView, ImageView imageView, ConstraintLayout constraintLayout2, ImageView imageView2, ConstraintLayout constraintLayout3, TextView textView, TextView textView2, TextView textView3, View view, View view2) {
        this.MediaMetadataCompat = constraintLayout;
        this.RemoteActionCompatParcelizer = materialCardView;
        this.IconCompatParcelizer = imageView;
        this.AudioAttributesImplApi26Parcelizer = constraintLayout2;
        this.MediaBrowserCompatItemReceiver = imageView2;
        this.AudioAttributesImplBaseParcelizer = constraintLayout3;
        this.write = textView;
        this.AudioAttributesCompatParcelizer = textView2;
        this.read = textView3;
        this.AudioAttributesImplApi21Parcelizer = view;
        this.MediaBrowserCompatCustomActionResultReceiver = view2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.MediaMetadataCompat;
    }

    public static setTimestampAdjusterInitializationTimeoutMs AudioAttributesCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.item_pc_qbank_subject, viewGroup, false));
    }

    private static setTimestampAdjusterInitializationTimeoutMs AudioAttributesCompatParcelizer(View view) {
        int i = R.id.cardPracticalCornerSubject;
        MaterialCardView materialCardView = (MaterialCardView) getApplicationIcon.IconCompatParcelizer(view, R.id.cardPracticalCornerSubject);
        if (materialCardView != null) {
            i = R.id.ivSubject;
            ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivSubject);
            if (imageView != null) {
                i = R.id.lytSubject;
                ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.lytSubject);
                if (constraintLayout != null) {
                    i = R.id.right_arrow;
                    ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.right_arrow);
                    if (imageView2 != null) {
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                        i = R.id.tvCompletedModule;
                        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCompletedModule);
                        if (textView != null) {
                            i = R.id.tvSubject;
                            TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSubject);
                            if (textView2 != null) {
                                i = R.id.tvSubjectPosition;
                                TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSubjectPosition);
                                if (textView3 != null) {
                                    i = R.id.viewDashFirstHalf;
                                    View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.viewDashFirstHalf);
                                    if (viewIconCompatParcelizer != null) {
                                        i = R.id.viewDashSecondHalf;
                                        View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.viewDashSecondHalf);
                                        if (viewIconCompatParcelizer2 != null) {
                                            return new setTimestampAdjusterInitializationTimeoutMs(constraintLayout2, materialCardView, imageView, constraintLayout, imageView2, constraintLayout2, textView, textView2, textView3, viewIconCompatParcelizer, viewIconCompatParcelizer2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
