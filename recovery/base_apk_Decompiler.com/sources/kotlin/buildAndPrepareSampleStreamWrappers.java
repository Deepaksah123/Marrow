package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class buildAndPrepareSampleStreamWrappers implements getApplicationLabel {
    public final ConstraintLayout AudioAttributesCompatParcelizer;
    public final ComposeView AudioAttributesImplApi21Parcelizer;
    public final EpoxyRecyclerView AudioAttributesImplApi26Parcelizer;
    public final onPlaylistChanged AudioAttributesImplBaseParcelizer;
    public final ImageButton IconCompatParcelizer;
    public final onPlaylistChanged MediaBrowserCompatCustomActionResultReceiver;
    public final ComposeView MediaBrowserCompatItemReceiver;
    public final onPlaylistChanged MediaBrowserCompatMediaItem;
    public final Group MediaBrowserCompatSearchResultReceiver;
    public final onPlaylistRefreshRequired MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final View MediaDescriptionCompat;
    public final ImageButton MediaMetadataCompat;
    public final HorizontalScrollView RatingCompat;
    public final ConstraintLayout RemoteActionCompatParcelizer;
    public final onPlaylistRefreshRequired handleMediaPlayPauseIfPendingOnHandler;
    public final ImageView onAddQueueItem;
    public final updateSampleStreams onCommand;
    public final onPlaylistRefreshRequired onCustomAction;
    public final LinearLayout onFastForward;
    public final ConstraintLayout onMediaButtonEvent;
    public final LinearLayout onPause;
    public final ProgressBar onPlay;
    public final maybeSetPrimaryUrl onPlayFromMediaId;
    public final SwitchMaterial onPlayFromSearch;
    public final TextView onPlayFromUri;
    public final NestedScrollView onPrepare;
    public final View onPrepareFromMediaId;
    public final CoordinatorLayout onPrepareFromSearch;
    public final getEndTimeUs onPrepareFromUri;
    public final TextView onRemoveQueueItem;
    public final TextView onRemoveQueueItemAt;
    public final TextView onRewind;
    public final TextView onSeekTo;
    public final Button onSetCaptioningEnabled;
    public final TextView onSetPlaybackSpeed;
    private View onSetRating;
    private ImageView onSetRepeatMode;
    public final TextView onSetShuffleMode;
    private TextView onSkipToNext;
    private LinearLayout onSkipToPrevious;
    private TextView onSkipToQueueItem;
    private final FrameLayout onStop;
    public final ConstraintLayout read;
    private FrameLayout setSessionImpl;
    public final ConstraintLayout write;

    private buildAndPrepareSampleStreamWrappers(FrameLayout frameLayout, ConstraintLayout constraintLayout, ImageButton imageButton, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, ComposeView composeView, ComposeView composeView2, EpoxyRecyclerView epoxyRecyclerView, onPlaylistChanged onplaylistchanged, onPlaylistChanged onplaylistchanged2, onPlaylistChanged onplaylistchanged3, Group group, HorizontalScrollView horizontalScrollView, ImageButton imageButton2, View view, View view2, ImageView imageView, ImageView imageView2, onPlaylistRefreshRequired onplaylistrefreshrequired, updateSampleStreams updatesamplestreams, onPlaylistRefreshRequired onplaylistrefreshrequired2, onPlaylistRefreshRequired onplaylistrefreshrequired3, maybeSetPrimaryUrl maybesetprimaryurl, LinearLayout linearLayout, ConstraintLayout constraintLayout5, LinearLayout linearLayout2, LinearLayout linearLayout3, FrameLayout frameLayout2, ProgressBar progressBar, NestedScrollView nestedScrollView, CoordinatorLayout coordinatorLayout, View view3, TextView textView, SwitchMaterial switchMaterial, getEndTimeUs getendtimeus, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, Button button) {
        this.onStop = frameLayout;
        this.AudioAttributesCompatParcelizer = constraintLayout;
        this.IconCompatParcelizer = imageButton;
        this.write = constraintLayout2;
        this.read = constraintLayout3;
        this.RemoteActionCompatParcelizer = constraintLayout4;
        this.MediaBrowserCompatItemReceiver = composeView;
        this.AudioAttributesImplApi21Parcelizer = composeView2;
        this.AudioAttributesImplApi26Parcelizer = epoxyRecyclerView;
        this.MediaBrowserCompatCustomActionResultReceiver = onplaylistchanged;
        this.AudioAttributesImplBaseParcelizer = onplaylistchanged2;
        this.MediaBrowserCompatMediaItem = onplaylistchanged3;
        this.MediaBrowserCompatSearchResultReceiver = group;
        this.RatingCompat = horizontalScrollView;
        this.MediaMetadataCompat = imageButton2;
        this.MediaDescriptionCompat = view;
        this.onSetRating = view2;
        this.onAddQueueItem = imageView;
        this.onSetRepeatMode = imageView2;
        this.handleMediaPlayPauseIfPendingOnHandler = onplaylistrefreshrequired;
        this.onCommand = updatesamplestreams;
        this.onCustomAction = onplaylistrefreshrequired2;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = onplaylistrefreshrequired3;
        this.onPlayFromMediaId = maybesetprimaryurl;
        this.onFastForward = linearLayout;
        this.onMediaButtonEvent = constraintLayout5;
        this.onSkipToPrevious = linearLayout2;
        this.onPause = linearLayout3;
        this.setSessionImpl = frameLayout2;
        this.onPlay = progressBar;
        this.onPrepare = nestedScrollView;
        this.onPrepareFromSearch = coordinatorLayout;
        this.onPrepareFromMediaId = view3;
        this.onPlayFromUri = textView;
        this.onPlayFromSearch = switchMaterial;
        this.onPrepareFromUri = getendtimeus;
        this.onSkipToQueueItem = textView2;
        this.onSkipToNext = textView3;
        this.onSeekTo = textView4;
        this.onRemoveQueueItemAt = textView5;
        this.onRemoveQueueItem = textView6;
        this.onRewind = textView7;
        this.onSetShuffleMode = textView8;
        this.onSetPlaybackSpeed = textView9;
        this.onSetCaptioningEnabled = button;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final FrameLayout IconCompatParcelizer() {
        return this.onStop;
    }

    public static buildAndPrepareSampleStreamWrappers AudioAttributesCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.fragment_video_landing, viewGroup, false));
    }

    private static buildAndPrepareSampleStreamWrappers write(View view) {
        int i = R.id.bottomNudgeContainer;
        ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.bottomNudgeContainer);
        if (constraintLayout != null) {
            i = R.id.btnCloseInternModeBanner;
            ImageButton imageButton = (ImageButton) getApplicationIcon.IconCompatParcelizer(view, R.id.btnCloseInternModeBanner);
            if (imageButton != null) {
                i = R.id.clInternModeBanner;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.clInternModeBanner);
                if (constraintLayout2 != null) {
                    i = R.id.clMain;
                    ConstraintLayout constraintLayout3 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.clMain);
                    if (constraintLayout3 != null) {
                        i = R.id.clSwitchEdition;
                        ConstraintLayout constraintLayout4 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.clSwitchEdition);
                        if (constraintLayout4 != null) {
                            i = R.id.composeViewAnnouncementBanner;
                            ComposeView composeView = (ComposeView) getApplicationIcon.IconCompatParcelizer(view, R.id.composeViewAnnouncementBanner);
                            if (composeView != null) {
                                i = R.id.compose_view_deck;
                                ComposeView composeView2 = (ComposeView) getApplicationIcon.IconCompatParcelizer(view, R.id.compose_view_deck);
                                if (composeView2 != null) {
                                    i = R.id.epoxyRVSubject;
                                    EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.epoxyRVSubject);
                                    if (epoxyRecyclerView != null) {
                                        i = R.id.fixedLayoutBookmarkedVideo;
                                        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.fixedLayoutBookmarkedVideo);
                                        if (viewIconCompatParcelizer != null) {
                                            onPlaylistChanged onplaylistchangedWrite = onPlaylistChanged.write(viewIconCompatParcelizer);
                                            i = R.id.fixedLayoutSampleVideo;
                                            View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.fixedLayoutSampleVideo);
                                            if (viewIconCompatParcelizer2 != null) {
                                                onPlaylistChanged onplaylistchangedWrite2 = onPlaylistChanged.write(viewIconCompatParcelizer2);
                                                i = R.id.fixedLayoutSavedVideo;
                                                View viewIconCompatParcelizer3 = getApplicationIcon.IconCompatParcelizer(view, R.id.fixedLayoutSavedVideo);
                                                if (viewIconCompatParcelizer3 != null) {
                                                    onPlaylistChanged onplaylistchangedWrite3 = onPlaylistChanged.write(viewIconCompatParcelizer3);
                                                    i = R.id.groupInternModeSwitch;
                                                    Group group = (Group) getApplicationIcon.IconCompatParcelizer(view, R.id.groupInternModeSwitch);
                                                    if (group != null) {
                                                        i = R.id.horizontalScrollView;
                                                        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.horizontalScrollView);
                                                        if (horizontalScrollView != null) {
                                                            i = R.id.ibTooltip;
                                                            ImageButton imageButton2 = (ImageButton) getApplicationIcon.IconCompatParcelizer(view, R.id.ibTooltip);
                                                            if (imageButton2 != null) {
                                                                i = R.id.internModeDivider;
                                                                View viewIconCompatParcelizer4 = getApplicationIcon.IconCompatParcelizer(view, R.id.internModeDivider);
                                                                if (viewIconCompatParcelizer4 != null) {
                                                                    i = R.id.internModeSwitchOverlay;
                                                                    View viewIconCompatParcelizer5 = getApplicationIcon.IconCompatParcelizer(view, R.id.internModeSwitchOverlay);
                                                                    if (viewIconCompatParcelizer5 != null) {
                                                                        i = R.id.ivSortDropDown;
                                                                        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivSortDropDown);
                                                                        if (imageView != null) {
                                                                            i = R.id.ivSwitchToEdition;
                                                                            ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivSwitchToEdition);
                                                                            if (imageView2 != null) {
                                                                                i = R.id.layoutBookmarkedVideo;
                                                                                View viewIconCompatParcelizer6 = getApplicationIcon.IconCompatParcelizer(view, R.id.layoutBookmarkedVideo);
                                                                                if (viewIconCompatParcelizer6 != null) {
                                                                                    onPlaylistRefreshRequired onplaylistrefreshrequiredRemoteActionCompatParcelizer = onPlaylistRefreshRequired.RemoteActionCompatParcelizer(viewIconCompatParcelizer6);
                                                                                    i = R.id.layoutContinueWatchingVideoSuggestionCard;
                                                                                    View viewIconCompatParcelizer7 = getApplicationIcon.IconCompatParcelizer(view, R.id.layoutContinueWatchingVideoSuggestionCard);
                                                                                    if (viewIconCompatParcelizer7 != null) {
                                                                                        updateSampleStreams updatesamplestreams = updateSampleStreams.read(viewIconCompatParcelizer7);
                                                                                        i = R.id.layoutSampleVideo;
                                                                                        View viewIconCompatParcelizer8 = getApplicationIcon.IconCompatParcelizer(view, R.id.layoutSampleVideo);
                                                                                        if (viewIconCompatParcelizer8 != null) {
                                                                                            onPlaylistRefreshRequired onplaylistrefreshrequiredRemoteActionCompatParcelizer2 = onPlaylistRefreshRequired.RemoteActionCompatParcelizer(viewIconCompatParcelizer8);
                                                                                            i = R.id.layoutSavedVideo;
                                                                                            View viewIconCompatParcelizer9 = getApplicationIcon.IconCompatParcelizer(view, R.id.layoutSavedVideo);
                                                                                            if (viewIconCompatParcelizer9 != null) {
                                                                                                onPlaylistRefreshRequired onplaylistrefreshrequiredRemoteActionCompatParcelizer3 = onPlaylistRefreshRequired.RemoteActionCompatParcelizer(viewIconCompatParcelizer9);
                                                                                                View viewIconCompatParcelizer10 = getApplicationIcon.IconCompatParcelizer(view, R.id.layoutVideoWatchNextCard);
                                                                                                if (viewIconCompatParcelizer10 != null) {
                                                                                                    maybeSetPrimaryUrl maybesetprimaryurlRemoteActionCompatParcelizer = maybeSetPrimaryUrl.RemoteActionCompatParcelizer(viewIconCompatParcelizer10);
                                                                                                    LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llFilledHorizontalView);
                                                                                                    if (linearLayout != null) {
                                                                                                        ConstraintLayout constraintLayout5 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llInternMode);
                                                                                                        if (constraintLayout5 != null) {
                                                                                                            LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llInternModeSwitchView);
                                                                                                            if (linearLayout2 != null) {
                                                                                                                LinearLayout linearLayout3 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llSubjectHeader);
                                                                                                                if (linearLayout3 != null) {
                                                                                                                    FrameLayout frameLayout = (FrameLayout) view;
                                                                                                                    ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.progressBar);
                                                                                                                    if (progressBar != null) {
                                                                                                                        NestedScrollView nestedScrollView = (NestedScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.rootScrollView);
                                                                                                                        if (nestedScrollView != null) {
                                                                                                                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.snackbar_container);
                                                                                                                            if (coordinatorLayout != null) {
                                                                                                                                View viewIconCompatParcelizer11 = getApplicationIcon.IconCompatParcelizer(view, R.id.sortOverlay);
                                                                                                                                if (viewIconCompatParcelizer11 != null) {
                                                                                                                                    TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.sortType);
                                                                                                                                    if (textView != null) {
                                                                                                                                        SwitchMaterial switchMaterial = (SwitchMaterial) getApplicationIcon.IconCompatParcelizer(view, R.id.switchInternMode);
                                                                                                                                        if (switchMaterial != null) {
                                                                                                                                            View viewIconCompatParcelizer12 = getApplicationIcon.IconCompatParcelizer(view, R.id.tooltipInternModeInfo);
                                                                                                                                            if (viewIconCompatParcelizer12 != null) {
                                                                                                                                                getEndTimeUs getendtimeusRemoteActionCompatParcelizer = getEndTimeUs.RemoteActionCompatParcelizer(viewIconCompatParcelizer12);
                                                                                                                                                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvHeaderInternModeBanner);
                                                                                                                                                if (textView2 != null) {
                                                                                                                                                    TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvInternModeDescription);
                                                                                                                                                    if (textView3 != null) {
                                                                                                                                                        TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvInternModeStatus);
                                                                                                                                                        if (textView4 != null) {
                                                                                                                                                            TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvInternModeSwitchMsg);
                                                                                                                                                            if (textView5 != null) {
                                                                                                                                                                TextView textView6 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvLearnMore);
                                                                                                                                                                if (textView6 != null) {
                                                                                                                                                                    TextView textView7 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvReportPiracy);
                                                                                                                                                                    if (textView7 != null) {
                                                                                                                                                                        TextView textView8 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSortByHeader);
                                                                                                                                                                        if (textView8 != null) {
                                                                                                                                                                            TextView textView9 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSwitchToEditionFlipHeader);
                                                                                                                                                                            if (textView9 != null) {
                                                                                                                                                                                Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTurnOn);
                                                                                                                                                                                if (button != null) {
                                                                                                                                                                                    return new buildAndPrepareSampleStreamWrappers(frameLayout, constraintLayout, imageButton, constraintLayout2, constraintLayout3, constraintLayout4, composeView, composeView2, epoxyRecyclerView, onplaylistchangedWrite, onplaylistchangedWrite2, onplaylistchangedWrite3, group, horizontalScrollView, imageButton2, viewIconCompatParcelizer4, viewIconCompatParcelizer5, imageView, imageView2, onplaylistrefreshrequiredRemoteActionCompatParcelizer, updatesamplestreams, onplaylistrefreshrequiredRemoteActionCompatParcelizer2, onplaylistrefreshrequiredRemoteActionCompatParcelizer3, maybesetprimaryurlRemoteActionCompatParcelizer, linearLayout, constraintLayout5, linearLayout2, linearLayout3, frameLayout, progressBar, nestedScrollView, coordinatorLayout, viewIconCompatParcelizer11, textView, switchMaterial, getendtimeusRemoteActionCompatParcelizer, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, button);
                                                                                                                                                                                }
                                                                                                                                                                                i = R.id.tvTurnOn;
                                                                                                                                                                            } else {
                                                                                                                                                                                i = R.id.tvSwitchToEditionFlipHeader;
                                                                                                                                                                            }
                                                                                                                                                                        } else {
                                                                                                                                                                            i = R.id.tvSortByHeader;
                                                                                                                                                                        }
                                                                                                                                                                    } else {
                                                                                                                                                                        i = R.id.tvReportPiracy;
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    i = R.id.tvLearnMore;
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                i = R.id.tvInternModeSwitchMsg;
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            i = R.id.tvInternModeStatus;
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        i = R.id.tvInternModeDescription;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    i = R.id.tvHeaderInternModeBanner;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                i = R.id.tooltipInternModeInfo;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            i = R.id.switchInternMode;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        i = R.id.sortType;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    i = R.id.sortOverlay;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i = R.id.snackbar_container;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i = R.id.rootScrollView;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = R.id.progressBar;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = R.id.llSubjectHeader;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.llInternModeSwitchView;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.llInternMode;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.llFilledHorizontalView;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.layoutVideoWatchNextCard;
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
