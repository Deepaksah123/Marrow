package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsDataSourceFactory implements getApplicationLabel {
    public final RecyclerView AudioAttributesCompatParcelizer;
    private TextView AudioAttributesImplApi26Parcelizer;
    private Guideline IconCompatParcelizer;
    public final MaterialToolbar RemoteActionCompatParcelizer;
    public final ImageView read;
    private final ConstraintLayout write;

    private HlsDataSourceFactory(ConstraintLayout constraintLayout, Guideline guideline, ImageView imageView, RecyclerView recyclerView, MaterialToolbar materialToolbar, TextView textView) {
        this.write = constraintLayout;
        this.IconCompatParcelizer = guideline;
        this.read = imageView;
        this.AudioAttributesCompatParcelizer = recyclerView;
        this.RemoteActionCompatParcelizer = materialToolbar;
        this.AudioAttributesImplApi26Parcelizer = textView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.write;
    }

    public static HlsDataSourceFactory RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return RemoteActionCompatParcelizer(layoutInflater.inflate(R.layout.fragment_pearl_subject_list, viewGroup, false));
    }

    private static HlsDataSourceFactory RemoteActionCompatParcelizer(View view) {
        int i = R.id.iconTooltip;
        Guideline guideline = (Guideline) getApplicationIcon.IconCompatParcelizer(view, R.id.iconTooltip);
        if (guideline != null) {
            i = R.id.imgSearch;
            ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.imgSearch);
            if (imageView != null) {
                i = R.id.rvSubject;
                RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rvSubject);
                if (recyclerView != null) {
                    i = R.id.toolbar;
                    MaterialToolbar materialToolbar = (MaterialToolbar) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                    if (materialToolbar != null) {
                        i = R.id.txtAppbarTitle;
                        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.txtAppbarTitle);
                        if (textView != null) {
                            return new HlsDataSourceFactory((ConstraintLayout) view, guideline, imageView, recyclerView, materialToolbar, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
