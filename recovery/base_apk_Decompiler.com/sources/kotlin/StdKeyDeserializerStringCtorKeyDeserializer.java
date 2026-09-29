package kotlin;

import android.os.LocaleList;
import java.util.Locale;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;

/* JADX INFO: loaded from: classes.dex */
public final class StdKeyDeserializerStringCtorKeyDeserializer {
    private static final StdKeyDeserializerStringCtorKeyDeserializer RemoteActionCompatParcelizer = write(new Locale[0]);
    private final StdKeyDeserializerStringKD write;

    private StdKeyDeserializerStringCtorKeyDeserializer(StdKeyDeserializerStringKD stdKeyDeserializerStringKD) {
        this.write = stdKeyDeserializerStringKD;
    }

    public static StdKeyDeserializerStringCtorKeyDeserializer read(LocaleList localeList) {
        return new StdKeyDeserializerStringCtorKeyDeserializer(new StdKeyDeserializers(localeList));
    }

    public final Object write() {
        return this.write.write();
    }

    public static StdKeyDeserializerStringCtorKeyDeserializer write(Locale... localeArr) {
        return read(write.read(localeArr));
    }

    public final Locale RemoteActionCompatParcelizer(int i) {
        return this.write.write(i);
    }

    public final boolean IconCompatParcelizer() {
        return this.write.AudioAttributesCompatParcelizer();
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.write.RemoteActionCompatParcelizer();
    }

    public final String read() {
        return this.write.IconCompatParcelizer();
    }

    public static StdKeyDeserializerStringCtorKeyDeserializer RemoteActionCompatParcelizer() {
        return RemoteActionCompatParcelizer;
    }

    public static StdKeyDeserializerStringCtorKeyDeserializer RemoteActionCompatParcelizer(String str) {
        if (str == null || str.isEmpty()) {
            return RemoteActionCompatParcelizer();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = IconCompatParcelizer.write(strArrSplit[i]);
        }
        return write(localeArr);
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class IconCompatParcelizer {
        private static final Locale[] RemoteActionCompatParcelizer = {new Locale("en", "XA"), new Locale(ArchiveStreamFactory.AR, "XB")};

        static Locale write(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof StdKeyDeserializerStringCtorKeyDeserializer) && this.write.equals(((StdKeyDeserializerStringCtorKeyDeserializer) obj).write);
    }

    public final int hashCode() {
        return this.write.hashCode();
    }

    public final String toString() {
        return this.write.toString();
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class write {
        static LocaleList read(Locale... localeArr) {
            return new LocaleList(localeArr);
        }
    }
}
