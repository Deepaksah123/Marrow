package kotlin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/SimpleBasePlayerExternalSyntheticLambda22;", "Lo/SimpleBasePlayerExternalSyntheticLambda18;", "<init>", "()V", "", "p0", "Landroid/widget/RelativeLayout$LayoutParams;", "read", "(I)Landroid/widget/RelativeLayout$LayoutParams;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SimpleBasePlayerExternalSyntheticLambda22 extends SimpleBasePlayerExternalSyntheticLambda18 {
    @Override // kotlin.SimpleBasePlayerExternalSyntheticLambda18
    protected final RelativeLayout.LayoutParams read(int p0) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        int iWrite = write(40) / 4;
        layoutParams.setMargins(0, iWrite, iWrite, 0);
        return layoutParams;
    }

    @Override // kotlin.SimpleBasePlayerExternalSyntheticLambda18, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        View viewOnCreateView = super.onCreateView(p0, p1, p2);
        if (!getAudioAttributesCompatParcelizer() && viewOnCreateView != null) {
            PlayerPlaybackSuppressionReason.read(viewOnCreateView, (MagicModuleSubmissionRequestBody<? super _verifyEndArrayForSingle, ? super ViewGroup.MarginLayoutParams, getShowPopup>) new MagicModuleSubmissionRequestBody() { // from class: o.SimpleBasePlayerExternalSyntheticLambda21
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return SimpleBasePlayerExternalSyntheticLambda22.read((_verifyEndArrayForSingle) obj, (ViewGroup.MarginLayoutParams) obj2);
                }
            });
        }
        return viewOnCreateView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_verifyEndArrayForSingle _verifyendarrayforsingle, ViewGroup.MarginLayoutParams marginLayoutParams) {
        toMagicModuleMetaRepoModel.write(_verifyendarrayforsingle, "");
        toMagicModuleMetaRepoModel.write(marginLayoutParams, "");
        marginLayoutParams.leftMargin = _verifyendarrayforsingle.read;
        marginLayoutParams.rightMargin = _verifyendarrayforsingle.IconCompatParcelizer;
        marginLayoutParams.topMargin = _verifyendarrayforsingle.write;
        marginLayoutParams.bottomMargin = _verifyendarrayforsingle.AudioAttributesCompatParcelizer;
        return getShowPopup.INSTANCE;
    }
}
