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
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultHlsDataSourceFactory implements getApplicationLabel {
    public final Button AudioAttributesCompatParcelizer;
    public final ImageView AudioAttributesImplApi21Parcelizer;
    public final ImageView AudioAttributesImplApi26Parcelizer;
    public final LinearLayout AudioAttributesImplBaseParcelizer;
    public final ImageView IconCompatParcelizer;
    public final TextView MediaBrowserCompatCustomActionResultReceiver;
    public final LinearLayout MediaBrowserCompatItemReceiver;
    public final LinearLayout MediaBrowserCompatMediaItem;
    public final LinearLayout MediaBrowserCompatSearchResultReceiver;
    public final ProgressBar MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final TextView MediaDescriptionCompat;
    public final FrameLayout MediaMetadataCompat;
    public final ProgressBar RatingCompat;
    public final TextView RemoteActionCompatParcelizer;
    public final ProgressBar handleMediaPlayPauseIfPendingOnHandler;
    public final ProgressBar onAddQueueItem;
    public final ProgressBar onCommand;
    public final ProgressBar onCustomAction;
    public final ScrollView onFastForward;
    public final ProgressBar onMediaButtonEvent;
    public final TextView onPause;
    public final Toolbar onPlay;
    public final TextView onPlayFromMediaId;
    public final TextView onPlayFromSearch;
    public final TextView onPlayFromUri;
    public final TextView onPrepare;
    public final TextView onPrepareFromMediaId;
    public final TextView onPrepareFromSearch;
    public final TextView onPrepareFromUri;
    public final TextView onRemoveQueueItem;
    public final TextView onRemoveQueueItemAt;
    public final TextView onRewind;
    public final TextView onSeekTo;
    public final TextView onSetCaptioningEnabled;
    private LinearLayout onSetPlaybackSpeed;
    public final TextView onSetRating;
    private LinearLayout onSetRepeatMode;
    private LinearLayout onSetShuffleMode;
    private final ConstraintLayout onSkipToNext;
    private LinearLayout onSkipToQueueItem;
    public final ImageView read;
    private LinearLayout setSessionImpl;
    public final ImageView write;

    private DefaultHlsDataSourceFactory(ConstraintLayout constraintLayout, Button button, TextView textView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, TextView textView2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, TextView textView3, FrameLayout frameLayout, ProgressBar progressBar, ProgressBar progressBar2, ProgressBar progressBar3, ProgressBar progressBar4, ProgressBar progressBar5, ProgressBar progressBar6, ScrollView scrollView, ProgressBar progressBar7, Toolbar toolbar, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17) {
        this.onSkipToNext = constraintLayout;
        this.AudioAttributesCompatParcelizer = button;
        this.RemoteActionCompatParcelizer = textView;
        this.IconCompatParcelizer = imageView;
        this.read = imageView2;
        this.write = imageView3;
        this.AudioAttributesImplApi21Parcelizer = imageView4;
        this.AudioAttributesImplApi26Parcelizer = imageView5;
        this.MediaBrowserCompatCustomActionResultReceiver = textView2;
        this.AudioAttributesImplBaseParcelizer = linearLayout;
        this.onSetRepeatMode = linearLayout2;
        this.onSetShuffleMode = linearLayout3;
        this.MediaBrowserCompatItemReceiver = linearLayout4;
        this.MediaBrowserCompatMediaItem = linearLayout5;
        this.onSetPlaybackSpeed = linearLayout6;
        this.MediaBrowserCompatSearchResultReceiver = linearLayout7;
        this.onSkipToQueueItem = linearLayout8;
        this.setSessionImpl = linearLayout9;
        this.MediaDescriptionCompat = textView3;
        this.MediaMetadataCompat = frameLayout;
        this.RatingCompat = progressBar;
        this.onCommand = progressBar2;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = progressBar3;
        this.onCustomAction = progressBar4;
        this.handleMediaPlayPauseIfPendingOnHandler = progressBar5;
        this.onAddQueueItem = progressBar6;
        this.onFastForward = scrollView;
        this.onMediaButtonEvent = progressBar7;
        this.onPlay = toolbar;
        this.onPause = textView4;
        this.onPlayFromMediaId = textView5;
        this.onPrepare = textView6;
        this.onPrepareFromMediaId = textView7;
        this.onPlayFromUri = textView8;
        this.onPlayFromSearch = textView9;
        this.onPrepareFromSearch = textView10;
        this.onRemoveQueueItem = textView11;
        this.onPrepareFromUri = textView12;
        this.onRemoveQueueItemAt = textView13;
        this.onSeekTo = textView14;
        this.onRewind = textView15;
        this.onSetCaptioningEnabled = textView16;
        this.onSetRating = textView17;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.onSkipToNext;
    }

    public static DefaultHlsDataSourceFactory AudioAttributesCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.fragment_custom_module_introduction, viewGroup, false));
    }

    private static DefaultHlsDataSourceFactory AudioAttributesCompatParcelizer(View view) {
        int i = R.id.btnSolve;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnSolve);
        if (button != null) {
            i = R.id.cardSubTitle;
            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.cardSubTitle);
            if (textView != null) {
                i = R.id.check1;
                ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.check1);
                if (imageView != null) {
                    i = R.id.check2;
                    ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.check2);
                    if (imageView2 != null) {
                        i = R.id.check3;
                        ImageView imageView3 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.check3);
                        if (imageView3 != null) {
                            i = R.id.check4;
                            ImageView imageView4 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.check4);
                            if (imageView4 != null) {
                                i = R.id.check5;
                                ImageView imageView5 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.check5);
                                if (imageView5 != null) {
                                    i = R.id.copyCode;
                                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.copyCode);
                                    if (textView2 != null) {
                                        i = R.id.llCMDetails;
                                        LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llCMDetails);
                                        if (linearLayout != null) {
                                            i = R.id.llCount;
                                            LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llCount);
                                            if (linearLayout2 != null) {
                                                i = R.id.llDifficulty;
                                                LinearLayout linearLayout3 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llDifficulty);
                                                if (linearLayout3 != null) {
                                                    i = R.id.llInviteCode;
                                                    LinearLayout linearLayout4 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llInviteCode);
                                                    if (linearLayout4 != null) {
                                                        i = R.id.llMain;
                                                        LinearLayout linearLayout5 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llMain);
                                                        if (linearLayout5 != null) {
                                                            i = R.id.llMode;
                                                            LinearLayout linearLayout6 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llMode);
                                                            if (linearLayout6 != null) {
                                                                i = R.id.llNote;
                                                                LinearLayout linearLayout7 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llNote);
                                                                if (linearLayout7 != null) {
                                                                    i = R.id.llSubjects;
                                                                    LinearLayout linearLayout8 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llSubjects);
                                                                    if (linearLayout8 != null) {
                                                                        i = R.id.llTags;
                                                                        LinearLayout linearLayout9 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llTags);
                                                                        if (linearLayout9 != null) {
                                                                            i = R.id.note;
                                                                            TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.note);
                                                                            if (textView3 != null) {
                                                                                i = R.id.pageLoader;
                                                                                FrameLayout frameLayout = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.pageLoader);
                                                                                if (frameLayout != null) {
                                                                                    i = R.id.pb1;
                                                                                    ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.pb1);
                                                                                    if (progressBar != null) {
                                                                                        i = R.id.pb2;
                                                                                        ProgressBar progressBar2 = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.pb2);
                                                                                        if (progressBar2 != null) {
                                                                                            i = R.id.pb3;
                                                                                            ProgressBar progressBar3 = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.pb3);
                                                                                            if (progressBar3 != null) {
                                                                                                ProgressBar progressBar4 = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.pb4);
                                                                                                if (progressBar4 != null) {
                                                                                                    ProgressBar progressBar5 = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.pb5);
                                                                                                    if (progressBar5 != null) {
                                                                                                        ProgressBar progressBar6 = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.pbInviteCode);
                                                                                                        if (progressBar6 != null) {
                                                                                                            ScrollView scrollView = (ScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.scrollView2);
                                                                                                            if (scrollView != null) {
                                                                                                                ProgressBar progressBar7 = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.solveProgress);
                                                                                                                if (progressBar7 != null) {
                                                                                                                    Toolbar toolbar = (Toolbar) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                                                                                                                    if (toolbar != null) {
                                                                                                                        TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCMCode);
                                                                                                                        if (textView4 != null) {
                                                                                                                            TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCount);
                                                                                                                            if (textView5 != null) {
                                                                                                                                TextView textView6 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCreationTime);
                                                                                                                                if (textView6 != null) {
                                                                                                                                    TextView textView7 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvDifficulty);
                                                                                                                                    if (textView7 != null) {
                                                                                                                                        TextView textView8 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvDiscardAndNew);
                                                                                                                                        if (textView8 != null) {
                                                                                                                                            TextView textView9 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvMode);
                                                                                                                                            if (textView9 != null) {
                                                                                                                                                TextView textView10 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvQuesCount);
                                                                                                                                                if (textView10 != null) {
                                                                                                                                                    TextView textView11 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvShare);
                                                                                                                                                    if (textView11 != null) {
                                                                                                                                                        TextView textView12 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSolvedTime);
                                                                                                                                                        if (textView12 != null) {
                                                                                                                                                            TextView textView13 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSource);
                                                                                                                                                            if (textView13 != null) {
                                                                                                                                                                TextView textView14 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSubjects);
                                                                                                                                                                if (textView14 != null) {
                                                                                                                                                                    TextView textView15 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTags);
                                                                                                                                                                    if (textView15 != null) {
                                                                                                                                                                        TextView textView16 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTopicsCount);
                                                                                                                                                                        if (textView16 != null) {
                                                                                                                                                                            TextView textView17 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.txtAppbarTitle);
                                                                                                                                                                            if (textView17 != null) {
                                                                                                                                                                                return new DefaultHlsDataSourceFactory((ConstraintLayout) view, button, textView, imageView, imageView2, imageView3, imageView4, imageView5, textView2, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, textView3, frameLayout, progressBar, progressBar2, progressBar3, progressBar4, progressBar5, progressBar6, scrollView, progressBar7, toolbar, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17);
                                                                                                                                                                            }
                                                                                                                                                                            i = R.id.txtAppbarTitle;
                                                                                                                                                                        } else {
                                                                                                                                                                            i = R.id.tvTopicsCount;
                                                                                                                                                                        }
                                                                                                                                                                    } else {
                                                                                                                                                                        i = R.id.tvTags;
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    i = R.id.tvSubjects;
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                i = R.id.tvSource;
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            i = R.id.tvSolvedTime;
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        i = R.id.tvShare;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    i = R.id.tvQuesCount;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                i = R.id.tvMode;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            i = R.id.tvDiscardAndNew;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        i = R.id.tvDifficulty;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    i = R.id.tvCreationTime;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i = R.id.tvCount;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i = R.id.tvCMCode;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = R.id.toolbar;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = R.id.solveProgress;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.scrollView2;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.pbInviteCode;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.pb5;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.pb4;
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
