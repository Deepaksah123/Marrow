package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class feedDataToExtractor implements getApplicationLabel {
    public final TextView AudioAttributesCompatParcelizer;
    public final ImageView AudioAttributesImplApi21Parcelizer;
    public final TextView AudioAttributesImplApi26Parcelizer;
    public final LinearLayout AudioAttributesImplBaseParcelizer;
    public final TextView IconCompatParcelizer;
    public final LinearLayout MediaBrowserCompatCustomActionResultReceiver;
    public final TextView MediaBrowserCompatItemReceiver;
    public final MaterialCardView MediaBrowserCompatMediaItem;
    public final TextView MediaBrowserCompatSearchResultReceiver;
    public final LinearLayout MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final ProgressBar MediaDescriptionCompat;
    public final LinearLayout MediaMetadataCompat;
    public final ProgressBar RatingCompat;
    public final TextView RemoteActionCompatParcelizer;
    public final MaterialToolbar handleMediaPlayPauseIfPendingOnHandler;
    public final ScrollView onAddQueueItem;
    public final ProgressBar onCommand;
    public final TextView onCustomAction;
    public final TextView onFastForward;
    public final TextView onMediaButtonEvent;
    public final TextView onPause;
    public final TextView onPlay;
    public final TextView onPlayFromMediaId;
    public final TextView onPlayFromSearch;
    public final TextView onPlayFromUri;
    public final TextView onPrepare;
    public final TextView onPrepareFromMediaId;
    public final TextView onPrepareFromSearch;
    private ConstraintLayout onPrepareFromUri;
    public final TextView onRemoveQueueItem;
    public final TextView onRemoveQueueItemAt;
    public final LinearLayout onRewind;
    public final TextView onSeekTo;
    private TextView onSetCaptioningEnabled;
    private TextView onSetPlaybackSpeed;
    private TextView onSetRating;
    private ImageView onSetRepeatMode;
    private final LinearLayout onSetShuffleMode;
    private TextView onSkipToNext;
    private ConstraintLayout onSkipToPrevious;
    public final TextView read;
    public final Button write;

    private feedDataToExtractor(LinearLayout linearLayout, Button button, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, ImageView imageView, ImageView imageView2, TextView textView7, LinearLayout linearLayout2, LinearLayout linearLayout3, ProgressBar progressBar, MaterialCardView materialCardView, TextView textView8, TextView textView9, LinearLayout linearLayout4, ProgressBar progressBar2, ProgressBar progressBar3, ScrollView scrollView, LinearLayout linearLayout5, MaterialToolbar materialToolbar, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20, TextView textView21, TextView textView22, TextView textView23, TextView textView24, TextView textView25, LinearLayout linearLayout6, ConstraintLayout constraintLayout2) {
        this.onSetShuffleMode = linearLayout;
        this.write = button;
        this.onPrepareFromUri = constraintLayout;
        this.IconCompatParcelizer = textView;
        this.read = textView2;
        this.RemoteActionCompatParcelizer = textView3;
        this.AudioAttributesCompatParcelizer = textView4;
        this.AudioAttributesImplApi26Parcelizer = textView5;
        this.MediaBrowserCompatItemReceiver = textView6;
        this.AudioAttributesImplApi21Parcelizer = imageView;
        this.onSetRepeatMode = imageView2;
        this.onSetCaptioningEnabled = textView7;
        this.AudioAttributesImplBaseParcelizer = linearLayout2;
        this.MediaBrowserCompatCustomActionResultReceiver = linearLayout3;
        this.RatingCompat = progressBar;
        this.MediaBrowserCompatMediaItem = materialCardView;
        this.MediaBrowserCompatSearchResultReceiver = textView8;
        this.onSetRating = textView9;
        this.MediaMetadataCompat = linearLayout4;
        this.MediaDescriptionCompat = progressBar2;
        this.onCommand = progressBar3;
        this.onAddQueueItem = scrollView;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = linearLayout5;
        this.handleMediaPlayPauseIfPendingOnHandler = materialToolbar;
        this.onCustomAction = textView10;
        this.onPlay = textView11;
        this.onMediaButtonEvent = textView12;
        this.onPlayFromMediaId = textView13;
        this.onPause = textView14;
        this.onFastForward = textView15;
        this.onPrepareFromSearch = textView16;
        this.onPrepareFromMediaId = textView17;
        this.onPrepare = textView18;
        this.onPlayFromUri = textView19;
        this.onPlayFromSearch = textView20;
        this.onSeekTo = textView21;
        this.onSetPlaybackSpeed = textView22;
        this.onSkipToNext = textView23;
        this.onRemoveQueueItem = textView24;
        this.onRemoveQueueItemAt = textView25;
        this.onRewind = linearLayout6;
        this.onSkipToPrevious = constraintLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.onSetShuffleMode;
    }

    public static feedDataToExtractor AudioAttributesCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return RemoteActionCompatParcelizer(layoutInflater.inflate(R.layout.fragment_qbank_introduction_marrow2, viewGroup, false));
    }

    private static feedDataToExtractor RemoteActionCompatParcelizer(View view) {
        int i = R.id.btn_start_qbank;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btn_start_qbank);
        if (button != null) {
            i = R.id.cl_percentile_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.cl_percentile_container);
            if (constraintLayout != null) {
                i = R.id.comingSoonTextView;
                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.comingSoonTextView);
                if (textView != null) {
                    i = R.id.ctvLessonMcqUpdateDescription;
                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.ctvLessonMcqUpdateDescription);
                    if (textView2 != null) {
                        i = R.id.ctvMcqAdded;
                        TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.ctvMcqAdded);
                        if (textView3 != null) {
                            i = R.id.ctvMcqAddedLabel;
                            TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.ctvMcqAddedLabel);
                            if (textView4 != null) {
                                i = R.id.ctvMcqUpdated;
                                TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.ctvMcqUpdated);
                                if (textView5 != null) {
                                    i = R.id.ctvMcqUpdatedLabel;
                                    TextView textView6 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.ctvMcqUpdatedLabel);
                                    if (textView6 != null) {
                                        i = R.id.ivPercentileCurve;
                                        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivPercentileCurve);
                                        if (imageView != null) {
                                            i = R.id.lessonLockedView;
                                            ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.lessonLockedView);
                                            if (imageView2 != null) {
                                                i = R.id.lessonProView;
                                                TextView textView7 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.lessonProView);
                                                if (textView7 != null) {
                                                    i = R.id.ll_performance_container;
                                                    LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.ll_performance_container);
                                                    if (linearLayout != null) {
                                                        i = R.id.ll_schema_list_container;
                                                        LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.ll_schema_list_container);
                                                        if (linearLayout2 != null) {
                                                            i = R.id.loadingContainer;
                                                            ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.loadingContainer);
                                                            if (progressBar != null) {
                                                                i = R.id.lockedCardView;
                                                                MaterialCardView materialCardView = (MaterialCardView) getApplicationIcon.IconCompatParcelizer(view, R.id.lockedCardView);
                                                                if (materialCardView != null) {
                                                                    i = R.id.lockedSubtitleTextView;
                                                                    TextView textView8 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.lockedSubtitleTextView);
                                                                    if (textView8 != null) {
                                                                        i = R.id.lockedTitleTextView;
                                                                        TextView textView9 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.lockedTitleTextView);
                                                                        if (textView9 != null) {
                                                                            i = R.id.mainContainer;
                                                                            LinearLayout linearLayout3 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.mainContainer);
                                                                            if (linearLayout3 != null) {
                                                                                i = R.id.pb_mcq_result;
                                                                                ProgressBar progressBar2 = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.pb_mcq_result);
                                                                                if (progressBar2 != null) {
                                                                                    i = R.id.progressPercentile;
                                                                                    ProgressBar progressBar3 = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.progressPercentile);
                                                                                    if (progressBar3 != null) {
                                                                                        i = R.id.rvMain;
                                                                                        ScrollView scrollView = (ScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.rvMain);
                                                                                        if (scrollView != null) {
                                                                                            i = R.id.schema_layout;
                                                                                            LinearLayout linearLayout4 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.schema_layout);
                                                                                            if (linearLayout4 != null) {
                                                                                                MaterialToolbar materialToolbar = (MaterialToolbar) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                                                                                                if (materialToolbar != null) {
                                                                                                    TextView textView10 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_bookmarks_count);
                                                                                                    if (textView10 != null) {
                                                                                                        TextView textView11 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCorrectCount);
                                                                                                        if (textView11 != null) {
                                                                                                            TextView textView12 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_lesson_completion_info);
                                                                                                            if (textView12 != null) {
                                                                                                                TextView textView13 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_lesson_title);
                                                                                                                if (textView13 != null) {
                                                                                                                    TextView textView14 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_mcq_completion_status);
                                                                                                                    if (textView14 != null) {
                                                                                                                        TextView textView15 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_mcq_count);
                                                                                                                        if (textView15 != null) {
                                                                                                                            TextView textView16 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_mcq_solved_count);
                                                                                                                            if (textView16 != null) {
                                                                                                                                TextView textView17 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPercentile);
                                                                                                                                if (textView17 != null) {
                                                                                                                                    TextView textView18 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPercentileFooter);
                                                                                                                                    if (textView18 != null) {
                                                                                                                                        TextView textView19 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_percentile_header);
                                                                                                                                        if (textView19 != null) {
                                                                                                                                            TextView textView20 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPercentileNA);
                                                                                                                                            if (textView20 != null) {
                                                                                                                                                TextView textView21 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_root_subject_title);
                                                                                                                                                if (textView21 != null) {
                                                                                                                                                    TextView textView22 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_schema);
                                                                                                                                                    if (textView22 != null) {
                                                                                                                                                        TextView textView23 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_schema_intro);
                                                                                                                                                        if (textView23 != null) {
                                                                                                                                                            TextView textView24 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSkippedCount);
                                                                                                                                                            if (textView24 != null) {
                                                                                                                                                                TextView textView25 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvWrongCount);
                                                                                                                                                                if (textView25 != null) {
                                                                                                                                                                    LinearLayout linearLayout5 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.unlocked_content_view);
                                                                                                                                                                    if (linearLayout5 != null) {
                                                                                                                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.vLessonMcqUpdateTagContainer);
                                                                                                                                                                        if (constraintLayout2 != null) {
                                                                                                                                                                            return new feedDataToExtractor((LinearLayout) view, button, constraintLayout, textView, textView2, textView3, textView4, textView5, textView6, imageView, imageView2, textView7, linearLayout, linearLayout2, progressBar, materialCardView, textView8, textView9, linearLayout3, progressBar2, progressBar3, scrollView, linearLayout4, materialToolbar, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24, textView25, linearLayout5, constraintLayout2);
                                                                                                                                                                        }
                                                                                                                                                                        i = R.id.vLessonMcqUpdateTagContainer;
                                                                                                                                                                    } else {
                                                                                                                                                                        i = R.id.unlocked_content_view;
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    i = R.id.tvWrongCount;
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                i = R.id.tvSkippedCount;
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            i = R.id.tv_schema_intro;
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        i = R.id.tv_schema;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    i = R.id.tv_root_subject_title;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                i = R.id.tvPercentileNA;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            i = R.id.tv_percentile_header;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        i = R.id.tvPercentileFooter;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    i = R.id.tvPercentile;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i = R.id.tv_mcq_solved_count;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i = R.id.tv_mcq_count;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = R.id.tv_mcq_completion_status;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = R.id.tv_lesson_title;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.tv_lesson_completion_info;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.tvCorrectCount;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.tv_bookmarks_count;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.toolbar;
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
