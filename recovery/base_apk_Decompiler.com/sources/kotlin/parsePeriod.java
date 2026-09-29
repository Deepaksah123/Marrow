package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.tabs.TabLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes.dex */
public final class parsePeriod implements getApplicationLabel {
    public final DrawerLayout AudioAttributesCompatParcelizer;
    public final FrameLayout AudioAttributesImplApi21Parcelizer;
    public final Period AudioAttributesImplApi26Parcelizer;
    public final ImageView AudioAttributesImplBaseParcelizer;
    public final getAdaptationSetIndex IconCompatParcelizer;
    public final ImageView MediaBrowserCompatCustomActionResultReceiver;
    public final ImageView MediaBrowserCompatItemReceiver;
    public final ConstraintLayout MediaBrowserCompatMediaItem;
    public final DashManifestParserRepresentationInfo MediaBrowserCompatSearchResultReceiver;
    public final FrameLayout MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final CardView MediaDescriptionCompat;
    public final LinearLayout MediaMetadataCompat;
    public final TextView RatingCompat;
    public final CardView RemoteActionCompatParcelizer;
    public final LinearLayout handleMediaPlayPauseIfPendingOnHandler;
    public final TextView onAddQueueItem;
    public final TextView onCommand;
    public final ConstraintLayout onCustomAction;
    private final FrameLayout onFastForward;
    private View onMediaButtonEvent;
    private LinearLayout onPause;
    private ConstraintLayout onPlay;
    private View onPlayFromMediaId;
    public final getSegmentIndex read;
    public final TabLayout write;

