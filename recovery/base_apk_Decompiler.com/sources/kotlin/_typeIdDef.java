package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class _typeIdDef implements visitStringFormat {
    private final int IconCompatParcelizer;
    private int RemoteActionCompatParcelizer = -1;
    private final BeanSerializerBase1 read;

    public _typeIdDef(BeanSerializerBase1 beanSerializerBase1, int i) {
        this.read = beanSerializerBase1;
        this.IconCompatParcelizer = i;
    }

    public final void read() {
        buildTypeSerializer.IconCompatParcelizer(this.RemoteActionCompatParcelizer == -1);
        this.RemoteActionCompatParcelizer = this.read.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
    }

    public final void RemoteActionCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer != -1) {
            this.read.read(this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = -1;
        }
    }

    @Override // kotlin.visitStringFormat
    public final boolean F_() {
        if (this.RemoteActionCompatParcelizer != -3) {
            return write() && this.read.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
        return true;
    }

    @Override // kotlin.visitStringFormat
    public final void G_() throws IOException {
        int i = this.RemoteActionCompatParcelizer;
        if (i == -2) {
            throw new ByteBufferSerializer(this.read.MediaBrowserCompatItemReceiver().RemoteActionCompatParcelizer(this.IconCompatParcelizer).AudioAttributesCompatParcelizer(0).onPlayFromUri);
        }
        if (i == -1) {
            this.read.MediaBrowserCompatCustomActionResultReceiver();
        } else if (i != -3) {
            this.read.write(i);
        }
    }

    @Override // kotlin.visitStringFormat
    public final int AudioAttributesCompatParcelizer(ObjectNode objectNode, _find _findVar, int i) {
        if (this.RemoteActionCompatParcelizer == -3) {
            _findVar.IconCompatParcelizer(4);
            return -4;
        }
        if (write()) {
            return this.read.read(this.RemoteActionCompatParcelizer, objectNode, _findVar, i);
        }
        return -3;
    }

    @Override // kotlin.visitStringFormat
    public final int IconCompatParcelizer(long j) {
        if (write()) {
            return this.read.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, j);
        }
        return 0;
    }

    private boolean write() {
        int i = this.RemoteActionCompatParcelizer;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }
}
