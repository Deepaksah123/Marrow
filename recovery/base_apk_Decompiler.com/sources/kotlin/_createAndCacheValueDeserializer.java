package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/_createAndCacheValueDeserializer;", "Lo/findBeanDeserializer;", "<init>", "()V", "Lo/findReferenceDeserializer;", "p0", "", "read", "(Lo/findReferenceDeserializer;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _createAndCacheValueDeserializer implements findBeanDeserializer {
    @Override // kotlin.findBeanDeserializer
    public final void read(findReferenceDeserializer p0) {
        if (p0.AudioAttributesImplApi21Parcelizer()) {
            p0.RemoteActionCompatParcelizer(p0.getIconCompatParcelizer(), p0.getWrite());
            return;
        }
        if (p0.RemoteActionCompatParcelizer() == -1) {
            int remoteActionCompatParcelizer = p0.getRemoteActionCompatParcelizer();
            int audioAttributesCompatParcelizer = p0.getAudioAttributesCompatParcelizer();
            p0.write(p0.getRemoteActionCompatParcelizer());
            p0.RemoteActionCompatParcelizer(remoteActionCompatParcelizer, audioAttributesCompatParcelizer);
            return;
        }
        if (p0.RemoteActionCompatParcelizer() == 0) {
            return;
        }
        p0.RemoteActionCompatParcelizer(createContextual.IconCompatParcelizer(p0.toString(), p0.RemoteActionCompatParcelizer()), p0.RemoteActionCompatParcelizer());
    }

    public final boolean equals(Object p0) {
        return p0 instanceof _createAndCacheValueDeserializer;
    }

    public final int hashCode() {
        return toMagicModuleMetaDataUcModel.write(getClass()).hashCode();
    }

    public final String toString() {
        return "BackspaceCommand()";
    }
}
