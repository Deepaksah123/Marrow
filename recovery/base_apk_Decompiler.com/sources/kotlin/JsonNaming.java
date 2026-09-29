package kotlin;

import android.view.View;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\r\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\r\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0014\u0010\n\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0014\u0010\u0010\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lo/JsonNaming;", "Lo/DatabindException;", "Landroid/view/View;", "p0", "", "p1", "<init>", "(Landroid/view/View;F)V", "Lo/getReferencedType;", "Lo/findCoercionAction;", "read", "(JI)J", "p2", "IconCompatParcelizer", "(JJI)J", "Lo/UnsupportedTypeDeserializer;", "write", "(JLo/SampleVideos;)Ljava/lang/Object;", "(JJLo/SampleVideos;)Ljava/lang/Object;", "", "RemoteActionCompatParcelizer", "()V", "Landroid/view/View;", "F", "Lo/rootObjectScope;", "Lo/rootObjectScope;", "", "AudioAttributesCompatParcelizer", "[I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JsonNaming implements DatabindException {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int[] write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final float IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final View RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final rootObjectScope read;

    public JsonNaming(View view, float f) {
        this.RemoteActionCompatParcelizer = view;
        this.IconCompatParcelizer = f;
        rootObjectScope rootobjectscope = new rootObjectScope(view);
        rootobjectscope.write(true);
        this.read = rootobjectscope;
        this.write = new int[2];
        InvalidTypeIdException.RemoteActionCompatParcelizer(view, true);
    }

    @Override // kotlin.DatabindException
    public final long read(long p0, int p1) {
        if (this.read.read(JsonPOJOBuilder.RemoteActionCompatParcelizer(p0), JsonPOJOBuilder.RemoteActionCompatParcelizer(p1))) {
            int[] iArr = this.write;
            getOrderDetails.RemoteActionCompatParcelizer(iArr, 0, 0, iArr.length);
            int iAudioAttributesCompatParcelizer = JsonPOJOBuilder.AudioAttributesCompatParcelizer(Float.intBitsToFloat((int) (p0 >> 32)));
            long j = -1;
            int iAudioAttributesCompatParcelizer2 = JsonPOJOBuilder.AudioAttributesCompatParcelizer(Float.intBitsToFloat((int) (((((long) 0) << 32) | (j - ((j >> 63) << 32))) & p0)));
            this.read.write(iAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer2, this.write, null, JsonPOJOBuilder.RemoteActionCompatParcelizer(p1));
            return JsonPOJOBuilder.read(iAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer2, this.write, p0);
        }
        return getReferencedType.INSTANCE.write();
    }

    @Override // kotlin.DatabindException
    public final long IconCompatParcelizer(long p0, long p1, int p2) {
        if (this.read.read(JsonPOJOBuilder.RemoteActionCompatParcelizer(p1), JsonPOJOBuilder.RemoteActionCompatParcelizer(p2))) {
            int[] iArr = this.write;
            getOrderDetails.RemoteActionCompatParcelizer(iArr, 0, 0, iArr.length);
            int iAudioAttributesCompatParcelizer = JsonPOJOBuilder.AudioAttributesCompatParcelizer(Float.intBitsToFloat((int) (p1 >> 32)));
            int iAudioAttributesCompatParcelizer2 = JsonPOJOBuilder.AudioAttributesCompatParcelizer(Float.intBitsToFloat((int) p1));
            this.read.IconCompatParcelizer(JsonPOJOBuilder.AudioAttributesCompatParcelizer(Float.intBitsToFloat((int) (p0 >> 32))), JsonPOJOBuilder.AudioAttributesCompatParcelizer(Float.intBitsToFloat((int) p0)), iAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer2, null, JsonPOJOBuilder.RemoteActionCompatParcelizer(p2), this.write);
            return JsonPOJOBuilder.read(iAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer2, this.write, p1);
        }
        return getReferencedType.INSTANCE.write();
    }

    @Override // kotlin.DatabindException
    public final Object write(long j, SampleVideos<? super UnsupportedTypeDeserializer> sampleVideos) {
        if (!this.read.RemoteActionCompatParcelizer(JsonPOJOBuilder.write(UnsupportedTypeDeserializer.read(j)), JsonPOJOBuilder.write(UnsupportedTypeDeserializer.AudioAttributesCompatParcelizer(j))) && !this.read.AudioAttributesCompatParcelizer(JsonPOJOBuilder.write(UnsupportedTypeDeserializer.read(j)), JsonPOJOBuilder.write(UnsupportedTypeDeserializer.AudioAttributesCompatParcelizer(j)), true)) {
            j = UnsupportedTypeDeserializer.INSTANCE.write();
        }
        return UnsupportedTypeDeserializer.RemoteActionCompatParcelizer(j);
    }

    @Override // kotlin.DatabindException
    public final Object IconCompatParcelizer(long j, long j2, SampleVideos<? super UnsupportedTypeDeserializer> sampleVideos) {
        RemoteActionCompatParcelizer();
        return UnsupportedTypeDeserializer.RemoteActionCompatParcelizer(UnsupportedTypeDeserializer.INSTANCE.write());
    }

    private final void RemoteActionCompatParcelizer() {
        if (this.read.read(0)) {
            this.read.AudioAttributesCompatParcelizer(0);
        }
        if (this.read.read(1)) {
            this.read.AudioAttributesCompatParcelizer(1);
        }
    }
}
