package kotlin;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class getPresentationTimeUs implements EventMessageDecoder {
    private final SimpleMetadataDecoder AudioAttributesCompatParcelizer;
    private final String RemoteActionCompatParcelizer;

    private getPresentationTimeUs(Set<readMetadata> set, SimpleMetadataDecoder simpleMetadataDecoder) {
        this.RemoteActionCompatParcelizer = write(set);
        this.AudioAttributesCompatParcelizer = simpleMetadataDecoder;
    }

    @Override // kotlin.EventMessageDecoder
    public final String IconCompatParcelizer() {
        if (this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer().isEmpty()) {
            return this.RemoteActionCompatParcelizer;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(' ');
        sb.append(write(this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer()));
        return sb.toString();
    }

    private static String write(Set<readMetadata> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<readMetadata> it = set.iterator();
        while (it.hasNext()) {
            readMetadata next = it.next();
            sb.append(next.IconCompatParcelizer());
            sb.append('/');
            sb.append(next.read());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public static FlacReaderFlacOggSeeker<EventMessageDecoder> RemoteActionCompatParcelizer() {
        return FlacReaderFlacOggSeeker.read(EventMessageDecoder.class).RemoteActionCompatParcelizer(convertGranuleToTime.MediaBrowserCompatItemReceiver(readMetadata.class)).write(new OggPageHeader() { // from class: o.invokeRendererInternal
            @Override // kotlin.OggPageHeader
            public final Object AudioAttributesCompatParcelizer(OggExtractor oggExtractor) {
                return getPresentationTimeUs.RemoteActionCompatParcelizer(oggExtractor);
            }
        }).read();
    }

    static /* synthetic */ EventMessageDecoder RemoteActionCompatParcelizer(OggExtractor oggExtractor) {
        return new getPresentationTimeUs(oggExtractor.AudioAttributesCompatParcelizer(readMetadata.class), SimpleMetadataDecoder.read());
    }
}
