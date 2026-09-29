package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0007\u001a'\u0010\b\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\n\u0010\u0007\u001a\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\u0007"}, d2 = {"", "", "p0", "", "RemoteActionCompatParcelizer", "(Ljava/util/List;I)V", "p1", "(II)V", "read", "(Ljava/util/List;II)V", "AudioAttributesCompatParcelizer", "write", "(I)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SerializedString {
    public static final void RemoteActionCompatParcelizer(List<?> list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            RemoteActionCompatParcelizer(i, size);
        }
    }

    private static final void RemoteActionCompatParcelizer(int i, int i2) {
        StringBuilder sb = new StringBuilder("Index ");
        sb.append(i);
        sb.append(" is out of bounds. The list has ");
        sb.append(i2);
        sb.append(" elements.");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static final void read(List<?> list, int i, int i2) {
        if (i > i2) {
            read(i, i2);
        }
        if (i < 0) {
            write(i);
        }
        if (i2 > list.size()) {
            AudioAttributesCompatParcelizer(i2, list.size());
        }
    }

    private static final void AudioAttributesCompatParcelizer(int i, int i2) {
        StringBuilder sb = new StringBuilder("toIndex (");
        sb.append(i);
        sb.append(") is more than than the list size (");
        sb.append(i2);
        sb.append(')');
        throw new IndexOutOfBoundsException(sb.toString());
    }

    private static final void write(int i) {
        StringBuilder sb = new StringBuilder("fromIndex (");
        sb.append(i);
        sb.append(") is less than 0.");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    private static final void read(int i, int i2) {
        StringBuilder sb = new StringBuilder("Indices are out of order. fromIndex (");
        sb.append(i);
        sb.append(") is greater than toIndex (");
        sb.append(i2);
        sb.append(").");
        throw new IllegalArgumentException(sb.toString());
    }
}
