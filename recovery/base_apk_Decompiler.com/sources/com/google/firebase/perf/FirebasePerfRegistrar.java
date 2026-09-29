package com.google.firebase.perf;

import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.ChapterTocFrame1;
import kotlin.DrmUtilApi18;
import kotlin.FlacReaderFlacOggSeeker;
import kotlin.MotionPhotoMetadata1;
import kotlin.OggExtractor;
import kotlin.OggPageHeader;
import kotlin.TrackTransformation;
import kotlin.convertGranuleToTime;
import kotlin.decodeStreamKeys;
import kotlin.getFlacFrameBlockSize;
import kotlin.hasSamples;
import kotlin.onReadyToInitializeCodec;
import kotlin.outputMetadata;
import kotlin.packetFinished;
import kotlin.parseSpliceTime;
import kotlin.updateCodecOperatingRate;
import kotlin.updateDrmSessionV23;

/* JADX INFO: loaded from: classes5.dex */
public class FirebasePerfRegistrar implements ComponentRegistrar {
    static {
        decodeStreamKeys decodestreamkeys = decodeStreamKeys.INSTANCE;
        decodeStreamKeys.AudioAttributesCompatParcelizer(parseSpliceTime.read.PERFORMANCE);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<FlacReaderFlacOggSeeker<?>> RemoteActionCompatParcelizer() {
        final packetFinished packetfinishedRemoteActionCompatParcelizer = packetFinished.RemoteActionCompatParcelizer(getFlacFrameBlockSize.class, Executor.class);
        return Arrays.asList(FlacReaderFlacOggSeeker.read(updateCodecOperatingRate.class).IconCompatParcelizer("fire-perf").RemoteActionCompatParcelizer(convertGranuleToTime.read((Class<?>) FirebaseApp.class)).RemoteActionCompatParcelizer(convertGranuleToTime.AudioAttributesCompatParcelizer(ChapterTocFrame1.class)).RemoteActionCompatParcelizer(convertGranuleToTime.read((Class<?>) hasSamples.class)).RemoteActionCompatParcelizer(convertGranuleToTime.AudioAttributesCompatParcelizer(DrmUtilApi18.class)).RemoteActionCompatParcelizer(convertGranuleToTime.read((Class<?>) updateDrmSessionV23.class)).write(new OggPageHeader() { // from class: o.createDecoderException
            @Override // kotlin.OggPageHeader
            public final Object AudioAttributesCompatParcelizer(OggExtractor oggExtractor) {
                return FirebasePerfRegistrar.RemoteActionCompatParcelizer(oggExtractor);
            }
        }).read(), FlacReaderFlacOggSeeker.read(updateDrmSessionV23.class).IconCompatParcelizer("fire-perf-early").RemoteActionCompatParcelizer(convertGranuleToTime.read((Class<?>) FirebaseApp.class)).RemoteActionCompatParcelizer(convertGranuleToTime.read((Class<?>) MotionPhotoMetadata1.class)).RemoteActionCompatParcelizer(convertGranuleToTime.write((Class<?>) TrackTransformation.class)).RemoteActionCompatParcelizer(convertGranuleToTime.write((packetFinished<?>) packetfinishedRemoteActionCompatParcelizer)).IconCompatParcelizer().write(new OggPageHeader() { // from class: o.supportsFormatDrm
            @Override // kotlin.OggPageHeader
            public final Object AudioAttributesCompatParcelizer(OggExtractor oggExtractor) {
                return FirebasePerfRegistrar.RemoteActionCompatParcelizer(packetfinishedRemoteActionCompatParcelizer, oggExtractor);
            }
        }).read(), outputMetadata.write("fire-perf", "20.4.0"));
    }

    public static /* synthetic */ updateDrmSessionV23 RemoteActionCompatParcelizer(packetFinished packetfinished, OggExtractor oggExtractor) {
        return new updateDrmSessionV23((FirebaseApp) oggExtractor.read(FirebaseApp.class), (MotionPhotoMetadata1) oggExtractor.read(MotionPhotoMetadata1.class), (TrackTransformation) oggExtractor.write(TrackTransformation.class).write(), (Executor) oggExtractor.AudioAttributesCompatParcelizer(packetfinished));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static updateCodecOperatingRate RemoteActionCompatParcelizer(OggExtractor oggExtractor) {
        oggExtractor.read(updateDrmSessionV23.class);
        return onReadyToInitializeCodec.RemoteActionCompatParcelizer().read(new FirebasePerformanceModule((FirebaseApp) oggExtractor.read(FirebaseApp.class), (hasSamples) oggExtractor.read(hasSamples.class), oggExtractor.write(ChapterTocFrame1.class), oggExtractor.write(DrmUtilApi18.class))).AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer();
    }
}
