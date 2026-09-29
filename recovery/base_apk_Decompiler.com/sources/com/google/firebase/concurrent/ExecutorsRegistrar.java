package com.google.firebase.concurrent;

import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlin.Ac3Reader;
import kotlin.Ac4Extractor;
import kotlin.FlacReader;
import kotlin.FlacReaderFlacOggSeeker;
import kotlin.OggPageHeader;
import kotlin.appendNumberOfSamples;
import kotlin.getFlacFrameBlockSize;
import kotlin.isAudioPacket;
import kotlin.onInputBufferAvailable;
import kotlin.packetFinished;
import kotlin.preparePayload;

/* JADX INFO: loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    private static appendNumberOfSamples<ScheduledExecutorService> IconCompatParcelizer = new appendNumberOfSamples<>(new onInputBufferAvailable() { // from class: o.resetSync
        @Override // kotlin.onInputBufferAvailable
        public final Object write() {
            return ExecutorsRegistrar.read(Executors.newFixedThreadPool(4, ExecutorsRegistrar.IconCompatParcelizer("Firebase Background", 10, ExecutorsRegistrar.AudioAttributesImplApi21Parcelizer())));
        }
    });
    private static appendNumberOfSamples<ScheduledExecutorService> write = new appendNumberOfSamples<>(new onInputBufferAvailable() { // from class: o.isAdtsSyncWord
        @Override // kotlin.onInputBufferAvailable
        public final Object write() {
            return ExecutorsRegistrar.read(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.IconCompatParcelizer("Firebase Lite", 0, ExecutorsRegistrar.RatingCompat())));
        }
    });
    private static appendNumberOfSamples<ScheduledExecutorService> RemoteActionCompatParcelizer = new appendNumberOfSamples<>(new onInputBufferAvailable() { // from class: o.parseAdtsHeader
        @Override // kotlin.onInputBufferAvailable
        public final Object write() {
            return ExecutorsRegistrar.read(Executors.newCachedThreadPool(ExecutorsRegistrar.read("Firebase Blocking", 11)));
        }
    });
    private static appendNumberOfSamples<ScheduledExecutorService> read = new appendNumberOfSamples<>(new onInputBufferAvailable() { // from class: o.parseId3Header
        @Override // kotlin.onInputBufferAvailable
        public final Object write() {
            return Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.read("Firebase Scheduler", 0));
        }
    });

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<FlacReaderFlacOggSeeker<?>> RemoteActionCompatParcelizer() {
        return Arrays.asList(FlacReaderFlacOggSeeker.RemoteActionCompatParcelizer(packetFinished.RemoteActionCompatParcelizer(FlacReader.class, ScheduledExecutorService.class), packetFinished.RemoteActionCompatParcelizer(FlacReader.class, ExecutorService.class), packetFinished.RemoteActionCompatParcelizer(FlacReader.class, Executor.class)).write(new OggPageHeader() { // from class: o.setCheckingAdtsHeaderState
            @Override // kotlin.OggPageHeader
            public final Object AudioAttributesCompatParcelizer(OggExtractor oggExtractor) {
                return ExecutorsRegistrar.IconCompatParcelizer.write();
            }
        }).read(), FlacReaderFlacOggSeeker.RemoteActionCompatParcelizer(packetFinished.RemoteActionCompatParcelizer(isAudioPacket.class, ScheduledExecutorService.class), packetFinished.RemoteActionCompatParcelizer(isAudioPacket.class, ExecutorService.class), packetFinished.RemoteActionCompatParcelizer(isAudioPacket.class, Executor.class)).write(new OggPageHeader() { // from class: o.setReadingAdtsHeaderState
            @Override // kotlin.OggPageHeader
            public final Object AudioAttributesCompatParcelizer(OggExtractor oggExtractor) {
                return ExecutorsRegistrar.RemoteActionCompatParcelizer.write();
            }
        }).read(), FlacReaderFlacOggSeeker.RemoteActionCompatParcelizer(packetFinished.RemoteActionCompatParcelizer(preparePayload.class, ScheduledExecutorService.class), packetFinished.RemoteActionCompatParcelizer(preparePayload.class, ExecutorService.class), packetFinished.RemoteActionCompatParcelizer(preparePayload.class, Executor.class)).write(new OggPageHeader() { // from class: o.setFindingSampleState
            @Override // kotlin.OggPageHeader
            public final Object AudioAttributesCompatParcelizer(OggExtractor oggExtractor) {
                return ExecutorsRegistrar.write.write();
            }
        }).read(), FlacReaderFlacOggSeeker.read(packetFinished.RemoteActionCompatParcelizer(getFlacFrameBlockSize.class, Executor.class)).write(new OggPageHeader() { // from class: o.tryRead
            @Override // kotlin.OggPageHeader
            public final Object AudioAttributesCompatParcelizer(OggExtractor oggExtractor) {
                return buildSeiReader.INSTANCE;
            }
        }).read());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ScheduledExecutorService read(ExecutorService executorService) {
        return new Ac4Extractor(executorService, read.write());
    }

    private static ThreadFactory read(String str, int i) {
        return new Ac3Reader(str, i, null);
    }

    private static ThreadFactory IconCompatParcelizer(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return new Ac3Reader(str, i, threadPolicy);
    }

    private static StrictMode.ThreadPolicy AudioAttributesImplApi21Parcelizer() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        builderDetectNetwork.detectResourceMismatches();
        builderDetectNetwork.detectUnbufferedIo();
        return builderDetectNetwork.penaltyLog().build();
    }

    private static StrictMode.ThreadPolicy RatingCompat() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }
}
