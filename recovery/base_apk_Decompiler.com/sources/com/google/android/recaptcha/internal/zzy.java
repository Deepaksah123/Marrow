package com.google.android.recaptcha.internal;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.IntermediateLoginResponseBody;
import kotlin.ResolutionConfigRsModel;
import kotlin.TestGroupLSModel;
import kotlin.setPlanBUpgradeDataList;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzy implements zzh {
    private final Context zza;
    private final String zzb = "rce_";
    private final zzad zzc;

    @Override // com.google.android.recaptcha.internal.zzh
    public final String zza(String str) {
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str)));
        if (file.exists()) {
            return new String(zzad.zza(file), StandardCharsets.UTF_8);
        }
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzh
    public final void zzb() {
        try {
            File[] fileArrListFiles = this.zza.getCacheDir().listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : fileArrListFiles) {
                    if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(file.getName(), this.zzb)) {
                        arrayList.add(file);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.recaptcha.internal.zzh
    public final void zzc(String str, String str2) throws GeneralSecurityException, IOException {
        ResolutionConfigRsModel resolutionConfigRsModel = new ResolutionConfigRsModel('A', 'z');
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(resolutionConfigRsModel, 10));
        Iterator<Character> it = resolutionConfigRsModel.iterator();
        while (it.hasNext()) {
            arrayList.add(Character.valueOf(((setPlanBUpgradeDataList) it).write()));
        }
        String strRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.write((Iterable) arrayList).subList(0, 8), "", null, null, 0, null, null, 62);
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(strRemoteActionCompatParcelizer)));
        zzad.zzb(file, String.valueOf(str2).getBytes(StandardCharsets.UTF_8));
        file.renameTo(new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str))));
    }

    @Override // com.google.android.recaptcha.internal.zzh
    public final boolean zzd(String str) {
        File file;
        try {
            File[] fileArrListFiles = this.zza.getCacheDir().listFiles();
            file = null;
            if (fileArrListFiles != null) {
                int length = fileArrListFiles.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    File file2 = fileArrListFiles[i];
                    String name = file2.getName();
                    String str2 = this.zzb;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(str);
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) name, (Object) sb.toString())) {
                        file = file2;
                        break;
                    }
                    i++;
                }
            }
        } catch (Exception unused) {
        }
        return file != null;
    }

    public zzy(Context context) {
        this.zza = context;
        this.zzc = new zzad(context);
    }
}
