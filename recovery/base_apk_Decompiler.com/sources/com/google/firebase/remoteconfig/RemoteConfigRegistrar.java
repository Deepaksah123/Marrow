package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.ChapterTocFrame1;
import kotlin.FlacReaderFlacOggSeeker;
import kotlin.OggExtractor;
import kotlin.OggPageHeader;
import kotlin.TrackEncryptionBox;
import kotlin.TrackSampleTable;
import kotlin.convertGranuleToTime;
import kotlin.hasSamples;
import kotlin.isAudioPacket;
import kotlin.outputMetadata;
import kotlin.packetFinished;

/* JADX INFO: loaded from: classes5.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<FlacReaderFlacOggSeeker<?>> RemoteActionCompatParcelizer() {
        final packetFinished packetfinishedRemoteActionCompatParcelizer = packetFinished.RemoteActionCompatParcelizer(isAudioPacket.class, ScheduledExecutorService.class);
        return Arrays.asList(FlacReaderFlacOggSeeker.read(ChapterTocFrame1.class).IconCompatParcelizer("fire-rc").RemoteActionCompatParcelizer(convertGranuleToTime.read((Class<?>) Context.class)).RemoteActionCompatParcelizer(convertGranuleToTime.write((packetFinished<?>) packetfinishedRemoteActionCompatParcelizer)).RemoteActionCompatParcelizer(convertGranuleToTime.read((Class<?>) FirebaseApp.class)).RemoteActionCompatParcelizer(convertGranuleToTime.read((Class<?>) hasSamples.class)).RemoteActionCompatParcelizer(convertGranuleToTime.read((Class<?>) TrackEncryptionBox.class)).RemoteActionCompatParcelizer(convertGranuleToTime.write((Class<?>) TrackSampleTable.class)).write(new OggPageHeader() { // from class: o.decodeBinaryFrame
            @Override // kotlin.OggPageHeader
            public final Object AudioAttributesCompatParcelizer(OggExtractor oggExtractor) {
                return RemoteConfigRegistrar.AudioAttributesCompatParcelizer(packetfinishedRemoteActionCompatParcelizer, oggExtractor);
            }
        }).IconCompatParcelizer().read(), outputMetadata.write("fire-rc", "21.4.1"));
    }

    public static /* synthetic */ ChapterTocFrame1 AudioAttributesCompatParcelizer(packetFinished packetfinished, OggExtractor oggExtractor) {
        return new ChapterTocFrame1((Context) oggExtractor.read(Context.class), (ScheduledExecutorService) oggExtractor.AudioAttributesCompatParcelizer(packetfinished), (FirebaseApp) oggExtractor.read(FirebaseApp.class), (hasSamples) oggExtractor.read(hasSamples.class), ((TrackEncryptionBox) oggExtractor.read(TrackEncryptionBox.class)).AudioAttributesCompatParcelizer("frc"), oggExtractor.write(TrackSampleTable.class));
    }
}
