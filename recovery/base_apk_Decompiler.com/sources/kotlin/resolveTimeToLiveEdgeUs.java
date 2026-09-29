package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class resolveTimeToLiveEdgeUs implements getApplicationLabel {
    public final Button AudioAttributesCompatParcelizer;
    private final ConstraintLayout IconCompatParcelizer;
    private LinearLayout RemoteActionCompatParcelizer;
    public final setSourceChunk read;
    public final ScrollView write;

    private resolveTimeToLiveEdgeUs(ConstraintLayout constraintLayout, setSourceChunk setsourcechunk, Button button, LinearLayout linearLayout, ScrollView scrollView) {
        this.IconCompatParcelizer = constraintLayout;
        this.read = setsourcechunk;
        this.AudioAttributesCompatParcelizer = button;
        this.RemoteActionCompatParcelizer = linearLayout;
        this.write = scrollView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static resolveTimeToLiveEdgeUs read(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.fragment_notes_purchase_address_input, viewGroup, false));
    }

    private static resolveTimeToLiveEdgeUs AudioAttributesCompatParcelizer(View view) {
        int i = R.id.addressFormContainer;
        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.addressFormContainer);
        if (viewIconCompatParcelizer != null) {
            setSourceChunk setsourcechunkIconCompatParcelizer = setSourceChunk.IconCompatParcelizer(viewIconCompatParcelizer);
            i = R.id.btnNext;
            Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnNext);
            if (button != null) {
                i = R.id.button_container;
                LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.button_container);
                if (linearLayout != null) {
                    i = R.id.scrollable_content;
                    ScrollView scrollView = (ScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.scrollable_content);
                    if (scrollView != null) {
                        return new resolveTimeToLiveEdgeUs((ConstraintLayout) view, setsourcechunkIconCompatParcelizer, button, linearLayout, scrollView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
