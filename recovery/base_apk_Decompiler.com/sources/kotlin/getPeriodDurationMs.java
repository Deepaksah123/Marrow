package kotlin;

import android.database.Cursor;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@getRenewGrpId
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u001c"}, d2 = {"Lo/getPeriodDurationMs;", "", "<init>", "()V", "Landroid/database/Cursor;", "p0", "", "p1", "AudioAttributesImplApi21Parcelizer", "(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;", "", "write", "(Landroid/database/Cursor;Ljava/lang/String;)I", "", "IconCompatParcelizer", "(Landroid/database/Cursor;Ljava/lang/String;)D", "", "AudioAttributesImplBaseParcelizer", "(Landroid/database/Cursor;Ljava/lang/String;)J", "", "read", "(Landroid/database/Cursor;Ljava/lang/String;)Z", "Lorg/json/JSONObject;", "RemoteActionCompatParcelizer", "(Landroid/database/Cursor;Ljava/lang/String;)Lorg/json/JSONObject;", "Lorg/json/JSONArray;", "AudioAttributesCompatParcelizer", "(Landroid/database/Cursor;Ljava/lang/String;)Lorg/json/JSONArray;", "(Z)I"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getPeriodDurationMs {
    public static final getPeriodDurationMs INSTANCE = new getPeriodDurationMs();

    @getMagicModuleMeta
    public static final int RemoteActionCompatParcelizer(boolean p0) {
        return p0 ? 1 : 0;
    }

    private getPeriodDurationMs() {
    }

    @getRenewGrpId
    @getMagicModuleMeta
    public static final String AudioAttributesImplApi21Parcelizer(Cursor p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return copyAdaptationSets.MediaBrowserCompatItemReceiver(p0, p1);
    }

    @getRenewGrpId
    @getMagicModuleMeta
    public static final int write(Cursor p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return copyAdaptationSets.AudioAttributesCompatParcelizer(p0, p1);
    }

    @getRenewGrpId
    @getMagicModuleMeta
    public static final double IconCompatParcelizer(Cursor p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return copyAdaptationSets.write(p0, p1);
    }

    @getRenewGrpId
    @getMagicModuleMeta
    public static final long AudioAttributesImplBaseParcelizer(Cursor p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return copyAdaptationSets.AudioAttributesImplApi21Parcelizer(p0, p1);
    }

    @getRenewGrpId
    @getMagicModuleMeta
    public static final boolean read(Cursor p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return copyAdaptationSets.RemoteActionCompatParcelizer(p0, p1);
    }

    @getRenewGrpId
    @getMagicModuleMeta
    public static final JSONObject RemoteActionCompatParcelizer(Cursor p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return copyAdaptationSets.MediaBrowserCompatCustomActionResultReceiver(p0, p1);
    }

    @getRenewGrpId
    @getMagicModuleMeta
    public static final JSONArray AudioAttributesCompatParcelizer(Cursor p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return copyAdaptationSets.IconCompatParcelizer(p0, p1);
    }
}
