package com.google.firebase.abt.component;

import android.content.Context;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import kotlin.FlacReaderFlacOggSeeker;
import kotlin.OggExtractor;
import kotlin.OggPageHeader;
import kotlin.TrackEncryptionBox;
import kotlin.TrackSampleTable;
import kotlin.convertGranuleToTime;
import kotlin.outputMetadata;

/* JADX INFO: loaded from: classes5.dex */
public class AbtRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<FlacReaderFlacOggSeeker<?>> RemoteActionCompatParcelizer() {
        return Arrays.asList(FlacReaderFlacOggSeeker.read(TrackEncryptionBox.class).IconCompatParcelizer("fire-abt").RemoteActionCompatParcelizer(convertGranuleToTime.read((Class<?>) Context.class)).RemoteActionCompatParcelizer(convertGranuleToTime.write((Class<?>) TrackSampleTable.class)).write(new OggPageHeader() { // from class: o.initTables
            @Override // kotlin.OggPageHeader
            public final Object AudioAttributesCompatParcelizer(OggExtractor oggExtractor) {
                return AbtRegistrar.AudioAttributesCompatParcelizer(oggExtractor);
            }
        }).read(), outputMetadata.write("fire-abt", "21.1.1"));
    }

    public static /* synthetic */ TrackEncryptionBox AudioAttributesCompatParcelizer(OggExtractor oggExtractor) {
        return new TrackEncryptionBox((Context) oggExtractor.read(Context.class), oggExtractor.write(TrackSampleTable.class));
    }
}
