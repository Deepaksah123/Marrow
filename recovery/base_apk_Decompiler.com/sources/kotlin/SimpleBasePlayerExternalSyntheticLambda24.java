package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.RendererCapabilitiesAdaptiveSupport;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\u000b"}, d2 = {"Lo/SimpleBasePlayerExternalSyntheticLambda24;", "Lo/SimpleBasePlayerExternalSyntheticLambda23;", "<init>", "()V", "Landroid/view/View;", "p0", "Landroid/view/ViewGroup;", "AudioAttributesCompatParcelizer", "(Landroid/view/View;)Landroid/view/ViewGroup;", "Landroid/view/LayoutInflater;", "p1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SimpleBasePlayerExternalSyntheticLambda24 extends SimpleBasePlayerExternalSyntheticLambda23 {
    @Override // kotlin.SimpleBasePlayerExternalSyntheticLambda23
    public final ViewGroup AudioAttributesCompatParcelizer(View p0) {
        if (p0 != null) {
            return (ViewGroup) p0.findViewById(RendererCapabilitiesAdaptiveSupport.write.inapp_html_footer_frame_layout);
        }
        return null;
    }

    @Override // kotlin.SimpleBasePlayerExternalSyntheticLambda23
    public final View AudioAttributesCompatParcelizer(LayoutInflater p0, ViewGroup p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        View viewInflate = p0.inflate(RendererCapabilitiesAdaptiveSupport.IconCompatParcelizer.inapp_html_footer, p1, false);
        toMagicModuleMetaRepoModel.write(viewInflate);
        PlayerPlaybackSuppressionReason.read(viewInflate, (MagicModuleSubmissionRequestBody<? super _verifyEndArrayForSingle, ? super ViewGroup.MarginLayoutParams, getShowPopup>) new MagicModuleSubmissionRequestBody() { // from class: o.SimpleBasePlayerExternalSyntheticLambda27
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return SimpleBasePlayerExternalSyntheticLambda24.read((_verifyEndArrayForSingle) obj, (ViewGroup.MarginLayoutParams) obj2);
            }
        });
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_verifyEndArrayForSingle _verifyendarrayforsingle, ViewGroup.MarginLayoutParams marginLayoutParams) {
        toMagicModuleMetaRepoModel.write(_verifyendarrayforsingle, "");
        toMagicModuleMetaRepoModel.write(marginLayoutParams, "");
        marginLayoutParams.leftMargin = _verifyendarrayforsingle.read;
        marginLayoutParams.rightMargin = _verifyendarrayforsingle.IconCompatParcelizer;
        marginLayoutParams.bottomMargin = _verifyendarrayforsingle.AudioAttributesCompatParcelizer;
        return getShowPopup.INSTANCE;
    }
}
