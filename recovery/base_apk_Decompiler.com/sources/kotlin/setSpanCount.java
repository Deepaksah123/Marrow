package kotlin;

import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin.getFirstIndexOfModelInBuildingList;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aG\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u000f\u001a\u00020\b*\u0004\u0018\u00010\u000e2\b\u0010\u0001\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/deserializeFromNumber;", "p0", "", "p1", "p2", "p3", "Lo/findProperty;", "p4", "", "p5", "p6", "Lo/setStagedModel;", "IconCompatParcelizer", "(Lo/deserializeFromNumber;IIIJZZ)Lo/setStagedModel;", "Lo/getFirstIndexOfModelInBuildingList;", "write", "(Lo/getFirstIndexOfModelInBuildingList;Lo/setStagedModel;)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setSpanCount {
    public static final setStagedModel IconCompatParcelizer(deserializeFromNumber deserializefromnumber, int i, int i2, int i3, long j, boolean z, boolean z2) {
        return new getCallback(z2, 1, 1, z ? null : new getFirstIndexOfModelInBuildingList(new getFirstIndexOfModelInBuildingList.IconCompatParcelizer(requestModelBuild.read(deserializefromnumber, findProperty.AudioAttributesImplBaseParcelizer(j)), findProperty.AudioAttributesImplBaseParcelizer(j), 1L), new getFirstIndexOfModelInBuildingList.IconCompatParcelizer(requestModelBuild.read(deserializefromnumber, findProperty.read(j)), findProperty.read(j), 1L), findProperty.AudioAttributesImplApi21Parcelizer(j)), new getSpanSizeLookup(1L, 1, i, i2, i3, deserializefromnumber));
    }

    public static final boolean write(getFirstIndexOfModelInBuildingList getfirstindexofmodelinbuildinglist, setStagedModel setstagedmodel) {
        if (getfirstindexofmodelinbuildinglist == null || setstagedmodel == null) {
            return true;
        }
        if (getfirstindexofmodelinbuildinglist.getAudioAttributesCompatParcelizer().getIconCompatParcelizer() == getfirstindexofmodelinbuildinglist.getIconCompatParcelizer().getIconCompatParcelizer()) {
            return getfirstindexofmodelinbuildinglist.getAudioAttributesCompatParcelizer().getRead() == getfirstindexofmodelinbuildinglist.getIconCompatParcelizer().getRead();
        }
        if ((getfirstindexofmodelinbuildinglist.getRemoteActionCompatParcelizer() ? getfirstindexofmodelinbuildinglist.getAudioAttributesCompatParcelizer() : getfirstindexofmodelinbuildinglist.getIconCompatParcelizer()).getRead() != 0) {
            return false;
        }
        if (setstagedmodel.IconCompatParcelizer().AudioAttributesImplApi26Parcelizer() != (getfirstindexofmodelinbuildinglist.getRemoteActionCompatParcelizer() ? getfirstindexofmodelinbuildinglist.getIconCompatParcelizer() : getfirstindexofmodelinbuildinglist.getAudioAttributesCompatParcelizer()).getRead()) {
            return false;
        }
        final MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer();
        audioAttributesCompatParcelizer.IconCompatParcelizer = true;
        setstagedmodel.AudioAttributesCompatParcelizer(new getAnswerMap() { // from class: o.setFilterDuplicates
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setSpanCount.write(audioAttributesCompatParcelizer, (getSpanSizeLookup) obj);
            }
        });
        return audioAttributesCompatParcelizer.IconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, getSpanSizeLookup getspansizelookup) {
        if (getspansizelookup.IconCompatParcelizer().length() > 0) {
            audioAttributesCompatParcelizer.IconCompatParcelizer = false;
        }
        return getShowPopup.INSTANCE;
    }
}
