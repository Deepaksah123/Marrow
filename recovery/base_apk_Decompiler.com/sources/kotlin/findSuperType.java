package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0010R\u0011\u0010\f\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lo/findSuperType;", "Lo/isTypeOrSuperTypeOf;", "Lo/hasHandlers;", "p0", "Lo/hasGenericTypes;", "p1", "Lo/getTypeHandler;", "p2", "<init>", "(Lo/hasHandlers;Lo/hasGenericTypes;Lo/getTypeHandler;)V", "Lo/PropertyValueAny;", "Lo/_parser;", "write", "(J)Lo/_parser;", "", "AudioAttributesCompatParcelizer", "(I)I", "read", "IconCompatParcelizer", "Lo/hasHandlers;", "Lo/hasGenericTypes;", "Lo/getTypeHandler;", "", "q_", "()Ljava/lang/Object;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class findSuperType implements isTypeOrSuperTypeOf {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getTypeHandler AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final hasGenericTypes IconCompatParcelizer;
    private final hasHandlers write;

    public findSuperType(hasHandlers hashandlers, hasGenericTypes hasgenerictypes, getTypeHandler gettypehandler) {
        this.write = hashandlers;
        this.IconCompatParcelizer = hasgenerictypes;
        this.AudioAttributesCompatParcelizer = gettypehandler;
    }

    @Override // kotlin.hasHandlers
    public final Object q_() {
        return this.write.q_();
    }

    @Override // kotlin.isTypeOrSuperTypeOf
    public final _parser write(long p0) {
        int iIconCompatParcelizer;
        int iAudioAttributesCompatParcelizer;
        if (this.AudioAttributesCompatParcelizer == getTypeHandler.read) {
            if (this.IconCompatParcelizer == hasGenericTypes.RemoteActionCompatParcelizer) {
                iAudioAttributesCompatParcelizer = this.write.write(PropertyValueAny.AudioAttributesImplApi21Parcelizer(p0));
            } else {
                iAudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer(PropertyValueAny.AudioAttributesImplApi21Parcelizer(p0));
            }
            return new containedTypeOrUnknown(iAudioAttributesCompatParcelizer, PropertyValueAny.AudioAttributesCompatParcelizer(p0) ? PropertyValueAny.AudioAttributesImplApi21Parcelizer(p0) : 32767);
        }
        if (this.IconCompatParcelizer == hasGenericTypes.RemoteActionCompatParcelizer) {
            iIconCompatParcelizer = this.write.IconCompatParcelizer(PropertyValueAny.AudioAttributesImplBaseParcelizer(p0));
        } else {
            iIconCompatParcelizer = this.write.read(PropertyValueAny.AudioAttributesImplBaseParcelizer(p0));
        }
        return new containedTypeOrUnknown(PropertyValueAny.RemoteActionCompatParcelizer(p0) ? PropertyValueAny.AudioAttributesImplBaseParcelizer(p0) : 32767, iIconCompatParcelizer);
    }

    @Override // kotlin.hasHandlers
    public final int AudioAttributesCompatParcelizer(int p0) {
        return this.write.AudioAttributesCompatParcelizer(p0);
    }

    @Override // kotlin.hasHandlers
    public final int write(int p0) {
        return this.write.write(p0);
    }

    @Override // kotlin.hasHandlers
    public final int read(int p0) {
        return this.write.read(p0);
    }

    @Override // kotlin.hasHandlers
    public final int IconCompatParcelizer(int p0) {
        return this.write.IconCompatParcelizer(p0);
    }
}
