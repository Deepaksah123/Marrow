package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u0002*\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Lo/getParameter;", "", "Lo/assignParameter;", "Lo/ReadableObjectIdReferring;", "read", "(F)J", "e_", "(J)F", "", "AudioAttributesCompatParcelizer", "()F"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface getParameter {
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    float getRead();

    default long read(float f) {
        if (!UnwrappedPropertyHandler.INSTANCE.RemoteActionCompatParcelizer(getRead())) {
            return setResolver.RemoteActionCompatParcelizer(f / getRead());
        }
        TypeWrappedDeserializer typeWrappedDeserializerIconCompatParcelizer = UnwrappedPropertyHandler.INSTANCE.IconCompatParcelizer(getRead());
        return setResolver.RemoteActionCompatParcelizer(typeWrappedDeserializerIconCompatParcelizer != null ? typeWrappedDeserializerIconCompatParcelizer.AudioAttributesCompatParcelizer(f) : f / getRead());
    }

    default float e_(long j) {
        if (!processUnwrapped.read(ReadableObjectIdReferring.write(j), processUnwrapped.INSTANCE.read())) {
            readIdProperty.RemoteActionCompatParcelizer("Only Sp can convert to Px");
        }
        if (!UnwrappedPropertyHandler.INSTANCE.RemoteActionCompatParcelizer(getRead())) {
            return assignParameter.IconCompatParcelizer(ReadableObjectIdReferring.AudioAttributesCompatParcelizer(j) * getRead());
        }
        TypeWrappedDeserializer typeWrappedDeserializerIconCompatParcelizer = UnwrappedPropertyHandler.INSTANCE.IconCompatParcelizer(getRead());
        return typeWrappedDeserializerIconCompatParcelizer == null ? assignParameter.IconCompatParcelizer(ReadableObjectIdReferring.AudioAttributesCompatParcelizer(j) * getRead()) : assignParameter.IconCompatParcelizer(typeWrappedDeserializerIconCompatParcelizer.RemoteActionCompatParcelizer(ReadableObjectIdReferring.AudioAttributesCompatParcelizer(j)));
    }
}
