package kotlin;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.marrow.R;
import com.marrow.ui.views.CustomButton;

/* JADX INFO: loaded from: classes3.dex */
public final class parseRangedUrl implements getApplicationLabel {
    public final ConstraintLayout AudioAttributesCompatParcelizer;
    public final ConstraintLayout AudioAttributesImplApi21Parcelizer;
    public final ImageView AudioAttributesImplApi26Parcelizer;
    public final ImageView AudioAttributesImplBaseParcelizer;
    public final ImageView IconCompatParcelizer;
    public final HlsTrackMetadataEntry1 MediaBrowserCompatCustomActionResultReceiver;
    public final ImageView MediaBrowserCompatItemReceiver;
    public final FrameLayout MediaBrowserCompatMediaItem;
    public final FrameLayout MediaBrowserCompatSearchResultReceiver;
    public final FrameLayout MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final ConstraintLayout MediaDescriptionCompat;
    public final ConstraintLayout MediaMetadataCompat;
    public final LinearLayout RatingCompat;
    public final FrameLayout RemoteActionCompatParcelizer;
    private Guideline handleMediaPlayPauseIfPendingOnHandler;
    private Guideline onAddQueueItem;
    private ConstraintLayout onCommand;
    private Guideline onCustomAction;
    private Guideline onFastForward;
    private Guideline onMediaButtonEvent;
    private final ConstraintLayout onPause;
    private ImageView onPlay;
    private TextView onPlayFromMediaId;
    private TextView onPlayFromSearch;
    public final CustomButton read;
    public final Button write;

    private parseRangedUrl(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, Button button, CustomButton customButton, ConstraintLayout constraintLayout3, FrameLayout frameLayout, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, Guideline guideline5, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, HlsTrackMetadataEntry1 hlsTrackMetadataEntry1, ConstraintLayout constraintLayout4, LinearLayout linearLayout, FrameLayout frameLayout2, ConstraintLayout constraintLayout5, ConstraintLayout constraintLayout6, TextView textView, TextView textView2, FrameLayout frameLayout3, FrameLayout frameLayout4) {
        this.onPause = constraintLayout;
        this.onCommand = constraintLayout2;
        this.write = button;
        this.read = customButton;
        this.AudioAttributesCompatParcelizer = constraintLayout3;
        this.RemoteActionCompatParcelizer = frameLayout;
        this.onAddQueueItem = guideline;
        this.onCustomAction = guideline2;
        this.handleMediaPlayPauseIfPendingOnHandler = guideline3;
        this.onFastForward = guideline4;
        this.onMediaButtonEvent = guideline5;
        this.IconCompatParcelizer = imageView;
        this.AudioAttributesImplApi26Parcelizer = imageView2;
        this.AudioAttributesImplBaseParcelizer = imageView3;
        this.MediaBrowserCompatItemReceiver = imageView4;
        this.onPlay = imageView5;
        this.MediaBrowserCompatCustomActionResultReceiver = hlsTrackMetadataEntry1;
        this.AudioAttributesImplApi21Parcelizer = constraintLayout4;
        this.RatingCompat = linearLayout;
        this.MediaBrowserCompatMediaItem = frameLayout2;
        this.MediaDescriptionCompat = constraintLayout5;
        this.MediaMetadataCompat = constraintLayout6;
        this.onPlayFromMediaId = textView;
        this.onPlayFromSearch = textView2;
        this.MediaBrowserCompatSearchResultReceiver = frameLayout3;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = frameLayout4;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.onPause;
    }

