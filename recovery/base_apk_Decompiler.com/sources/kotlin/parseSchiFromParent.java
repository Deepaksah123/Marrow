package kotlin;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class parseSchiFromParent {
    private final String IconCompatParcelizer;

    public static parseSchiFromParent write(String str) {
        return new parseSchiFromParent(str);
    }

    public static parseSchiFromParent IconCompatParcelizer() {
        return new parseSchiFromParent(",");
    }

    private parseSchiFromParent(String str) {
        this.IconCompatParcelizer = (String) parseStsd.IconCompatParcelizer(str);
    }

    private <A extends Appendable> A IconCompatParcelizer(A a, Iterator<? extends Object> it) throws IOException {
        if (it.hasNext()) {
            a.append(write(it.next()));
            while (it.hasNext()) {
                a.append(this.IconCompatParcelizer);
                a.append(write(it.next()));
            }
        }
        return a;
    }

    public final StringBuilder RemoteActionCompatParcelizer(StringBuilder sb, Iterable<? extends Object> iterable) {
        return read(sb, iterable.iterator());
    }

    private StringBuilder read(StringBuilder sb, Iterator<? extends Object> it) {
        try {
            IconCompatParcelizer(sb, it);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final String RemoteActionCompatParcelizer(Iterable<? extends Object> iterable) {
        return read(iterable.iterator());
    }

    private String read(Iterator<? extends Object> it) {
        return read(new StringBuilder(), it).toString();
    }

    private static CharSequence write(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
