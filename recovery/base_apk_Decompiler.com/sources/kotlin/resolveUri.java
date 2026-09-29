package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class resolveUri implements getApplicationLabel {
    public final TextView AudioAttributesCompatParcelizer;
    private final ConstraintLayout AudioAttributesImplBaseParcelizer;
    public final ImageButton IconCompatParcelizer;
    private LinearLayout MediaBrowserCompatCustomActionResultReceiver;
    private ConstraintLayout RemoteActionCompatParcelizer;
    private TextView read;
    public final RecyclerView write;

    private resolveUri(ConstraintLayout constraintLayout, TextView textView, ConstraintLayout constraintLayout2, ImageButton imageButton, TextView textView2, LinearLayout linearLayout, RecyclerView recyclerView) {
        this.AudioAttributesImplBaseParcelizer = constraintLayout;
        this.read = textView;
        this.RemoteActionCompatParcelizer = constraintLayout2;
        this.IconCompatParcelizer = imageButton;
        this.AudioAttributesCompatParcelizer = textView2;
        this.MediaBrowserCompatCustomActionResultReceiver = linearLayout;
        this.write = recyclerView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public static resolveUri read(LayoutInflater layoutInflater) {
        return IconCompatParcelizer(layoutInflater);
    }

    private static resolveUri IconCompatParcelizer(LayoutInflater layoutInflater) {
        return RemoteActionCompatParcelizer(layoutInflater.inflate(R.layout.bottomsheet_qbank_suggestion_v2, (ViewGroup) null, false));
    }

    private static resolveUri RemoteActionCompatParcelizer(View view) {
        int i = R.id.bottomsheetHeader;
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.bottomsheetHeader);
        if (textView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.closeBottomsheet;
            ImageButton imageButton = (ImageButton) getApplicationIcon.IconCompatParcelizer(view, R.id.closeBottomsheet);
            if (imageButton != null) {
                i = R.id.description;
                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.description);
                if (textView2 != null) {
                    i = R.id.llDescription;
                    LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llDescription);
                    if (linearLayout != null) {
                        i = R.id.rvQBankModules;
                        RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rvQBankModules);
                        if (recyclerView != null) {
                            return new resolveUri(constraintLayout, textView, constraintLayout, imageButton, textView2, linearLayout, recyclerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
