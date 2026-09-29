package kotlin;

import android.view.View;
import kotlin.Metadata;

/* JADX INFO: renamed from: o.version, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/Module;", "Landroid/view/View;", "RemoteActionCompatParcelizer", "(Lo/Module;)Landroid/view/View;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class C0217version {
    public static final View RemoteActionCompatParcelizer(Module module) {
        if (!module.getRead().getRatingCompat()) {
            reportWrongTokenException.read("Cannot get View because the Modifier node is not currently attached.");
        }
        Object objAudioAttributesCompatParcelizer = _serializerProvider.AudioAttributesCompatParcelizer(collectLongDefaults.AudioAttributesImplApi26Parcelizer(module));
        toMagicModuleMetaRepoModel.read(objAudioAttributesCompatParcelizer, "");
        return (View) objAudioAttributesCompatParcelizer;
    }
}
