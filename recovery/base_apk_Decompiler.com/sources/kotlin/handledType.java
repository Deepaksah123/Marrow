package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013"}, d2 = {"Lo/handledType;", "Lo/writerFor;", "Lo/JsonDeserializerNone;", "Lkotlin/Function1;", "Lo/getKey;", "", "p0", "<init>", "(Lo/getAnswerMap;)V", "read", "()Lo/JsonDeserializerNone;", "(Lo/JsonDeserializerNone;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lo/getAnswerMap;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class handledType extends writerFor<JsonDeserializerNone> {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getAnswerMap<getKey, getShowPopup> write;

    /* JADX WARN: Multi-variable type inference failed */
    public handledType(getAnswerMap<? super getKey, getShowPopup> getanswermap) {
        this.write = getanswermap;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final JsonDeserializerNone IconCompatParcelizer() {
        return new JsonDeserializerNone(this.write);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(JsonDeserializerNone p0) {
        p0.IconCompatParcelizer(this.write);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof handledType) && this.write == ((handledType) p0).write;
    }

    public final int hashCode() {
        return this.write.hashCode();
    }
}
