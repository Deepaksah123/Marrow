package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u0004\u0018\u00010\u0004*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR*\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0017@QX\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\r\u0010\u0007"}, d2 = {"Lo/isContainerType;", "Lo/ObjectWriterPrefetch;", "Lo/isInterface;", "Lo/_handleOddName$IconCompatParcelizer;", "", "p0", "<init>", "(Ljava/lang/Object;)V", "Lo/bufferMapProperty;", "IconCompatParcelizer", "(Lo/bufferMapProperty;Ljava/lang/Object;)Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "Ljava/lang/Object;", "read", "()Ljava/lang/Object;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class isContainerType extends _handleOddName.IconCompatParcelizer implements ObjectWriterPrefetch, isInterface {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private Object RemoteActionCompatParcelizer;

    @Override // kotlin.ObjectWriterPrefetch
    public final Object IconCompatParcelizer(bufferMapProperty buffermapproperty, Object obj) {
        return this;
    }

    public isContainerType(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
    }

    @Override // kotlin.isInterface
    /* JADX INFO: renamed from: read, reason: from getter */
    public final Object getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void read(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
    }
}
