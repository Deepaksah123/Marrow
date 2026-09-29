package kotlin;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsTrackMetadataEntry1 implements getApplicationLabel {
    public final ConstraintLayout AudioAttributesCompatParcelizer;
    public final formatsMatch AudioAttributesImplApi21Parcelizer;
    public final WebvttExtractor AudioAttributesImplApi26Parcelizer;
    public final LinearLayout AudioAttributesImplBaseParcelizer;
    public final ImageButton IconCompatParcelizer;
    public final excludeMediaPlaylist MediaBrowserCompatCustomActionResultReceiver;
    public final bindSampleQueueToSampleStream MediaBrowserCompatItemReceiver;
    public final TextView MediaBrowserCompatMediaItem;
    public final RatingBar MediaBrowserCompatSearchResultReceiver;
    private ImageView MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final TextView MediaDescriptionCompat;
    public final LinearLayout MediaMetadataCompat;
    public final ConstraintLayout RatingCompat;
    public final ProgressBar RemoteActionCompatParcelizer;
    private LinearLayout handleMediaPlayPauseIfPendingOnHandler;
    public final TextView onAddQueueItem;
    public final TextView onCommand;
    private ImageView onCustomAction;
    private final ConstraintLayout onFastForward;
    private TextView onMediaButtonEvent;
    private NestedScrollView onPause;
    private LinearLayout onPlay;
    public final FrameLayout read;
    public final ImageView write;

    private HlsTrackMetadataEntry1(ConstraintLayout constraintLayout, ImageButton imageButton, ConstraintLayout constraintLayout2, LinearLayout linearLayout, FrameLayout frameLayout, ProgressBar progressBar, ImageView imageView, ImageView imageView2, ImageView imageView3, formatsMatch formatsmatch, bindSampleQueueToSampleStream bindsamplequeuetosamplestream, WebvttExtractor webvttExtractor, excludeMediaPlaylist excludemediaplaylist, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, RatingBar ratingBar, ConstraintLayout constraintLayout3, NestedScrollView nestedScrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.onFastForward = constraintLayout;
        this.IconCompatParcelizer = imageButton;
        this.AudioAttributesCompatParcelizer = constraintLayout2;
        this.handleMediaPlayPauseIfPendingOnHandler = linearLayout;
        this.read = frameLayout;
        this.RemoteActionCompatParcelizer = progressBar;
        this.write = imageView;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = imageView2;
        this.onCustomAction = imageView3;
        this.AudioAttributesImplApi21Parcelizer = formatsmatch;
        this.MediaBrowserCompatItemReceiver = bindsamplequeuetosamplestream;
        this.AudioAttributesImplApi26Parcelizer = webvttExtractor;
        this.MediaBrowserCompatCustomActionResultReceiver = excludemediaplaylist;
        this.AudioAttributesImplBaseParcelizer = linearLayout2;
        this.MediaMetadataCompat = linearLayout3;
        this.onPlay = linearLayout4;
        this.MediaBrowserCompatSearchResultReceiver = ratingBar;
        this.RatingCompat = constraintLayout3;
        this.onPause = nestedScrollView;
        this.MediaDescriptionCompat = textView;
        this.onMediaButtonEvent = textView2;
        this.MediaBrowserCompatMediaItem = textView3;
        this.onCommand = textView4;
        this.onAddQueueItem = textView5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout IconCompatParcelizer() {
        return this.onFastForward;
    }

    public static HlsTrackMetadataEntry1 AudioAttributesCompatParcelizer(View view) {
        int i = R.id.btnDownload;
        ImageButton imageButton = (ImageButton) getApplicationIcon.IconCompatParcelizer(view, R.id.btnDownload);
        if (imageButton != null) {
            i = R.id.clSubtitleRating;
            ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.clSubtitleRating);
            if (constraintLayout != null) {
                i = R.id.contentContainer;
                LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.contentContainer);
                if (linearLayout != null) {
                    i = R.id.downloadContainerV2;
                    FrameLayout frameLayout = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.downloadContainerV2);
                    if (frameLayout != null) {
                        i = R.id.download_progress;
                        ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.download_progress);
                        if (progressBar != null) {
                            i = R.id.img_square;
                            ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.img_square);
                            if (imageView != null) {
                                i = R.id.ivInfoIcon;
                                ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivInfoIcon);
                                if (imageView2 != null) {
                                    i = R.id.ivNotesIcon;
                                    ImageView imageView3 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivNotesIcon);
                                    if (imageView3 != null) {
                                        i = R.id.layoutActiveRecall;
                                        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.layoutActiveRecall);
                                        if (viewIconCompatParcelizer != null) {
                                            formatsMatch formatsmatchRemoteActionCompatParcelizer = formatsMatch.RemoteActionCompatParcelizer(viewIconCompatParcelizer);
                                            i = R.id.layoutEmptyTopics;
                                            View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.layoutEmptyTopics);
                                            if (viewIconCompatParcelizer2 != null) {
                                                bindSampleQueueToSampleStream bindsamplequeuetosamplestreamAudioAttributesCompatParcelizer = bindSampleQueueToSampleStream.AudioAttributesCompatParcelizer(viewIconCompatParcelizer2);
                                                i = R.id.layoutRelatedModulesV2;
                                                View viewIconCompatParcelizer3 = getApplicationIcon.IconCompatParcelizer(view, R.id.layoutRelatedModulesV2);
                                                if (viewIconCompatParcelizer3 != null) {
                                                    WebvttExtractor webvttExtractorIconCompatParcelizer = WebvttExtractor.IconCompatParcelizer(viewIconCompatParcelizer3);
                                                    i = R.id.layoutTopics;
                                                    View viewIconCompatParcelizer4 = getApplicationIcon.IconCompatParcelizer(view, R.id.layoutTopics);
                                                    if (viewIconCompatParcelizer4 != null) {
                                                        excludeMediaPlaylist excludemediaplaylistAudioAttributesCompatParcelizer = excludeMediaPlaylist.AudioAttributesCompatParcelizer(viewIconCompatParcelizer4);
                                                        i = R.id.llImageAttribution;
                                                        LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llImageAttribution);
                                                        if (linearLayout2 != null) {
                                                            i = R.id.llNotes;
                                                            LinearLayout linearLayout3 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llNotes);
                                                            if (linearLayout3 != null) {
                                                                i = R.id.llRating;
                                                                LinearLayout linearLayout4 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llRating);
                                                                if (linearLayout4 != null) {
                                                                    i = R.id.ratingBar;
                                                                    RatingBar ratingBar = (RatingBar) getApplicationIcon.IconCompatParcelizer(view, R.id.ratingBar);
                                                                    if (ratingBar != null) {
                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                                                                        i = R.id.scrollContent;
                                                                        NestedScrollView nestedScrollView = (NestedScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.scrollContent);
                                                                        if (nestedScrollView != null) {
                                                                            i = R.id.tvAuthorName;
                                                                            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvAuthorName);
                                                                            if (textView != null) {
                                                                                i = R.id.tvImageAttributionV2;
                                                                                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvImageAttributionV2);
                                                                                if (textView2 != null) {
                                                                                    i = R.id.tvNotes;
                                                                                    TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvNotes);
                                                                                    if (textView3 != null) {
                                                                                        i = R.id.tvRatingText;
                                                                                        TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvRatingText);
                                                                                        if (textView4 != null) {
                                                                                            i = R.id.tvVidTitle;
                                                                                            TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvVidTitle);
                                                                                            if (textView5 != null) {
                                                                                                return new HlsTrackMetadataEntry1(constraintLayout2, imageButton, constraintLayout, linearLayout, frameLayout, progressBar, imageView, imageView2, imageView3, formatsmatchRemoteActionCompatParcelizer, bindsamplequeuetosamplestreamAudioAttributesCompatParcelizer, webvttExtractorIconCompatParcelizer, excludemediaplaylistAudioAttributesCompatParcelizer, linearLayout2, linearLayout3, linearLayout4, ratingBar, constraintLayout2, nestedScrollView, textView, textView2, textView3, textView4, textView5);
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
