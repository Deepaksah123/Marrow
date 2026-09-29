package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;
import com.marrow.ui.views.CustomTextView;
import com.marrow.ui.views.MoveableTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class checkPlaylistHeader implements getApplicationLabel {
    public final ImageView AudioAttributesCompatParcelizer;
    public final MoveableTextView AudioAttributesImplApi21Parcelizer;
    private final ConstraintLayout AudioAttributesImplApi26Parcelizer;
    public final LinearLayout AudioAttributesImplBaseParcelizer;
    public final CustomTextView IconCompatParcelizer;
    private CustomTextView MediaBrowserCompatCustomActionResultReceiver;
    private CustomTextView MediaBrowserCompatItemReceiver;
    public final CustomTextView RemoteActionCompatParcelizer;
    public final ProgressBar read;
    public final LinearLayout write;

    private checkPlaylistHeader(ConstraintLayout constraintLayout, LinearLayout linearLayout, ImageView imageView, ProgressBar progressBar, CustomTextView customTextView, CustomTextView customTextView2, CustomTextView customTextView3, CustomTextView customTextView4, MoveableTextView moveableTextView, LinearLayout linearLayout2) {
        this.AudioAttributesImplApi26Parcelizer = constraintLayout;
        this.write = linearLayout;
        this.AudioAttributesCompatParcelizer = imageView;
        this.read = progressBar;
        this.RemoteActionCompatParcelizer = customTextView;
        this.IconCompatParcelizer = customTextView2;
        this.MediaBrowserCompatCustomActionResultReceiver = customTextView3;
        this.MediaBrowserCompatItemReceiver = customTextView4;
        this.AudioAttributesImplApi21Parcelizer = moveableTextView;
        this.AudioAttributesImplBaseParcelizer = linearLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public static checkPlaylistHeader AudioAttributesCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return RemoteActionCompatParcelizer(layoutInflater.inflate(R.layout.view_video_slides, viewGroup, false));
    }

    private static checkPlaylistHeader RemoteActionCompatParcelizer(View view) {
        int i = R.id.btnRetry;
        LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.btnRetry);
        if (linearLayout != null) {
            i = R.id.ivSlide;
            ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivSlide);
            if (imageView != null) {
                i = R.id.progress_bar;
                ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.progress_bar);
                if (progressBar != null) {
                    i = R.id.tvInternetError;
                    CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvInternetError);
                    if (customTextView != null) {
                        i = R.id.tvNotesPosition;
                        CustomTextView customTextView2 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvNotesPosition);
                        if (customTextView2 != null) {
                            i = R.id.tvSlidesPosition;
                            CustomTextView customTextView3 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSlidesPosition);
                            if (customTextView3 != null) {
                                i = R.id.tvSlidesTimeStamp;
                                CustomTextView customTextView4 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSlidesTimeStamp);
                                if (customTextView4 != null) {
                                    i = R.id.tvUserId;
                                    MoveableTextView moveableTextView = (MoveableTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvUserId);
                                    if (moveableTextView != null) {
                                        i = R.id.vSlidesCounterContainer;
                                        LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.vSlidesCounterContainer);
                                        if (linearLayout2 != null) {
                                            return new checkPlaylistHeader((ConstraintLayout) view, linearLayout, imageView, progressBar, customTextView, customTextView2, customTextView3, customTextView4, moveableTextView, linearLayout2);
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
