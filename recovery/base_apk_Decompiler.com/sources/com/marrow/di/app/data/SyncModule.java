package com.marrow.di.app.data;

import kotlin.GTNudgeRequestModel;
import kotlin.Metadata;
import kotlin.getMagicModuleMeta;
import kotlin.logErrorMessage;
import kotlin.setGateway;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/marrow/di/app/data/SyncModule;", "", "<init>", "()V", "Lo/GTNudgeRequestModel;", "p0", "Lo/logErrorMessage;", "AudioAttributesCompatParcelizer", "(Lo/GTNudgeRequestModel;)Lo/logErrorMessage;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SyncModule {
    public static final SyncModule INSTANCE = new SyncModule();

    private SyncModule() {
    }

    @getMagicModuleMeta
    public static final logErrorMessage AudioAttributesCompatParcelizer(@setGateway(IconCompatParcelizer = "v3.1") GTNudgeRequestModel p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Object obj = p0.read((Class<Object>) logErrorMessage.class);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(obj, "");
        return (logErrorMessage) obj;
    }
}
