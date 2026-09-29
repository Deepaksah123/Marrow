package kotlin;

/* JADX INFO: loaded from: classes3.dex */
final class onDownloadUpdate {
    private static final notifyWaitingForRequirementsChanged<?> AudioAttributesCompatParcelizer = new onInitialized();
    private static final notifyWaitingForRequirementsChanged<?> read = write();

    onDownloadUpdate() {
    }

    private static notifyWaitingForRequirementsChanged<?> write() {
        try {
            return (notifyWaitingForRequirementsChanged) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static notifyWaitingForRequirementsChanged<?> AudioAttributesCompatParcelizer() {
        return AudioAttributesCompatParcelizer;
    }

    static notifyWaitingForRequirementsChanged<?> IconCompatParcelizer() {
        notifyWaitingForRequirementsChanged<?> notifywaitingforrequirementschanged = read;
        if (notifywaitingforrequirementschanged != null) {
            return notifywaitingforrequirementschanged;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
