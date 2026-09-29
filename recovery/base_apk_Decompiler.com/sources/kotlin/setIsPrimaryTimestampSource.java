package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class setIsPrimaryTimestampSource implements getApplicationLabel {
    public final initMediaChunkLoad AudioAttributesCompatParcelizer;
    private final ScrollView AudioAttributesImplApi21Parcelizer;
    private ImageView AudioAttributesImplApi26Parcelizer;
    private View AudioAttributesImplBaseParcelizer;
    public final ImageView IconCompatParcelizer;
    private View MediaBrowserCompatCustomActionResultReceiver;
    private Guideline MediaBrowserCompatItemReceiver;
    private TextView MediaBrowserCompatSearchResultReceiver;
    private TextView MediaMetadataCompat;
    public final ConstraintLayout RemoteActionCompatParcelizer;
    public final Button read;
    public final TextView write;

    private setIsPrimaryTimestampSource(ScrollView scrollView, View view, Button button, TextView textView, View view2, Guideline guideline, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, initMediaChunkLoad initmediachunkload, TextView textView2, TextView textView3) {
        this.AudioAttributesImplApi21Parcelizer = scrollView;
        this.MediaBrowserCompatCustomActionResultReceiver = view;
        this.read = button;
        this.write = textView;
        this.AudioAttributesImplBaseParcelizer = view2;
        this.MediaBrowserCompatItemReceiver = guideline;
        this.AudioAttributesImplApi26Parcelizer = imageView;
        this.IconCompatParcelizer = imageView2;
        this.RemoteActionCompatParcelizer = constraintLayout;
        this.AudioAttributesCompatParcelizer = initmediachunkload;
        this.MediaBrowserCompatSearchResultReceiver = textView2;
        this.MediaMetadataCompat = textView3;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final ScrollView IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public static setIsPrimaryTimestampSource read(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.fragment_notes_purchase_thank_you, viewGroup, false));
    }

    private static setIsPrimaryTimestampSource write(View view) {
        int i = R.id.blackBackground;
        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.blackBackground);
        if (viewIconCompatParcelizer != null) {
            i = R.id.btnBackToMarrow;
            Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnBackToMarrow);
            if (button != null) {
                i = R.id.btnTrackPurchase;
                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.btnTrackPurchase);
                if (textView != null) {
                    i = R.id.greenBackground;
                    View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.greenBackground);
                    if (viewIconCompatParcelizer2 != null) {
                        i = R.id.horizontalGuideline;
                        Guideline guideline = (Guideline) getApplicationIcon.IconCompatParcelizer(view, R.id.horizontalGuideline);
                        if (guideline != null) {
                            i = R.id.imgConfirmation;
                            ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.imgConfirmation);
                            if (imageView != null) {
                                i = R.id.ivClose;
                                ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivClose);
                                if (imageView2 != null) {
                                    i = R.id.nestedContainer;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.nestedContainer);
                                    if (constraintLayout != null) {
                                        i = R.id.queriesLayout;
                                        View viewIconCompatParcelizer3 = getApplicationIcon.IconCompatParcelizer(view, R.id.queriesLayout);
                                        if (viewIconCompatParcelizer3 != null) {
                                            initMediaChunkLoad initmediachunkloadAudioAttributesCompatParcelizer = initMediaChunkLoad.AudioAttributesCompatParcelizer(viewIconCompatParcelizer3);
                                            i = R.id.tvNestedHeading;
                                            TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvNestedHeading);
                                            if (textView2 != null) {
                                                i = R.id.tvThankYouFirstLine;
                                                TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvThankYouFirstLine);
                                                if (textView3 != null) {
                                                    return new setIsPrimaryTimestampSource((ScrollView) view, viewIconCompatParcelizer, button, textView, viewIconCompatParcelizer2, guideline, imageView, imageView2, constraintLayout, initmediachunkloadAudioAttributesCompatParcelizer, textView2, textView3);
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
