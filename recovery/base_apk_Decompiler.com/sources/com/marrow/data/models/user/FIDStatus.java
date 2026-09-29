package com.marrow.data.models.user;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.getMagicModuleSavedMcqCount;
import kotlin.getMagicModuleTimeline;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/marrow/data/models/user/FIDStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "getValue", "()I", "REQUIRED_TO_REGISTER", "ALREADY_REGISTERED"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FIDStatus {
    private static final /* synthetic */ getMagicModuleSavedMcqCount $ENTRIES;
    private static final /* synthetic */ FIDStatus[] $VALUES;
    private final int value;
    public static final FIDStatus REQUIRED_TO_REGISTER = new FIDStatus("REQUIRED_TO_REGISTER", 0, 1);
    public static final FIDStatus ALREADY_REGISTERED = new FIDStatus("ALREADY_REGISTERED", 1, 2);

    private FIDStatus(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        FIDStatus[] fIDStatusArr$values = $values();
        $VALUES = fIDStatusArr$values;
        $ENTRIES = getMagicModuleTimeline.IconCompatParcelizer(fIDStatusArr$values);
    }

    private static final /* synthetic */ FIDStatus[] $values() {
        return new FIDStatus[]{REQUIRED_TO_REGISTER, ALREADY_REGISTERED};
    }

    public static getMagicModuleSavedMcqCount<FIDStatus> getEntries() {
        return $ENTRIES;
    }

    public static FIDStatus valueOf(String str) {
        return (FIDStatus) Enum.valueOf(FIDStatus.class, str);
    }

    public static FIDStatus[] values() {
        return (FIDStatus[]) $VALUES.clone();
    }
}
