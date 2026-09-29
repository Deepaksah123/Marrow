package kotlin;

import android.content.Context;
import com.marrow.data.models.content.ContentBody;
import java.util.ArrayList;
import java.util.List;
import kotlin.CeaDecoderExternalSyntheticLambda0;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.buildCacheKey;
import kotlin.getBounds;

/* JADX INFO: loaded from: classes4.dex */
public final class getCachedAppInstanceId {
    /* JADX WARN: Removed duplicated region for block: B:183:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void read(kotlin._handleOddName r45, final java.util.List<o.buildCacheKey.IconCompatParcelizer> r46, final java.lang.String r47, boolean r48, final kotlin.getCreatedOnDateMs<kotlin.getShowPopup> r49, kotlin._handleUnrecognizedCharacterEscape r50, final int r51, final int r52) {
        /*
            Method dump skipped, instruction units count: 1649
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getCachedAppInstanceId.read(o._handleOddName, java.util.List, java.lang.String, boolean, o.getCreatedOnDateMs, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    private static final String RemoteActionCompatParcelizer(InputAccessor<String> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputAccessor RemoteActionCompatParcelizer() {
        return available.RemoteActionCompatParcelizer$default("", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(InputAccessor inputAccessor) {
        read((InputAccessor<String>) inputAccessor, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(InputAccessor inputAccessor) {
        read((InputAccessor<String>) inputAccessor, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    private static final boolean AudioAttributesImplBaseParcelizer(InputAccessor<Boolean> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(Context context, String str) {
        CeaDecoderExternalSyntheticLambda0.Companion companion = CeaDecoderExternalSyntheticLambda0.INSTANCE;
        context.startActivity(CeaDecoderExternalSyntheticLambda0.Companion.RemoteActionCompatParcelizer(context, str));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(buildCacheKey.IconCompatParcelizer.RemoteActionCompatParcelizer remoteActionCompatParcelizer, InputAccessor inputAccessor) {
        read((InputAccessor<String>) inputAccessor, remoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
        return getShowPopup.INSTANCE;
    }

    private static final List<getBounds> read(List<buildCacheKey.IconCompatParcelizer> list) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer();
        for (buildCacheKey.IconCompatParcelizer iconCompatParcelizer : list) {
            String read = iconCompatParcelizer.getRead();
            int iHashCode = read.hashCode();
            if (iHashCode != -870893912) {
                if (iHashCode != 3213227) {
                    if (iHashCode == 100313435 && read.equals("image")) {
                        read(sb, arrayList, audioAttributesCompatParcelizer);
                        arrayList.add(new getBounds.RemoteActionCompatParcelizer(iconCompatParcelizer));
                    }
                } else if (read.equals("html")) {
                    String remoteActionCompatParcelizer = iconCompatParcelizer.getRemoteActionCompatParcelizer();
                    if (remoteActionCompatParcelizer == null) {
                        remoteActionCompatParcelizer = "";
                    }
                    sb.append(remoteActionCompatParcelizer);
                    if (iconCompatParcelizer.getAudioAttributesImplApi26Parcelizer()) {
                        audioAttributesCompatParcelizer.IconCompatParcelizer = true;
                        read(sb, arrayList, audioAttributesCompatParcelizer);
                    }
                }
            } else if (read.equals(ContentBody.TYPE_CONDITIONAL_HTML)) {
                read(sb, arrayList, audioAttributesCompatParcelizer);
                arrayList.add(new getBounds.read(iconCompatParcelizer));
            }
        }
        read(sb, arrayList, audioAttributesCompatParcelizer);
        return arrayList;
    }

    private static final void read(StringBuilder sb, List<getBounds> list, MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        if (sb.length() == 0) {
            return;
        }
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        list.add(new getBounds.write(string, audioAttributesCompatParcelizer.IconCompatParcelizer));
        TestGroupLSModel.read(sb);
        audioAttributesCompatParcelizer.IconCompatParcelizer = false;
    }

    private static final void read(InputAccessor<String> inputAccessor, String str) {
        inputAccessor.write(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(_handleOddName _handleoddname, List list, String str, boolean z, getCreatedOnDateMs getcreatedondatems, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        read(_handleoddname, list, str, z, getcreatedondatems, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
