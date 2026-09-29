package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.MaterialToolbar;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class maybeCreateEncryptionChunkFor implements getApplicationLabel {
    public final LinearLayout AudioAttributesCompatParcelizer;
    public final TextView AudioAttributesImplApi21Parcelizer;
    public final NestedScrollView AudioAttributesImplApi26Parcelizer;
    public final LinearLayout AudioAttributesImplBaseParcelizer;
    public final LinearLayout IconCompatParcelizer;
    public final LinearLayout MediaBrowserCompatCustomActionResultReceiver;
    public final Button MediaBrowserCompatItemReceiver;
    public final TextView MediaBrowserCompatMediaItem;
    public final LinearLayout MediaBrowserCompatSearchResultReceiver;
    public final ProgressBar MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final TextView MediaDescriptionCompat;
    public final TextView MediaMetadataCompat;
    public final TextView RatingCompat;
    public final HorizontalScrollView RemoteActionCompatParcelizer;
    public final TextView handleMediaPlayPauseIfPendingOnHandler;
    public final TextView onAddQueueItem;
    public final Button onCommand;
    public final TextView onCustomAction;
    private TextView onFastForward;
    private final LinearLayout onMediaButtonEvent;
    public final MaterialToolbar onPause;
    public final TextView onPlayFromMediaId;
    public final Button read;
    public final Button write;

    private maybeCreateEncryptionChunkFor(LinearLayout linearLayout, Button button, LinearLayout linearLayout2, LinearLayout linearLayout3, HorizontalScrollView horizontalScrollView, Button button2, Button button3, TextView textView, LinearLayout linearLayout4, LinearLayout linearLayout5, NestedScrollView nestedScrollView, TextView textView2, LinearLayout linearLayout6, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, ProgressBar progressBar, Button button4, TextView textView8, TextView textView9, MaterialToolbar materialToolbar, TextView textView10) {
        this.onMediaButtonEvent = linearLayout;
        this.write = button;
        this.IconCompatParcelizer = linearLayout2;
        this.AudioAttributesCompatParcelizer = linearLayout3;
        this.RemoteActionCompatParcelizer = horizontalScrollView;
        this.read = button2;
        this.MediaBrowserCompatItemReceiver = button3;
        this.AudioAttributesImplApi21Parcelizer = textView;
        this.AudioAttributesImplBaseParcelizer = linearLayout4;
        this.MediaBrowserCompatCustomActionResultReceiver = linearLayout5;
        this.AudioAttributesImplApi26Parcelizer = nestedScrollView;
        this.RatingCompat = textView2;
        this.MediaBrowserCompatSearchResultReceiver = linearLayout6;
        this.MediaMetadataCompat = textView3;
        this.MediaBrowserCompatMediaItem = textView4;
        this.MediaDescriptionCompat = textView5;
        this.handleMediaPlayPauseIfPendingOnHandler = textView6;
        this.onAddQueueItem = textView7;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = progressBar;
        this.onCommand = button4;
        this.onCustomAction = textView8;
        this.onPlayFromMediaId = textView9;
        this.onPause = materialToolbar;
        this.onFastForward = textView10;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.onMediaButtonEvent;
    }

    public static maybeCreateEncryptionChunkFor write(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return IconCompatParcelizer(layoutInflater.inflate(R.layout.fragment_learn_more, viewGroup, false));
    }

    private static maybeCreateEncryptionChunkFor IconCompatParcelizer(View view) {
        int i = R.id.btnLearnHow;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnLearnHow);
        if (button != null) {
            i = R.id.container1;
            LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.container1);
            if (linearLayout != null) {
                i = R.id.container2;
                LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.container2);
                if (linearLayout2 != null) {
                    i = R.id.facultyRoot;
                    HorizontalScrollView horizontalScrollView = (HorizontalScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.facultyRoot);
                    if (horizontalScrollView != null) {
                        i = R.id.getAccess1;
                        Button button2 = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.getAccess1);
                        if (button2 != null) {
                            i = R.id.getAccess2;
                            Button button3 = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.getAccess2);
                            if (button3 != null) {
                                i = R.id.learnMoreDescription;
                                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.learnMoreDescription);
                                if (textView != null) {
                                    i = R.id.llCardContainer;
                                    LinearLayout linearLayout3 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llCardContainer);
                                    if (linearLayout3 != null) {
                                        i = R.id.llSpecialContainer;
                                        LinearLayout linearLayout4 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llSpecialContainer);
                                        if (linearLayout4 != null) {
                                            i = R.id.nsvOuterContainer;
                                            NestedScrollView nestedScrollView = (NestedScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.nsvOuterContainer);
                                            if (nestedScrollView != null) {
                                                i = R.id.oneLiner;
                                                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.oneLiner);
                                                if (textView2 != null) {
                                                    i = R.id.planFacultyContainer;
                                                    LinearLayout linearLayout5 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.planFacultyContainer);
                                                    if (linearLayout5 != null) {
                                                        i = R.id.planFaq;
                                                        TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.planFaq);
                                                        if (textView3 != null) {
                                                            i = R.id.planGetCallback;
                                                            TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.planGetCallback);
                                                            if (textView4 != null) {
                                                                i = R.id.planPrivacyPolicy;
                                                                TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.planPrivacyPolicy);
                                                                if (textView5 != null) {
                                                                    i = R.id.planRefundPolicy;
                                                                    TextView textView6 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.planRefundPolicy);
                                                                    if (textView6 != null) {
                                                                        i = R.id.planSupport;
                                                                        TextView textView7 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.planSupport);
                                                                        if (textView7 != null) {
                                                                            i = R.id.progressBar;
                                                                            ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.progressBar);
                                                                            if (progressBar != null) {
                                                                                i = R.id.retryBtn;
                                                                                Button button4 = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.retryBtn);
                                                                                if (button4 != null) {
                                                                                    i = R.id.title;
                                                                                    TextView textView8 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.title);
                                                                                    if (textView8 != null) {
                                                                                        i = R.id.titleMarrowSpecial;
                                                                                        TextView textView9 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.titleMarrowSpecial);
                                                                                        if (textView9 != null) {
                                                                                            i = R.id.toolbar;
                                                                                            MaterialToolbar materialToolbar = (MaterialToolbar) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                                                                                            if (materialToolbar != null) {
                                                                                                TextView textView10 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.txtAppbarTitle);
                                                                                                if (textView10 != null) {
                                                                                                    return new maybeCreateEncryptionChunkFor((LinearLayout) view, button, linearLayout, linearLayout2, horizontalScrollView, button2, button3, textView, linearLayout3, linearLayout4, nestedScrollView, textView2, linearLayout5, textView3, textView4, textView5, textView6, textView7, progressBar, button4, textView8, textView9, materialToolbar, textView10);
                                                                                                }
                                                                                                i = R.id.txtAppbarTitle;
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
