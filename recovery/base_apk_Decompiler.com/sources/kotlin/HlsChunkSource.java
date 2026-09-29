package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsChunkSource implements getApplicationLabel {
    public final LinearLayoutCompat AudioAttributesCompatParcelizer;
    private TextView AudioAttributesImplApi21Parcelizer;
    private final ConstraintLayout AudioAttributesImplBaseParcelizer;
    private ImageView IconCompatParcelizer;
    public final TextView RemoteActionCompatParcelizer;
    public final TextView read;
    public final ConstraintLayout write;

    private HlsChunkSource(ConstraintLayout constraintLayout, ImageView imageView, LinearLayoutCompat linearLayoutCompat, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, TextView textView3) {
        this.AudioAttributesImplBaseParcelizer = constraintLayout;
        this.IconCompatParcelizer = imageView;
        this.AudioAttributesCompatParcelizer = linearLayoutCompat;
        this.write = constraintLayout2;
        this.read = textView;
        this.RemoteActionCompatParcelizer = textView2;
        this.AudioAttributesImplApi21Parcelizer = textView3;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public static HlsChunkSource write(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return IconCompatParcelizer(layoutInflater.inflate(R.layout.fragment_device_level_kyc_verification, viewGroup, false));
    }

    private static HlsChunkSource IconCompatParcelizer(View view) {
        int i = R.id.ivIcon;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivIcon);
        if (imageView != null) {
            i = R.id.llContactUs;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) getApplicationIcon.IconCompatParcelizer(view, R.id.llContactUs);
            if (linearLayoutCompat != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.tvContactUs;
                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvContactUs);
                if (textView != null) {
                    i = R.id.tvSubTitle;
                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSubTitle);
                    if (textView2 != null) {
                        i = R.id.tvTitle;
                        TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTitle);
                        if (textView3 != null) {
                            return new HlsChunkSource(constraintLayout, imageView, linearLayoutCompat, constraintLayout, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
