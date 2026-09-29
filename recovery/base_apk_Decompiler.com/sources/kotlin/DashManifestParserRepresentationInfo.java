package kotlin;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes.dex */
public final class DashManifestParserRepresentationInfo implements getApplicationLabel {
    public final ConstraintLayout AudioAttributesCompatParcelizer;
    private final ConstraintLayout AudioAttributesImplApi21Parcelizer;
    private LinearLayout AudioAttributesImplApi26Parcelizer;
    private ConstraintLayout AudioAttributesImplBaseParcelizer;
    public final TextView IconCompatParcelizer;
    private CardView MediaBrowserCompatCustomActionResultReceiver;
    private TextView MediaBrowserCompatItemReceiver;
    private ShimmerFrameLayout MediaDescriptionCompat;
    private TextView MediaMetadataCompat;
    public final TextView RemoteActionCompatParcelizer;
    private AppCompatImageView read;
    public final ImageView write;

    private DashManifestParserRepresentationInfo(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, TextView textView, ConstraintLayout constraintLayout2, CardView cardView, LinearLayout linearLayout, ImageView imageView, ConstraintLayout constraintLayout3, ShimmerFrameLayout shimmerFrameLayout, TextView textView2, TextView textView3, TextView textView4) {
        this.AudioAttributesImplApi21Parcelizer = constraintLayout;
        this.read = appCompatImageView;
        this.MediaBrowserCompatItemReceiver = textView;
        this.AudioAttributesImplBaseParcelizer = constraintLayout2;
        this.MediaBrowserCompatCustomActionResultReceiver = cardView;
        this.AudioAttributesImplApi26Parcelizer = linearLayout;
        this.write = imageView;
        this.AudioAttributesCompatParcelizer = constraintLayout3;
        this.MediaDescriptionCompat = shimmerFrameLayout;
        this.RemoteActionCompatParcelizer = textView2;
        this.IconCompatParcelizer = textView3;
        this.MediaMetadataCompat = textView4;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public static DashManifestParserRepresentationInfo AudioAttributesCompatParcelizer(View view) {
        int i = R.id.appCompatImageView;
        AppCompatImageView appCompatImageView = (AppCompatImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.appCompatImageView);
        if (appCompatImageView != null) {
            i = R.id.btnRenew;
            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.btnRenew);
            if (textView != null) {
                i = R.id.constraintLayout;
                ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.constraintLayout);
                if (constraintLayout != null) {
                    i = R.id.cvRenewNow;
                    CardView cardView = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.cvRenewNow);
                    if (cardView != null) {
                        i = R.id.planContainer;
                        LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.planContainer);
                        if (linearLayout != null) {
                            i = R.id.renewCloseBtn;
                            ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.renewCloseBtn);
                            if (imageView != null) {
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                                i = R.id.shimmer_btn_renew;
                                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.shimmer_btn_renew);
                                if (shimmerFrameLayout != null) {
                                    i = R.id.tvRenewTitleDesc;
                                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvRenewTitleDesc);
                                    if (textView2 != null) {
                                        i = R.id.tvRenewTitleHead;
                                        TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvRenewTitleHead);
                                        if (textView3 != null) {
                                            i = R.id.tvViewPlan;
                                            TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvViewPlan);
                                            if (textView4 != null) {
                                                return new DashManifestParserRepresentationInfo(constraintLayout2, appCompatImageView, textView, constraintLayout, cardView, linearLayout, imageView, constraintLayout2, shimmerFrameLayout, textView2, textView3, textView4);
                                            }
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
