package kotlin;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes.dex */
public final class getSegmentIndex implements getApplicationLabel {
    public final LinearLayout AudioAttributesCompatParcelizer;
    public final TextView AudioAttributesImplApi21Parcelizer;
    public final TextView AudioAttributesImplApi26Parcelizer;
    public final TextView AudioAttributesImplBaseParcelizer;
    public final TextView IconCompatParcelizer;
    public final LinearLayout MediaBrowserCompatCustomActionResultReceiver;
    public final TextView MediaBrowserCompatItemReceiver;
    public final TextView MediaBrowserCompatMediaItem;
    public final TextView MediaBrowserCompatSearchResultReceiver;
    public final TextView MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final TextView MediaDescriptionCompat;
    public final TextView MediaMetadataCompat;
    public final TextView RatingCompat;
    public final TextView RemoteActionCompatParcelizer;
    public final TextView handleMediaPlayPauseIfPendingOnHandler;
    public final TextView onAddQueueItem;
    public final ConstraintLayout onCommand;
    public final LinearLayout onCustomAction;
    public final TextView onFastForward;
    public final getMultivariantPlaylist onMediaButtonEvent;
    public final TextView onPause;
    public final TextView onPlay;
    public final TextView onPlayFromMediaId;
    private View onPlayFromSearch;
    private View onPlayFromUri;
    public final ConstraintLayout onPrepare;
    private ImageView onPrepareFromMediaId;
    private View onPrepareFromSearch;
    private TextView onPrepareFromUri;
    private TextView onRemoveQueueItem;
    private final LinearLayout onRemoveQueueItemAt;
    private View onRewind;
    private ScrollView onSeekTo;
    private TextView onSetRating;
    private TextView onSetRepeatMode;
    private TextView onSetShuffleMode;
    public final LinearLayout read;
    public final DefaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener write;

    private getSegmentIndex(LinearLayout linearLayout, View view, LinearLayout linearLayout2, View view2, View view3, ImageView imageView, TextView textView, TextView textView2, DefaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener, TextView textView3, LinearLayout linearLayout3, TextView textView4, LinearLayout linearLayout4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, LinearLayout linearLayout5, ConstraintLayout constraintLayout, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, ScrollView scrollView, getMultivariantPlaylist getmultivariantplaylist, View view4, TextView textView19, TextView textView20, TextView textView21, TextView textView22, TextView textView23, ConstraintLayout constraintLayout2) {
        this.onRemoveQueueItemAt = linearLayout;
        this.onPlayFromUri = view;
        this.AudioAttributesCompatParcelizer = linearLayout2;
        this.onPrepareFromSearch = view2;
        this.onPlayFromSearch = view3;
        this.onPrepareFromMediaId = imageView;
        this.RemoteActionCompatParcelizer = textView;
        this.onPrepareFromUri = textView2;
        this.write = defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener;
        this.IconCompatParcelizer = textView3;
        this.read = linearLayout3;
        this.AudioAttributesImplApi21Parcelizer = textView4;
        this.MediaBrowserCompatCustomActionResultReceiver = linearLayout4;
        this.AudioAttributesImplApi26Parcelizer = textView5;
        this.AudioAttributesImplBaseParcelizer = textView6;
        this.MediaBrowserCompatItemReceiver = textView7;
        this.MediaBrowserCompatMediaItem = textView8;
        this.RatingCompat = textView9;
        this.MediaMetadataCompat = textView10;
        this.MediaDescriptionCompat = textView11;
        this.MediaBrowserCompatSearchResultReceiver = textView12;
        this.onCustomAction = linearLayout5;
        this.onCommand = constraintLayout;
        this.onAddQueueItem = textView13;
        this.handleMediaPlayPauseIfPendingOnHandler = textView14;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = textView15;
        this.onFastForward = textView16;
        this.onPlayFromMediaId = textView17;
        this.onRemoveQueueItem = textView18;
        this.onSeekTo = scrollView;
        this.onMediaButtonEvent = getmultivariantplaylist;
        this.onRewind = view4;
        this.onSetShuffleMode = textView19;
        this.onPlay = textView20;
        this.onSetRating = textView21;
        this.onSetRepeatMode = textView22;
        this.onPause = textView23;
        this.onPrepare = constraintLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.onRemoveQueueItemAt;
    }

