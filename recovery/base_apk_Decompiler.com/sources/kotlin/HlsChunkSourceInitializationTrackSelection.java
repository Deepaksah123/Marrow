package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsChunkSourceInitializationTrackSelection implements getApplicationLabel {
    public final RecyclerView AudioAttributesCompatParcelizer;
    private final ConstraintLayout AudioAttributesImplBaseParcelizer;
    public final NestedScrollView IconCompatParcelizer;
    public final ImageView RemoteActionCompatParcelizer;
    public final TextView read;
    public final RecyclerView write;

    private HlsChunkSourceInitializationTrackSelection(ConstraintLayout constraintLayout, NestedScrollView nestedScrollView, ImageView imageView, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView) {
        this.AudioAttributesImplBaseParcelizer = constraintLayout;
        this.IconCompatParcelizer = nestedScrollView;
        this.RemoteActionCompatParcelizer = imageView;
        this.write = recyclerView;
        this.AudioAttributesCompatParcelizer = recyclerView2;
        this.read = textView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public static HlsChunkSourceInitializationTrackSelection RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return read(layoutInflater.inflate(R.layout.fragment_practical_corner_landing, viewGroup, false));
    }

    private static HlsChunkSourceInitializationTrackSelection read(View view) {
        int i = R.id.layoutContent;
        NestedScrollView nestedScrollView = (NestedScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.layoutContent);
        if (nestedScrollView != null) {
            i = R.id.lyt_header_background;
            ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.lyt_header_background);
            if (imageView != null) {
                i = R.id.rvPracticalCornerCards;
                RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rvPracticalCornerCards);
                if (recyclerView != null) {
                    i = R.id.rvPracticalCornerSubjects;
                    RecyclerView recyclerView2 = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rvPracticalCornerSubjects);
                    if (recyclerView2 != null) {
                        i = R.id.tvCompletedModules;
                        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCompletedModules);
                        if (textView != null) {
                            return new HlsChunkSourceInitializationTrackSelection((ConstraintLayout) view, nestedScrollView, imageView, recyclerView, recyclerView2, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
