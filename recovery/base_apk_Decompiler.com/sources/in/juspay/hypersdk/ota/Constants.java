package in.juspay.hypersdk.ota;

import com.google.android.exoplayer2.C;
import in.juspay.hypersdk.ota.ReleaseConfig;
import kotlin.IntermediateLoginResponseBody;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00178\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lin/juspay/hypersdk/ota/Constants;", "", "<init>", "()V", "", "APP_DIR", "Ljava/lang/String;", "CONFIG_FILE_NAME", "Lin/juspay/hypersdk/ota/ReleaseConfig$Config;", "DEFAULT_CONFIG", "Lin/juspay/hypersdk/ota/ReleaseConfig$Config;", "getDEFAULT_CONFIG", "()Lin/juspay/hypersdk/ota/ReleaseConfig$Config;", "Lin/juspay/hypersdk/ota/ReleaseConfig$ResourceManifest;", "DEFAULT_RESOURCES", "Lin/juspay/hypersdk/ota/ReleaseConfig$ResourceManifest;", "getDEFAULT_RESOURCES", "()Lin/juspay/hypersdk/ota/ReleaseConfig$ResourceManifest;", "PACKAGE_DIR_NAME", "PACKAGE_MANIFEST_FILE_NAME", "PATCH_TOSS", "RESOURCES_DIR_NAME", "RESOURCES_FILE_NAME", "", "TOSS_TIMEOUT", "I"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Constants {
    public static final String APP_DIR = "app";
    public static final String CONFIG_FILE_NAME = "config.json";
    public static final String PACKAGE_DIR_NAME = "package";
    public static final String PACKAGE_MANIFEST_FILE_NAME = "pkg.json";
    public static final String PATCH_TOSS = "patch_toss";
    public static final String RESOURCES_DIR_NAME = "resources";
    public static final String RESOURCES_FILE_NAME = "resources.json";
    public static final int TOSS_TIMEOUT = 604800;
    public static final Constants INSTANCE = new Constants();
    private static final ReleaseConfig.Config DEFAULT_CONFIG = new ReleaseConfig.Config("v000000", C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, 7000, new JSONObject());
    private static final ReleaseConfig.ResourceManifest DEFAULT_RESOURCES = new ReleaseConfig.ResourceManifest(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());

    private Constants() {
    }

    public final ReleaseConfig.Config getDEFAULT_CONFIG() {
        return DEFAULT_CONFIG;
    }

    public final ReleaseConfig.ResourceManifest getDEFAULT_RESOURCES() {
        return DEFAULT_RESOURCES;
    }
}
