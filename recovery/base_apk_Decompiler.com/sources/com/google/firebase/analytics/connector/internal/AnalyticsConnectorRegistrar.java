package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import kotlin.AsynchronousMediaCodecBufferEnqueuerMessageParams;
import kotlin.FlacReaderFlacOggSeeker;
import kotlin.OggPageHeader;
import kotlin.TrackSampleTable;
import kotlin.convertGranuleToTime;
import kotlin.outputMetadata;

/* JADX INFO: loaded from: classes5.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<FlacReaderFlacOggSeeker<?>> RemoteActionCompatParcelizer() {
        return Arrays.asList(FlacReaderFlacOggSeeker.read(TrackSampleTable.class).RemoteActionCompatParcelizer(convertGranuleToTime.read((Class<?>) FirebaseApp.class)).RemoteActionCompatParcelizer(convertGranuleToTime.read((Class<?>) Context.class)).RemoteActionCompatParcelizer(convertGranuleToTime.read((Class<?>) AsynchronousMediaCodecBufferEnqueuerMessageParams.class)).write(new OggPageHeader() { // from class: o.initEncryptionData
            @Override // kotlin.OggPageHeader
            public final Object AudioAttributesCompatParcelizer(OggExtractor oggExtractor) {
                return getSamplePresentationTimeUs.read((FirebaseApp) oggExtractor.read(FirebaseApp.class), (Context) oggExtractor.read(Context.class), (AsynchronousMediaCodecBufferEnqueuerMessageParams) oggExtractor.read(AsynchronousMediaCodecBufferEnqueuerMessageParams.class));
            }
        }).IconCompatParcelizer().read(), outputMetadata.write("fire-analytics", "21.3.0"));
    }
}
