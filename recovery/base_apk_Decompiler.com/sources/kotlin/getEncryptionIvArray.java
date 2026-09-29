package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;
import com.marrow.ui.views.CustomTextView;
import com.marrow.ui.views.LottieRatingBar;

/* JADX INFO: loaded from: classes3.dex */
public final class getEncryptionIvArray implements getApplicationLabel {
    public final LinearLayout AudioAttributesCompatParcelizer;
    public final LottieRatingBar AudioAttributesImplApi21Parcelizer;
    public final CustomTextView AudioAttributesImplApi26Parcelizer;
    public final CustomTextView AudioAttributesImplBaseParcelizer;
    public final TextView IconCompatParcelizer;
    public final CustomTextView MediaBrowserCompatCustomActionResultReceiver;
    public final LinearLayout MediaBrowserCompatItemReceiver;
    public final CustomTextView MediaBrowserCompatMediaItem;
    private final ConstraintLayout MediaDescriptionCompat;
    public final LinearLayout MediaMetadataCompat;
    private CustomTextView RatingCompat;
    public final ImageView RemoteActionCompatParcelizer;
    public final EditText read;
    public final TextView write;

    private getEncryptionIvArray(ConstraintLayout constraintLayout, TextView textView, TextView textView2, EditText editText, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, LottieRatingBar lottieRatingBar, CustomTextView customTextView, CustomTextView customTextView2, CustomTextView customTextView3, CustomTextView customTextView4, LinearLayout linearLayout3, CustomTextView customTextView5) {
        this.MediaDescriptionCompat = constraintLayout;
        this.IconCompatParcelizer = textView;
        this.write = textView2;
        this.read = editText;
        this.RemoteActionCompatParcelizer = imageView;
        this.AudioAttributesCompatParcelizer = linearLayout;
        this.MediaBrowserCompatItemReceiver = linearLayout2;
        this.AudioAttributesImplApi21Parcelizer = lottieRatingBar;
        this.AudioAttributesImplBaseParcelizer = customTextView;
        this.MediaBrowserCompatCustomActionResultReceiver = customTextView2;
        this.AudioAttributesImplApi26Parcelizer = customTextView3;
        this.MediaBrowserCompatMediaItem = customTextView4;
        this.MediaMetadataCompat = linearLayout3;
        this.RatingCompat = customTextView5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout IconCompatParcelizer() {
        return this.MediaDescriptionCompat;
    }

    public static getEncryptionIvArray write(LayoutInflater layoutInflater) {
        return AudioAttributesCompatParcelizer(layoutInflater);
    }

    private static getEncryptionIvArray AudioAttributesCompatParcelizer(LayoutInflater layoutInflater) {
        return RemoteActionCompatParcelizer(layoutInflater.inflate(R.layout.fragment_qa_rating2, (ViewGroup) null, false));
    }

    private static getEncryptionIvArray RemoteActionCompatParcelizer(View view) {
        int i = R.id.character_count_text;
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.character_count_text);
        if (textView != null) {
            i = R.id.feedback_completed_view;
            TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.feedback_completed_view);
            if (textView2 != null) {
                i = R.id.feedback_edit_text;
                EditText editText = (EditText) getApplicationIcon.IconCompatParcelizer(view, R.id.feedback_edit_text);
                if (editText != null) {
                    i = R.id.ic_close;
                    ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ic_close);
                    if (imageView != null) {
                        i = R.id.ll_feedback;
                        LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.ll_feedback);
                        if (linearLayout != null) {
                            i = R.id.loading_view;
                            LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.loading_view);
                            if (linearLayout2 != null) {
                                i = R.id.lottieRatingBar;
                                LottieRatingBar lottieRatingBar = (LottieRatingBar) getApplicationIcon.IconCompatParcelizer(view, R.id.lottieRatingBar);
                                if (lottieRatingBar != null) {
                                    i = R.id.okay_button;
                                    CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.okay_button);
                                    if (customTextView != null) {
                                        i = R.id.rating_msg_title;
                                        CustomTextView customTextView2 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.rating_msg_title);
                                        if (customTextView2 != null) {
                                            i = R.id.skipTextVIew;
                                            CustomTextView customTextView3 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.skipTextVIew);
                                            if (customTextView3 != null) {
                                                i = R.id.submit_button;
                                                CustomTextView customTextView4 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.submit_button);
                                                if (customTextView4 != null) {
                                                    i = R.id.submitted_view;
                                                    LinearLayout linearLayout3 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.submitted_view);
                                                    if (linearLayout3 != null) {
                                                        i = R.id.textreviewTitleId;
                                                        CustomTextView customTextView5 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.textreviewTitleId);
                                                        if (customTextView5 != null) {
                                                            return new getEncryptionIvArray((ConstraintLayout) view, textView, textView2, editText, imageView, linearLayout, linearLayout2, lottieRatingBar, customTextView, customTextView2, customTextView3, customTextView4, linearLayout3, customTextView5);
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
