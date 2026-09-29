package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\t\u0010\u0015"}, d2 = {"Lo/findEnumDeserializer;", "Lo/findBeanDeserializer;", "", "p0", "p1", "<init>", "(II)V", "Lo/findReferenceDeserializer;", "", "read", "(Lo/findReferenceDeserializer;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "I", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class findEnumDeserializer implements findBeanDeserializer {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    public findEnumDeserializer(int i, int i2) {
        this.read = i;
        this.RemoteActionCompatParcelizer = i2;
        if (i < 0 || i2 < 0) {
            StringBuilder sb = new StringBuilder("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ");
            sb.append(i);
            sb.append(" and ");
            sb.append(i2);
            sb.append(" respectively.");
            withStackTrace.read(sb.toString());
        }
    }

    @Override // kotlin.findBeanDeserializer
    public final void read(findReferenceDeserializer p0) {
        int i = this.read;
        int iAudioAttributesImplApi26Parcelizer = 0;
        int remoteActionCompatParcelizer = 0;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                int i3 = remoteActionCompatParcelizer + 1;
                if (p0.getRemoteActionCompatParcelizer() > i3) {
                    remoteActionCompatParcelizer = findCollectionDeserializer.write(p0.read((p0.getRemoteActionCompatParcelizer() - i3) + (-1)), p0.read(p0.getRemoteActionCompatParcelizer() - i3)) ? remoteActionCompatParcelizer + 2 : i3;
                    i2++;
                } else {
                    remoteActionCompatParcelizer = p0.getRemoteActionCompatParcelizer();
                    break;
                }
            } else {
                break;
            }
        }
        int i4 = this.RemoteActionCompatParcelizer;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                break;
            }
            int i6 = iAudioAttributesImplApi26Parcelizer + 1;
            if (p0.getAudioAttributesCompatParcelizer() + i6 < p0.AudioAttributesImplApi26Parcelizer()) {
                iAudioAttributesImplApi26Parcelizer = findCollectionDeserializer.write(p0.read((p0.getAudioAttributesCompatParcelizer() + i6) + (-1)), p0.read(p0.getAudioAttributesCompatParcelizer() + i6)) ? iAudioAttributesImplApi26Parcelizer + 2 : i6;
                i5++;
            } else {
                iAudioAttributesImplApi26Parcelizer = p0.AudioAttributesImplApi26Parcelizer() - p0.getAudioAttributesCompatParcelizer();
                break;
            }
        }
        p0.RemoteActionCompatParcelizer(p0.getAudioAttributesCompatParcelizer(), p0.getAudioAttributesCompatParcelizer() + iAudioAttributesImplApi26Parcelizer);
        p0.RemoteActionCompatParcelizer(p0.getRemoteActionCompatParcelizer() - remoteActionCompatParcelizer, p0.getRemoteActionCompatParcelizer());
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof findEnumDeserializer)) {
            return false;
        }
        findEnumDeserializer findenumdeserializer = (findEnumDeserializer) p0;
        return this.read == findenumdeserializer.read && this.RemoteActionCompatParcelizer == findenumdeserializer.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return (this.read * 31) + this.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.read);
        sb.append(", lengthAfterCursor=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
