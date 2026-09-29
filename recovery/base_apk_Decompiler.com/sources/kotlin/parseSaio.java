package kotlin;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class parseSaio {
    static <T> getCurrentSampleFlags<T> IconCompatParcelizer() {
        return read();
    }

    private static <T> FragmentedMp4ExtractorTrackBundle<T> read() {
        return (FragmentedMp4ExtractorTrackBundle<T>) RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
    }

    enum read implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            FixedSampleSizeRechunker.IconCompatParcelizer(false);
        }
    }

    static <T> Iterator<T> write() {
        return read.INSTANCE;
    }

    public static boolean RemoteActionCompatParcelizer(Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean write(Iterator<?> it, Collection<?> collection) {
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static <T> boolean read(Iterator<T> it, parseTraks<? super T> parsetraks) {
        boolean z = false;
        while (it.hasNext()) {
            if (parsetraks.apply(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean RemoteActionCompatParcelizer(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !parseSmta.AudioAttributesCompatParcelizer(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static String RemoteActionCompatParcelizer(Iterator<?> it) {
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public static <T> T AudioAttributesCompatParcelizer(Iterator<T> it) {
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    public static <T> boolean IconCompatParcelizer(Collection<T> collection, Iterator<? extends T> it) {
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static <T> getCurrentSampleFlags<T> AudioAttributesCompatParcelizer(final Iterator<T> it, final parseTraks<? super T> parsetraks) {
        return new getFixedSampleSize<T>() { // from class: o.parseSaio.4
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.getFixedSampleSize
            protected final T write() {
                while (it.hasNext()) {
                    T t = (T) it.next();
                    if (parsetraks.apply(t)) {
                        return t;
                    }
                }
                return IconCompatParcelizer();
            }
        };
    }

    public static <T> boolean IconCompatParcelizer(Iterator<T> it, parseTraks<? super T> parsetraks) {
        return RemoteActionCompatParcelizer(it, parsetraks) != -1;
    }

    public static <T> T write(Iterator<T> it, parseTraks<? super T> parsetraks) {
        while (it.hasNext()) {
            T next = it.next();
            if (parsetraks.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    private static <T> int RemoteActionCompatParcelizer(Iterator<T> it, parseTraks<? super T> parsetraks) {
        parseStsd.IconCompatParcelizer(parsetraks, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (parsetraks.apply(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static <F, T> Iterator<T> read(Iterator<F> it, final parseMvhd<? super F, ? extends T> parsemvhd) {
        return new getCurrentSamplePresentationTimeUs<F, T>(it) { // from class: o.parseSaio.1
            @Override // kotlin.getCurrentSamplePresentationTimeUs
            final T write(F f) {
                return (T) parsemvhd.apply(f);
            }
        };
    }

    public static <T> T IconCompatParcelizer(Iterator<? extends T> it, T t) {
        return it.hasNext() ? it.next() : t;
    }

    public static <T> T read(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> T write(Iterator<? extends T> it, T t) {
        if (it.hasNext()) {
            return (T) read(it);
        }
        return null;
    }

    static <T> T IconCompatParcelizer(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    static void write(Iterator<?> it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    static final class RemoteActionCompatParcelizer<T> extends AtomParsersMvhdInfo<T> {
        static final FragmentedMp4ExtractorTrackBundle<Object> AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer(new Object[0]);
        private final T[] IconCompatParcelizer;

        private RemoteActionCompatParcelizer(T[] tArr) {
            super(tArr.length, 0);
            this.IconCompatParcelizer = tArr;
        }

        @Override // kotlin.AtomParsersMvhdInfo
        protected final T RemoteActionCompatParcelizer(int i) {
            return this.IconCompatParcelizer[i];
        }
    }

    public static <T> getCurrentSampleFlags<T> IconCompatParcelizer(T t) {
        return new IconCompatParcelizer(t);
    }

    static final class IconCompatParcelizer<T> extends getCurrentSampleFlags<T> {
        private static final Object write = new Object();
        private Object RemoteActionCompatParcelizer;

        IconCompatParcelizer(T t) {
            this.RemoteActionCompatParcelizer = t;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.RemoteActionCompatParcelizer != write;
        }

        @Override // java.util.Iterator
        public final T next() {
            T t = (T) this.RemoteActionCompatParcelizer;
            Object obj = write;
            if (t == obj) {
                throw new NoSuchElementException();
            }
            this.RemoteActionCompatParcelizer = obj;
            return t;
        }
    }
}
