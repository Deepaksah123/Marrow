package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.marrow.R;
import com.marrow.ui.views.CustomButton;
import com.marrow.ui.views.CustomTextView;
import com.marrow.ui.views.MoveableTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class access106 implements getApplicationLabel {
    public final TextView AudioAttributesCompatParcelizer;
    public final View AudioAttributesImplApi21Parcelizer;
    public final LinearLayout AudioAttributesImplApi26Parcelizer;
    public final ConstraintLayout AudioAttributesImplBaseParcelizer;
    public final CustomButton IconCompatParcelizer;
    public final ensureBufferCapacity MediaBrowserCompatCustomActionResultReceiver;
    public final ImageView MediaBrowserCompatItemReceiver;
    public final MoveableTextView MediaBrowserCompatMediaItem;
    public final ComposeView MediaBrowserCompatSearchResultReceiver;
    public final FrameLayout MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final FrameLayout MediaDescriptionCompat;
    public final MoveableTextView MediaMetadataCompat;
    public final StyledPlayerView RatingCompat;
    public final LottieAnimationView RemoteActionCompatParcelizer;
    public final ImageView handleMediaPlayPauseIfPendingOnHandler;
    public final FrameLayout onAddQueueItem;
    public final ImageView onCommand;
    public final LinearLayout onCustomAction;
    public final ConstraintLayout onFastForward;
    public final TextView onMediaButtonEvent;
    public final CustomTextView onPause;
    public final TextView onPlay;
    public final CustomTextView onPlayFromMediaId;
    public final TextView onPlayFromSearch;
    public final LinearLayout onPlayFromUri;
    private ConstraintLayout onPrepare;
    private ConstraintLayout onPrepareFromMediaId;
    public final FrameLayout onPrepareFromSearch;
    private LinearLayout onPrepareFromUri;
    private final ConstraintLayout onRemoveQueueItem;
    private ImageView onRemoveQueueItemAt;
    private HlsSampleStreamWrapperCallback onRewind;
    private ImageView onSeekTo;
    private FrameLayout onSetCaptioningEnabled;
    private TextView onSetPlaybackSpeed;
    private ConstraintLayout onSetRating;
    private TextView onSetRepeatMode;
    public final View read;
    public final LottieAnimationView write;

    private access106(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, View view, TextView textView, CustomButton customButton, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, View view2, ImageView imageView, LinearLayout linearLayout, ensureBufferCapacity ensurebuffercapacity, HlsSampleStreamWrapperCallback hlsSampleStreamWrapperCallback, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout2, ConstraintLayout constraintLayout4, FrameLayout frameLayout, MoveableTextView moveableTextView, MoveableTextView moveableTextView2, ComposeView composeView, StyledPlayerView styledPlayerView, ImageView imageView4, ImageView imageView5, FrameLayout frameLayout2, LinearLayout linearLayout3, FrameLayout frameLayout3, ConstraintLayout constraintLayout5, ConstraintLayout constraintLayout6, CustomTextView customTextView, TextView textView2, TextView textView3, TextView textView4, CustomTextView customTextView2, TextView textView5, LinearLayout linearLayout4, TextView textView6, FrameLayout frameLayout4, FrameLayout frameLayout5) {
        this.onRemoveQueueItem = constraintLayout;
        this.write = lottieAnimationView;
        this.RemoteActionCompatParcelizer = lottieAnimationView2;
        this.read = view;
        this.AudioAttributesCompatParcelizer = textView;
        this.IconCompatParcelizer = customButton;
        this.onPrepare = constraintLayout2;
        this.onPrepareFromMediaId = constraintLayout3;
        this.AudioAttributesImplApi21Parcelizer = view2;
        this.MediaBrowserCompatItemReceiver = imageView;
        this.onPrepareFromUri = linearLayout;
        this.MediaBrowserCompatCustomActionResultReceiver = ensurebuffercapacity;
        this.onRewind = hlsSampleStreamWrapperCallback;
        this.onRemoveQueueItemAt = imageView2;
        this.onSeekTo = imageView3;
        this.AudioAttributesImplApi26Parcelizer = linearLayout2;
        this.AudioAttributesImplBaseParcelizer = constraintLayout4;
        this.MediaDescriptionCompat = frameLayout;
        this.MediaMetadataCompat = moveableTextView;
        this.MediaBrowserCompatMediaItem = moveableTextView2;
        this.MediaBrowserCompatSearchResultReceiver = composeView;
        this.RatingCompat = styledPlayerView;
        this.handleMediaPlayPauseIfPendingOnHandler = imageView4;
        this.onCommand = imageView5;
        this.onAddQueueItem = frameLayout2;
        this.onCustomAction = linearLayout3;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = frameLayout3;
        this.onFastForward = constraintLayout5;
        this.onSetRating = constraintLayout6;
        this.onPlayFromMediaId = customTextView;
        this.onSetPlaybackSpeed = textView2;
        this.onSetRepeatMode = textView3;
        this.onMediaButtonEvent = textView4;
        this.onPause = customTextView2;
        this.onPlay = textView5;
        this.onPlayFromUri = linearLayout4;
        this.onPlayFromSearch = textView6;
        this.onPrepareFromSearch = frameLayout4;
        this.onSetCaptioningEnabled = frameLayout5;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.onRemoveQueueItem;
    }

    public static access106 read(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.fragment_video, viewGroup, false));
    }

    private static access106 AudioAttributesCompatParcelizer(View view) {
        int i = R.id.animBackward;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) getApplicationIcon.IconCompatParcelizer(view, R.id.animBackward);
        if (lottieAnimationView != null) {
            i = R.id.animForward;
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) getApplicationIcon.IconCompatParcelizer(view, R.id.animForward);
            if (lottieAnimationView2 != null) {
                i = R.id.backwardRippleView;
                View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.backwardRippleView);
                if (viewIconCompatParcelizer != null) {
                    i = R.id.btnSkipIntro;
                    TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.btnSkipIntro);
                    if (textView != null) {
                        i = R.id.btnVerifyKyc;
                        CustomButton customButton = (CustomButton) getApplicationIcon.IconCompatParcelizer(view, R.id.btnVerifyKyc);
                        if (customButton != null) {
                            i = R.id.clBackward;
                            ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.clBackward);
                            if (constraintLayout != null) {
                                i = R.id.clForward;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.clForward);
                                if (constraintLayout2 != null) {
                                    i = R.id.forwardRippleView;
                                    View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.forwardRippleView);
                                    if (viewIconCompatParcelizer2 != null) {
                                        i = R.id.imgCorrectionNoteClose;
                                        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.imgCorrectionNoteClose);
                                        if (imageView != null) {
                                            i = R.id.interactive_mcq_options_layout;
                                            LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.interactive_mcq_options_layout);
                                            if (linearLayout != null) {
                                                i = R.id.interactiveOptionsFeatureDiscoveryLayout;
                                                View viewIconCompatParcelizer3 = getApplicationIcon.IconCompatParcelizer(view, R.id.interactiveOptionsFeatureDiscoveryLayout);
                                                if (viewIconCompatParcelizer3 != null) {
                                                    ensureBufferCapacity ensurebuffercapacityRemoteActionCompatParcelizer = ensureBufferCapacity.RemoteActionCompatParcelizer(viewIconCompatParcelizer3);
                                                    i = R.id.interactiveVideoOrientationSwitchModeLayout;
                                                    View viewIconCompatParcelizer4 = getApplicationIcon.IconCompatParcelizer(view, R.id.interactiveVideoOrientationSwitchModeLayout);
                                                    if (viewIconCompatParcelizer4 != null) {
                                                        HlsSampleStreamWrapperCallback hlsSampleStreamWrapperCallbackWrite = HlsSampleStreamWrapperCallback.write(viewIconCompatParcelizer4);
                                                        i = R.id.ivKycIcon;
                                                        ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivKycIcon);
                                                        if (imageView2 != null) {
                                                            i = R.id.iv_play_icon;
                                                            ImageView imageView3 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.iv_play_icon);
                                                            if (imageView3 != null) {
                                                                i = R.id.leftDock;
                                                                LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.leftDock);
                                                                if (linearLayout2 != null) {
                                                                    i = R.id.llVideoBlocked;
                                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llVideoBlocked);
                                                                    if (constraintLayout3 != null) {
                                                                        i = R.id.loading_container;
                                                                        FrameLayout frameLayout = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.loading_container);
                                                                        if (frameLayout != null) {
                                                                            i = R.id.mLegacyWatermarkView;
                                                                            MoveableTextView moveableTextView = (MoveableTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.mLegacyWatermarkView);
                                                                            if (moveableTextView != null) {
                                                                                i = R.id.mNewWatermark;
                                                                                MoveableTextView moveableTextView2 = (MoveableTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.mNewWatermark);
                                                                                if (moveableTextView2 != null) {
                                                                                    i = R.id.playbackErrorContainer;
                                                                                    ComposeView composeView = (ComposeView) getApplicationIcon.IconCompatParcelizer(view, R.id.playbackErrorContainer);
                                                                                    if (composeView != null) {
                                                                                        i = R.id.player_view;
                                                                                        StyledPlayerView styledPlayerView = (StyledPlayerView) getApplicationIcon.IconCompatParcelizer(view, R.id.player_view);
                                                                                        if (styledPlayerView != null) {
                                                                                            i = R.id.preview_image_view;
                                                                                            ImageView imageView4 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.preview_image_view);
                                                                                            if (imageView4 != null) {
                                                                                                ImageView imageView5 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.preview_play);
                                                                                                if (imageView5 != null) {
                                                                                                    FrameLayout frameLayout2 = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.preview_root);
                                                                                                    if (frameLayout2 != null) {
                                                                                                        LinearLayout linearLayout3 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.rightDock);
                                                                                                        if (linearLayout3 != null) {
                                                                                                            FrameLayout frameLayout3 = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.root);
                                                                                                            if (frameLayout3 != null) {
                                                                                                                ConstraintLayout constraintLayout4 = (ConstraintLayout) view;
                                                                                                                ConstraintLayout constraintLayout5 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.top_container);
                                                                                                                if (constraintLayout5 != null) {
                                                                                                                    CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCorrectionNote);
                                                                                                                    if (customTextView != null) {
                                                                                                                        TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvKycHeader);
                                                                                                                        if (textView2 != null) {
                                                                                                                            TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvKycSubHeader);
                                                                                                                            if (textView3 != null) {
                                                                                                                                TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSkipBackward);
                                                                                                                                if (textView4 != null) {
                                                                                                                                    CustomTextView customTextView2 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSkipForward);
                                                                                                                                    if (customTextView2 != null) {
                                                                                                                                        TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.user_email);
                                                                                                                                        if (textView5 != null) {
                                                                                                                                            LinearLayout linearLayout4 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.watch_next_on_replay);
                                                                                                                                            if (linearLayout4 != null) {
                                                                                                                                                TextView textView6 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.watch_next_tv);
                                                                                                                                                if (textView6 != null) {
                                                                                                                                                    FrameLayout frameLayout4 = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.watermark_parent_layout);
                                                                                                                                                    if (frameLayout4 != null) {
                                                                                                                                                        FrameLayout frameLayout5 = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.watermark_parent_layout2);
                                                                                                                                                        if (frameLayout5 != null) {
                                                                                                                                                            return new access106(constraintLayout4, lottieAnimationView, lottieAnimationView2, viewIconCompatParcelizer, textView, customButton, constraintLayout, constraintLayout2, viewIconCompatParcelizer2, imageView, linearLayout, ensurebuffercapacityRemoteActionCompatParcelizer, hlsSampleStreamWrapperCallbackWrite, imageView2, imageView3, linearLayout2, constraintLayout3, frameLayout, moveableTextView, moveableTextView2, composeView, styledPlayerView, imageView4, imageView5, frameLayout2, linearLayout3, frameLayout3, constraintLayout4, constraintLayout5, customTextView, textView2, textView3, textView4, customTextView2, textView5, linearLayout4, textView6, frameLayout4, frameLayout5);
                                                                                                                                                        }
                                                                                                                                                        i = R.id.watermark_parent_layout2;
                                                                                                                                                    } else {
                                                                                                                                                        i = R.id.watermark_parent_layout;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    i = R.id.watch_next_tv;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                i = R.id.watch_next_on_replay;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            i = R.id.user_email;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        i = R.id.tvSkipForward;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    i = R.id.tvSkipBackward;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i = R.id.tvKycSubHeader;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i = R.id.tvKycHeader;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = R.id.tvCorrectionNote;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = R.id.top_container;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.root;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.rightDock;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.preview_root;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.preview_play;
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
