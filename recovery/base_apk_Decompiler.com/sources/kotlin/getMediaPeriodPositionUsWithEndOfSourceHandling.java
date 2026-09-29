package kotlin;

import com.marrow.data.models.pearl.Pearl;
import com.marrow.data.models.pearl.PearlMini;
import com.marrow.data.models.pearl.PearlSubjectInfo;
import com.marrow.data.models.pearl.PearlTopicInfo;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class getMediaPeriodPositionUsWithEndOfSourceHandling implements ServerSideAdInsertionMediaSourceSharedMediaPeriod {
    private DashMediaSourceIso8601Parser AudioAttributesCompatParcelizer;
    private final getSegmentUrl AudioAttributesImplApi21Parcelizer;
    private final getFirstAvailableSegmentNum AudioAttributesImplApi26Parcelizer;
    private maybeThrowManifestError IconCompatParcelizer;
    private final setCompositeSequenceableLoaderFactory RemoteActionCompatParcelizer;
    private final setManifestParser read;
    private final DashMediaSourceXsDateTimeParser write;

    @setSdkPayload
    public getMediaPeriodPositionUsWithEndOfSourceHandling(DashSegmentIndex dashSegmentIndex, maybeThrowManifestError maybethrowmanifesterror, setCompositeSequenceableLoaderFactory setcompositesequenceableloaderfactory, setManifestParser setmanifestparser, DashMediaSourceXsDateTimeParser dashMediaSourceXsDateTimeParser, getFirstAvailableSegmentNum getfirstavailablesegmentnum, getSegmentUrl getsegmenturl) {
        this.AudioAttributesCompatParcelizer = dashSegmentIndex;
        this.IconCompatParcelizer = maybethrowmanifesterror;
        this.RemoteActionCompatParcelizer = setcompositesequenceableloaderfactory;
        this.read = setmanifestparser;
        this.write = dashMediaSourceXsDateTimeParser;
        this.AudioAttributesImplApi26Parcelizer = getfirstavailablesegmentnum;
        this.AudioAttributesImplApi21Parcelizer = getsegmenturl;
    }

    @Override // kotlin.ServerSideAdInsertionMediaSourceSharedMediaPeriod
    public final PearlMini IconCompatParcelizer(String str) {
        return this.IconCompatParcelizer.MediaBrowserCompatItemReceiver(str);
    }

    public final void RemoteActionCompatParcelizer(Pearl[] pearlArr) {
        HashMap<String, String> map;
        HashMap<String, String> map2;
        Pearl[] pearlArr2 = pearlArr;
        if (pearlArr2 == null || pearlArr2.length == 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        HashMap<String, String> mapMediaMetadataCompat = this.AudioAttributesImplApi21Parcelizer.MediaMetadataCompat();
        int length = pearlArr2.length;
        int i = 0;
        while (i < length) {
            Pearl pearl = pearlArr2[i];
            if (pearl.isPublished()) {
                HashMap map3 = new HashMap();
                if (!parseCea608AccessibilityChannel.read(pearl.getSubjectIds())) {
                    int i2 = 0;
                    while (i2 < pearl.getSubjectIds().length) {
                        String str = mapMediaMetadataCompat.get(pearl.getSubjectIds()[i2]);
                        if (str != null) {
                            map3.put(str, Boolean.TRUE);
                            map2 = mapMediaMetadataCompat;
                            arrayList3.add(new PearlTopicInfo(pearl.getId(), pearl.getSubjectIds()[i2], str));
                        } else {
                            map2 = mapMediaMetadataCompat;
                        }
                        i2++;
                        mapMediaMetadataCompat = map2;
                    }
                }
                map = mapMediaMetadataCompat;
                if (!parseCea608AccessibilityChannel.read(pearl.getRootSubjectIds())) {
                    this.write.read("pearl_id", pearl.getId());
                    this.AudioAttributesImplApi26Parcelizer.read("pearl_id", pearl.getId());
                    for (int i3 = 0; i3 < pearl.getRootSubjectIds().length; i3++) {
                        String str2 = pearl.getRootSubjectIds()[i3];
                        arrayList2.add(new PearlSubjectInfo(pearl.getId(), str2));
                        Boolean bool = (Boolean) map3.get(str2);
                        if (bool == null || !bool.booleanValue()) {
                            arrayList3.add(new PearlTopicInfo(pearl.getId(), str2, str2));
                        }
                    }
                }
                arrayList.add(pearl);
            } else {
                map = mapMediaMetadataCompat;
                ((DashSegmentIndex) this.AudioAttributesCompatParcelizer).IconCompatParcelizer(DashSegmentIndex.read(pearl));
                this.write.read("pearl_id", pearl.getId());
                this.AudioAttributesImplApi26Parcelizer.read("pearl_id", pearl.getId());
            }
            i++;
            pearlArr2 = pearlArr;
            mapMediaMetadataCompat = map;
        }
        ((DashSegmentIndex) this.AudioAttributesCompatParcelizer).IconCompatParcelizer((PlayerEmsgHandlerManifestExpiryEventInfo[]) arrayList.toArray(new Pearl[0]));
        this.write.IconCompatParcelizer(arrayList2.toArray(new PearlSubjectInfo[0]));
        this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(arrayList3.toArray(new PearlTopicInfo[0]));
        jumpDrawablesToCurrentState.write(getClass(), "Insert bulk", jCurrentTimeMillis);
    }

    public final void read() {
        ((DashSegmentIndex) this.AudioAttributesCompatParcelizer).ah_();
    }
}
