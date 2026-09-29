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
public final class onPlaylistError implements getApplicationLabel {
    private final ConstraintLayout AudioAttributesCompatParcelizer;
    private ScrollView AudioAttributesImplApi26Parcelizer;
    public final createMediaParserInstance IconCompatParcelizer;
    public final Button RemoteActionCompatParcelizer;
    public final SampleQueueMappingException read;
    private LinearLayout write;

    private onPlaylistError(ConstraintLayout constraintLayout, createMediaParserInstance createmediaparserinstance, Button button, LinearLayout linearLayout, SampleQueueMappingException sampleQueueMappingException, ScrollView scrollView) {
        this.AudioAttributesCompatParcelizer = constraintLayout;
        this.IconCompatParcelizer = createmediaparserinstance;
        this.RemoteActionCompatParcelizer = button;
        this.write = linearLayout;
        this.read = sampleQueueMappingException;
        this.AudioAttributesImplApi26Parcelizer = scrollView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static onPlaylistError read(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return RemoteActionCompatParcelizer(layoutInflater.inflate(R.layout.fragment_notes_purchase_billing_details, viewGroup, false));
    }

    private static onPlaylistError RemoteActionCompatParcelizer(View view) {
        int i = R.id.billingAddress;
        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.billingAddress);
        if (viewIconCompatParcelizer != null) {
            createMediaParserInstance createmediaparserinstanceWrite = createMediaParserInstance.write(viewIconCompatParcelizer);
            i = R.id.btnConfirmAndPay;
            Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnConfirmAndPay);
            if (button != null) {
                i = R.id.button_container;
                LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.button_container);
                if (linearLayout != null) {
                    i = R.id.priceBreakdown;
                    View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.priceBreakdown);
                    if (viewIconCompatParcelizer2 != null) {
                        SampleQueueMappingException sampleQueueMappingException = SampleQueueMappingException.read(viewIconCompatParcelizer2);
                        i = R.id.scrollable_content;
                        ScrollView scrollView = (ScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.scrollable_content);
                        if (scrollView != null) {
                            return new onPlaylistError((ConstraintLayout) view, createmediaparserinstanceWrite, button, linearLayout, sampleQueueMappingException, scrollView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
