package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\tJ/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\b\u0010\u0011R\u0011\u0010\n\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lo/addProperty;", "", "Lo/addInjectables;", "p0", "<init>", "(Lo/addInjectables;)V", "", "", "write", "(I)F", "IconCompatParcelizer", "read", "RemoteActionCompatParcelizer", "", "p1", "p2", "p3", "(IZZZ)F", "Lo/addInjectables;", "I", "AudioAttributesCompatParcelizer", "F"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class addProperty {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private float write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private int AudioAttributesCompatParcelizer = -1;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final addInjectables IconCompatParcelizer;

    public addProperty(addInjectables addinjectables) {
        this.IconCompatParcelizer = addinjectables;
    }

    public final float write(int p0) {
        return write(p0, false, false, true);
    }

    public final float IconCompatParcelizer(int p0) {
        return write(p0, true, true, true);
    }

    public final float read(int p0) {
        return write(p0, false, false, false);
    }

    public final float RemoteActionCompatParcelizer(int p0) {
        return write(p0, true, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final float write(int r6, boolean r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L20
            o.addInjectables r2 = r5.IconCompatParcelizer
            android.text.Layout r2 = r2.getMediaBrowserCompatItemReceiver()
            int r2 = kotlin.addInjectable.write(r2, r6, r7)
            o.addInjectables r3 = r5.IconCompatParcelizer
            int r3 = r3.RatingCompat(r2)
            o.addInjectables r4 = r5.IconCompatParcelizer
            int r2 = r4.AudioAttributesImplBaseParcelizer(r2)
            if (r6 == r3) goto L1e
            if (r6 != r2) goto L20
        L1e:
            r2 = r1
            goto L21
        L20:
            r2 = r0
        L21:
            if (r9 == 0) goto L28
            if (r2 == 0) goto L26
            goto L2d
        L26:
            r0 = r1
            goto L2d
        L28:
            if (r2 == 0) goto L2c
            r0 = 2
            goto L2d
        L2c:
            r0 = 3
        L2d:
            int r1 = r6 << 2
            int r1 = r1 + r0
            int r0 = r5.AudioAttributesCompatParcelizer
            if (r0 != r1) goto L37
            float r5 = r5.write
            return r5
        L37:
            if (r9 == 0) goto L40
            o.addInjectables r9 = r5.IconCompatParcelizer
            float r6 = r9.read(r6, r7)
            goto L46
        L40:
            o.addInjectables r9 = r5.IconCompatParcelizer
            float r6 = r9.AudioAttributesCompatParcelizer(r6, r7)
        L46:
            if (r8 == 0) goto L4c
            r5.AudioAttributesCompatParcelizer = r1
            r5.write = r6
        L4c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.addProperty.write(int, boolean, boolean, boolean):float");
    }
}
