package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class getRedirectUrl<T> implements FrameworkMediaDrmExternalSyntheticLambda3<T> {
    private final T write;

    public static <T> FrameworkMediaDrmExternalSyntheticLambda3<T> RemoteActionCompatParcelizer(T t) {
        return new getRedirectUrl(executePost.IconCompatParcelizer(t, "instance cannot be null"));
    }

    static {
        new getRedirectUrl(null);
    }

    private getRedirectUrl(T t) {
        this.write = t;
    }

    @Override // kotlin.setDescriptionList
    public final T get() {
        return this.write;
    }
}
