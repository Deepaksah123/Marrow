package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class createSampleQueue implements getApplicationLabel {
    private TextView RemoteActionCompatParcelizer;
    private final LinearLayout write;

    private createSampleQueue(LinearLayout linearLayout, TextView textView) {
        this.write = linearLayout;
        this.RemoteActionCompatParcelizer = textView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.write;
    }

    public static createSampleQueue IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.item_type_qbank_manifesto, viewGroup, false));
    }

    private static createSampleQueue write(View view) {
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvQbankManifesto);
        if (textView != null) {
            return new createSampleQueue((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tvQbankManifesto)));
    }
}
