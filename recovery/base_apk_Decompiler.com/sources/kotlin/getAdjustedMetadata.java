package kotlin;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class getAdjustedMetadata implements getApplicationLabel {
    public final LinearLayout AudioAttributesCompatParcelizer;
    public final TextView AudioAttributesImplApi21Parcelizer;
    public final RadioButton AudioAttributesImplApi26Parcelizer;
    public final RadioButton AudioAttributesImplBaseParcelizer;
    public final View IconCompatParcelizer;
    public final RadioButton MediaBrowserCompatCustomActionResultReceiver;
    public final RadioButton MediaBrowserCompatItemReceiver;
    public final TextView MediaBrowserCompatMediaItem;
    private LinearLayout MediaBrowserCompatSearchResultReceiver;
    private TextView MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private ImageView MediaDescriptionCompat;
    public final TextView MediaMetadataCompat;
    public final TextView RatingCompat;
    public final LinearLayout RemoteActionCompatParcelizer;
    private ImageView handleMediaPlayPauseIfPendingOnHandler;
    private final ConstraintLayout onAddQueueItem;
    private ImageView onCommand;
    private RadioGroup onCustomAction;
    public final LinearLayout read;
    public final LinearLayout write;

    private getAdjustedMetadata(ConstraintLayout constraintLayout, ImageView imageView, View view, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, ImageView imageView2, RadioButton radioButton, RadioGroup radioGroup, RadioButton radioButton2, RadioButton radioButton3, RadioButton radioButton4, ImageView imageView3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.onAddQueueItem = constraintLayout;
        this.MediaDescriptionCompat = imageView;
        this.IconCompatParcelizer = view;
        this.AudioAttributesCompatParcelizer = linearLayout;
        this.RemoteActionCompatParcelizer = linearLayout2;
        this.read = linearLayout3;
        this.write = linearLayout4;
        this.MediaBrowserCompatSearchResultReceiver = linearLayout5;
        this.onCommand = imageView2;
        this.MediaBrowserCompatCustomActionResultReceiver = radioButton;
        this.onCustomAction = radioGroup;
        this.AudioAttributesImplApi26Parcelizer = radioButton2;
        this.AudioAttributesImplBaseParcelizer = radioButton3;
        this.MediaBrowserCompatItemReceiver = radioButton4;
        this.handleMediaPlayPauseIfPendingOnHandler = imageView3;
        this.AudioAttributesImplApi21Parcelizer = textView;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = textView2;
        this.MediaMetadataCompat = textView3;
        this.MediaBrowserCompatMediaItem = textView4;
        this.RatingCompat = textView5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout IconCompatParcelizer() {
        return this.onAddQueueItem;
    }

    public static getAdjustedMetadata write(View view) {
        int i = R.id.blue_bookmark;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.blue_bookmark);
        if (imageView != null) {
            i = R.id.bookmarkOverlay;
            View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.bookmarkOverlay);
            if (viewIconCompatParcelizer != null) {
                i = R.id.containerAll;
                LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.containerAll);
                if (linearLayout != null) {
                    i = R.id.containerNormalBookmark;
                    LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.containerNormalBookmark);
                    if (linearLayout2 != null) {
                        i = R.id.containerQues;
                        LinearLayout linearLayout3 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.containerQues);
                        if (linearLayout3 != null) {
                            i = R.id.containerStar;
                            LinearLayout linearLayout4 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.containerStar);
                            if (linearLayout4 != null) {
                                i = R.id.linearLayoutCompat;
                                LinearLayout linearLayout5 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.linearLayoutCompat);
                                if (linearLayout5 != null) {
                                    i = R.id.ques_bookmark;
                                    ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ques_bookmark);
                                    if (imageView2 != null) {
                                        i = R.id.rdAllBookmark;
                                        RadioButton radioButton = (RadioButton) getApplicationIcon.IconCompatParcelizer(view, R.id.rdAllBookmark);
                                        if (radioButton != null) {
                                            i = R.id.rdGroup;
                                            RadioGroup radioGroup = (RadioGroup) getApplicationIcon.IconCompatParcelizer(view, R.id.rdGroup);
                                            if (radioGroup != null) {
                                                i = R.id.rdNormalBookmark;
                                                RadioButton radioButton2 = (RadioButton) getApplicationIcon.IconCompatParcelizer(view, R.id.rdNormalBookmark);
                                                if (radioButton2 != null) {
                                                    i = R.id.rdQuesBookmark;
                                                    RadioButton radioButton3 = (RadioButton) getApplicationIcon.IconCompatParcelizer(view, R.id.rdQuesBookmark);
                                                    if (radioButton3 != null) {
                                                        i = R.id.rdStarBookmark;
                                                        RadioButton radioButton4 = (RadioButton) getApplicationIcon.IconCompatParcelizer(view, R.id.rdStarBookmark);
                                                        if (radioButton4 != null) {
                                                            i = R.id.star_bookmark;
                                                            ImageView imageView3 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.star_bookmark);
                                                            if (imageView3 != null) {
                                                                i = R.id.tvAllCount;
                                                                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvAllCount);
                                                                if (textView != null) {
                                                                    i = R.id.tvBkMrkFilterAll;
                                                                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvBkMrkFilterAll);
                                                                    if (textView2 != null) {
                                                                        i = R.id.tvNormalCount;
                                                                        TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvNormalCount);
                                                                        if (textView3 != null) {
                                                                            i = R.id.tvQuesCount;
                                                                            TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvQuesCount);
                                                                            if (textView4 != null) {
                                                                                i = R.id.tvStarCount;
                                                                                TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvStarCount);
                                                                                if (textView5 != null) {
                                                                                    return new getAdjustedMetadata((ConstraintLayout) view, imageView, viewIconCompatParcelizer, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, imageView2, radioButton, radioGroup, radioButton2, radioButton3, radioButton4, imageView3, textView, textView2, textView3, textView4, textView5);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
