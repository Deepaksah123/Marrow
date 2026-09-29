package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u000b8\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011"}, d2 = {"Lo/getProperty;", "Lo/findBeanDeserializer;", "Lo/findReferenceDeserializer;", "p0", "", "read", "(Lo/findReferenceDeserializer;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getProperty implements findBeanDeserializer {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    @Override // kotlin.findBeanDeserializer
    public final void read(findReferenceDeserializer p0) {
        if (p0.RemoteActionCompatParcelizer() == -1) {
            p0.write(p0.getRemoteActionCompatParcelizer());
        }
        int remoteActionCompatParcelizer = p0.getRemoteActionCompatParcelizer();
        String string = p0.toString();
        int i = this.IconCompatParcelizer;
        int i2 = 0;
        if (i <= 0) {
            int i3 = -i;
            while (i2 < i3) {
                int iIconCompatParcelizer = createContextual.IconCompatParcelizer(string, remoteActionCompatParcelizer);
                if (iIconCompatParcelizer == -1) {
                    break;
                }
                i2++;
                remoteActionCompatParcelizer = iIconCompatParcelizer;
            }
        } else {
            while (i2 < i) {
                int iAudioAttributesCompatParcelizer = createContextual.AudioAttributesCompatParcelizer(string, remoteActionCompatParcelizer);
                if (iAudioAttributesCompatParcelizer == -1) {
                    break;
                }
                i2++;
                remoteActionCompatParcelizer = iAudioAttributesCompatParcelizer;
            }
        }
        p0.write(remoteActionCompatParcelizer);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof getProperty) && this.IconCompatParcelizer == ((getProperty) p0).IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveCursorCommand(amount=");
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
