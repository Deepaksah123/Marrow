package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.marrow.R;
import com.marrow.ui.views.CustomAppBarLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class buildSampleStreamWrapper implements getApplicationLabel {
    public final View AudioAttributesCompatParcelizer;
    public final FrameLayout AudioAttributesImplApi21Parcelizer;
    public final LinearLayout AudioAttributesImplApi26Parcelizer;
    public final NestedScrollView AudioAttributesImplBaseParcelizer;
    public final CustomAppBarLayout IconCompatParcelizer;
    public final ProgressBar MediaBrowserCompatCustomActionResultReceiver;
    public final createSingleVariantMultivariantPlaylist MediaBrowserCompatItemReceiver;
    public final Toolbar MediaBrowserCompatMediaItem;
    public final RecyclerView MediaBrowserCompatSearchResultReceiver;
    private ConstraintLayout MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final TextView MediaDescriptionCompat;
    public final TextView MediaMetadataCompat;
    public final RecyclerView RatingCompat;
    public final copyStreams RemoteActionCompatParcelizer;
    public final ProgramInformation handleMediaPlayPauseIfPendingOnHandler;
    public final HlsMediaPlaylistPlaylistType onAddQueueItem;
    public final resolveUriString onCommand;
    private CollapsingToolbarLayout onCustomAction;
    private final CoordinatorLayout onPause;
    public final ComposeView read;
    public final Button write;

    private buildSampleStreamWrapper(CoordinatorLayout coordinatorLayout, CustomAppBarLayout customAppBarLayout, View view, Button button, CollapsingToolbarLayout collapsingToolbarLayout, ComposeView composeView, copyStreams copystreams, FrameLayout frameLayout, ConstraintLayout constraintLayout, LinearLayout linearLayout, ProgressBar progressBar, NestedScrollView nestedScrollView, createSingleVariantMultivariantPlaylist createsinglevariantmultivariantplaylist, RecyclerView recyclerView, RecyclerView recyclerView2, Toolbar toolbar, TextView textView, TextView textView2, ProgramInformation programInformation, HlsMediaPlaylistPlaylistType hlsMediaPlaylistPlaylistType, resolveUriString resolveuristring) {
        this.onPause = coordinatorLayout;
        this.IconCompatParcelizer = customAppBarLayout;
        this.AudioAttributesCompatParcelizer = view;
        this.write = button;
        this.onCustomAction = collapsingToolbarLayout;
        this.read = composeView;
        this.RemoteActionCompatParcelizer = copystreams;
        this.AudioAttributesImplApi21Parcelizer = frameLayout;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = constraintLayout;
        this.AudioAttributesImplApi26Parcelizer = linearLayout;
        this.MediaBrowserCompatCustomActionResultReceiver = progressBar;
        this.AudioAttributesImplBaseParcelizer = nestedScrollView;
        this.MediaBrowserCompatItemReceiver = createsinglevariantmultivariantplaylist;
        this.MediaBrowserCompatSearchResultReceiver = recyclerView;
        this.RatingCompat = recyclerView2;
        this.MediaBrowserCompatMediaItem = toolbar;
        this.MediaDescriptionCompat = textView;
        this.MediaMetadataCompat = textView2;
        this.handleMediaPlayPauseIfPendingOnHandler = programInformation;
        this.onAddQueueItem = hlsMediaPlaylistPlaylistType;
        this.onCommand = resolveuristring;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final CoordinatorLayout IconCompatParcelizer() {
        return this.onPause;
    }

    public static buildSampleStreamWrapper IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return RemoteActionCompatParcelizer(layoutInflater.inflate(R.layout.fragment_test_score, viewGroup, false));
    }

    private static buildSampleStreamWrapper RemoteActionCompatParcelizer(View view) {
        int i = R.id.appBar;
        CustomAppBarLayout customAppBarLayout = (CustomAppBarLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.appBar);
        if (customAppBarLayout != null) {
            i = R.id.bgTopperCard;
            View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.bgTopperCard);
            if (viewIconCompatParcelizer != null) {
                i = R.id.btnShare;
                Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnShare);
                if (button != null) {
                    i = R.id.collapsibleToolbar;
                    CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.collapsibleToolbar);
                    if (collapsingToolbarLayout != null) {
                        i = R.id.composeGtaCard;
                        ComposeView composeView = (ComposeView) getApplicationIcon.IconCompatParcelizer(view, R.id.composeGtaCard);
                        if (composeView != null) {
                            i = R.id.containerTimer;
                            View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.containerTimer);
                            if (viewIconCompatParcelizer2 != null) {
                                copyStreams copystreamsWrite = copyStreams.write(viewIconCompatParcelizer2);
                                i = R.id.flShareProgress;
                                FrameLayout frameLayout = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.flShareProgress);
                                if (frameLayout != null) {
                                    i = R.id.llContainer;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llContainer);
                                    if (constraintLayout != null) {
                                        i = R.id.llMain;
                                        LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llMain);
                                        if (linearLayout != null) {
                                            i = R.id.loadingContainer;
                                            ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.loadingContainer);
                                            if (progressBar != null) {
                                                i = R.id.nsvContainer;
                                                NestedScrollView nestedScrollView = (NestedScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.nsvContainer);
                                                if (nestedScrollView != null) {
                                                    i = R.id.rankViewContainer;
                                                    View viewIconCompatParcelizer3 = getApplicationIcon.IconCompatParcelizer(view, R.id.rankViewContainer);
                                                    if (viewIconCompatParcelizer3 != null) {
                                                        createSingleVariantMultivariantPlaylist createsinglevariantmultivariantplaylistRemoteActionCompatParcelizer = createSingleVariantMultivariantPlaylist.RemoteActionCompatParcelizer(viewIconCompatParcelizer3);
                                                        i = R.id.rlSubjects;
                                                        RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rlSubjects);
                                                        if (recyclerView != null) {
                                                            i = R.id.rlToppers;
                                                            RecyclerView recyclerView2 = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rlToppers);
                                                            if (recyclerView2 != null) {
                                                                i = R.id.toolbar;
                                                                Toolbar toolbar = (Toolbar) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                                                                if (toolbar != null) {
                                                                    i = R.id.tvSubjectPercentileHeader;
                                                                    TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSubjectPercentileHeader);
                                                                    if (textView != null) {
                                                                        i = R.id.tvToolbarTitle;
                                                                        TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvToolbarTitle);
                                                                        if (textView2 != null) {
                                                                            i = R.id.viewStubAnswersChanged;
                                                                            View viewIconCompatParcelizer4 = getApplicationIcon.IconCompatParcelizer(view, R.id.viewStubAnswersChanged);
                                                                            if (viewIconCompatParcelizer4 != null) {
                                                                                ProgramInformation programInformationAudioAttributesCompatParcelizer = ProgramInformation.AudioAttributesCompatParcelizer(viewIconCompatParcelizer4);
                                                                                i = R.id.viewStubGuessCard;
                                                                                View viewIconCompatParcelizer5 = getApplicationIcon.IconCompatParcelizer(view, R.id.viewStubGuessCard);
                                                                                if (viewIconCompatParcelizer5 != null) {
                                                                                    HlsMediaPlaylistPlaylistType hlsMediaPlaylistPlaylistTypeWrite = HlsMediaPlaylistPlaylistType.write(viewIconCompatParcelizer5);
                                                                                    i = R.id.viewStubPreviousNeet;
                                                                                    View viewIconCompatParcelizer6 = getApplicationIcon.IconCompatParcelizer(view, R.id.viewStubPreviousNeet);
                                                                                    if (viewIconCompatParcelizer6 != null) {
                                                                                        return new buildSampleStreamWrapper((CoordinatorLayout) view, customAppBarLayout, viewIconCompatParcelizer, button, collapsingToolbarLayout, composeView, copystreamsWrite, frameLayout, constraintLayout, linearLayout, progressBar, nestedScrollView, createsinglevariantmultivariantplaylistRemoteActionCompatParcelizer, recyclerView, recyclerView2, toolbar, textView, textView2, programInformationAudioAttributesCompatParcelizer, hlsMediaPlaylistPlaylistTypeWrite, resolveUriString.AudioAttributesCompatParcelizer(viewIconCompatParcelizer6));
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
