package kotlin;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaParserHlsMediaChunkExtractorExternalSyntheticLambda0 implements getApplicationLabel {
    private ConstraintLayout AudioAttributesCompatParcelizer;
    private TextView AudioAttributesImplApi26Parcelizer;
    private View AudioAttributesImplBaseParcelizer;
    private final ConstraintLayout IconCompatParcelizer;
    private ImageView RemoteActionCompatParcelizer;
    private ImageView read;
    private ImageView write;

    private MediaParserHlsMediaChunkExtractorExternalSyntheticLambda0(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ConstraintLayout constraintLayout2, TextView textView, View view) {
        this.IconCompatParcelizer = constraintLayout;
        this.write = imageView;
        this.read = imageView2;
        this.RemoteActionCompatParcelizer = imageView3;
        this.AudioAttributesCompatParcelizer = constraintLayout2;
        this.AudioAttributesImplApi26Parcelizer = textView;
        this.AudioAttributesImplBaseParcelizer = view;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static MediaParserHlsMediaChunkExtractorExternalSyntheticLambda0 AudioAttributesCompatParcelizer(View view) {
        int i = R.id.ivBackground;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivBackground);
        if (imageView != null) {
            i = R.id.ivBooks;
            ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivBooks);
            if (imageView2 != null) {
                i = R.id.ivTitle;
                ImageView imageView3 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivTitle);
                if (imageView3 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i = R.id.tvSubtitle;
                    TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSubtitle);
                    if (textView != null) {
                        i = R.id.viewTitleDivider;
                        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.viewTitleDivider);
                        if (viewIconCompatParcelizer != null) {
                            return new MediaParserHlsMediaChunkExtractorExternalSyntheticLambda0(constraintLayout, imageView, imageView2, imageView3, constraintLayout, textView, viewIconCompatParcelizer);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
