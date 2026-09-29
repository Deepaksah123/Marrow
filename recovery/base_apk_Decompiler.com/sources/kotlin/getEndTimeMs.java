package kotlin;

/* JADX INFO: loaded from: classes.dex */
public final class getEndTimeMs {
    public static RuntimeException read(Throwable th) {
        throw OrderDetails.RemoteActionCompatParcelizer(th);
    }

    public static void RemoteActionCompatParcelizer(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
