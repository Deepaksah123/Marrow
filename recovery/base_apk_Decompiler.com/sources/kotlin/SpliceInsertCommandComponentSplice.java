package kotlin;

import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8\u0007@BX\u0087.¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0014\u0010\f\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0011\u0010\u0014\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lo/SpliceInsertCommandComponentSplice;", "", "", "p0", "Lo/DefaultDownloadIndex;", "p1", "Lkotlin/Function0;", "Ljava/util/UUID;", "p2", "<init>", "(ZLo/DefaultDownloadIndex;Lo/getCreatedOnDateMs;)V", "Lo/SpliceInsertCommand1;", "RemoteActionCompatParcelizer", "()Lo/SpliceInsertCommand1;", "", "IconCompatParcelizer", "()Ljava/lang/String;", "Z", "AudioAttributesCompatParcelizer", "()Z", "write", "Lo/SpliceInsertCommand1;", "read", "Ljava/lang/String;", "", "I", "Lo/DefaultDownloadIndex;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/getCreatedOnDateMs;", "AudioAttributesImplApi26Parcelizer"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SpliceInsertCommandComponentSplice {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final DefaultDownloadIndex MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final getCreatedOnDateMs<UUID> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final boolean AudioAttributesCompatParcelizer;
    private int read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private SpliceInsertCommand1 IconCompatParcelizer;

    private SpliceInsertCommandComponentSplice(boolean z, DefaultDownloadIndex defaultDownloadIndex, getCreatedOnDateMs<UUID> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(defaultDownloadIndex, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        this.AudioAttributesCompatParcelizer = z;
        this.MediaBrowserCompatCustomActionResultReceiver = defaultDownloadIndex;
        this.AudioAttributesImplApi26Parcelizer = getcreatedondatems;
        this.RemoteActionCompatParcelizer = IconCompatParcelizer();
        this.read = -1;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: o.SpliceInsertCommandComponentSplice$3, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    final /* synthetic */ class AnonymousClass3 extends MagicModuleRepositoryImpl_Factory implements getCreatedOnDateMs<UUID> {
        public static final AnonymousClass3 read = new AnonymousClass3();

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            return UUID.randomUUID();
        }

        AnonymousClass3() {
            super(0, UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
        }
    }

    public /* synthetic */ SpliceInsertCommandComponentSplice(boolean z, DefaultDownloadIndex defaultDownloadIndex, AnonymousClass3 anonymousClass3, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(z, defaultDownloadIndex, (i & 4) != 0 ? AnonymousClass3.read : anonymousClass3);
    }

    public final SpliceInsertCommand1 read() {
        SpliceInsertCommand1 spliceInsertCommand1 = this.IconCompatParcelizer;
        if (spliceInsertCommand1 != null) {
            return spliceInsertCommand1;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    public final boolean write() {
        return this.IconCompatParcelizer != null;
    }

    public final SpliceInsertCommand1 RemoteActionCompatParcelizer() {
        int i = this.read + 1;
        this.read = i;
        this.IconCompatParcelizer = new SpliceInsertCommand1(i == 0 ? this.RemoteActionCompatParcelizer : IconCompatParcelizer(), this.RemoteActionCompatParcelizer, this.read, this.MediaBrowserCompatCustomActionResultReceiver.write());
        return read();
    }

    private final String IconCompatParcelizer() {
        String string = this.AudioAttributesImplApi26Parcelizer.invoke().toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String lowerCase = TestGroupLSModel.read(string, "-", "", false).toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        return lowerCase;
    }
}
