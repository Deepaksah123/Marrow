package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f"}, d2 = {"Lo/getExtraData;", "", "<init>", "()V", "Lo/getReferencedType;", "p0", "IconCompatParcelizer", "(J)J", "", "AudioAttributesCompatParcelizer", "", "write", "I", "read", "", "Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getExtraData {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private List<getReferencedType> write = new ArrayList();

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private int read;

    public final long IconCompatParcelizer(long p0) {
        if (this.write.size() == 3) {
            List<getReferencedType> list = this.write;
            int i = this.read;
            this.read = i + 1;
            list.set(i, getReferencedType.read(p0));
        } else {
            this.write.add(getReferencedType.read(p0));
        }
        if (this.read == 3) {
            this.read = 0;
        }
        List<getReferencedType> list2 = this.write;
        ArrayList arrayList = new ArrayList(list2.size());
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(Float.valueOf(Float.intBitsToFloat((int) (list2.get(i2).getWrite() >> 32))));
        }
        float fAudioAttributesImplApi21Parcelizer = (float) IntermediateLoginResponseBody.AudioAttributesImplApi21Parcelizer((Iterable<Float>) arrayList);
        List<getReferencedType> list3 = this.write;
        ArrayList arrayList2 = new ArrayList(list3.size());
        int size2 = list3.size();
        for (int i3 = 0; i3 < size2; i3++) {
            long j = -1;
            arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) (((((long) 0) << 32) | (j - ((j >> 63) << 32))) & list3.get(i3).getWrite()))));
        }
        long j2 = -1;
        return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits((float) IntermediateLoginResponseBody.AudioAttributesImplApi21Parcelizer((Iterable<Float>) arrayList2))) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (Float.floatToRawIntBits(fAudioAttributesImplApi21Parcelizer) << 32));
    }

    public final void AudioAttributesCompatParcelizer() {
        this.read = 0;
        this.write.clear();
    }
}
