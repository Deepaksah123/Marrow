package kotlin;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.google.firebase.FirebaseApp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00108\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0007\u0010\u0013"}, d2 = {"Lo/PrivateCommand1;", "", "<init>", "()V", "Lcom/google/firebase/FirebaseApp;", "p0", "Lo/TextInformationFrame1;", "AudioAttributesCompatParcelizer", "(Lcom/google/firebase/FirebaseApp;)Lo/TextInformationFrame1;", "Lo/SpliceInsertCommand1;", "p1", "Lo/ensureInitialized;", "p2", "Lo/parseFromSection;", "read", "(Lcom/google/firebase/FirebaseApp;Lo/SpliceInsertCommand1;Lo/ensureInitialized;)Lo/parseFromSection;", "Lo/maybeBlockOnQueueing;", "RemoteActionCompatParcelizer", "Lo/maybeBlockOnQueueing;", "()Lo/maybeBlockOnQueueing;", "IconCompatParcelizer"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PrivateCommand1 {
    public static final PrivateCommand1 INSTANCE = new PrivateCommand1();

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private static final maybeBlockOnQueueing IconCompatParcelizer;

    private PrivateCommand1() {
    }

    public static maybeBlockOnQueueing AudioAttributesCompatParcelizer() {
        return IconCompatParcelizer;
    }

    static {
        maybeBlockOnQueueing maybeblockonqueueingAudioAttributesCompatParcelizer = new queueSecureInputBuffer().read(MdtaMetadataEntry1.RemoteActionCompatParcelizer).read().AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(maybeblockonqueueingAudioAttributesCompatParcelizer, "");
        IconCompatParcelizer = maybeblockonqueueingAudioAttributesCompatParcelizer;
    }

    public static parseFromSection read(FirebaseApp p0, SpliceInsertCommand1 p1, ensureInitialized p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        return new parseFromSection(SlowMotionDataSegment1.SESSION_START, new SpliceScheduleCommandComponentSplice(p1.IconCompatParcelizer(), p1.read(), p1.RemoteActionCompatParcelizer(), p1.write(), new UrlLinkFrame1(null, null, p2.IconCompatParcelizer(), 3, null), null, 32, null), AudioAttributesCompatParcelizer(p0));
    }

    public static TextInformationFrame1 AudioAttributesCompatParcelizer(FirebaseApp p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Context contextAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextAudioAttributesCompatParcelizer, "");
        String packageName = contextAudioAttributesCompatParcelizer.getPackageName();
        PackageInfo packageInfo = contextAudioAttributesCompatParcelizer.getPackageManager().getPackageInfo(packageName, 0);
        long longVersionCode = packageInfo.getLongVersionCode();
        String strRemoteActionCompatParcelizer = p0.read().RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer, "");
        String str = Build.MODEL;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        String str2 = Build.VERSION.RELEASE;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        SpliceInfoDecoder spliceInfoDecoder = SpliceInfoDecoder.LOG_ENVIRONMENT_PROD;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(packageName, "");
        String str3 = packageInfo.versionName;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
        String str4 = Build.MANUFACTURER;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
        return new TextInformationFrame1(strRemoteActionCompatParcelizer, str, "1.0.0", str2, spliceInfoDecoder, new Id3DecoderExternalSyntheticLambda0(packageName, str3, String.valueOf(longVersionCode), str4));
    }
}
