package kotlin;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsDownloader implements getApplicationLabel {
    public final View AudioAttributesCompatParcelizer;
    private LinearLayout IconCompatParcelizer;
    private LinearLayout MediaBrowserCompatCustomActionResultReceiver;
    private final LinearLayout MediaBrowserCompatItemReceiver;
    public final ImageButton RemoteActionCompatParcelizer;
    public final TextView read;
    public final ImageButton write;

    private HlsDownloader(LinearLayout linearLayout, ImageButton imageButton, ImageButton imageButton2, View view, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView) {
        this.MediaBrowserCompatItemReceiver = linearLayout;
        this.RemoteActionCompatParcelizer = imageButton;
        this.write = imageButton2;
        this.AudioAttributesCompatParcelizer = view;
        this.IconCompatParcelizer = linearLayout2;
        this.MediaBrowserCompatCustomActionResultReceiver = linearLayout3;
        this.read = textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public LinearLayout IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public static HlsDownloader RemoteActionCompatParcelizer(View view) {
        int i = R.id.backButton;
        ImageButton imageButton = (ImageButton) getApplicationIcon.IconCompatParcelizer(view, R.id.backButton);
        if (imageButton != null) {
            i = R.id.closeBtn;
            ImageButton imageButton2 = (ImageButton) getApplicationIcon.IconCompatParcelizer(view, R.id.closeBtn);
            if (imageButton2 != null) {
                i = R.id.dragHandle;
                View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.dragHandle);
                if (viewIconCompatParcelizer != null) {
                    i = R.id.headerBar;
                    LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.headerBar);
                    if (linearLayout != null) {
                        LinearLayout linearLayout2 = (LinearLayout) view;
                        i = R.id.title;
                        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.title);
                        if (textView != null) {
                            return new HlsDownloader(linearLayout2, imageButton, imageButton2, viewIconCompatParcelizer, linearLayout, linearLayout2, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
