package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsMediaChunk implements getApplicationLabel {
    public final ProgressBar AudioAttributesCompatParcelizer;
    private final ConstraintLayout IconCompatParcelizer;
    public final RecyclerView write;

    private HlsMediaChunk(ConstraintLayout constraintLayout, ProgressBar progressBar, RecyclerView recyclerView) {
        this.IconCompatParcelizer = constraintLayout;
        this.AudioAttributesCompatParcelizer = progressBar;
        this.write = recyclerView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static HlsMediaChunk read(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return RemoteActionCompatParcelizer(layoutInflater.inflate(R.layout.fragment_qbank_landing, viewGroup, false));
    }

    private static HlsMediaChunk RemoteActionCompatParcelizer(View view) {
        int i = R.id.progressLoadList;
        ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.progressLoadList);
        if (progressBar != null) {
            i = R.id.rvSubjectList;
            RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rvSubjectList);
            if (recyclerView != null) {
                return new HlsMediaChunk((ConstraintLayout) view, progressBar, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
