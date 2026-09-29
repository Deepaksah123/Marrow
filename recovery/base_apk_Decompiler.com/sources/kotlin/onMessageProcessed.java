package kotlin;

/* JADX INFO: loaded from: classes3.dex */
final class onMessageProcessed implements DownloadManagerExternalSyntheticLambda1 {
    private static final onMessageProcessed read = new onMessageProcessed();

    private onMessageProcessed() {
    }

    public static onMessageProcessed RemoteActionCompatParcelizer() {
        return read;
    }

    @Override // kotlin.DownloadManagerExternalSyntheticLambda1
    public final boolean RemoteActionCompatParcelizer(Class<?> cls) {
        return updateWaitingForRequirements.class.isAssignableFrom(cls);
    }

    @Override // kotlin.DownloadManagerExternalSyntheticLambda1
    public final DownloadManager1 AudioAttributesCompatParcelizer(Class<?> cls) {
        if (!updateWaitingForRequirements.class.isAssignableFrom(cls)) {
            StringBuilder sb = new StringBuilder("Unsupported message type: ");
            sb.append(cls.getName());
            throw new IllegalArgumentException(sb.toString());
        }
        try {
            return (DownloadManager1) updateWaitingForRequirements.write(cls.asSubclass(updateWaitingForRequirements.class)).onPrepareFromSearch();
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("Unable to get message info for ");
            sb2.append(cls.getName());
            throw new RuntimeException(sb2.toString(), e);
        }
    }
}
