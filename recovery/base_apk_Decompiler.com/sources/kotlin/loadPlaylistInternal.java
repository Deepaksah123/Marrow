package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class loadPlaylistInternal implements getApplicationLabel {
    public final NestedScrollView AudioAttributesCompatParcelizer;
    public final TextView AudioAttributesImplApi26Parcelizer;
    public final TextView AudioAttributesImplBaseParcelizer;
    public final RecyclerView IconCompatParcelizer;
    private final LinearLayout MediaBrowserCompatCustomActionResultReceiver;
    public final TextView MediaBrowserCompatItemReceiver;
    public final Group RemoteActionCompatParcelizer;
    public final ProgressBar read;
    public final MaterialToolbar write;

    private loadPlaylistInternal(LinearLayout linearLayout, NestedScrollView nestedScrollView, Group group, ProgressBar progressBar, RecyclerView recyclerView, MaterialToolbar materialToolbar, TextView textView, TextView textView2, TextView textView3) {
        this.MediaBrowserCompatCustomActionResultReceiver = linearLayout;
        this.AudioAttributesCompatParcelizer = nestedScrollView;
        this.RemoteActionCompatParcelizer = group;
        this.read = progressBar;
        this.IconCompatParcelizer = recyclerView;
        this.write = materialToolbar;
        this.MediaBrowserCompatItemReceiver = textView;
        this.AudioAttributesImplBaseParcelizer = textView2;
        this.AudioAttributesImplApi26Parcelizer = textView3;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public static loadPlaylistInternal AudioAttributesCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return read(layoutInflater.inflate(R.layout.sample_videos, viewGroup, false));
    }

    private static loadPlaylistInternal read(View view) {
        int i = R.id.container;
        NestedScrollView nestedScrollView = (NestedScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.container);
        if (nestedScrollView != null) {
            i = R.id.content;
            Group group = (Group) getApplicationIcon.IconCompatParcelizer(view, R.id.content);
            if (group != null) {
                i = R.id.loader;
                ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.loader);
                if (progressBar != null) {
                    i = R.id.rlFreeVideo;
                    RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rlFreeVideo);
                    if (recyclerView != null) {
                        i = R.id.toolbar;
                        MaterialToolbar materialToolbar = (MaterialToolbar) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                        if (materialToolbar != null) {
                            i = R.id.tvSubtitle;
                            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSubtitle);
                            if (textView != null) {
                                i = R.id.tvTitle;
                                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTitle);
                                if (textView2 != null) {
                                    i = R.id.txtAppbarTitle;
                                    TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.txtAppbarTitle);
                                    if (textView3 != null) {
                                        return new loadPlaylistInternal((LinearLayout) view, nestedScrollView, group, progressBar, recyclerView, materialToolbar, textView, textView2, textView3);
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
