package kotlin;

import android.util.SparseArray;
import kotlin.getProvisionRequest;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ErrorStateDrmSession {

    public static abstract class read {
        public abstract read read(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer);

        public abstract read write(RemoteActionCompatParcelizer remoteActionCompatParcelizer);

        public abstract ErrorStateDrmSession write();
    }

    public abstract RemoteActionCompatParcelizer AudioAttributesCompatParcelizer();

    public abstract AudioAttributesCompatParcelizer write();

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r15v0 o.ErrorStateDrmSession$AudioAttributesCompatParcelizer, still in use, count: 1, list:
      (r15v0 o.ErrorStateDrmSession$AudioAttributesCompatParcelizer) from 0x0122: INVOKE 
      (r0v17 android.util.SparseArray<o.ErrorStateDrmSession$AudioAttributesCompatParcelizer>)
      (0 int)
      (r15v0 o.ErrorStateDrmSession$AudioAttributesCompatParcelizer)
     VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:52)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class AudioAttributesCompatParcelizer {
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE(0),
        /* JADX INFO: Fake field, exist only in values array */
        WIFI(1),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_MMS(2),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_SUPL(3),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_DUN(4),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_HIPRI(5),
        /* JADX INFO: Fake field, exist only in values array */
        WIMAX(6),
        /* JADX INFO: Fake field, exist only in values array */
        PROXY(7),
        /* JADX INFO: Fake field, exist only in values array */
        VPN(8),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_EMERGENCY(9),
        /* JADX INFO: Fake field, exist only in values array */
        PROXY(10),
        /* JADX INFO: Fake field, exist only in values array */
        VPN(11),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_EMERGENCY(12),
        /* JADX INFO: Fake field, exist only in values array */
        PROXY(13),
        /* JADX INFO: Fake field, exist only in values array */
        VPN(14),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_EMERGENCY(15),
        /* JADX INFO: Fake field, exist only in values array */
        PROXY(16),
        /* JADX INFO: Fake field, exist only in values array */
        VPN(17),
        NONE(-1);

        private static final SparseArray<AudioAttributesCompatParcelizer> AudioAttributesCompatParcelizer;
        private final int RemoteActionCompatParcelizer;

        public static AudioAttributesCompatParcelizer valueOf(String str) {
            return (AudioAttributesCompatParcelizer) Enum.valueOf(AudioAttributesCompatParcelizer.class, str);
        }

        public static AudioAttributesCompatParcelizer[] values() {
            return (AudioAttributesCompatParcelizer[]) IconCompatParcelizer.clone();
        }

        static {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = NONE;
            SparseArray<AudioAttributesCompatParcelizer> sparseArray = new SparseArray<>();
            AudioAttributesCompatParcelizer = sparseArray;
            sparseArray.put(0, audioAttributesCompatParcelizer);
            sparseArray.put(1, audioAttributesCompatParcelizer);
            sparseArray.put(2, audioAttributesCompatParcelizer);
            sparseArray.put(3, audioAttributesCompatParcelizer);
            sparseArray.put(4, audioAttributesCompatParcelizer);
            sparseArray.put(5, audioAttributesCompatParcelizer);
            sparseArray.put(6, audioAttributesCompatParcelizer);
            sparseArray.put(7, audioAttributesCompatParcelizer);
            sparseArray.put(8, audioAttributesCompatParcelizer);
            sparseArray.put(9, audioAttributesCompatParcelizer);
            sparseArray.put(10, audioAttributesCompatParcelizer);
            sparseArray.put(11, audioAttributesCompatParcelizer);
            sparseArray.put(12, audioAttributesCompatParcelizer);
            sparseArray.put(13, audioAttributesCompatParcelizer);
            sparseArray.put(14, audioAttributesCompatParcelizer);
            sparseArray.put(15, audioAttributesCompatParcelizer);
            sparseArray.put(16, audioAttributesCompatParcelizer);
            sparseArray.put(17, audioAttributesCompatParcelizer);
            sparseArray.put(-1, audioAttributesCompatParcelizer);
        }

        private AudioAttributesCompatParcelizer(int i) {
            this.RemoteActionCompatParcelizer = i;
        }

        public final int write() {
            return this.RemoteActionCompatParcelizer;
        }

        public static AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i) {
            return AudioAttributesCompatParcelizer.get(i);
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v0 o.ErrorStateDrmSession$RemoteActionCompatParcelizer, still in use, count: 1, list:
      (r13v0 o.ErrorStateDrmSession$RemoteActionCompatParcelizer) from 0x0147: INVOKE 
      (r0v19 android.util.SparseArray<o.ErrorStateDrmSession$RemoteActionCompatParcelizer>)
      (1 int)
      (r13v0 o.ErrorStateDrmSession$RemoteActionCompatParcelizer)
     VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:120)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class RemoteActionCompatParcelizer {
        UNKNOWN_MOBILE_SUBTYPE(0),
        /* JADX INFO: Fake field, exist only in values array */
        GPRS(1),
        /* JADX INFO: Fake field, exist only in values array */
        EDGE(2),
        /* JADX INFO: Fake field, exist only in values array */
        UMTS(3),
        /* JADX INFO: Fake field, exist only in values array */
        CDMA(4),
        /* JADX INFO: Fake field, exist only in values array */
        EVDO_0(5),
        /* JADX INFO: Fake field, exist only in values array */
        EVDO_A(6),
        /* JADX INFO: Fake field, exist only in values array */
        LTE_CA(7),
        /* JADX INFO: Fake field, exist only in values array */
        TD_SCDMA(8),
        /* JADX INFO: Fake field, exist only in values array */
        IWLAN(9),
        /* JADX INFO: Fake field, exist only in values array */
        LTE_CA(10),
        /* JADX INFO: Fake field, exist only in values array */
        TD_SCDMA(11),
        /* JADX INFO: Fake field, exist only in values array */
        IWLAN(12),
        /* JADX INFO: Fake field, exist only in values array */
        LTE_CA(13),
        /* JADX INFO: Fake field, exist only in values array */
        TD_SCDMA(14),
        /* JADX INFO: Fake field, exist only in values array */
        IWLAN(15),
        /* JADX INFO: Fake field, exist only in values array */
        LTE_CA(16),
        /* JADX INFO: Fake field, exist only in values array */
        TD_SCDMA(17),
        /* JADX INFO: Fake field, exist only in values array */
        IWLAN(18),
        /* JADX INFO: Fake field, exist only in values array */
        LTE_CA(19),
        COMBINED(100);

        private static final SparseArray<RemoteActionCompatParcelizer> RemoteActionCompatParcelizer;
        private final int write;

        public static RemoteActionCompatParcelizer valueOf(String str) {
            return (RemoteActionCompatParcelizer) Enum.valueOf(RemoteActionCompatParcelizer.class, str);
        }

        public static RemoteActionCompatParcelizer[] values() {
            return (RemoteActionCompatParcelizer[]) read.clone();
        }

        static {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = UNKNOWN_MOBILE_SUBTYPE;
            SparseArray<RemoteActionCompatParcelizer> sparseArray = new SparseArray<>();
            RemoteActionCompatParcelizer = sparseArray;
            sparseArray.put(0, remoteActionCompatParcelizer);
            sparseArray.put(1, remoteActionCompatParcelizer);
            sparseArray.put(2, remoteActionCompatParcelizer);
            sparseArray.put(3, remoteActionCompatParcelizer);
            sparseArray.put(4, remoteActionCompatParcelizer);
            sparseArray.put(5, remoteActionCompatParcelizer);
            sparseArray.put(6, remoteActionCompatParcelizer);
            sparseArray.put(7, remoteActionCompatParcelizer);
            sparseArray.put(8, remoteActionCompatParcelizer);
            sparseArray.put(9, remoteActionCompatParcelizer);
            sparseArray.put(10, remoteActionCompatParcelizer);
            sparseArray.put(11, remoteActionCompatParcelizer);
            sparseArray.put(12, remoteActionCompatParcelizer);
            sparseArray.put(13, remoteActionCompatParcelizer);
            sparseArray.put(14, remoteActionCompatParcelizer);
            sparseArray.put(15, remoteActionCompatParcelizer);
            sparseArray.put(16, remoteActionCompatParcelizer);
            sparseArray.put(17, remoteActionCompatParcelizer);
            sparseArray.put(18, remoteActionCompatParcelizer);
            sparseArray.put(19, remoteActionCompatParcelizer);
        }

        private RemoteActionCompatParcelizer(int i) {
            this.write = i;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.write;
        }

        public static RemoteActionCompatParcelizer IconCompatParcelizer(int i) {
            return RemoteActionCompatParcelizer.get(i);
        }
    }

    public static read IconCompatParcelizer() {
        return new getProvisionRequest.AudioAttributesCompatParcelizer();
    }
}
