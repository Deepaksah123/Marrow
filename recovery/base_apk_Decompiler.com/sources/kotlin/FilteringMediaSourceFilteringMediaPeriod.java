package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public class FilteringMediaSourceFilteringMediaPeriod extends Exception {
    private final String IconCompatParcelizer;
    private final DefaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4 read;

    public FilteringMediaSourceFilteringMediaPeriod(DefaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4 defaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4) {
        this(defaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4, null);
    }

    public FilteringMediaSourceFilteringMediaPeriod(DefaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4 defaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4, String str) {
        if (defaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4 == null) {
            throw new NullPointerException("hCaptchaError is marked non-null but is null");
        }
        this.read = defaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4;
        this.IconCompatParcelizer = str;
    }

    private static boolean write(Object obj) {
        return obj instanceof FilteringMediaSourceFilteringMediaPeriod;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FilteringMediaSourceFilteringMediaPeriod)) {
            return false;
        }
        FilteringMediaSourceFilteringMediaPeriod filteringMediaSourceFilteringMediaPeriod = (FilteringMediaSourceFilteringMediaPeriod) obj;
        if (!write(this) || !super.equals(obj)) {
            return false;
        }
        DefaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4 defaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        DefaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4 defaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4AudioAttributesCompatParcelizer2 = filteringMediaSourceFilteringMediaPeriod.AudioAttributesCompatParcelizer();
        if (defaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4AudioAttributesCompatParcelizer != null ? !defaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4AudioAttributesCompatParcelizer.equals(defaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4AudioAttributesCompatParcelizer2) : defaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4AudioAttributesCompatParcelizer2 != null) {
            return false;
        }
        String message = getMessage();
        String message2 = filteringMediaSourceFilteringMediaPeriod.getMessage();
        return message != null ? message.equals(message2) : message2 == null;
    }

    public final DefaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4 AudioAttributesCompatParcelizer() {
        return this.read;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str = this.IconCompatParcelizer;
        return str == null ? this.read.read() : str;
    }

    public int hashCode() {
        int iHashCode = super.hashCode();
        DefaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4 defaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        int iHashCode2 = defaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4AudioAttributesCompatParcelizer == null ? 43 : defaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4AudioAttributesCompatParcelizer.hashCode();
        String message = getMessage();
        return (((iHashCode * 59) + iHashCode2) * 59) + (message != null ? message.hashCode() : 43);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder("HCaptchaException(hCaptchaError=");
        sb.append(AudioAttributesCompatParcelizer());
        sb.append(", message=");
        sb.append(getMessage());
        sb.append(")");
        return sb.toString();
    }
}
