package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultHlsPlaylistTracker implements getApplicationLabel {
    public final FrameLayout AudioAttributesCompatParcelizer;
    private final LinearLayout AudioAttributesImplApi21Parcelizer;
    private TextView AudioAttributesImplBaseParcelizer;
    public final ProgressBar IconCompatParcelizer;
    private LinearLayout MediaBrowserCompatCustomActionResultReceiver;
    public final Toolbar RemoteActionCompatParcelizer;
    public final Button read;
    public final RecyclerView write;

    private DefaultHlsPlaylistTracker(LinearLayout linearLayout, Button button, FrameLayout frameLayout, LinearLayout linearLayout2, ProgressBar progressBar, RecyclerView recyclerView, Toolbar toolbar, TextView textView) {
        this.AudioAttributesImplApi21Parcelizer = linearLayout;
        this.read = button;
        this.AudioAttributesCompatParcelizer = frameLayout;
        this.MediaBrowserCompatCustomActionResultReceiver = linearLayout2;
        this.IconCompatParcelizer = progressBar;
        this.write = recyclerView;
        this.RemoteActionCompatParcelizer = toolbar;
        this.AudioAttributesImplBaseParcelizer = textView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public static DefaultHlsPlaylistTracker read(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.layout_signup_course, viewGroup, false));
    }

    private static DefaultHlsPlaylistTracker AudioAttributesCompatParcelizer(View view) {
        int i = R.id.btnCourseNext;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnCourseNext);
        if (button != null) {
            i = R.id.flMain;
            FrameLayout frameLayout = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.flMain);
            if (frameLayout != null) {
                i = R.id.llMainLayout;
                LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llMainLayout);
                if (linearLayout != null) {
                    i = R.id.loadingContainer;
                    ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.loadingContainer);
                    if (progressBar != null) {
                        i = R.id.rv_courses;
                        RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rv_courses);
                        if (recyclerView != null) {
                            i = R.id.toolbar;
                            Toolbar toolbar = (Toolbar) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                            if (toolbar != null) {
                                i = R.id.toolbar_title;
                                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar_title);
                                if (textView != null) {
                                    return new DefaultHlsPlaylistTracker((LinearLayout) view, button, frameLayout, linearLayout, progressBar, recyclerView, toolbar, textView);
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
