package in.juspay.hypersdk.services;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.analytics.LogConstants;
import in.juspay.hypersdk.core.PaymentConstants;
import in.juspay.hypersdk.utils.Utils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.TestGroupLSModel;
import kotlin.getShowPopup;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 52\u00020\u0001:\u00015B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u0019J\u0019\u0010\u001e\u001a\u0004\u0018\u00010\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010 \u001a\u0004\u0018\u00010\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0017\u0010%\u001a\u00020\u00168\u0007¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R*\u0010-\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00168\u0007@EX\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010&\u001a\u0004\b.\u0010(\"\u0004\b/\u00100R\u001a\u00103\u001a\b\u0012\u0004\u0012\u000202018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u00104"}, d2 = {"Lin/juspay/hypersdk/services/Workspace;", "", "Landroid/content/Context;", "p0", "", "p1", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "(Lin/juspay/hypersdk/services/Workspace;)V", "", "clean", "(Landroid/content/Context;)V", "deleteLogFiles", "()V", "getFromSharedPreference", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "getKeysInSharedPreference", "()Ljava/util/Set;", "", "isInSharedPreference", "(Ljava/lang/String;)Z", "Ljava/io/File;", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;", "(Ljava/lang/String;)Ljava/io/File;", "Ljava/io/InputStream;", "openAsset", "(Ljava/lang/String;)Ljava/io/InputStream;", "openInCache", "removeFromSharedPreference", "(Ljava/lang/String;)Lo/getShowPopup;", "writeToSharedPreference", "(Ljava/lang/String;Ljava/lang/String;)Lo/getShowPopup;", "Landroid/content/res/AssetManager;", "assetManager", "Landroid/content/res/AssetManager;", "cacheRoot", "Ljava/io/File;", "getCacheRoot", "()Ljava/io/File;", "path", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "root", "getRoot", "setRoot", "(Ljava/io/File;)V", "", "Landroid/content/SharedPreferences;", "sharedPrefsList", "Ljava/util/List;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class Workspace {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FALLBACK_WORKSPACE = "juspay";
    private static final String TAG = "Workspace";
    private static SharedPreferences fallbackSharedPreferencesGodel;
    private static SharedPreferences fallbackSharedPreferencesJuspay;
    private final AssetManager assetManager;
    private final File cacheRoot;
    private final String path;
    private File root;
    private final List<SharedPreferences> sharedPrefsList;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013"}, d2 = {"Lin/juspay/hypersdk/services/Workspace$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "Ljava/io/File;", "mkCacheRoot", "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;", "mkRoot", "trimFileSeparator", "(Ljava/lang/String;)Ljava/lang/String;", "FALLBACK_WORKSPACE", "Ljava/lang/String;", "TAG", "Landroid/content/SharedPreferences;", "fallbackSharedPreferencesGodel", "Landroid/content/SharedPreferences;", "fallbackSharedPreferencesJuspay"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final File mkCacheRoot(Context p0, String p1) {
            File file = new File(p0.getCacheDir(), p1);
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final File mkRoot(Context p0, String p1) {
            if (!TestGroupLSModel.write((CharSequence) p1, (CharSequence) "/", false)) {
                File dir = p0.getDir(p1, 0);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(dir, "");
                return dir;
            }
            int iIconCompatParcelizer = TestGroupLSModel.IconCompatParcelizer((CharSequence) p1, '/', 0, false, 6);
            String strSubstring = p1.substring(0, iIconCompatParcelizer);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
            File dir2 = p0.getDir(strSubstring, 0);
            String strSubstring2 = p1.substring(iIconCompatParcelizer + 1);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring2, "");
            File file = new File(dir2, strSubstring2);
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }

        protected final String trimFileSeparator(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return TestGroupLSModel.read(p0, ' ', '/');
        }

        private Companion() {
        }
    }

    public Workspace(Context context, String str) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        Companion companion = INSTANCE;
        String strTrimFileSeparator = companion.trimFileSeparator(str);
        this.path = strTrimFileSeparator;
        this.root = companion.mkRoot(context, strTrimFileSeparator);
        this.cacheRoot = companion.mkCacheRoot(context, strTrimFileSeparator);
        String strAudioAttributesCompatParcelizer = TestGroupLSModel.AudioAttributesCompatParcelizer(strTrimFileSeparator, '/', '_', false);
        AssetManager assets = context.getAssets();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(assets, "");
        this.assetManager = assets;
        ArrayList arrayList = new ArrayList();
        if (fallbackSharedPreferencesJuspay == null) {
            fallbackSharedPreferencesJuspay = context.getSharedPreferences(FALLBACK_WORKSPACE, 0);
        }
        if (fallbackSharedPreferencesGodel == null) {
            fallbackSharedPreferencesGodel = context.getSharedPreferences(PaymentConstants.Category.GODEL, 0);
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) strTrimFileSeparator, (Object) FALLBACK_WORKSPACE)) {
            SharedPreferences sharedPreferences = fallbackSharedPreferencesJuspay;
            if (sharedPreferences != null) {
                arrayList.add(sharedPreferences);
            }
            SharedPreferences sharedPreferences2 = fallbackSharedPreferencesGodel;
            if (sharedPreferences2 != null) {
                arrayList.add(sharedPreferences2);
            }
        } else {
            arrayList.add(context.getSharedPreferences(strAudioAttributesCompatParcelizer, 0));
            SharedPreferences sharedPreferences3 = fallbackSharedPreferencesJuspay;
            if (sharedPreferences3 != null) {
                arrayList.add(sharedPreferences3);
            }
            SharedPreferences sharedPreferences4 = fallbackSharedPreferencesGodel;
            if (sharedPreferences4 != null) {
                arrayList.add(sharedPreferences4);
            }
        }
        this.sharedPrefsList = arrayList;
    }

    private final void deleteLogFiles() {
        try {
            File[] fileArrListFiles = new File(this.cacheRoot.toString()).listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name, "");
                    if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(name, LogConstants.PERSISTENT_LOGS_FILE) || TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(name, LogConstants.LOGS_FILE) || TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(name, LogConstants.TEMP_LOGS_FILE)) {
                        file.delete();
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void clean(Context p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (this.root.exists()) {
            Utils.deleteRecursive(this.root);
            INSTANCE.mkRoot(p0, this.path);
        }
        new File(this.cacheRoot, "juspay-logs-queue.dat").delete();
        new File(this.cacheRoot, "temp-logs-queue.dat").delete();
        new File(this.cacheRoot, "juspay-pre-logs-queue.dat").delete();
        deleteLogFiles();
    }

    public final File getCacheRoot() {
        return this.cacheRoot;
    }

    public final String getFromSharedPreference(String p0, String p1) {
        Iterator<SharedPreferences> it = this.sharedPrefsList.iterator();
        while (it.hasNext()) {
            String string = it.next().getString(p0, null);
            if (string != null) {
                return string;
            }
        }
        return p1;
    }

    public final Set<String> getKeysInSharedPreference() {
        HashSet hashSet = new HashSet();
        Iterator<SharedPreferences> it = this.sharedPrefsList.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().getAll().keySet());
        }
        return hashSet;
    }

    public final String getPath() {
        return this.path;
    }

    public final File getRoot() {
        return this.root;
    }

    public final boolean isInSharedPreference(String p0) {
        Iterator<SharedPreferences> it = this.sharedPrefsList.iterator();
        while (it.hasNext()) {
            if (it.next().contains(p0)) {
                return true;
            }
        }
        return false;
    }

    public final File open(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return open(this.root, p0);
    }

    public final InputStream openAsset(String p0) throws IOException {
        toMagicModuleMetaRepoModel.write(p0, "");
        String strTrimFileSeparator = INSTANCE.trimFileSeparator(p0);
        try {
            AssetManager assetManager = this.assetManager;
            StringBuilder sb = new StringBuilder();
            sb.append(this.path);
            sb.append('/');
            sb.append(strTrimFileSeparator);
            InputStream inputStreamOpen = assetManager.open(sb.toString());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(inputStreamOpen, "");
            return inputStreamOpen;
        } catch (IOException e) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.path, (Object) FALLBACK_WORKSPACE)) {
                throw e;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e);
            sb2.append(", trying fallback workspace.");
            JuspayLogger.d(TAG, sb2.toString());
            InputStream inputStreamOpen2 = this.assetManager.open("juspay/".concat(String.valueOf(strTrimFileSeparator)));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(inputStreamOpen2, "");
            return inputStreamOpen2;
        }
    }

    public final File openInCache(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return open(this.cacheRoot, p0);
    }

    public final getShowPopup removeFromSharedPreference(String p0) {
        SharedPreferences.Editor editorRemove;
        if (p0 == null) {
            return null;
        }
        Iterator<SharedPreferences> it = this.sharedPrefsList.iterator();
        while (it.hasNext()) {
            SharedPreferences.Editor editorEdit = it.next().edit();
            if (editorEdit != null && (editorRemove = editorEdit.remove(p0)) != null) {
                editorRemove.apply();
            }
        }
        return getShowPopup.INSTANCE;
    }

    public final void setRoot(File file) {
        toMagicModuleMetaRepoModel.write(file, "");
        this.root = file;
    }

    public final getShowPopup writeToSharedPreference(String p0, String p1) {
        if (p0 == null) {
            return null;
        }
        this.sharedPrefsList.get(0).edit().putString(p0, p1).apply();
        return getShowPopup.INSTANCE;
    }

    private final File open(File p0, String p1) {
        return new File(p0, INSTANCE.trimFileSeparator(p1));
    }

    public Workspace(Workspace workspace) {
        toMagicModuleMetaRepoModel.write(workspace, "");
        this.path = workspace.path;
        this.root = workspace.root;
        this.cacheRoot = workspace.cacheRoot;
        this.sharedPrefsList = workspace.sharedPrefsList;
        this.assetManager = workspace.assetManager;
    }
}
