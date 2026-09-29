package kotlin;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 o.onTrackSelectionParametersChanged, still in use, count: 1, list:
  (r0v0 o.onTrackSelectionParametersChanged) from 0x001a: SPUT (r0v0 o.onTrackSelectionParametersChanged) (LINE:43) o.onTrackSelectionParametersChanged.AudioAttributesCompatParcelizer o.onTrackSelectionParametersChanged
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
/* JADX INFO: loaded from: classes2.dex */
public final class onTrackSelectionParametersChanged {
    PREFER_ARGB_8888,
    PREFER_RGB_565;

    public static final onTrackSelectionParametersChanged AudioAttributesCompatParcelizer = new onTrackSelectionParametersChanged();

    private onTrackSelectionParametersChanged() {
    }

    public static onTrackSelectionParametersChanged valueOf(String str) {
        return (onTrackSelectionParametersChanged) Enum.valueOf(onTrackSelectionParametersChanged.class, str);
    }

    public static onTrackSelectionParametersChanged[] values() {
        return (onTrackSelectionParametersChanged[]) write.clone();
    }

    static {
    }
}
