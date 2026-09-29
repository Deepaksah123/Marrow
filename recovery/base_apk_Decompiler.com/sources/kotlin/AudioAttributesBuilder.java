package kotlin;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioAttributesBuilder extends MagicModuleUseCase implements getCreatedOnDateMs {
    public AudioAttributesBuilder() {
        super(0);
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        Pair pairWrite;
        String strSubstring;
        String strSubstring2;
        List listAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) IntermediateLoginResponseBody.RemoteActionCompatParcelizer(""), (Iterable) TestGroupLSModel.AudioAttributesCompatParcelizer((CharSequence) downloadMagicModuleDetail.AudioAttributesCompatParcelizer(new File("/proc/cpuinfo"), getSubmissionTimestamp.IconCompatParcelizer))), (Iterable) IntermediateLoginResponseBody.RemoteActionCompatParcelizer(""));
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listAudioAttributesCompatParcelizer, 10));
        int i = 0;
        for (Object obj : listAudioAttributesCompatParcelizer) {
            if (i < 0) {
                IntermediateLoginResponseBody.read();
            }
            arrayList.add(setAction.write((String) obj, Integer.valueOf(i)));
            i++;
        }
        List listAudioAttributesImplApi26Parcelizer = IntermediateLoginResponseBody.AudioAttributesImplApi26Parcelizer((Iterable) IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList, (getAnswerMap) getMaxSupportedChannelCountForPassthrough.IconCompatParcelizer));
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        for (Object obj2 : listAudioAttributesCompatParcelizer) {
            if (i2 < 0) {
                IntermediateLoginResponseBody.read();
            }
            if (!listAudioAttributesImplApi26Parcelizer.contains(Integer.valueOf(i2))) {
                arrayList2.add(obj2);
            }
            i2++;
        }
        ArrayList arrayList3 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList2, 10));
        Iterator it = arrayList2.iterator();
        int i3 = 0;
        while (true) {
            Integer num = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (i3 < 0) {
                IntermediateLoginResponseBody.read();
            }
            Integer numValueOf = Integer.valueOf(i3);
            if (TestGroupLSModel.IconCompatParcelizer((CharSequence) next)) {
                num = numValueOf;
            }
            arrayList3.add(num);
            i3++;
        }
        List<List> listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) IntermediateLoginResponseBody.AudioAttributesImplApi26Parcelizer((Iterable) arrayList3), (getAnswerMap) new registerAudioDeviceCallback(arrayList2));
        ArrayList arrayList4 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listRemoteActionCompatParcelizer, 10));
        for (List list : listRemoteActionCompatParcelizer) {
            ArrayList arrayList5 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                List<String> listWrite = TestGroupLSModel.write((String) it2.next(), new String[]{":"}, 2, 2);
                if (listWrite.size() != 2) {
                    listWrite = null;
                }
                if (listWrite != null) {
                    ArrayList arrayList6 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listWrite, 10));
                    for (String str : listWrite) {
                        int length = str.length();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                strSubstring = "";
                                break;
                            }
                            if (!setStatusTimestamp.RemoteActionCompatParcelizer(str.charAt(i4))) {
                                strSubstring = str.substring(i4);
                                break;
                            }
                            i4++;
                        }
                        int iWrite = TestGroupLSModel.write((CharSequence) strSubstring);
                        while (true) {
                            if (iWrite < 0) {
                                strSubstring2 = "";
                                break;
                            }
                            if (!setStatusTimestamp.RemoteActionCompatParcelizer(strSubstring.charAt(iWrite))) {
                                strSubstring2 = strSubstring.substring(0, iWrite + 1);
                                break;
                            }
                            iWrite--;
                        }
                        arrayList6.add(strSubstring2);
                    }
                    pairWrite = setAction.write(arrayList6.get(0), arrayList6.get(1));
                } else {
                    pairWrite = null;
                }
                if (pairWrite != null) {
                    arrayList5.add(pairWrite);
                }
            }
            arrayList4.add(arrayList5);
        }
        ArrayList<List> arrayList7 = new ArrayList();
        for (Object obj3 : arrayList4) {
            if (!((List) obj3).isEmpty()) {
                arrayList7.add(obj3);
            }
        }
        ArrayList arrayList8 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList7, 10));
        for (List list2 : arrayList7) {
            ArrayList arrayList9 = new ArrayList();
            boolean z = false;
            for (Object obj4 : list2) {
                if (z) {
                    arrayList9.add(obj4);
                } else if (onAudioCapabilitiesChanged.read((Pair) obj4)) {
                    arrayList9.add(obj4);
                    z = true;
                }
            }
            arrayList8.add(arrayList9);
        }
        ArrayList<List> arrayList10 = new ArrayList();
        for (Object obj5 : arrayList8) {
            if (!((List) obj5).isEmpty()) {
                arrayList10.add(obj5);
            }
        }
        ArrayList arrayList11 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList10, 10));
        for (List list3 : arrayList10) {
            ArrayList arrayList12 = new ArrayList();
            for (Object obj6 : list3) {
                if (!onAudioCapabilitiesChanged.read((Pair) obj6)) {
                    arrayList12.add(obj6);
                }
            }
            arrayList11.add(arrayList12);
        }
        ArrayList arrayList13 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList7, 10));
        for (List list4 : arrayList7) {
            ArrayList arrayList14 = new ArrayList();
            for (Object obj7 : list4) {
                if (!onAudioCapabilitiesChanged.read((Pair) obj7)) {
                    arrayList14.add(obj7);
                }
            }
            arrayList13.add(arrayList14);
        }
        ArrayList arrayList15 = new ArrayList();
        for (Object obj8 : arrayList13) {
            if (!((List) obj8).isEmpty()) {
                arrayList15.add(obj8);
            }
        }
        return new AacUtilAacAudioObjectType(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList15), arrayList11);
    }
}