    public static getSegmentIndex IconCompatParcelizer(View view) {
        int i = R.id.bottomDivider;
        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.bottomDivider);
        if (viewIconCompatParcelizer != null) {
            i = R.id.debugging_options;
            LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.debugging_options);
            if (linearLayout != null) {
                i = R.id.divider_2;
                View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.divider_2);
                if (viewIconCompatParcelizer2 != null) {
                    i = R.id.divider_3;
                    View viewIconCompatParcelizer3 = getApplicationIcon.IconCompatParcelizer(view, R.id.divider_3);
                    if (viewIconCompatParcelizer3 != null) {
                        i = R.id.imageView5;
                        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.imageView5);
                        if (imageView != null) {
                            i = R.id.label_buy_now_special;
                            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.label_buy_now_special);
                            if (textView != null) {
                                i = R.id.label_upgrade_plan;
                                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.label_upgrade_plan);
                                if (textView2 != null) {
                                    i = R.id.layoutProfilePicture;
                                    View viewIconCompatParcelizer4 = getApplicationIcon.IconCompatParcelizer(view, R.id.layoutProfilePicture);
                                    if (viewIconCompatParcelizer4 != null) {
                                        DefaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener = DefaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener.read(viewIconCompatParcelizer4);
                                        i = R.id.navAboutUs;
                                        TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.navAboutUs);
                                        if (textView3 != null) {
                                            i = R.id.navAddVideosContainer;
                                            LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.navAddVideosContainer);
                                            if (linearLayout2 != null) {
                                                i = R.id.navAppVersion;
                                                TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.navAppVersion);
                                                if (textView4 != null) {
                                                    i = R.id.navBuyNowContainer;
                                                    LinearLayout linearLayout3 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.navBuyNowContainer);
                                                    if (linearLayout3 != null) {
                                                        i = R.id.navContactUs;
                                                        TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.navContactUs);
                                                        if (textView5 != null) {
                                                            i = R.id.navDeleteMcqParent;
                                                            TextView textView6 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.navDeleteMcqParent);
                                                            if (textView6 != null) {
                                                                i = R.id.navDownloadPdfNotes;
                                                                TextView textView7 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.navDownloadPdfNotes);
                                                                if (textView7 != null) {
                                                                    i = R.id.navExportDb;
                                                                    TextView textView8 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.navExportDb);
                                                                    if (textView8 != null) {
                                                                        i = R.id.navFaq;
                                                                        TextView textView9 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.navFaq);
                                                                        if (textView9 != null) {
                                                                            i = R.id.navInvite;
                                                                            TextView textView10 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.navInvite);
                                                                            if (textView10 != null) {
                                                                                i = R.id.navLearnMore;
                                                                                TextView textView11 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.navLearnMore);
                                                                                if (textView11 != null) {
                                                                                    i = R.id.navLogout;
                                                                                    TextView textView12 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.navLogout);
                                                                                    if (textView12 != null) {
                                                                                        i = R.id.navMyPlan;
                                                                                        LinearLayout linearLayout4 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.navMyPlan);
                                                                                        if (linearLayout4 != null) {
                                                                                            i = R.id.navMyProfileView;
                                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.navMyProfileView);
                                                                                            if (constraintLayout != null) {
                                                                                                TextView textView13 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.navNotes);
                                                                                                if (textView13 != null) {
                                                                                                    TextView textView14 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.navRateUs);
                                                                                                    if (textView14 != null) {
                                                                                                        TextView textView15 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.navReferalCoupon);
                                                                                                        if (textView15 != null) {
                                                                                                            TextView textView16 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.navReportCopyright);
                                                                                                            if (textView16 != null) {
                                                                                                                TextView textView17 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.navTerms);
                                                                                                                if (textView17 != null) {
                                                                                                                    TextView textView18 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.navYourCourse);
                                                                                                                    if (textView18 != null) {
                                                                                                                        ScrollView scrollView = (ScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.navigation_recycler_view);
                                                                                                                        if (scrollView != null) {
                                                                                                                            View viewIconCompatParcelizer5 = getApplicationIcon.IconCompatParcelizer(view, R.id.newCourse);
                                                                                                                            if (viewIconCompatParcelizer5 != null) {
                                                                                                                                getMultivariantPlaylist getmultivariantplaylistWrite = getMultivariantPlaylist.write(viewIconCompatParcelizer5);
                                                                                                                                View viewIconCompatParcelizer6 = getApplicationIcon.IconCompatParcelizer(view, R.id.topDivider);
                                                                                                                                if (viewIconCompatParcelizer6 != null) {
                                                                                                                                    TextView textView19 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvBuyNow);
                                                                                                                                    if (textView19 != null) {
                                                                                                                                        TextView textView20 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvProfileName);
                                                                                                                                        if (textView20 != null) {
                                                                                                                                            TextView textView21 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSettings);
                                                                                                                                            if (textView21 != null) {
                                                                                                                                                TextView textView22 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvUpgradePlan);
                                                                                                                                                if (textView22 != null) {
                                                                                                                                                    TextView textView23 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.yourCourse);
                                                                                                                                                    if (textView23 != null) {
                                                                                                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.yourCourseContainer);
                                                                                                                                                        if (constraintLayout2 != null) {
                                                                                                                                                            return new getSegmentIndex((LinearLayout) view, viewIconCompatParcelizer, linearLayout, viewIconCompatParcelizer2, viewIconCompatParcelizer3, imageView, textView, textView2, defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener, textView3, linearLayout2, textView4, linearLayout3, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, linearLayout4, constraintLayout, textView13, textView14, textView15, textView16, textView17, textView18, scrollView, getmultivariantplaylistWrite, viewIconCompatParcelizer6, textView19, textView20, textView21, textView22, textView23, constraintLayout2);
                                                                                                                                                        }
                                                                                                                                                        i = R.id.yourCourseContainer;
                                                                                                                                                    } else {
                                                                                                                                                        i = R.id.yourCourse;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    i = R.id.tvUpgradePlan;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                i = R.id.tvSettings;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            i = R.id.tvProfileName;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        i = R.id.tvBuyNow;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    i = R.id.topDivider;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i = R.id.newCourse;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i = R.id.navigation_recycler_view;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = R.id.navYourCourse;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = R.id.navTerms;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.navReportCopyright;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.navReferalCoupon;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.navRateUs;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.navNotes;
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
