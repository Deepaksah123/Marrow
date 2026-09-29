package kotlin;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;
import com.marrow.ui.views.CustomButton;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class EventStream implements getApplicationLabel {
    public final LinearLayout AudioAttributesCompatParcelizer;
    public final CustomTextView AudioAttributesImplApi21Parcelizer;
    public final CustomTextView AudioAttributesImplApi26Parcelizer;
    public final CustomTextView AudioAttributesImplBaseParcelizer;
    public final CustomButton IconCompatParcelizer;
    public final HlsMediaPlaylist MediaBrowserCompatCustomActionResultReceiver;
    public final ProgressBar MediaBrowserCompatItemReceiver;
    public final ScrollView MediaBrowserCompatMediaItem;
    public final CustomTextView MediaBrowserCompatSearchResultReceiver;
    public final TextView MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final CustomTextView MediaDescriptionCompat;
    public final CustomTextView MediaMetadataCompat;
    public final CustomTextView RatingCompat;
    public final LinearLayout RemoteActionCompatParcelizer;
    private View handleMediaPlayPauseIfPendingOnHandler;
    private View onAddQueueItem;
    public final CustomTextView onCommand;
    private ImageView onCustomAction;
    private final ConstraintLayout onFastForward;
    private Space onMediaButtonEvent;
    private CustomTextView onPause;
    public final ScrollView read;
    public final CustomButton write;

    private EventStream(ConstraintLayout constraintLayout, CustomButton customButton, CustomButton customButton2, View view, ScrollView scrollView, LinearLayout linearLayout, LinearLayout linearLayout2, View view2, ImageView imageView, CustomTextView customTextView, CustomTextView customTextView2, CustomTextView customTextView3, CustomTextView customTextView4, ProgressBar progressBar, Space space, HlsMediaPlaylist hlsMediaPlaylist, ScrollView scrollView2, CustomTextView customTextView5, CustomTextView customTextView6, CustomTextView customTextView7, CustomTextView customTextView8, CustomTextView customTextView9, TextView textView) {
        this.onFastForward = constraintLayout;
        this.write = customButton;
        this.IconCompatParcelizer = customButton2;
        this.handleMediaPlayPauseIfPendingOnHandler = view;
        this.read = scrollView;
        this.RemoteActionCompatParcelizer = linearLayout;
        this.AudioAttributesCompatParcelizer = linearLayout2;
        this.onAddQueueItem = view2;
        this.onCustomAction = imageView;
        this.AudioAttributesImplApi21Parcelizer = customTextView;
        this.AudioAttributesImplApi26Parcelizer = customTextView2;
        this.AudioAttributesImplBaseParcelizer = customTextView3;
        this.onPause = customTextView4;
        this.MediaBrowserCompatItemReceiver = progressBar;
        this.onMediaButtonEvent = space;
        this.MediaBrowserCompatCustomActionResultReceiver = hlsMediaPlaylist;
        this.MediaBrowserCompatMediaItem = scrollView2;
        this.RatingCompat = customTextView5;
        this.MediaBrowserCompatSearchResultReceiver = customTextView6;
        this.MediaDescriptionCompat = customTextView7;
        this.MediaMetadataCompat = customTextView8;
        this.onCommand = customTextView9;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout IconCompatParcelizer() {
        return this.onFastForward;
    }

    public static EventStream RemoteActionCompatParcelizer(View view) {
        int i = R.id.btn_buy_now;
        CustomButton customButton = (CustomButton) getApplicationIcon.IconCompatParcelizer(view, R.id.btn_buy_now);
        if (customButton != null) {
            i = R.id.btn_buy_now_2;
            CustomButton customButton2 = (CustomButton) getApplicationIcon.IconCompatParcelizer(view, R.id.btn_buy_now_2);
            if (customButton2 != null) {
                i = R.id.divider;
                View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.divider);
                if (viewIconCompatParcelizer != null) {
                    i = R.id.error_layout;
                    ScrollView scrollView = (ScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.error_layout);
                    if (scrollView != null) {
                        i = R.id.faq_data_container;
                        LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.faq_data_container);
                        if (linearLayout != null) {
                            i = R.id.features_data_container;
                            LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.features_data_container);
                            if (linearLayout2 != null) {
                                i = R.id.header_bg;
                                View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.header_bg);
                                if (viewIconCompatParcelizer2 != null) {
                                    i = R.id.iv_upgrade_icon;
                                    ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.iv_upgrade_icon);
                                    if (imageView != null) {
                                        i = R.id.label_faq;
                                        CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.label_faq);
                                        if (customTextView != null) {
                                            i = R.id.label_header;
                                            CustomTextView customTextView2 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.label_header);
                                            if (customTextView2 != null) {
                                                i = R.id.label_sub_header;
                                                CustomTextView customTextView3 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.label_sub_header);
                                                if (customTextView3 != null) {
                                                    i = R.id.label_what_your_getting;
                                                    CustomTextView customTextView4 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.label_what_your_getting);
                                                    if (customTextView4 != null) {
                                                        i = R.id.progress_bar;
                                                        ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.progress_bar);
                                                        if (progressBar != null) {
                                                            i = R.id.space1;
                                                            Space space = (Space) getApplicationIcon.IconCompatParcelizer(view, R.id.space1);
                                                            if (space != null) {
                                                                i = R.id.toolbar;
                                                                View viewIconCompatParcelizer3 = getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                                                                if (viewIconCompatParcelizer3 != null) {
                                                                    HlsMediaPlaylist hlsMediaPlaylistIconCompatParcelizer = HlsMediaPlaylist.IconCompatParcelizer(viewIconCompatParcelizer3);
                                                                    i = R.id.top_scroll_view;
                                                                    ScrollView scrollView2 = (ScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.top_scroll_view);
                                                                    if (scrollView2 != null) {
                                                                        i = R.id.tv_discount_price;
                                                                        CustomTextView customTextView5 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_discount_price);
                                                                        if (customTextView5 != null) {
                                                                            i = R.id.tv_error;
                                                                            CustomTextView customTextView6 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_error);
                                                                            if (customTextView6 != null) {
                                                                                i = R.id.tv_original_price;
                                                                                CustomTextView customTextView7 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_original_price);
                                                                                if (customTextView7 != null) {
                                                                                    i = R.id.tv_validity;
                                                                                    CustomTextView customTextView8 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_validity);
                                                                                    if (customTextView8 != null) {
                                                                                        i = R.id.tv_validity_2;
                                                                                        CustomTextView customTextView9 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_validity_2);
                                                                                        if (customTextView9 != null) {
                                                                                            i = R.id.tvVpnWarningText;
                                                                                            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvVpnWarningText);
                                                                                            if (textView != null) {
                                                                                                return new EventStream((ConstraintLayout) view, customButton, customButton2, viewIconCompatParcelizer, scrollView, linearLayout, linearLayout2, viewIconCompatParcelizer2, imageView, customTextView, customTextView2, customTextView3, customTextView4, progressBar, space, hlsMediaPlaylistIconCompatParcelizer, scrollView2, customTextView5, customTextView6, customTextView7, customTextView8, customTextView9, textView);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
