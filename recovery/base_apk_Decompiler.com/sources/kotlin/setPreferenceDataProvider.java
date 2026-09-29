package kotlin;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.SettingsItem;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB3\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\u0002\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b"}, d2 = {"Lo/setPreferenceDataProvider;", "Lo/PlanActivity;", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "p0", "Ljavax/net/ssl/SSLSocketFactory;", "p1", "p2", "<init>", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V", "IconCompatParcelizer", "Ljava/lang/Class;", "AudioAttributesCompatParcelizer", "read", "RemoteActionCompatParcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class setPreferenceDataProvider extends PlanActivity {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final Class<? super SSLSocketFactory> read;
    private final Class<?> IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setPreferenceDataProvider(Class<? super SSLSocket> cls, Class<? super SSLSocketFactory> cls2, Class<?> cls3) {
        super(cls);
        toMagicModuleMetaRepoModel.write(cls, "");
        toMagicModuleMetaRepoModel.write(cls2, "");
        toMagicModuleMetaRepoModel.write(cls3, "");
        this.read = cls2;
        this.IconCompatParcelizer = cls3;
    }

    /* JADX INFO: renamed from: o.setPreferenceDataProvider$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/platform/android/StandardAndroidSocketAdapter$Companion;", "", "()V", "buildIfSupported", "Lokhttp3/internal/platform/android/SocketAdapter;", "packageName", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static PlanPresenter RemoteActionCompatParcelizer(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".OpenSSLSocketImpl");
                Class<?> cls = Class.forName(sb.toString());
                toMagicModuleMetaRepoModel.read(cls, "");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(".OpenSSLSocketFactoryImpl");
                Class<?> cls2 = Class.forName(sb2.toString());
                toMagicModuleMetaRepoModel.read(cls2, "");
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(".SSLParametersImpl");
                Class<?> cls3 = Class.forName(sb3.toString());
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cls3, "");
                return new setPreferenceDataProvider(cls, cls2, cls3);
            } catch (Exception e) {
                SettingsItem.IconCompatParcelizer iconCompatParcelizer = SettingsItem.AudioAttributesCompatParcelizer;
                SettingsItem.IconCompatParcelizer.write();
                SettingsItem.AudioAttributesCompatParcelizer("unable to load android socket classes", 5, e);
                return null;
            }
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
