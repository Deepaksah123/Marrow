package kotlin;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class copyStreams implements getApplicationLabel {
    public final View AudioAttributesCompatParcelizer;
    public final LinearLayout AudioAttributesImplApi21Parcelizer;
    public final MaterialCardView AudioAttributesImplApi26Parcelizer;
    public final MaterialCardView AudioAttributesImplBaseParcelizer;
    public final TextView IconCompatParcelizer;
    public final TextView MediaBrowserCompatCustomActionResultReceiver;
    public final LinearLayout MediaBrowserCompatItemReceiver;
    private final MaterialCardView MediaDescriptionCompat;
    public final TextView RemoteActionCompatParcelizer;
    public final TextView read;
    public final View write;

    private copyStreams(MaterialCardView materialCardView, View view, View view2, TextView textView, TextView textView2, TextView textView3, TextView textView4, LinearLayout linearLayout, MaterialCardView materialCardView2, LinearLayout linearLayout2, MaterialCardView materialCardView3) {
        this.MediaDescriptionCompat = materialCardView;
        this.write = view;
        this.AudioAttributesCompatParcelizer = view2;
        this.read = textView;
        this.RemoteActionCompatParcelizer = textView2;
        this.IconCompatParcelizer = textView3;
        this.MediaBrowserCompatCustomActionResultReceiver = textView4;
        this.AudioAttributesImplApi21Parcelizer = linearLayout;
        this.AudioAttributesImplApi26Parcelizer = materialCardView2;
        this.MediaBrowserCompatItemReceiver = linearLayout2;
        this.AudioAttributesImplBaseParcelizer = materialCardView3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public MaterialCardView IconCompatParcelizer() {
        return this.MediaDescriptionCompat;
    }

    public static copyStreams write(View view) {
        int i = R.id.timeCardVerticalDivider;
        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.timeCardVerticalDivider);
        if (viewIconCompatParcelizer != null) {
            i = R.id.timeCardhorizontalDivider;
            View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.timeCardhorizontalDivider);
            if (viewIconCompatParcelizer2 != null) {
                i = R.id.tvAverageAnswerTime;
                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvAverageAnswerTime);
                if (textView != null) {
                    i = R.id.tvTimeForReviewing;
                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTimeForReviewing);
                    if (textView2 != null) {
                        i = R.id.tvTimeTakenAnswering;
                        TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTimeTakenAnswering);
                        if (textView3 != null) {
                            i = R.id.tvTotalTimeTaken;
                            TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTotalTimeTaken);
                            if (textView4 != null) {
                                i = R.id.vAnsweringTimeContainer;
                                LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.vAnsweringTimeContainer);
                                if (linearLayout != null) {
                                    i = R.id.vAverageAnsweringTime;
                                    MaterialCardView materialCardView = (MaterialCardView) getApplicationIcon.IconCompatParcelizer(view, R.id.vAverageAnsweringTime);
                                    if (materialCardView != null) {
                                        i = R.id.vReviewingTimeContainer;
                                        LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.vReviewingTimeContainer);
                                        if (linearLayout2 != null) {
                                            MaterialCardView materialCardView2 = (MaterialCardView) view;
                                            return new copyStreams(materialCardView2, viewIconCompatParcelizer, viewIconCompatParcelizer2, textView, textView2, textView3, textView4, linearLayout, materialCardView, linearLayout2, materialCardView2);
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
