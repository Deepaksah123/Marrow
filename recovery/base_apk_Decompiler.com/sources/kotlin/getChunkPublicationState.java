package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.android.flexbox.FlexboxLayout;
import com.marrow.R;
import com.marrow2.ui.LottieRatingBarBigV2;

/* JADX INFO: loaded from: classes3.dex */
public final class getChunkPublicationState implements getApplicationLabel {
    public final EditText AudioAttributesCompatParcelizer;
    public final LinearLayout AudioAttributesImplApi21Parcelizer;
    public final ConstraintLayout AudioAttributesImplApi26Parcelizer;
    public final LinearLayout AudioAttributesImplBaseParcelizer;
    public final Button IconCompatParcelizer;
    public final LottieRatingBarBigV2 MediaBrowserCompatCustomActionResultReceiver;
    public final LinearLayout MediaBrowserCompatItemReceiver;
    public final TextView MediaBrowserCompatMediaItem;
    public final FlexboxLayout MediaBrowserCompatSearchResultReceiver;
    public final ConstraintLayout MediaDescriptionCompat;
    private final ConstraintLayout MediaMetadataCompat;
    public final TextView RatingCompat;
    public final ImageView RemoteActionCompatParcelizer;
    private TextView onAddQueueItem;
    public final Group read;
    public final TextView write;

    private getChunkPublicationState(ConstraintLayout constraintLayout, Button button, TextView textView, EditText editText, Group group, ImageView imageView, ConstraintLayout constraintLayout2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LottieRatingBarBigV2 lottieRatingBarBigV2, ConstraintLayout constraintLayout3, FlexboxLayout flexboxLayout, TextView textView2, TextView textView3, TextView textView4) {
        this.MediaMetadataCompat = constraintLayout;
        this.IconCompatParcelizer = button;
        this.write = textView;
        this.AudioAttributesCompatParcelizer = editText;
        this.read = group;
        this.RemoteActionCompatParcelizer = imageView;
        this.AudioAttributesImplApi26Parcelizer = constraintLayout2;
        this.MediaBrowserCompatItemReceiver = linearLayout;
        this.AudioAttributesImplBaseParcelizer = linearLayout2;
        this.AudioAttributesImplApi21Parcelizer = linearLayout3;
        this.MediaBrowserCompatCustomActionResultReceiver = lottieRatingBarBigV2;
        this.MediaDescriptionCompat = constraintLayout3;
        this.MediaBrowserCompatSearchResultReceiver = flexboxLayout;
        this.MediaBrowserCompatMediaItem = textView2;
        this.RatingCompat = textView3;
        this.onAddQueueItem = textView4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout IconCompatParcelizer() {
        return this.MediaMetadataCompat;
    }

    public static getChunkPublicationState RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.fragment_lesson_feedback, viewGroup, false));
    }

    private static getChunkPublicationState write(View view) {
        int i = R.id.btnSubmitFeedback;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnSubmitFeedback);
        if (button != null) {
            i = R.id.character_count_text;
            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.character_count_text);
            if (textView != null) {
                i = R.id.etFiveStarFeedback;
                EditText editText = (EditText) getApplicationIcon.IconCompatParcelizer(view, R.id.etFiveStarFeedback);
                if (editText != null) {
                    i = R.id.groupLowRatingView;
                    Group group = (Group) getApplicationIcon.IconCompatParcelizer(view, R.id.groupLowRatingView);
                    if (group != null) {
                        i = R.id.ibCancel;
                        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ibCancel);
                        if (imageView != null) {
                            i = R.id.llFeedbackTagsContainer;
                            ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llFeedbackTagsContainer);
                            if (constraintLayout != null) {
                                i = R.id.llFiveStarFeedback;
                                LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llFiveStarFeedback);
                                if (linearLayout != null) {
                                    i = R.id.llRatingBarContainer;
                                    LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llRatingBarContainer);
                                    if (linearLayout2 != null) {
                                        i = R.id.llSubmit;
                                        LinearLayout linearLayout3 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llSubmit);
                                        if (linearLayout3 != null) {
                                            i = R.id.moduleRatingBar;
                                            LottieRatingBarBigV2 lottieRatingBarBigV2 = (LottieRatingBarBigV2) getApplicationIcon.IconCompatParcelizer(view, R.id.moduleRatingBar);
                                            if (lottieRatingBarBigV2 != null) {
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                                                i = R.id.rvFeedbackTags;
                                                FlexboxLayout flexboxLayout = (FlexboxLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.rvFeedbackTags);
                                                if (flexboxLayout != null) {
                                                    i = R.id.tvAdditionalFeedback;
                                                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvAdditionalFeedback);
                                                    if (textView2 != null) {
                                                        i = R.id.tvFeedbackTitle;
                                                        TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvFeedbackTitle);
                                                        if (textView3 != null) {
                                                            i = R.id.tvTagsHeader;
                                                            TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTagsHeader);
                                                            if (textView4 != null) {
                                                                return new getChunkPublicationState(constraintLayout2, button, textView, editText, group, imageView, constraintLayout, linearLayout, linearLayout2, linearLayout3, lottieRatingBarBigV2, constraintLayout2, flexboxLayout, textView2, textView3, textView4);
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
