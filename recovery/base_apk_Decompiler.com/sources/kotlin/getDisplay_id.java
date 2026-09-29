package kotlin;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public class getDisplay_id extends PhoneNumberLoginResponseBody {
    public static final <T> boolean IconCompatParcelizer(Collection<? super T> collection, Iterable<? extends T> iterable) {
        toMagicModuleMetaRepoModel.write(collection, "");
        toMagicModuleMetaRepoModel.write(iterable, "");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z = true;
            }
        }
        return z;
    }

    public static final <T> boolean read(Collection<? super T> collection, T[] tArr) {
        toMagicModuleMetaRepoModel.write(collection, "");
        toMagicModuleMetaRepoModel.write(tArr, "");
        return collection.addAll(getOrderDetails.read(tArr));
    }

    public static final <T> Collection<T> AudioAttributesCompatParcelizer(Iterable<? extends T> iterable) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        return iterable instanceof Collection ? (Collection) iterable : IntermediateLoginResponseBody.onPlay(iterable);
    }

    public static final <T> boolean RemoteActionCompatParcelizer(Collection<? super T> collection, Iterable<? extends T> iterable) {
        toMagicModuleMetaRepoModel.write(collection, "");
        toMagicModuleMetaRepoModel.write(iterable, "");
        return collection.removeAll(IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) iterable));
    }

    public static final <T> boolean read(Collection<? super T> collection, Iterable<? extends T> iterable) {
        toMagicModuleMetaRepoModel.write(collection, "");
        toMagicModuleMetaRepoModel.write(iterable, "");
        return collection.retainAll(IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) iterable));
    }

    public static final <T> boolean AudioAttributesCompatParcelizer(Iterable<? extends T> iterable, getAnswerMap<? super T, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        return write(iterable, getanswermap, false);
    }

    private static final <T> boolean write(Iterable<? extends T> iterable, getAnswerMap<? super T, Boolean> getanswermap, boolean z) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (getanswermap.invoke(it.next()).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static final <T> T read(List<T> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static final <T> T AudioAttributesImplBaseParcelizer(List<T> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(IntermediateLoginResponseBody.write((List) list));
    }

    public static final <T> T AudioAttributesImplApi26Parcelizer(List<T> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(IntermediateLoginResponseBody.write((List) list));
    }

    public static final <T> boolean read(List<T> list, getAnswerMap<? super T, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        return IconCompatParcelizer(list, getanswermap);
    }

    private static final <T> boolean IconCompatParcelizer(List<T> list, getAnswerMap<? super T, Boolean> getanswermap) {
        int i;
        if (!(list instanceof RandomAccess)) {
            toMagicModuleMetaRepoModel.read(list, "");
            return write(toMagicModuleStatsLSModel.AudioAttributesCompatParcelizer(list), getanswermap, true);
        }
        int iWrite = IntermediateLoginResponseBody.write((List) list);
        if (iWrite >= 0) {
            int i2 = 0;
            i = 0;
            while (true) {
                T t = list.get(i2);
                if (!getanswermap.invoke(t).booleanValue()) {
                    if (i != i2) {
                        list.set(i, t);
                    }
                    i++;
                }
                if (i2 == iWrite) {
                    break;
                }
                i2++;
            }
        } else {
            i = 0;
        }
        if (i >= list.size()) {
            return false;
        }
        int iWrite2 = IntermediateLoginResponseBody.write((List) list);
        if (i <= iWrite2) {
            while (true) {
                list.remove(iWrite2);
                if (iWrite2 == i) {
                    break;
                }
                iWrite2--;
            }
        }
        return true;
    }
}
