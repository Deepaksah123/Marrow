package kotlin;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class parseTextSampleEntry {
    public static <T> parseTraks<T> RemoteActionCompatParcelizer(parseTraks<? super T> parsetraks, parseTraks<? super T> parsetraks2) {
        return new IconCompatParcelizer(AudioAttributesCompatParcelizer((parseTraks) parseStsd.IconCompatParcelizer(parsetraks), (parseTraks) parseStsd.IconCompatParcelizer(parsetraks2)), (byte) 0);
    }

    static class IconCompatParcelizer<T> implements parseTraks<T>, Serializable {
        private final List<? extends parseTraks<? super T>> AudioAttributesCompatParcelizer;

        /* synthetic */ IconCompatParcelizer(List list, byte b) {
            this(list);
        }

        private IconCompatParcelizer(List<? extends parseTraks<? super T>> list) {
            this.AudioAttributesCompatParcelizer = list;
        }

        @Override // kotlin.parseTraks
        public final boolean apply(T t) {
            for (int i = 0; i < this.AudioAttributesCompatParcelizer.size(); i++) {
                if (!this.AudioAttributesCompatParcelizer.get(i).apply(t)) {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode() {
            return this.AudioAttributesCompatParcelizer.hashCode() + 306654252;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof IconCompatParcelizer) {
                return this.AudioAttributesCompatParcelizer.equals(((IconCompatParcelizer) obj).AudioAttributesCompatParcelizer);
            }
            return false;
        }

        public final String toString() {
            return parseTextSampleEntry.write("and", this.AudioAttributesCompatParcelizer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String write(String str, Iterable<?> iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z = true;
        for (Object obj : iterable) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    private static <T> List<parseTraks<? super T>> AudioAttributesCompatParcelizer(parseTraks<? super T> parsetraks, parseTraks<? super T> parsetraks2) {
        return Arrays.asList(parsetraks, parsetraks2);
    }
}
