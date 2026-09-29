package com.google.firebase.database;

import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.database.DatabaseRegistrar;
import java.util.Arrays;
import java.util.List;
import kotlin.FlacReaderFlacOggSeeker;
import kotlin.OggExtractor;
import kotlin.OggPageHeader;
import kotlin.checkFileType;
import kotlin.convertGranuleToTime;
import kotlin.outputMetadata;
import kotlin.setFirstFrameOffset;
import kotlin.verifyBitstreamType;

/* JADX INFO: loaded from: classes5.dex */
public class DatabaseRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<FlacReaderFlacOggSeeker<?>> RemoteActionCompatParcelizer() {
        return Arrays.asList(FlacReaderFlacOggSeeker.read(checkFileType.class).IconCompatParcelizer("fire-rtdb").RemoteActionCompatParcelizer(convertGranuleToTime.read((Class<?>) FirebaseApp.class)).RemoteActionCompatParcelizer(convertGranuleToTime.IconCompatParcelizer(setFirstFrameOffset.class)).RemoteActionCompatParcelizer(convertGranuleToTime.IconCompatParcelizer(verifyBitstreamType.class)).write(new OggPageHeader() { // from class: o.WavExtractorPassthroughOutputWriter
            @Override // kotlin.OggPageHeader
            public final Object AudioAttributesCompatParcelizer(OggExtractor oggExtractor) {
                return DatabaseRegistrar.read(oggExtractor);
            }
        }).read(), outputMetadata.write("fire-rtdb", "20.2.2"));
    }

    public static /* synthetic */ checkFileType read(OggExtractor oggExtractor) {
        return new checkFileType((FirebaseApp) oggExtractor.read(FirebaseApp.class), oggExtractor.IconCompatParcelizer(setFirstFrameOffset.class), oggExtractor.IconCompatParcelizer(verifyBitstreamType.class));
    }
}
