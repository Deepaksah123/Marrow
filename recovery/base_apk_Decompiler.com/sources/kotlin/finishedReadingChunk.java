package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class finishedReadingChunk implements getApplicationLabel {
    private LinearLayout AudioAttributesCompatParcelizer;
    private TextView AudioAttributesImplApi26Parcelizer;
    private final MaterialCardView AudioAttributesImplBaseParcelizer;
    public final TextView IconCompatParcelizer;
    private TextView MediaBrowserCompatCustomActionResultReceiver;
    private ConstraintLayout MediaBrowserCompatItemReceiver;
    private MaterialCardView RemoteActionCompatParcelizer;
    public final TextView read;
    private ImageView write;

    private finishedReadingChunk(MaterialCardView materialCardView, LinearLayout linearLayout, ImageView imageView, MaterialCardView materialCardView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, ConstraintLayout constraintLayout) {
        this.AudioAttributesImplBaseParcelizer = materialCardView;
        this.AudioAttributesCompatParcelizer = linearLayout;
        this.write = imageView;
        this.RemoteActionCompatParcelizer = materialCardView2;
        this.read = textView;
        this.AudioAttributesImplApi26Parcelizer = textView2;
        this.MediaBrowserCompatCustomActionResultReceiver = textView3;
        this.IconCompatParcelizer = textView4;
        this.MediaBrowserCompatItemReceiver = constraintLayout;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final MaterialCardView IconCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public static finishedReadingChunk write(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.layout_active_recall, viewGroup, false));
    }

    private static finishedReadingChunk write(View view) {
        int i = R.id.baseContainer;
        LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.baseContainer);
        if (linearLayout != null) {
            i = R.id.ivLogoMain;
            ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivLogoMain);
            if (imageView != null) {
                MaterialCardView materialCardView = (MaterialCardView) view;
                i = R.id.tvDesc;
                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvDesc);
                if (textView != null) {
                    i = R.id.tvHeading;
                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvHeading);
                    if (textView2 != null) {
                        i = R.id.tvNewTag;
                        TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvNewTag);
                        if (textView3 != null) {
                            i = R.id.tvSwitchToEdition8;
                            TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSwitchToEdition8);
                            if (textView4 != null) {
                                i = R.id.upperContainer;
                                ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.upperContainer);
                                if (constraintLayout != null) {
                                    return new finishedReadingChunk(materialCardView, linearLayout, imageView, materialCardView, textView, textView2, textView3, textView4, constraintLayout);
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
