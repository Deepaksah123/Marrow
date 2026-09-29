package kotlin;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class serializeContents {
    public final List<serializeTypedContents> AudioAttributesCompatParcelizer;
    public final long IconCompatParcelizer;
    public final List<FilteredBeanPropertyWriterSingleView> RemoteActionCompatParcelizer;
    public final String read;
    public final IndexedListSerializer write;

    public serializeContents(String str, long j, List<FilteredBeanPropertyWriterSingleView> list, List<serializeTypedContents> list2) {
        this(str, j, list, list2, null);
    }

    public serializeContents(String str, long j, List<FilteredBeanPropertyWriterSingleView> list, List<serializeTypedContents> list2, IndexedListSerializer indexedListSerializer) {
        this.read = str;
        this.IconCompatParcelizer = j;
        this.RemoteActionCompatParcelizer = Collections.unmodifiableList(list);
        this.AudioAttributesCompatParcelizer = Collections.unmodifiableList(list2);
        this.write = indexedListSerializer;
    }

    public final int read() {
        int size = this.RemoteActionCompatParcelizer.size();
        for (int i = 0; i < size; i++) {
            if (this.RemoteActionCompatParcelizer.get(i).AudioAttributesImplApi21Parcelizer == 2) {
                return i;
            }
        }
        return -1;
    }
}
