package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.MaterialToolbar;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class setTrackSelection implements getApplicationLabel {
    public final ViewPager2 AudioAttributesCompatParcelizer;
    private final LinearLayout IconCompatParcelizer;
    public final TextView RemoteActionCompatParcelizer;
    public final MaterialToolbar read;

    private setTrackSelection(LinearLayout linearLayout, MaterialToolbar materialToolbar, TextView textView, ViewPager2 viewPager2) {
        this.IconCompatParcelizer = linearLayout;
        this.read = materialToolbar;
        this.RemoteActionCompatParcelizer = textView;
        this.AudioAttributesCompatParcelizer = viewPager2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static setTrackSelection AudioAttributesCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return read(layoutInflater.inflate(R.layout.fragment_pearl_detail, viewGroup, false));
    }

    private static setTrackSelection read(View view) {
        int i = R.id.toolbar;
        MaterialToolbar materialToolbar = (MaterialToolbar) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
        if (materialToolbar != null) {
            i = R.id.txtAppbarTitle;
            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.txtAppbarTitle);
            if (textView != null) {
                i = R.id.viewPager;
                ViewPager2 viewPager2 = (ViewPager2) getApplicationIcon.IconCompatParcelizer(view, R.id.viewPager);
                if (viewPager2 != null) {
                    return new setTrackSelection((LinearLayout) view, materialToolbar, textView, viewPager2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
