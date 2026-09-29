package kotlin;

import kotlin.Metadata;
import kotlin.onForceLoad;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014"}, d2 = {"Lo/replaceMediaItems;", "Lo/MdtaMetadataEntry;", "Lo/newEncryptedObject;", "p0", "Lo/registerListener;", "p1", "<init>", "(Lo/newEncryptedObject;Lo/registerListener;)V", "", "", "read", "(Ljava/lang/Object;)I", "RemoteActionCompatParcelizer", "(I)Ljava/lang/Object;", "Lo/setSupportBackgroundTintMode;", "Lo/setSupportBackgroundTintMode;", "IconCompatParcelizer", "", "AudioAttributesCompatParcelizer", "[Ljava/lang/Object;", "I", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class replaceMediaItems implements MdtaMetadataEntry {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final Object[] read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setSupportBackgroundTintMode<Object> IconCompatParcelizer;

    public replaceMediaItems(newEncryptedObject newencryptedobject, registerListener<?> registerlistener) {
        onForceLoad<Interval> onforceloadAudioAttributesCompatParcelizer = registerlistener.AudioAttributesCompatParcelizer();
        final int read = newencryptedobject.getRead();
        if (read < 0) {
            getRootStableInsets.AudioAttributesCompatParcelizer("negative nearestRange.first");
        }
        final int iMin = Math.min(newencryptedobject.getAudioAttributesCompatParcelizer(), onforceloadAudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer() - 1);
        if (iMin < read) {
            this.IconCompatParcelizer = setSupportCompoundDrawablesTintList.read();
            this.read = new Object[0];
            this.write = 0;
        } else {
            int i = (iMin - read) + 1;
            this.read = new Object[i];
            this.write = read;
            final AlertDialogLayout alertDialogLayout = new AlertDialogLayout(i);
            onforceloadAudioAttributesCompatParcelizer.write(read, iMin, new getAnswerMap() { // from class: o.setCameraMotionListener
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return replaceMediaItems.write(read, iMin, alertDialogLayout, this, (onForceLoad.write) obj);
                }
            });
            this.IconCompatParcelizer = alertDialogLayout;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046 A[LOOP:0: B:4:0x0023->B:10:0x0046, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[EDGE_INSN: B:13:0x0049->B:11:0x0049 BREAK  A[LOOP:0: B:4:0x0023->B:10:0x0046], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static final kotlin.getShowPopup write(int r4, int r5, kotlin.AlertDialogLayout r6, kotlin.replaceMediaItems r7, o.onForceLoad.write r8) {
        /*
            java.lang.Object r0 = r8.RemoteActionCompatParcelizer()
            o.registerListener$AudioAttributesCompatParcelizer r0 = (o.registerListener.AudioAttributesCompatParcelizer) r0
            o.getAnswerMap r0 = r0.IconCompatParcelizer()
            int r1 = r8.getIconCompatParcelizer()
            int r4 = java.lang.Math.max(r4, r1)
            int r1 = r8.getIconCompatParcelizer()
            int r2 = r8.getAudioAttributesCompatParcelizer()
            int r1 = r1 + r2
            int r1 = r1 + (-1)
            int r5 = java.lang.Math.min(r5, r1)
            if (r4 > r5) goto L49
        L23:
            if (r0 == 0) goto L35
            int r1 = r8.getIconCompatParcelizer()
            int r1 = r4 - r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r0.invoke(r1)
            if (r1 != 0) goto L39
        L35:
            java.lang.Object r1 = kotlin.prepare.AudioAttributesCompatParcelizer(r4)
        L39:
            r6.RemoteActionCompatParcelizer(r1, r4)
            java.lang.Object[] r2 = r7.read
            int r3 = r7.write
            int r3 = r4 - r3
            r2[r3] = r1
            if (r4 == r5) goto L49
            int r4 = r4 + 1
            goto L23
        L49:
            o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.replaceMediaItems.write(int, int, o.AlertDialogLayout, o.replaceMediaItems, o.onForceLoad$write):o.getShowPopup");
    }

    @Override // kotlin.MdtaMetadataEntry
    public final int read(Object p0) {
        setSupportBackgroundTintMode<Object> setsupportbackgroundtintmode = this.IconCompatParcelizer;
        int iRemoteActionCompatParcelizer = setsupportbackgroundtintmode.RemoteActionCompatParcelizer(p0);
        if (iRemoteActionCompatParcelizer >= 0) {
            return setsupportbackgroundtintmode.AudioAttributesImplBaseParcelizer[iRemoteActionCompatParcelizer];
        }
        return -1;
    }

    @Override // kotlin.MdtaMetadataEntry
    public final Object RemoteActionCompatParcelizer(int p0) {
        Object[] objArr = this.read;
        int i = p0 - this.write;
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }
}
