package kotlin;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u0007B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\tH&¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\n\u0010\u0011J-\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\tH&¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0015H&¢\u0006\u0004\b\u0007\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\fH&¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H&¢\u0006\u0004\b\u0019\u0010\u001a"}, d2 = {"Lo/getChildIndexByWindowIndex;", "", "<init>", "()V", "Lo/getChildIndexByChildUid;", "p0", "Lo/onTransact;", "RemoteActionCompatParcelizer", "(Lo/getChildIndexByChildUid;)Lo/onTransact;", "", "AudioAttributesCompatParcelizer", "(Ljava/util/List;)Lo/onTransact;", "", "Lo/g2;", "p1", "Lo/onServiceDisconnected;", "p2", "(Ljava/lang/String;Lo/g2;Lo/onServiceDisconnected;)Lo/onTransact;", "write", "(Ljava/lang/String;Lo/g2;Ljava/util/List;)Lo/onTransact;", "Lo/fa;", "Lo/AbstractConcatenatedTimeline;", "(Ljava/lang/String;Lo/fa;Lo/AbstractConcatenatedTimeline;)Lo/onTransact;", "IconCompatParcelizer", "(Ljava/lang/String;)Lo/onTransact;", "read", "()Lo/onTransact;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class getChildIndexByWindowIndex {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public abstract onTransact AudioAttributesCompatParcelizer(List<? extends getChildIndexByChildUid> p0);

    public abstract onTransact IconCompatParcelizer(String p0);

    public abstract onTransact RemoteActionCompatParcelizer(String p0, fa p1, AbstractConcatenatedTimeline p2);

    public abstract onTransact read();

    public abstract onTransact write(String p0, g2 p1, List<onServiceDisconnected> p2);

    /* JADX INFO: renamed from: o.getChildIndexByWindowIndex$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/getChildIndexByWindowIndex$read;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/getChildIndexByWindowIndex;", "RemoteActionCompatParcelizer", "(Landroid/content/Context;)Lo/getChildIndexByWindowIndex;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static getChildIndexByWindowIndex RemoteActionCompatParcelizer(Context p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            hasPrevious hasprevious = hasPrevious.read(p0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(hasprevious, "");
            return hasprevious;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final onTransact RemoteActionCompatParcelizer(getChildIndexByChildUid p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return AudioAttributesCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(p0));
    }

    public final onTransact AudioAttributesCompatParcelizer(String p0, g2 p1, onServiceDisconnected p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        return write(p0, p1, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(p2));
    }

    @getMagicModuleMeta
    public static getChildIndexByWindowIndex AudioAttributesCompatParcelizer(Context context) {
        return Companion.RemoteActionCompatParcelizer(context);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/getChildIndexByWindowIndex$RemoteActionCompatParcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "read"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        private static final /* synthetic */ RemoteActionCompatParcelizer[] AudioAttributesCompatParcelizer;
        public static final RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new RemoteActionCompatParcelizer("NOT_APPLIED", 0);
        public static final RemoteActionCompatParcelizer IconCompatParcelizer = new RemoteActionCompatParcelizer("APPLIED_IMMEDIATELY", 1);
        public static final RemoteActionCompatParcelizer read = new RemoteActionCompatParcelizer("APPLIED_FOR_NEXT_RUN", 2);

        private RemoteActionCompatParcelizer(String str, int i) {
        }

        static {
            RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            AudioAttributesCompatParcelizer = remoteActionCompatParcelizerArrRemoteActionCompatParcelizer;
            getMagicModuleTimeline.IconCompatParcelizer(remoteActionCompatParcelizerArrRemoteActionCompatParcelizer);
        }

        private static final /* synthetic */ RemoteActionCompatParcelizer[] RemoteActionCompatParcelizer() {
            return new RemoteActionCompatParcelizer[]{RemoteActionCompatParcelizer, IconCompatParcelizer, read};
        }

        public static RemoteActionCompatParcelizer valueOf(String str) {
            return (RemoteActionCompatParcelizer) Enum.valueOf(RemoteActionCompatParcelizer.class, str);
        }

        public static RemoteActionCompatParcelizer[] values() {
            return (RemoteActionCompatParcelizer[]) AudioAttributesCompatParcelizer.clone();
        }
    }
}
