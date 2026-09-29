package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.getRelatedModuleAdapter;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018"}, d2 = {"Lo/SyncingActivity;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lo/getRelatedModuleAdapter;", "(Lo/getRelatedModuleAdapter;Ljava/lang/String;)V", "(Lo/getRelatedModuleAdapter;Lo/getRelatedModuleAdapter;)V", "RemoteActionCompatParcelizer", "()Lo/getRelatedModuleAdapter;", "AudioAttributesCompatParcelizer", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "hpackSize", "I", "name", "Lo/getRelatedModuleAdapter;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SyncingActivity {
    public static final getRelatedModuleAdapter PSEUDO_PREFIX;
    public static final getRelatedModuleAdapter RESPONSE_STATUS;
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final getRelatedModuleAdapter TARGET_AUTHORITY;
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final getRelatedModuleAdapter TARGET_METHOD;
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final getRelatedModuleAdapter TARGET_PATH;
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final getRelatedModuleAdapter TARGET_SCHEME;
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public final int hpackSize;
    public final getRelatedModuleAdapter name;
    public final getRelatedModuleAdapter value;

    public SyncingActivity(getRelatedModuleAdapter getrelatedmoduleadapter, getRelatedModuleAdapter getrelatedmoduleadapter2) {
        toMagicModuleMetaRepoModel.write(getrelatedmoduleadapter, "");
        toMagicModuleMetaRepoModel.write(getrelatedmoduleadapter2, "");
        this.name = getrelatedmoduleadapter;
        this.value = getrelatedmoduleadapter2;
        this.hpackSize = getrelatedmoduleadapter.MediaBrowserCompatCustomActionResultReceiver() + 32 + getrelatedmoduleadapter2.MediaBrowserCompatCustomActionResultReceiver();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SyncingActivity(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        getRelatedModuleAdapter.Companion companion = getRelatedModuleAdapter.INSTANCE;
        getRelatedModuleAdapter getrelatedmoduleadapterRemoteActionCompatParcelizer = getRelatedModuleAdapter.Companion.RemoteActionCompatParcelizer(str);
        getRelatedModuleAdapter.Companion companion2 = getRelatedModuleAdapter.INSTANCE;
        this(getrelatedmoduleadapterRemoteActionCompatParcelizer, getRelatedModuleAdapter.Companion.RemoteActionCompatParcelizer(str2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SyncingActivity(getRelatedModuleAdapter getrelatedmoduleadapter, String str) {
        this(getrelatedmoduleadapter, getRelatedModuleAdapter.Companion.RemoteActionCompatParcelizer(str));
        toMagicModuleMetaRepoModel.write(getrelatedmoduleadapter, "");
        toMagicModuleMetaRepoModel.write(str, "");
        getRelatedModuleAdapter.Companion companion = getRelatedModuleAdapter.INSTANCE;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name.MediaDescriptionCompat());
        sb.append(": ");
        sb.append(this.value.MediaDescriptionCompat());
        return sb.toString();
    }

    static {
        getRelatedModuleAdapter.Companion companion = getRelatedModuleAdapter.INSTANCE;
        PSEUDO_PREFIX = getRelatedModuleAdapter.Companion.RemoteActionCompatParcelizer(":");
        getRelatedModuleAdapter.Companion companion2 = getRelatedModuleAdapter.INSTANCE;
        RESPONSE_STATUS = getRelatedModuleAdapter.Companion.RemoteActionCompatParcelizer(RESPONSE_STATUS_UTF8);
        getRelatedModuleAdapter.Companion companion3 = getRelatedModuleAdapter.INSTANCE;
        TARGET_METHOD = getRelatedModuleAdapter.Companion.RemoteActionCompatParcelizer(TARGET_METHOD_UTF8);
        getRelatedModuleAdapter.Companion companion4 = getRelatedModuleAdapter.INSTANCE;
        TARGET_PATH = getRelatedModuleAdapter.Companion.RemoteActionCompatParcelizer(TARGET_PATH_UTF8);
        getRelatedModuleAdapter.Companion companion5 = getRelatedModuleAdapter.INSTANCE;
        TARGET_SCHEME = getRelatedModuleAdapter.Companion.RemoteActionCompatParcelizer(TARGET_SCHEME_UTF8);
        getRelatedModuleAdapter.Companion companion6 = getRelatedModuleAdapter.INSTANCE;
        TARGET_AUTHORITY = getRelatedModuleAdapter.Companion.RemoteActionCompatParcelizer(TARGET_AUTHORITY_UTF8);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final getRelatedModuleAdapter getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final getRelatedModuleAdapter getValue() {
        return this.value;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SyncingActivity)) {
            return false;
        }
        SyncingActivity syncingActivity = (SyncingActivity) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.name, syncingActivity.name) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.value, syncingActivity.value);
    }

    public final int hashCode() {
        return (this.name.hashCode() * 31) + this.value.hashCode();
    }
}
