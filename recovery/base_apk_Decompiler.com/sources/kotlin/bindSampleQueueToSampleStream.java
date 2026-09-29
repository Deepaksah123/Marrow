package kotlin;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class bindSampleQueueToSampleStream implements getApplicationLabel {
    private TextView RemoteActionCompatParcelizer;
    private final LinearLayout read;
    private ImageView write;

    private bindSampleQueueToSampleStream(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.read = linearLayout;
        this.write = imageView;
        this.RemoteActionCompatParcelizer = textView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.read;
    }

    public static bindSampleQueueToSampleStream AudioAttributesCompatParcelizer(View view) {
        int i = R.id.ivEmptyTopic;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivEmptyTopic);
        if (imageView != null) {
            i = R.id.tvEmptyTopics;
            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvEmptyTopics);
            if (textView != null) {
                return new bindSampleQueueToSampleStream((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
