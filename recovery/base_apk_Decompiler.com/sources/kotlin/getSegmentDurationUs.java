package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class getSegmentDurationUs implements getApplicationLabel {
    public final ImageView AudioAttributesCompatParcelizer;
    private Space AudioAttributesImplApi26Parcelizer;
    public final Button IconCompatParcelizer;
    private final ScrollView MediaBrowserCompatCustomActionResultReceiver;
    public final TextView RemoteActionCompatParcelizer;
    public final TextView read;
    public final TextView write;

    private getSegmentDurationUs(ScrollView scrollView, Button button, TextView textView, TextView textView2, TextView textView3, ImageView imageView, Space space) {
        this.MediaBrowserCompatCustomActionResultReceiver = scrollView;
        this.IconCompatParcelizer = button;
        this.write = textView;
        this.read = textView2;
        this.RemoteActionCompatParcelizer = textView3;
        this.AudioAttributesCompatParcelizer = imageView;
        this.AudioAttributesImplApi26Parcelizer = space;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ScrollView IconCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public static getSegmentDurationUs IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.dialog_fragment_confirmation, viewGroup, false));
    }

    private static getSegmentDurationUs AudioAttributesCompatParcelizer(View view) {
        int i = R.id.dialog_confirmation_highlight_button;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.dialog_confirmation_highlight_button);
        if (button != null) {
            i = R.id.dialog_confirmation_msg;
            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.dialog_confirmation_msg);
            if (textView != null) {
                i = R.id.dialog_confirmation_neglect_button;
                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.dialog_confirmation_neglect_button);
                if (textView2 != null) {
                    i = R.id.dialog_confirmation_title;
                    TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.dialog_confirmation_title);
                    if (textView3 != null) {
                        i = R.id.dialogImageTop;
                        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.dialogImageTop);
                        if (imageView != null) {
                            i = R.id.space2;
                            Space space = (Space) getApplicationIcon.IconCompatParcelizer(view, R.id.space2);
                            if (space != null) {
                                return new getSegmentDurationUs((ScrollView) view, button, textView, textView2, textView3, imageView, space);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
