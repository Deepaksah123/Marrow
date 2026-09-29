package kotlin;

import kotlin.Metadata;
import kotlin.isArray;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lo/JsonDeserializer;", "Lo/isArray;", "<init>", "()V", "Lo/isArray$read;", "p0", "", "write", "(Lo/isArray$read;)V", "", "p1", "", "read", "(Ljava/lang/Object;Ljava/lang/Object;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class JsonDeserializer implements isArray {
    public static final JsonDeserializer INSTANCE = new JsonDeserializer();

    @Override // kotlin.isArray
    public final boolean read(Object p0, Object p1) {
        return false;
    }

    private JsonDeserializer() {
    }

    @Override // kotlin.isArray
    public final void write(isArray.read p0) {
        p0.clear();
    }
}
