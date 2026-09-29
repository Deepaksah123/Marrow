package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class getRequestUriForPrimaryChange implements getApplicationLabel {
    public final TextView IconCompatParcelizer;
    public final TextView RemoteActionCompatParcelizer;
    private final LinearLayout read;
    public final ImageView write;

    private getRequestUriForPrimaryChange(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.read = linearLayout;
        this.write = imageView;
        this.IconCompatParcelizer = textView;
        this.RemoteActionCompatParcelizer = textView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.read;
    }

    public static getRequestUriForPrimaryChange IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return RemoteActionCompatParcelizer(layoutInflater.inflate(R.layout.layout_subscribe_editor_revamp, viewGroup, false));
    }

    private static getRequestUriForPrimaryChange RemoteActionCompatParcelizer(View view) {
        int i = R.id.editor_image;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.editor_image);
        if (imageView != null) {
            i = R.id.editorName;
            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.editorName);
            if (textView != null) {
                i = R.id.editor_qualification;
                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.editor_qualification);
                if (textView2 != null) {
                    return new getRequestUriForPrimaryChange((LinearLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
