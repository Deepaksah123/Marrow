package kotlin;

/* JADX INFO: loaded from: classes.dex */
public final class setAutoSizeTextTypeUniformWithPresetSizes {
    public static final long[] IconCompatParcelizer = {-9187201950435737345L, -1};
    private static final setKeyListener read = new setKeyListener(0);

    public static final int AudioAttributesCompatParcelizer(int i) {
        if (i == 0) {
            return 6;
        }
        return (i << 1) + 1;
    }

    public static final <K, V> AppCompatButton<K, V> AudioAttributesCompatParcelizer() {
        setKeyListener setkeylistener = read;
        toMagicModuleMetaRepoModel.read(setkeylistener, "");
        return setkeylistener;
    }

    public static final <K, V> setKeyListener<K, V> read() {
        return new setKeyListener<>(0, 1, null);
    }

    public static final int IconCompatParcelizer(int i) {
        if (i > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }

    public static final int RemoteActionCompatParcelizer(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    public static final int write(int i) {
        if (i == 7) {
            return 8;
        }
        return i + ((i - 1) / 7);
    }
}
