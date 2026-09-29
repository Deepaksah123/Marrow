package kotlin;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class onMoofContainerAtomRead {
    public static <T> boolean AudioAttributesCompatParcelizer(Iterable<T> iterable, parseTraks<? super T> parsetraks) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            return read((List) iterable, (parseTraks) parseStsd.IconCompatParcelizer(parsetraks));
        }
        return parseSaio.read(iterable.iterator(), parsetraks);
    }

    private static <T> boolean read(List<T> list, parseTraks<? super T> parsetraks) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            T t = list.get(i);
            if (!parsetraks.apply(t)) {
                if (i > i2) {
                    try {
                        list.set(i2, t);
                    } catch (IllegalArgumentException unused) {
                        RemoteActionCompatParcelizer(list, parsetraks, i2, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        RemoteActionCompatParcelizer(list, parsetraks, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }

    private static <T> void RemoteActionCompatParcelizer(List<T> list, parseTraks<? super T> parsetraks, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (parsetraks.apply(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            } else {
                list.remove(i2);
            }
        }
    }

    public static String RemoteActionCompatParcelizer(Iterable<?> iterable) {
        return parseSaio.RemoteActionCompatParcelizer(iterable.iterator());
    }

    public static <T> T write(Iterable<T> iterable) {
        return (T) parseSaio.AudioAttributesCompatParcelizer(iterable.iterator());
    }

    static Object[] IconCompatParcelizer(Iterable<?> iterable) {
        return AudioAttributesImplApi26Parcelizer(iterable).toArray();
    }

    private static <E> Collection<E> AudioAttributesImplApi26Parcelizer(Iterable<E> iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return parseMehd.IconCompatParcelizer(iterable.iterator());
    }

    public static <T> boolean RemoteActionCompatParcelizer(Iterable<T> iterable, parseTraks<? super T> parsetraks) {
        return parseSaio.IconCompatParcelizer((Iterator) iterable.iterator(), (parseTraks) parsetraks);
    }

    public static <T> T write(Iterable<? extends T> iterable, T t) {
        return (T) parseSaio.IconCompatParcelizer(iterable.iterator(), t);
    }

    public static <T> T AudioAttributesCompatParcelizer(Iterable<T> iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return (T) RemoteActionCompatParcelizer(list);
        }
        return (T) parseSaio.read(iterable.iterator());
    }

    public static <T> T read(Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return null;
            }
            if (iterable instanceof List) {
                return (T) RemoteActionCompatParcelizer(parseMehd.read(iterable));
            }
        }
        return (T) parseSaio.write(iterable.iterator(), (Object) null);
    }

    private static <T> T RemoteActionCompatParcelizer(List<T> list) {
        return list.get(list.size() - 1);
    }
}
