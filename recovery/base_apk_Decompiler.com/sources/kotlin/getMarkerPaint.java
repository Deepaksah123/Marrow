package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B1\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0002\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0016\u0010 \u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b \u0010\u001d"}, d2 = {"Lo/getMarkerPaint;", "", "<init>", "()V", "", "p0", "", "p1", "p2", "", "p3", "p4", "([BIIZ)V", "", "read", "AudioAttributesCompatParcelizer", "()Lo/getMarkerPaint;", "(Lo/getMarkerPaint;)Lo/getMarkerPaint;", "write", "IconCompatParcelizer", "(I)Lo/getMarkerPaint;", "(Lo/getMarkerPaint;I)V", "data", "[B", "limit", "I", "next", "Lo/getMarkerPaint;", "owner", "Z", "pos", "prev", "shared", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class getMarkerPaint {
    public static final int SHARE_MINIMUM = 1024;
    public static final int SIZE = 8192;
    public final byte[] data;
    public int limit;
    public getMarkerPaint next;
    public boolean owner;
    public int pos;
    public getMarkerPaint prev;
    public boolean shared;

    public getMarkerPaint() {
        this.data = new byte[8192];
        this.owner = true;
        this.shared = false;
    }

    public getMarkerPaint(byte[] bArr, int i, int i2, boolean z) {
        toMagicModuleMetaRepoModel.write(bArr, "");
        this.data = bArr;
        this.pos = i;
        this.limit = i2;
        this.shared = z;
        this.owner = false;
    }

    public final getMarkerPaint write() {
        this.shared = true;
        return new getMarkerPaint(this.data, this.pos, this.limit, true);
    }

    public final getMarkerPaint AudioAttributesCompatParcelizer() {
        getMarkerPaint getmarkerpaint = this.next;
        if (getmarkerpaint == this) {
            getmarkerpaint = null;
        }
        getMarkerPaint getmarkerpaint2 = this.prev;
        toMagicModuleMetaRepoModel.write(getmarkerpaint2);
        getmarkerpaint2.next = this.next;
        getMarkerPaint getmarkerpaint3 = this.next;
        toMagicModuleMetaRepoModel.write(getmarkerpaint3);
        getmarkerpaint3.prev = this.prev;
        this.next = null;
        this.prev = null;
        return getmarkerpaint;
    }

    public final getMarkerPaint read(getMarkerPaint p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.prev = this;
        p0.next = this.next;
        getMarkerPaint getmarkerpaint = this.next;
        toMagicModuleMetaRepoModel.write(getmarkerpaint);
        getmarkerpaint.prev = p0;
        this.next = p0;
        return p0;
    }

    public final getMarkerPaint IconCompatParcelizer(int p0) {
        getMarkerPaint getmarkerpaintAudioAttributesCompatParcelizer;
        if (p0 <= 0 || p0 > this.limit - this.pos) {
            throw new IllegalArgumentException("byteCount out of range".toString());
        }
        if (p0 >= 1024) {
            getmarkerpaintAudioAttributesCompatParcelizer = write();
        } else {
            getmarkerpaintAudioAttributesCompatParcelizer = setMarkerPaint.AudioAttributesCompatParcelizer();
            byte[] bArr = this.data;
            byte[] bArr2 = getmarkerpaintAudioAttributesCompatParcelizer.data;
            int i = this.pos;
            getOrderDetails.read(bArr, bArr2, 0, i, i + p0);
        }
        getmarkerpaintAudioAttributesCompatParcelizer.limit = getmarkerpaintAudioAttributesCompatParcelizer.pos + p0;
        this.pos += p0;
        getMarkerPaint getmarkerpaint = this.prev;
        toMagicModuleMetaRepoModel.write(getmarkerpaint);
        getmarkerpaint.read(getmarkerpaintAudioAttributesCompatParcelizer);
        return getmarkerpaintAudioAttributesCompatParcelizer;
    }

    public final void read() {
        int i;
        getMarkerPaint getmarkerpaint = this.prev;
        if (getmarkerpaint == this) {
            throw new IllegalStateException("cannot compact".toString());
        }
        toMagicModuleMetaRepoModel.write(getmarkerpaint);
        if (getmarkerpaint.owner) {
            int i2 = this.limit - this.pos;
            getMarkerPaint getmarkerpaint2 = this.prev;
            toMagicModuleMetaRepoModel.write(getmarkerpaint2);
            int i3 = getmarkerpaint2.limit;
            getMarkerPaint getmarkerpaint3 = this.prev;
            toMagicModuleMetaRepoModel.write(getmarkerpaint3);
            if (getmarkerpaint3.shared) {
                i = 0;
            } else {
                getMarkerPaint getmarkerpaint4 = this.prev;
                toMagicModuleMetaRepoModel.write(getmarkerpaint4);
                i = getmarkerpaint4.pos;
            }
            if (i2 > (8192 - i3) + i) {
                return;
            }
            getMarkerPaint getmarkerpaint5 = this.prev;
            toMagicModuleMetaRepoModel.write(getmarkerpaint5);
            write(getmarkerpaint5, i2);
            AudioAttributesCompatParcelizer();
            setMarkerPaint.RemoteActionCompatParcelizer(this);
        }
    }

    public final void write(getMarkerPaint p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (!p0.owner) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i = p0.limit;
        int i2 = i + p1;
        if (i2 > 8192) {
            if (p0.shared) {
                throw new IllegalArgumentException();
            }
            int i3 = p0.pos;
            if (i2 - i3 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = p0.data;
            getOrderDetails.read(bArr, bArr, 0, i3, i);
            p0.limit -= p0.pos;
            p0.pos = 0;
        }
        byte[] bArr2 = this.data;
        byte[] bArr3 = p0.data;
        int i4 = p0.limit;
        int i5 = this.pos;
        getOrderDetails.read(bArr2, bArr3, i4, i5, i5 + p1);
        p0.limit += p1;
        this.pos += p1;
    }
}
