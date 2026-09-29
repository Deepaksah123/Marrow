package kotlin;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class setTileCountVertical<TranscodeType> extends notifyQueueUpdate<setTileCountVertical<TranscodeType>> implements Cloneable {
    private final setRotationDegrees AudioAttributesCompatParcelizer;
    private Object AudioAttributesImplApi21Parcelizer;
    private final ForwardingPlayer AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private final Glide IconCompatParcelizer;
    private List<getUpdatedMediaPeriodInfo<TranscodeType>> MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private setTileCountVertical<TranscodeType> MediaBrowserCompatMediaItem;
    private setTileCountHorizontal<?, ? super TranscodeType> MediaBrowserCompatSearchResultReceiver;
    private final Class<TranscodeType> MediaMetadataCompat;
    private Float RatingCompat;
    private setTileCountVertical<TranscodeType> RemoteActionCompatParcelizer;
    private boolean read = true;
    private final Context write;

    @Override // kotlin.notifyQueueUpdate
    public /* synthetic */ notifyQueueUpdate IconCompatParcelizer(notifyQueueUpdate notifyqueueupdate) {
        return RemoteActionCompatParcelizer((notifyQueueUpdate<?>) notifyqueueupdate);
    }

    static {
        new getPlayingPeriod().IconCompatParcelizer(setDrmSessionForClearTypes.write).read(setSampleRate.LOW).read(true);
    }

    public setTileCountVertical(Glide glide, ForwardingPlayer forwardingPlayer, Class<TranscodeType> cls, Context context) {
        this.IconCompatParcelizer = glide;
        this.AudioAttributesImplApi26Parcelizer = forwardingPlayer;
        this.MediaMetadataCompat = cls;
        this.write = context;
        this.MediaBrowserCompatSearchResultReceiver = forwardingPlayer.AudioAttributesCompatParcelizer(cls);
        this.AudioAttributesCompatParcelizer = glide.IconCompatParcelizer();
        read(forwardingPlayer.write());
        RemoteActionCompatParcelizer(forwardingPlayer.IconCompatParcelizer());
    }

    final ForwardingPlayer AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    private void read(List<getUpdatedMediaPeriodInfo<Object>> list) {
        Iterator<getUpdatedMediaPeriodInfo<Object>> it = list.iterator();
        while (it.hasNext()) {
            read((getUpdatedMediaPeriodInfo) it.next());
        }
    }

    public setTileCountVertical<TranscodeType> RemoteActionCompatParcelizer(notifyQueueUpdate<?> notifyqueueupdate) {
        moveMediaSource.AudioAttributesCompatParcelizer(notifyqueueupdate);
        return (setTileCountVertical) super.IconCompatParcelizer(notifyqueueupdate);
    }

    public setTileCountVertical<TranscodeType> write(getUpdatedMediaPeriodInfo<TranscodeType> getupdatedmediaperiodinfo) {
        if (onPlayFromSearch()) {
            return clone().write(getupdatedmediaperiodinfo);
        }
        this.MediaBrowserCompatCustomActionResultReceiver = null;
        return read((getUpdatedMediaPeriodInfo) getupdatedmediaperiodinfo);
    }

    public setTileCountVertical<TranscodeType> read(getUpdatedMediaPeriodInfo<TranscodeType> getupdatedmediaperiodinfo) {
        if (onPlayFromSearch()) {
            return clone().read((getUpdatedMediaPeriodInfo) getupdatedmediaperiodinfo);
        }
        if (getupdatedmediaperiodinfo != null) {
            if (this.MediaBrowserCompatCustomActionResultReceiver == null) {
                this.MediaBrowserCompatCustomActionResultReceiver = new ArrayList();
            }
            this.MediaBrowserCompatCustomActionResultReceiver.add(getupdatedmediaperiodinfo);
        }
        return onSetRepeatMode();
    }

    public setTileCountVertical<TranscodeType> IconCompatParcelizer(Object obj) {
        return read(obj);
    }

    private setTileCountVertical<TranscodeType> read(Object obj) {
        if (onPlayFromSearch()) {
            return clone().read(obj);
        }
        this.AudioAttributesImplApi21Parcelizer = obj;
        this.AudioAttributesImplBaseParcelizer = true;
        return onSetRepeatMode();
    }

    public setTileCountVertical<TranscodeType> RemoteActionCompatParcelizer(String str) {
        return read(str);
    }

    public setTileCountVertical<TranscodeType> write(Uri uri) {
        return IconCompatParcelizer(uri, read(uri));
    }

    private setTileCountVertical<TranscodeType> IconCompatParcelizer(Uri uri, setTileCountVertical<TranscodeType> settilecountvertical) {
        return (uri == null || !"android.resource".equals(uri.getScheme())) ? settilecountvertical : AudioAttributesCompatParcelizer(settilecountvertical);
    }

    private setTileCountVertical<TranscodeType> AudioAttributesCompatParcelizer(setTileCountVertical<TranscodeType> settilecountvertical) {
        return settilecountvertical.write(this.write.getTheme()).IconCompatParcelizer(disableUnusedMediaSources.read(this.write));
    }

    public setTileCountVertical<TranscodeType> IconCompatParcelizer(Integer num) {
        return AudioAttributesCompatParcelizer(read(num));
    }

    @Override // kotlin.notifyQueueUpdate
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public setTileCountVertical<TranscodeType> read() {
        setTileCountVertical<TranscodeType> settilecountvertical = (setTileCountVertical) super.read();
        settilecountvertical.MediaBrowserCompatSearchResultReceiver = settilecountvertical.MediaBrowserCompatSearchResultReceiver.clone();
        if (settilecountvertical.MediaBrowserCompatCustomActionResultReceiver != null) {
            settilecountvertical.MediaBrowserCompatCustomActionResultReceiver = new ArrayList(settilecountvertical.MediaBrowserCompatCustomActionResultReceiver);
        }
        setTileCountVertical<TranscodeType> settilecountvertical2 = settilecountvertical.MediaBrowserCompatMediaItem;
        if (settilecountvertical2 != null) {
            settilecountvertical.MediaBrowserCompatMediaItem = settilecountvertical2.clone();
        }
        setTileCountVertical<TranscodeType> settilecountvertical3 = settilecountvertical.RemoteActionCompatParcelizer;
        if (settilecountvertical3 != null) {
            settilecountvertical.RemoteActionCompatParcelizer = settilecountvertical3.clone();
        }
        return settilecountvertical;
    }

    public final <Y extends MediaSourceInfoHolder<TranscodeType>> Y read(Y y) {
        return (Y) RemoteActionCompatParcelizer(y, null, getSize.RemoteActionCompatParcelizer());
    }

    final <Y extends MediaSourceInfoHolder<TranscodeType>> Y RemoteActionCompatParcelizer(Y y, getUpdatedMediaPeriodInfo<TranscodeType> getupdatedmediaperiodinfo, Executor executor) {
        return (Y) RemoteActionCompatParcelizer(y, getupdatedmediaperiodinfo, this, executor);
    }

    private <Y extends MediaSourceInfoHolder<TranscodeType>> Y RemoteActionCompatParcelizer(Y y, getUpdatedMediaPeriodInfo<TranscodeType> getupdatedmediaperiodinfo, notifyQueueUpdate<?> notifyqueueupdate, Executor executor) {
        moveMediaSource.AudioAttributesCompatParcelizer(y);
        if (!this.AudioAttributesImplBaseParcelizer) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        enqueueNextMediaPeriodHolder enqueuenextmediaperiodholderIconCompatParcelizer = IconCompatParcelizer(y, getupdatedmediaperiodinfo, notifyqueueupdate, executor);
        enqueueNextMediaPeriodHolder enqueuenextmediaperiodholderAudioAttributesCompatParcelizer = y.AudioAttributesCompatParcelizer();
        if (enqueuenextmediaperiodholderIconCompatParcelizer.read(enqueuenextmediaperiodholderAudioAttributesCompatParcelizer) && !RemoteActionCompatParcelizer(notifyqueueupdate, enqueuenextmediaperiodholderAudioAttributesCompatParcelizer)) {
            if (!((enqueueNextMediaPeriodHolder) moveMediaSource.AudioAttributesCompatParcelizer(enqueuenextmediaperiodholderAudioAttributesCompatParcelizer)).MediaBrowserCompatItemReceiver()) {
                enqueuenextmediaperiodholderAudioAttributesCompatParcelizer.IconCompatParcelizer();
            }
            return y;
        }
        this.AudioAttributesImplApi26Parcelizer.write(y);
        y.write(enqueuenextmediaperiodholderIconCompatParcelizer);
        this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(y, enqueuenextmediaperiodholderIconCompatParcelizer);
        return y;
    }

    private static boolean RemoteActionCompatParcelizer(notifyQueueUpdate<?> notifyqueueupdate, enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder) {
        return !notifyqueueupdate.onPlayFromUri() && enqueuenextmediaperiodholder.MediaBrowserCompatCustomActionResultReceiver();
    }

    public final MediaPeriodQueueExternalSyntheticLambda0<ImageView, TranscodeType> RemoteActionCompatParcelizer(ImageView imageView) {
        notifyQueueUpdate notifyqueueupdateOnSetShuffleMode;
        moveMediaSourceRange.write();
        moveMediaSource.AudioAttributesCompatParcelizer(imageView);
        if (!onRemoveQueueItem() && onSeekTo() && imageView.getScaleType() != null) {
            switch (AnonymousClass5.write[imageView.getScaleType().ordinal()]) {
                case 1:
                    notifyqueueupdateOnSetShuffleMode = read().onSetShuffleMode();
                    break;
                case 2:
                    notifyqueueupdateOnSetShuffleMode = read().onSetRating();
                    break;
                case 3:
                case 4:
                case 5:
                    notifyqueueupdateOnSetShuffleMode = read().onSetCaptioningEnabled();
                    break;
                case 6:
                    notifyqueueupdateOnSetShuffleMode = read().onSetRating();
                    break;
                default:
                    notifyqueueupdateOnSetShuffleMode = this;
                    break;
            }
        } else {
            notifyqueueupdateOnSetShuffleMode = this;
        }
        return (MediaPeriodQueueExternalSyntheticLambda0) RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(imageView, this.MediaMetadataCompat), null, notifyqueueupdateOnSetShuffleMode, getSize.RemoteActionCompatParcelizer());
    }

    public final advanceReadingPeriod<TranscodeType> write() {
        return setSessionImpl();
    }

    private advanceReadingPeriod<TranscodeType> setSessionImpl() {
        resolvePeriodIndexToWindowSequenceNumber resolveperiodindextowindowsequencenumber = new resolvePeriodIndexToWindowSequenceNumber(Integer.MIN_VALUE, Integer.MIN_VALUE);
        return (advanceReadingPeriod) RemoteActionCompatParcelizer(resolveperiodindextowindowsequencenumber, resolveperiodindextowindowsequencenumber, getSize.read());
    }

    /* JADX INFO: renamed from: o.setTileCountVertical$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] IconCompatParcelizer;
        static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[setSampleRate.values().length];
            IconCompatParcelizer = iArr;
            try {
                iArr[setSampleRate.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IconCompatParcelizer[setSampleRate.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IconCompatParcelizer[setSampleRate.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                IconCompatParcelizer[setSampleRate.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            write = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                write[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                write[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                write[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                write[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                write[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                write[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                write[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private setSampleRate IconCompatParcelizer(setSampleRate setsamplerate) {
        int i = AnonymousClass5.IconCompatParcelizer[setsamplerate.ordinal()];
        if (i == 1) {
            return setSampleRate.NORMAL;
        }
        if (i == 2) {
            return setSampleRate.HIGH;
        }
        if (i == 3 || i == 4) {
            return setSampleRate.IMMEDIATE;
        }
        StringBuilder sb = new StringBuilder("unknown priority: ");
        sb.append(onCommand());
        throw new IllegalArgumentException(sb.toString());
    }

    private enqueueNextMediaPeriodHolder IconCompatParcelizer(MediaSourceInfoHolder<TranscodeType> mediaSourceInfoHolder, getUpdatedMediaPeriodInfo<TranscodeType> getupdatedmediaperiodinfo, notifyQueueUpdate<?> notifyqueueupdate, Executor executor) {
        return IconCompatParcelizer(new Object(), mediaSourceInfoHolder, getupdatedmediaperiodinfo, null, this.MediaBrowserCompatSearchResultReceiver, notifyqueueupdate.onCommand(), notifyqueueupdate.handleMediaPlayPauseIfPendingOnHandler(), notifyqueueupdate.onAddQueueItem(), notifyqueueupdate, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private enqueueNextMediaPeriodHolder IconCompatParcelizer(Object obj, MediaSourceInfoHolder<TranscodeType> mediaSourceInfoHolder, getUpdatedMediaPeriodInfo<TranscodeType> getupdatedmediaperiodinfo, updateForPlaybackModeChange updateforplaybackmodechange, setTileCountHorizontal<?, ? super TranscodeType> settilecounthorizontal, setSampleRate setsamplerate, int i, int i2, notifyQueueUpdate<?> notifyqueueupdate, Executor executor) {
        isSkippableAdPeriod isskippableadperiod;
        updateForPlaybackModeChange isskippableadperiod2;
        if (this.RemoteActionCompatParcelizer != null) {
            isskippableadperiod2 = new isSkippableAdPeriod(obj, updateforplaybackmodechange);
            isskippableadperiod = isskippableadperiod2;
        } else {
            isskippableadperiod = 0;
            isskippableadperiod2 = updateforplaybackmodechange;
        }
        enqueueNextMediaPeriodHolder enqueuenextmediaperiodholderWrite = write(obj, mediaSourceInfoHolder, getupdatedmediaperiodinfo, isskippableadperiod2, settilecounthorizontal, setsamplerate, i, i2, notifyqueueupdate, executor);
        if (isskippableadperiod == 0) {
            return enqueuenextmediaperiodholderWrite;
        }
        int iHandleMediaPlayPauseIfPendingOnHandler = this.RemoteActionCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler();
        int iOnAddQueueItem = this.RemoteActionCompatParcelizer.onAddQueueItem();
        if (moveMediaSourceRange.IconCompatParcelizer(i, i2) && !this.RemoteActionCompatParcelizer.onRewind()) {
            iHandleMediaPlayPauseIfPendingOnHandler = notifyqueueupdate.handleMediaPlayPauseIfPendingOnHandler();
            iOnAddQueueItem = notifyqueueupdate.onAddQueueItem();
        }
        setTileCountVertical<TranscodeType> settilecountvertical = this.RemoteActionCompatParcelizer;
        isskippableadperiod.RemoteActionCompatParcelizer(enqueuenextmediaperiodholderWrite, settilecountvertical.IconCompatParcelizer(obj, mediaSourceInfoHolder, getupdatedmediaperiodinfo, isskippableadperiod, settilecountvertical.MediaBrowserCompatSearchResultReceiver, settilecountvertical.onCommand(), iHandleMediaPlayPauseIfPendingOnHandler, iOnAddQueueItem, this.RemoteActionCompatParcelizer, executor));
        return isskippableadperiod;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private enqueueNextMediaPeriodHolder write(Object obj, MediaSourceInfoHolder<TranscodeType> mediaSourceInfoHolder, getUpdatedMediaPeriodInfo<TranscodeType> getupdatedmediaperiodinfo, updateForPlaybackModeChange updateforplaybackmodechange, setTileCountHorizontal<?, ? super TranscodeType> settilecounthorizontal, setSampleRate setsamplerate, int i, int i2, notifyQueueUpdate<?> notifyqueueupdate, Executor executor) {
        setSampleRate setsamplerateIconCompatParcelizer;
        setTileCountVertical<TranscodeType> settilecountvertical = this.MediaBrowserCompatMediaItem;
        if (settilecountvertical != null) {
            if (this.MediaBrowserCompatItemReceiver) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            setTileCountHorizontal<?, ? super TranscodeType> settilecounthorizontal2 = settilecountvertical.read ? settilecounthorizontal : settilecountvertical.MediaBrowserCompatSearchResultReceiver;
            if (settilecountvertical.onPrepareFromMediaId()) {
                setsamplerateIconCompatParcelizer = this.MediaBrowserCompatMediaItem.onCommand();
            } else {
                setsamplerateIconCompatParcelizer = IconCompatParcelizer(setsamplerate);
            }
            setSampleRate setsamplerate2 = setsamplerateIconCompatParcelizer;
            int iHandleMediaPlayPauseIfPendingOnHandler = this.MediaBrowserCompatMediaItem.handleMediaPlayPauseIfPendingOnHandler();
            int iOnAddQueueItem = this.MediaBrowserCompatMediaItem.onAddQueueItem();
            if (moveMediaSourceRange.IconCompatParcelizer(i, i2) && !this.MediaBrowserCompatMediaItem.onRewind()) {
                iHandleMediaPlayPauseIfPendingOnHandler = notifyqueueupdate.handleMediaPlayPauseIfPendingOnHandler();
                iOnAddQueueItem = notifyqueueupdate.onAddQueueItem();
            }
            int i3 = iHandleMediaPlayPauseIfPendingOnHandler;
            int i4 = iOnAddQueueItem;
            getNextMediaPeriodInfo getnextmediaperiodinfo = new getNextMediaPeriodInfo(obj, updateforplaybackmodechange);
            enqueueNextMediaPeriodHolder enqueuenextmediaperiodholderWrite = write(obj, mediaSourceInfoHolder, getupdatedmediaperiodinfo, notifyqueueupdate, getnextmediaperiodinfo, settilecounthorizontal, setsamplerate, i, i2, executor);
            this.MediaBrowserCompatItemReceiver = true;
            setTileCountVertical<TranscodeType> settilecountvertical2 = this.MediaBrowserCompatMediaItem;
            enqueueNextMediaPeriodHolder enqueuenextmediaperiodholderIconCompatParcelizer = settilecountvertical2.IconCompatParcelizer(obj, mediaSourceInfoHolder, getupdatedmediaperiodinfo, getnextmediaperiodinfo, settilecounthorizontal2, setsamplerate2, i3, i4, settilecountvertical2, executor);
            this.MediaBrowserCompatItemReceiver = false;
            getnextmediaperiodinfo.RemoteActionCompatParcelizer(enqueuenextmediaperiodholderWrite, enqueuenextmediaperiodholderIconCompatParcelizer);
            return getnextmediaperiodinfo;
        }
        return write(obj, mediaSourceInfoHolder, getupdatedmediaperiodinfo, notifyqueueupdate, updateforplaybackmodechange, settilecounthorizontal, setsamplerate, i, i2, executor);
    }

    private enqueueNextMediaPeriodHolder write(Object obj, MediaSourceInfoHolder<TranscodeType> mediaSourceInfoHolder, getUpdatedMediaPeriodInfo<TranscodeType> getupdatedmediaperiodinfo, notifyQueueUpdate<?> notifyqueueupdate, updateForPlaybackModeChange updateforplaybackmodechange, setTileCountHorizontal<?, ? super TranscodeType> settilecounthorizontal, setSampleRate setsamplerate, int i, int i2, Executor executor) {
        Context context = this.write;
        setRotationDegrees setrotationdegrees = this.AudioAttributesCompatParcelizer;
        return getReadingPeriod.AudioAttributesCompatParcelizer(context, setrotationdegrees, obj, this.AudioAttributesImplApi21Parcelizer, this.MediaMetadataCompat, notifyqueueupdate, i, i2, setsamplerate, mediaSourceInfoHolder, getupdatedmediaperiodinfo, this.MediaBrowserCompatCustomActionResultReceiver, updateforplaybackmodechange, setrotationdegrees.RemoteActionCompatParcelizer(), settilecounthorizontal.AudioAttributesCompatParcelizer(), executor);
    }

    @Override // kotlin.notifyQueueUpdate
    public boolean equals(Object obj) {
        if (!(obj instanceof setTileCountVertical)) {
            return false;
        }
        setTileCountVertical settilecountvertical = (setTileCountVertical) obj;
        if (!super.equals(settilecountvertical) || !Objects.equals(this.MediaMetadataCompat, settilecountvertical.MediaMetadataCompat) || !this.MediaBrowserCompatSearchResultReceiver.equals(settilecountvertical.MediaBrowserCompatSearchResultReceiver) || !Objects.equals(this.AudioAttributesImplApi21Parcelizer, settilecountvertical.AudioAttributesImplApi21Parcelizer) || !Objects.equals(this.MediaBrowserCompatCustomActionResultReceiver, settilecountvertical.MediaBrowserCompatCustomActionResultReceiver) || !Objects.equals(this.MediaBrowserCompatMediaItem, settilecountvertical.MediaBrowserCompatMediaItem) || !Objects.equals(this.RemoteActionCompatParcelizer, settilecountvertical.RemoteActionCompatParcelizer)) {
            return false;
        }
        Float f = settilecountvertical.RatingCompat;
        return this.read == settilecountvertical.read && this.AudioAttributesImplBaseParcelizer == settilecountvertical.AudioAttributesImplBaseParcelizer;
    }

    @Override // kotlin.notifyQueueUpdate
    public int hashCode() {
        return moveMediaSourceRange.write(this.AudioAttributesImplBaseParcelizer, moveMediaSourceRange.write(this.read, moveMediaSourceRange.write(this.RatingCompat, moveMediaSourceRange.write(this.RemoteActionCompatParcelizer, moveMediaSourceRange.write(this.MediaBrowserCompatMediaItem, moveMediaSourceRange.write(this.MediaBrowserCompatCustomActionResultReceiver, moveMediaSourceRange.write(this.AudioAttributesImplApi21Parcelizer, moveMediaSourceRange.write(this.MediaBrowserCompatSearchResultReceiver, moveMediaSourceRange.write(this.MediaMetadataCompat, super.hashCode())))))))));
    }
}
