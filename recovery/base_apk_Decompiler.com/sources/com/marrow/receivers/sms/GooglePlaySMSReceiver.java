package com.marrow.receivers.sms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.api.Status;
import java.util.Locale;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.TestGroupLSModel;
import kotlin.createSubtitle;
import kotlin.getProvider;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/marrow/receivers/sms/GooglePlaySMSReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "p1", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GooglePlaySMSReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context p0, Intent p1) {
        Bundle extras;
        Status status;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) SmsRetriever.SMS_RETRIEVED_ACTION, (Object) p1.getAction()) || (extras = p1.getExtras()) == null || (status = (Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")) == null || status.getStatusCode() != 0) {
            return;
        }
        String str = (String) extras.get(SmsRetriever.EXTRA_SMS_MESSAGE);
        if (!Companion.read(str) || str == null) {
            return;
        }
        createSubtitle.Companion companion = createSubtitle.INSTANCE;
        getProvider.getInstance(p0).AudioAttributesCompatParcelizer(createSubtitle.Companion.AudioAttributesCompatParcelizer("+919876543210", str));
    }

    /* JADX INFO: renamed from: com.marrow.receivers.sms.GooglePlaySMSReceiver$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/marrow/receivers/sms/GooglePlaySMSReceiver$IconCompatParcelizer;", "", "<init>", "()V", "", "p0", "", "read", "(Ljava/lang/String;)Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean read(String p0) {
            if (p0 == null) {
                return false;
            }
            String lowerCase = p0.toLowerCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
            return lowerCase != null && TestGroupLSModel.write((CharSequence) lowerCase, (CharSequence) "marrow", false);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