    private parsePeriod(FrameLayout frameLayout, TabLayout tabLayout, getAdaptationSetIndex getadaptationsetindex, CardView cardView, DrawerLayout drawerLayout, getSegmentIndex getsegmentindex, FrameLayout frameLayout2, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, Period period, LinearLayout linearLayout, ConstraintLayout constraintLayout2, LinearLayout linearLayout2, CardView cardView2, DashManifestParserRepresentationInfo dashManifestParserRepresentationInfo, View view, TextView textView, LinearLayout linearLayout3, TextView textView2, View view2, ConstraintLayout constraintLayout3, TextView textView3, FrameLayout frameLayout3) {
        this.onFastForward = frameLayout;
        this.write = tabLayout;
        this.IconCompatParcelizer = getadaptationsetindex;
        this.RemoteActionCompatParcelizer = cardView;
        this.AudioAttributesCompatParcelizer = drawerLayout;
        this.read = getsegmentindex;
        this.AudioAttributesImplApi21Parcelizer = frameLayout2;
        this.onPlay = constraintLayout;
        this.MediaBrowserCompatCustomActionResultReceiver = imageView;
        this.MediaBrowserCompatItemReceiver = imageView2;
        this.AudioAttributesImplBaseParcelizer = imageView3;
        this.AudioAttributesImplApi26Parcelizer = period;
        this.MediaMetadataCompat = linearLayout;
        this.MediaBrowserCompatMediaItem = constraintLayout2;
        this.onPause = linearLayout2;
        this.MediaDescriptionCompat = cardView2;
        this.MediaBrowserCompatSearchResultReceiver = dashManifestParserRepresentationInfo;
        this.onMediaButtonEvent = view;
        this.RatingCompat = textView;
        this.handleMediaPlayPauseIfPendingOnHandler = linearLayout3;
        this.onAddQueueItem = textView2;
        this.onPlayFromMediaId = view2;
        this.onCustomAction = constraintLayout3;
        this.onCommand = textView3;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = frameLayout3;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final FrameLayout IconCompatParcelizer() {
        return this.onFastForward;
    }

    public static parsePeriod write(LayoutInflater layoutInflater) {
        return read(layoutInflater);
    }

    private static parsePeriod read(LayoutInflater layoutInflater) {
        return IconCompatParcelizer(layoutInflater.inflate(R.layout.activity_home_revamp, (ViewGroup) null, false));
    }

    private static parsePeriod IconCompatParcelizer(View view) {
        int i = R.id.bottomNavigation;
        TabLayout tabLayout = (TabLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.bottomNavigation);
        if (tabLayout != null) {
            i = R.id.collegeYearUpdateBanner;
            View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.collegeYearUpdateBanner);
            if (viewIconCompatParcelizer != null) {
                getAdaptationSetIndex getadaptationsetindexRemoteActionCompatParcelizer = getAdaptationSetIndex.RemoteActionCompatParcelizer(viewIconCompatParcelizer);
                i = R.id.cvBottomNavigationContainer;
                CardView cardView = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.cvBottomNavigationContainer);
                if (cardView != null) {
                    i = R.id.drawerLayout;
                    DrawerLayout drawerLayout = (DrawerLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.drawerLayout);
                    if (drawerLayout != null) {
                        i = R.id.drawerMenu;
                        View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.drawerMenu);
                        if (viewIconCompatParcelizer2 != null) {
                            getSegmentIndex getsegmentindexIconCompatParcelizer = getSegmentIndex.IconCompatParcelizer(viewIconCompatParcelizer2);
                            i = R.id.fullContainer;
                            FrameLayout frameLayout = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.fullContainer);
                            if (frameLayout != null) {
                                i = R.id.homeAppBar;
                                ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.homeAppBar);
                                if (constraintLayout != null) {
                                    i = R.id.iconBookmark;
                                    ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.iconBookmark);
                                    if (imageView != null) {
                                        i = R.id.iconMenu;
                                        ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.iconMenu);
                                        if (imageView2 != null) {
                                            i = R.id.iconSearch;
                                            ImageView imageView3 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.iconSearch);
                                            if (imageView3 != null) {
                                                i = R.id.kycUploadBanner;
                                                View viewIconCompatParcelizer3 = getApplicationIcon.IconCompatParcelizer(view, R.id.kycUploadBanner);
                                                if (viewIconCompatParcelizer3 != null) {
                                                    Period periodIconCompatParcelizer = Period.IconCompatParcelizer(viewIconCompatParcelizer3);
                                                    i = R.id.layoutBottomNavigationContainer;
                                                    LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.layoutBottomNavigationContainer);
                                                    if (linearLayout != null) {
                                                        i = R.id.lytContent;
                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.lytContent);
                                                        if (constraintLayout2 != null) {
                                                            i = R.id.popup_notification_container;
                                                            LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.popup_notification_container);
                                                            if (linearLayout2 != null) {
                                                                i = R.id.proCard;
                                                                CardView cardView2 = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.proCard);
                                                                if (cardView2 != null) {
                                                                    i = R.id.renewPlanBanner;
                                                                    View viewIconCompatParcelizer4 = getApplicationIcon.IconCompatParcelizer(view, R.id.renewPlanBanner);
                                                                    if (viewIconCompatParcelizer4 != null) {
                                                                        DashManifestParserRepresentationInfo dashManifestParserRepresentationInfoAudioAttributesCompatParcelizer = DashManifestParserRepresentationInfo.AudioAttributesCompatParcelizer(viewIconCompatParcelizer4);
                                                                        i = R.id.screen_blocker;
                                                                        View viewIconCompatParcelizer5 = getApplicationIcon.IconCompatParcelizer(view, R.id.screen_blocker);
                                                                        if (viewIconCompatParcelizer5 != null) {
                                                                            i = R.id.textBranding;
                                                                            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.textBranding);
                                                                            if (textView != null) {
                                                                                i = R.id.textBrandingContainer;
                                                                                LinearLayout linearLayout3 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.textBrandingContainer);
                                                                                if (linearLayout3 != null) {
                                                                                    i = R.id.textPageTitle;
                                                                                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.textPageTitle);
                                                                                    if (textView2 != null) {
                                                                                        i = R.id.thinTopDivider;
                                                                                        View viewIconCompatParcelizer6 = getApplicationIcon.IconCompatParcelizer(view, R.id.thinTopDivider);
                                                                                        if (viewIconCompatParcelizer6 != null) {
                                                                                            i = R.id.toolbar;
                                                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                                                                                            if (constraintLayout3 != null) {
                                                                                                TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvGoPro);
                                                                                                if (textView3 != null) {
                                                                                                    FrameLayout frameLayout2 = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.upperContainer);
                                                                                                    if (frameLayout2 != null) {
                                                                                                        return new parsePeriod((FrameLayout) view, tabLayout, getadaptationsetindexRemoteActionCompatParcelizer, cardView, drawerLayout, getsegmentindexIconCompatParcelizer, frameLayout, constraintLayout, imageView, imageView2, imageView3, periodIconCompatParcelizer, linearLayout, constraintLayout2, linearLayout2, cardView2, dashManifestParserRepresentationInfoAudioAttributesCompatParcelizer, viewIconCompatParcelizer5, textView, linearLayout3, textView2, viewIconCompatParcelizer6, constraintLayout3, textView3, frameLayout2);
                                                                                                    }
                                                                                                    i = R.id.upperContainer;
                                                                                                } else {
                                                                                                    i = R.id.tvGoPro;
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
