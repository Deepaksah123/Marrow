package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class setPlaylistParserFactory implements getApplicationLabel {
    public final LinearLayout AudioAttributesCompatParcelizer;
    public final LinearLayout AudioAttributesImplApi21Parcelizer;
    public final TextView AudioAttributesImplApi26Parcelizer;
    public final LinearLayout AudioAttributesImplBaseParcelizer;
    public final FrameLayout IconCompatParcelizer;
    public final TextView MediaBrowserCompatCustomActionResultReceiver;
    public final TextView MediaBrowserCompatItemReceiver;
    public final TextView MediaBrowserCompatMediaItem;
    private ConstraintLayout MediaBrowserCompatSearchResultReceiver;
    private Guideline MediaDescriptionCompat;
    private Guideline MediaMetadataCompat;
    private Guideline RatingCompat;
    public final View RemoteActionCompatParcelizer;
    private final ConstraintLayout onCustomAction;
    public final View read;
    public final View write;

    private setPlaylistParserFactory(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, View view, FrameLayout frameLayout, Guideline guideline, Guideline guideline2, Guideline guideline3, View view2, View view3, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.onCustomAction = constraintLayout;
        this.MediaBrowserCompatSearchResultReceiver = constraintLayout2;
        this.RemoteActionCompatParcelizer = view;
        this.IconCompatParcelizer = frameLayout;
        this.MediaMetadataCompat = guideline;
        this.MediaDescriptionCompat = guideline2;
        this.RatingCompat = guideline3;
        this.read = view2;
        this.write = view3;
        this.AudioAttributesCompatParcelizer = linearLayout;
        this.AudioAttributesImplApi21Parcelizer = linearLayout2;
        this.AudioAttributesImplBaseParcelizer = linearLayout3;
        this.MediaBrowserCompatItemReceiver = textView;
        this.MediaBrowserCompatCustomActionResultReceiver = textView2;
        this.AudioAttributesImplApi26Parcelizer = textView3;
        this.MediaBrowserCompatMediaItem = textView4;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.onCustomAction;
    }

    public static setPlaylistParserFactory RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return RemoteActionCompatParcelizer(layoutInflater.inflate(R.layout.item_magic_module_module_progress, viewGroup, false));
    }

    private static setPlaylistParserFactory RemoteActionCompatParcelizer(View view) {
        int i = R.id.CompletionStatusCl;
        ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.CompletionStatusCl);
        if (constraintLayout != null) {
            i = R.id.firstItemBackground;
            View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.firstItemBackground);
            if (viewIconCompatParcelizer != null) {
                i = R.id.fmPrevModules;
                FrameLayout frameLayout = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.fmPrevModules);
                if (frameLayout != null) {
                    i = R.id.guidelineForEndCurve;
                    Guideline guideline = (Guideline) getApplicationIcon.IconCompatParcelizer(view, R.id.guidelineForEndCurve);
                    if (guideline != null) {
                        i = R.id.guidelineForFadeEnd;
                        Guideline guideline2 = (Guideline) getApplicationIcon.IconCompatParcelizer(view, R.id.guidelineForFadeEnd);
                        if (guideline2 != null) {
                            i = R.id.guidelineForStartCurve;
                            Guideline guideline3 = (Guideline) getApplicationIcon.IconCompatParcelizer(view, R.id.guidelineForStartCurve);
                            if (guideline3 != null) {
                                i = R.id.itemBackground;
                                View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.itemBackground);
                                if (viewIconCompatParcelizer2 != null) {
                                    i = R.id.lastItemBackground;
                                    View viewIconCompatParcelizer3 = getApplicationIcon.IconCompatParcelizer(view, R.id.lastItemBackground);
                                    if (viewIconCompatParcelizer3 != null) {
                                        i = R.id.llAttemptedView;
                                        LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llAttemptedView);
                                        if (linearLayout != null) {
                                            i = R.id.llFadeView;
                                            LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llFadeView);
                                            if (linearLayout2 != null) {
                                                i = R.id.llUnAttemptedView;
                                                LinearLayout linearLayout3 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llUnAttemptedView);
                                                if (linearLayout3 != null) {
                                                    i = R.id.totalSolvedModules;
                                                    TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.totalSolvedModules);
                                                    if (textView != null) {
                                                        i = R.id.tvModuleDate;
                                                        TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvModuleDate);
                                                        if (textView2 != null) {
                                                            i = R.id.tvModuleName;
                                                            TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvModuleName);
                                                            if (textView3 != null) {
                                                                i = R.id.tvModuleStatus;
                                                                TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvModuleStatus);
                                                                if (textView4 != null) {
                                                                    return new setPlaylistParserFactory((ConstraintLayout) view, constraintLayout, viewIconCompatParcelizer, frameLayout, guideline, guideline2, guideline3, viewIconCompatParcelizer2, viewIconCompatParcelizer3, linearLayout, linearLayout2, linearLayout3, textView, textView2, textView3, textView4);
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
