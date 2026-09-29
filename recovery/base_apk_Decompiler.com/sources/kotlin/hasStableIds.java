package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0012\u0010\u0011J\u0013\u0010\f\u001a\u00020\t*\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014R$\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\f\u0010\u0017\"\u0004\b\u0012\u0010\u0018R$\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\f\u0010\u0018"}, d2 = {"Lo/hasStableIds;", "", "Lo/deserializeFromNumber;", "p0", "Lo/isAbstract;", "p1", "p2", "<init>", "(Lo/deserializeFromNumber;Lo/isAbstract;Lo/isAbstract;)V", "Lo/getReferencedType;", "", "", "RemoteActionCompatParcelizer", "(JZ)I", "IconCompatParcelizer", "(J)Z", "write", "(J)J", "read", "Lo/deserializeFromNumber;", "()Lo/deserializeFromNumber;", "AudioAttributesCompatParcelizer", "Lo/isAbstract;", "()Lo/isAbstract;", "(Lo/isAbstract;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class hasStableIds {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private isAbstract read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private isAbstract write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final deserializeFromNumber AudioAttributesCompatParcelizer;

    public hasStableIds(deserializeFromNumber deserializefromnumber, isAbstract isabstract, isAbstract isabstract2) {
        this.AudioAttributesCompatParcelizer = deserializefromnumber;
        this.read = isabstract;
        this.write = isabstract2;
    }

    public /* synthetic */ hasStableIds(deserializeFromNumber deserializefromnumber, isAbstract isabstract, isAbstract isabstract2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(deserializefromnumber, (i & 2) != 0 ? null : isabstract, (i & 4) != 0 ? null : isabstract2);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final deserializeFromNumber getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final isAbstract getRead() {
        return this.read;
    }

    public final void read(isAbstract isabstract) {
        this.read = isabstract;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final isAbstract getWrite() {
        return this.write;
    }

    public final void RemoteActionCompatParcelizer(isAbstract isabstract) {
        this.write = isabstract;
    }

    public static /* synthetic */ int RemoteActionCompatParcelizer$default(hasStableIds hasstableids, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return hasstableids.RemoteActionCompatParcelizer(j, z);
    }

    public final int RemoteActionCompatParcelizer(long p0, boolean p1) {
        if (p1) {
            p0 = RemoteActionCompatParcelizer(p0);
        }
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(write(p0));
    }

    public final boolean IconCompatParcelizer(long p0) {
        long jWrite = write(RemoteActionCompatParcelizer(p0));
        long j = -1;
        int i = this.AudioAttributesCompatParcelizer.read(Float.intBitsToFloat((int) (((((long) 0) << 32) | (j - ((j >> 63) << 32))) & jWrite)));
        int i2 = (int) (jWrite >> 32);
        return Float.intBitsToFloat(i2) >= this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(i) && Float.intBitsToFloat(i2) <= this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver(i);
    }

    public final long write(long p0) {
        isAbstract isabstract;
        isAbstract isabstract2 = this.read;
        if (isabstract2 != null) {
            if (!isabstract2.MediaBrowserCompatItemReceiver()) {
                isabstract2 = null;
            }
            if (isabstract2 != null && (isabstract = this.write) != null) {
                isAbstract isabstract3 = isabstract.MediaBrowserCompatItemReceiver() ? isabstract : null;
                if (isabstract3 != null) {
                    return isabstract2.RemoteActionCompatParcelizer(isabstract3, p0);
                }
            }
        }
        return p0;
    }

    public final long read(long p0) {
        isAbstract isabstract;
        isAbstract isabstract2 = this.read;
        if (isabstract2 != null) {
            if (!isabstract2.MediaBrowserCompatItemReceiver()) {
                isabstract2 = null;
            }
            if (isabstract2 != null && (isabstract = this.write) != null) {
                isAbstract isabstract3 = isabstract.MediaBrowserCompatItemReceiver() ? isabstract : null;
                if (isabstract3 != null) {
                    return isabstract3.RemoteActionCompatParcelizer(isabstract2, p0);
                }
            }
        }
        return p0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long RemoteActionCompatParcelizer(long r5) {
        /*
            r4 = this;
            o.isAbstract r0 = r4.read
            if (r0 == 0) goto L1e
            boolean r1 = r0.MediaBrowserCompatItemReceiver()
            if (r1 == 0) goto L16
            o.isAbstract r4 = r4.write
            r1 = 0
            if (r4 == 0) goto L1c
            r2 = 0
            r3 = 2
            o.WritableTypeIdInclusion r1 = kotlin.isAbstract.write$default(r4, r0, r2, r3, r1)
            goto L1c
        L16:
            o.WritableTypeIdInclusion$RemoteActionCompatParcelizer r4 = kotlin.WritableTypeIdInclusion.INSTANCE
            o.WritableTypeIdInclusion r1 = r4.write()
        L1c:
            if (r1 != 0) goto L24
        L1e:
            o.WritableTypeIdInclusion$RemoteActionCompatParcelizer r4 = kotlin.WritableTypeIdInclusion.INSTANCE
            o.WritableTypeIdInclusion r1 = r4.write()
        L24:
            long r4 = kotlin.notifyDataSetChanged.IconCompatParcelizer(r5, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.hasStableIds.RemoteActionCompatParcelizer(long):long");
    }
}
