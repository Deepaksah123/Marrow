package kotlin;

/* JADX INFO: loaded from: classes2.dex */
final class setReference extends _getCalendar {
    private final withTimeZone write;

    public setReference(String str, withTimeZone withtimezone) {
        super(str);
        this.write = withtimezone;
    }

    @Override // kotlin._getCalendar
    public final isLenient read(byte[] bArr, int i, boolean z) {
        if (z) {
            this.write.RemoteActionCompatParcelizer();
        }
        return this.write.AudioAttributesCompatParcelizer(bArr, 0, i);
    }
}
