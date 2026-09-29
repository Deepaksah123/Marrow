package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/Transition;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "write", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Transition {
    private static final /* synthetic */ getMagicModuleSavedMcqCount AudioAttributesCompatParcelizer;
    private static final /* synthetic */ Transition[] IconCompatParcelizer;
    public static final Transition RemoteActionCompatParcelizer = new Transition("Uninitialized", 0);
    public static final Transition write = new Transition("Detached", 1);
    public static final Transition read = new Transition("Attached", 2);

    private Transition(String str, int i) {
    }

    static {
        Transition[] transitionArrWrite = write();
        IconCompatParcelizer = transitionArrWrite;
        AudioAttributesCompatParcelizer = getMagicModuleTimeline.IconCompatParcelizer(transitionArrWrite);
    }

    private static final /* synthetic */ Transition[] write() {
        return new Transition[]{RemoteActionCompatParcelizer, write, read};
    }

    public static Transition valueOf(String str) {
        return (Transition) Enum.valueOf(Transition.class, str);
    }

    public static Transition[] values() {
        return (Transition[]) IconCompatParcelizer.clone();
    }
}
