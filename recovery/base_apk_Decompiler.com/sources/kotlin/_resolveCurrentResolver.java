package kotlin;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes2.dex */
public final class _resolveCurrentResolver {
    public static StdKeyDeserializerStringCtorKeyDeserializer write(Configuration configuration) {
        return StdKeyDeserializerStringCtorKeyDeserializer.read(read.read(configuration));
    }

    public static void write(Configuration configuration, StdKeyDeserializerStringCtorKeyDeserializer stdKeyDeserializerStringCtorKeyDeserializer) {
        read.read(configuration, stdKeyDeserializerStringCtorKeyDeserializer);
    }

    static class read {
        static LocaleList read(Configuration configuration) {
            return configuration.getLocales();
        }

        static void read(Configuration configuration, StdKeyDeserializerStringCtorKeyDeserializer stdKeyDeserializerStringCtorKeyDeserializer) {
            configuration.setLocales((LocaleList) stdKeyDeserializerStringCtorKeyDeserializer.write());
        }
    }
}
