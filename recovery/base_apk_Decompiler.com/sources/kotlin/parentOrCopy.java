package kotlin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class parentOrCopy implements isLenient {
    private final List<findTypeId> AudioAttributesCompatParcelizer;
    private final long[] IconCompatParcelizer;
    private final long[] write;

    public parentOrCopy(List<findTypeId> list) {
        this.AudioAttributesCompatParcelizer = Collections.unmodifiableList(new ArrayList(list));
        this.write = new long[list.size() << 1];
        for (int i = 0; i < list.size(); i++) {
            findTypeId findtypeid = list.get(i);
            int i2 = i << 1;
            this.write[i2] = findtypeid.IconCompatParcelizer;
            this.write[i2 + 1] = findtypeid.RemoteActionCompatParcelizer;
        }
        long[] jArr = this.write;
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        this.IconCompatParcelizer = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // kotlin.isLenient
    public final int RemoteActionCompatParcelizer(long j) {
        int i = LaissezFaireSubTypeValidator.read(this.IconCompatParcelizer, j, false);
        if (i < this.IconCompatParcelizer.length) {
            return i;
        }
        return -1;
    }

    @Override // kotlin.isLenient
    public final int RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer.length;
    }

    @Override // kotlin.isLenient
    public final long write(int i) {
        buildTypeSerializer.IconCompatParcelizer(i >= 0);
        buildTypeSerializer.IconCompatParcelizer(i < this.IconCompatParcelizer.length);
        return this.IconCompatParcelizer[i];
    }

    @Override // kotlin.isLenient
    public final List<getDefaultImpl> read(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.AudioAttributesCompatParcelizer.size(); i++) {
            long[] jArr = this.write;
            int i2 = i << 1;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                findTypeId findtypeid = this.AudioAttributesCompatParcelizer.get(i);
                if (findtypeid.AudioAttributesCompatParcelizer.IconCompatParcelizer == -3.4028235E38f) {
                    arrayList2.add(findtypeid);
                } else {
                    arrayList.add(findtypeid.AudioAttributesCompatParcelizer);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: o.typedHash
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((findTypeId) obj).IconCompatParcelizer, ((findTypeId) obj2).IconCompatParcelizer);
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            arrayList.add(((findTypeId) arrayList2.get(i3)).AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer().write((-1) - i3, 1).write());
        }
        return arrayList;
    }
}
