package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0090\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\n\u001a\u00020\t2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0090\u0002¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/withArray;", "Lo/JsonSerializableBase;", "<init>", "()V", "T", "Lo/JsonSerializable;", "p0", "RemoteActionCompatParcelizer", "(Lo/JsonSerializable;)Ljava/lang/Object;", "", "write", "(Lo/JsonSerializable;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class withArray extends JsonSerializableBase {
    public static final withArray INSTANCE = new withArray();

    @Override // kotlin.JsonSerializableBase
    public final boolean write(JsonSerializable<?> p0) {
        return false;
    }

    private withArray() {
        super(null);
    }

    @Override // kotlin.JsonSerializableBase
    public final <T> T RemoteActionCompatParcelizer(JsonSerializable<T> p0) {
        throw new IllegalStateException("".toString());
    }
}
