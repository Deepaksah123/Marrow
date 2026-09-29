package kotlin;

import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes.dex */
public final class setHideOnContentScrollEnabled {
    private static <E> int AudioAttributesCompatParcelizer(setCustomView<E> setcustomview, int i) {
        toMagicModuleMetaRepoModel.write(setcustomview, "");
        try {
            return setCheckMarkDrawable.IconCompatParcelizer(setcustomview.getRead(), setcustomview.write(), i);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> int RemoteActionCompatParcelizer(setCustomView<E> setcustomview, Object obj, int i) {
        toMagicModuleMetaRepoModel.write(setcustomview, "");
        int iWrite = setcustomview.write();
        if (iWrite == 0) {
            return -1;
        }
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(setcustomview, i);
        if (iAudioAttributesCompatParcelizer < 0 || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj, setcustomview.getRemoteActionCompatParcelizer()[iAudioAttributesCompatParcelizer])) {
            return iAudioAttributesCompatParcelizer;
        }
        int i2 = iAudioAttributesCompatParcelizer + 1;
        while (i2 < iWrite && setcustomview.getRead()[i2] == i) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj, setcustomview.getRemoteActionCompatParcelizer()[i2])) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iAudioAttributesCompatParcelizer - 1; i3 >= 0 && setcustomview.getRead()[i3] == i; i3--) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj, setcustomview.getRemoteActionCompatParcelizer()[i3])) {
                return i3;
            }
        }
        return ~i2;
    }

    public static final <E> int write(setCustomView<E> setcustomview) {
        toMagicModuleMetaRepoModel.write(setcustomview, "");
        return RemoteActionCompatParcelizer(setcustomview, null, 0);
    }

    public static final <E> void write(setCustomView<E> setcustomview, int i) {
        toMagicModuleMetaRepoModel.write(setcustomview, "");
        setcustomview.write(new int[i]);
        setcustomview.RemoteActionCompatParcelizer(new Object[i]);
    }
}
