package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class DynamiteModule {
    public static final int LOCAL = -1;
    public static final int NONE = 0;
    public static final int NO_SELECTION = 0;
    public static final int REMOTE = 1;
    private static Boolean zzb = null;
    private static String zzc = null;
    private static boolean zzd = false;
    private static int zze = -1;
    private static Boolean zzf;
    private static zzq zzk;
    private static zzr zzl;
    private final Context zzj;
    private static final ThreadLocal zzg = new ThreadLocal();
    private static final ThreadLocal zzh = new zzd();
    private static final VersionPolicy.IVersions zzi = new zze();
    public static final VersionPolicy PREFER_REMOTE = new zzf();
    public static final VersionPolicy PREFER_LOCAL = new zzg();
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzh();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzi();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzj();
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzk();
    public static final VersionPolicy zza = new zzl();

    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class LoadingException extends Exception {
        /* synthetic */ LoadingException(String str, zzp zzpVar) {
            super(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th, zzp zzpVar) {
            super(str, th);
        }
    }

    public interface VersionPolicy {

        public interface IVersions {
            int zza(Context context, String str);

            int zzb(Context context, String str, boolean z) throws LoadingException;
        }

        public static class SelectionResult {
            public int localVersion = 0;
            public int remoteVersion = 0;
            public int selection = 0;
        }

        SelectionResult selectModule(Context context, String str, IVersions iVersions) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzj = context;
    }

    public static int getLocalVersion(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String.valueOf(declaredField.get(null));
            return 0;
        } catch (ClassNotFoundException unused) {
            return 0;
        } catch (Exception e) {
            e.getMessage();
            return 0;
        }
    }

    public static int getRemoteVersion(Context context, String str) {
        return zza(context, str, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053 A[Catch: all -> 0x01f4, TRY_LEAVE, TryCatch #3 {all -> 0x01f4, blocks: (B:5:0x0029, B:9:0x0045, B:14:0x004d, B:17:0x0053, B:20:0x005d, B:94:0x0158, B:95:0x0162, B:97:0x0164, B:99:0x0166, B:100:0x016d, B:119:0x01b3, B:120:0x01c6, B:102:0x016f, B:104:0x0176, B:106:0x0185, B:117:0x01ab, B:118:0x01b2, B:121:0x01c7, B:122:0x01f3), top: B:139:0x0029, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.dynamite.DynamiteModule load(android.content.Context r18, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy r19, java.lang.String r20) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.load(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$VersionPolicy, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011c A[Catch: all -> 0x014d, TRY_LEAVE, TryCatch #7 {all -> 0x014d, blocks: (B:3:0x0002, B:52:0x00a8, B:54:0x00ae, B:59:0x00b8, B:81:0x0110, B:88:0x011c, B:105:0x0146, B:106:0x0149, B:101:0x013e, B:57:0x00b4, B:109:0x014c, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:50:0x00a5, B:47:0x009e, B:49:0x00a0), top: B:126:0x0002, inners: #3, #4 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x013c -> B:116:0x0141). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x013e -> B:116:0x0141). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zza(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zza(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d4  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int zzb(android.content.Context r8, java.lang.String r9, boolean r10, boolean r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzb(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static void zzd(ClassLoader classLoader) throws LoadingException {
        zzr zzrVar;
        zzp zzpVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzrVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzrVar = iInterfaceQueryLocalInterface instanceof zzr ? (zzr) iInterfaceQueryLocalInterface : new zzr(iBinder);
            }
            zzl = zzrVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        }
    }

    private static boolean zze(Cursor cursor) {
        zzn zznVar = (zzn) zzg.get();
        if (zznVar == null || zznVar.zza != null) {
            return false;
        }
        zznVar.zza = cursor;
        return true;
    }

    private static boolean zzf(Context context) {
        if (Boolean.TRUE.equals(null) || Boolean.TRUE.equals(zzf)) {
            return true;
        }
        boolean zBooleanValue = false;
        if (zzf == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(((PackageItemInfo) providerInfoResolveContentProvider).packageName)) {
                zBooleanValue = true;
            }
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            zzf = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
            if (zBooleanValue && ((ComponentInfo) providerInfoResolveContentProvider).applicationInfo != null && (((ComponentInfo) providerInfoResolveContentProvider).applicationInfo.flags & TsExtractor.TS_STREAM_TYPE_AC3) == 0) {
                zzd = true;
            }
        }
        return zBooleanValue;
    }

    private static zzq zzg(Context context) {
        zzq zzqVar;
        synchronized (DynamiteModule.class) {
            zzq zzqVar2 = zzk;
            if (zzqVar2 != null) {
                return zzqVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzqVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzqVar = iInterfaceQueryLocalInterface instanceof zzq ? (zzq) iInterfaceQueryLocalInterface : new zzq(iBinder);
                }
                if (zzqVar != null) {
                    zzk = zzqVar;
                    return zzqVar;
                }
            } catch (Exception e) {
                e.getMessage();
            }
            return null;
        }
    }

    public final IBinder instantiate(String str) throws LoadingException {
        try {
            return (IBinder) this.zzj.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e, null);
        }
    }

    private static DynamiteModule zzc(Context context, String str) {
        return new DynamiteModule(context);
    }

    @ResultIgnorabilityUnspecified
    public final Context getModuleContext() {
        return this.zzj;
    }
}