    public static parseRangedUrl read(View view) {
        int i = R.id.bottomVideoContainer;
        ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.bottomVideoContainer);
        if (constraintLayout != null) {
            i = R.id.btnMarkComplete;
            Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnMarkComplete);
            if (button != null) {
                i = R.id.btnVerifyKyc;
                CustomButton customButton = (CustomButton) getApplicationIcon.IconCompatParcelizer(view, R.id.btnVerifyKyc);
                if (customButton != null) {
                    i = R.id.constraint_parent;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.constraint_parent);
                    if (constraintLayout2 != null) {
                        i = R.id.fragment_container;
                        FrameLayout frameLayout = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.fragment_container);
                        if (frameLayout != null) {
                            i = R.id.gl_bottom;
                            Guideline guideline = (Guideline) getApplicationIcon.IconCompatParcelizer(view, R.id.gl_bottom);
                            if (guideline != null) {
                                i = R.id.gl_landscape_split_mid;
                                Guideline guideline2 = (Guideline) getApplicationIcon.IconCompatParcelizer(view, R.id.gl_landscape_split_mid);
                                if (guideline2 != null) {
                                    i = R.id.gl_left;
                                    Guideline guideline3 = (Guideline) getApplicationIcon.IconCompatParcelizer(view, R.id.gl_left);
                                    if (guideline3 != null) {
                                        i = R.id.gl_right;
                                        Guideline guideline4 = (Guideline) getApplicationIcon.IconCompatParcelizer(view, R.id.gl_right);
                                        if (guideline4 != null) {
                                            i = R.id.gl_top;
                                            Guideline guideline5 = (Guideline) getApplicationIcon.IconCompatParcelizer(view, R.id.gl_top);
                                            if (guideline5 != null) {
                                                i = R.id.imgBack;
                                                ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.imgBack);
                                                if (imageView != null) {
                                                    i = R.id.imgDismissNotes;
                                                    ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.imgDismissNotes);
                                                    if (imageView2 != null) {
                                                        i = R.id.img_kyc_close;
                                                        ImageView imageView3 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.img_kyc_close);
                                                        if (imageView3 != null) {
                                                            i = R.id.imgResizeNotes;
                                                            ImageView imageView4 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.imgResizeNotes);
                                                            if (imageView4 != null) {
                                                                i = R.id.ivKycIcon;
                                                                ImageView imageView5 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivKycIcon);
                                                                if (imageView5 != null) {
                                                                    i = R.id.layout_video_bottom_content;
                                                                    View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.layout_video_bottom_content);
                                                                    if (viewIconCompatParcelizer != null) {
                                                                        HlsTrackMetadataEntry1 hlsTrackMetadataEntry1AudioAttributesCompatParcelizer = HlsTrackMetadataEntry1.AudioAttributesCompatParcelizer(viewIconCompatParcelizer);
                                                                        i = R.id.lessonLlVideoBlocked;
                                                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.lessonLlVideoBlocked);
                                                                        if (constraintLayout3 != null) {
                                                                            i = R.id.llMarkCompleteContainer;
                                                                            LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llMarkCompleteContainer);
                                                                            if (linearLayout != null) {
                                                                                i = R.id.loading_container;
                                                                                FrameLayout frameLayout2 = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.loading_container);
                                                                                if (frameLayout2 != null) {
                                                                                    ConstraintLayout constraintLayout4 = (ConstraintLayout) view;
                                                                                    i = R.id.toolbar_parent;
                                                                                    ConstraintLayout constraintLayout5 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar_parent);
                                                                                    if (constraintLayout5 != null) {
                                                                                        i = R.id.tvKycHeader;
                                                                                        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvKycHeader);
                                                                                        if (textView != null) {
                                                                                            i = R.id.tvKycSubHeader;
                                                                                            TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvKycSubHeader);
                                                                                            if (textView2 != null) {
                                                                                                FrameLayout frameLayout3 = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.video_fragment_container);
                                                                                                if (frameLayout3 != null) {
                                                                                                    FrameLayout frameLayout4 = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.video_notes_container);
                                                                                                    if (frameLayout4 != null) {
                                                                                                        return new parseRangedUrl(constraintLayout4, constraintLayout, button, customButton, constraintLayout2, frameLayout, guideline, guideline2, guideline3, guideline4, guideline5, imageView, imageView2, imageView3, imageView4, imageView5, hlsTrackMetadataEntry1AudioAttributesCompatParcelizer, constraintLayout3, linearLayout, frameLayout2, constraintLayout4, constraintLayout5, textView, textView2, frameLayout3, frameLayout4);
                                                                                                    }
                                                                                                    i = R.id.video_notes_container;
                                                                                                } else {
                                                                                                    i = R.id.video_fragment_container;
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
