package com.marrow.di.app.data.video;

import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.File;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.setGateway;
import kotlin.startForeground;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/marrow/di/app/data/video/FileProviderModule;", "", "<init>", "()V", "Landroid/app/Application;", "p0", "Ljava/io/File;", "IconCompatParcelizer", "(Landroid/app/Application;)Ljava/io/File;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FileProviderModule {
    public static final FileProviderModule INSTANCE = new FileProviderModule();

    private FileProviderModule() {
    }

    @setGateway(IconCompatParcelizer = "file_main")
    public final File IconCompatParcelizer(Application p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        try {
            Object[] objArr = {p0};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-220465252);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (View.getDefaultSize(0, 0) + 46567), 17245 - Color.green(0), 63 - TextUtils.getOffsetBefore("", 0), -1936575735, false, "write", new Class[]{Context.class});
            }
            Object[] objArr2 = {((Method) objRemoteActionCompatParcelizer).invoke(null, objArr), ".marrow"};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(780100948);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) (46566 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), TextUtils.getCapsMode("", 0, 0) + 17245, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 63, 1345757633, false, "read", new Class[]{File.class, String.class});
            }
            File file = (File) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr2);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(file, "");
            return file;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
