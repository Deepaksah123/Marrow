package kotlin;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001b\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lo/isMagicModuleEnabled;", "Ljava/io/Externalizable;", "", "p0", "", "p1", "<init>", "(Ljava/util/Collection;I)V", "()V", "Ljava/io/ObjectOutput;", "", "writeExternal", "(Ljava/io/ObjectOutput;)V", "Ljava/io/ObjectInput;", "readExternal", "(Ljava/io/ObjectInput;)V", "", "readResolve", "()Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "Ljava/util/Collection;", "IconCompatParcelizer", "I", "write", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class isMagicModuleEnabled implements Externalizable {
    private Collection<?> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int write;

    public isMagicModuleEnabled(Collection<?> collection, int i) {
        toMagicModuleMetaRepoModel.write(collection, "");
        this.AudioAttributesCompatParcelizer = collection;
        this.write = i;
    }

    public isMagicModuleEnabled() {
        this(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), 0);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput p0) throws IOException {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.writeByte(this.write);
        p0.writeInt(this.AudioAttributesCompatParcelizer.size());
        Iterator<?> it = this.AudioAttributesCompatParcelizer.iterator();
        while (it.hasNext()) {
            p0.writeObject(it.next());
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput p0) throws InvalidObjectException {
        List listAudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(p0, "");
        byte b = p0.readByte();
        int i = b & 1;
        if ((b & (-2)) != 0) {
            StringBuilder sb = new StringBuilder("Unsupported flags value: ");
            sb.append((int) b);
            sb.append('.');
            throw new InvalidObjectException(sb.toString());
        }
        int i2 = p0.readInt();
        if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder("Illegal size value: ");
            sb2.append(i2);
            sb2.append('.');
            throw new InvalidObjectException(sb2.toString());
        }
        int i3 = 0;
        if (i == 0) {
            List listWrite = IntermediateLoginResponseBody.write(i2);
            while (i3 < i2) {
                listWrite.add(p0.readObject());
                i3++;
            }
            listAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(listWrite);
        } else if (i == 1) {
            Set setAudioAttributesCompatParcelizer = getKycMessage.AudioAttributesCompatParcelizer(i2);
            while (i3 < i2) {
                setAudioAttributesCompatParcelizer.add(p0.readObject());
                i3++;
            }
            listAudioAttributesCompatParcelizer = getKycMessage.RemoteActionCompatParcelizer(setAudioAttributesCompatParcelizer);
        } else {
            StringBuilder sb3 = new StringBuilder("Unsupported collection type tag: ");
            sb3.append(i);
            sb3.append('.');
            throw new InvalidObjectException(sb3.toString());
        }
        this.AudioAttributesCompatParcelizer = listAudioAttributesCompatParcelizer;
    }

    private final Object readResolve() {
        return this.AudioAttributesCompatParcelizer;
    }
}
