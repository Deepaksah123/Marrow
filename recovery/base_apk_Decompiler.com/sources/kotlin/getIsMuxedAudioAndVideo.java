package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class getIsMuxedAudioAndVideo implements getApplicationLabel {
    private ImageView AudioAttributesCompatParcelizer;
    private TextView AudioAttributesImplApi21Parcelizer;
    private TextView AudioAttributesImplApi26Parcelizer;
    private final FrameLayout AudioAttributesImplBaseParcelizer;
    private ImageView IconCompatParcelizer;
    public final MaterialButton RemoteActionCompatParcelizer;
    private ImageView read;
    public final ScrollView write;

    private getIsMuxedAudioAndVideo(FrameLayout frameLayout, MaterialButton materialButton, ImageView imageView, ImageView imageView2, ImageView imageView3, ScrollView scrollView, TextView textView, TextView textView2) {
        this.AudioAttributesImplBaseParcelizer = frameLayout;
        this.RemoteActionCompatParcelizer = materialButton;
        this.IconCompatParcelizer = imageView;
        this.read = imageView2;
        this.AudioAttributesCompatParcelizer = imageView3;
        this.write = scrollView;
        this.AudioAttributesImplApi21Parcelizer = textView;
        this.AudioAttributesImplApi26Parcelizer = textView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final FrameLayout IconCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public static getIsMuxedAudioAndVideo AudioAttributesCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.fragment_introduction_practical_corner_bottomsheet, viewGroup, false));
    }

    private static getIsMuxedAudioAndVideo AudioAttributesCompatParcelizer(View view) {
        int i = R.id.btnGetStarted;
        MaterialButton materialButton = (MaterialButton) getApplicationIcon.IconCompatParcelizer(view, R.id.btnGetStarted);
        if (materialButton != null) {
            i = R.id.ivPcIntroBottom;
            ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivPcIntroBottom);
            if (imageView != null) {
                i = R.id.ivPcIntroSubject;
                ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivPcIntroSubject);
                if (imageView2 != null) {
                    i = R.id.ivPracticalCornerLogo;
                    ImageView imageView3 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivPracticalCornerLogo);
                    if (imageView3 != null) {
                        i = R.id.layoutContent;
                        ScrollView scrollView = (ScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.layoutContent);
                        if (scrollView != null) {
                            i = R.id.tvPracticalCornerDesc;
                            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPracticalCornerDesc);
                            if (textView != null) {
                                i = R.id.tvPracticalCornerIntro;
                                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPracticalCornerIntro);
                                if (textView2 != null) {
                                    return new getIsMuxedAudioAndVideo((FrameLayout) view, materialButton, imageView, imageView2, imageView3, scrollView, textView, textView2);
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
