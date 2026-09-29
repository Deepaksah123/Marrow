package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class hasValidSampleQueueIndex implements getApplicationLabel {
    public final ShapeableImageView AudioAttributesCompatParcelizer;
    private Guideline AudioAttributesImplApi21Parcelizer;
    private View AudioAttributesImplApi26Parcelizer;
    private Guideline AudioAttributesImplBaseParcelizer;
    public final TextView IconCompatParcelizer;
    private Guideline MediaBrowserCompatCustomActionResultReceiver;
    public final TextView MediaBrowserCompatItemReceiver;
    private final MaterialCardView MediaBrowserCompatMediaItem;
    private LinearLayout MediaMetadataCompat;
    private Guideline RatingCompat;
    public final ProgressBar RemoteActionCompatParcelizer;
    public final ImageView read;
    public final ConstraintLayout write;

    private hasValidSampleQueueIndex(MaterialCardView materialCardView, ConstraintLayout constraintLayout, View view, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, ImageView imageView, ShapeableImageView shapeableImageView, LinearLayout linearLayout, ProgressBar progressBar, TextView textView, TextView textView2) {
        this.MediaBrowserCompatMediaItem = materialCardView;
        this.write = constraintLayout;
        this.AudioAttributesImplApi26Parcelizer = view;
        this.AudioAttributesImplBaseParcelizer = guideline;
        this.MediaBrowserCompatCustomActionResultReceiver = guideline2;
        this.AudioAttributesImplApi21Parcelizer = guideline3;
        this.RatingCompat = guideline4;
        this.read = imageView;
        this.AudioAttributesCompatParcelizer = shapeableImageView;
        this.MediaMetadataCompat = linearLayout;
        this.RemoteActionCompatParcelizer = progressBar;
        this.IconCompatParcelizer = textView;
        this.MediaBrowserCompatItemReceiver = textView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final MaterialCardView IconCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public static hasValidSampleQueueIndex write(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.item_qbank_subject, viewGroup, false));
    }

    private static hasValidSampleQueueIndex write(View view) {
        int i = R.id.clMain;
        ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.clMain);
        if (constraintLayout != null) {
            i = R.id.dvSubjectImage;
            View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.dvSubjectImage);
            if (viewIconCompatParcelizer != null) {
                i = R.id.glBottom;
                Guideline guideline = (Guideline) getApplicationIcon.IconCompatParcelizer(view, R.id.glBottom);
                if (guideline != null) {
                    i = R.id.glEnd;
                    Guideline guideline2 = (Guideline) getApplicationIcon.IconCompatParcelizer(view, R.id.glEnd);
                    if (guideline2 != null) {
                        i = R.id.glStart;
                        Guideline guideline3 = (Guideline) getApplicationIcon.IconCompatParcelizer(view, R.id.glStart);
                        if (guideline3 != null) {
                            i = R.id.glTop;
                            Guideline guideline4 = (Guideline) getApplicationIcon.IconCompatParcelizer(view, R.id.glTop);
                            if (guideline4 != null) {
                                i = R.id.ivCompleted;
                                ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivCompleted);
                                if (imageView != null) {
                                    i = R.id.ivSubject;
                                    ShapeableImageView shapeableImageView = (ShapeableImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivSubject);
                                    if (shapeableImageView != null) {
                                        i = R.id.llSubjectIcon;
                                        LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llSubjectIcon);
                                        if (linearLayout != null) {
                                            i = R.id.pbSubject;
                                            ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.pbSubject);
                                            if (progressBar != null) {
                                                i = R.id.tvSubjectProgress;
                                                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSubjectProgress);
                                                if (textView != null) {
                                                    i = R.id.tvSubjectTitle;
                                                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSubjectTitle);
                                                    if (textView2 != null) {
                                                        return new hasValidSampleQueueIndex((MaterialCardView) view, constraintLayout, viewIconCompatParcelizer, guideline, guideline2, guideline3, guideline4, imageView, shapeableImageView, linearLayout, progressBar, textView, textView2);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
