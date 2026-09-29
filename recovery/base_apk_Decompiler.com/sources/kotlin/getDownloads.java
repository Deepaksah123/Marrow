package kotlin;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class getDownloads implements getPageHeader {
    @Override // kotlin.getPageHeader
    public final List<FlacReaderFlacOggSeeker<?>> write(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final FlacReaderFlacOggSeeker<?> flacReaderFlacOggSeekerWrite : componentRegistrar.RemoteActionCompatParcelizer()) {
            final String str = flacReaderFlacOggSeekerWrite.read();
            if (str != null) {
                flacReaderFlacOggSeekerWrite = flacReaderFlacOggSeekerWrite.write(new OggPageHeader() { // from class: o.putDownloadInternal
                    @Override // kotlin.OggPageHeader
                    public final Object AudioAttributesCompatParcelizer(OggExtractor oggExtractor) {
                        return getDownloads.read(str, flacReaderFlacOggSeekerWrite, oggExtractor);
                    }
                });
            }
            arrayList.add(flacReaderFlacOggSeekerWrite);
        }
        return arrayList;
    }

    static /* synthetic */ Object read(String str, FlacReaderFlacOggSeeker flacReaderFlacOggSeeker, OggExtractor oggExtractor) {
        try {
            inferMimeType.write(str);
            return flacReaderFlacOggSeeker.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(oggExtractor);
        } finally {
            inferMimeType.IconCompatParcelizer();
        }
    }
}
