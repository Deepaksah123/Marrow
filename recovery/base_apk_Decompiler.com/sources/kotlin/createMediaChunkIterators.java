package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class createMediaChunkIterators implements getApplicationLabel {
    public final ImageView AudioAttributesCompatParcelizer;
    public final LinearLayout AudioAttributesImplApi21Parcelizer;
    public final LinearLayout AudioAttributesImplApi26Parcelizer;
    public final ImageView AudioAttributesImplBaseParcelizer;
    public final Button IconCompatParcelizer;
    public final LinearLayout MediaBrowserCompatCustomActionResultReceiver;
    public final ImageView MediaBrowserCompatItemReceiver;
    public final LinearLayout MediaBrowserCompatMediaItem;
    public final LinearLayout MediaBrowserCompatSearchResultReceiver;
    public final ScrollView MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final LinearLayout MediaDescriptionCompat;
    public final LinearLayout MediaMetadataCompat;
    public final LinearLayout RatingCompat;
    public final Button RemoteActionCompatParcelizer;
    public final LinearLayout handleMediaPlayPauseIfPendingOnHandler;
    public final ProgressBar onAddQueueItem;
    public final RecyclerView onCommand;
    public final View onCustomAction;
    public final TextView onFastForward;
    public final MaterialToolbar onMediaButtonEvent;
    public final TextView onPause;
    public final TextView onPlay;
    public final TextView onPlayFromMediaId;
    public final FrameLayout onPlayFromSearch;
    private CardView onPlayFromUri;
    private ImageView onPrepare;
    public final HlsMediaPlaylistServerControl onPrepareFromMediaId;
    public final HlsMediaPlaylistSegmentBase onPrepareFromSearch;
    private LinearLayout onPrepareFromUri;
    private final LinearLayout onRemoveQueueItem;
    private LinearLayout onRemoveQueueItemAt;
    private LinearLayout onRewind;
    private LinearLayout onSeekTo;
    private TextView onSetPlaybackSpeed;
    private View onSetRating;
    public final ImageView read;
    public final View write;

    private createMediaChunkIterators(LinearLayout linearLayout, Button button, Button button2, CardView cardView, View view, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, LinearLayout linearLayout10, LinearLayout linearLayout11, LinearLayout linearLayout12, LinearLayout linearLayout13, LinearLayout linearLayout14, ScrollView scrollView, ProgressBar progressBar, View view2, RecyclerView recyclerView, MaterialToolbar materialToolbar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, View view3, FrameLayout frameLayout, HlsMediaPlaylistSegmentBase hlsMediaPlaylistSegmentBase, HlsMediaPlaylistServerControl hlsMediaPlaylistServerControl) {
        this.onRemoveQueueItem = linearLayout;
        this.IconCompatParcelizer = button;
        this.RemoteActionCompatParcelizer = button2;
        this.onPlayFromUri = cardView;
        this.write = view;
        this.AudioAttributesCompatParcelizer = imageView;
        this.read = imageView2;
        this.onPrepare = imageView3;
        this.MediaBrowserCompatItemReceiver = imageView4;
        this.AudioAttributesImplBaseParcelizer = imageView5;
        this.onRemoveQueueItemAt = linearLayout2;
        this.AudioAttributesImplApi21Parcelizer = linearLayout3;
        this.MediaBrowserCompatCustomActionResultReceiver = linearLayout4;
        this.AudioAttributesImplApi26Parcelizer = linearLayout5;
        this.RatingCompat = linearLayout6;
        this.onRewind = linearLayout7;
        this.MediaBrowserCompatMediaItem = linearLayout8;
        this.onPrepareFromUri = linearLayout9;
        this.onSeekTo = linearLayout10;
        this.MediaBrowserCompatSearchResultReceiver = linearLayout11;
        this.MediaMetadataCompat = linearLayout12;
        this.MediaDescriptionCompat = linearLayout13;
        this.handleMediaPlayPauseIfPendingOnHandler = linearLayout14;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = scrollView;
        this.onAddQueueItem = progressBar;
        this.onCustomAction = view2;
        this.onCommand = recyclerView;
        this.onMediaButtonEvent = materialToolbar;
        this.onSetPlaybackSpeed = textView;
        this.onFastForward = textView2;
        this.onPlay = textView3;
        this.onPause = textView4;
        this.onPlayFromMediaId = textView5;
        this.onSetRating = view3;
        this.onPlayFromSearch = frameLayout;
        this.onPrepareFromSearch = hlsMediaPlaylistSegmentBase;
        this.onPrepareFromMediaId = hlsMediaPlaylistServerControl;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.onRemoveQueueItem;
    }

    public static createMediaChunkIterators IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.fragment_magic_module, viewGroup, false));
    }

    private static createMediaChunkIterators AudioAttributesCompatParcelizer(View view) {
        int i = R.id.btnStartModule;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnStartModule);
        if (button != null) {
            i = R.id.btnStartSolving;
            Button button2 = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnStartSolving);
            if (button2 != null) {
                i = R.id.card;
                CardView cardView = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.card);
                if (cardView != null) {
                    i = R.id.divider;
                    View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.divider);
                    if (viewIconCompatParcelizer != null) {
                        i = R.id.ivCompletedIcon;
                        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivCompletedIcon);
                        if (imageView != null) {
                            i = R.id.iv_info;
                            ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.iv_info);
                            if (imageView2 != null) {
                                i = R.id.ivMagicModuleIcon;
                                ImageView imageView3 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivMagicModuleIcon);
                                if (imageView3 != null) {
                                    i = R.id.ivMagicModuleView;
                                    ImageView imageView4 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivMagicModuleView);
                                    if (imageView4 != null) {
                                        i = R.id.ivPausedIcon;
                                        ImageView imageView5 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivPausedIcon);
                                        if (imageView5 != null) {
                                            i = R.id.llDateDetails;
                                            LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llDateDetails);
                                            if (linearLayout != null) {
                                                i = R.id.llHeader;
                                                LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llHeader);
                                                if (linearLayout2 != null) {
                                                    i = R.id.llInfo1;
                                                    LinearLayout linearLayout3 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llInfo1);
                                                    if (linearLayout3 != null) {
                                                        i = R.id.llInfo2;
                                                        LinearLayout linearLayout4 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llInfo2);
                                                        if (linearLayout4 != null) {
                                                            i = R.id.llInfo3;
                                                            LinearLayout linearLayout5 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llInfo3);
                                                            if (linearLayout5 != null) {
                                                                i = R.id.llIntroInfo;
                                                                LinearLayout linearLayout6 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llIntroInfo);
                                                                if (linearLayout6 != null) {
                                                                    i = R.id.llMagicModuleIntro;
                                                                    LinearLayout linearLayout7 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llMagicModuleIntro);
                                                                    if (linearLayout7 != null) {
                                                                        i = R.id.llModuleDetails;
                                                                        LinearLayout linearLayout8 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llModuleDetails);
                                                                        if (linearLayout8 != null) {
                                                                            i = R.id.llNext;
                                                                            LinearLayout linearLayout9 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llNext);
                                                                            if (linearLayout9 != null) {
                                                                                i = R.id.llProgress;
                                                                                LinearLayout linearLayout10 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llProgress);
                                                                                if (linearLayout10 != null) {
                                                                                    i = R.id.llUnableToGenerate;
                                                                                    LinearLayout linearLayout11 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llUnableToGenerate);
                                                                                    if (linearLayout11 != null) {
                                                                                        i = R.id.llUnableToGenerateTxt;
                                                                                        LinearLayout linearLayout12 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llUnableToGenerateTxt);
                                                                                        if (linearLayout12 != null) {
                                                                                            i = R.id.mainContainer;
                                                                                            LinearLayout linearLayout13 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.mainContainer);
                                                                                            if (linearLayout13 != null) {
                                                                                                ScrollView scrollView = (ScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.mainScrollableContainer);
                                                                                                if (scrollView != null) {
                                                                                                    ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.pbMagicModuleDetails);
                                                                                                    if (progressBar != null) {
                                                                                                        View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.popupOverlay);
                                                                                                        if (viewIconCompatParcelizer2 != null) {
                                                                                                            RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rvModuleProgress);
                                                                                                            if (recyclerView != null) {
                                                                                                                MaterialToolbar materialToolbar = (MaterialToolbar) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                                                                                                                if (materialToolbar != null) {
                                                                                                                    TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvIntroHeader);
                                                                                                                    if (textView != null) {
                                                                                                                        TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvMcqCount);
                                                                                                                        if (textView2 != null) {
                                                                                                                            TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvModuleDetail);
                                                                                                                            if (textView3 != null) {
                                                                                                                                TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvModuleStatus);
                                                                                                                                if (textView4 != null) {
                                                                                                                                    TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvModuleTitle);
                                                                                                                                    if (textView5 != null) {
                                                                                                                                        View viewIconCompatParcelizer3 = getApplicationIcon.IconCompatParcelizer(view, R.id.view);
                                                                                                                                        if (viewIconCompatParcelizer3 != null) {
                                                                                                                                            FrameLayout frameLayout = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.viewMain);
                                                                                                                                            if (frameLayout != null) {
                                                                                                                                                View viewIconCompatParcelizer4 = getApplicationIcon.IconCompatParcelizer(view, R.id.viewModuleScore);
                                                                                                                                                if (viewIconCompatParcelizer4 != null) {
                                                                                                                                                    HlsMediaPlaylistSegmentBase hlsMediaPlaylistSegmentBaseWrite = HlsMediaPlaylistSegmentBase.write(viewIconCompatParcelizer4);
                                                                                                                                                    View viewIconCompatParcelizer5 = getApplicationIcon.IconCompatParcelizer(view, R.id.viewModuleStats);
                                                                                                                                                    if (viewIconCompatParcelizer5 != null) {
                                                                                                                                                        return new createMediaChunkIterators((LinearLayout) view, button, button2, cardView, viewIconCompatParcelizer, imageView, imageView2, imageView3, imageView4, imageView5, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, linearLayout10, linearLayout11, linearLayout12, linearLayout13, scrollView, progressBar, viewIconCompatParcelizer2, recyclerView, materialToolbar, textView, textView2, textView3, textView4, textView5, viewIconCompatParcelizer3, frameLayout, hlsMediaPlaylistSegmentBaseWrite, HlsMediaPlaylistServerControl.RemoteActionCompatParcelizer(viewIconCompatParcelizer5));
                                                                                                                                                    }
                                                                                                                                                    i = R.id.viewModuleStats;
                                                                                                                                                } else {
                                                                                                                                                    i = R.id.viewModuleScore;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                i = R.id.viewMain;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            i = R.id.view;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        i = R.id.tvModuleTitle;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    i = R.id.tvModuleStatus;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i = R.id.tvModuleDetail;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i = R.id.tvMcqCount;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = R.id.tvIntroHeader;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = R.id.toolbar;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.rvModuleProgress;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.popupOverlay;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.pbMagicModuleDetails;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.mainScrollableContainer;
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
