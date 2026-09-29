package kotlin;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class isVideoSampleStream implements getApplicationLabel {
    private Barrier AudioAttributesCompatParcelizer;
    private ImageView AudioAttributesImplApi21Parcelizer;
    private LinearLayout AudioAttributesImplApi26Parcelizer;
    private CardView AudioAttributesImplBaseParcelizer;
    public final TextView IconCompatParcelizer;
    private View MediaBrowserCompatCustomActionResultReceiver;
    private final ConstraintLayout MediaBrowserCompatItemReceiver;
    public final ImageView RemoteActionCompatParcelizer;
    public final TextView read;
    public final TextView write;

    private isVideoSampleStream(ConstraintLayout constraintLayout, Barrier barrier, View view, LinearLayout linearLayout, CardView cardView, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3) {
        this.MediaBrowserCompatItemReceiver = constraintLayout;
        this.AudioAttributesCompatParcelizer = barrier;
        this.MediaBrowserCompatCustomActionResultReceiver = view;
        this.AudioAttributesImplApi26Parcelizer = linearLayout;
        this.AudioAttributesImplBaseParcelizer = cardView;
        this.RemoteActionCompatParcelizer = imageView;
        this.AudioAttributesImplApi21Parcelizer = imageView2;
        this.IconCompatParcelizer = textView;
        this.read = textView2;
        this.write = textView3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public static isVideoSampleStream RemoteActionCompatParcelizer(View view) {
        int i = R.id.contentBarrier;
        Barrier barrier = (Barrier) getApplicationIcon.IconCompatParcelizer(view, R.id.contentBarrier);
        if (barrier != null) {
            i = R.id.divider;
            View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.divider);
            if (viewIconCompatParcelizer != null) {
                i = R.id.free_video_label_container;
                LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.free_video_label_container);
                if (linearLayout != null) {
                    i = R.id.imageCard;
                    CardView cardView = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.imageCard);
                    if (cardView != null) {
                        i = R.id.ivFacultyImage;
                        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivFacultyImage);
                        if (imageView != null) {
                            i = R.id.ivPlayIcon;
                            ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivPlayIcon);
                            if (imageView2 != null) {
                                i = R.id.tvFacultyName;
                                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvFacultyName);
                                if (textView != null) {
                                    i = R.id.tvLessonTitle;
                                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvLessonTitle);
                                    if (textView2 != null) {
                                        i = R.id.tvSubjectTitle;
                                        TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSubjectTitle);
                                        if (textView3 != null) {
                                            return new isVideoSampleStream((ConstraintLayout) view, barrier, viewIconCompatParcelizer, linearLayout, cardView, imageView, imageView2, textView, textView2, textView3);
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
