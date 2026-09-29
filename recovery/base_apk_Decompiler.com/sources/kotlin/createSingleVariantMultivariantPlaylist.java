package kotlin;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class createSingleVariantMultivariantPlaylist implements getApplicationLabel {
    public final CardView AudioAttributesCompatParcelizer;
    public final TextView AudioAttributesImplApi21Parcelizer;
    public final TextView AudioAttributesImplApi26Parcelizer;
    public final TextView AudioAttributesImplBaseParcelizer;
    public final ConstraintLayout IconCompatParcelizer;
    public final TextView MediaBrowserCompatCustomActionResultReceiver;
    public final MaterialButtonToggleGroup MediaBrowserCompatItemReceiver;
    public final TextView MediaBrowserCompatMediaItem;
    public final TextView MediaBrowserCompatSearchResultReceiver;
    private TextView MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private LinearLayout MediaDescriptionCompat;
    public final Button MediaMetadataCompat;
    public final TextView RatingCompat;
    public final MaterialButton RemoteActionCompatParcelizer;
    private final ConstraintLayout handleMediaPlayPauseIfPendingOnHandler;
    private ConstraintLayout onCommand;
    public final MaterialButton read;
    public final ImageView write;

    private createSingleVariantMultivariantPlaylist(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, CardView cardView, ImageView imageView, LinearLayout linearLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, MaterialButtonToggleGroup materialButtonToggleGroup, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, Button button) {
        this.handleMediaPlayPauseIfPendingOnHandler = constraintLayout;
        this.read = materialButton;
        this.RemoteActionCompatParcelizer = materialButton2;
        this.AudioAttributesCompatParcelizer = cardView;
        this.write = imageView;
        this.MediaDescriptionCompat = linearLayout;
        this.IconCompatParcelizer = constraintLayout2;
        this.onCommand = constraintLayout3;
        this.MediaBrowserCompatItemReceiver = materialButtonToggleGroup;
        this.AudioAttributesImplApi26Parcelizer = textView;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = textView2;
        this.AudioAttributesImplBaseParcelizer = textView3;
        this.MediaBrowserCompatCustomActionResultReceiver = textView4;
        this.AudioAttributesImplApi21Parcelizer = textView5;
        this.MediaBrowserCompatSearchResultReceiver = textView6;
        this.RatingCompat = textView7;
        this.MediaBrowserCompatMediaItem = textView8;
        this.MediaMetadataCompat = button;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout IconCompatParcelizer() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public static createSingleVariantMultivariantPlaylist RemoteActionCompatParcelizer(View view) {
        int i = R.id.btnAirRankToggle;
        MaterialButton materialButton = (MaterialButton) getApplicationIcon.IconCompatParcelizer(view, R.id.btnAirRankToggle);
        if (materialButton != null) {
            i = R.id.btnStateRankToggle;
            MaterialButton materialButton2 = (MaterialButton) getApplicationIcon.IconCompatParcelizer(view, R.id.btnStateRankToggle);
            if (materialButton2 != null) {
                i = R.id.cardPredicated;
                CardView cardView = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.cardPredicated);
                if (cardView != null) {
                    i = R.id.ivScoreLeaf;
                    ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivScoreLeaf);
                    if (imageView != null) {
                        i = R.id.ll_rank_container;
                        LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.ll_rank_container);
                        if (linearLayout != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i = R.id.rank_share_screenshot_root;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.rank_share_screenshot_root);
                            if (constraintLayout2 != null) {
                                i = R.id.rankToggleContainer;
                                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getApplicationIcon.IconCompatParcelizer(view, R.id.rankToggleContainer);
                                if (materialButtonToggleGroup != null) {
                                    i = R.id.tvErrorLabel;
                                    TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvErrorLabel);
                                    if (textView != null) {
                                        i = R.id.tvPredictedLabel;
                                        TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPredictedLabel);
                                        if (textView2 != null) {
                                            i = R.id.tvRank;
                                            TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvRank);
                                            if (textView3 != null) {
                                                i = R.id.tvRankAwaited;
                                                TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvRankAwaited);
                                                if (textView4 != null) {
                                                    i = R.id.tvRankOutOf;
                                                    TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvRankOutOf);
                                                    if (textView5 != null) {
                                                        i = R.id.tvResultsOnDate;
                                                        TextView textView6 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvResultsOnDate);
                                                        if (textView6 != null) {
                                                            i = R.id.tvTestTakenOnDate;
                                                            TextView textView7 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTestTakenOnDate);
                                                            if (textView7 != null) {
                                                                i = R.id.tvTextRankOnly;
                                                                TextView textView8 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTextRankOnly);
                                                                if (textView8 != null) {
                                                                    i = R.id.vReviewAnswers;
                                                                    Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.vReviewAnswers);
                                                                    if (button != null) {
                                                                        return new createSingleVariantMultivariantPlaylist(constraintLayout, materialButton, materialButton2, cardView, imageView, linearLayout, constraintLayout, constraintLayout2, materialButtonToggleGroup, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, button);
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
