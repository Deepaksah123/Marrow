package kotlin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/SimpleBasePlayerExternalSyntheticLambda3;", "Lo/SimpleBasePlayerExternalSyntheticLambda18;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SimpleBasePlayerExternalSyntheticLambda3 extends SimpleBasePlayerExternalSyntheticLambda18 {
    @Override // kotlin.SimpleBasePlayerExternalSyntheticLambda18, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        View viewOnCreateView = super.onCreateView(p0, p1, p2);
        if (!getAudioAttributesCompatParcelizer() && viewOnCreateView != null) {
            PlayerPlaybackSuppressionReason.read(viewOnCreateView, (MagicModuleSubmissionRequestBody<? super _verifyEndArrayForSingle, ? super ViewGroup.MarginLayoutParams, getShowPopup>) new MagicModuleSubmissionRequestBody() { // from class: o.SimpleBasePlayerExternalSyntheticLambda28
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return SimpleBasePlayerExternalSyntheticLambda3.AudioAttributesCompatParcelizer((_verifyEndArrayForSingle) obj, (ViewGroup.MarginLayoutParams) obj2);
                }
            });
        }
        return viewOnCreateView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(_verifyEndArrayForSingle _verifyendarrayforsingle, ViewGroup.MarginLayoutParams marginLayoutParams) {
        toMagicModuleMetaRepoModel.write(_verifyendarrayforsingle, "");
        toMagicModuleMetaRepoModel.write(marginLayoutParams, "");
        marginLayoutParams.leftMargin = _verifyendarrayforsingle.read;
        marginLayoutParams.rightMargin = _verifyendarrayforsingle.IconCompatParcelizer;
        marginLayoutParams.topMargin = _verifyendarrayforsingle.write;
        marginLayoutParams.bottomMargin = _verifyendarrayforsingle.AudioAttributesCompatParcelizer;
        return getShowPopup.INSTANCE;
    }
}
