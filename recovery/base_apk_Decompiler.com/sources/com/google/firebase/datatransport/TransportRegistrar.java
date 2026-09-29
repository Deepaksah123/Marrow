package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;
import kotlin.DrmUtilApi18;
import kotlin.DrmUtilApi23;
import kotlin.FlacReaderFlacOggSeeker;
import kotlin.OggExtractor;
import kotlin.OggPageHeader;
import kotlin.addLaUrlAttributeIfMissing;
import kotlin.convertGranuleToTime;
import kotlin.outputMetadata;

/* JADX INFO: loaded from: classes5.dex */
public class TransportRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<FlacReaderFlacOggSeeker<?>> RemoteActionCompatParcelizer() {
        return Arrays.asList(FlacReaderFlacOggSeeker.read(DrmUtilApi18.class).IconCompatParcelizer("fire-transport").RemoteActionCompatParcelizer(convertGranuleToTime.read((Class<?>) Context.class)).write(new OggPageHeader() { // from class: o.createQueueingThreadLabel
            @Override // kotlin.OggPageHeader
            public final Object AudioAttributesCompatParcelizer(OggExtractor oggExtractor) {
                return TransportRegistrar.AudioAttributesCompatParcelizer(oggExtractor);
            }
        }).read(), outputMetadata.write("fire-transport", "18.1.8"));
    }

    public static /* synthetic */ DrmUtilApi18 AudioAttributesCompatParcelizer(OggExtractor oggExtractor) {
        addLaUrlAttributeIfMissing.AudioAttributesCompatParcelizer((Context) oggExtractor.read(Context.class));
        return addLaUrlAttributeIfMissing.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(DrmUtilApi23.RemoteActionCompatParcelizer);
    }
}
