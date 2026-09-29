package kotlin;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class outputMetadata {

    public interface write<T> {
        String write(T t);
    }

    public static FlacReaderFlacOggSeeker<?> write(String str, String str2) {
        return FlacReaderFlacOggSeeker.write(readMetadata.RemoteActionCompatParcelizer(str, str2), readMetadata.class);
    }

    public static FlacReaderFlacOggSeeker<?> write(final String str, final write<Context> writeVar) {
        return FlacReaderFlacOggSeeker.IconCompatParcelizer(readMetadata.class).RemoteActionCompatParcelizer(convertGranuleToTime.read((Class<?>) Context.class)).write(new OggPageHeader() { // from class: o.AppInfoTable1
            @Override // kotlin.OggPageHeader
            public final Object AudioAttributesCompatParcelizer(OggExtractor oggExtractor) {
                return readMetadata.RemoteActionCompatParcelizer(str, writeVar.write((Context) oggExtractor.read(Context.class)));
            }
        }).read();
    }
}
