package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class SegmentBaseSingleSegmentBase implements getApplicationLabel {
    public final Button AudioAttributesCompatParcelizer;
    private final ScrollView AudioAttributesImplApi21Parcelizer;
    private TextView AudioAttributesImplBaseParcelizer;
    private TextView IconCompatParcelizer;
    public final TextView RemoteActionCompatParcelizer;
    public final TextView read;
    private ImageView write;

    private SegmentBaseSingleSegmentBase(ScrollView scrollView, Button button, TextView textView, ImageView imageView, TextView textView2, TextView textView3, TextView textView4) {
        this.AudioAttributesImplApi21Parcelizer = scrollView;
        this.AudioAttributesCompatParcelizer = button;
        this.read = textView;
        this.write = imageView;
        this.RemoteActionCompatParcelizer = textView2;
        this.IconCompatParcelizer = textView3;
        this.AudioAttributesImplBaseParcelizer = textView4;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final ScrollView IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public static SegmentBaseSingleSegmentBase read(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return read(layoutInflater.inflate(R.layout.dialog_fragment_kyc_warning, viewGroup, false));
    }

    private static SegmentBaseSingleSegmentBase read(View view) {
        int i = R.id.dialog_confirmation_highlight_button;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.dialog_confirmation_highlight_button);
        if (button != null) {
            i = R.id.dialog_confirmation_title;
            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.dialog_confirmation_title);
            if (textView != null) {
                i = R.id.dialogImageTop;
                ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.dialogImageTop);
                if (imageView != null) {
                    i = R.id.dialog_warning;
                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.dialog_warning);
                    if (textView2 != null) {
                        i = R.id.message;
                        TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.message);
                        if (textView3 != null) {
                            i = R.id.message1;
                            TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.message1);
                            if (textView4 != null) {
                                return new SegmentBaseSingleSegmentBase((ScrollView) view, button, textView, imageView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
