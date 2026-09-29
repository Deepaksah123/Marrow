package kotlin;

import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class addOnMultiWindowModeChangedListener {
    static StdKeyDeserializerStringCtorKeyDeserializer write(StdKeyDeserializerStringCtorKeyDeserializer stdKeyDeserializerStringCtorKeyDeserializer, StdKeyDeserializerStringCtorKeyDeserializer stdKeyDeserializerStringCtorKeyDeserializer2) {
        if (stdKeyDeserializerStringCtorKeyDeserializer == null || stdKeyDeserializerStringCtorKeyDeserializer.IconCompatParcelizer()) {
            return StdKeyDeserializerStringCtorKeyDeserializer.RemoteActionCompatParcelizer();
        }
        return read(stdKeyDeserializerStringCtorKeyDeserializer, stdKeyDeserializerStringCtorKeyDeserializer2);
    }

    private static StdKeyDeserializerStringCtorKeyDeserializer read(StdKeyDeserializerStringCtorKeyDeserializer stdKeyDeserializerStringCtorKeyDeserializer, StdKeyDeserializerStringCtorKeyDeserializer stdKeyDeserializerStringCtorKeyDeserializer2) {
        Locale localeRemoteActionCompatParcelizer;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i = 0; i < stdKeyDeserializerStringCtorKeyDeserializer.AudioAttributesCompatParcelizer() + stdKeyDeserializerStringCtorKeyDeserializer2.AudioAttributesCompatParcelizer(); i++) {
            if (i < stdKeyDeserializerStringCtorKeyDeserializer.AudioAttributesCompatParcelizer()) {
                localeRemoteActionCompatParcelizer = stdKeyDeserializerStringCtorKeyDeserializer.RemoteActionCompatParcelizer(i);
            } else {
                localeRemoteActionCompatParcelizer = stdKeyDeserializerStringCtorKeyDeserializer2.RemoteActionCompatParcelizer(i - stdKeyDeserializerStringCtorKeyDeserializer.AudioAttributesCompatParcelizer());
            }
            if (localeRemoteActionCompatParcelizer != null) {
                linkedHashSet.add(localeRemoteActionCompatParcelizer);
            }
        }
        return StdKeyDeserializerStringCtorKeyDeserializer.write((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }
}
