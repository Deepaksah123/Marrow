package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class ThemeStateCompanionWhenMappings<T> {
    public final setAddressLine2 IconCompatParcelizer;
    public final CurrentQuery RemoteActionCompatParcelizer;
    public final int read;
    public final NewNumberOtpResendRequest<T> write;

    /* JADX WARN: Multi-variable type inference failed */
    public ThemeStateCompanionWhenMappings(NewNumberOtpResendRequest<? extends T> newNumberOtpResendRequest, int i, setAddressLine2 setaddressline2, CurrentQuery currentQuery) {
        this.write = newNumberOtpResendRequest;
        this.read = i;
        this.IconCompatParcelizer = setaddressline2;
        this.RemoteActionCompatParcelizer = currentQuery;
    }
}
