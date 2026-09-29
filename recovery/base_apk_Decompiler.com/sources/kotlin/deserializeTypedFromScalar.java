package kotlin;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.deserializeTypedFromArray;

/* JADX INFO: loaded from: classes2.dex */
public final class deserializeTypedFromScalar {
    private final initExtraTracks<deserializeTypedFromArray> RemoteActionCompatParcelizer;
    private final List<deserializeTypedFromArray> read = new ArrayList();
    private ByteBuffer[] AudioAttributesCompatParcelizer = new ByteBuffer[0];
    private deserializeTypedFromArray.IconCompatParcelizer IconCompatParcelizer = deserializeTypedFromArray.IconCompatParcelizer.read;
    private deserializeTypedFromArray.IconCompatParcelizer AudioAttributesImplBaseParcelizer = deserializeTypedFromArray.IconCompatParcelizer.read;
    private boolean write = false;

    public deserializeTypedFromScalar(initExtraTracks<deserializeTypedFromArray> initextratracks) {
        this.RemoteActionCompatParcelizer = initextratracks;
    }

    public final deserializeTypedFromArray.IconCompatParcelizer IconCompatParcelizer(deserializeTypedFromArray.IconCompatParcelizer iconCompatParcelizer) throws deserializeTypedFromArray.RemoteActionCompatParcelizer {
        if (iconCompatParcelizer.equals(deserializeTypedFromArray.IconCompatParcelizer.read)) {
            throw new deserializeTypedFromArray.RemoteActionCompatParcelizer(iconCompatParcelizer);
        }
        for (int i = 0; i < this.RemoteActionCompatParcelizer.size(); i++) {
            deserializeTypedFromArray deserializetypedfromarray = this.RemoteActionCompatParcelizer.get(i);
            deserializeTypedFromArray.IconCompatParcelizer iconCompatParcelizerRemoteActionCompatParcelizer = deserializetypedfromarray.RemoteActionCompatParcelizer(iconCompatParcelizer);
            if (deserializetypedfromarray.read()) {
                buildTypeSerializer.write(!iconCompatParcelizerRemoteActionCompatParcelizer.equals(deserializeTypedFromArray.IconCompatParcelizer.read));
                iconCompatParcelizer = iconCompatParcelizerRemoteActionCompatParcelizer;
            }
        }
        this.AudioAttributesImplBaseParcelizer = iconCompatParcelizer;
        return iconCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer() {
        this.read.clear();
        this.IconCompatParcelizer = this.AudioAttributesImplBaseParcelizer;
        this.write = false;
        for (int i = 0; i < this.RemoteActionCompatParcelizer.size(); i++) {
            deserializeTypedFromArray deserializetypedfromarray = this.RemoteActionCompatParcelizer.get(i);
            deserializetypedfromarray.AudioAttributesCompatParcelizer();
            if (deserializetypedfromarray.read()) {
                this.read.add(deserializetypedfromarray);
            }
        }
        this.AudioAttributesCompatParcelizer = new ByteBuffer[this.read.size()];
        for (int i2 = 0; i2 <= MediaBrowserCompatItemReceiver(); i2++) {
            this.AudioAttributesCompatParcelizer[i2] = this.read.get(i2).IconCompatParcelizer();
        }
    }

    public final boolean write() {
        return !this.read.isEmpty();
    }

    public final void RemoteActionCompatParcelizer(ByteBuffer byteBuffer) {
        if (!write() || this.write) {
            return;
        }
        write(byteBuffer);
    }

    public final ByteBuffer read() {
        if (!write()) {
            return deserializeTypedFromArray.AudioAttributesCompatParcelizer;
        }
        ByteBuffer byteBuffer = this.AudioAttributesCompatParcelizer[MediaBrowserCompatItemReceiver()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        write(deserializeTypedFromArray.AudioAttributesCompatParcelizer);
        return this.AudioAttributesCompatParcelizer[MediaBrowserCompatItemReceiver()];
    }

    public final void IconCompatParcelizer() {
        if (!write() || this.write) {
            return;
        }
        this.write = true;
        this.read.get(0).write();
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.write && this.read.get(MediaBrowserCompatItemReceiver()).RemoteActionCompatParcelizer() && !this.AudioAttributesCompatParcelizer[MediaBrowserCompatItemReceiver()].hasRemaining();
    }

    public final void MediaBrowserCompatCustomActionResultReceiver() {
        for (int i = 0; i < this.RemoteActionCompatParcelizer.size(); i++) {
            deserializeTypedFromArray deserializetypedfromarray = this.RemoteActionCompatParcelizer.get(i);
            deserializetypedfromarray.AudioAttributesCompatParcelizer();
            deserializetypedfromarray.AudioAttributesImplApi26Parcelizer();
        }
        this.AudioAttributesCompatParcelizer = new ByteBuffer[0];
        this.IconCompatParcelizer = deserializeTypedFromArray.IconCompatParcelizer.read;
        this.AudioAttributesImplBaseParcelizer = deserializeTypedFromArray.IconCompatParcelizer.read;
        this.write = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof deserializeTypedFromScalar)) {
            return false;
        }
        deserializeTypedFromScalar deserializetypedfromscalar = (deserializeTypedFromScalar) obj;
        if (this.RemoteActionCompatParcelizer.size() != deserializetypedfromscalar.RemoteActionCompatParcelizer.size()) {
            return false;
        }
        for (int i = 0; i < this.RemoteActionCompatParcelizer.size(); i++) {
            if (this.RemoteActionCompatParcelizer.get(i) != deserializetypedfromscalar.RemoteActionCompatParcelizer.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    private void write(ByteBuffer byteBuffer) {
        boolean z;
        ByteBuffer byteBuffer2;
        do {
            z = false;
            for (int i = 0; i <= MediaBrowserCompatItemReceiver(); i++) {
                if (!this.AudioAttributesCompatParcelizer[i].hasRemaining()) {
                    deserializeTypedFromArray deserializetypedfromarray = this.read.get(i);
                    if (deserializetypedfromarray.RemoteActionCompatParcelizer()) {
                        if (!this.AudioAttributesCompatParcelizer[i].hasRemaining() && i < MediaBrowserCompatItemReceiver()) {
                            this.read.get(i + 1).write();
                        }
                    } else {
                        if (i > 0) {
                            byteBuffer2 = this.AudioAttributesCompatParcelizer[i - 1];
                        } else {
                            byteBuffer2 = byteBuffer.hasRemaining() ? byteBuffer : deserializeTypedFromArray.AudioAttributesCompatParcelizer;
                        }
                        long jRemaining = byteBuffer2.remaining();
                        deserializetypedfromarray.read(byteBuffer2);
                        this.AudioAttributesCompatParcelizer[i] = deserializetypedfromarray.IconCompatParcelizer();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.AudioAttributesCompatParcelizer[i].hasRemaining();
                    }
                }
            }
        } while (z);
    }

    private int MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesCompatParcelizer.length - 1;
    }
}
