package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a3\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u0007\u001a\u0004\u0018\u00010\u000b*\u00020\t2\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\n2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0004\b\u0007\u0010\f"}, d2 = {"Lo/AlertDialogLayout;", "Lo/weirdNumberException;", "p0", "", "", "p1", "", "IconCompatParcelizer", "(Lo/AlertDialogLayout;Ljava/util/Map;)Z", "Lo/Module;", "Lo/_bind;", "Lo/_handleOddName$IconCompatParcelizer;", "(Lo/Module;II)Lo/_handleOddName$IconCompatParcelizer;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _bindAsTreeOrNull {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean IconCompatParcelizer(kotlin.AlertDialogLayout<kotlin.weirdNumberException> r14, java.util.Map<kotlin.weirdNumberException, java.lang.Integer> r15) {
        /*
            r0 = 0
            if (r14 != 0) goto L4
            return r0
        L4:
            int r1 = r14.getRead()
            int r2 = r15.size()
            if (r1 == r2) goto Lf
            return r0
        Lf:
            o.setSupportBackgroundTintMode r14 = (kotlin.setSupportBackgroundTintMode) r14
            java.lang.Object[] r1 = r14.AudioAttributesCompatParcelizer
            int[] r2 = r14.AudioAttributesImplBaseParcelizer
            long[] r14 = r14.RemoteActionCompatParcelizer
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L65
            r4 = r0
        L1d:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L60
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r0
        L37:
            if (r9 >= r7) goto L5e
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L5a
            int r10 = r4 << 3
            int r10 = r10 + r9
            r11 = r1[r10]
            r10 = r2[r10]
            o.weirdNumberException r11 = (kotlin.weirdNumberException) r11
            java.lang.Object r11 = r15.get(r11)
            java.lang.Integer r11 = (java.lang.Integer) r11
            if (r11 == 0) goto L59
            int r11 = r11.intValue()
            if (r11 == r10) goto L5a
        L59:
            return r0
        L5a:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L37
        L5e:
            if (r7 != r8) goto L65
        L60:
            if (r4 == r3) goto L65
            int r4 = r4 + 1
            goto L1d
        L65:
            r14 = 1
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._bindAsTreeOrNull.IconCompatParcelizer(o.AlertDialogLayout, java.util.Map):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _handleOddName.IconCompatParcelizer IconCompatParcelizer(Module module, int i, int i2) {
        _handleOddName.IconCompatParcelizer audioAttributesImplBaseParcelizer = module.getRead().getAudioAttributesImplBaseParcelizer();
        if (audioAttributesImplBaseParcelizer == null || (audioAttributesImplBaseParcelizer.getRemoteActionCompatParcelizer() & i) == 0) {
            return null;
        }
        while (audioAttributesImplBaseParcelizer != null) {
            int write = audioAttributesImplBaseParcelizer.getWrite();
            if ((write & i2) != 0) {
                return null;
            }
            if ((write & i) != 0) {
                return audioAttributesImplBaseParcelizer;
            }
            audioAttributesImplBaseParcelizer = audioAttributesImplBaseParcelizer.getAudioAttributesImplBaseParcelizer();
        }
        return null;
    }
}
