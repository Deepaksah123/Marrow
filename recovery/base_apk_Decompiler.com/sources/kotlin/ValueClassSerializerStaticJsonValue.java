package kotlin;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.CurrentQuery;
import kotlin.Metadata;
import kotlin.setEntryLabelTextSize;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\b\u0005\b&\u0018\u0000 \u00172\u00020\u0001:\u0007\r\u0014\b46\u001e\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\b\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u001a\u0010\u0005\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0017¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u001a\u0010\u0005\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0004\u0012\u0004\u0012\u00020\u00110\u000fH\u0016¢\u0006\u0004\b\b\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\nH\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\b\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\b\u0010\u001aJ\u000f\u0010\u0017\u001a\u00020\u001bH$¢\u0006\u0004\b\u0017\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020 H\u0000¢\u0006\u0004\b#\u0010\"J)\u0010$\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u00120\u000fH\u0014¢\u0006\u0004\b$\u0010%J)\u0010&\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00120\u000fH\u0014¢\u0006\u0004\b&\u0010%J\u001d\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u00100'H\u0017¢\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u00040'H\u0016¢\u0006\u0004\b*\u0010)J\u000f\u0010+\u001a\u00020\u0007H\u0002¢\u0006\u0004\b+\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0003JB\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010,2\u0006\u0010\u0005\u001a\u00020-2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020/\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000000\u0012\u0006\u0012\u0004\u0018\u00010\u00010.H\u0080@¢\u0006\u0004\b\u0017\u00101J\u000f\u00102\u001a\u00020-H\u0000¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0007H\u0017¢\u0006\u0004\b4\u0010\u0003J\u000f\u00105\u001a\u00020\u0007H\u0002¢\u0006\u0004\b5\u0010\u0003J\u000f\u00106\u001a\u00020\u0007H\u0017¢\u0006\u0004\b6\u0010\u0003J\u000f\u00107\u001a\u00020\u0007H\u0002¢\u0006\u0004\b7\u0010\u0003J\u000f\u00108\u001a\u00020\u0007H\u0017¢\u0006\u0004\b8\u0010\u0003J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u000209H\u0016¢\u0006\u0004\b\u0017\u0010:J#\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010;2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000<H\u0016¢\u0006\u0004\b\b\u0010=J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020>H\u0004¢\u0006\u0004\b\u0014\u0010?J\u000f\u0010@\u001a\u00020-H\u0016¢\u0006\u0004\b@\u00103R\u0016\u00104\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010AR\u0016\u0010\u0014\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010BR\u0016\u0010\r\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010DR\u0016\u0010\u0017\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bE\u0010DR\u0014\u0010\b\u001a\u00020\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0016\u0010E\u001a\u00020\f8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b4\u0010HR\u0014\u0010\u001e\u001a\u00020\u001b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\u001cR\u0016\u0010!\u001a\u00020\u001b8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\bI\u0010JR\u001a\u00106\u001a\u00020K8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0014\u0010L\u001a\u0004\bI\u0010MR\u0016\u0010I\u001a\u00020-8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010NR\u0018\u0010&\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010PR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020R0Q8GX\u0087\u0004¢\u0006\u0006\n\u0004\b6\u0010SR$\u0010W\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00010T8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001c\u0010*\u001a\u00020-8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b*\u0010N\u001a\u0004\bW\u00103R.\u0010U\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00120\u000f8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bU\u0010%R\u0011\u00108\u001a\u00020-8G¢\u0006\u0006\u001a\u0004\bX\u00103R\u0014\u00102\u001a\u00020-8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bY\u00103"}, d2 = {"Lo/ValueClassSerializerStaticJsonValue;", "", "<init>", "()V", "Lo/isHdPlaybackError;", "p0", "p1", "", "write", "(Lo/isHdPlaybackError;Ljava/lang/Object;)V", "Lo/UShortDeserializer;", "(Lo/UShortDeserializer;)V", "Lo/ValueClassSerializer;", "IconCompatParcelizer", "(Lo/UShortDeserializer;)Lo/ValueClassSerializer;", "", "Ljava/lang/Class;", "Lo/setVisibleXRangeMaximum;", "", "Lo/setVisibleYRange;", "RemoteActionCompatParcelizer", "(Ljava/util/Map;)Ljava/util/List;", "Lo/setEntryLabelTextSize;", "AudioAttributesCompatParcelizer", "(Lo/UShortDeserializer;)Lo/setEntryLabelTextSize;", "Lo/checkAccessibility;", "()Lo/checkAccessibility;", "Lo/deserializeKeyQDdqvc;", "()Lo/deserializeKeyQDdqvc;", "Lo/TopUserCompanion;", "MediaBrowserCompatCustomActionResultReceiver", "()Lo/TopUserCompanion;", "Lo/CurrentQuery;", "AudioAttributesImplBaseParcelizer", "()Lo/CurrentQuery;", "MediaBrowserCompatSearchResultReceiver", "onPlay", "()Ljava/util/Map;", "MediaMetadataCompat", "", "onPause", "()Ljava/util/Set;", "RatingCompat", "onFastForward", "R", "", "Lkotlin/Function2;", "Lo/a;", "Lo/SampleVideos;", "(ZLo/MagicModuleSubmissionRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "onAddQueueItem", "()Z", "read", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "AudioAttributesImplApi21Parcelizer", "onPlayFromMediaId", "onCustomAction", "Ljava/lang/Runnable;", "(Ljava/lang/Runnable;)V", "V", "Ljava/util/concurrent/Callable;", "(Ljava/util/concurrent/Callable;)Ljava/lang/Object;", "Lo/setDrawHoleEnabled;", "(Lo/setDrawHoleEnabled;)V", "handleMediaPlayPauseIfPendingOnHandler", "Lo/TopUserCompanion;", "Lo/CurrentQuery;", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "MediaBrowserCompatItemReceiver", "onMediaButtonEvent", "()Lo/setEntryLabelTextSize;", "Lo/ValueClassSerializer;", "AudioAttributesImplApi26Parcelizer", "Lo/deserializeKeyQDdqvc;", "Lo/setDoubleTapToZoomEnabled;", "Lo/setDoubleTapToZoomEnabled;", "()Lo/setDoubleTapToZoomEnabled;", "Z", "Lo/setVisibleYRangeMaximum;", "Lo/setVisibleYRangeMaximum;", "Ljava/lang/ThreadLocal;", "", "Ljava/lang/ThreadLocal;", "", "MediaBrowserCompatMediaItem", "Ljava/util/Map;", "MediaDescriptionCompat", "onCommand", "onPrepareFromMediaId"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ValueClassSerializerStaticJsonValue {

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private deserializeKeyQDdqvc AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private TopUserCompanion read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private setVisibleYRangeMaximum MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private Executor IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private Executor AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private CurrentQuery RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private ValueClassSerializer MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private boolean AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setDoubleTapToZoomEnabled AudioAttributesImplApi21Parcelizer = new setDoubleTapToZoomEnabled(new AudioAttributesImplBaseParcelizer(this));

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final ThreadLocal<Integer> MediaBrowserCompatSearchResultReceiver = new ThreadLocal<>();

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final Map<isHdPlaybackError<?>, Object> MediaDescriptionCompat = new LinkedHashMap();
    private boolean RatingCompat = true;

    public interface MediaBrowserCompatCustomActionResultReceiver {
    }

    protected abstract deserializeKeyQDdqvc AudioAttributesCompatParcelizer();

    private setEntryLabelTextSize onMediaButtonEvent() {
        ValueClassSerializer valueClassSerializer = this.MediaBrowserCompatItemReceiver;
        if (valueClassSerializer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            valueClassSerializer = null;
        }
        setEntryLabelTextSize setentrylabeltextsizeWrite = valueClassSerializer.write();
        if (setentrylabeltextsizeWrite != null) {
            return setentrylabeltextsizeWrite;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.".toString());
    }

    public final deserializeKeyQDdqvc MediaBrowserCompatItemReceiver() {
        deserializeKeyQDdqvc deserializekeyqddqvc = this.AudioAttributesImplBaseParcelizer;
        if (deserializekeyqddqvc != null) {
            return deserializekeyqddqvc;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AudioAttributesImplBaseParcelizer extends MagicModuleRepositoryImpl_Factory implements getCreatedOnDateMs<getShowPopup> {
        public final void IconCompatParcelizer() {
            ((ValueClassSerializerStaticJsonValue) this.AudioAttributesImplApi26Parcelizer).onFastForward();
        }

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            IconCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        AudioAttributesImplBaseParcelizer(Object obj) {
            super(0, obj, ValueClassSerializerStaticJsonValue.class, "onFastForward", "onFastForward()V", 0);
        }
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final setDoubleTapToZoomEnabled getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final boolean getRatingCompat() {
        return this.RatingCompat;
    }

    public final void write(isHdPlaybackError<?> p0, Object p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        this.MediaDescriptionCompat.put(p0, p1);
    }

    public final void write(UShortDeserializer p0) {
        CurrentQuery iconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(p0, "");
        this.RatingCompat = p0.AudioAttributesCompatParcelizer();
        this.MediaBrowserCompatItemReceiver = IconCompatParcelizer(p0);
        this.AudioAttributesImplBaseParcelizer = AudioAttributesCompatParcelizer();
        ValueCreator.read(this, p0);
        ValueCreator.IconCompatParcelizer(this, p0);
        TopUserCompanion topUserCompanion = null;
        if (p0.handleMediaPlayPauseIfPendingOnHandler != null) {
            CurrentQuery.write writeVar = p0.handleMediaPlayPauseIfPendingOnHandler.get(getPlaybackInterval.INSTANCE);
            toMagicModuleMetaRepoModel.read(writeVar, "");
            getPlatform getplatform = (getPlatform) writeVar;
            Executor executor = getDegree.read(getplatform);
            this.IconCompatParcelizer = executor;
            if (executor == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                executor = null;
            }
            this.AudioAttributesCompatParcelizer = new BarChart(executor);
            this.read = College.AudioAttributesCompatParcelizer(p0.handleMediaPlayPauseIfPendingOnHandler.plus(getAltContact.read((setPassingYear) p0.handleMediaPlayPauseIfPendingOnHandler.get(setPassingYear.b_))));
            if (onAddQueueItem()) {
                TopUserCompanion topUserCompanion2 = this.read;
                if (topUserCompanion2 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    topUserCompanion2 = null;
                }
                iconCompatParcelizer = topUserCompanion2.getIconCompatParcelizer().plus(getplatform.IconCompatParcelizer(1));
            } else {
                TopUserCompanion topUserCompanion3 = this.read;
                if (topUserCompanion3 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    topUserCompanion3 = null;
                }
                iconCompatParcelizer = topUserCompanion3.getIconCompatParcelizer();
            }
            this.RemoteActionCompatParcelizer = iconCompatParcelizer;
        } else {
            this.IconCompatParcelizer = p0.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            this.AudioAttributesCompatParcelizer = new BarChart(p0.onPlay);
            Executor executor2 = this.IconCompatParcelizer;
            if (executor2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                executor2 = null;
            }
            TopUserCompanion topUserCompanionAudioAttributesCompatParcelizer = College.AudioAttributesCompatParcelizer(getDegree.write(executor2).plus(getAltContact.read(null)));
            this.read = topUserCompanionAudioAttributesCompatParcelizer;
            CurrentQuery iconCompatParcelizer2 = topUserCompanionAudioAttributesCompatParcelizer.getIconCompatParcelizer();
            Executor executor3 = this.AudioAttributesCompatParcelizer;
            if (executor3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                executor3 = null;
            }
            this.RemoteActionCompatParcelizer = iconCompatParcelizer2.plus(getDegree.write(executor3));
        }
        this.AudioAttributesImplApi26Parcelizer = p0.AudioAttributesCompatParcelizer;
        ValueClassSerializer valueClassSerializer = this.MediaBrowserCompatItemReceiver;
        if (valueClassSerializer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            valueClassSerializer = null;
        }
        setEntryLabelTextSize setentrylabeltextsizeWrite = valueClassSerializer.write();
        if (setentrylabeltextsizeWrite != null) {
            while (!(setentrylabeltextsizeWrite instanceof setDrawMarkers)) {
                if (!(setentrylabeltextsizeWrite instanceof ULongKeyDeserializer)) {
                    setentrylabeltextsizeWrite = null;
                    break;
                }
                setentrylabeltextsizeWrite = ((ULongKeyDeserializer) setentrylabeltextsizeWrite).RemoteActionCompatParcelizer();
            }
        } else {
            setentrylabeltextsizeWrite = null;
            break;
        }
        setDrawMarkers setdrawmarkers = (setDrawMarkers) setentrylabeltextsizeWrite;
        if (setdrawmarkers != null) {
            setdrawmarkers.RemoteActionCompatParcelizer(p0);
        }
        ValueClassSerializer valueClassSerializer2 = this.MediaBrowserCompatItemReceiver;
        if (valueClassSerializer2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            valueClassSerializer2 = null;
        }
        setEntryLabelTextSize setentrylabeltextsizeWrite2 = valueClassSerializer2.write();
        if (setentrylabeltextsizeWrite2 != null) {
            while (!(setentrylabeltextsizeWrite2 instanceof setVisibleXRangeMinimum)) {
                if (!(setentrylabeltextsizeWrite2 instanceof ULongKeyDeserializer)) {
                    setentrylabeltextsizeWrite2 = null;
                    break;
                }
                setentrylabeltextsizeWrite2 = ((ULongKeyDeserializer) setentrylabeltextsizeWrite2).RemoteActionCompatParcelizer();
            }
        } else {
            setentrylabeltextsizeWrite2 = null;
            break;
        }
        setVisibleXRangeMinimum setvisiblexrangeminimum = (setVisibleXRangeMinimum) setentrylabeltextsizeWrite2;
        if (setvisiblexrangeminimum != null) {
            this.MediaMetadataCompat = setvisiblexrangeminimum.IconCompatParcelizer();
            setVisibleYRangeMaximum setvisibleyrangemaximumIconCompatParcelizer = setvisiblexrangeminimum.IconCompatParcelizer();
            TopUserCompanion topUserCompanion4 = this.read;
            if (topUserCompanion4 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                topUserCompanion = topUserCompanion4;
            }
            setvisibleyrangemaximumIconCompatParcelizer.RemoteActionCompatParcelizer(topUserCompanion);
            MediaBrowserCompatItemReceiver().IconCompatParcelizer(setvisiblexrangeminimum.IconCompatParcelizer());
        }
        if (p0.MediaDescriptionCompat != null) {
            if (p0.MediaBrowserCompatMediaItem == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            MediaBrowserCompatItemReceiver().read(p0.MediaBrowserCompatCustomActionResultReceiver, p0.MediaBrowserCompatMediaItem, p0.MediaDescriptionCompat);
        }
    }

    private ValueClassSerializer IconCompatParcelizer(UShortDeserializer p0) {
        ValueClassUnboxSerializer valueClassUnboxSerializer;
        toMagicModuleMetaRepoModel.write(p0, "");
        try {
            checkAccessibility checkaccessibilityWrite = write();
            toMagicModuleMetaRepoModel.read(checkaccessibilityWrite, "");
            valueClassUnboxSerializer = (ValueClassUnboxSerializer) checkaccessibilityWrite;
        } catch (NotImplementedError unused) {
            valueClassUnboxSerializer = null;
        }
        if (valueClassUnboxSerializer == null) {
            return new ValueClassSerializer(p0, (getAnswerMap<? super UShortDeserializer, ? extends setEntryLabelTextSize>) new getAnswerMap() { // from class: o.ValueClassUnboxKeySerializer
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    ValueClassSerializerStaticJsonValue valueClassSerializerStaticJsonValue = this.IconCompatParcelizer;
                    return ValueClassSerializerStaticJsonValue.read((UShortDeserializer) obj);
                }
            });
        }
        return new ValueClassSerializer(p0, valueClassUnboxSerializer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setEntryLabelTextSize read(UShortDeserializer uShortDeserializer) {
        toMagicModuleMetaRepoModel.write(uShortDeserializer, "");
        return AudioAttributesCompatParcelizer(uShortDeserializer);
    }

    @getRenewGrpId
    private static List<setVisibleYRange> RemoteActionCompatParcelizer(Map<Class<? extends setVisibleXRangeMaximum>, setVisibleXRangeMaximum> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    @getRenewGrpId
    private static setEntryLabelTextSize AudioAttributesCompatParcelizer(UShortDeserializer p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        throw new NotImplementedError(null, 1, null);
    }

    protected checkAccessibility write() {
        throw new NotImplementedError(null, 1, null);
    }

    public final TopUserCompanion MediaBrowserCompatCustomActionResultReceiver() {
        TopUserCompanion topUserCompanion = this.read;
        if (topUserCompanion != null) {
            return topUserCompanion;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    public final CurrentQuery AudioAttributesImplBaseParcelizer() {
        TopUserCompanion topUserCompanion = this.read;
        if (topUserCompanion == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            topUserCompanion = null;
        }
        return topUserCompanion.getIconCompatParcelizer();
    }

    public final CurrentQuery MediaBrowserCompatSearchResultReceiver() {
        CurrentQuery currentQuery = this.RemoteActionCompatParcelizer;
        if (currentQuery != null) {
            return currentQuery;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    private static Map<Class<?>, List<Class<?>>> onPlay() {
        return VideoTimelineResponseBody.read();
    }

    protected Map<isHdPlaybackError<?>, List<isHdPlaybackError<?>>> MediaMetadataCompat() {
        Set<Map.Entry<Class<?>, List<Class<?>>>> setEntrySet = onPlay().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(getQues.write(VideoTimelineResponseBody.read(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            isHdPlaybackError ishdplaybackerror = MagicModuleFeedbackRequestBody.read(cls);
            List list2 = list;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(MagicModuleFeedbackRequestBody.read((Class) it2.next()));
            }
            Pair pairWrite = setAction.write(ishdplaybackerror, arrayList);
            linkedHashMap.put(pairWrite.write(), pairWrite.IconCompatParcelizer());
        }
        return linkedHashMap;
    }

    public final Map<isHdPlaybackError<?>, List<isHdPlaybackError<?>>> MediaBrowserCompatMediaItem() {
        return MediaMetadataCompat();
    }

    @getRenewGrpId
    private static Set<Class<? extends setVisibleXRangeMaximum>> onPause() {
        return getKycMessage.read();
    }

    public Set<isHdPlaybackError<? extends setVisibleXRangeMaximum>> RatingCompat() {
        Set<Class<? extends setVisibleXRangeMaximum>> setOnPause = onPause();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(setOnPause, 10));
        Iterator<T> it = setOnPause.iterator();
        while (it.hasNext()) {
            arrayList.add(MagicModuleFeedbackRequestBody.read((Class) it.next()));
        }
        return IntermediateLoginResponseBody.onPlayFromUri(arrayList);
    }

    public final boolean onCommand() {
        ValueClassSerializer valueClassSerializer = this.MediaBrowserCompatItemReceiver;
        if (valueClassSerializer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            valueClassSerializer = null;
        }
        return valueClassSerializer.AudioAttributesImplApi26Parcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFastForward() {
        TopUserCompanion topUserCompanion = this.read;
        ValueClassSerializer valueClassSerializer = null;
        if (topUserCompanion == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            topUserCompanion = null;
        }
        College.AudioAttributesCompatParcelizer(topUserCompanion, null);
        MediaBrowserCompatItemReceiver().IconCompatParcelizer();
        ValueClassSerializer valueClassSerializer2 = this.MediaBrowserCompatItemReceiver;
        if (valueClassSerializer2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            valueClassSerializer = valueClassSerializer2;
        }
        valueClassSerializer.IconCompatParcelizer();
    }

    private static boolean onPrepareFromMediaId() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public final void IconCompatParcelizer() {
        if (!this.AudioAttributesImplApi26Parcelizer && onPrepareFromMediaId()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
        }
    }

    public final void RemoteActionCompatParcelizer() {
        if (onAddQueueItem() && !handleMediaPlayPauseIfPendingOnHandler() && this.MediaBrowserCompatSearchResultReceiver.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    public final <R> Object AudioAttributesCompatParcelizer(boolean z, MagicModuleSubmissionRequestBody<? super a, ? super SampleVideos<? super R>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super R> sampleVideos) {
        ValueClassSerializer valueClassSerializer = this.MediaBrowserCompatItemReceiver;
        if (valueClassSerializer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            valueClassSerializer = null;
        }
        return valueClassSerializer.IconCompatParcelizer(z, magicModuleSubmissionRequestBody, sampleVideos);
    }

    public final boolean onAddQueueItem() {
        ValueClassSerializer valueClassSerializer = this.MediaBrowserCompatItemReceiver;
        if (valueClassSerializer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            valueClassSerializer = null;
        }
        return valueClassSerializer.write() != null;
    }

    @getRenewGrpId
    public final void read() {
        IconCompatParcelizer();
        setVisibleYRangeMaximum setvisibleyrangemaximum = this.MediaMetadataCompat;
        if (setvisibleyrangemaximum == null) {
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        } else {
            setvisibleyrangemaximum.write(new getAnswerMap() { // from class: o.ValueClassStaticJsonKeySerializer
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return ValueClassSerializerStaticJsonValue.IconCompatParcelizer(this.RemoteActionCompatParcelizer, (setDrawSliceText) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(ValueClassSerializerStaticJsonValue valueClassSerializerStaticJsonValue, setDrawSliceText setdrawslicetext) {
        toMagicModuleMetaRepoModel.write(setdrawslicetext, "");
        valueClassSerializerStaticJsonValue.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        return getShowPopup.INSTANCE;
    }

    private final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        IconCompatParcelizer();
        setDrawSliceText setdrawslicetextWrite = onMediaButtonEvent().write();
        if (!setdrawslicetextWrite.AudioAttributesImplApi26Parcelizer()) {
            MediaBrowserCompatItemReceiver().MediaBrowserCompatCustomActionResultReceiver();
        }
        if (setdrawslicetextWrite.MediaBrowserCompatCustomActionResultReceiver()) {
            setdrawslicetextWrite.RemoteActionCompatParcelizer();
        } else {
            setdrawslicetextWrite.AudioAttributesCompatParcelizer();
        }
    }

    @getRenewGrpId
    public final void AudioAttributesImplApi21Parcelizer() {
        setVisibleYRangeMaximum setvisibleyrangemaximum = this.MediaMetadataCompat;
        if (setvisibleyrangemaximum == null) {
            onPlayFromMediaId();
        } else {
            setvisibleyrangemaximum.write(new getAnswerMap() { // from class: o.createOrNull
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return ValueClassSerializerStaticJsonValue.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, (setDrawSliceText) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(ValueClassSerializerStaticJsonValue valueClassSerializerStaticJsonValue, setDrawSliceText setdrawslicetext) {
        toMagicModuleMetaRepoModel.write(setdrawslicetext, "");
        valueClassSerializerStaticJsonValue.onPlayFromMediaId();
        return getShowPopup.INSTANCE;
    }

    private final void onPlayFromMediaId() {
        onMediaButtonEvent().write().write();
        if (handleMediaPlayPauseIfPendingOnHandler()) {
            return;
        }
        MediaBrowserCompatItemReceiver().AudioAttributesCompatParcelizer();
    }

    @getRenewGrpId
    public final void onCustomAction() {
        onMediaButtonEvent().write().MediaBrowserCompatItemReceiver();
    }

    public final void AudioAttributesCompatParcelizer(Runnable p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        read();
        try {
            p0.run();
            onCustomAction();
        } finally {
            AudioAttributesImplApi21Parcelizer();
        }
    }

    public final <V> V write(Callable<V> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        read();
        try {
            V vCall = p0.call();
            onCustomAction();
            return vCall;
        } finally {
            AudioAttributesImplApi21Parcelizer();
        }
    }

    public final void RemoteActionCompatParcelizer(setDrawHoleEnabled p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        MediaBrowserCompatItemReceiver().AudioAttributesCompatParcelizer(p0);
    }

    public final boolean handleMediaPlayPauseIfPendingOnHandler() {
        return onCommand() && onMediaButtonEvent().write().AudioAttributesImplApi26Parcelizer();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\u0006j\u0002\b\t"}, d2 = {"Lo/ValueClassSerializerStaticJsonValue$IconCompatParcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/content/Context;", "p0", "AudioAttributesCompatParcelizer", "(Landroid/content/Context;)Lo/ValueClassSerializerStaticJsonValue$IconCompatParcelizer;", "read", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer {
        private static final /* synthetic */ IconCompatParcelizer[] IconCompatParcelizer;
        public static final IconCompatParcelizer read = new IconCompatParcelizer("AUTOMATIC", 0);
        public static final IconCompatParcelizer AudioAttributesCompatParcelizer = new IconCompatParcelizer("TRUNCATE", 1);
        public static final IconCompatParcelizer write = new IconCompatParcelizer("WRITE_AHEAD_LOGGING", 2);

        private IconCompatParcelizer(String str, int i) {
        }

        static {
            IconCompatParcelizer[] iconCompatParcelizerArr = read();
            IconCompatParcelizer = iconCompatParcelizerArr;
            getMagicModuleTimeline.IconCompatParcelizer(iconCompatParcelizerArr);
        }

        public final IconCompatParcelizer AudioAttributesCompatParcelizer(Context p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            if (this != read) {
                return this;
            }
            Object systemService = p0.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            if (activityManager != null && !activityManager.isLowRamDevice()) {
                return write;
            }
            return AudioAttributesCompatParcelizer;
        }

        public static IconCompatParcelizer valueOf(String str) {
            return (IconCompatParcelizer) Enum.valueOf(IconCompatParcelizer.class, str);
        }

        public static IconCompatParcelizer[] values() {
            return (IconCompatParcelizer[]) IconCompatParcelizer.clone();
        }

        private static final /* synthetic */ IconCompatParcelizer[] read() {
            return new IconCompatParcelizer[]{read, AudioAttributesCompatParcelizer, write};
        }
    }

    public static class RemoteActionCompatParcelizer<T extends ValueClassSerializerStaticJsonValue> {
        private long AudioAttributesCompatParcelizer;
        private final List<setVisibleXRangeMaximum> AudioAttributesImplApi21Parcelizer;
        private File AudioAttributesImplApi26Parcelizer;
        private final Context AudioAttributesImplBaseParcelizer;
        private boolean IconCompatParcelizer;
        private final List<read> MediaBrowserCompatCustomActionResultReceiver;
        private String MediaBrowserCompatItemReceiver;
        private boolean MediaBrowserCompatMediaItem;
        private IconCompatParcelizer MediaBrowserCompatSearchResultReceiver;
        private Set<Integer> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        private Callable<InputStream> MediaDescriptionCompat;
        private setCenterTextTypeface MediaMetadataCompat;
        private final getCreatedOnDateMs<T> RatingCompat;
        private boolean RemoteActionCompatParcelizer;
        private final write handleMediaPlayPauseIfPendingOnHandler;
        private final isHdPlaybackError<T> onAddQueueItem;
        private final Set<Integer> onCommand;
        private Intent onCustomAction;
        private Executor onFastForward;
        private CurrentQuery onMediaButtonEvent;
        private MediaBrowserCompatCustomActionResultReceiver onPause;
        private final String onPlay;
        private AudioAttributesImplApi21Parcelizer onPlayFromMediaId;
        private final List<Object> onPlayFromSearch;
        private boolean onPlayFromUri;
        private Executor onPrepareFromMediaId;
        private setEntryLabelTextSize.AudioAttributesCompatParcelizer onPrepareFromSearch;
        private boolean read;
        private TimeUnit write;

        public RemoteActionCompatParcelizer(Context context, Class<T> cls, String str) {
            toMagicModuleMetaRepoModel.write(context, "");
            toMagicModuleMetaRepoModel.write(cls, "");
            this.MediaBrowserCompatCustomActionResultReceiver = new ArrayList();
            this.onPlayFromSearch = new ArrayList();
            this.MediaBrowserCompatSearchResultReceiver = IconCompatParcelizer.read;
            this.AudioAttributesCompatParcelizer = -1L;
            this.handleMediaPlayPauseIfPendingOnHandler = new write();
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new LinkedHashSet();
            this.onCommand = new LinkedHashSet();
            this.AudioAttributesImplApi21Parcelizer = new ArrayList();
            this.onPlayFromUri = true;
            this.MediaBrowserCompatMediaItem = true;
            this.onAddQueueItem = MagicModuleFeedbackRequestBody.read(cls);
            this.AudioAttributesImplBaseParcelizer = context;
            this.onPlay = str;
            this.RatingCompat = null;
        }

        public final RemoteActionCompatParcelizer<T> read(setEntryLabelTextSize.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            this.onPrepareFromSearch = audioAttributesCompatParcelizer;
            return this;
        }

        public final RemoteActionCompatParcelizer<T> read(setVisibleYRange... setvisibleyrangeArr) {
            toMagicModuleMetaRepoModel.write(setvisibleyrangeArr, "");
            int length = setvisibleyrangeArr.length;
            for (int i = 0; i <= 0; i++) {
                setVisibleYRange setvisibleyrange = setvisibleyrangeArr[0];
                this.onCommand.add(Integer.valueOf(setvisibleyrange.read));
                this.onCommand.add(Integer.valueOf(setvisibleyrange.RemoteActionCompatParcelizer));
            }
            this.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer((setVisibleYRange[]) Arrays.copyOf(setvisibleyrangeArr, setvisibleyrangeArr.length));
            return this;
        }

        public final RemoteActionCompatParcelizer<T> read() {
            this.IconCompatParcelizer = true;
            return this;
        }

        public final RemoteActionCompatParcelizer<T> RemoteActionCompatParcelizer(Executor executor) {
            toMagicModuleMetaRepoModel.write(executor, "");
            this.onFastForward = executor;
            return this;
        }

        public final RemoteActionCompatParcelizer<T> AudioAttributesCompatParcelizer() {
            this.onPlayFromUri = false;
            this.RemoteActionCompatParcelizer = true;
            this.read = true;
            return this;
        }

        public final RemoteActionCompatParcelizer<T> RemoteActionCompatParcelizer(read readVar) {
            toMagicModuleMetaRepoModel.write(readVar, "");
            this.MediaBrowserCompatCustomActionResultReceiver.add(readVar);
            return this;
        }

        public final T write() {
            T tInvoke;
            Executor executor = this.onFastForward;
            if (executor == null && this.onPrepareFromMediaId == null) {
                Executor executor2 = setPopupCallback.read();
                this.onPrepareFromMediaId = executor2;
                this.onFastForward = executor2;
            } else if (executor != null && this.onPrepareFromMediaId == null) {
                this.onPrepareFromMediaId = executor;
            } else if (executor == null) {
                this.onFastForward = this.onPrepareFromMediaId;
            }
            ValueCreator.RemoteActionCompatParcelizer(this.onCommand, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            setRotationAngle setrotationangle = this.onPrepareFromSearch;
            if (setrotationangle == null) {
                setrotationangle = new setRotationAngle();
            }
            boolean z = this.AudioAttributesCompatParcelizer > 0;
            if (setrotationangle == null) {
                setrotationangle = null;
            } else if (z) {
                if (this.onPlay == null) {
                    throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.".toString());
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            setEntryLabelTextSize.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = setrotationangle;
            if (audioAttributesCompatParcelizer == null && z) {
                throw new IllegalArgumentException("Auto Closing Database is not supported when an SQLiteDriver is configured.".toString());
            }
            Context context = this.AudioAttributesImplBaseParcelizer;
            String str = this.onPlay;
            write writeVar = this.handleMediaPlayPauseIfPendingOnHandler;
            List<read> list = this.MediaBrowserCompatCustomActionResultReceiver;
            boolean z2 = this.IconCompatParcelizer;
            IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(context);
            Executor executor3 = this.onFastForward;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Executor executor4 = this.onPrepareFromMediaId;
            if (executor4 != null) {
                UShortDeserializer uShortDeserializer = new UShortDeserializer(context, str, audioAttributesCompatParcelizer, writeVar, list, z2, iconCompatParcelizerAudioAttributesCompatParcelizer, executor3, executor4, null, this.onPlayFromUri, this.RemoteActionCompatParcelizer, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, null, null, null, null, this.onPlayFromSearch, this.AudioAttributesImplApi21Parcelizer, this.read, null, null);
                uShortDeserializer.IconCompatParcelizer(this.MediaBrowserCompatMediaItem);
                getCreatedOnDateMs<T> getcreatedondatems = this.RatingCompat;
                if (getcreatedondatems == null || (tInvoke = getcreatedondatems.invoke()) == null) {
                    tInvoke = (T) setExtraTopOffset.RemoteActionCompatParcelizer(MagicModuleFeedbackRequestBody.IconCompatParcelizer(this.onAddQueueItem), "_Impl");
                }
                tInvoke.write(uShortDeserializer);
                return tInvoke;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public static class write {
        private final Map<Integer, TreeMap<Integer, setVisibleYRange>> RemoteActionCompatParcelizer = new LinkedHashMap();

        public final void write(setVisibleYRange setvisibleyrange) {
            toMagicModuleMetaRepoModel.write(setvisibleyrange, "");
            int i = setvisibleyrange.read;
            int i2 = setvisibleyrange.RemoteActionCompatParcelizer;
            Map<Integer, TreeMap<Integer, setVisibleYRange>> map = this.RemoteActionCompatParcelizer;
            Integer numValueOf = Integer.valueOf(i);
            TreeMap<Integer, setVisibleYRange> treeMap = map.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(numValueOf, treeMap);
            }
            TreeMap<Integer, setVisibleYRange> treeMap2 = treeMap;
            TreeMap<Integer, setVisibleYRange> treeMap3 = treeMap2;
            if (treeMap3.containsKey(Integer.valueOf(i2))) {
                Objects.toString(treeMap2.get(Integer.valueOf(i2)));
                Objects.toString(setvisibleyrange);
            }
            treeMap3.put(Integer.valueOf(i2), setvisibleyrange);
        }

        public final Map<Integer, Map<Integer, setVisibleYRange>> write() {
            return this.RemoteActionCompatParcelizer;
        }

        public final boolean AudioAttributesCompatParcelizer(int i, int i2) {
            return setMarker.read(this, i, i2);
        }

        public final Pair<Map<Integer, setVisibleYRange>, Iterable<Integer>> AudioAttributesCompatParcelizer(int i) {
            TreeMap<Integer, setVisibleYRange> treeMap = this.RemoteActionCompatParcelizer.get(Integer.valueOf(i));
            if (treeMap == null) {
                return null;
            }
            return setAction.write(treeMap, treeMap.keySet());
        }

        public final Pair<Map<Integer, setVisibleYRange>, Iterable<Integer>> read(int i) {
            TreeMap<Integer, setVisibleYRange> treeMap = this.RemoteActionCompatParcelizer.get(Integer.valueOf(i));
            if (treeMap == null) {
                return null;
            }
            return setAction.write(treeMap, treeMap.descendingKeySet());
        }

        public final void AudioAttributesCompatParcelizer(setVisibleYRange... setvisibleyrangeArr) {
            toMagicModuleMetaRepoModel.write(setvisibleyrangeArr, "");
            for (setVisibleYRange setvisibleyrange : setvisibleyrangeArr) {
                write(setvisibleyrange);
            }
        }
    }

    public static abstract class read {
        public static void RemoteActionCompatParcelizer(setDrawHoleEnabled setdrawholeenabled) {
            toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
            if (setdrawholeenabled instanceof setScaleMinima) {
                read(((setScaleMinima) setdrawholeenabled).read());
            }
        }

        public static void AudioAttributesCompatParcelizer(setDrawHoleEnabled setdrawholeenabled) {
            toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
            if (setdrawholeenabled instanceof setScaleMinima) {
                IconCompatParcelizer(((setScaleMinima) setdrawholeenabled).read());
            }
        }

        public final void IconCompatParcelizer(setDrawHoleEnabled setdrawholeenabled) {
            toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
            if (setdrawholeenabled instanceof setScaleMinima) {
                AudioAttributesCompatParcelizer(((setScaleMinima) setdrawholeenabled).read());
            }
        }

        private static void read(setDrawSliceText setdrawslicetext) {
            toMagicModuleMetaRepoModel.write(setdrawslicetext, "");
        }

        private static void IconCompatParcelizer(setDrawSliceText setdrawslicetext) {
            toMagicModuleMetaRepoModel.write(setdrawslicetext, "");
        }

        public void AudioAttributesCompatParcelizer(setDrawSliceText setdrawslicetext) {
            toMagicModuleMetaRepoModel.write(setdrawslicetext, "");
        }
    }

    public static abstract class AudioAttributesImplApi21Parcelizer {
        public static void write(setDrawSliceText setdrawslicetext) {
            toMagicModuleMetaRepoModel.write(setdrawslicetext, "");
        }
    }

    public List<setVisibleYRange> write(Map<isHdPlaybackError<? extends setVisibleXRangeMaximum>, ? extends setVisibleXRangeMaximum> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(VideoTimelineResponseBody.read(p0.size()));
        Iterator<T> it = p0.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(MagicModuleFeedbackRequestBody.IconCompatParcelizer((isHdPlaybackError) entry.getKey()), entry.getValue());
        }
        return RemoteActionCompatParcelizer(linkedHashMap);
    }
}
