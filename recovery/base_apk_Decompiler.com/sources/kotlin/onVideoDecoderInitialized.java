package kotlin;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda5;
import kotlin.setContainerMimeType;

/* JADX INFO: loaded from: classes2.dex */
public final class onVideoDecoderInitialized implements onVideoDisabled, ExoPlayerImplComponentListenerExternalSyntheticLambda0, ExoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer, maybeUpdateReadingPeriod {
    private final String AudioAttributesCompatParcelizer;
    private final setContainerMimeType AudioAttributesImplApi21Parcelizer;
    private final setContainerMimeType.write AudioAttributesImplApi26Parcelizer;
    private final Path AudioAttributesImplBaseParcelizer;
    private final List<onVideoFrameProcessingOffset> IconCompatParcelizer;
    private final RectF MediaBrowserCompatCustomActionResultReceiver;
    private List<ExoPlayerImplComponentListenerExternalSyntheticLambda0> MediaBrowserCompatItemReceiver;
    private final RectF MediaMetadataCompat;
    private addMediaItemsInternal RatingCompat;
    private final ExoPlayerImplExternalSyntheticLambda6 RemoteActionCompatParcelizer;
    private final boolean read;
    private final Matrix write;

    private static List<onVideoFrameProcessingOffset> write(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, setShuffleModeEnabledInternal setshufflemodeenabledinternal, List<resolvePositionForPlaylistChange> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            onVideoFrameProcessingOffset onvideoframeprocessingoffsetRemoteActionCompatParcelizer = list.get(i).RemoteActionCompatParcelizer(exoPlayerImplExternalSyntheticLambda6, exoPlayerImplExternalSyntheticLambda19, setshufflemodeenabledinternal);
            if (onvideoframeprocessingoffsetRemoteActionCompatParcelizer != null) {
                arrayList.add(onvideoframeprocessingoffsetRemoteActionCompatParcelizer);
            }
        }
        return arrayList;
    }

    private static resetPendingPauseAtEndOfPeriod RemoteActionCompatParcelizer(List<resolvePositionForPlaylistChange> list) {
        for (int i = 0; i < list.size(); i++) {
            resolvePositionForPlaylistChange resolvepositionforplaylistchange = list.get(i);
            if (resolvepositionforplaylistchange instanceof resetPendingPauseAtEndOfPeriod) {
                return (resetPendingPauseAtEndOfPeriod) resolvepositionforplaylistchange;
            }
        }
        return null;
    }

    public onVideoDecoderInitialized(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, setShuffleModeEnabledInternal setshufflemodeenabledinternal, setOffloadSchedulingEnabledInternal setoffloadschedulingenabledinternal, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) {
        this(exoPlayerImplExternalSyntheticLambda6, setshufflemodeenabledinternal, setoffloadschedulingenabledinternal.RemoteActionCompatParcelizer(), setoffloadschedulingenabledinternal.write(), write(exoPlayerImplExternalSyntheticLambda6, exoPlayerImplExternalSyntheticLambda19, setshufflemodeenabledinternal, setoffloadschedulingenabledinternal.IconCompatParcelizer()), RemoteActionCompatParcelizer(setoffloadschedulingenabledinternal.IconCompatParcelizer()));
    }

    onVideoDecoderInitialized(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, setShuffleModeEnabledInternal setshufflemodeenabledinternal, String str, boolean z, List<onVideoFrameProcessingOffset> list, resetPendingPauseAtEndOfPeriod resetpendingpauseatendofperiod) {
        this.AudioAttributesImplApi26Parcelizer = new setContainerMimeType.write();
        this.MediaBrowserCompatCustomActionResultReceiver = new RectF();
        this.AudioAttributesImplApi21Parcelizer = new setContainerMimeType();
        this.write = new Matrix();
        this.AudioAttributesImplBaseParcelizer = new Path();
        this.MediaMetadataCompat = new RectF();
        this.AudioAttributesCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = exoPlayerImplExternalSyntheticLambda6;
        this.read = z;
        this.IconCompatParcelizer = list;
        if (resetpendingpauseatendofperiod != null) {
            addMediaItemsInternal addmediaitemsinternalRemoteActionCompatParcelizer = resetpendingpauseatendofperiod.RemoteActionCompatParcelizer();
            this.RatingCompat = addmediaitemsinternalRemoteActionCompatParcelizer;
            addmediaitemsinternalRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(setshufflemodeenabledinternal);
            this.RatingCompat.IconCompatParcelizer(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            onVideoFrameProcessingOffset onvideoframeprocessingoffset = list.get(size);
            if (onvideoframeprocessingoffset instanceof onVideoSurfaceCreated) {
                arrayList.add((onVideoSurfaceCreated) onvideoframeprocessingoffset);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((onVideoSurfaceCreated) arrayList.get(size2)).AudioAttributesCompatParcelizer(list.listIterator(list.size()));
        }
    }

    @Override // o.ExoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer
    public final void RemoteActionCompatParcelizer() {
        this.RemoteActionCompatParcelizer.invalidateSelf();
    }

    @Override // kotlin.onVideoFrameProcessingOffset
    public final String AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.onVideoFrameProcessingOffset
    public final void write(List<onVideoFrameProcessingOffset> list, List<onVideoFrameProcessingOffset> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.IconCompatParcelizer.size());
        arrayList.addAll(list);
        for (int size = this.IconCompatParcelizer.size() - 1; size >= 0; size--) {
            onVideoFrameProcessingOffset onvideoframeprocessingoffset = this.IconCompatParcelizer.get(size);
            onvideoframeprocessingoffset.write(arrayList, this.IconCompatParcelizer.subList(0, size));
            arrayList.add(onvideoframeprocessingoffset);
        }
    }

    public final List<onVideoFrameProcessingOffset> IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    final List<ExoPlayerImplComponentListenerExternalSyntheticLambda0> read() {
        if (this.MediaBrowserCompatItemReceiver == null) {
            this.MediaBrowserCompatItemReceiver = new ArrayList();
            for (int i = 0; i < this.IconCompatParcelizer.size(); i++) {
                onVideoFrameProcessingOffset onvideoframeprocessingoffset = this.IconCompatParcelizer.get(i);
                if (onvideoframeprocessingoffset instanceof ExoPlayerImplComponentListenerExternalSyntheticLambda0) {
                    this.MediaBrowserCompatItemReceiver.add((ExoPlayerImplComponentListenerExternalSyntheticLambda0) onvideoframeprocessingoffset);
                }
            }
        }
        return this.MediaBrowserCompatItemReceiver;
    }

    final Matrix AudioAttributesImplApi26Parcelizer() {
        addMediaItemsInternal addmediaitemsinternal = this.RatingCompat;
        if (addmediaitemsinternal != null) {
            return addmediaitemsinternal.RemoteActionCompatParcelizer();
        }
        this.write.reset();
        return this.write;
    }

    @Override // kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda0
    public final Path write() {
        this.write.reset();
        addMediaItemsInternal addmediaitemsinternal = this.RatingCompat;
        if (addmediaitemsinternal != null) {
            this.write.set(addmediaitemsinternal.RemoteActionCompatParcelizer());
        }
        this.AudioAttributesImplBaseParcelizer.reset();
        if (this.read) {
            return this.AudioAttributesImplBaseParcelizer;
        }
        for (int size = this.IconCompatParcelizer.size() - 1; size >= 0; size--) {
            onVideoFrameProcessingOffset onvideoframeprocessingoffset = this.IconCompatParcelizer.get(size);
            if (onvideoframeprocessingoffset instanceof ExoPlayerImplComponentListenerExternalSyntheticLambda0) {
                this.AudioAttributesImplBaseParcelizer.addPath(((ExoPlayerImplComponentListenerExternalSyntheticLambda0) onvideoframeprocessingoffset).write(), this.write);
            }
        }
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // kotlin.onVideoDisabled
    public final void RemoteActionCompatParcelizer(Canvas canvas, Matrix matrix, int i, access3100 access3100Var) {
        if (this.read) {
            return;
        }
        this.write.set(matrix);
        addMediaItemsInternal addmediaitemsinternal = this.RatingCompat;
        if (addmediaitemsinternal != null) {
            this.write.preConcat(addmediaitemsinternal.RemoteActionCompatParcelizer());
            i = (int) (((((this.RatingCompat.AudioAttributesCompatParcelizer() == null ? 100 : this.RatingCompat.AudioAttributesCompatParcelizer().AudioAttributesImplApi26Parcelizer().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = (this.RemoteActionCompatParcelizer.MediaMetadataCompat() && MediaBrowserCompatItemReceiver() && i != 255) || (access3100Var != null && this.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem() && MediaBrowserCompatItemReceiver());
        int i2 = z ? 255 : i;
        if (z) {
            this.MediaBrowserCompatCustomActionResultReceiver.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            read(this.MediaBrowserCompatCustomActionResultReceiver, matrix, true);
            this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer = i;
            if (access3100Var != null) {
                access3100Var.read(this.AudioAttributesImplApi26Parcelizer);
                access3100Var = null;
            } else {
                this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer = null;
            }
            canvas = this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(canvas, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplApi26Parcelizer);
        } else if (access3100Var != null) {
            access3100 access3100Var2 = new access3100(access3100Var);
            access3100Var2.AudioAttributesCompatParcelizer(i2);
            access3100Var = access3100Var2;
        }
        for (int size = this.IconCompatParcelizer.size() - 1; size >= 0; size--) {
            onVideoFrameProcessingOffset onvideoframeprocessingoffset = this.IconCompatParcelizer.get(size);
            if (onvideoframeprocessingoffset instanceof onVideoDisabled) {
                ((onVideoDisabled) onvideoframeprocessingoffset).RemoteActionCompatParcelizer(canvas, this.write, i2, access3100Var);
            }
        }
        if (z) {
            this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer();
        }
    }

    private boolean MediaBrowserCompatItemReceiver() {
        int i = 0;
        for (int i2 = 0; i2 < this.IconCompatParcelizer.size(); i2++) {
            if ((this.IconCompatParcelizer.get(i2) instanceof onVideoDisabled) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.onVideoDisabled
    public final void read(RectF rectF, Matrix matrix, boolean z) {
        this.write.set(matrix);
        addMediaItemsInternal addmediaitemsinternal = this.RatingCompat;
        if (addmediaitemsinternal != null) {
            this.write.preConcat(addmediaitemsinternal.RemoteActionCompatParcelizer());
        }
        this.MediaMetadataCompat.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        for (int size = this.IconCompatParcelizer.size() - 1; size >= 0; size--) {
            onVideoFrameProcessingOffset onvideoframeprocessingoffset = this.IconCompatParcelizer.get(size);
            if (onvideoframeprocessingoffset instanceof onVideoDisabled) {
                ((onVideoDisabled) onvideoframeprocessingoffset).read(this.MediaMetadataCompat, this.write, z);
                rectF.union(this.MediaMetadataCompat);
            }
        }
    }

    @Override // kotlin.maybeUpdateReadingPeriod
    public final void RemoteActionCompatParcelizer(maybeTriggerPendingMessages maybetriggerpendingmessages, int i, List<maybeTriggerPendingMessages> list, maybeTriggerPendingMessages maybetriggerpendingmessages2) {
        if (maybetriggerpendingmessages.read(AudioAttributesCompatParcelizer(), i) || "__container".equals(AudioAttributesCompatParcelizer())) {
            if (!"__container".equals(AudioAttributesCompatParcelizer())) {
                maybetriggerpendingmessages2 = maybetriggerpendingmessages2.write(AudioAttributesCompatParcelizer());
                if (maybetriggerpendingmessages.IconCompatParcelizer(AudioAttributesCompatParcelizer(), i)) {
                    list.add(maybetriggerpendingmessages2.IconCompatParcelizer(this));
                }
            }
            if (maybetriggerpendingmessages.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer(), i)) {
                int iRemoteActionCompatParcelizer = maybetriggerpendingmessages.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer(), i);
                for (int i2 = 0; i2 < this.IconCompatParcelizer.size(); i2++) {
                    onVideoFrameProcessingOffset onvideoframeprocessingoffset = this.IconCompatParcelizer.get(i2);
                    if (onvideoframeprocessingoffset instanceof maybeUpdateReadingPeriod) {
                        ((maybeUpdateReadingPeriod) onvideoframeprocessingoffset).RemoteActionCompatParcelizer(maybetriggerpendingmessages, i + iRemoteActionCompatParcelizer, list, maybetriggerpendingmessages2);
                    }
                }
            }
        }
    }

    @Override // kotlin.maybeUpdateReadingPeriod
    public final <T> void read(T t, setDrmInitData<T> setdrminitdata) {
        addMediaItemsInternal addmediaitemsinternal = this.RatingCompat;
        if (addmediaitemsinternal != null) {
            addmediaitemsinternal.write(t, setdrminitdata);
        }
    }
}
