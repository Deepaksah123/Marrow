package kotlin;

import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081@\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013\u0088\u0001\u0015\u0092\u0001\b\u0012\u0004\u0012\u00020\u00030\u0002"}, d2 = {"Lo/setAuxEffectInfo;", "", "Lo/InputAccessor;", "", "p0", "RemoteActionCompatParcelizer", "(Lo/InputAccessor;)Lo/InputAccessor;", "write", "(Lo/InputAccessor;)V", "AudioAttributesCompatParcelizer", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lo/InputAccessor;", "IconCompatParcelizer", NotesDispatchAddressRequestKt.KEY_STATE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class setAuxEffectInfo {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final InputAccessor<getShowPopup> IconCompatParcelizer;

    public static InputAccessor<getShowPopup> RemoteActionCompatParcelizer(InputAccessor<getShowPopup> inputAccessor) {
        return inputAccessor;
    }

    public static /* synthetic */ InputAccessor AudioAttributesCompatParcelizer(InputAccessor inputAccessor, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        if ((i & 1) != 0) {
            inputAccessor = _qbuf.RemoteActionCompatParcelizer(getShowPopup.INSTANCE, _qbuf.AudioAttributesCompatParcelizer());
        }
        return RemoteActionCompatParcelizer(inputAccessor);
    }

    public static final void write(InputAccessor<getShowPopup> inputAccessor) {
        inputAccessor.getRemoteActionCompatParcelizer();
    }

    public static final void AudioAttributesCompatParcelizer(InputAccessor<getShowPopup> inputAccessor) {
        inputAccessor.write(getShowPopup.INSTANCE);
    }

    public static boolean IconCompatParcelizer(InputAccessor<getShowPopup> inputAccessor, Object obj) {
        return (obj instanceof setAuxEffectInfo) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(inputAccessor, ((setAuxEffectInfo) obj).getIconCompatParcelizer());
    }

    public static int IconCompatParcelizer(InputAccessor<getShowPopup> inputAccessor) {
        return inputAccessor.hashCode();
    }

    public static String read(InputAccessor<getShowPopup> inputAccessor) {
        StringBuilder sb = new StringBuilder("ObservableScopeInvalidator(state=");
        sb.append(inputAccessor);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return IconCompatParcelizer(this.IconCompatParcelizer, p0);
    }

    public final int hashCode() {
        return IconCompatParcelizer(this.IconCompatParcelizer);
    }

    public final String toString() {
        return read(this.IconCompatParcelizer);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final /* synthetic */ InputAccessor getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
