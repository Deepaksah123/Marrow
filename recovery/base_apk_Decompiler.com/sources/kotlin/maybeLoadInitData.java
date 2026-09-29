package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class maybeLoadInitData implements getApplicationLabel {
    public final MaterialButton AudioAttributesCompatParcelizer;
    public final RadioGroup AudioAttributesImplApi21Parcelizer;
    public final RadioButton AudioAttributesImplApi26Parcelizer;
    public final RadioButton AudioAttributesImplBaseParcelizer;
    public final View IconCompatParcelizer;
    public final RadioButton MediaBrowserCompatCustomActionResultReceiver;
    public final ScrollView MediaBrowserCompatItemReceiver;
    public final MaterialToolbar MediaBrowserCompatMediaItem;
    public final TextView MediaBrowserCompatSearchResultReceiver;
    public final TextView MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final TextView MediaDescriptionCompat;
    public final TextView MediaMetadataCompat;
    public final TextView RatingCompat;
    public final View RemoteActionCompatParcelizer;
    public final TextView handleMediaPlayPauseIfPendingOnHandler;
    public final TextView onAddQueueItem;
    public final TextView onCommand;
    public final TextView onCustomAction;
    public final TextView onFastForward;
    public final TextView onMediaButtonEvent;
    public final TextView onPause;
    public final TextView onPlay;
    private ConstraintLayout onPlayFromMediaId;
    private TextView onPlayFromUri;
    private final ConstraintLayout onPrepare;
    public final ProgressBar read;
    public final LinearLayout write;

    private maybeLoadInitData(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, View view, MaterialButton materialButton, LinearLayout linearLayout, ProgressBar progressBar, View view2, RadioGroup radioGroup, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, ScrollView scrollView, MaterialToolbar materialToolbar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14) {
        this.onPrepare = constraintLayout;
        this.onPlayFromMediaId = constraintLayout2;
        this.IconCompatParcelizer = view;
        this.AudioAttributesCompatParcelizer = materialButton;
        this.write = linearLayout;
        this.read = progressBar;
        this.RemoteActionCompatParcelizer = view2;
        this.AudioAttributesImplApi21Parcelizer = radioGroup;
        this.AudioAttributesImplBaseParcelizer = radioButton;
        this.MediaBrowserCompatCustomActionResultReceiver = radioButton2;
        this.AudioAttributesImplApi26Parcelizer = radioButton3;
        this.MediaBrowserCompatItemReceiver = scrollView;
        this.MediaBrowserCompatMediaItem = materialToolbar;
        this.RatingCompat = textView;
        this.MediaBrowserCompatSearchResultReceiver = textView2;
        this.onPlayFromUri = textView3;
        this.MediaMetadataCompat = textView4;
        this.MediaDescriptionCompat = textView5;
        this.onCommand = textView6;
        this.onAddQueueItem = textView7;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = textView8;
        this.onCustomAction = textView9;
        this.handleMediaPlayPauseIfPendingOnHandler = textView10;
        this.onPause = textView11;
        this.onMediaButtonEvent = textView12;
        this.onPlay = textView13;
        this.onFastForward = textView14;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.onPrepare;
    }

    public static maybeLoadInitData AudioAttributesCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return IconCompatParcelizer(layoutInflater.inflate(R.layout.fragment_reset_content, viewGroup, false));
    }

    private static maybeLoadInitData IconCompatParcelizer(View view) {
        int i = R.id.app_bar_root;
        ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.app_bar_root);
        if (constraintLayout != null) {
            i = R.id.bookmarkDivider;
            View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.bookmarkDivider);
            if (viewIconCompatParcelizer != null) {
                i = R.id.btnReset;
                MaterialButton materialButton = (MaterialButton) getApplicationIcon.IconCompatParcelizer(view, R.id.btnReset);
                if (materialButton != null) {
                    i = R.id.llButton;
                    LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llButton);
                    if (linearLayout != null) {
                        i = R.id.loadingContainer;
                        ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.loadingContainer);
                        if (progressBar != null) {
                            i = R.id.qBankDivider;
                            View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.qBankDivider);
                            if (viewIconCompatParcelizer2 != null) {
                                i = R.id.radioGroup;
                                RadioGroup radioGroup = (RadioGroup) getApplicationIcon.IconCompatParcelizer(view, R.id.radioGroup);
                                if (radioGroup != null) {
                                    i = R.id.rbBookmarkOnly;
                                    RadioButton radioButton = (RadioButton) getApplicationIcon.IconCompatParcelizer(view, R.id.rbBookmarkOnly);
                                    if (radioButton != null) {
                                        i = R.id.rbQbankBookmark;
                                        RadioButton radioButton2 = (RadioButton) getApplicationIcon.IconCompatParcelizer(view, R.id.rbQbankBookmark);
                                        if (radioButton2 != null) {
                                            i = R.id.rbQbankOnly;
                                            RadioButton radioButton3 = (RadioButton) getApplicationIcon.IconCompatParcelizer(view, R.id.rbQbankOnly);
                                            if (radioButton3 != null) {
                                                i = R.id.svMain;
                                                ScrollView scrollView = (ScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.svMain);
                                                if (scrollView != null) {
                                                    i = R.id.toolbar;
                                                    MaterialToolbar materialToolbar = (MaterialToolbar) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                                                    if (materialToolbar != null) {
                                                        i = R.id.tvAllLastReset;
                                                        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvAllLastReset);
                                                        if (textView != null) {
                                                            i = R.id.tvAllResetAvl;
                                                            TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvAllResetAvl);
                                                            if (textView2 != null) {
                                                                i = R.id.tvAppbarTitle;
                                                                TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvAppbarTitle);
                                                                if (textView3 != null) {
                                                                    i = R.id.tvBookmarkDescription;
                                                                    TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvBookmarkDescription);
                                                                    if (textView4 != null) {
                                                                        i = R.id.tvBookmarkLastReset;
                                                                        TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvBookmarkLastReset);
                                                                        if (textView5 != null) {
                                                                            i = R.id.tvBookmarkLocked;
                                                                            TextView textView6 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvBookmarkLocked);
                                                                            if (textView6 != null) {
                                                                                i = R.id.tvBookmarkResetAvl;
                                                                                TextView textView7 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvBookmarkResetAvl);
                                                                                if (textView7 != null) {
                                                                                    i = R.id.tvQBankBookmarkDescription;
                                                                                    TextView textView8 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvQBankBookmarkDescription);
                                                                                    if (textView8 != null) {
                                                                                        i = R.id.tvQBankDescription;
                                                                                        TextView textView9 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvQBankDescription);
                                                                                        if (textView9 != null) {
                                                                                            i = R.id.tvQbankBookmarkLocked;
                                                                                            TextView textView10 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvQbankBookmarkLocked);
                                                                                            if (textView10 != null) {
                                                                                                TextView textView11 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvQbankLastReset);
                                                                                                if (textView11 != null) {
                                                                                                    TextView textView12 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvQbankLocked);
                                                                                                    if (textView12 != null) {
                                                                                                        TextView textView13 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvQbankResetAvl);
                                                                                                        if (textView13 != null) {
                                                                                                            TextView textView14 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvResetTitle);
                                                                                                            if (textView14 != null) {
                                                                                                                return new maybeLoadInitData((ConstraintLayout) view, constraintLayout, viewIconCompatParcelizer, materialButton, linearLayout, progressBar, viewIconCompatParcelizer2, radioGroup, radioButton, radioButton2, radioButton3, scrollView, materialToolbar, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14);
                                                                                                            }
                                                                                                            i = R.id.tvResetTitle;
                                                                                                        } else {
                                                                                                            i = R.id.tvQbankResetAvl;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.tvQbankLocked;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.tvQbankLastReset;
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
