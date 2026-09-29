package kotlin;

import android.text.AndroidCharacter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.lang.reflect.Method;
import kotlin.getCurrentEventTimeUs;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class setSpecialty implements getCurrentEventTimeUs.IconCompatParcelizer {
    private static final byte[] $$a = {18, -127, -77, -105, 26, 12, -1, -43, 44, -2, 3, -15, 19, -36, 17, 17, -15, 2, 7, -3, 17, -21, 13};
    private static final int $$b = TsExtractor.TS_STREAM_TYPE_E_AC3;
    private /* synthetic */ setEductionDegrees$AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;
    private /* synthetic */ getCurrentEventTimeUs write;

    public /* synthetic */ setSpecialty(getCurrentEventTimeUs getcurrenteventtimeus, setEductionDegrees$AudioAttributesCompatParcelizer seteductiondegrees_audioattributescompatparcelizer) {
        this.write = getcurrenteventtimeus;
        this.AudioAttributesCompatParcelizer = seteductiondegrees_audioattributescompatparcelizer;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.setSpecialty.$$a
            int r6 = r6 * 2
            int r6 = r6 + 73
            int r7 = r7 * 2
            int r1 = 20 - r7
            int r8 = r8 + 4
            byte[] r1 = new byte[r1]
            int r7 = 19 - r7
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2e
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r8 = r8 + 1
            int r4 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2e:
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setSpecialty.a(byte, int, byte, java.lang.Object[]):void");
    }

    @Override // o.getCurrentEventTimeUs.IconCompatParcelizer
    public final void write(Object obj) throws Throwable {
        try {
            Object[] objArr = {this.write, this.AudioAttributesCompatParcelizer, (Throwable) obj};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-506445930);
            if (objRemoteActionCompatParcelizer == null) {
                char scrollDefaultDelay = (char) (63098 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                int mirror = AndroidCharacter.getMirror('0') + 24532;
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 20;
                byte b = $$a[6];
                byte b2 = (byte) (b + 1);
                Object[] objArr2 = new Object[1];
                a(b2, b2, b, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(scrollDefaultDelay, mirror, keyRepeatDelay, -1617298685, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63098 - KeyEvent.normalizeMetaState(0)), 24580 - View.resolveSize(0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 20), setEductionDegrees$AudioAttributesCompatParcelizer.class, Throwable.class});
            }
            ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
