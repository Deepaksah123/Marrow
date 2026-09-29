package com.marrow.di.activity;

import android.app.Activity;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.getChannel;
import kotlin.getMagicModuleMeta;
import kotlin.parseStringAttr;
import kotlin.parseTimeSecondsToUs;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/marrow/di/activity/ActivityProviderModule;", "", "<init>", "()V", "Landroid/app/Activity;", "p0", "Lo/getChannel;", "AudioAttributesCompatParcelizer", "(Landroid/app/Activity;)Lo/getChannel;", "Lo/parseStringAttr;", "RemoteActionCompatParcelizer", "(Landroid/app/Activity;)Lo/parseStringAttr;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ActivityProviderModule {
    public static final ActivityProviderModule INSTANCE = new ActivityProviderModule();

    private ActivityProviderModule() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final getChannel AudioAttributesCompatParcelizer(Activity p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (getChannel) p0;
    }

    @getMagicModuleMeta
    public static final parseStringAttr RemoteActionCompatParcelizer(Activity p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Intent intent = p0.getIntent();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(intent, "");
        return new parseTimeSecondsToUs(intent);
    }
}
