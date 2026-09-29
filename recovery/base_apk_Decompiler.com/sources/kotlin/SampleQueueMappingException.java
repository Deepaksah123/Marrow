package kotlin;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class SampleQueueMappingException implements getApplicationLabel {
    public final TextView AudioAttributesCompatParcelizer;
    public final TextView AudioAttributesImplApi21Parcelizer;
    public final TextView AudioAttributesImplApi26Parcelizer;
    public final TextView AudioAttributesImplBaseParcelizer;
    public final TextView IconCompatParcelizer;
    public final TextView MediaBrowserCompatCustomActionResultReceiver;
    public final TextView MediaBrowserCompatItemReceiver;
    private TextView MediaBrowserCompatMediaItem;
    private View MediaBrowserCompatSearchResultReceiver;
    private TextView MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private TextView MediaDescriptionCompat;
    private final ConstraintLayout MediaMetadataCompat;
    private Guideline RatingCompat;
    public final TextView RemoteActionCompatParcelizer;
    private TextView handleMediaPlayPauseIfPendingOnHandler;
    private TextView onCommand;
    public final TextView read;
    public final TextView write;

    private SampleQueueMappingException(ConstraintLayout constraintLayout, View view, Guideline guideline, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15) {
        this.MediaMetadataCompat = constraintLayout;
        this.MediaBrowserCompatSearchResultReceiver = view;
        this.RatingCompat = guideline;
        this.read = textView;
        this.write = textView2;
        this.MediaBrowserCompatMediaItem = textView3;
        this.AudioAttributesCompatParcelizer = textView4;
        this.MediaDescriptionCompat = textView5;
        this.RemoteActionCompatParcelizer = textView6;
        this.IconCompatParcelizer = textView7;
        this.MediaBrowserCompatItemReceiver = textView8;
        this.onCommand = textView9;
        this.AudioAttributesImplApi21Parcelizer = textView10;
        this.AudioAttributesImplApi26Parcelizer = textView11;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = textView12;
        this.MediaBrowserCompatCustomActionResultReceiver = textView13;
        this.handleMediaPlayPauseIfPendingOnHandler = textView14;
        this.AudioAttributesImplBaseParcelizer = textView15;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.MediaMetadataCompat;
    }

    public static SampleQueueMappingException read(View view) {
        int i = R.id.divider;
        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.divider);
        if (viewIconCompatParcelizer != null) {
            i = R.id.guideline;
            Guideline guideline = (Guideline) getApplicationIcon.IconCompatParcelizer(view, R.id.guideline);
            if (guideline != null) {
                i = R.id.tvCGSTLabel;
                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCGSTLabel);
                if (textView != null) {
                    i = R.id.tvCGSTValue;
                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCGSTValue);
                    if (textView2 != null) {
                        i = R.id.tvDiscountLabel;
                        TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvDiscountLabel);
                        if (textView3 != null) {
                            i = R.id.tvDiscountValue;
                            TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvDiscountValue);
                            if (textView4 != null) {
                                i = R.id.tvFullPriceLabel;
                                TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvFullPriceLabel);
                                if (textView5 != null) {
                                    i = R.id.tvFullPriceValue;
                                    TextView textView6 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvFullPriceValue);
                                    if (textView6 != null) {
                                        i = R.id.tvIGSTLabel;
                                        TextView textView7 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvIGSTLabel);
                                        if (textView7 != null) {
                                            i = R.id.tvIGSTValue;
                                            TextView textView8 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvIGSTValue);
                                            if (textView8 != null) {
                                                i = R.id.tvOrderDetailsTitle;
                                                TextView textView9 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvOrderDetailsTitle);
                                                if (textView9 != null) {
                                                    i = R.id.tvSGSTLabel;
                                                    TextView textView10 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSGSTLabel);
                                                    if (textView10 != null) {
                                                        i = R.id.tvSGSTValue;
                                                        TextView textView11 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSGSTValue);
                                                        if (textView11 != null) {
                                                            i = R.id.tvShippingChargesLabel;
                                                            TextView textView12 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvShippingChargesLabel);
                                                            if (textView12 != null) {
                                                                i = R.id.tvShippingChargesValue;
                                                                TextView textView13 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvShippingChargesValue);
                                                                if (textView13 != null) {
                                                                    i = R.id.tvTotalLabel;
                                                                    TextView textView14 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTotalLabel);
                                                                    if (textView14 != null) {
                                                                        i = R.id.tvTotalValue;
                                                                        TextView textView15 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTotalValue);
                                                                        if (textView15 != null) {
                                                                            return new SampleQueueMappingException((ConstraintLayout) view, viewIconCompatParcelizer, guideline, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
