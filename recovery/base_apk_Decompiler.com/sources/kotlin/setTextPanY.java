package kotlin;

import android.view.ViewConfiguration;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\tJ#\u0010\b\u001a\u00020\u000e*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\b\u0010\u000fR\u0011\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\b\u0010\u0010"}, d2 = {"Lo/setTextPanY;", "Lo/createAttributionContext;", "Landroid/view/ViewConfiguration;", "p0", "<init>", "(Landroid/view/ViewConfiguration;)V", "Lo/bufferMapProperty;", "", "write", "(Lo/bufferMapProperty;)F", "RemoteActionCompatParcelizer", "Lo/DeserializationContext;", "Lo/getKey;", "p1", "Lo/getReferencedType;", "(Lo/bufferMapProperty;Lo/DeserializationContext;J)J", "Landroid/view/ViewConfiguration;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setTextPanY implements createAttributionContext {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final ViewConfiguration IconCompatParcelizer;

    public setTextPanY(ViewConfiguration viewConfiguration) {
        this.IconCompatParcelizer = viewConfiguration;
    }

    public final float write(bufferMapProperty buffermapproperty) {
        return getBridge.INSTANCE.IconCompatParcelizer(this.IconCompatParcelizer);
    }

    public final float RemoteActionCompatParcelizer(bufferMapProperty buffermapproperty) {
        return getBridge.INSTANCE.read(this.IconCompatParcelizer);
    }

    @Override // kotlin.createAttributionContext
    public final long write(bufferMapProperty buffermapproperty, DeserializationContext deserializationContext, long j) {
        float f = -write(buffermapproperty);
        float f2 = -RemoteActionCompatParcelizer(buffermapproperty);
        List<getArrayBuilders> listAudioAttributesCompatParcelizer = deserializationContext.AudioAttributesCompatParcelizer();
        getReferencedType getreferencedtype = getReferencedType.read(getReferencedType.INSTANCE.write());
        int size = listAudioAttributesCompatParcelizer.size();
        for (int i = 0; i < size; i++) {
            getreferencedtype = getReferencedType.read(getReferencedType.RemoteActionCompatParcelizer(getreferencedtype.getWrite(), listAudioAttributesCompatParcelizer.get(i).getAudioAttributesImplApi21Parcelizer()));
        }
        long write = getreferencedtype.getWrite();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (write >> 32));
        long j2 = -1;
        return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) write) * f)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (Float.floatToRawIntBits(fIntBitsToFloat * f2) << 32));
    }
}
