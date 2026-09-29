package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class isIndependent implements getApplicationLabel {
    public final CardView AudioAttributesCompatParcelizer;
    public final LinearLayout AudioAttributesImplApi21Parcelizer;
    public final DefaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener AudioAttributesImplApi26Parcelizer;
    public final ImageView AudioAttributesImplBaseParcelizer;
    public final CardView IconCompatParcelizer;
    public final CardView MediaBrowserCompatCustomActionResultReceiver;
    public final CardView MediaBrowserCompatItemReceiver;
    public final LinearLayout MediaBrowserCompatMediaItem;
    public final TextView MediaBrowserCompatSearchResultReceiver;
    public final TextView MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final ProgressBar MediaDescriptionCompat;
    public final ScrollView MediaMetadataCompat;
    public final SwitchMaterial RatingCompat;
    public final ConstraintLayout RemoteActionCompatParcelizer;
    public final TextView handleMediaPlayPauseIfPendingOnHandler;
    public final TextView onAddQueueItem;
    public final TextView onCommand;
    public final TextView onCustomAction;
    public final TextView onFastForward;
    public final TextView onMediaButtonEvent;
    private ConstraintLayout onPause;
    public final TextView onPlay;
    public final TextView onPlayFromMediaId;
    private Guideline onPlayFromSearch;
    private Guideline onPlayFromUri;
    private Guideline onPrepare;
    private Guideline onPrepareFromMediaId;
    private Guideline onPrepareFromSearch;
    private maybeThrowPrimaryPlaylistRefreshError onPrepareFromUri;
    private ImageView onRemoveQueueItem;
    private Space onRemoveQueueItemAt;
    private final ConstraintLayout onRewind;
    private ConstraintLayout onSeekTo;
    private View onSetCaptioningEnabled;
    private TextView onSetPlaybackSpeed;
    private TextView onSetRating;
    private TextView onSetShuffleMode;
    public final CardView read;
    public final CardView write;

    private isIndependent(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, CardView cardView, CardView cardView2, CardView cardView3, CardView cardView4, CardView cardView5, CardView cardView6, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, Guideline guideline5, ImageView imageView, maybeThrowPrimaryPlaylistRefreshError maybethrowprimaryplaylistrefresherror, ImageView imageView2, LinearLayout linearLayout, DefaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener, ConstraintLayout constraintLayout4, ProgressBar progressBar, ScrollView scrollView, LinearLayout linearLayout2, Space space, SwitchMaterial switchMaterial, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, View view) {
        this.onRewind = constraintLayout;
        this.onPause = constraintLayout2;
        this.RemoteActionCompatParcelizer = constraintLayout3;
        this.IconCompatParcelizer = cardView;
        this.read = cardView2;
        this.AudioAttributesCompatParcelizer = cardView3;
        this.write = cardView4;
        this.MediaBrowserCompatCustomActionResultReceiver = cardView5;
        this.MediaBrowserCompatItemReceiver = cardView6;
        this.onPlayFromUri = guideline;
        this.onPrepareFromMediaId = guideline2;
        this.onPrepareFromSearch = guideline3;
        this.onPrepare = guideline4;
        this.onPlayFromSearch = guideline5;
        this.onRemoveQueueItem = imageView;
        this.onPrepareFromUri = maybethrowprimaryplaylistrefresherror;
        this.AudioAttributesImplBaseParcelizer = imageView2;
        this.AudioAttributesImplApi21Parcelizer = linearLayout;
        this.AudioAttributesImplApi26Parcelizer = defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener;
        this.onSeekTo = constraintLayout4;
        this.MediaDescriptionCompat = progressBar;
        this.MediaMetadataCompat = scrollView;
        this.MediaBrowserCompatMediaItem = linearLayout2;
        this.onRemoveQueueItemAt = space;
        this.RatingCompat = switchMaterial;
        this.MediaBrowserCompatSearchResultReceiver = textView;
        this.onAddQueueItem = textView2;
        this.onCustomAction = textView3;
        this.handleMediaPlayPauseIfPendingOnHandler = textView4;
        this.onCommand = textView5;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = textView6;
        this.onPlayFromMediaId = textView7;
        this.onMediaButtonEvent = textView8;
        this.onSetShuffleMode = textView9;
        this.onSetPlaybackSpeed = textView10;
        this.onSetRating = textView11;
        this.onPlay = textView12;
        this.onFastForward = textView13;
        this.onSetCaptioningEnabled = view;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.onRewind;
    }

    public static isIndependent AudioAttributesCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.fragment_profile_landing, viewGroup, false));
    }

    private static isIndependent AudioAttributesCompatParcelizer(View view) {
        int i = R.id.clResetPassword;
        ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.clResetPassword);
        if (constraintLayout != null) {
            i = R.id.clToolbar;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.clToolbar);
            if (constraintLayout2 != null) {
                i = R.id.cvKyc;
                CardView cardView = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.cvKyc);
                if (cardView != null) {
                    i = R.id.cvProfileSubscription;
                    CardView cardView2 = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.cvProfileSubscription);
                    if (cardView2 != null) {
                        i = R.id.cvResetContent;
                        CardView cardView3 = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.cvResetContent);
                        if (cardView3 != null) {
                            i = R.id.cvResetPassword;
                            CardView cardView4 = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.cvResetPassword);
                            if (cardView4 != null) {
                                i = R.id.cvTheme;
                                CardView cardView5 = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.cvTheme);
                                if (cardView5 != null) {
                                    i = R.id.cvVibration;
                                    CardView cardView6 = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.cvVibration);
                                    if (cardView6 != null) {
                                        i = R.id.glEnd16;
                                        Guideline guideline = (Guideline) getApplicationIcon.IconCompatParcelizer(view, R.id.glEnd16);
                                        if (guideline != null) {
                                            i = R.id.glEnd30;
                                            Guideline guideline2 = (Guideline) getApplicationIcon.IconCompatParcelizer(view, R.id.glEnd30);
                                            if (guideline2 != null) {
                                                i = R.id.glStart16;
                                                Guideline guideline3 = (Guideline) getApplicationIcon.IconCompatParcelizer(view, R.id.glStart16);
                                                if (guideline3 != null) {
                                                    i = R.id.glStart30;
                                                    Guideline guideline4 = (Guideline) getApplicationIcon.IconCompatParcelizer(view, R.id.glStart30);
                                                    if (guideline4 != null) {
                                                        i = R.id.glTop30;
                                                        Guideline guideline5 = (Guideline) getApplicationIcon.IconCompatParcelizer(view, R.id.glTop30);
                                                        if (guideline5 != null) {
                                                            i = R.id.imgReset;
                                                            ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.imgReset);
                                                            if (imageView != null) {
                                                                i = R.id.incProPlanBanner;
                                                                View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.incProPlanBanner);
                                                                if (viewIconCompatParcelizer != null) {
                                                                    maybeThrowPrimaryPlaylistRefreshError maybethrowprimaryplaylistrefresherrorWrite = maybeThrowPrimaryPlaylistRefreshError.write(viewIconCompatParcelizer);
                                                                    i = R.id.ivBack;
                                                                    ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivBack);
                                                                    if (imageView2 != null) {
                                                                        i = R.id.layoutInfo;
                                                                        LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.layoutInfo);
                                                                        if (linearLayout != null) {
                                                                            i = R.id.layout_profile;
                                                                            View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.layout_profile);
                                                                            if (viewIconCompatParcelizer2 != null) {
                                                                                DefaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener = DefaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener.read(viewIconCompatParcelizer2);
                                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) view;
                                                                                i = R.id.loadingContainer;
                                                                                ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.loadingContainer);
                                                                                if (progressBar != null) {
                                                                                    i = R.id.scrollContainer;
                                                                                    ScrollView scrollView = (ScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.scrollContainer);
                                                                                    if (scrollView != null) {
                                                                                        i = R.id.settingsOptions;
                                                                                        LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.settingsOptions);
                                                                                        if (linearLayout2 != null) {
                                                                                            i = R.id.spcProfileBottom;
                                                                                            Space space = (Space) getApplicationIcon.IconCompatParcelizer(view, R.id.spcProfileBottom);
                                                                                            if (space != null) {
                                                                                                SwitchMaterial switchMaterial = (SwitchMaterial) getApplicationIcon.IconCompatParcelizer(view, R.id.swVibration);
                                                                                                if (switchMaterial != null) {
                                                                                                    TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvAccountSettingsHeader);
                                                                                                    if (textView != null) {
                                                                                                        TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvAppSettingsHeader);
                                                                                                        if (textView2 != null) {
                                                                                                            TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvEmail);
                                                                                                            if (textView3 != null) {
                                                                                                                TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvKycStatus);
                                                                                                                if (textView4 != null) {
                                                                                                                    TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvLogout);
                                                                                                                    if (textView5 != null) {
                                                                                                                        TextView textView6 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvMedicalCollege);
                                                                                                                        if (textView6 != null) {
                                                                                                                            TextView textView7 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvName);
                                                                                                                            if (textView7 != null) {
                                                                                                                                TextView textView8 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvProfileSubscription);
                                                                                                                                if (textView8 != null) {
                                                                                                                                    TextView textView9 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvResetContent);
                                                                                                                                    if (textView9 != null) {
                                                                                                                                        TextView textView10 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvResetPassword);
                                                                                                                                        if (textView10 != null) {
                                                                                                                                            TextView textView11 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvResetSubtitle);
                                                                                                                                            if (textView11 != null) {
                                                                                                                                                TextView textView12 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTheme);
                                                                                                                                                if (textView12 != null) {
                                                                                                                                                    TextView textView13 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvVibration);
                                                                                                                                                    if (textView13 != null) {
                                                                                                                                                        View viewIconCompatParcelizer3 = getApplicationIcon.IconCompatParcelizer(view, R.id.vProfileBackground);
                                                                                                                                                        if (viewIconCompatParcelizer3 != null) {
                                                                                                                                                            return new isIndependent(constraintLayout3, constraintLayout, constraintLayout2, cardView, cardView2, cardView3, cardView4, cardView5, cardView6, guideline, guideline2, guideline3, guideline4, guideline5, imageView, maybethrowprimaryplaylistrefresherrorWrite, imageView2, linearLayout, defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener, constraintLayout3, progressBar, scrollView, linearLayout2, space, switchMaterial, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, viewIconCompatParcelizer3);
                                                                                                                                                        }
                                                                                                                                                        i = R.id.vProfileBackground;
                                                                                                                                                    } else {
                                                                                                                                                        i = R.id.tvVibration;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    i = R.id.tvTheme;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                i = R.id.tvResetSubtitle;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            i = R.id.tvResetPassword;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        i = R.id.tvResetContent;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    i = R.id.tvProfileSubscription;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i = R.id.tvName;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i = R.id.tvMedicalCollege;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = R.id.tvLogout;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = R.id.tvKycStatus;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.tvEmail;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.tvAppSettingsHeader;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.tvAccountSettingsHeader;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.swVibration;
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
