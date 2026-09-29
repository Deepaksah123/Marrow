package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Space;
import com.marrow.R;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class SegmentBase implements getApplicationLabel {
    public final CustomTextView AudioAttributesCompatParcelizer;
    private final ScrollView IconCompatParcelizer;
    private Space MediaBrowserCompatCustomActionResultReceiver;
    public final CustomTextView RemoteActionCompatParcelizer;
    public final CustomTextView read;
    public final Button write;

    private SegmentBase(ScrollView scrollView, Button button, CustomTextView customTextView, CustomTextView customTextView2, CustomTextView customTextView3, Space space) {
        this.IconCompatParcelizer = scrollView;
        this.write = button;
        this.read = customTextView;
        this.RemoteActionCompatParcelizer = customTextView2;
        this.AudioAttributesCompatParcelizer = customTextView3;
        this.MediaBrowserCompatCustomActionResultReceiver = space;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public ScrollView IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static SegmentBase IconCompatParcelizer(LayoutInflater layoutInflater) {
        return write(layoutInflater);
    }

    private static SegmentBase write(LayoutInflater layoutInflater) {
        return write(layoutInflater.inflate(R.layout.dialog_confirmation, (ViewGroup) null, false));
    }

    private static SegmentBase write(View view) {
        int i = R.id.dialog_confirmation_highlight_button;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.dialog_confirmation_highlight_button);
        if (button != null) {
            i = R.id.dialog_confirmation_msg;
            CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.dialog_confirmation_msg);
            if (customTextView != null) {
                i = R.id.dialog_confirmation_neglect_button;
                CustomTextView customTextView2 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.dialog_confirmation_neglect_button);
                if (customTextView2 != null) {
                    i = R.id.dialog_confirmation_title;
                    CustomTextView customTextView3 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.dialog_confirmation_title);
                    if (customTextView3 != null) {
                        i = R.id.space2;
                        Space space = (Space) getApplicationIcon.IconCompatParcelizer(view, R.id.space2);
                        if (space != null) {
                            return new SegmentBase((ScrollView) view, button, customTextView, customTextView2, customTextView3, space);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
