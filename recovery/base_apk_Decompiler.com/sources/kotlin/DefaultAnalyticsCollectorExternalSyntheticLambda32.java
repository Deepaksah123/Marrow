package kotlin;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda32;", "", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "write", "()V", "RemoteActionCompatParcelizer", "Ljava/lang/String;", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "Z"}, k = 1, mv = {1, 4, 0})
public final class DefaultAnalyticsCollectorExternalSyntheticLambda32 {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final boolean write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    public /* synthetic */ DefaultAnalyticsCollectorExternalSyntheticLambda32(String str, boolean z, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, z);
    }

    private DefaultAnalyticsCollectorExternalSyntheticLambda32(String str, boolean z) {
        this.IconCompatParcelizer = str;
        this.write = z;
    }

    public final String toString() {
        String str;
        if (!this.write) {
            str = "Unclassified";
        } else {
            str = "Applink";
        }
        if (this.IconCompatParcelizer == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('(');
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }

    public final void write() {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer()).edit();
        editorEdit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.IconCompatParcelizer);
        editorEdit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.write);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: o.DefaultAnalyticsCollectorExternalSyntheticLambda32$write, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda32$write;", "", "<init>", "()V", "", "read", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda32;", "write", "()Lo/DefaultAnalyticsCollectorExternalSyntheticLambda32;"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        @getMagicModuleMeta
        public static DefaultAnalyticsCollectorExternalSyntheticLambda32 write() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer());
            MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0 = null;
            if (defaultSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
                return new DefaultAnalyticsCollectorExternalSyntheticLambda32(defaultSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false), magicModuleRepositoryImplExternalSyntheticLambda0);
            }
            return null;
        }

        @getMagicModuleMeta
        public static void read() {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer()).edit();
            editorEdit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
            editorEdit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
            editorEdit.apply();
        }
    }
}
