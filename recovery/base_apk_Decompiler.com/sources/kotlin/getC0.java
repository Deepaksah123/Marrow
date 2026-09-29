package kotlin;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/getC0;", "Ljava/io/Externalizable;", "", "p0", "<init>", "(Ljava/util/Map;)V", "()V", "Ljava/io/ObjectOutput;", "", "writeExternal", "(Ljava/io/ObjectOutput;)V", "Ljava/io/ObjectInput;", "readExternal", "(Ljava/io/ObjectInput;)V", "", "readResolve", "()Ljava/lang/Object;", "RemoteActionCompatParcelizer", "Ljava/util/Map;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class getC0 implements Externalizable {
    private Map<?, ?> RemoteActionCompatParcelizer;

    public getC0(Map<?, ?> map) {
        toMagicModuleMetaRepoModel.write(map, "");
        this.RemoteActionCompatParcelizer = map;
    }

    public getC0() {
        this(VideoTimelineResponseBody.read());
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput p0) throws IOException {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.writeByte(0);
        p0.writeInt(this.RemoteActionCompatParcelizer.size());
        for (Map.Entry<?, ?> entry : this.RemoteActionCompatParcelizer.entrySet()) {
            p0.writeObject(entry.getKey());
            p0.writeObject(entry.getValue());
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput p0) throws InvalidObjectException {
        toMagicModuleMetaRepoModel.write(p0, "");
        byte b = p0.readByte();
        if (b != 0) {
            throw new InvalidObjectException("Unsupported flags value: ".concat(String.valueOf((int) b)));
        }
        int i = p0.readInt();
        if (i < 0) {
            StringBuilder sb = new StringBuilder("Illegal size value: ");
            sb.append(i);
            sb.append('.');
            throw new InvalidObjectException(sb.toString());
        }
        Map mapIconCompatParcelizer = VideoTimelineResponseBody.IconCompatParcelizer(i);
        for (int i2 = 0; i2 < i; i2++) {
            mapIconCompatParcelizer.put(p0.readObject(), p0.readObject());
        }
        this.RemoteActionCompatParcelizer = VideoTimelineResponseBody.read(mapIconCompatParcelizer);
    }

    private final Object readResolve() {
        return this.RemoteActionCompatParcelizer;
    }
}
