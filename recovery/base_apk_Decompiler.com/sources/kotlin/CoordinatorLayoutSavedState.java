package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/CoordinatorLayoutSavedState;", "", "<init>", "()V", "Lo/_colonConcat;", "p0", "Lo/getReferencedType;", "read", "(Lo/_colonConcat;)J", "", "RemoteActionCompatParcelizer", "I", "IconCompatParcelizer", "", "AudioAttributesCompatParcelizer", "Ljava/util/List;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CoordinatorLayoutSavedState {
    public static final int write = 8;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private List<_colonConcat> write = new ArrayList();

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private int IconCompatParcelizer;

    public final long read(_colonConcat p0) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (p0.getIconCompatParcelizer() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) p0.getIconCompatParcelizer());
        if (VirtualLayout.write(p0)) {
            this.IconCompatParcelizer = 0;
            this.write.clear();
        }
        if (!VirtualLayout.RemoteActionCompatParcelizer(p0) && !VirtualLayout.write(p0)) {
            if (this.write.size() == 3) {
                List<_colonConcat> list = this.write;
                int i = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i + 1;
                list.set(i, p0);
            } else {
                this.write.add(p0);
            }
            if (this.IconCompatParcelizer == 3) {
                this.IconCompatParcelizer = 0;
            }
            List<_colonConcat> list2 = this.write;
            ArrayList arrayList = new ArrayList(list2.size());
            int size = list2.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(Float.valueOf(Float.intBitsToFloat((int) (list2.get(i2).getIconCompatParcelizer() >> 32))));
            }
            fIntBitsToFloat = (float) IntermediateLoginResponseBody.AudioAttributesImplApi21Parcelizer((Iterable<Float>) arrayList);
            List<_colonConcat> list3 = this.write;
            ArrayList arrayList2 = new ArrayList(list3.size());
            int size2 = list3.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) list3.get(i3).getIconCompatParcelizer())));
            }
            fIntBitsToFloat2 = (float) IntermediateLoginResponseBody.AudioAttributesImplApi21Parcelizer((Iterable<Float>) arrayList2);
        }
        long j = -1;
        return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
    }
}
