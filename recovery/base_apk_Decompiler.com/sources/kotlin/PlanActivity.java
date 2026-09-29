package kotlin;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.OptionItem;
import kotlin.SettingsItem;
import kotlin.VideoTimelineSideSheetViewModel_HiltModulesKeyModule;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\r\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\r\u0010\u0012J\u0017\u0010\r\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u0013R\u0018\u0010\u0017\u001a\u0006*\u00020\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u000f\u001a\u0006*\u00020\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0018\u0010\r\u001a\u0006*\u00020\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u001c\u0010\u001b\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lo/PlanActivity;", "Lo/PlanPresenter;", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "p0", "<init>", "(Ljava/lang/Class;)V", "", "p1", "", "Lo/ThemeKtExternalSyntheticLambda1;", "p2", "", "AudioAttributesCompatParcelizer", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "write", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "", "()Z", "(Ljavax/net/ssl/SSLSocket;)Z", "Ljava/lang/reflect/Method;", "RemoteActionCompatParcelizer", "Ljava/lang/reflect/Method;", "IconCompatParcelizer", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatItemReceiver", "Ljava/lang/Class;", "read"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class PlanActivity implements PlanPresenter {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final Method write;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final Method RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final Class<? super SSLSocket> read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Method IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final Method AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final VideoTimelineSideSheetViewModel_HiltModulesKeyModule.AudioAttributesCompatParcelizer IconCompatParcelizer = Companion.read("com.google.android.gms.org.conscrypt");

    public PlanActivity(Class<? super SSLSocket> cls) throws NoSuchMethodException {
        toMagicModuleMetaRepoModel.write(cls, "");
        this.read = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(declaredMethod, "");
        this.RemoteActionCompatParcelizer = declaredMethod;
        this.AudioAttributesCompatParcelizer = cls.getMethod("setHostname", String.class);
        this.IconCompatParcelizer = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.write = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // kotlin.PlanPresenter
    public final boolean AudioAttributesCompatParcelizer() {
        OptionItem.Companion companion = OptionItem.INSTANCE;
        return OptionItem.Companion.read();
    }

    @Override // kotlin.PlanPresenter
    public final boolean AudioAttributesCompatParcelizer(SSLSocket p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.read.isInstance(p0);
    }

    @Override // kotlin.PlanPresenter
    public final void AudioAttributesCompatParcelizer(SSLSocket p0, String p1, List<? extends ThemeKtExternalSyntheticLambda1> p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        if (AudioAttributesCompatParcelizer(p0)) {
            try {
                this.RemoteActionCompatParcelizer.invoke(p0, Boolean.TRUE);
                if (p1 != null) {
                    this.AudioAttributesCompatParcelizer.invoke(p0, p1);
                }
                Method method = this.write;
                SettingsItem.IconCompatParcelizer iconCompatParcelizer = SettingsItem.AudioAttributesCompatParcelizer;
                method.invoke(p0, SettingsItem.IconCompatParcelizer.AudioAttributesCompatParcelizer(p2));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    @Override // kotlin.PlanPresenter
    public final String write(SSLSocket p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (!AudioAttributesCompatParcelizer(p0)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.IconCompatParcelizer.invoke(p0, new Object[0]);
            if (bArr != null) {
                return new String(bArr, getSubmissionTimestamp.IconCompatParcelizer);
            }
            return null;
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof NullPointerException) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((NullPointerException) cause).getMessage(), (Object) "ssl == null")) {
                return null;
            }
            throw new AssertionError(e2);
        }
    }

    /* JADX INFO: renamed from: o.PlanActivity$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\u000b8\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/PlanActivity$read;", "", "<init>", "()V", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "p0", "Lo/PlanActivity;", "RemoteActionCompatParcelizer", "(Ljava/lang/Class;)Lo/PlanActivity;", "", "Lo/VideoTimelineSideSheetViewModel_HiltModulesKeyModule$AudioAttributesCompatParcelizer;", "read", "(Ljava/lang/String;)Lo/VideoTimelineSideSheetViewModel_HiltModulesKeyModule$AudioAttributesCompatParcelizer;", "IconCompatParcelizer", "Lo/VideoTimelineSideSheetViewModel_HiltModulesKeyModule$AudioAttributesCompatParcelizer;", "AudioAttributesCompatParcelizer", "()Lo/VideoTimelineSideSheetViewModel_HiltModulesKeyModule$AudioAttributesCompatParcelizer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static VideoTimelineSideSheetViewModel_HiltModulesKeyModule.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer() {
            return PlanActivity.IconCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static PlanActivity RemoteActionCompatParcelizer(Class<? super SSLSocket> p0) {
            Class<? super SSLSocket> superclass = p0;
            while (superclass != null && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) superclass.getSimpleName(), (Object) "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type ".concat(String.valueOf(p0)));
                }
            }
            toMagicModuleMetaRepoModel.write(superclass);
            return new PlanActivity(superclass);
        }

        /* JADX INFO: renamed from: o.PlanActivity$read$write */
        public static final class write implements VideoTimelineSideSheetViewModel_HiltModulesKeyModule.AudioAttributesCompatParcelizer {
            private /* synthetic */ String RemoteActionCompatParcelizer;

            write(String str) {
                this.RemoteActionCompatParcelizer = str;
            }

            @Override // o.VideoTimelineSideSheetViewModel_HiltModulesKeyModule.AudioAttributesCompatParcelizer
            public final boolean RemoteActionCompatParcelizer(SSLSocket sSLSocket) {
                toMagicModuleMetaRepoModel.write(sSLSocket, "");
                String name = sSLSocket.getClass().getName();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name, "");
                StringBuilder sb = new StringBuilder();
                sb.append(this.RemoteActionCompatParcelizer);
                sb.append('.');
                return TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(name, sb.toString());
            }

            @Override // o.VideoTimelineSideSheetViewModel_HiltModulesKeyModule.AudioAttributesCompatParcelizer
            public final PlanPresenter IconCompatParcelizer(SSLSocket sSLSocket) {
                toMagicModuleMetaRepoModel.write(sSLSocket, "");
                Companion companion = PlanActivity.INSTANCE;
                return Companion.RemoteActionCompatParcelizer(sSLSocket.getClass());
            }
        }

        public static VideoTimelineSideSheetViewModel_HiltModulesKeyModule.AudioAttributesCompatParcelizer read(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new write(p0);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
