package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/JsonInclude;", "", "<init>", "()V", "Lo/switchToNext;", "p0", "", "p1", "write", "(JZ)J", "Lo/setCurrentValue;", "IconCompatParcelizer", "(JZ)Lo/setCurrentValue;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JsonInclude {
    public static final JsonInclude INSTANCE = new JsonInclude();

    private JsonInclude() {
    }

    public final long write(long p0, boolean p1) {
        return (p1 || ((double) RequestPayload.RemoteActionCompatParcelizer(p0)) >= 0.5d) ? p0 : switchToNext.INSTANCE.AudioAttributesImplApi26Parcelizer();
    }

    public final setCurrentValue IconCompatParcelizer(long p0, boolean p1) {
        if (p1) {
            return ((double) RequestPayload.RemoteActionCompatParcelizer(p0)) > 0.5d ? JsonIncludeValue.AudioAttributesCompatParcelizer : JsonIncludeValue.write;
        }
        return JsonIncludeValue.RemoteActionCompatParcelizer;
    }
}
