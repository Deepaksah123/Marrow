package com.google.firebase.messaging;

import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.Arrays;
import java.util.List;
import kotlin.AsynchronousMediaCodecBufferEnqueuerMessageParams;
import kotlin.DrmUtilApi18;
import kotlin.EventMessageDecoder;
import kotlin.FlacReaderFlacOggSeeker;
import kotlin.OggExtractor;
import kotlin.OggPageHeader;
import kotlin.convertGranuleToTime;
import kotlin.hasSamples;
import kotlin.maybeThrowInternalException;
import kotlin.needsDisableAdaptationWorkaround;
import kotlin.outputMetadata;
import kotlin.setInternalException;

/* JADX INFO: loaded from: classes5.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<FlacReaderFlacOggSeeker<?>> RemoteActionCompatParcelizer() {
        return Arrays.asList(FlacReaderFlacOggSeeker.read(needsDisableAdaptationWorkaround.class).IconCompatParcelizer("fire-fcm").RemoteActionCompatParcelizer(convertGranuleToTime.read((Class<?>) FirebaseApp.class)).RemoteActionCompatParcelizer(convertGranuleToTime.RemoteActionCompatParcelizer((Class<?>) setInternalException.class)).RemoteActionCompatParcelizer(convertGranuleToTime.write((Class<?>) EventMessageDecoder.class)).RemoteActionCompatParcelizer(convertGranuleToTime.write((Class<?>) maybeThrowInternalException.class)).RemoteActionCompatParcelizer(convertGranuleToTime.RemoteActionCompatParcelizer((Class<?>) DrmUtilApi18.class)).RemoteActionCompatParcelizer(convertGranuleToTime.read((Class<?>) hasSamples.class)).RemoteActionCompatParcelizer(convertGranuleToTime.read((Class<?>) AsynchronousMediaCodecBufferEnqueuerMessageParams.class)).write(new OggPageHeader() { // from class: o.areResolutionAndFrameRateCovered
            @Override // kotlin.OggPageHeader
            public final Object AudioAttributesCompatParcelizer(OggExtractor oggExtractor) {
                return FirebaseMessagingRegistrar.write(oggExtractor);
            }
        }).AudioAttributesCompatParcelizer().read(), outputMetadata.write("fire-fcm", "23.2.1"));
    }

    public static /* synthetic */ needsDisableAdaptationWorkaround write(OggExtractor oggExtractor) {
        return new needsDisableAdaptationWorkaround((FirebaseApp) oggExtractor.read(FirebaseApp.class), (setInternalException) oggExtractor.read(setInternalException.class), oggExtractor.write(EventMessageDecoder.class), oggExtractor.write(maybeThrowInternalException.class), (hasSamples) oggExtractor.read(hasSamples.class), (DrmUtilApi18) oggExtractor.read(DrmUtilApi18.class), (AsynchronousMediaCodecBufferEnqueuerMessageParams) oggExtractor.read(AsynchronousMediaCodecBufferEnqueuerMessageParams.class));
    }
}
