package com.google.firebase.installations;

import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.AsynchronousMediaCodecCallback;
import kotlin.BatchBuffer;
import kotlin.FlacReader;
import kotlin.FlacReaderFlacOggSeeker;
import kotlin.OggExtractor;
import kotlin.OggPageHeader;
import kotlin.convertGranuleToTime;
import kotlin.hasSamples;
import kotlin.isAudioPacket;
import kotlin.outputMetadata;
import kotlin.packetFinished;
import kotlin.setQueueParams;
import kotlin.setReadingSampleState;

/* JADX INFO: loaded from: classes5.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<FlacReaderFlacOggSeeker<?>> RemoteActionCompatParcelizer() {
        return Arrays.asList(FlacReaderFlacOggSeeker.read(hasSamples.class).IconCompatParcelizer("fire-installations").RemoteActionCompatParcelizer(convertGranuleToTime.read((Class<?>) FirebaseApp.class)).RemoteActionCompatParcelizer(convertGranuleToTime.write((Class<?>) AsynchronousMediaCodecCallback.class)).RemoteActionCompatParcelizer(convertGranuleToTime.write((packetFinished<?>) packetFinished.RemoteActionCompatParcelizer(FlacReader.class, ExecutorService.class))).RemoteActionCompatParcelizer(convertGranuleToTime.write((packetFinished<?>) packetFinished.RemoteActionCompatParcelizer(isAudioPacket.class, Executor.class))).write(new OggPageHeader() { // from class: o.DefaultMediaCodecAdapterFactory
            @Override // kotlin.OggPageHeader
            public final Object AudioAttributesCompatParcelizer(OggExtractor oggExtractor) {
                return FirebaseInstallationsRegistrar.write(oggExtractor);
            }
        }).read(), setQueueParams.AudioAttributesCompatParcelizer(), outputMetadata.write("fire-installations", "17.1.3"));
    }

    public static /* synthetic */ hasSamples write(OggExtractor oggExtractor) {
        return new BatchBuffer((FirebaseApp) oggExtractor.read(FirebaseApp.class), oggExtractor.write(AsynchronousMediaCodecCallback.class), (ExecutorService) oggExtractor.AudioAttributesCompatParcelizer(packetFinished.RemoteActionCompatParcelizer(FlacReader.class, ExecutorService.class)), setReadingSampleState.AudioAttributesCompatParcelizer((Executor) oggExtractor.AudioAttributesCompatParcelizer(packetFinished.RemoteActionCompatParcelizer(isAudioPacket.class, Executor.class))));
    }
}
