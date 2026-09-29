package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class setMetadataType implements getApplicationLabel {
    public final TextView read;
    private final LinearLayout write;

    private setMetadataType(LinearLayout linearLayout, TextView textView) {
        this.write = linearLayout;
        this.read = textView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.write;
    }

    public static setMetadataType read(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.item_calendar_header, viewGroup, false));
    }

    private static setMetadataType write(View view) {
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.day);
        if (textView != null) {
            return new setMetadataType((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.day)));
    }
}
