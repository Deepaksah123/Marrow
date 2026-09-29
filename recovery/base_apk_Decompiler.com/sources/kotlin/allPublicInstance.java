package kotlin;

import kotlin.VisibilityChecker;

/* JADX INFO: loaded from: classes2.dex */
public final class allPublicInstance {
    public static final <VM extends POJOPropertyBuilderWithMember> VM read(VisibilityChecker.RemoteActionCompatParcelizer remoteActionCompatParcelizer, isHdPlaybackError<VM> ishdplaybackerror, withFieldVisibility withfieldvisibility) {
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(ishdplaybackerror, "");
        toMagicModuleMetaRepoModel.write(withfieldvisibility, "");
        try {
            try {
                return (VM) remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(ishdplaybackerror, withfieldvisibility);
            } catch (AbstractMethodError unused) {
                return (VM) remoteActionCompatParcelizer.read(MagicModuleFeedbackRequestBody.IconCompatParcelizer(ishdplaybackerror));
            }
        } catch (AbstractMethodError unused2) {
            return (VM) remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(MagicModuleFeedbackRequestBody.IconCompatParcelizer(ishdplaybackerror), withfieldvisibility);
        }
    }
}
