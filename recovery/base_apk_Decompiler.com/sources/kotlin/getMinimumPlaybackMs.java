package kotlin;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public class getMinimumPlaybackMs {
    private static final <T> int read(T t, T t2, getAnswerMap<? super T, ? extends Comparable<?>>[] getanswermapArr) {
        for (getAnswerMap<? super T, ? extends Comparable<?>> getanswermap : getanswermapArr) {
            int i = getConfigExpirySeconds.read(getanswermap.invoke(t), getanswermap.invoke(t2));
            if (i != 0) {
                return i;
            }
        }
        return 0;
    }

    public static final <T extends Comparable<?>> int read(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    public static final <T> Comparator<T> read(final getAnswerMap<? super T, ? extends Comparable<?>>... getanswermapArr) {
        toMagicModuleMetaRepoModel.write(getanswermapArr, "");
        if (getanswermapArr.length <= 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        return new Comparator() { // from class: o.getDecoderLevel
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return getMinimumPlaybackMs.write(getanswermapArr, obj, obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int write(getAnswerMap[] getanswermapArr, Object obj, Object obj2) {
        return read(obj, obj2, getanswermapArr);
    }

    public static final <T> Comparator<T> RemoteActionCompatParcelizer(final Comparator<T> comparator, final Comparator<? super T> comparator2) {
        toMagicModuleMetaRepoModel.write(comparator, "");
        toMagicModuleMetaRepoModel.write(comparator2, "");
        return new Comparator() { // from class: o.getLastNDays
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return getMinimumPlaybackMs.AudioAttributesCompatParcelizer(comparator, comparator2, obj, obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AudioAttributesCompatParcelizer(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        int iCompare = comparator.compare(obj, obj2);
        return iCompare != 0 ? iCompare : comparator2.compare(obj, obj2);
    }

    public static final <T extends Comparable<? super T>> Comparator<T> AudioAttributesCompatParcelizer() {
        getWvSecurityLevel getwvsecuritylevel = getWvSecurityLevel.write;
        toMagicModuleMetaRepoModel.read(getwvsecuritylevel, "");
        return getwvsecuritylevel;
    }
}
