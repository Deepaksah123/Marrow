package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultHlsExtractorFactory implements getApplicationLabel {
    public final View AudioAttributesCompatParcelizer;
    private LinearLayout AudioAttributesImplApi21Parcelizer;
    public final Toolbar IconCompatParcelizer;
    public final View RemoteActionCompatParcelizer;
    private final LinearLayout read;
    public final FrameLayout write;

    private DefaultHlsExtractorFactory(LinearLayout linearLayout, FrameLayout frameLayout, View view, View view2, Toolbar toolbar, LinearLayout linearLayout2) {
        this.read = linearLayout;
        this.write = frameLayout;
        this.AudioAttributesCompatParcelizer = view;
        this.RemoteActionCompatParcelizer = view2;
        this.IconCompatParcelizer = toolbar;
        this.AudioAttributesImplApi21Parcelizer = linearLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.read;
    }

    public static DefaultHlsExtractorFactory RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return RemoteActionCompatParcelizer(layoutInflater.inflate(R.layout.fragment_college_selection, viewGroup, false));
    }

    private static DefaultHlsExtractorFactory RemoteActionCompatParcelizer(View view) {
        int i = R.id.container;
        FrameLayout frameLayout = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.container);
        if (frameLayout != null) {
            i = R.id.firstCircle;
            View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.firstCircle);
            if (viewIconCompatParcelizer != null) {
                i = R.id.secondCircle;
                View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.secondCircle);
                if (viewIconCompatParcelizer2 != null) {
                    i = R.id.toolbar;
                    Toolbar toolbar = (Toolbar) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                    if (toolbar != null) {
                        i = R.id.topCircleContainer;
                        LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.topCircleContainer);
                        if (linearLayout != null) {
                            return new DefaultHlsExtractorFactory((LinearLayout) view, frameLayout, viewIconCompatParcelizer, viewIconCompatParcelizer2, toolbar, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
