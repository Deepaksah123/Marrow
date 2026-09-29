package kotlin;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class getTopicStat<T> {
    private final T body;
    private final ActivityAdapterModule errorBody;
    private final C0156TypeKt rawResponse;

    public static <T> getTopicStat<T> write(T t, C0156TypeKt c0156TypeKt) {
        Objects.requireNonNull(c0156TypeKt, "rawResponse == null");
        if (!c0156TypeKt.AudioAttributesImplApi21Parcelizer()) {
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        return new getTopicStat<>(c0156TypeKt, t, null);
    }

    public static <T> getTopicStat<T> write(ActivityAdapterModule activityAdapterModule, C0156TypeKt c0156TypeKt) {
        Objects.requireNonNull(activityAdapterModule, "body == null");
        Objects.requireNonNull(c0156TypeKt, "rawResponse == null");
        if (c0156TypeKt.AudioAttributesImplApi21Parcelizer()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new getTopicStat<>(c0156TypeKt, null, activityAdapterModule);
    }

    private getTopicStat(C0156TypeKt c0156TypeKt, T t, ActivityAdapterModule activityAdapterModule) {
        this.rawResponse = c0156TypeKt;
        this.body = t;
        this.errorBody = activityAdapterModule;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.rawResponse.getCode();
    }

    public final String IconCompatParcelizer() {
        return this.rawResponse.getMessage();
    }

    public final boolean read() {
        return this.rawResponse.AudioAttributesImplApi21Parcelizer();
    }

    public final T AudioAttributesCompatParcelizer() {
        return this.body;
    }

    public final String toString() {
        return this.rawResponse.toString();
    }
}
