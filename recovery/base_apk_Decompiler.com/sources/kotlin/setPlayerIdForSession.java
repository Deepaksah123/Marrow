package kotlin;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v0 o.setPlayerIdForSession, still in use, count: 1, list:
  (r8v0 o.setPlayerIdForSession) from 0x0048: INVOKE (r0v8 android.util.SparseArray), (1 int), (r8v0 o.setPlayerIdForSession) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:34)
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
/* JADX INFO: loaded from: classes5.dex */
public final class setPlayerIdForSession {
    DEFAULT(0),
    /* JADX INFO: Fake field, exist only in values array */
    UNMETERED_ONLY(1),
    /* JADX INFO: Fake field, exist only in values array */
    UNMETERED_OR_DAILY(2),
    /* JADX INFO: Fake field, exist only in values array */
    FAST_IF_RADIO_AWAKE(3),
    /* JADX INFO: Fake field, exist only in values array */
    NEVER(4),
    /* JADX INFO: Fake field, exist only in values array */
    UNRECOGNIZED(-1);

    private final int write;

    public static setPlayerIdForSession valueOf(String str) {
        return (setPlayerIdForSession) Enum.valueOf(setPlayerIdForSession.class, str);
    }

    public static setPlayerIdForSession[] values() {
        return (setPlayerIdForSession[]) read.clone();
    }

    static {
        setPlayerIdForSession setplayeridforsession = DEFAULT;
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, setplayeridforsession);
        sparseArray.put(1, setplayeridforsession);
        sparseArray.put(2, setplayeridforsession);
        sparseArray.put(3, setplayeridforsession);
        sparseArray.put(4, setplayeridforsession);
        sparseArray.put(-1, setplayeridforsession);
    }

    private setPlayerIdForSession(int i) {
        this.write = i;
    }
}
