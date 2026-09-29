package kotlin;

/* JADX INFO: loaded from: classes2.dex */
final class _constructUsingMethod extends getGenericInterfaces {
    private final long AudioAttributesCompatParcelizer;

    public _constructUsingMethod(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, long j) {
        super(closeonfailandthrowasioe);
        buildTypeSerializer.IconCompatParcelizer(closeonfailandthrowasioe.IconCompatParcelizer() >= j);
        this.AudioAttributesCompatParcelizer = j;
    }

    @Override // kotlin.getGenericInterfaces, kotlin.closeOnFailAndThrowAsIOE
    public final long IconCompatParcelizer() {
        return super.IconCompatParcelizer() - this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.getGenericInterfaces, kotlin.closeOnFailAndThrowAsIOE
    public final long write() {
        return super.write() - this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.getGenericInterfaces, kotlin.closeOnFailAndThrowAsIOE
    public final long read() {
        return super.read() - this.AudioAttributesCompatParcelizer;
    }
}
