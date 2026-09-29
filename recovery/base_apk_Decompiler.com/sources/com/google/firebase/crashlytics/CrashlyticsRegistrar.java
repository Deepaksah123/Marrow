package com.google.firebase.crashlytics;

import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import java.util.Arrays;
import java.util.List;
import kotlin.DefaultTsPayloadReaderFactoryFlags;
import kotlin.DtsReader;
import kotlin.FlacReaderFlacOggSeeker;
import kotlin.MotionPhotoMetadata1;
import kotlin.OggExtractor;
import kotlin.OggPageHeader;
import kotlin.TrackSampleTable;
import kotlin.convertGranuleToTime;
import kotlin.decodeStreamKeys;
import kotlin.hasSamples;
import kotlin.outputMetadata;
import kotlin.parseSpliceTime;

/* JADX INFO: loaded from: classes5.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    static {
        decodeStreamKeys decodestreamkeys = decodeStreamKeys.INSTANCE;
        decodeStreamKeys.AudioAttributesCompatParcelizer(parseSpliceTime.read.CRASHLYTICS);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<FlacReaderFlacOggSeeker<?>> RemoteActionCompatParcelizer() {
        return Arrays.asList(FlacReaderFlacOggSeeker.read(DtsReader.class).IconCompatParcelizer("fire-cls").RemoteActionCompatParcelizer(convertGranuleToTime.read((Class<?>) FirebaseApp.class)).RemoteActionCompatParcelizer(convertGranuleToTime.read((Class<?>) hasSamples.class)).RemoteActionCompatParcelizer(convertGranuleToTime.read((Class<?>) MotionPhotoMetadata1.class)).RemoteActionCompatParcelizer(convertGranuleToTime.IconCompatParcelizer(DefaultTsPayloadReaderFactoryFlags.class)).RemoteActionCompatParcelizer(convertGranuleToTime.IconCompatParcelizer(TrackSampleTable.class)).write(new OggPageHeader() { // from class: o.createPayloadReader
            @Override // kotlin.OggPageHeader
            public final Object AudioAttributesCompatParcelizer(OggExtractor oggExtractor) {
                return CrashlyticsRegistrar.RemoteActionCompatParcelizer(oggExtractor);
            }
        }).IconCompatParcelizer().read(), outputMetadata.write("fire-cls", "18.4.0"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DtsReader RemoteActionCompatParcelizer(OggExtractor oggExtractor) {
        return DtsReader.AudioAttributesCompatParcelizer((FirebaseApp) oggExtractor.read(FirebaseApp.class), (hasSamples) oggExtractor.read(hasSamples.class), (MotionPhotoMetadata1) oggExtractor.read(MotionPhotoMetadata1.class), oggExtractor.IconCompatParcelizer(DefaultTsPayloadReaderFactoryFlags.class), oggExtractor.IconCompatParcelizer(TrackSampleTable.class));
    }
}
