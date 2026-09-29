package kotlin;

import java.util.Calendar;
import kotlin.Metadata;
import kotlin.getBody;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0007J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0007J:\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\tH\u0007J6\u0010\u001b\u001a\u00020\u00072\n\u0010\u001c\u001a\u00060\u001dj\u0002`\u001e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u000bH\u0007J \u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0007J\u0018\u0010 \u001a\n !*\u0004\u0018\u00010\t0\t2\u0006\u0010\u0014\u001a\u00020\u000eH\u0002¨\u0006\""}, d2 = {"Lcom/marrow2/ui/test/landing/model/TestListAdapterItemModel;", "", "<init>", "()V", "newGtaItem", "Lcom/marrow2/ui/test/landing/model/TestListAdapterItemTypeModel$GTAHeader;", "newExpandAllItem", "Lcom/marrow2/ui/test/landing/model/TestListAdapterItemTypeModel;", "id", "", "isVisible", "", "newPrevYearTestContainer", "whichYear", "", "yearLabel", "newYearAndMonthStickyHeaderItem", "yearName", "monthName", "newMonthNameItem", "monthIndex", "yearIndex", "showMonthTypeLabel", "monthType", "Lcom/marrow2/ui/test/landing/model/MonthType;", "isExpanded", "yearString", "newMonthTestModel", "test", "Lcom/marrow2/domain/test/model/TestMiniUCModel;", "Lcom/marrow2/ui/test/landing/model/TestMiniVMModel;", "newEmptyModel", "getMonthName", "kotlin.jvm.PlatformType", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TimeInterval {
    public static final TimeInterval write = new TimeInterval();

    private TimeInterval() {
    }

    public static getBody.RemoteActionCompatParcelizer RemoteActionCompatParcelizer() {
        return new getBody.RemoteActionCompatParcelizer(null, 1, null);
    }

    @getMagicModuleMeta
    public static final getBody RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return new getBody.write(str, true);
    }

    @getMagicModuleMeta
    public static final getBody AudioAttributesCompatParcelizer(int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return new getBody.MediaBrowserCompatCustomActionResultReceiver(i, str);
    }

    @getMagicModuleMeta
    public static final getBody IconCompatParcelizer(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        return new getBody.AudioAttributesImplApi26Parcelizer(str2, LoyaltyPointsBalanceBuilder.AudioAttributesCompatParcelizer, str);
    }

    @getMagicModuleMeta
    public static final getBody IconCompatParcelizer(int i, int i2, boolean z, LoyaltyPointsBalanceBuilder loyaltyPointsBalanceBuilder, boolean z2, String str) {
        Object objValueOf = "";
        toMagicModuleMetaRepoModel.write(loyaltyPointsBalanceBuilder, "");
        toMagicModuleMetaRepoModel.write(str, "");
        int i3 = Calendar.getInstance().get(1);
        if (loyaltyPointsBalanceBuilder == LoyaltyPointsBalanceBuilder.read && i3 != i2) {
            objValueOf = Integer.valueOf(i2);
        }
        String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i);
        StringBuilder sb = new StringBuilder();
        sb.append(strAudioAttributesCompatParcelizer);
        sb.append(" ");
        sb.append(objValueOf);
        return new getBody.AudioAttributesCompatParcelizer(sb.toString(), z2, z, loyaltyPointsBalanceBuilder, str);
    }

    @getMagicModuleMeta
    public static final getBody AudioAttributesCompatParcelizer(getBigEndianInt getbigendianint, int i, boolean z, LoyaltyPointsBalanceBuilder loyaltyPointsBalanceBuilder, boolean z2) {
        toMagicModuleMetaRepoModel.write(getbigendianint, "");
        toMagicModuleMetaRepoModel.write(loyaltyPointsBalanceBuilder, "");
        String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, "");
        return new getBody.MediaBrowserCompatItemReceiver(z2, getbigendianint, strAudioAttributesCompatParcelizer, loyaltyPointsBalanceBuilder, z);
    }

    @getMagicModuleMeta
    public static final getBody AudioAttributesCompatParcelizer(boolean z, int i, int i2) {
        fromAdPlaybackState fromadplaybackstate = fromAdPlaybackState.read;
        return new getBody.read(z, fromAdPlaybackState.write(i + 1, i2));
    }

    private static String AudioAttributesCompatParcelizer(int i) {
        fromAdPlaybackState fromadplaybackstate = fromAdPlaybackState.read;
        return fromAdPlaybackState.RemoteActionCompatParcelizer()[i];
    }
}
