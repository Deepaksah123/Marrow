package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0090\u0002¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000b\u001a\u00020\n2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0090\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\r\"\u0004\b\u000b\u0010\u0005"}, d2 = {"Lo/longValue;", "Lo/JsonSerializableBase;", "Lo/isUnwrappingSerializer;", "p0", "<init>", "(Lo/isUnwrappingSerializer;)V", "T", "Lo/JsonSerializable;", "RemoteActionCompatParcelizer", "(Lo/JsonSerializable;)Ljava/lang/Object;", "", "write", "(Lo/JsonSerializable;)Z", "Lo/isUnwrappingSerializer;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class longValue extends JsonSerializableBase {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private isUnwrappingSerializer<?> read;

    public longValue(isUnwrappingSerializer<?> isunwrappingserializer) {
        super(null);
        this.read = isunwrappingserializer;
    }

    public final void write(isUnwrappingSerializer<?> isunwrappingserializer) {
        this.read = isunwrappingserializer;
    }

    @Override // kotlin.JsonSerializableBase
    public final <T> T RemoteActionCompatParcelizer(JsonSerializable<T> p0) {
        if (p0 != this.read.AudioAttributesCompatParcelizer()) {
            reportWrongTokenException.read("Check failed.");
        }
        return (T) this.read.IconCompatParcelizer();
    }

    @Override // kotlin.JsonSerializableBase
    public final boolean write(JsonSerializable<?> p0) {
        return p0 == this.read.AudioAttributesCompatParcelizer();
    }
}
