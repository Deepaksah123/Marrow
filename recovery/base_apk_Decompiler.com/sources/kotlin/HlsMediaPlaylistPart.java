package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.card.MaterialCardView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsMediaPlaylistPart implements getApplicationLabel {
    public final MaterialCardView AudioAttributesCompatParcelizer;
    public final LinearLayout AudioAttributesImplApi21Parcelizer;
    public final TextView AudioAttributesImplApi26Parcelizer;
    public final LinearLayout AudioAttributesImplBaseParcelizer;
    public final LottieAnimationView IconCompatParcelizer;
    public final LinearLayout MediaBrowserCompatCustomActionResultReceiver;
    public final LinearLayout MediaBrowserCompatItemReceiver;
    public final TextView MediaBrowserCompatMediaItem;
    public final TextView MediaBrowserCompatSearchResultReceiver;
    private View MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final TextView MediaDescriptionCompat;
    public final TextView MediaMetadataCompat;
    public final TextView RatingCompat;
    public final addMediaPlaylistUrls RemoteActionCompatParcelizer;
    private LinearLayout handleMediaPlayPauseIfPendingOnHandler;
    private LinearLayout onAddQueueItem;
    private final ConstraintLayout onCommand;
    private ConstraintLayout onCustomAction;
    private ConstraintLayout onMediaButtonEvent;
    private TextView onPause;
    public final ImageView read;
    public final ImageView write;

    private HlsMediaPlaylistPart(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, MaterialCardView materialCardView, ImageView imageView, View view, ImageView imageView2, LottieAnimationView lottieAnimationView, addMediaPlaylistUrls addmediaplaylisturls, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, ConstraintLayout constraintLayout3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.onCommand = constraintLayout;
        this.onCustomAction = constraintLayout2;
        this.AudioAttributesCompatParcelizer = materialCardView;
        this.read = imageView;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = view;
        this.write = imageView2;
        this.IconCompatParcelizer = lottieAnimationView;
        this.RemoteActionCompatParcelizer = addmediaplaylisturls;
        this.onAddQueueItem = linearLayout;
        this.AudioAttributesImplBaseParcelizer = linearLayout2;
        this.MediaBrowserCompatCustomActionResultReceiver = linearLayout3;
        this.MediaBrowserCompatItemReceiver = linearLayout4;
        this.AudioAttributesImplApi21Parcelizer = linearLayout5;
        this.handleMediaPlayPauseIfPendingOnHandler = linearLayout6;
        this.onMediaButtonEvent = constraintLayout3;
        this.AudioAttributesImplApi26Parcelizer = textView;
        this.onPause = textView2;
        this.MediaMetadataCompat = textView3;
        this.MediaBrowserCompatMediaItem = textView4;
        this.MediaDescriptionCompat = textView5;
        this.RatingCompat = textView6;
        this.MediaBrowserCompatSearchResultReceiver = textView7;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.onCommand;
    }

    public static HlsMediaPlaylistPart RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return IconCompatParcelizer(layoutInflater.inflate(R.layout.view_holder_test_revamp_v2, viewGroup, false));
    }

    private static HlsMediaPlaylistPart IconCompatParcelizer(View view) {
        int i = R.id.clMain;
        ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.clMain);
        if (constraintLayout != null) {
            i = R.id.cvMain;
            MaterialCardView materialCardView = (MaterialCardView) getApplicationIcon.IconCompatParcelizer(view, R.id.cvMain);
            if (materialCardView != null) {
                i = R.id.ivIndicator;
                ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivIndicator);
                if (imageView != null) {
                    i = R.id.ivLiveIndicator;
                    View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.ivLiveIndicator);
                    if (viewIconCompatParcelizer != null) {
                        i = R.id.ivLock;
                        ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivLock);
                        if (imageView2 != null) {
                            i = R.id.lavLiveIndicator;
                            LottieAnimationView lottieAnimationView = (LottieAnimationView) getApplicationIcon.IconCompatParcelizer(view, R.id.lavLiveIndicator);
                            if (lottieAnimationView != null) {
                                i = R.id.layoutMockTestBadgeContainer;
                                View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.layoutMockTestBadgeContainer);
                                if (viewIconCompatParcelizer2 != null) {
                                    addMediaPlaylistUrls addmediaplaylisturlsRemoteActionCompatParcelizer = addMediaPlaylistUrls.RemoteActionCompatParcelizer(viewIconCompatParcelizer2);
                                    i = R.id.llInfoLayout;
                                    LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llInfoLayout);
                                    if (linearLayout != null) {
                                        i = R.id.llLiveIndicator;
                                        LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llLiveIndicator);
                                        if (linearLayout2 != null) {
                                            i = R.id.llPredictedRank;
                                            LinearLayout linearLayout3 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llPredictedRank);
                                            if (linearLayout3 != null) {
                                                i = R.id.llProCard;
                                                LinearLayout linearLayout4 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llProCard);
                                                if (linearLayout4 != null) {
                                                    i = R.id.llRank;
                                                    LinearLayout linearLayout5 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llRank);
                                                    if (linearLayout5 != null) {
                                                        i = R.id.llStatus;
                                                        LinearLayout linearLayout6 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llStatus);
                                                        if (linearLayout6 != null) {
                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                                                            i = R.id.tvPredictedRank;
                                                            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPredictedRank);
                                                            if (textView != null) {
                                                                i = R.id.tvProTag;
                                                                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvProTag);
                                                                if (textView2 != null) {
                                                                    i = R.id.tvRank;
                                                                    TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvRank);
                                                                    if (textView3 != null) {
                                                                        i = R.id.tvSubTitle;
                                                                        TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSubTitle);
                                                                        if (textView4 != null) {
                                                                            i = R.id.tvSubTitle2;
                                                                            TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSubTitle2);
                                                                            if (textView5 != null) {
                                                                                i = R.id.tvTimer;
                                                                                TextView textView6 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTimer);
                                                                                if (textView6 != null) {
                                                                                    i = R.id.tvTitle;
                                                                                    TextView textView7 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTitle);
                                                                                    if (textView7 != null) {
                                                                                        return new HlsMediaPlaylistPart(constraintLayout2, constraintLayout, materialCardView, imageView, viewIconCompatParcelizer, imageView2, lottieAnimationView, addmediaplaylisturlsRemoteActionCompatParcelizer, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, constraintLayout2, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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
