package kotlin;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.getFirstIndexOfModelInBuildingList;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u0006\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0002\u001a4\u0010\u000b\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0002\u001a\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a,\u0010\u0015\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a\u0014\u0010\u0017\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0000\u001a\u0014\u0010\u0018\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0002\u001a\u001c\u0010\u0019\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\tH\u0002¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\tX\u008a\u0084\u0002²\u0006\n\u0010\u001d\u001a\u00020\u0001X\u008a\u0084\u0002"}, d2 = {"updateSelectionBoundary", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "info", "Landroidx/compose/foundation/text/selection/SelectableInfo;", "previousSelectionAnchor", "isExpanding", "", "currentRawOffset", "", "isStart", "snapToWordBoundary", "currentLine", "currentOffset", "otherOffset", "crossed", "adjustToBoundaries", "Landroidx/compose/foundation/text/selection/Selection;", TtmlNode.TAG_LAYOUT, "boundaryFunction", "Landroidx/compose/foundation/text/selection/BoundaryFunction;", "anchorOnBoundary", "slot", "ensureAtLeastOneChar", "expandOneChar", "changeOffset", "newOffset", "foundation", "currentRawLine", "anchorSnappedToWordBoundary"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class isDuplicateFilteringEnabled {
    /* JADX INFO: Access modifiers changed from: private */
    public static final getFirstIndexOfModelInBuildingList.IconCompatParcelizer write(final setStagedModel setstagedmodel, final getSpanSizeLookup getspansizelookup, getFirstIndexOfModelInBuildingList.IconCompatParcelizer iconCompatParcelizer) {
        final int write = setstagedmodel.getIconCompatParcelizer() ? getspansizelookup.getWrite() : getspansizelookup.getRemoteActionCompatParcelizer();
        if ((setstagedmodel.getIconCompatParcelizer() ? setstagedmodel.getAudioAttributesCompatParcelizer() : setstagedmodel.getRead()) != getspansizelookup.getIconCompatParcelizer()) {
            return getspansizelookup.write(write);
        }
        final RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new getCreatedOnDateMs() { // from class: o.notifyModelChanged
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Integer.valueOf(isDuplicateFilteringEnabled.AudioAttributesCompatParcelizer(getspansizelookup, write));
            }
        });
        final int remoteActionCompatParcelizer = setstagedmodel.getIconCompatParcelizer() ? getspansizelookup.getRemoteActionCompatParcelizer() : getspansizelookup.getWrite();
        final int i = write;
        RenewEligible renewEligibleWrite2 = getRenewExpiresOn.write(RenewEligibleCompanion.read, new getCreatedOnDateMs() { // from class: o.isMultiSpan
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return isDuplicateFilteringEnabled.AudioAttributesCompatParcelizer(getspansizelookup, i, remoteActionCompatParcelizer, setstagedmodel, renewEligibleWrite);
            }
        });
        if (getspansizelookup.getRead() != iconCompatParcelizer.getIconCompatParcelizer()) {
            return RemoteActionCompatParcelizer(renewEligibleWrite2);
        }
        int audioAttributesCompatParcelizer = getspansizelookup.getAudioAttributesCompatParcelizer();
        if (write == audioAttributesCompatParcelizer) {
            return iconCompatParcelizer;
        }
        if (read(renewEligibleWrite) != getspansizelookup.getMediaBrowserCompatCustomActionResultReceiver().AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer)) {
            return RemoteActionCompatParcelizer(renewEligibleWrite2);
        }
        int read = iconCompatParcelizer.getRead();
        long jMediaBrowserCompatMediaItem = getspansizelookup.getMediaBrowserCompatCustomActionResultReceiver().MediaBrowserCompatMediaItem(read);
        if (!AudioAttributesCompatParcelizer(getspansizelookup, write, setstagedmodel.getIconCompatParcelizer())) {
            return getspansizelookup.write(write);
        }
        if (read == findProperty.AudioAttributesImplBaseParcelizer(jMediaBrowserCompatMediaItem) || read == findProperty.read(jMediaBrowserCompatMediaItem)) {
            return RemoteActionCompatParcelizer(renewEligibleWrite2);
        }
        return getspansizelookup.write(write);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AudioAttributesCompatParcelizer(getSpanSizeLookup getspansizelookup, int i) {
        return getspansizelookup.getMediaBrowserCompatCustomActionResultReceiver().AudioAttributesCompatParcelizer(i);
    }

    private static final int read(RenewEligible<Integer> renewEligible) {
        return renewEligible.RemoteActionCompatParcelizer().intValue();
    }

    private static final getFirstIndexOfModelInBuildingList.IconCompatParcelizer RemoteActionCompatParcelizer(RenewEligible<getFirstIndexOfModelInBuildingList.IconCompatParcelizer> renewEligible) {
        return renewEligible.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getFirstIndexOfModelInBuildingList.IconCompatParcelizer AudioAttributesCompatParcelizer(getSpanSizeLookup getspansizelookup, int i, int i2, setStagedModel setstagedmodel, RenewEligible renewEligible) {
        return AudioAttributesCompatParcelizer(getspansizelookup, read(renewEligible), i, i2, setstagedmodel.getIconCompatParcelizer(), setstagedmodel.write() == runInterceptors.write);
    }

    private static final boolean AudioAttributesCompatParcelizer(getSpanSizeLookup getspansizelookup, int i, boolean z) {
        if (getspansizelookup.getAudioAttributesCompatParcelizer() == -1) {
            return true;
        }
        if (i == getspansizelookup.getAudioAttributesCompatParcelizer()) {
            return false;
        }
        return z ^ (getspansizelookup.RemoteActionCompatParcelizer() == runInterceptors.write) ? i < getspansizelookup.getAudioAttributesCompatParcelizer() : i > getspansizelookup.getAudioAttributesCompatParcelizer();
    }

    private static final getFirstIndexOfModelInBuildingList.IconCompatParcelizer AudioAttributesCompatParcelizer(getSpanSizeLookup getspansizelookup, int i, int i2, int i3, boolean z, boolean z2) {
        int iAudioAttributesImplApi26Parcelizer;
        int iWrite$default;
        long jMediaBrowserCompatMediaItem = getspansizelookup.getMediaBrowserCompatCustomActionResultReceiver().MediaBrowserCompatMediaItem(i2);
        if (getspansizelookup.getMediaBrowserCompatCustomActionResultReceiver().AudioAttributesCompatParcelizer(findProperty.AudioAttributesImplBaseParcelizer(jMediaBrowserCompatMediaItem)) == i) {
            iAudioAttributesImplApi26Parcelizer = findProperty.AudioAttributesImplBaseParcelizer(jMediaBrowserCompatMediaItem);
        } else if (i >= getspansizelookup.getMediaBrowserCompatCustomActionResultReceiver().AudioAttributesImplBaseParcelizer()) {
            iAudioAttributesImplApi26Parcelizer = getspansizelookup.getMediaBrowserCompatCustomActionResultReceiver().AudioAttributesImplApi26Parcelizer(getspansizelookup.getMediaBrowserCompatCustomActionResultReceiver().AudioAttributesImplBaseParcelizer() - 1);
        } else {
            iAudioAttributesImplApi26Parcelizer = getspansizelookup.getMediaBrowserCompatCustomActionResultReceiver().AudioAttributesImplApi26Parcelizer(i);
        }
        if (getspansizelookup.getMediaBrowserCompatCustomActionResultReceiver().AudioAttributesCompatParcelizer(findProperty.read(jMediaBrowserCompatMediaItem)) == i) {
            iWrite$default = findProperty.read(jMediaBrowserCompatMediaItem);
        } else if (i >= getspansizelookup.getMediaBrowserCompatCustomActionResultReceiver().AudioAttributesImplBaseParcelizer()) {
            iWrite$default = deserializeFromNumber.write$default(getspansizelookup.getMediaBrowserCompatCustomActionResultReceiver(), getspansizelookup.getMediaBrowserCompatCustomActionResultReceiver().AudioAttributesImplBaseParcelizer() - 1, false, 2, null);
        } else {
            iWrite$default = deserializeFromNumber.write$default(getspansizelookup.getMediaBrowserCompatCustomActionResultReceiver(), i, false, 2, null);
        }
        if (iAudioAttributesImplApi26Parcelizer == i3) {
            return getspansizelookup.write(iWrite$default);
        }
        if (iWrite$default == i3) {
            return getspansizelookup.write(iAudioAttributesImplApi26Parcelizer);
        }
        if (!(z ^ z2) ? i2 >= iAudioAttributesImplApi26Parcelizer : i2 > iWrite$default) {
            iAudioAttributesImplApi26Parcelizer = iWrite$default;
        }
        return getspansizelookup.write(iAudioAttributesImplApi26Parcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getFirstIndexOfModelInBuildingList AudioAttributesCompatParcelizer(setStagedModel setstagedmodel, getExpectedModelCount getexpectedmodelcount) {
        boolean z = setstagedmodel.write() == runInterceptors.write;
        return new getFirstIndexOfModelInBuildingList(read(setstagedmodel.AudioAttributesImplBaseParcelizer(), z, true, setstagedmodel.getAudioAttributesCompatParcelizer(), getexpectedmodelcount), read(setstagedmodel.getRemoteActionCompatParcelizer(), z, false, setstagedmodel.getRead(), getexpectedmodelcount), z);
    }

    private static final getFirstIndexOfModelInBuildingList.IconCompatParcelizer read(getSpanSizeLookup getspansizelookup, boolean z, boolean z2, int i, getExpectedModelCount getexpectedmodelcount) {
        int write = z2 ? getspansizelookup.getWrite() : getspansizelookup.getRemoteActionCompatParcelizer();
        if (i != getspansizelookup.getIconCompatParcelizer()) {
            return getspansizelookup.write(write);
        }
        long jIconCompatParcelizer = getexpectedmodelcount.IconCompatParcelizer(getspansizelookup, write);
        return getspansizelookup.write(z ^ z2 ? findProperty.AudioAttributesImplBaseParcelizer(jIconCompatParcelizer) : findProperty.read(jIconCompatParcelizer));
    }

    public static final getFirstIndexOfModelInBuildingList read(getFirstIndexOfModelInBuildingList getfirstindexofmodelinbuildinglist, setStagedModel setstagedmodel) {
        if (setSpanCount.write(getfirstindexofmodelinbuildinglist, setstagedmodel)) {
            return (setstagedmodel.AudioAttributesImplApi26Parcelizer() > 1 || setstagedmodel.getWrite() == null || setstagedmodel.read().IconCompatParcelizer().length() == 0) ? getfirstindexofmodelinbuildinglist : RemoteActionCompatParcelizer(getfirstindexofmodelinbuildinglist, setstagedmodel);
        }
        return getfirstindexofmodelinbuildinglist;
    }

    private static final getFirstIndexOfModelInBuildingList RemoteActionCompatParcelizer(getFirstIndexOfModelInBuildingList getfirstindexofmodelinbuildinglist, setStagedModel setstagedmodel) {
        int iIconCompatParcelizer;
        getSpanSizeLookup getspansizelookup = setstagedmodel.read();
        String strIconCompatParcelizer = getspansizelookup.IconCompatParcelizer();
        int write = getspansizelookup.getWrite();
        int length = strIconCompatParcelizer.length();
        if (write == 0) {
            int iIconCompatParcelizer2 = setFractionalTextSize.IconCompatParcelizer(strIconCompatParcelizer, 0);
            if (setstagedmodel.getIconCompatParcelizer()) {
                return getFirstIndexOfModelInBuildingList.RemoteActionCompatParcelizer$default(getfirstindexofmodelinbuildinglist, read(getfirstindexofmodelinbuildinglist.getAudioAttributesCompatParcelizer(), getspansizelookup, iIconCompatParcelizer2), null, true, 2, null);
            }
            return getFirstIndexOfModelInBuildingList.RemoteActionCompatParcelizer$default(getfirstindexofmodelinbuildinglist, null, read(getfirstindexofmodelinbuildinglist.getIconCompatParcelizer(), getspansizelookup, iIconCompatParcelizer2), false, 1, null);
        }
        if (write == length) {
            int iRemoteActionCompatParcelizer = setFractionalTextSize.RemoteActionCompatParcelizer(strIconCompatParcelizer, length);
            if (setstagedmodel.getIconCompatParcelizer()) {
                return getFirstIndexOfModelInBuildingList.RemoteActionCompatParcelizer$default(getfirstindexofmodelinbuildinglist, read(getfirstindexofmodelinbuildinglist.getAudioAttributesCompatParcelizer(), getspansizelookup, iRemoteActionCompatParcelizer), null, false, 2, null);
            }
            return getFirstIndexOfModelInBuildingList.RemoteActionCompatParcelizer$default(getfirstindexofmodelinbuildinglist, null, read(getfirstindexofmodelinbuildinglist.getIconCompatParcelizer(), getspansizelookup, iRemoteActionCompatParcelizer), true, 1, null);
        }
        getFirstIndexOfModelInBuildingList getfirstindexofmodelinbuildinglistAudioAttributesImplApi21Parcelizer = setstagedmodel.getWrite();
        boolean z = getfirstindexofmodelinbuildinglistAudioAttributesImplApi21Parcelizer != null && getfirstindexofmodelinbuildinglistAudioAttributesImplApi21Parcelizer.getRemoteActionCompatParcelizer();
        if (setstagedmodel.getIconCompatParcelizer() ^ z) {
            iIconCompatParcelizer = setFractionalTextSize.RemoteActionCompatParcelizer(strIconCompatParcelizer, write);
        } else {
            iIconCompatParcelizer = setFractionalTextSize.IconCompatParcelizer(strIconCompatParcelizer, write);
        }
        if (setstagedmodel.getIconCompatParcelizer()) {
            return getFirstIndexOfModelInBuildingList.RemoteActionCompatParcelizer$default(getfirstindexofmodelinbuildinglist, read(getfirstindexofmodelinbuildinglist.getAudioAttributesCompatParcelizer(), getspansizelookup, iIconCompatParcelizer), null, z, 2, null);
        }
        return getFirstIndexOfModelInBuildingList.RemoteActionCompatParcelizer$default(getfirstindexofmodelinbuildinglist, null, read(getfirstindexofmodelinbuildinglist.getIconCompatParcelizer(), getspansizelookup, iIconCompatParcelizer), z, 1, null);
    }

    private static final getFirstIndexOfModelInBuildingList.IconCompatParcelizer read(getFirstIndexOfModelInBuildingList.IconCompatParcelizer iconCompatParcelizer, getSpanSizeLookup getspansizelookup, int i) {
        return getFirstIndexOfModelInBuildingList.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, getspansizelookup.getMediaBrowserCompatCustomActionResultReceiver().RemoteActionCompatParcelizer(i), i, 0L, 4, null);
    }
}
