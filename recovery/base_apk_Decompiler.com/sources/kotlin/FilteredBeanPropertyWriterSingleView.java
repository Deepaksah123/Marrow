package kotlin;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class FilteredBeanPropertyWriterSingleView {
    public final List<IndexedListSerializer> AudioAttributesCompatParcelizer;
    public final int AudioAttributesImplApi21Parcelizer;
    public final List<IndexedStringListSerializer> IconCompatParcelizer;
    public final List<IndexedListSerializer> RemoteActionCompatParcelizer;
    public final long read;
    public final List<IndexedListSerializer> write;

    public FilteredBeanPropertyWriterSingleView(long j, int i, List<IndexedStringListSerializer> list, List<IndexedListSerializer> list2, List<IndexedListSerializer> list3, List<IndexedListSerializer> list4) {
        this.read = j;
        this.AudioAttributesImplApi21Parcelizer = i;
        this.IconCompatParcelizer = Collections.unmodifiableList(list);
        this.RemoteActionCompatParcelizer = Collections.unmodifiableList(list2);
        this.write = Collections.unmodifiableList(list3);
        this.AudioAttributesCompatParcelizer = Collections.unmodifiableList(list4);
    }
}
