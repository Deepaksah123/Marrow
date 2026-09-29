package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class buildAndPrepareAudioSampleStreamWrappers implements getApplicationLabel {
    public final LinearLayout AudioAttributesCompatParcelizer;
    public final ScrollView AudioAttributesImplApi21Parcelizer;
    public final FrameLayout AudioAttributesImplApi26Parcelizer;
    public final ImageView AudioAttributesImplBaseParcelizer;
    public final LinearLayout IconCompatParcelizer;
    public final ProgressBar MediaBrowserCompatCustomActionResultReceiver;
    public final getLoadedPlaylistDiscontinuitySequence MediaBrowserCompatItemReceiver;
    public final Button MediaBrowserCompatMediaItem;
    public final TextView MediaBrowserCompatSearchResultReceiver;
    public final TextView MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final MaterialCardView MediaDescriptionCompat;
    public final TextView MediaMetadataCompat;
    public final LinearLayout RatingCompat;
    public final TextView RemoteActionCompatParcelizer;
    public final MaterialToolbar handleMediaPlayPauseIfPendingOnHandler;
    public final TextView onAddQueueItem;
    public final TextView onCommand;
    public final TextView onCustomAction;
    private final FrameLayout onPause;
    public final CheckBox read;
    public final TextView write;

    private buildAndPrepareAudioSampleStreamWrappers(FrameLayout frameLayout, LinearLayout linearLayout, TextView textView, CheckBox checkBox, TextView textView2, LinearLayout linearLayout2, FrameLayout frameLayout2, ImageView imageView, ScrollView scrollView, getLoadedPlaylistDiscontinuitySequence getloadedplaylistdiscontinuitysequence, ProgressBar progressBar, LinearLayout linearLayout3, MaterialCardView materialCardView, Button button, TextView textView3, TextView textView4, MaterialToolbar materialToolbar, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.onPause = frameLayout;
        this.AudioAttributesCompatParcelizer = linearLayout;
        this.write = textView;
        this.read = checkBox;
        this.RemoteActionCompatParcelizer = textView2;
        this.IconCompatParcelizer = linearLayout2;
        this.AudioAttributesImplApi26Parcelizer = frameLayout2;
        this.AudioAttributesImplBaseParcelizer = imageView;
        this.AudioAttributesImplApi21Parcelizer = scrollView;
        this.MediaBrowserCompatItemReceiver = getloadedplaylistdiscontinuitysequence;
        this.MediaBrowserCompatCustomActionResultReceiver = progressBar;
        this.RatingCompat = linearLayout3;
        this.MediaDescriptionCompat = materialCardView;
        this.MediaBrowserCompatMediaItem = button;
        this.MediaBrowserCompatSearchResultReceiver = textView3;
        this.MediaMetadataCompat = textView4;
        this.handleMediaPlayPauseIfPendingOnHandler = materialToolbar;
        this.onCommand = textView5;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = textView6;
        this.onAddQueueItem = textView7;
        this.onCustomAction = textView8;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final FrameLayout IconCompatParcelizer() {
        return this.onPause;
    }

    public static buildAndPrepareAudioSampleStreamWrappers RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.fragment_test_introduction_marrow2, viewGroup, false));
    }

    private static buildAndPrepareAudioSampleStreamWrappers AudioAttributesCompatParcelizer(View view) {
        int i = R.id.anonymousContainer;
        LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.anonymousContainer);
        if (linearLayout != null) {
            i = R.id.attend_on_website;
            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.attend_on_website);
            if (textView != null) {
                i = R.id.cbIsAnonymous;
                CheckBox checkBox = (CheckBox) getApplicationIcon.IconCompatParcelizer(view, R.id.cbIsAnonymous);
                if (checkBox != null) {
                    i = R.id.comingSoonText;
                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.comingSoonText);
                    if (textView2 != null) {
                        i = R.id.containerId;
                        LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.containerId);
                        if (linearLayout2 != null) {
                            i = R.id.flContainer;
                            FrameLayout frameLayout = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.flContainer);
                            if (frameLayout != null) {
                                i = R.id.imgInfo;
                                ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.imgInfo);
                                if (imageView != null) {
                                    i = R.id.instructionContainer;
                                    ScrollView scrollView = (ScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.instructionContainer);
                                    if (scrollView != null) {
                                        i = R.id.instructionLayout;
                                        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.instructionLayout);
                                        if (viewIconCompatParcelizer != null) {
                                            getLoadedPlaylistDiscontinuitySequence getloadedplaylistdiscontinuitysequenceIconCompatParcelizer = getLoadedPlaylistDiscontinuitySequence.IconCompatParcelizer(viewIconCompatParcelizer);
                                            i = R.id.loadingContainer;
                                            ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.loadingContainer);
                                            if (progressBar != null) {
                                                i = R.id.mainContainer;
                                                LinearLayout linearLayout3 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.mainContainer);
                                                if (linearLayout3 != null) {
                                                    i = R.id.notesTestIntroCard;
                                                    MaterialCardView materialCardView = (MaterialCardView) getApplicationIcon.IconCompatParcelizer(view, R.id.notesTestIntroCard);
                                                    if (materialCardView != null) {
                                                        i = R.id.startButtonText;
                                                        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.startButtonText);
                                                        if (button != null) {
                                                            i = R.id.testSubTitleView;
                                                            TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.testSubTitleView);
                                                            if (textView3 != null) {
                                                                i = R.id.testTitleView;
                                                                TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.testTitleView);
                                                                if (textView4 != null) {
                                                                    i = R.id.toolbar;
                                                                    MaterialToolbar materialToolbar = (MaterialToolbar) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                                                                    if (materialToolbar != null) {
                                                                        i = R.id.tvNotesTestIntro;
                                                                        TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvNotesTestIntro);
                                                                        if (textView5 != null) {
                                                                            i = R.id.tvResultDesc;
                                                                            TextView textView6 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvResultDesc);
                                                                            if (textView6 != null) {
                                                                                i = R.id.typeIndicatorView;
                                                                                TextView textView7 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.typeIndicatorView);
                                                                                if (textView7 != null) {
                                                                                    i = R.id.website_url;
                                                                                    TextView textView8 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.website_url);
                                                                                    if (textView8 != null) {
                                                                                        return new buildAndPrepareAudioSampleStreamWrappers((FrameLayout) view, linearLayout, textView, checkBox, textView2, linearLayout2, frameLayout, imageView, scrollView, getloadedplaylistdiscontinuitysequenceIconCompatParcelizer, progressBar, linearLayout3, materialCardView, button, textView3, textView4, materialToolbar, textView5, textView6, textView7, textView8);
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
