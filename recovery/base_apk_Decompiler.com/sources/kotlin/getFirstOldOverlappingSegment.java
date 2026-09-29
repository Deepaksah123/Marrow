package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class getFirstOldOverlappingSegment implements getApplicationLabel {
    private ImageView AudioAttributesCompatParcelizer;
    private final ConstraintLayout IconCompatParcelizer;
    public final TextView RemoteActionCompatParcelizer;

    private getFirstOldOverlappingSegment(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.IconCompatParcelizer = constraintLayout;
        this.AudioAttributesCompatParcelizer = imageView;
        this.RemoteActionCompatParcelizer = textView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static getFirstOldOverlappingSegment read(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return IconCompatParcelizer(layoutInflater.inflate(R.layout.layout_upgrade_content_heading, viewGroup, false));
    }

    private static getFirstOldOverlappingSegment IconCompatParcelizer(View view) {
        int i = R.id.iv_tick;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.iv_tick);
        if (imageView != null) {
            i = R.id.tv_heading;
            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_heading);
            if (textView != null) {
                return new getFirstOldOverlappingSegment((ConstraintLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
