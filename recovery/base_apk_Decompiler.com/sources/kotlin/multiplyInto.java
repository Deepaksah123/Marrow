package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0003R\u0016\u0010\b\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\f\u0010\u0010"}, d2 = {"Lo/multiplyInto;", "Lo/timesTwoToThe;", "<init>", "()V", "", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "write", "read", "MediaBrowserCompatItemReceiver", "", "Z", "IconCompatParcelizer", "Lo/subtractInto;", "", "Lo/setKeyListener;", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class multiplyInto implements timesTwoToThe {
    public static final int RemoteActionCompatParcelizer = 8;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private boolean AudioAttributesCompatParcelizer;
    private boolean read = true;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final setKeyListener<Object, Object> IconCompatParcelizer = subtractInto.read(null, 1, null);

    public final boolean IconCompatParcelizer() {
        return this.read && !this.AudioAttributesCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer() {
        this.read = false;
        MediaBrowserCompatItemReceiver();
    }

    public final void AudioAttributesCompatParcelizer() {
        this.RemoteActionCompatParcelizer = true;
        RemoteActionCompatParcelizer();
    }

    public final void write() {
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        if (!this.AudioAttributesCompatParcelizer) {
            subtractTimesIInto.IconCompatParcelizer("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
        }
        if (!subtractInto.RemoteActionCompatParcelizer(this.IconCompatParcelizer)) {
            subtractTimesIInto.IconCompatParcelizer("Attempted to start retaining exited values with pending exited values");
        }
        this.AudioAttributesCompatParcelizer = false;
    }

    public final void read() {
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        if (this.AudioAttributesCompatParcelizer) {
            subtractTimesIInto.IconCompatParcelizer("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
        }
        MediaBrowserCompatItemReceiver();
        this.AudioAttributesCompatParcelizer = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void MediaBrowserCompatItemReceiver() {
        /*
            r15 = this;
            o.setKeyListener<java.lang.Object, java.lang.Object> r0 = r15.IconCompatParcelizer
            o.AppCompatButton r0 = (kotlin.AppCompatButton) r0
            java.lang.Object[] r1 = r0.MediaBrowserCompatItemReceiver
            long[] r0 = r0.RemoteActionCompatParcelizer
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L6f
            r3 = 0
            r4 = r3
        Lf:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L6a
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L29:
            if (r9 >= r7) goto L68
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L64
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            boolean r11 = r10 instanceof kotlin.setDropDownBackgroundResource
            if (r11 == 0) goto L5b
            java.lang.String r11 = ""
            kotlin.toMagicModuleMetaRepoModel.read(r10, r11)
            o.setDropDownBackgroundResource r10 = (kotlin.setDropDownBackgroundResource) r10
            o.setTextAppearance r10 = (kotlin.setTextAppearance) r10
            java.lang.Object[] r11 = r10.IconCompatParcelizer
            int r10 = r10.RemoteActionCompatParcelizer
            r12 = r3
        L4b:
            if (r12 >= r10) goto L64
            r13 = r11[r12]
            boolean r14 = r13 instanceof kotlin.multiplyPointwise
            if (r14 == 0) goto L58
            o.multiplyPointwise r13 = (kotlin.multiplyPointwise) r13
            r13.AudioAttributesCompatParcelizer()
        L58:
            int r12 = r12 + 1
            goto L4b
        L5b:
            boolean r11 = r10 instanceof kotlin.multiplyPointwise
            if (r11 == 0) goto L64
            o.multiplyPointwise r10 = (kotlin.multiplyPointwise) r10
            r10.AudioAttributesCompatParcelizer()
        L64:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L29
        L68:
            if (r7 != r8) goto L6f
        L6a:
            if (r4 == r2) goto L6f
            int r4 = r4 + 1
            goto Lf
        L6f:
            o.setKeyListener<java.lang.Object, java.lang.Object> r15 = r15.IconCompatParcelizer
            kotlin.subtractInto.read(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.multiplyInto.MediaBrowserCompatItemReceiver():void");
    }
}
