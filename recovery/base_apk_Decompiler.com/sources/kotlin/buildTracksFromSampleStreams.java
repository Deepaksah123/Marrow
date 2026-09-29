package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class buildTracksFromSampleStreams implements getApplicationLabel {
    private TextView AudioAttributesCompatParcelizer;
    private ImageView AudioAttributesImplApi21Parcelizer;
    private TextView AudioAttributesImplBaseParcelizer;
    private TextView IconCompatParcelizer;
    private final LinearLayout MediaBrowserCompatCustomActionResultReceiver;
    private ImageView MediaBrowserCompatItemReceiver;
    public final CardView RemoteActionCompatParcelizer;
    public final TextView read;
    public final CardView write;

    private buildTracksFromSampleStreams(LinearLayout linearLayout, TextView textView, TextView textView2, CardView cardView, CardView cardView2, ImageView imageView, ImageView imageView2, TextView textView3, TextView textView4) {
        this.MediaBrowserCompatCustomActionResultReceiver = linearLayout;
        this.AudioAttributesCompatParcelizer = textView;
        this.IconCompatParcelizer = textView2;
        this.write = cardView;
        this.RemoteActionCompatParcelizer = cardView2;
        this.AudioAttributesImplApi21Parcelizer = imageView;
        this.MediaBrowserCompatItemReceiver = imageView2;
        this.read = textView3;
        this.AudioAttributesImplBaseParcelizer = textView4;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public static buildTracksFromSampleStreams RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return RemoteActionCompatParcelizer(layoutInflater.inflate(R.layout.item_type_qbank_extra_functionalities, viewGroup, false));
    }

    private static buildTracksFromSampleStreams RemoteActionCompatParcelizer(View view) {
        int i = R.id.bookmark;
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.bookmark);
        if (textView != null) {
            i = R.id.customModule;
            TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.customModule);
            if (textView2 != null) {
                i = R.id.cvBookmark;
                CardView cardView = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.cvBookmark);
                if (cardView != null) {
                    i = R.id.cvCustomModule;
                    CardView cardView2 = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.cvCustomModule);
                    if (cardView2 != null) {
                        i = R.id.ivPlus;
                        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivPlus);
                        if (imageView != null) {
                            i = R.id.ivSubject;
                            ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivSubject);
                            if (imageView2 != null) {
                                i = R.id.tvBookmarkCount;
                                TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvBookmarkCount);
                                if (textView3 != null) {
                                    i = R.id.tvCustomModuleHeader;
                                    TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCustomModuleHeader);
                                    if (textView4 != null) {
                                        return new buildTracksFromSampleStreams((LinearLayout) view, textView, textView2, cardView, cardView2, imageView, imageView2, textView3, textView4);
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
