package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class setRank {
    public static <T> getTestId<T> write(final setDescriptionList<T> setdescriptionlist) {
        if (setdescriptionlist instanceof getTestId) {
            return (getTestId) setdescriptionlist;
        }
        return new getTestId<T>() { // from class: o.setRank.2
            @Override // kotlin.setDescriptionList
            public final T get() {
                return (T) setdescriptionlist.get();
            }
        };
    }
}
