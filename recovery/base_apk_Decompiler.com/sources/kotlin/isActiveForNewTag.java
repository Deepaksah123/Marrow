package kotlin;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class isActiveForNewTag {
    private final int AudioAttributesCompatParcelizer;
    private final String[] AudioAttributesImplApi21Parcelizer;
    private final byte[] AudioAttributesImplBaseParcelizer;
    private final String[] IconCompatParcelizer;
    private final incrementTotalCount MediaBrowserCompatCustomActionResultReceiver;
    private final String MediaBrowserCompatItemReceiver;
    private final String RemoteActionCompatParcelizer;
    private final String[] read;
    private final IconCompatParcelizer write;

    private static boolean IconCompatParcelizer(int i, int i2) {
        return (i & i2) != 0;
    }

    public isActiveForNewTag(IconCompatParcelizer iconCompatParcelizer, incrementTotalCount incrementtotalcount, String[] strArr, String[] strArr2, String[] strArr3, String str, int i, String str2, byte[] bArr) {
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(incrementtotalcount, "");
        this.write = iconCompatParcelizer;
        this.MediaBrowserCompatCustomActionResultReceiver = incrementtotalcount;
        this.read = strArr;
        this.IconCompatParcelizer = strArr2;
        this.AudioAttributesImplApi21Parcelizer = strArr3;
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = i;
        this.MediaBrowserCompatItemReceiver = str2;
        this.AudioAttributesImplBaseParcelizer = bArr;
    }

    public final IconCompatParcelizer RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final incrementTotalCount write() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final String[] AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final String[] IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String[] MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public enum IconCompatParcelizer {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);

        private static final Map<Integer, IconCompatParcelizer> MediaBrowserCompatCustomActionResultReceiver;
        private final int AudioAttributesImplApi21Parcelizer;

        IconCompatParcelizer(int i) {
            this.AudioAttributesImplApi21Parcelizer = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            new AudioAttributesCompatParcelizer(0 == true ? 1 : 0);
            IconCompatParcelizer[] iconCompatParcelizerArrValues = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(getQues.write(VideoTimelineResponseBody.read(iconCompatParcelizerArrValues.length), 16));
            for (IconCompatParcelizer iconCompatParcelizer : iconCompatParcelizerArrValues) {
                linkedHashMap.put(Integer.valueOf(iconCompatParcelizer.AudioAttributesImplApi21Parcelizer), iconCompatParcelizer);
            }
            MediaBrowserCompatCustomActionResultReceiver = linkedHashMap;
        }

        public static final class AudioAttributesCompatParcelizer {
            private AudioAttributesCompatParcelizer() {
            }

            @getMagicModuleMeta
            public static IconCompatParcelizer RemoteActionCompatParcelizer(int i) {
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.get(Integer.valueOf(i));
                return iconCompatParcelizer == null ? IconCompatParcelizer.UNKNOWN : iconCompatParcelizer;
            }

            public /* synthetic */ AudioAttributesCompatParcelizer(byte b) {
                this();
            }
        }

        @getMagicModuleMeta
        public static final IconCompatParcelizer read(int i) {
            return AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i);
        }
    }

    public final String read() {
        String str = this.RemoteActionCompatParcelizer;
        if (this.write == IconCompatParcelizer.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    public final List<String> AudioAttributesImplApi21Parcelizer() {
        String[] strArr = this.read;
        if (this.write != IconCompatParcelizer.MULTIFILE_CLASS) {
            strArr = null;
        }
        List<String> list = strArr != null ? getOrderDetails.read(strArr) : null;
        return list == null ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list;
    }

    public final boolean AudioAttributesImplApi26Parcelizer() {
        return IconCompatParcelizer(this.AudioAttributesCompatParcelizer, 16) && !IconCompatParcelizer(this.AudioAttributesCompatParcelizer, 32);
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return IconCompatParcelizer(this.AudioAttributesCompatParcelizer, 64) && !IconCompatParcelizer(this.AudioAttributesCompatParcelizer, 32);
    }

    public final boolean AudioAttributesImplBaseParcelizer() {
        return IconCompatParcelizer(this.AudioAttributesCompatParcelizer, 2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.write);
        sb.append(" version=");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        return sb.toString();
    }
}
