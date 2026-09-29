package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class setAllowChunklessPreparation implements getApplicationLabel {
    private FrameLayout AudioAttributesCompatParcelizer;
    public final ImageView IconCompatParcelizer;
    private View RemoteActionCompatParcelizer;
    private final FrameLayout read;
    public final View write;

    private setAllowChunklessPreparation(FrameLayout frameLayout, ImageView imageView, View view, FrameLayout frameLayout2, View view2) {
        this.read = frameLayout;
        this.IconCompatParcelizer = imageView;
        this.write = view;
        this.AudioAttributesCompatParcelizer = frameLayout2;
        this.RemoteActionCompatParcelizer = view2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public FrameLayout IconCompatParcelizer() {
        return this.read;
    }

    public static setAllowChunklessPreparation IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.interactive_panel_icon_layout, viewGroup, false);
        viewGroup.addView(viewInflate);
        return write(viewInflate);
    }

    private static setAllowChunklessPreparation write(View view) {
        int i = R.id.ivLabel;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivLabel);
        if (imageView != null) {
            i = R.id.rectangleView;
            View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.rectangleView);
            if (viewIconCompatParcelizer != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                i = R.id.verticalLine;
                View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.verticalLine);
                if (viewIconCompatParcelizer2 != null) {
                    return new setAllowChunklessPreparation(frameLayout, imageView, viewIconCompatParcelizer, frameLayout, viewIconCompatParcelizer2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
