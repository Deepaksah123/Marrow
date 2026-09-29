package com.google.android.recaptcha.internal;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import kotlin.downloadMagicModuleDetail;

/* JADX INFO: loaded from: classes3.dex */
public final class zzad {
    private final Context zza;

    public static final byte[] zza(File file) throws GeneralSecurityException, IOException {
        return downloadMagicModuleDetail.read(file);
    }

    public static final void zzb(File file, byte[] bArr) throws GeneralSecurityException, IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException("Unable to delete existing encrypted file");
        }
        downloadMagicModuleDetail.read(file, bArr);
    }

    public zzad(Context context) {
        this.zza = context;
    }
}
