package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\n\u0010\tJ'\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lo/fillPowersOfNFloor16Recursive;", "", "<init>", "()V", "", "p0", "p1", "", "read", "(II)V", "IconCompatParcelizer", "p2", "write", "(III)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class fillPowersOfNFloor16Recursive {
    public static final fillPowersOfNFloor16Recursive INSTANCE = new fillPowersOfNFloor16Recursive();

    private fillPowersOfNFloor16Recursive() {
    }

    @getMagicModuleMeta
    public static final void read(int p0, int p1) {
        if (p0 < 0 || p0 >= p1) {
            StringBuilder sb = new StringBuilder("index: ");
            sb.append(p0);
            sb.append(", size: ");
            sb.append(p1);
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }

    @getMagicModuleMeta
    public static final void IconCompatParcelizer(int p0, int p1) {
        if (p0 < 0 || p0 > p1) {
            StringBuilder sb = new StringBuilder("index: ");
            sb.append(p0);
            sb.append(", size: ");
            sb.append(p1);
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }

    @getMagicModuleMeta
    public static final void write(int p0, int p1, int p2) {
        if (p0 < 0 || p1 > p2) {
            StringBuilder sb = new StringBuilder("fromIndex: ");
            sb.append(p0);
            sb.append(", toIndex: ");
            sb.append(p1);
            sb.append(", size: ");
            sb.append(p2);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (p0 <= p1) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("fromIndex: ");
        sb2.append(p0);
        sb2.append(" > toIndex: ");
        sb2.append(p1);
        throw new IllegalArgumentException(sb2.toString());
    }
}
