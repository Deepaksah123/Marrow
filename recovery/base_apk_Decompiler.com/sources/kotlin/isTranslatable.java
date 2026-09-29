package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class isTranslatable {
    static ZoomableLinearLayoutManager AudioAttributesCompatParcelizer(ZoomableLinearLayoutManager zoomableLinearLayoutManager) {
        return write(zoomableLinearLayoutManager);
    }

    private static ZoomableLinearLayoutManager write(ZoomableLinearLayoutManager zoomableLinearLayoutManager) {
        if (zoomableLinearLayoutManager.IconCompatParcelizer(128)) {
            return zoomableLinearLayoutManager;
        }
        String strIconCompatParcelizer = IconCompatParcelizer(128);
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(zoomableLinearLayoutManager);
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(strIconCompatParcelizer);
        sb.append(" tag but found ");
        sb.append(strRemoteActionCompatParcelizer);
        throw new IllegalStateException(sb.toString());
    }

    private static String IconCompatParcelizer(int i) {
        return i != 64 ? i != 128 ? i != 192 ? "UNIVERSAL" : "PRIVATE" : "CONTEXT" : "APPLICATION";
    }

    private static String RemoteActionCompatParcelizer(ZoomableLinearLayoutManager zoomableLinearLayoutManager) {
        return IconCompatParcelizer(zoomableLinearLayoutManager.AudioAttributesImplApi21Parcelizer());
    }

    public static String IconCompatParcelizer(int i, int i2) {
        StringBuilder sb;
        if (i == 64) {
            sb = new StringBuilder("[APPLICATION ");
        } else if (i != 128) {
            sb = i != 192 ? new StringBuilder("[UNIVERSAL ") : new StringBuilder("[PRIVATE ");
        } else {
            sb = new StringBuilder("[CONTEXT ");
        }
        sb.append(i2);
        sb.append("]");
        return sb.toString();
    }

    public static String read(ZoomableLinearLayoutManager zoomableLinearLayoutManager) {
        return IconCompatParcelizer(zoomableLinearLayoutManager.AudioAttributesImplApi21Parcelizer(), zoomableLinearLayoutManager.AudioAttributesImplBaseParcelizer());
    }
}
