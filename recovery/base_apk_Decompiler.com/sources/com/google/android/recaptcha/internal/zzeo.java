package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.Map;
import kotlin.VideoTimelineResponseBody;
import kotlin.setAction;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeo implements zzen {
    private final Context zzb;
    private final Map zzc = VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write(2, "activity"), setAction.write(3, "phone"), setAction.write(4, "input_method"), setAction.write(5, "audio"));

    public zzeo(Context context) {
        this.zzb = context;
    }

    @Override // com.google.android.recaptcha.internal.zzen
    public final Object zza(Object... objArr) throws zzae {
        Object obj = objArr[0];
        if (true != (obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num == null) {
            throw new zzae(4, 5, null);
        }
        Object obj2 = this.zzc.get(Integer.valueOf(num.intValue()));
        if (obj2 != null) {
            return this.zzb.getSystemService((String) obj2);
        }
        throw new zzae(4, 4, null);
    }

    @Override // com.google.android.recaptcha.internal.zzen
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzel.zza(this, objArr);
    }
}
