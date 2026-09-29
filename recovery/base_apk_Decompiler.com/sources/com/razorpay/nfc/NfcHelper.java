package com.razorpay.nfc;

import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleUseCase;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TestGroupLSModel;
import kotlin.Triple;
import kotlin.getAnswerMap;
import kotlin.getOrderDetails;
import kotlin.getSINGLE_SYNC_RESULT;
import kotlin.newEncryptedObject;
import kotlin.setAction;
import kotlin.setStatusTimestamp;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001-B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u0004J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0002J$\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u00180\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0002J \u0010\u001a\u001a\u0004\u0018\u00010\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0004H\u0002J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0004H\u0002J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\u0004J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u001f\u001a\u00020\u0004H\u0002J&\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00182\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u000eH\u0002J,\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0007\u0018\u00010%2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u000eH\u0002J\u0010\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u000bH\u0002J\u0012\u0010(\u001a\u0004\u0018\u00010\u001e2\b\u0010\n\u001a\u0004\u0018\u00010)J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H\u0002J\n\u0010+\u001a\u00020\u0004*\u00020\u000bJ\n\u0010,\u001a\u00020\u000b*\u00020\u0004¨\u0006."}, d2 = {"Lcom/razorpay/nfc/NfcHelper;", "", "()V", "buildPdolData", "", "pdolTemplate", "amexAlt", "", "containsTag", "tlv", "tag", "", "currentDateYYMMDD", "expectedLen", "", "currentTimeHHMMSS", "extractAfl", "tlvs", "", "Lcom/razorpay/nfc/NfcHelper$Tlv;", "extractAidFromPpse", "response", "extractPdolFromSelectResponse", "extractRecordsFromAfl", "Lkotlin/Pair;", "afl", "findFirstTagValue", "is6985", "isSuccess", "parseTlv", "Lcom/razorpay/nfc/CardData;", "data", "parseTlvList", "readLength", "bytes", "offset", "readTag", "Lkotlin/Triple;", "splitTrack2", "track2", "startCardScanner", "Landroid/nfc/Tag;", "stripStatusWord", "hexToByteArray", "toHexString", "Tlv", "core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class NfcHelper {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/razorpay/nfc/NfcHelper$Tlv;", "", "tag", "", SessionDescription.ATTR_LENGTH, "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "constructed", "", "(Ljava/lang/String;I[BZ)V", "getConstructed", "()Z", "getLength", "()I", "getTag", "()Ljava/lang/String;", "getValue", "()[B", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    static final /* data */ class Tlv {
        private final int __l1_;
        private final boolean _l_1l__;
        private final byte[] _llI;
        private final String l$1_I$l$;

        public Tlv(String str, int i, byte[] bArr, boolean z) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(bArr, "");
            this.l$1_I$l$ = str;
            this.__l1_ = i;
            this._llI = bArr;
            this._l_1l__ = z;
        }

        public final boolean getConstructed() {
            return this._l_1l__;
        }

        public final int getLength() {
            return this.__l1_;
        }

        public final String getTag() {
            return this.l$1_I$l$;
        }

        public final byte[] getValue() {
            return this._llI;
        }

        public static /* synthetic */ Tlv copy$default(Tlv tlv, String str, int i, byte[] bArr, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = tlv.l$1_I$l$;
            }
            if ((i2 & 2) != 0) {
                i = tlv.__l1_;
            }
            if ((i2 & 4) != 0) {
                bArr = tlv._llI;
            }
            if ((i2 & 8) != 0) {
                z = tlv._l_1l__;
            }
            return tlv.copy(str, i, bArr, z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getL$1_I$l$() {
            return this.l$1_I$l$;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int get__l1_() {
            return this.__l1_;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final byte[] get_llI() {
            return this._llI;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean get_l_1l__() {
            return this._l_1l__;
        }

        public final Tlv copy(String tag, int length, byte[] value, boolean constructed) {
            toMagicModuleMetaRepoModel.write(tag, "");
            toMagicModuleMetaRepoModel.write(value, "");
            return new Tlv(tag, length, value, constructed);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tlv)) {
                return false;
            }
            Tlv tlv = (Tlv) other;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.l$1_I$l$, (Object) tlv.l$1_I$l$) && this.__l1_ == tlv.__l1_ && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this._llI, tlv._llI) && this._l_1l__ == tlv._l_1l__;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v2, types: [int] */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v4 */
        public final int hashCode() {
            int iHashCode = this.l$1_I$l$.hashCode();
            int iHashCode2 = Integer.hashCode(this.__l1_);
            int iHashCode3 = Arrays.hashCode(this._llI);
            boolean z = this._l_1l__;
            ?? r3 = z;
            if (z) {
                r3 = 1;
            }
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + r3;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Tlv(tag=");
            sb.append(this.l$1_I$l$);
            sb.append(", length=");
            sb.append(this.__l1_);
            sb.append(", value=");
            sb.append(Arrays.toString(this._llI));
            sb.append(", constructed=");
            sb.append(this._l_1l__);
            sb.append(')');
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: com.razorpay.nfc.NfcHelper$toHexString$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "invoke", "(B)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<Byte, CharSequence> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public final CharSequence invoke(byte b) {
            String str = String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            return str;
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ CharSequence invoke(Byte b) {
            return invoke(b.byteValue());
        }

        AnonymousClass1() {
            super(1);
        }
    }

    public final String toHexString(byte[] bArr) {
        toMagicModuleMetaRepoModel.write(bArr, "");
        return getOrderDetails.write(bArr, "", "", "", -1, "...", (getAnswerMap<? super Byte, ? extends CharSequence>) AnonymousClass1.INSTANCE);
    }

    private final boolean l$1_I$l$(byte[] bArr, String str) {
        Triple<String, Integer, Boolean> tripleL$1_I$l$;
        int iIntValue = 0;
        while (iIntValue < bArr.length && (tripleL$1_I$l$ = l$1_I$l$(bArr, iIntValue)) != null) {
            String strAudioAttributesCompatParcelizer = tripleL$1_I$l$.AudioAttributesCompatParcelizer();
            int iIntValue2 = tripleL$1_I$l$.read().intValue();
            if (TestGroupLSModel.read(strAudioAttributesCompatParcelizer, str, true)) {
                return true;
            }
            Pair<Integer, Integer> pair__l1_ = __l1_(bArr, iIntValue + iIntValue2);
            if (pair__l1_ == null) {
                return false;
            }
            iIntValue += iIntValue2 + pair__l1_.read().intValue();
        }
        return false;
    }

    public final byte[] hexToByteArray(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        List<String> listRemoteActionCompatParcelizer = TestGroupLSModel.RemoteActionCompatParcelizer((CharSequence) str, 2);
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listRemoteActionCompatParcelizer, 10));
        Iterator<T> it = listRemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) Integer.parseInt((String) it.next(), setStatusTimestamp.RemoteActionCompatParcelizer(16))));
        }
        return IntermediateLoginResponseBody.write((Collection<Byte>) arrayList);
    }

    public final CardData startCardScanner(Tag tag) throws IOException {
        byte[] next;
        byte[] bArrTransceive;
        IsoDep isoDep = IsoDep.get(tag);
        try {
            if (isoDep == null) {
                return null;
            }
            try {
                isoDep.connect();
                isoDep.setTimeout(5000);
                byte[] bArrTransceive2 = isoDep.transceive(EmvCommands.INSTANCE.getSELECT_PPSE());
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bArrTransceive2, "");
                byte[] bArrExtractAidFromPpse = extractAidFromPpse(bArrTransceive2);
                Iterator<byte[]> it = (bArrExtractAidFromPpse != null ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer(bArrExtractAidFromPpse) : EmvCommands.INSTANCE.getKNOWN_AIDS()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        bArrTransceive = null;
                        break;
                    }
                    next = it.next();
                    bArrTransceive = isoDep.transceive(EmvCommands.INSTANCE.selectAid(next));
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bArrTransceive, "");
                    if (_l_1l__(bArrTransceive)) {
                        break;
                    }
                }
                if (next == null) {
                    return null;
                }
                byte[] bArr__l1_ = bArrTransceive != null ? __l1_(bArrTransceive) : null;
                byte[] bArrTransceive3 = isoDep.transceive(EmvCommands.INSTANCE.getProcessingOptions(l$1_I$l$(bArr__l1_, false)));
                if (bArr__l1_ != null && l$1_I$l$(bArr__l1_, "9F6E")) {
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bArrTransceive3, "");
                    if (I__1l(bArrTransceive3)) {
                        bArrTransceive3 = isoDep.transceive(EmvCommands.INSTANCE.getProcessingOptions(l$1_I$l$(bArr__l1_, true)));
                    }
                }
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bArrTransceive3, "");
                ArrayList arrayList_1__ = _1__(l$1_I$l$(l$1_I$l$(bArrTransceive3)));
                if (arrayList_1__.isEmpty()) {
                    newEncryptedObject newencryptedobject = new newEncryptedObject(1, 3);
                    ArrayList arrayList = new ArrayList();
                    Iterator<Integer> it2 = newencryptedobject.iterator();
                    while (it2.hasNext()) {
                        int iRemoteActionCompatParcelizer = ((getSINGLE_SYNC_RESULT) it2).RemoteActionCompatParcelizer();
                        newEncryptedObject newencryptedobject2 = new newEncryptedObject(1, 3);
                        ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(newencryptedobject2, 10));
                        Iterator<Integer> it3 = newencryptedobject2.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(setAction.write(Integer.valueOf(iRemoteActionCompatParcelizer), Integer.valueOf(((getSINGLE_SYNC_RESULT) it3).RemoteActionCompatParcelizer())));
                        }
                        IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList, (Iterable) arrayList2);
                    }
                    arrayList_1__ = arrayList;
                }
                for (Pair<Integer, Integer> pair : arrayList_1__) {
                    byte[] bArrTransceive4 = isoDep.transceive(EmvCommands.INSTANCE.readRecord(pair.read().intValue(), pair.RemoteActionCompatParcelizer().intValue()));
                    if (bArrTransceive4.length > 2 && bArrTransceive4[bArrTransceive4.length - 2] == -112) {
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bArrTransceive4, "");
                        CardData tlv = parseTlv(bArrTransceive4);
                        if (tlv != null) {
                            return tlv;
                        }
                    }
                }
            } catch (Exception e) {
                Exception exc = e;
            }
            return null;
        } finally {
            isoDep.close();
        }
    }

    public final CardData parseTlv(byte[] data) {
        String hexString;
        toMagicModuleMetaRepoModel.write(data, "");
        List<Tlv> listL$1_I$l$ = l$1_I$l$(data);
        byte[] bArrL$1_I$l$ = l$1_I$l$(listL$1_I$l$, "57");
        if (bArrL$1_I$l$ != null) {
            return l$1_I$l$(toHexString(bArrL$1_I$l$));
        }
        byte[] bArrL$1_I$l$2 = l$1_I$l$(listL$1_I$l$, "5A");
        String strSubstring = null;
        if (bArrL$1_I$l$2 == null) {
            return null;
        }
        byte[] bArrL$1_I$l$3 = l$1_I$l$(listL$1_I$l$, "5F24");
        if (bArrL$1_I$l$3 != null && (hexString = toHexString(bArrL$1_I$l$3)) != null) {
            if (hexString.length() < 4) {
                hexString = null;
            }
            if (hexString != null) {
                strSubstring = hexString.substring(0, 4);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
            }
        }
        return new CardData(TestGroupLSModel.write(toHexString(bArrL$1_I$l$2), 'F'), strSubstring);
    }

    private final CardData l$1_I$l$(String str) {
        String strSubstring;
        List listWrite = TestGroupLSModel.write(str, new String[]{"D"}, 0, 6);
        String strWrite = TestGroupLSModel.write((String) listWrite.get(0), 'F');
        if (listWrite.size() <= 1 || ((String) listWrite.get(1)).length() < 4) {
            strSubstring = null;
        } else {
            strSubstring = ((String) listWrite.get(1)).substring(0, 4);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        }
        return new CardData(strWrite, strSubstring);
    }

    private final byte[] l$1_I$l$(List<Tlv> list, String str) {
        Object next;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (TestGroupLSModel.read(((Tlv) next).getTag(), str, true)) {
                break;
            }
        }
        Tlv tlv = (Tlv) next;
        if (tlv != null) {
            return tlv.getValue();
        }
        return null;
    }

    private final List<Tlv> l$1_I$l$(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        l$1_I$l$(this, arrayList, _llI(bArr));
        return arrayList;
    }

    private static final void l$1_I$l$(NfcHelper nfcHelper, List<Tlv> list, byte[] bArr) {
        Triple<String, Integer, Boolean> tripleL$1_I$l$;
        int i = 0;
        while (i < bArr.length && (tripleL$1_I$l$ = nfcHelper.l$1_I$l$(bArr, i)) != null) {
            String strAudioAttributesCompatParcelizer = tripleL$1_I$l$.AudioAttributesCompatParcelizer();
            int iIntValue = tripleL$1_I$l$.read().intValue();
            boolean zBooleanValue = tripleL$1_I$l$.RemoteActionCompatParcelizer().booleanValue();
            int i2 = i + iIntValue;
            Pair<Integer, Integer> pair__l1_ = nfcHelper.__l1_(bArr, i2);
            if (pair__l1_ == null) {
                return;
            }
            int iIntValue2 = pair__l1_.RemoteActionCompatParcelizer().intValue();
            int iIntValue3 = i2 + pair__l1_.read().intValue();
            int i3 = iIntValue3 + iIntValue2;
            if (iIntValue2 < 0 || i3 > bArr.length) {
                return;
            }
            byte[] bArrWrite = getOrderDetails.write(bArr, iIntValue3, i3);
            list.add(new Tlv(strAudioAttributesCompatParcelizer, iIntValue2, bArrWrite, zBooleanValue));
            if (zBooleanValue) {
                l$1_I$l$(nfcHelper, list, bArrWrite);
            }
            i = i3;
        }
    }

    private final byte[] __l1_(byte[] bArr) {
        return l$1_I$l$(l$1_I$l$(bArr), "9F38");
    }

    private final Triple<String, Integer, Boolean> l$1_I$l$(byte[] bArr, int i) {
        if (i >= bArr.length) {
            return null;
        }
        byte b = bArr[i];
        int i2 = 1;
        boolean z = (b & 32) == 32;
        byte[] bArrRemoteActionCompatParcelizer = {b};
        if ((b & 31) == 31) {
            int i3 = i + 1;
            while (i3 < bArr.length) {
                bArrRemoteActionCompatParcelizer = getOrderDetails.RemoteActionCompatParcelizer(bArrRemoteActionCompatParcelizer, bArr[i3]);
                i2++;
                byte b2 = bArr[i3];
                i3++;
                if ((b2 & 128) == 0) {
                    break;
                }
            }
        }
        return new Triple<>(toHexString(bArrRemoteActionCompatParcelizer), Integer.valueOf(i2), Boolean.valueOf(z));
    }

    private final Pair<Integer, Integer> __l1_(byte[] bArr, int i) {
        if (i >= bArr.length) {
            return null;
        }
        int i2 = bArr[i];
        if ((i2 & 128) == 0) {
            return setAction.write(Integer.valueOf(i2 & 255), 1);
        }
        int i3 = i2 & 127;
        if (i + i3 >= bArr.length) {
            return null;
        }
        int i4 = 0;
        if (i3 > 0) {
            int i5 = 1;
            while (true) {
                i4 = (i4 << 8) | (bArr[i + i5] & 255);
                if (i5 == i3) {
                    break;
                }
                i5++;
            }
        }
        return setAction.write(Integer.valueOf(i4), Integer.valueOf(i3 + 1));
    }

    private final byte[] _llI(byte[] bArr) {
        return (bArr.length >= 2 && bArr[bArr.length - 2] == -112 && bArr[bArr.length + (-1)] == 0) ? getOrderDetails.write(bArr, 0, bArr.length - 2) : bArr;
    }

    private final boolean _l_1l__(byte[] bArr) {
        return bArr.length >= 2 && bArr[bArr.length - 2] == -112 && bArr[bArr.length - 1] == 0;
    }

    private final boolean I__1l(byte[] bArr) {
        return bArr.length >= 2 && bArr[bArr.length - 2] == 105 && bArr[bArr.length - 1] == -123;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final byte[] l$1_I$l$(byte[] r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 637
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.nfc.NfcHelper.l$1_I$l$(byte[], boolean):byte[]");
    }

    private final byte[] l$1_I$l$(int i) {
        try {
            String str = new SimpleDateFormat("HHmmss", Locale.US).format(new Date());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            List<String> listRemoteActionCompatParcelizer = TestGroupLSModel.RemoteActionCompatParcelizer((CharSequence) str, 2);
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listRemoteActionCompatParcelizer, 10));
            Iterator<T> it = listRemoteActionCompatParcelizer.iterator();
            while (it.hasNext()) {
                arrayList.add(Byte.valueOf((byte) Integer.parseInt((String) it.next(), setStatusTimestamp.RemoteActionCompatParcelizer(16))));
            }
            byte[] bArrWrite = IntermediateLoginResponseBody.write((Collection<Byte>) arrayList);
            if (bArrWrite.length >= i) {
                return IntermediateLoginResponseBody.write((Collection<Byte>) getOrderDetails.read(bArrWrite, i));
            }
            int length = i - bArrWrite.length;
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                bArr[i2] = 0;
            }
            return getOrderDetails.RemoteActionCompatParcelizer(bArrWrite, bArr);
        } catch (Exception unused) {
            byte[] bArr2 = new byte[i];
            for (int i3 = 0; i3 < i; i3++) {
                bArr2[i3] = 0;
            }
            return bArr2;
        }
    }

    private final byte[] __l1_(int i) {
        try {
            String str = new SimpleDateFormat("yyMMdd", Locale.US).format(new Date());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            List<String> listRemoteActionCompatParcelizer = TestGroupLSModel.RemoteActionCompatParcelizer((CharSequence) str, 2);
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listRemoteActionCompatParcelizer, 10));
            Iterator<T> it = listRemoteActionCompatParcelizer.iterator();
            while (it.hasNext()) {
                arrayList.add(Byte.valueOf((byte) Integer.parseInt((String) it.next(), setStatusTimestamp.RemoteActionCompatParcelizer(16))));
            }
            byte[] bArrWrite = IntermediateLoginResponseBody.write((Collection<Byte>) arrayList);
            if (bArrWrite.length >= i) {
                return IntermediateLoginResponseBody.write((Collection<Byte>) getOrderDetails.read(bArrWrite, i));
            }
            int length = i - bArrWrite.length;
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                bArr[i2] = 0;
            }
            return getOrderDetails.RemoteActionCompatParcelizer(bArrWrite, bArr);
        } catch (Exception unused) {
            byte[] bArr2 = new byte[i];
            for (int i3 = 0; i3 < i; i3++) {
                bArr2[i3] = 0;
            }
            return bArr2;
        }
    }

    private final List<Pair<Integer, Integer>> _1__(byte[] bArr) {
        if (bArr == null || bArr.length % 4 != 0) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < bArr.length; i += 4) {
            int i2 = (bArr[i] & 255) >> 3;
            int i3 = bArr[i + 1] & 255;
            int i4 = bArr[i + 2] & 255;
            if (i2 > 0 && i4 >= i3 && i4 <= 16 && i3 <= i4) {
                while (true) {
                    arrayList.add(setAction.write(Integer.valueOf(i2), Integer.valueOf(i3)));
                    if (i3 != i4) {
                        i3++;
                    }
                }
            }
        }
        return arrayList;
    }

    private final byte[] l$1_I$l$(List<Tlv> list) {
        byte[] bArrL$1_I$l$ = l$1_I$l$(list, "94");
        if (bArrL$1_I$l$ != null) {
            return bArrL$1_I$l$;
        }
        byte[] bArrL$1_I$l$2 = l$1_I$l$(list, "80");
        if (bArrL$1_I$l$2 == null || bArrL$1_I$l$2.length <= 2) {
            return null;
        }
        return getOrderDetails.write(bArrL$1_I$l$2, 2, bArrL$1_I$l$2.length);
    }

    public final byte[] extractAidFromPpse(byte[] response) {
        toMagicModuleMetaRepoModel.write(response, "");
        byte[] bArrL$1_I$l$ = l$1_I$l$(l$1_I$l$(response), "4F");
        if (bArrL$1_I$l$ == null) {
            return null;
        }
        return bArrL$1_I$l$;
    }
}
