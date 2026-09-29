package kotlin;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaParserHlsMediaChunkExtractor1 implements getApplicationLabel {
    public final ViewPager2 AudioAttributesCompatParcelizer;
    private TextView AudioAttributesImplBaseParcelizer;
    public final ImageView IconCompatParcelizer;
    private final ConstraintLayout RemoteActionCompatParcelizer;
    public final ImageView read;
    private ConstraintLayout write;

    private MediaParserHlsMediaChunkExtractor1(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2, TextView textView, ViewPager2 viewPager2) {
        this.RemoteActionCompatParcelizer = constraintLayout;
        this.IconCompatParcelizer = imageView;
        this.read = imageView2;
        this.write = constraintLayout2;
        this.AudioAttributesImplBaseParcelizer = textView;
        this.AudioAttributesCompatParcelizer = viewPager2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static MediaParserHlsMediaChunkExtractor1 RemoteActionCompatParcelizer(View view) {
        int i = R.id.iv_arrow_left;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.iv_arrow_left);
        if (imageView != null) {
            i = R.id.iv_arrow_right;
            ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.iv_arrow_right);
            if (imageView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.tv_gallery;
                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_gallery);
                if (textView != null) {
                    i = R.id.view_pager;
                    ViewPager2 viewPager2 = (ViewPager2) getApplicationIcon.IconCompatParcelizer(view, R.id.view_pager);
                    if (viewPager2 != null) {
                        return new MediaParserHlsMediaChunkExtractor1(constraintLayout, imageView, imageView2, constraintLayout, textView, viewPager2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
