package kotlin;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsSampleStreamWrapper1 implements getApplicationLabel {
    private LinearLayout AudioAttributesCompatParcelizer;
    private TextView AudioAttributesImplBaseParcelizer;
    public final ImageView IconCompatParcelizer;
    public final TextView RemoteActionCompatParcelizer;
    private ImageView read;
    private final LinearLayout write;

    private HlsSampleStreamWrapper1(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        this.write = linearLayout;
        this.read = imageView;
        this.IconCompatParcelizer = imageView2;
        this.AudioAttributesCompatParcelizer = linearLayout2;
        this.AudioAttributesImplBaseParcelizer = textView;
        this.RemoteActionCompatParcelizer = textView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.write;
    }

    public static HlsSampleStreamWrapper1 read(View view) {
        int i = R.id.booksImage;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.booksImage);
        if (imageView != null) {
            i = R.id.btn_add_notes;
            ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.btn_add_notes);
            if (imageView2 != null) {
                i = R.id.llNotesAddonInfo;
                LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llNotesAddonInfo);
                if (linearLayout != null) {
                    i = R.id.tvDescription;
                    TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvDescription);
                    if (textView != null) {
                        i = R.id.tvTitle;
                        TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTitle);
                        if (textView2 != null) {
                            return new HlsSampleStreamWrapper1((LinearLayout) view, imageView, imageView2, linearLayout, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
