package com.google.firebase.ktx;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.FlacReader;
import kotlin.FlacReaderFlacOggSeeker;
import kotlin.IntermediateLoginResponseBody;
import kotlin.Metadata;
import kotlin.OggExtractor;
import kotlin.OggPageHeader;
import kotlin.convertGranuleToTime;
import kotlin.getDegree;
import kotlin.getFlacFrameBlockSize;
import kotlin.getPlatform;
import kotlin.isAudioPacket;
import kotlin.outputMetadata;
import kotlin.packetFinished;
import kotlin.preparePayload;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lo/FlacReaderFlacOggSeeker;", "RemoteActionCompatParcelizer", "()Ljava/util/List;"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<FlacReaderFlacOggSeeker<?>> RemoteActionCompatParcelizer() {
        FlacReaderFlacOggSeeker<?> flacReaderFlacOggSeekerWrite = outputMetadata.write("fire-core-ktx", "unspecified");
        FlacReaderFlacOggSeeker flacReaderFlacOggSeeker = FlacReaderFlacOggSeeker.read(packetFinished.RemoteActionCompatParcelizer(FlacReader.class, getPlatform.class)).RemoteActionCompatParcelizer(convertGranuleToTime.write((packetFinished<?>) packetFinished.RemoteActionCompatParcelizer(FlacReader.class, Executor.class))).write(new OggPageHeader() { // from class: com.google.firebase.ktx.FirebaseCommonKtxRegistrar.5
            @Override // kotlin.OggPageHeader
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final getPlatform AudioAttributesCompatParcelizer(OggExtractor oggExtractor) {
                Object objAudioAttributesCompatParcelizer = oggExtractor.AudioAttributesCompatParcelizer(packetFinished.RemoteActionCompatParcelizer(FlacReader.class, Executor.class));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objAudioAttributesCompatParcelizer, "");
                return getDegree.write((Executor) objAudioAttributesCompatParcelizer);
            }
        }).read();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(flacReaderFlacOggSeeker, "");
        FlacReaderFlacOggSeeker flacReaderFlacOggSeeker2 = FlacReaderFlacOggSeeker.read(packetFinished.RemoteActionCompatParcelizer(preparePayload.class, getPlatform.class)).RemoteActionCompatParcelizer(convertGranuleToTime.write((packetFinished<?>) packetFinished.RemoteActionCompatParcelizer(preparePayload.class, Executor.class))).write(new OggPageHeader() { // from class: com.google.firebase.ktx.FirebaseCommonKtxRegistrar.2
            @Override // kotlin.OggPageHeader
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final getPlatform AudioAttributesCompatParcelizer(OggExtractor oggExtractor) {
                Object objAudioAttributesCompatParcelizer = oggExtractor.AudioAttributesCompatParcelizer(packetFinished.RemoteActionCompatParcelizer(preparePayload.class, Executor.class));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objAudioAttributesCompatParcelizer, "");
                return getDegree.write((Executor) objAudioAttributesCompatParcelizer);
            }
        }).read();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(flacReaderFlacOggSeeker2, "");
        FlacReaderFlacOggSeeker flacReaderFlacOggSeeker3 = FlacReaderFlacOggSeeker.read(packetFinished.RemoteActionCompatParcelizer(isAudioPacket.class, getPlatform.class)).RemoteActionCompatParcelizer(convertGranuleToTime.write((packetFinished<?>) packetFinished.RemoteActionCompatParcelizer(isAudioPacket.class, Executor.class))).write(new OggPageHeader() { // from class: com.google.firebase.ktx.FirebaseCommonKtxRegistrar.3
            @Override // kotlin.OggPageHeader
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public final getPlatform AudioAttributesCompatParcelizer(OggExtractor oggExtractor) {
                Object objAudioAttributesCompatParcelizer = oggExtractor.AudioAttributesCompatParcelizer(packetFinished.RemoteActionCompatParcelizer(isAudioPacket.class, Executor.class));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objAudioAttributesCompatParcelizer, "");
                return getDegree.write((Executor) objAudioAttributesCompatParcelizer);
            }
        }).read();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(flacReaderFlacOggSeeker3, "");
        FlacReaderFlacOggSeeker flacReaderFlacOggSeeker4 = FlacReaderFlacOggSeeker.read(packetFinished.RemoteActionCompatParcelizer(getFlacFrameBlockSize.class, getPlatform.class)).RemoteActionCompatParcelizer(convertGranuleToTime.write((packetFinished<?>) packetFinished.RemoteActionCompatParcelizer(getFlacFrameBlockSize.class, Executor.class))).write(new OggPageHeader() { // from class: com.google.firebase.ktx.FirebaseCommonKtxRegistrar.4
            @Override // kotlin.OggPageHeader
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final getPlatform AudioAttributesCompatParcelizer(OggExtractor oggExtractor) {
                Object objAudioAttributesCompatParcelizer = oggExtractor.AudioAttributesCompatParcelizer(packetFinished.RemoteActionCompatParcelizer(getFlacFrameBlockSize.class, Executor.class));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objAudioAttributesCompatParcelizer, "");
                return getDegree.write((Executor) objAudioAttributesCompatParcelizer);
            }
        }).read();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(flacReaderFlacOggSeeker4, "");
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new FlacReaderFlacOggSeeker[]{flacReaderFlacOggSeekerWrite, flacReaderFlacOggSeeker, flacReaderFlacOggSeeker2, flacReaderFlacOggSeeker3, flacReaderFlacOggSeeker4});
    }
}
