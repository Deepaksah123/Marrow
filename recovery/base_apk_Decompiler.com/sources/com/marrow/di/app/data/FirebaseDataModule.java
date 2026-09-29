package com.marrow.di.app.data;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import kotlin.AdPlaybackStateAdGroup;
import kotlin.AdPlaybackStateExternalSyntheticLambda0;
import kotlin.ChapterFrame1;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.copyDurationsUsWithSpaceForAdCount;
import kotlin.decodeTextInformationFrame;
import kotlin.getMagicModuleMeta;
import kotlin.getPlanOldPrice;
import kotlin.getSampleFormats;
import kotlin.parseDrmSchemeData;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.withAdState;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\rH'¢\u0006\u0004\b\u0007\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/marrow/di/app/data/FirebaseDataModule;", "", "<init>", "()V", "Lo/AdPlaybackStateExternalSyntheticLambda0;", "p0", "Lo/withAdState;", "RemoteActionCompatParcelizer", "(Lo/AdPlaybackStateExternalSyntheticLambda0;)Lo/withAdState;", "Lo/AdPlaybackStateAdGroup;", "Lo/withAdState$RemoteActionCompatParcelizer;", "write", "(Lo/AdPlaybackStateAdGroup;)Lo/withAdState$RemoteActionCompatParcelizer;", "Lo/copyDurationsUsWithSpaceForAdCount;", "Lo/withAdState$read;", "(Lo/copyDurationsUsWithSpaceForAdCount;)Lo/withAdState$read;", "Lo/parseDrmSchemeData;", "Lo/getSampleFormats;", "read", "(Lo/parseDrmSchemeData;)Lo/getSampleFormats;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FirebaseDataModule {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @getPlanOldPrice
    public abstract withAdState.read RemoteActionCompatParcelizer(copyDurationsUsWithSpaceForAdCount p0);

    @getPlanOldPrice
    public abstract withAdState RemoteActionCompatParcelizer(AdPlaybackStateExternalSyntheticLambda0 p0);

    @getPlanOldPrice
    public abstract getSampleFormats read(parseDrmSchemeData p0);

    @getPlanOldPrice
    public abstract withAdState.RemoteActionCompatParcelizer write(AdPlaybackStateAdGroup p0);

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final FirebaseRemoteConfig AudioAttributesCompatParcelizer() {
        return INSTANCE.write();
    }

    /* JADX INFO: renamed from: com.marrow.di.app.data.FirebaseDataModule$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/marrow/di/app/data/FirebaseDataModule$write;", "", "<init>", "()V", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "write", "()Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final FirebaseRemoteConfig write() {
            FirebaseRemoteConfig firebaseRemoteConfigAudioAttributesCompatParcelizer = FirebaseRemoteConfig.AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(firebaseRemoteConfigAudioAttributesCompatParcelizer, "");
            firebaseRemoteConfigAudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer();
            firebaseRemoteConfigAudioAttributesCompatParcelizer.write(new ChapterFrame1.IconCompatParcelizer().RemoteActionCompatParcelizer(decodeTextInformationFrame.AudioAttributesCompatParcelizer).IconCompatParcelizer());
            return firebaseRemoteConfigAudioAttributesCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
