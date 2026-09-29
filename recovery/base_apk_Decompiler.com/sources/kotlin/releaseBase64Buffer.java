package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010!\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000bJ\u000e\u0010-\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u000bJ\u000e\u0010.\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000bJ\u0010\u00100\u001a\u0004\u0018\u00010\u00012\u0006\u0010,\u001a\u00020\u000bJ\u000e\u00104\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000bJ\u000e\u00106\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000bJ\u000e\u00108\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000bJ\u000e\u0010:\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000bJ\u000e\u0010>\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u000bJ\u0010\u0010@\u001a\u0004\u0018\u00010\u00012\u0006\u0010,\u001a\u00020\u000bJ\u0010\u0010C\u001a\u0004\u0018\u00010\u00012\u0006\u0010,\u001a\u00020\u000bJ\u000e\u0010:\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020\u0012J\u000e\u0010H\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u000bJ\u000e\u0010I\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u000bJ\u000e\u0010N\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000bJ\u0010\u0010Q\u001a\u0004\u0018\u00010\u00012\u0006\u0010,\u001a\u00020\u000bJ\u0010\u0010R\u001a\u0004\u0018\u00010\u00012\u0006\u0010,\u001a\u00020\u000bJ\u0018\u0010R\u001a\u0004\u0018\u00010\u00012\u0006\u00107\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000bJ\b\u0010S\u001a\u0004\u0018\u00010\u0001J\u0006\u0010V\u001a\u00020WJ\u0006\u0010X\u001a\u00020WJ\u0006\u0010Y\u001a\u00020WJ\u0006\u0010Z\u001a\u00020WJ\u0006\u0010[\u001a\u00020WJ\u0006\u0010\\\u001a\u00020\u000bJ\u0006\u0010]\u001a\u00020WJ\u000e\u0010^\u001a\u00020W2\u0006\u0010,\u001a\u00020\u000bJ\u000e\u0010_\u001a\u00020W2\u0006\u0010,\u001a\u00020\u000bJ\u0006\u0010`\u001a\u00020WJ\f\u0010a\u001a\b\u0012\u0004\u0012\u00020c0bJ\b\u0010d\u001a\u00020eH\u0016J\u0010\u0010G\u001a\u00020\u00122\b\b\u0002\u0010,\u001a\u00020\u000bJ\u0016\u00100\u001a\u0004\u0018\u00010\u0001*\u00020\t2\u0006\u0010,\u001a\u00020\u000bH\u0002J\u0016\u0010f\u001a\u0004\u0018\u00010\u0001*\u00020\t2\u0006\u0010,\u001a\u00020\u000bH\u0002J\u0016\u0010g\u001a\u0004\u0018\u00010\u0001*\u00020\t2\u0006\u0010,\u001a\u00020\u000bH\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u0010\u001a\"\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u001e\u0010!\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010(\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u001cR\u0011\u0010*\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u001cR\u0011\u0010-\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b-\u0010\u0019R\u0011\u0010.\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b/\u0010\u001cR\u0011\u00101\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b1\u0010\u0019R\u0011\u00102\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b3\u0010\u0019R\u0011\u00104\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b5\u0010\u001cR\u0011\u00108\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b9\u0010\u001cR\u0011\u0010:\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b;\u0010\u001cR\u0011\u0010<\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b=\u0010\u001cR\u0011\u0010>\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b?\u0010\u0019R\u0013\u0010@\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0013\u0010C\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bD\u0010BR\u0013\u0010E\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bF\u0010BR\u0011\u0010J\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bK\u0010\u001cR\u0011\u0010L\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bM\u0010\u001cR\u0011\u0010O\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bP\u0010\u001cR\u001e\u0010T\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bU\u0010\u0019¨\u0006h"}, d2 = {"Landroidx/compose/runtime/SlotReader;", "", "table", "Landroidx/compose/runtime/SlotTable;", "<init>", "(Landroidx/compose/runtime/SlotTable;)V", "getTable$runtime", "()Landroidx/compose/runtime/SlotTable;", "groups", "", "groupsSize", "", "slots", "", "[Ljava/lang/Object;", "slotsSize", "sourceInformationMap", "Ljava/util/HashMap;", "Landroidx/compose/runtime/Anchor;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/HashMap;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "closed", "getClosed", "()Z", "currentGroup", "getCurrentGroup", "()I", "setCurrentGroup", "(I)V", "currentEnd", "getCurrentEnd", "parent", "getParent", "currentSlotStack", "Landroidx/compose/runtime/IntStack;", "emptyCount", "currentSlot", "currentSlotEnd", "size", "getSize", "slot", "getSlot", "index", "isNode", "nodeCount", "getNodeCount", "node", "isGroupEnd", "inEmpty", "getInEmpty", "groupSize", "getGroupSize", "slotSize", "group", "groupEnd", "getGroupEnd", "groupKey", "getGroupKey", "groupSlotIndex", "getGroupSlotIndex", "hasObjectKey", "getHasObjectKey", "groupObjectKey", "getGroupObjectKey", "()Ljava/lang/Object;", "groupAux", "getGroupAux", "groupNode", "getGroupNode", "anchor", "hasMark", "containsMark", "parentNodes", "getParentNodes", "remainingSlots", "getRemainingSlots", "parentOf", "groupSlotCount", "getGroupSlotCount", "get", "groupGet", "next", "hadNext", "getHadNext", "beginEmpty", "", "endEmpty", "close", "startGroup", "startNode", "skipGroup", "skipToGroupEnd", "reposition", "restoreParent", "endGroup", "extractKeys", "", "Landroidx/compose/runtime/KeyInfo;", "toString", "", "aux", "objectKey", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class releaseBase64Buffer {
    private boolean AudioAttributesCompatParcelizer;
    private final int[] AudioAttributesImplApi21Parcelizer;
    private final filterFinishArray AudioAttributesImplApi26Parcelizer;
    private final int AudioAttributesImplBaseParcelizer;
    private int IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private Object[] MediaBrowserCompatMediaItem;
    private final int MediaBrowserCompatSearchResultReceiver;
    private int MediaDescriptionCompat;
    private HashMap<_parseSlowFloat, filterFinishObject> MediaMetadataCompat;
    private final releaseTokenBuffer RatingCompat;
    private int RemoteActionCompatParcelizer;
    private int read;
    private int write;

    public releaseBase64Buffer(releaseTokenBuffer releasetokenbuffer) {
        this.RatingCompat = releasetokenbuffer;
        this.AudioAttributesImplApi21Parcelizer = releasetokenbuffer.getRead();
        int remoteActionCompatParcelizer = releasetokenbuffer.getRemoteActionCompatParcelizer();
        this.AudioAttributesImplBaseParcelizer = remoteActionCompatParcelizer;
        this.MediaBrowserCompatMediaItem = releasetokenbuffer.getMediaBrowserCompatCustomActionResultReceiver();
        this.MediaBrowserCompatSearchResultReceiver = releasetokenbuffer.getAudioAttributesImplBaseParcelizer();
        this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
        this.MediaDescriptionCompat = -1;
        this.AudioAttributesImplApi26Parcelizer = new filterFinishArray();
    }

    /* JADX INFO: renamed from: onPause, reason: from getter */
    public final releaseTokenBuffer getRatingCompat() {
        return this.RatingCompat;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    public final int AudioAttributesImplApi26Parcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: onCommand, reason: from getter */
    public final int getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    /* JADX INFO: renamed from: onFastForward, reason: from getter */
    public final int getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final int onMediaButtonEvent() {
        return this.read - InputDecorator.AudioAttributesImplBaseParcelizer(this.AudioAttributesImplApi21Parcelizer, this.MediaDescriptionCompat);
    }

    public final int RatingCompat(int i) {
        return this.AudioAttributesImplApi21Parcelizer[(i * 5) + 2];
    }

    public final boolean onPlayFromMediaId() {
        return (this.AudioAttributesImplApi21Parcelizer[(this.write * 5) + 1] & 1073741824) != 0;
    }

    public final boolean AudioAttributesImplBaseParcelizer(int i) {
        return (this.AudioAttributesImplApi21Parcelizer[(i * 5) + 1] & 1073741824) != 0;
    }

    public final int MediaMetadataCompat(int i) {
        return this.AudioAttributesImplApi21Parcelizer[(i * 5) + 1] & 67108863;
    }

    public final Object MediaBrowserCompatSearchResultReceiver(int i) {
        int[] iArr = this.AudioAttributesImplApi21Parcelizer;
        if ((iArr[(i * 5) + 1] & 1073741824) != 0) {
            return IconCompatParcelizer(iArr, i);
        }
        return null;
    }

    public final boolean onPlay() {
        return onCustomAction() || this.write == this.RemoteActionCompatParcelizer;
    }

    public final boolean onCustomAction() {
        return this.MediaBrowserCompatCustomActionResultReceiver > 0;
    }

    public final int MediaBrowserCompatSearchResultReceiver() {
        return InputDecorator.AudioAttributesImplApi21Parcelizer(this.AudioAttributesImplApi21Parcelizer, this.write);
    }

    public final int MediaBrowserCompatCustomActionResultReceiver(int i) {
        return InputDecorator.AudioAttributesImplApi21Parcelizer(this.AudioAttributesImplApi21Parcelizer, i);
    }

    public final int handleMediaPlayPauseIfPendingOnHandler(int i) {
        int i2;
        int iAudioAttributesImplBaseParcelizer = InputDecorator.AudioAttributesImplBaseParcelizer(this.AudioAttributesImplApi21Parcelizer, i);
        int i3 = i + 1;
        if (i3 >= this.AudioAttributesImplBaseParcelizer) {
            i2 = this.MediaBrowserCompatSearchResultReceiver;
        } else {
            i2 = this.AudioAttributesImplApi21Parcelizer[(i3 * 5) + 4];
        }
        return i2 - iAudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int MediaBrowserCompatMediaItem() {
        int i = this.write;
        if (i < this.RemoteActionCompatParcelizer) {
            return this.AudioAttributesImplApi21Parcelizer[i * 5];
        }
        return 0;
    }

    public final int read(int i) {
        return this.AudioAttributesImplApi21Parcelizer[i * 5];
    }

    public final int MediaMetadataCompat() {
        return this.read - InputDecorator.AudioAttributesImplBaseParcelizer(this.AudioAttributesImplApi21Parcelizer, this.MediaDescriptionCompat);
    }

    public final boolean AudioAttributesImplApi26Parcelizer(int i) {
        return (this.AudioAttributesImplApi21Parcelizer[(i * 5) + 1] & 536870912) != 0;
    }

    public final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        int i = this.write;
        return i < this.RemoteActionCompatParcelizer && (this.AudioAttributesImplApi21Parcelizer[(i * 5) + 1] & 536870912) != 0;
    }

    public final Object MediaDescriptionCompat() {
        int i = this.write;
        if (i < this.RemoteActionCompatParcelizer) {
            return read(this.AudioAttributesImplApi21Parcelizer, i);
        }
        return null;
    }

    public final Object AudioAttributesImplApi21Parcelizer(int i) {
        return read(this.AudioAttributesImplApi21Parcelizer, i);
    }

    public final Object MediaBrowserCompatCustomActionResultReceiver() {
        int i = this.write;
        if (i < this.RemoteActionCompatParcelizer) {
            return RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, i);
        }
        return 0;
    }

    public final Object write(int i) {
        return RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, i);
    }

    public final boolean MediaBrowserCompatItemReceiver(int i) {
        return (this.AudioAttributesImplApi21Parcelizer[(i * 5) + 1] & C.BUFFER_FLAG_FIRST_SAMPLE) != 0;
    }

    public final boolean AudioAttributesCompatParcelizer(int i) {
        return (this.AudioAttributesImplApi21Parcelizer[(i * 5) + 1] & 67108864) != 0;
    }

    public final int handleMediaPlayPauseIfPendingOnHandler() {
        int i = this.MediaDescriptionCompat;
        if (i >= 0) {
            return this.AudioAttributesImplApi21Parcelizer[(i * 5) + 1] & 67108863;
        }
        return 0;
    }

    public final int onAddQueueItem() {
        return this.IconCompatParcelizer - this.read;
    }

    public final Object RemoteActionCompatParcelizer(int i) {
        return IconCompatParcelizer(this.write, i);
    }

    public final Object IconCompatParcelizer(int i, int i2) {
        int i3;
        int iAudioAttributesImplBaseParcelizer = InputDecorator.AudioAttributesImplBaseParcelizer(this.AudioAttributesImplApi21Parcelizer, i);
        int i4 = i + 1;
        if (i4 >= this.AudioAttributesImplBaseParcelizer) {
            i3 = this.MediaBrowserCompatSearchResultReceiver;
        } else {
            i3 = this.AudioAttributesImplApi21Parcelizer[(i4 * 5) + 4];
        }
        int i5 = iAudioAttributesImplBaseParcelizer + i2;
        return i5 < i3 ? this.MediaBrowserCompatMediaItem[i5] : _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer();
    }

    public final Object onPrepare() {
        int i;
        if (this.MediaBrowserCompatCustomActionResultReceiver > 0 || (i = this.read) >= this.IconCompatParcelizer) {
            this.MediaBrowserCompatItemReceiver = false;
            return _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer();
        }
        this.MediaBrowserCompatItemReceiver = true;
        Object[] objArr = this.MediaBrowserCompatMediaItem;
        this.read = i + 1;
        return objArr[i];
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final boolean getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final void RemoteActionCompatParcelizer() {
        this.MediaBrowserCompatCustomActionResultReceiver++;
    }

    public final void AudioAttributesCompatParcelizer() {
        if (this.MediaBrowserCompatCustomActionResultReceiver <= 0) {
            getInputCodeUtf8JsNames.write("Unbalanced begin/end empty");
        }
        this.MediaBrowserCompatCustomActionResultReceiver--;
    }

    public final void IconCompatParcelizer() {
        this.AudioAttributesCompatParcelizer = true;
        this.RatingCompat.IconCompatParcelizer(this, this.MediaMetadataCompat);
        this.MediaBrowserCompatMediaItem = new Object[0];
    }

    public final void onPrepareFromSearch() {
        filterFinishObject filterfinishobject;
        if (this.MediaBrowserCompatCustomActionResultReceiver <= 0) {
            int i = this.MediaDescriptionCompat;
            int i2 = this.write;
            if (this.AudioAttributesImplApi21Parcelizer[(i2 * 5) + 2] != i) {
                getInputCodeUtf8JsNames.write("Invalid slot table detected");
            }
            HashMap<_parseSlowFloat, filterFinishObject> map = this.MediaMetadataCompat;
            if (map != null && (filterfinishobject = map.get(IconCompatParcelizer(i))) != null) {
                filterfinishobject.AudioAttributesCompatParcelizer(this.RatingCompat, i2);
            }
            filterFinishArray filterfinisharray = this.AudioAttributesImplApi26Parcelizer;
            int i3 = this.read;
            int i4 = this.IconCompatParcelizer;
            if (i3 == 0 && i4 == 0) {
                filterfinisharray.RemoteActionCompatParcelizer(-1);
            } else {
                filterfinisharray.RemoteActionCompatParcelizer(i3);
            }
            this.MediaDescriptionCompat = i2;
            this.RemoteActionCompatParcelizer = InputDecorator.AudioAttributesImplApi21Parcelizer(this.AudioAttributesImplApi21Parcelizer, i2) + i2;
            int i5 = i2 + 1;
            this.write = i5;
            this.read = InputDecorator.AudioAttributesImplBaseParcelizer(this.AudioAttributesImplApi21Parcelizer, i2);
            this.IconCompatParcelizer = i2 >= this.AudioAttributesImplBaseParcelizer + (-1) ? this.MediaBrowserCompatSearchResultReceiver : this.AudioAttributesImplApi21Parcelizer[(i5 * 5) + 4];
        }
    }

    public final void onPlayFromUri() {
        if (this.MediaBrowserCompatCustomActionResultReceiver <= 0) {
            if ((this.AudioAttributesImplApi21Parcelizer[(this.write * 5) + 1] & 1073741824) == 0) {
                getInputCodeUtf8JsNames.write("Expected a node group");
            }
            onPrepareFromSearch();
        }
    }

    public final int onPlayFromSearch() {
        if (this.MediaBrowserCompatCustomActionResultReceiver != 0) {
            _validJsonValueList.AudioAttributesCompatParcelizer("Cannot skip while in an empty region");
        }
        int[] iArr = this.AudioAttributesImplApi21Parcelizer;
        int i = this.write;
        int i2 = iArr[(i * 5) + 1];
        int i3 = (1073741824 & i2) == 0 ? 67108863 & i2 : 1;
        this.write = i + InputDecorator.AudioAttributesImplApi21Parcelizer(iArr, i);
        return i3;
    }

    public final void onPrepareFromMediaId() {
        if (this.MediaBrowserCompatCustomActionResultReceiver != 0) {
            _validJsonValueList.AudioAttributesCompatParcelizer("Cannot skip the enclosing group while in an empty region");
        }
        this.write = this.RemoteActionCompatParcelizer;
        this.read = 0;
        this.IconCompatParcelizer = 0;
    }

    public final void MediaBrowserCompatMediaItem(int i) {
        if (this.MediaBrowserCompatCustomActionResultReceiver != 0) {
            _validJsonValueList.AudioAttributesCompatParcelizer("Cannot reposition while in an empty region");
        }
        this.write = i;
        int i2 = this.AudioAttributesImplBaseParcelizer;
        int i3 = i < i2 ? this.AudioAttributesImplApi21Parcelizer[(i * 5) + 2] : -1;
        if (i3 != this.MediaDescriptionCompat) {
            this.MediaDescriptionCompat = i3;
            if (i3 >= 0) {
                this.RemoteActionCompatParcelizer = i3 + InputDecorator.AudioAttributesImplApi21Parcelizer(this.AudioAttributesImplApi21Parcelizer, i3);
            } else {
                this.RemoteActionCompatParcelizer = i2;
            }
            this.read = 0;
            this.IconCompatParcelizer = 0;
        }
    }

    public final void MediaDescriptionCompat(int i) {
        int iAudioAttributesImplApi21Parcelizer = InputDecorator.AudioAttributesImplApi21Parcelizer(this.AudioAttributesImplApi21Parcelizer, i) + i;
        int i2 = this.write;
        if (i2 < i || i2 > iAudioAttributesImplApi21Parcelizer) {
            StringBuilder sb = new StringBuilder("Index ");
            sb.append(i);
            sb.append(" is not a parent of ");
            sb.append(i2);
            _validJsonValueList.AudioAttributesCompatParcelizer(sb.toString());
        }
        this.MediaDescriptionCompat = i;
        this.RemoteActionCompatParcelizer = iAudioAttributesImplApi21Parcelizer;
        this.read = 0;
        this.IconCompatParcelizer = 0;
    }

    public final void write() {
        int iAudioAttributesImplApi21Parcelizer;
        if (this.MediaBrowserCompatCustomActionResultReceiver == 0) {
            if (this.write != this.RemoteActionCompatParcelizer) {
                _validJsonValueList.AudioAttributesCompatParcelizer("endGroup() not called at the end of a group");
            }
            int[] iArr = this.AudioAttributesImplApi21Parcelizer;
            int i = iArr[(this.MediaDescriptionCompat * 5) + 2];
            this.MediaDescriptionCompat = i;
            if (i >= 0) {
                iAudioAttributesImplApi21Parcelizer = InputDecorator.AudioAttributesImplApi21Parcelizer(iArr, i) + i;
            } else {
                iAudioAttributesImplApi21Parcelizer = this.AudioAttributesImplBaseParcelizer;
            }
            this.RemoteActionCompatParcelizer = iAudioAttributesImplApi21Parcelizer;
            int iAudioAttributesCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer();
            if (iAudioAttributesCompatParcelizer < 0) {
                this.read = 0;
                this.IconCompatParcelizer = 0;
            } else {
                this.read = iAudioAttributesCompatParcelizer;
                this.IconCompatParcelizer = i >= this.AudioAttributesImplBaseParcelizer + (-1) ? this.MediaBrowserCompatSearchResultReceiver : this.AudioAttributesImplApi21Parcelizer[((i + 1) * 5) + 4];
            }
        }
    }

    public final List<includeProperty> read() {
        ArrayList arrayList = new ArrayList();
        if (this.MediaBrowserCompatCustomActionResultReceiver <= 0) {
            int iAudioAttributesImplApi21Parcelizer = this.write;
            int i = 0;
            while (true) {
                int i2 = i;
                if (iAudioAttributesImplApi21Parcelizer >= this.RemoteActionCompatParcelizer) {
                    break;
                }
                int[] iArr = this.AudioAttributesImplApi21Parcelizer;
                int i3 = iAudioAttributesImplApi21Parcelizer * 5;
                int i4 = iArr[i3];
                Object obj = read(iArr, iAudioAttributesImplApi21Parcelizer);
                int i5 = this.AudioAttributesImplApi21Parcelizer[i3 + 1];
                int i6 = (1073741824 & i5) == 0 ? i5 & 67108863 : 1;
                i = i2 + 1;
                arrayList.add(new includeProperty(i4, obj, iAudioAttributesImplApi21Parcelizer, i6, i2));
                iAudioAttributesImplApi21Parcelizer += InputDecorator.AudioAttributesImplApi21Parcelizer(this.AudioAttributesImplApi21Parcelizer, iAudioAttributesImplApi21Parcelizer);
            }
        }
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.write);
        sb.append(", key=");
        sb.append(MediaBrowserCompatMediaItem());
        sb.append(", parent=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", end=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }

    public final _parseSlowFloat IconCompatParcelizer(int i) {
        ArrayList<_parseSlowFloat> arrayListRemoteActionCompatParcelizer = this.RatingCompat.RemoteActionCompatParcelizer();
        int iAudioAttributesImplApi26Parcelizer = InputDecorator.AudioAttributesImplApi26Parcelizer(arrayListRemoteActionCompatParcelizer, i, this.AudioAttributesImplBaseParcelizer);
        if (iAudioAttributesImplApi26Parcelizer < 0) {
            _parseSlowFloat _parseslowfloat = new _parseSlowFloat(i);
            arrayListRemoteActionCompatParcelizer.add(-(iAudioAttributesImplApi26Parcelizer + 1), _parseslowfloat);
            return _parseslowfloat;
        }
        return arrayListRemoteActionCompatParcelizer.get(iAudioAttributesImplApi26Parcelizer);
    }

    private final Object IconCompatParcelizer(int[] iArr, int i) {
        int i2 = i * 5;
        if ((iArr[i2 + 1] & 1073741824) == 0) {
            return _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer();
        }
        return this.MediaBrowserCompatMediaItem[iArr[i2 + 4]];
    }

    private final Object RemoteActionCompatParcelizer(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 268435456) != 0) {
            return this.MediaBrowserCompatMediaItem[InputDecorator.read(iArr, i)];
        }
        return _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer();
    }

    private final Object read(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 536870912) != 0) {
            return this.MediaBrowserCompatMediaItem[InputDecorator.AudioAttributesImplApi26Parcelizer(iArr, i)];
        }
        return null;
    }
}
