package kotlin;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.ExoMediaDrmAppManagedProvider;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ExoMediaDrmOnEventListener {
    public abstract Integer AudioAttributesCompatParcelizer();

    public abstract long AudioAttributesImplBaseParcelizer();

    public abstract long IconCompatParcelizer();

    public abstract String RemoteActionCompatParcelizer();

    protected abstract Map<String, String> read();

    public abstract ExoMediaDrmKeyRequest write();

    public final Map<String, String> AudioAttributesImplApi26Parcelizer() {
        return Collections.unmodifiableMap(read());
    }

    public final int RemoteActionCompatParcelizer(String str) {
        String str2 = read().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final long write(String str) {
        String str2 = read().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    public final String IconCompatParcelizer(String str) {
        String str2 = read().get(str);
        return str2 == null ? "" : str2;
    }

    public final IconCompatParcelizer MediaBrowserCompatItemReceiver() {
        return new ExoMediaDrmAppManagedProvider.RemoteActionCompatParcelizer().read(RemoteActionCompatParcelizer()).write(AudioAttributesCompatParcelizer()).write(write()).write(IconCompatParcelizer()).RemoteActionCompatParcelizer(AudioAttributesImplBaseParcelizer()).IconCompatParcelizer(new HashMap(read()));
    }

    public static IconCompatParcelizer AudioAttributesImplApi21Parcelizer() {
        return new ExoMediaDrmAppManagedProvider.RemoteActionCompatParcelizer().IconCompatParcelizer(new HashMap());
    }

    public static abstract class IconCompatParcelizer {
        public abstract ExoMediaDrmOnEventListener AudioAttributesCompatParcelizer();

        protected abstract IconCompatParcelizer IconCompatParcelizer(Map<String, String> map);

        public abstract IconCompatParcelizer RemoteActionCompatParcelizer(long j);

        protected abstract Map<String, String> read();

        public abstract IconCompatParcelizer read(String str);

        public abstract IconCompatParcelizer write(long j);

        public abstract IconCompatParcelizer write(Integer num);

        public abstract IconCompatParcelizer write(ExoMediaDrmKeyRequest exoMediaDrmKeyRequest);

        public final IconCompatParcelizer read(String str, String str2) {
            read().put(str, str2);
            return this;
        }

        public final IconCompatParcelizer read(String str, long j) {
            read().put(str, String.valueOf(j));
            return this;
        }

        public final IconCompatParcelizer RemoteActionCompatParcelizer(String str, int i) {
            read().put(str, String.valueOf(i));
            return this;
        }
    }
}
