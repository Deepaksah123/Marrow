package kotlin;

import android.text.TextUtils;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaItemLiveConfigurationBuilder implements setMinOffsetMs {
    private volatile Map<String, String> AudioAttributesCompatParcelizer;
    private final Map<String, List<MediaItemLiveConfigurationExternalSyntheticLambda0>> read;

    MediaItemLiveConfigurationBuilder(Map<String, List<MediaItemLiveConfigurationExternalSyntheticLambda0>> map) {
        this.read = Collections.unmodifiableMap(map);
    }

    @Override // kotlin.setMinOffsetMs
    public final Map<String, String> RemoteActionCompatParcelizer() {
        if (this.AudioAttributesCompatParcelizer == null) {
            synchronized (this) {
                if (this.AudioAttributesCompatParcelizer == null) {
                    this.AudioAttributesCompatParcelizer = Collections.unmodifiableMap(write());
                }
            }
        }
        return this.AudioAttributesCompatParcelizer;
    }

    private Map<String, String> write() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<MediaItemLiveConfigurationExternalSyntheticLambda0>> entry : this.read.entrySet()) {
            String strWrite = write(entry.getValue());
            if (!TextUtils.isEmpty(strWrite)) {
                map.put(entry.getKey(), strWrite);
            }
        }
        return map;
    }

    private static String write(List<MediaItemLiveConfigurationExternalSyntheticLambda0> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String strRemoteActionCompatParcelizer = list.get(i).RemoteActionCompatParcelizer();
            if (!TextUtils.isEmpty(strRemoteActionCompatParcelizer)) {
                sb.append(strRemoteActionCompatParcelizer);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LazyHeaders{headers=");
        sb.append(this.read);
        sb.append('}');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof MediaItemLiveConfigurationBuilder) {
            return this.read.equals(((MediaItemLiveConfigurationBuilder) obj).read);
        }
        return false;
    }

    public final int hashCode() {
        return this.read.hashCode();
    }

    public static final class read {
        private static final Map<String, List<MediaItemLiveConfigurationExternalSyntheticLambda0>> IconCompatParcelizer;
        private boolean RemoteActionCompatParcelizer = true;
        private Map<String, List<MediaItemLiveConfigurationExternalSyntheticLambda0>> read = IconCompatParcelizer;
        private boolean write = true;

        static {
            String strIconCompatParcelizer = IconCompatParcelizer();
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strIconCompatParcelizer)) {
                map.put(RtspHeaders.USER_AGENT, Collections.singletonList(new RemoteActionCompatParcelizer(strIconCompatParcelizer)));
            }
            IconCompatParcelizer = Collections.unmodifiableMap(map);
        }

        public final MediaItemLiveConfigurationBuilder write() {
            this.RemoteActionCompatParcelizer = true;
            return new MediaItemLiveConfigurationBuilder(this.read);
        }

        private static String IconCompatParcelizer() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char cCharAt = property.charAt(i);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb.append(cCharAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }
    }

    static final class RemoteActionCompatParcelizer implements MediaItemLiveConfigurationExternalSyntheticLambda0 {
        private final String read;

        RemoteActionCompatParcelizer(String str) {
            this.read = str;
        }

        @Override // kotlin.MediaItemLiveConfigurationExternalSyntheticLambda0
        public final String RemoteActionCompatParcelizer() {
            return this.read;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StringHeaderFactory{value='");
            sb.append(this.read);
            sb.append("'}");
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (obj instanceof RemoteActionCompatParcelizer) {
                return this.read.equals(((RemoteActionCompatParcelizer) obj).read);
            }
            return false;
        }

        public final int hashCode() {
            return this.read.hashCode();
        }
    }
}
