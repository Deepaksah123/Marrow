package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.marrow.R;

/* JADX INFO: loaded from: classes5.dex */
public final class unbindSampleQueue implements getApplicationLabel {
    private final LinearLayout IconCompatParcelizer;
    public final SwitchCompat RemoteActionCompatParcelizer;
    public final TextView read;
    public final LinearLayout write;

    private unbindSampleQueue(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, SwitchCompat switchCompat) {
        this.IconCompatParcelizer = linearLayout;
        this.write = linearLayout2;
        this.read = textView;
        this.RemoteActionCompatParcelizer = switchCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public LinearLayout IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static unbindSampleQueue read(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.item_setting_toggle, viewGroup, false));
    }

    private static unbindSampleQueue AudioAttributesCompatParcelizer(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.title;
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.title);
        if (textView != null) {
            i = R.id.toggle;
            SwitchCompat switchCompat = (SwitchCompat) getApplicationIcon.IconCompatParcelizer(view, R.id.toggle);
            if (switchCompat != null) {
                return new unbindSampleQueue(linearLayout, linearLayout, textView, switchCompat);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
