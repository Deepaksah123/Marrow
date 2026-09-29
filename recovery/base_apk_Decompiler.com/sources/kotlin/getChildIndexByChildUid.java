package kotlin;

import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u000f\b&\u0018\u0000 \u00142\u00020\u0001:\u0002\u0012\u0014B'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u000f\u001a\u00020\u00048GX\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068GX\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0012\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0016"}, d2 = {"Lo/getChildIndexByChildUid;", "", "Ljava/util/UUID;", "p0", "Lo/CVideoChangeFrameRateStrategy;", "p1", "", "", "p2", "<init>", "(Ljava/util/UUID;Lo/CVideoChangeFrameRateStrategy;Ljava/util/Set;)V", "AudioAttributesCompatParcelizer", "Ljava/util/UUID;", "()Ljava/util/UUID;", "write", "read", "Lo/CVideoChangeFrameRateStrategy;", "()Lo/CVideoChangeFrameRateStrategy;", "RemoteActionCompatParcelizer", "Ljava/util/Set;", "IconCompatParcelizer", "()Ljava/util/Set;", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class getChildIndexByChildUid {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final UUID write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Set<String> IconCompatParcelizer;
    private final CVideoChangeFrameRateStrategy read;

    public getChildIndexByChildUid(UUID uuid, CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy, Set<String> set) {
        toMagicModuleMetaRepoModel.write(uuid, "");
        toMagicModuleMetaRepoModel.write(cVideoChangeFrameRateStrategy, "");
        toMagicModuleMetaRepoModel.write(set, "");
        this.write = uuid;
        this.read = cVideoChangeFrameRateStrategy;
        this.IconCompatParcelizer = set;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public UUID getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final CVideoChangeFrameRateStrategy getRead() {
        return this.read;
    }

    public final Set<String> IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        String string = getWrite().toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class RemoteActionCompatParcelizer<B extends RemoteActionCompatParcelizer<B, ?>, W extends getChildIndexByChildUid> {
        private CVideoChangeFrameRateStrategy AudioAttributesCompatParcelizer;
        private final Class<? extends j> IconCompatParcelizer;
        private UUID RemoteActionCompatParcelizer;
        private final Set<String> read;
        private boolean write;

        public abstract W IconCompatParcelizer();

        public abstract B read();

        public RemoteActionCompatParcelizer(Class<? extends j> cls) {
            toMagicModuleMetaRepoModel.write(cls, "");
            this.IconCompatParcelizer = cls;
            UUID uuidRandomUUID = UUID.randomUUID();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(uuidRandomUUID, "");
            this.RemoteActionCompatParcelizer = uuidRandomUUID;
            String string = uuidRandomUUID.toString();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            String name = cls.getName();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name, "");
            this.AudioAttributesCompatParcelizer = new CVideoChangeFrameRateStrategy(string, name);
            String name2 = cls.getName();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name2, "");
            this.read = getKycMessage.write(name2);
        }

        public final boolean AudioAttributesCompatParcelizer() {
            return this.write;
        }

        public final UUID RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final CVideoChangeFrameRateStrategy MediaBrowserCompatItemReceiver() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final Set<String> AudioAttributesImplApi26Parcelizer() {
            return this.read;
        }

        private B AudioAttributesCompatParcelizer(UUID uuid) {
            toMagicModuleMetaRepoModel.write(uuid, "");
            this.RemoteActionCompatParcelizer = uuid;
            String string = uuid.toString();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            this.AudioAttributesCompatParcelizer = new CVideoChangeFrameRateStrategy(string, this.AudioAttributesCompatParcelizer);
            return (B) read();
        }

        public final B IconCompatParcelizer(e eVar) {
            toMagicModuleMetaRepoModel.write(eVar, "");
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer = eVar;
            return (B) read();
        }

        public final B read(e1 e1Var) {
            toMagicModuleMetaRepoModel.write(e1Var, "");
            this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer = e1Var;
            return (B) read();
        }

        public final B write(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.read.add(str);
            return (B) read();
        }

        public final B IconCompatParcelizer(long j, TimeUnit timeUnit) {
            toMagicModuleMetaRepoModel.write(timeUnit, "");
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver = timeUnit.toMillis(j);
            if (Long.MAX_VALUE - System.currentTimeMillis() <= this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver) {
                throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
            }
            return (B) read();
        }

        public final W write() {
            W w = (W) IconCompatParcelizer();
            e eVar = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
            boolean z = eVar.MediaBrowserCompatCustomActionResultReceiver() || eVar.getAudioAttributesImplApi21Parcelizer() || eVar.getWrite() || eVar.getRemoteActionCompatParcelizer();
            if (this.AudioAttributesCompatParcelizer.write) {
                if (z) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
                }
                if (this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());
                }
            }
            String onPlayFromSearch = this.AudioAttributesCompatParcelizer.getOnPlayFromSearch();
            if (onPlayFromSearch == null) {
                CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy = this.AudioAttributesCompatParcelizer;
                Companion companion = getChildIndexByChildUid.INSTANCE;
                cVideoChangeFrameRateStrategy.write(Companion.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver));
            } else if (onPlayFromSearch.length() > 127) {
                this.AudioAttributesCompatParcelizer.write(TestGroupLSModel.RemoteActionCompatParcelizer(onPlayFromSearch, 127));
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(uuidRandomUUID, "");
            AudioAttributesCompatParcelizer(uuidRandomUUID);
            return w;
        }
    }

    /* JADX INFO: renamed from: o.getChildIndexByChildUid$IconCompatParcelizer, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/getChildIndexByChildUid$IconCompatParcelizer;", "", "<init>", "()V", "", "p0", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String RemoteActionCompatParcelizer(String p0) {
            String str;
            List listWrite = TestGroupLSModel.write(p0, new String[]{"."}, 0, 6);
            if (listWrite.size() == 1) {
                str = (String) listWrite.get(0);
            } else {
                str = (String) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem(listWrite);
            }
            return str.length() <= 127 ? str : TestGroupLSModel.RemoteActionCompatParcelizer(str, 127);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
