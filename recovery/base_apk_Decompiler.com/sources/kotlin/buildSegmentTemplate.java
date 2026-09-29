package kotlin;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class buildSegmentTemplate implements getApplicationLabel {
    public final LinearLayout AudioAttributesCompatParcelizer;
    public final FrameLayout AudioAttributesImplApi21Parcelizer;
    public final ImageView AudioAttributesImplApi26Parcelizer;
    public final LinearLayout AudioAttributesImplBaseParcelizer;
    public final ProgressBar IconCompatParcelizer;
    public final notifyPlaylistError MediaBrowserCompatCustomActionResultReceiver;
    public final ImageView MediaBrowserCompatItemReceiver;
    public final TextView MediaBrowserCompatMediaItem;
    public final ConstraintLayout MediaBrowserCompatSearchResultReceiver;
    private ConstraintLayout MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final TextView MediaDescriptionCompat;
    public final TextView MediaMetadataCompat;
    public final FrameLayout RatingCompat;
    public final ConstraintLayout RemoteActionCompatParcelizer;
    private Guideline handleMediaPlayPauseIfPendingOnHandler;
    public final EpoxyRecyclerView onAddQueueItem;
    private Barrier onCommand;
    public final ConstraintLayout onCustomAction;
    private ImageView onFastForward;
    private Guideline onMediaButtonEvent;
    private Guideline onPause;
    private Guideline onPlay;
    private Guideline onPlayFromMediaId;
    private ConstraintLayout onPlayFromUri;
    private ImageView onPrepare;
    private final ConstraintLayout onPrepareFromMediaId;
    private TextView onPrepareFromSearch;
    public final FrameLayout read;
    public final ConstraintLayout write;

    private buildSegmentTemplate(ConstraintLayout constraintLayout, Barrier barrier, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, LinearLayout linearLayout, ProgressBar progressBar, FrameLayout frameLayout, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, Guideline guideline5, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, LinearLayout linearLayout2, FrameLayout frameLayout2, ConstraintLayout constraintLayout5, notifyPlaylistError notifyplaylisterror, ConstraintLayout constraintLayout6, TextView textView, TextView textView2, TextView textView3, TextView textView4, FrameLayout frameLayout3, ConstraintLayout constraintLayout7, EpoxyRecyclerView epoxyRecyclerView) {
        this.onPrepareFromMediaId = constraintLayout;
        this.onCommand = barrier;
        this.write = constraintLayout2;
        this.RemoteActionCompatParcelizer = constraintLayout3;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = constraintLayout4;
        this.AudioAttributesCompatParcelizer = linearLayout;
        this.IconCompatParcelizer = progressBar;
        this.read = frameLayout;
        this.handleMediaPlayPauseIfPendingOnHandler = guideline;
        this.onPlay = guideline2;
        this.onPause = guideline3;
        this.onMediaButtonEvent = guideline4;
        this.onPlayFromMediaId = guideline5;
        this.MediaBrowserCompatItemReceiver = imageView;
        this.AudioAttributesImplApi26Parcelizer = imageView2;
        this.onFastForward = imageView3;
        this.onPrepare = imageView4;
        this.AudioAttributesImplBaseParcelizer = linearLayout2;
        this.AudioAttributesImplApi21Parcelizer = frameLayout2;
        this.onPlayFromUri = constraintLayout5;
        this.MediaBrowserCompatCustomActionResultReceiver = notifyplaylisterror;
        this.MediaBrowserCompatSearchResultReceiver = constraintLayout6;
        this.onPrepareFromSearch = textView;
        this.MediaDescriptionCompat = textView2;
        this.MediaBrowserCompatMediaItem = textView3;
        this.MediaMetadataCompat = textView4;
        this.RatingCompat = frameLayout3;
        this.onCustomAction = constraintLayout7;
        this.onAddQueueItem = epoxyRecyclerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout IconCompatParcelizer() {
        return this.onPrepareFromMediaId;
    }

    public static buildSegmentTemplate IconCompatParcelizer(View view) {
        int i = R.id.barrier_watch_next;
        Barrier barrier = (Barrier) getApplicationIcon.IconCompatParcelizer(view, R.id.barrier_watch_next);
        if (barrier != null) {
            i = R.id.btn_full_video;
            ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.btn_full_video);
            if (constraintLayout != null) {
                i = R.id.btn_next_video;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.btn_next_video);
                if (constraintLayout2 != null) {
                    i = R.id.constraint_parent;
                    ConstraintLayout constraintLayout3 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.constraint_parent);
                    if (constraintLayout3 != null) {
                        i = R.id.container_empty_bookmark;
                        LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.container_empty_bookmark);
                        if (linearLayout != null) {
                            i = R.id.determinateBar;
                            ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.determinateBar);
                            if (progressBar != null) {
                                i = R.id.fragment_container;
                                FrameLayout frameLayout = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.fragment_container);
                                if (frameLayout != null) {
                                    i = R.id.gl_bottom;
                                    Guideline guideline = (Guideline) getApplicationIcon.IconCompatParcelizer(view, R.id.gl_bottom);
                                    if (guideline != null) {
                                        i = R.id.gl_left;
                                        Guideline guideline2 = (Guideline) getApplicationIcon.IconCompatParcelizer(view, R.id.gl_left);
                                        if (guideline2 != null) {
                                            i = R.id.gl_right;
                                            Guideline guideline3 = (Guideline) getApplicationIcon.IconCompatParcelizer(view, R.id.gl_right);
                                            if (guideline3 != null) {
                                                i = R.id.gl_right_padding;
                                                Guideline guideline4 = (Guideline) getApplicationIcon.IconCompatParcelizer(view, R.id.gl_right_padding);
                                                if (guideline4 != null) {
                                                    i = R.id.gl_top;
                                                    Guideline guideline5 = (Guideline) getApplicationIcon.IconCompatParcelizer(view, R.id.gl_top);
                                                    if (guideline5 != null) {
                                                        i = R.id.imgBack;
                                                        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.imgBack);
                                                        if (imageView != null) {
                                                            i = R.id.iv_clear_watch_next;
                                                            ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.iv_clear_watch_next);
                                                            if (imageView2 != null) {
                                                                i = R.id.iv_full_play_icon;
                                                                ImageView imageView3 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.iv_full_play_icon);
                                                                if (imageView3 != null) {
                                                                    i = R.id.iv_next_play_icon;
                                                                    ImageView imageView4 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.iv_next_play_icon);
                                                                    if (imageView4 != null) {
                                                                        i = R.id.ll_video_timeline_recycler_view;
                                                                        LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.ll_video_timeline_recycler_view);
                                                                        if (linearLayout2 != null) {
                                                                            i = R.id.loading_container;
                                                                            FrameLayout frameLayout2 = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.loading_container);
                                                                            if (frameLayout2 != null) {
                                                                                ConstraintLayout constraintLayout4 = (ConstraintLayout) view;
                                                                                i = R.id.sticky_header_layout;
                                                                                View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.sticky_header_layout);
                                                                                if (viewIconCompatParcelizer != null) {
                                                                                    notifyPlaylistError notifyplaylisterror = notifyPlaylistError.read(viewIconCompatParcelizer);
                                                                                    i = R.id.toolbar_timeline;
                                                                                    ConstraintLayout constraintLayout5 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar_timeline);
                                                                                    if (constraintLayout5 != null) {
                                                                                        i = R.id.tv_full_video;
                                                                                        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_full_video);
                                                                                        if (textView != null) {
                                                                                            i = R.id.tv_next_video;
                                                                                            TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_next_video);
                                                                                            if (textView2 != null) {
                                                                                                TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_timelineSubtitle);
                                                                                                if (textView3 != null) {
                                                                                                    TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_timelineTitle);
                                                                                                    if (textView4 != null) {
                                                                                                        FrameLayout frameLayout3 = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.video_fragment_container);
                                                                                                        if (frameLayout3 != null) {
                                                                                                            ConstraintLayout constraintLayout6 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.videoOptionsOverlay);
                                                                                                            if (constraintLayout6 != null) {
                                                                                                                EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.video_timeline_recycler_view);
                                                                                                                if (epoxyRecyclerView != null) {
                                                                                                                    return new buildSegmentTemplate(constraintLayout4, barrier, constraintLayout, constraintLayout2, constraintLayout3, linearLayout, progressBar, frameLayout, guideline, guideline2, guideline3, guideline4, guideline5, imageView, imageView2, imageView3, imageView4, linearLayout2, frameLayout2, constraintLayout4, notifyplaylisterror, constraintLayout5, textView, textView2, textView3, textView4, frameLayout3, constraintLayout6, epoxyRecyclerView);
                                                                                                                }
                                                                                                                i = R.id.video_timeline_recycler_view;
                                                                                                            } else {
                                                                                                                i = R.id.videoOptionsOverlay;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.video_fragment_container;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.tv_timelineTitle;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.tv_timelineSubtitle;
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
