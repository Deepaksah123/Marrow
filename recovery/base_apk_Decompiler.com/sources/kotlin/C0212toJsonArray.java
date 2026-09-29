package kotlin;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.Map;

/* JADX INFO: renamed from: o.toJsonArray, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0212toJsonArray {
    private static final Map<DataSet, Integer> IconCompatParcelizer;
    public static final C0212toJsonArray write = new C0212toJsonArray();

    /* JADX INFO: renamed from: o.toJsonArray$AudioAttributesCompatParcelizer */
    public static final class AudioAttributesCompatParcelizer extends DataSet {
        public static final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super("private", false);
        }
    }

    private C0212toJsonArray() {
    }

    /* JADX INFO: renamed from: o.toJsonArray$AudioAttributesImplBaseParcelizer */
    public static final class AudioAttributesImplBaseParcelizer extends DataSet {
        public static final AudioAttributesImplBaseParcelizer IconCompatParcelizer = new AudioAttributesImplBaseParcelizer();

        private AudioAttributesImplBaseParcelizer() {
            super("private_to_this", false);
        }

        @Override // kotlin.DataSet
        public final String write() {
            return "private/*private to this*/";
        }
    }

    /* JADX INFO: renamed from: o.toJsonArray$MediaBrowserCompatCustomActionResultReceiver */
    public static final class MediaBrowserCompatCustomActionResultReceiver extends DataSet {
        public static final MediaBrowserCompatCustomActionResultReceiver IconCompatParcelizer = new MediaBrowserCompatCustomActionResultReceiver();

        private MediaBrowserCompatCustomActionResultReceiver() {
            super("protected", true);
        }
    }

    /* JADX INFO: renamed from: o.toJsonArray$write */
    public static final class write extends DataSet {
        public static final write IconCompatParcelizer = new write();

        private write() {
            super("internal", false);
        }
    }

    /* JADX INFO: renamed from: o.toJsonArray$MediaBrowserCompatItemReceiver */
    public static final class MediaBrowserCompatItemReceiver extends DataSet {
        public static final MediaBrowserCompatItemReceiver write = new MediaBrowserCompatItemReceiver();

        private MediaBrowserCompatItemReceiver() {
            super("public", true);
        }
    }

    /* JADX INFO: renamed from: o.toJsonArray$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends DataSet {
        public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super(ImagesContract.LOCAL, false);
        }
    }

    /* JADX INFO: renamed from: o.toJsonArray$read */
    public static final class read extends DataSet {
        public static final read RemoteActionCompatParcelizer = new read();

        private read() {
            super("inherited", false);
        }
    }

    /* JADX INFO: renamed from: o.toJsonArray$RemoteActionCompatParcelizer */
    public static final class RemoteActionCompatParcelizer extends DataSet {
        public static final RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
            super("invisible_fake", false);
        }
    }

    /* JADX INFO: renamed from: o.toJsonArray$AudioAttributesImplApi21Parcelizer */
    public static final class AudioAttributesImplApi21Parcelizer extends DataSet {
        public static final AudioAttributesImplApi21Parcelizer AudioAttributesCompatParcelizer = new AudioAttributesImplApi21Parcelizer();

        private AudioAttributesImplApi21Parcelizer() {
            super("unknown", false);
        }
    }

    static {
        Map mapRemoteActionCompatParcelizer = VideoTimelineResponseBody.RemoteActionCompatParcelizer();
        mapRemoteActionCompatParcelizer.put(AudioAttributesImplBaseParcelizer.IconCompatParcelizer, 0);
        mapRemoteActionCompatParcelizer.put(AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer, 0);
        mapRemoteActionCompatParcelizer.put(write.IconCompatParcelizer, 1);
        mapRemoteActionCompatParcelizer.put(MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer, 1);
        mapRemoteActionCompatParcelizer.put(MediaBrowserCompatItemReceiver.write, 2);
        IconCompatParcelizer = VideoTimelineResponseBody.read(mapRemoteActionCompatParcelizer);
        MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver.write;
    }

    public static Integer read(DataSet dataSet, DataSet dataSet2) {
        toMagicModuleMetaRepoModel.write(dataSet, "");
        toMagicModuleMetaRepoModel.write(dataSet2, "");
        if (dataSet == dataSet2) {
            return 0;
        }
        Map<DataSet, Integer> map = IconCompatParcelizer;
        Integer num = map.get(dataSet);
        Integer num2 = map.get(dataSet2);
        if (num == null || num2 == null || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public static boolean AudioAttributesCompatParcelizer(DataSet dataSet) {
        toMagicModuleMetaRepoModel.write(dataSet, "");
        return dataSet == AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer || dataSet == AudioAttributesImplBaseParcelizer.IconCompatParcelizer;
    }
}
