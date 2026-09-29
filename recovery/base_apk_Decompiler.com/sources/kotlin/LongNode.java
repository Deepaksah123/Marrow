package kotlin;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.media3.common.Metadata;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.MediaPeriodQueue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.BasicSerializerFactory;
import kotlin.JsonSerializableSchema;
import kotlin.PolymorphicTypeValidator;
import kotlin.PropertySerializerMapDouble;
import kotlin.SimpleValueInstantiators;
import kotlin.StdJdkSerializersAtomicIntegerSerializer;
import kotlin.StdKeySerializers;
import kotlin._constructSimple;
import kotlin._pojoEquals;
import kotlin._withArrayAddTailProperty;
import kotlin.buildIndexedListSerializer;
import kotlin.buildIterableSerializer;
import kotlin.buildMapEntrySerializer;
import kotlin.initExtraTracks;

/* JADX INFO: loaded from: classes2.dex */
final class LongNode implements Handler.Callback, StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer, _constructSimple.read, BasicSerializerFactory.read, SimpleValueInstantiators.AudioAttributesCompatParcelizer, buildMapEntrySerializer.IconCompatParcelizer {
    private static final long IconCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(10000L);
    private final long AudioAttributesCompatParcelizer;
    private final _findPrimitive AudioAttributesImplApi21Parcelizer;
    private final boolean AudioAttributesImplApi26Parcelizer;
    private final _usesExternalId AudioAttributesImplBaseParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private final BasicSerializerFactory MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final _childrenEqual MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private final PolymorphicTypeValidator.IconCompatParcelizer MediaSessionCompatQueueItem;
    private boolean MediaSessionCompatResultReceiverWrapper;
    private long MediaSessionCompatToken;
    private final _constructSimple ParcelableVolumeInfo;
    private boolean PlaybackStateCompat;
    private final HandlerThread RatingCompat;
    private final buildTypeDeserializer RemoteActionCompatParcelizer;
    private final _withArrayAddTailProperty handleMediaPlayPauseIfPendingOnHandler;
    private final SimpleValueInstantiators onAddQueueItem;
    private int onCommand;
    private boolean onCustomAction;
    private AudioAttributesImplApi26Parcelizer onFastForward;
    private final ArrayList<IconCompatParcelizer> onMediaButtonEvent;
    private boolean onPause;
    private boolean onPlay;
    private addNull onPlayFromMediaId;
    private write onPlayFromSearch;
    private buildEnumSetSerializer onPlayFromUri;
    private final PolymorphicTypeValidator.AudioAttributesCompatParcelizer onPrepare;
    private final Looper onPrepareFromMediaId;
    private final read onPrepareFromSearch;
    private ExoPlayer.IconCompatParcelizer onRemoveQueueItem;
    private final modifyArraySerializer onRemoveQueueItemAt;
    private final TextNode onRewind;
    private final long onSeekTo;
    private final buildIterableSerializer[] onSetCaptioningEnabled;
    private long onSetPlaybackSpeed;
    private final buildIndexedListSerializer[] onSetRating;
    private boolean onSetRepeatMode;
    private long onSetShuffleMode;
    private int onSkipToNext;
    private final boolean onSkipToPrevious;
    private createKeySerializer onSkipToQueueItem;
    private final Set<buildIndexedListSerializer> onStop;
    private boolean read;
    private boolean setSessionImpl;
    private final _fromWellKnownInterface write;
    private long onPrepareFromUri = C.TIME_UNSET;
    private long MediaBrowserCompatSearchResultReceiver = C.TIME_UNSET;
    private PolymorphicTypeValidator MediaBrowserCompatMediaItem = PolymorphicTypeValidator.RemoteActionCompatParcelizer;

    static class RemoteActionCompatParcelizer {
        public final int AudioAttributesCompatParcelizer;
        public final ToStringSerializerBase IconCompatParcelizer;
        public final int RemoteActionCompatParcelizer;
        public final int read;
    }

    public interface read {
        void read(write writeVar);
    }

    static /* synthetic */ boolean IconCompatParcelizer(LongNode longNode) {
        longNode.setSessionImpl = true;
        return true;
    }

    public static final class write {
        public int AudioAttributesCompatParcelizer;
        private boolean IconCompatParcelizer;
        public int RemoteActionCompatParcelizer;
        public boolean read;
        public buildEnumSetSerializer write;

        public write(buildEnumSetSerializer buildenumsetserializer) {
            this.write = buildenumsetserializer;
        }

        public final void write(int i) {
            this.IconCompatParcelizer |= i > 0;
            this.RemoteActionCompatParcelizer += i;
        }

        public final void read(buildEnumSetSerializer buildenumsetserializer) {
            this.IconCompatParcelizer |= this.write != buildenumsetserializer;
            this.write = buildenumsetserializer;
        }

        public final void AudioAttributesCompatParcelizer(int i) {
            if (this.read && this.AudioAttributesCompatParcelizer != 5) {
                buildTypeSerializer.IconCompatParcelizer(i == 5);
                return;
            }
            this.IconCompatParcelizer = true;
            this.read = true;
            this.AudioAttributesCompatParcelizer = i;
        }
    }

    public LongNode(buildIndexedListSerializer[] buildindexedlistserializerArr, _constructSimple _constructsimple, _findPrimitive _findprimitive, _withArrayAddTailProperty _witharrayaddtailproperty, _fromWellKnownInterface _fromwellknowninterface, int i, boolean z, findSerializerByPrimaryType findserializerbyprimarytype, createKeySerializer createkeyserializer, _childrenEqual _childrenequal, long j, boolean z2, boolean z3, Looper looper, buildTypeDeserializer buildtypedeserializer, read readVar, modifyArraySerializer modifyarrayserializer, Looper looper2, ExoPlayer.IconCompatParcelizer iconCompatParcelizer) {
        this.onPrepareFromSearch = readVar;
        this.onSetRating = buildindexedlistserializerArr;
        this.ParcelableVolumeInfo = _constructsimple;
        this.AudioAttributesImplApi21Parcelizer = _findprimitive;
        this.handleMediaPlayPauseIfPendingOnHandler = _witharrayaddtailproperty;
        this.write = _fromwellknowninterface;
        this.onSkipToNext = i;
        this.MediaSessionCompatResultReceiverWrapper = z;
        this.onSkipToQueueItem = createkeyserializer;
        this.MediaDescriptionCompat = _childrenequal;
        this.onSeekTo = j;
        this.MediaSessionCompatToken = j;
        this.onPlay = z2;
        this.AudioAttributesImplApi26Parcelizer = z3;
        this.RemoteActionCompatParcelizer = buildtypedeserializer;
        this.onRemoveQueueItemAt = modifyarrayserializer;
        this.onRemoveQueueItem = iconCompatParcelizer;
        this.AudioAttributesCompatParcelizer = _witharrayaddtailproperty.IconCompatParcelizer();
        this.onSkipToPrevious = _witharrayaddtailproperty.write();
        buildEnumSetSerializer buildenumsetserializerIconCompatParcelizer = buildEnumSetSerializer.IconCompatParcelizer(_findprimitive);
        this.onPlayFromUri = buildenumsetserializerIconCompatParcelizer;
        this.onPlayFromSearch = new write(buildenumsetserializerIconCompatParcelizer);
        this.onSetCaptioningEnabled = new buildIterableSerializer[buildindexedlistserializerArr.length];
        buildIterableSerializer.write writeVarRemoteActionCompatParcelizer = _constructsimple.RemoteActionCompatParcelizer();
        for (int i2 = 0; i2 < buildindexedlistserializerArr.length; i2++) {
            buildindexedlistserializerArr[i2].write(i2, modifyarrayserializer, buildtypedeserializer);
            this.onSetCaptioningEnabled[i2] = buildindexedlistserializerArr[i2].write();
            if (writeVarRemoteActionCompatParcelizer != null) {
                this.onSetCaptioningEnabled[i2].read(writeVarRemoteActionCompatParcelizer);
            }
        }
        this.onAddQueueItem = new SimpleValueInstantiators(this, buildtypedeserializer);
        this.onMediaButtonEvent = new ArrayList<>();
        this.onStop = modifyTrack.AudioAttributesCompatParcelizer();
        this.MediaSessionCompatQueueItem = new PolymorphicTypeValidator.IconCompatParcelizer();
        this.onPrepare = new PolymorphicTypeValidator.AudioAttributesCompatParcelizer();
        _constructsimple.IconCompatParcelizer(this, _fromwellknowninterface);
        this.read = true;
        _usesExternalId _usesexternalid = buildtypedeserializer.read(looper, null);
        this.onRewind = new TextNode(findserializerbyprimarytype, _usesexternalid, new _pojoEquals.write() { // from class: o.NullNode
            @Override // o._pojoEquals.write
            public final _pojoEquals write(POJONode pOJONode, long j2) {
                return this.write.read(pOJONode, j2);
            }
        }, iconCompatParcelizer);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new BasicSerializerFactory(this, findserializerbyprimarytype, _usesexternalid, modifyarrayserializer);
        if (looper2 != null) {
            this.RatingCompat = null;
            this.onPrepareFromMediaId = looper2;
        } else {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
            this.RatingCompat = handlerThread;
            handlerThread.start();
            this.onPrepareFromMediaId = handlerThread.getLooper();
        }
        this.AudioAttributesImplBaseParcelizer = buildtypedeserializer.read(this.onPrepareFromMediaId, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public _pojoEquals read(POJONode pOJONode, long j) {
        return new _pojoEquals(this.onSetCaptioningEnabled, j, this.ParcelableVolumeInfo, this.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer(), this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, pOJONode, this.AudioAttributesImplApi21Parcelizer);
    }

    public final void IconCompatParcelizer(long j) {
        this.MediaSessionCompatToken = j;
    }

    public final void MediaBrowserCompatCustomActionResultReceiver() {
        this.AudioAttributesImplBaseParcelizer.write(29).AudioAttributesCompatParcelizer();
    }

    public final void write(boolean z, int i, int i2) {
        this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(1, z ? 1 : 0, i | (i2 << 4)).AudioAttributesCompatParcelizer();
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(23, z ? 1 : 0, 0).AudioAttributesCompatParcelizer();
    }

    public final void RemoteActionCompatParcelizer(int i) {
        this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(11, i, 0).AudioAttributesCompatParcelizer();
    }

    public final void read(boolean z) {
        this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(12, z ? 1 : 0, 0).AudioAttributesCompatParcelizer();
    }

    public final void IconCompatParcelizer(ExoPlayer.IconCompatParcelizer iconCompatParcelizer) {
        this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(28, iconCompatParcelizer).AudioAttributesCompatParcelizer();
    }

    public final void RemoteActionCompatParcelizer(PolymorphicTypeValidator polymorphicTypeValidator, int i, long j) {
        this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(3, new AudioAttributesImplApi26Parcelizer(polymorphicTypeValidator, i, j)).AudioAttributesCompatParcelizer();
    }

    public final void RemoteActionCompatParcelizer(DefaultBaseTypeLimitingValidatorUnsafeBaseTypes defaultBaseTypeLimitingValidatorUnsafeBaseTypes) {
        this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(4, defaultBaseTypeLimitingValidatorUnsafeBaseTypes).AudioAttributesCompatParcelizer();
    }

    public final void IconCompatParcelizer(createKeySerializer createkeyserializer) {
        this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(5, createkeyserializer).AudioAttributesCompatParcelizer();
    }

    public final void AudioAttributesImplBaseParcelizer() {
        this.AudioAttributesImplBaseParcelizer.write(6).AudioAttributesCompatParcelizer();
    }

    public final void IconCompatParcelizer(List<BasicSerializerFactory.AudioAttributesCompatParcelizer> list, int i, long j, ToStringSerializerBase toStringSerializerBase) {
        this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(17, new AudioAttributesCompatParcelizer(list, toStringSerializerBase, i, j, (byte) 0)).AudioAttributesCompatParcelizer();
    }

    public final void RemoteActionCompatParcelizer(int i, List<BasicSerializerFactory.AudioAttributesCompatParcelizer> list, ToStringSerializerBase toStringSerializerBase) {
        this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(18, i, 0, new AudioAttributesCompatParcelizer(list, toStringSerializerBase, -1, C.TIME_UNSET, (byte) 0)).AudioAttributesCompatParcelizer();
    }

    public final void AudioAttributesCompatParcelizer(int i, int i2, ToStringSerializerBase toStringSerializerBase) {
        this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(20, i, i2, toStringSerializerBase).AudioAttributesCompatParcelizer();
    }

    public final void IconCompatParcelizer(ToStringSerializerBase toStringSerializerBase) {
        this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(21, toStringSerializerBase).AudioAttributesCompatParcelizer();
    }

    public final void read(int i, int i2, List<JsonSerializableSchema> list) {
        this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(27, i, i2, list).AudioAttributesCompatParcelizer();
    }

    @Override // o.buildMapEntrySerializer.IconCompatParcelizer
    public final void write(buildMapEntrySerializer buildmapentryserializer) {
        synchronized (this) {
            if (!this.onSetRepeatMode && this.onPrepareFromMediaId.getThread().isAlive()) {
                this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(14, buildmapentryserializer).AudioAttributesCompatParcelizer();
                return;
            }
            prune.RemoteActionCompatParcelizer("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            buildmapentryserializer.read(false);
        }
    }

    public final boolean write(boolean z) {
        synchronized (this) {
            if (!this.onSetRepeatMode && this.onPrepareFromMediaId.getThread().isAlive()) {
                if (z) {
                    this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(13, 1, 0).AudioAttributesCompatParcelizer();
                    return true;
                }
                final AtomicBoolean atomicBoolean = new AtomicBoolean();
                this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(13, 0, 0, atomicBoolean).AudioAttributesCompatParcelizer();
                RemoteActionCompatParcelizer(new parseUdtaMeta() { // from class: o.MissingNode
                    @Override // kotlin.parseUdtaMeta
                    public final Object get() {
                        return Boolean.valueOf(atomicBoolean.get());
                    }
                }, this.MediaSessionCompatToken);
                return atomicBoolean.get();
            }
            return true;
        }
    }

    public final boolean AudioAttributesImplApi26Parcelizer() {
        synchronized (this) {
            if (!this.onSetRepeatMode && this.onPrepareFromMediaId.getThread().isAlive()) {
                this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(7);
                RemoteActionCompatParcelizer(new parseUdtaMeta() { // from class: o.NumericNode
                    @Override // kotlin.parseUdtaMeta
                    public final Object get() {
                        return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
                    }
                }, this.onSeekTo);
                return this.onSetRepeatMode;
            }
            return true;
        }
    }

    final /* synthetic */ Boolean AudioAttributesCompatParcelizer() {
        return Boolean.valueOf(this.onSetRepeatMode);
    }

    public final Looper RemoteActionCompatParcelizer() {
        return this.onPrepareFromMediaId;
    }

    @Override // o.BasicSerializerFactory.read
    public final void read() {
        this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(2);
        this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(22);
    }

    @Override // o.StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer
    public final void write(StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer) {
        this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(8, stdJdkSerializersAtomicIntegerSerializer).AudioAttributesCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.UUIDSerializer.RemoteActionCompatParcelizer
    public void RemoteActionCompatParcelizer(StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer) {
        this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(9, stdJdkSerializersAtomicIntegerSerializer).AudioAttributesCompatParcelizer();
    }

    @Override // o._constructSimple.read
    public final void write() {
        this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(10);
    }

    @Override // o._constructSimple.read
    public final void IconCompatParcelizer() {
        this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(26);
    }

    @Override // o.SimpleValueInstantiators.AudioAttributesCompatParcelizer
    public final void AudioAttributesCompatParcelizer(DefaultBaseTypeLimitingValidatorUnsafeBaseTypes defaultBaseTypeLimitingValidatorUnsafeBaseTypes) {
        this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(16, defaultBaseTypeLimitingValidatorUnsafeBaseTypes).AudioAttributesCompatParcelizer();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        _pojoEquals _pojoequalsAudioAttributesImplBaseParcelizer;
        try {
            switch (message.what) {
                case 1:
                    RemoteActionCompatParcelizer(message.arg1 != 0, message.arg2 >> 4, true, message.arg2 & 15);
                    break;
                case 2:
                    RatingCompat();
                    break;
                case 3:
                    RemoteActionCompatParcelizer((AudioAttributesImplApi26Parcelizer) message.obj);
                    break;
                case 4:
                    IconCompatParcelizer((DefaultBaseTypeLimitingValidatorUnsafeBaseTypes) message.obj);
                    break;
                case 5:
                    write((createKeySerializer) message.obj);
                    break;
                case 6:
                    IconCompatParcelizer(false, true);
                    break;
                case 7:
                    onRewind();
                    return true;
                case 8:
                    AudioAttributesCompatParcelizer((StdJdkSerializersAtomicIntegerSerializer) message.obj);
                    break;
                case 9:
                    IconCompatParcelizer((StdJdkSerializersAtomicIntegerSerializer) message.obj);
                    break;
                case 10:
                    onRemoveQueueItemAt();
                    break;
                case 11:
                    IconCompatParcelizer(message.arg1);
                    break;
                case 12:
                    AudioAttributesImplApi26Parcelizer(message.arg1 != 0);
                    break;
                case 13:
                    AudioAttributesCompatParcelizer(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    AudioAttributesCompatParcelizer((buildMapEntrySerializer) message.obj);
                    break;
                case 15:
                    AudioAttributesImplBaseParcelizer((buildMapEntrySerializer) message.obj);
                    break;
                case 16:
                    write((DefaultBaseTypeLimitingValidatorUnsafeBaseTypes) message.obj, false);
                    break;
                case 17:
                    read((AudioAttributesCompatParcelizer) message.obj);
                    break;
                case 18:
                    RemoteActionCompatParcelizer((AudioAttributesCompatParcelizer) message.obj, message.arg1);
                    break;
                case 19:
                    AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer) message.obj);
                    break;
                case 20:
                    write(message.arg1, message.arg2, (ToStringSerializerBase) message.obj);
                    break;
                case 21:
                    AudioAttributesCompatParcelizer((ToStringSerializerBase) message.obj);
                    break;
                case 22:
                    onPlayFromUri();
                    break;
                case 23:
                    MediaBrowserCompatCustomActionResultReceiver(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    MediaBrowserCompatItemReceiver();
                    break;
                case 26:
                    onRemoveQueueItem();
                    break;
                case 27:
                    write(message.arg1, message.arg2, (List<JsonSerializableSchema>) message.obj);
                    break;
                case 28:
                    RemoteActionCompatParcelizer((ExoPlayer.IconCompatParcelizer) message.obj);
                    break;
                case 29:
                    onPrepareFromMediaId();
                    break;
            }
        } catch (RuntimeException e) {
            addNull addnullRemoteActionCompatParcelizer = addNull.RemoteActionCompatParcelizer(e, ((e instanceof IllegalStateException) || (e instanceof IllegalArgumentException)) ? 1004 : 1000);
            prune.read("ExoPlayerImplInternal", "Playback error", addnullRemoteActionCompatParcelizer);
            IconCompatParcelizer(true, false);
            this.onPlayFromUri = this.onPlayFromUri.RemoteActionCompatParcelizer(addnullRemoteActionCompatParcelizer);
        } catch (NumberSerializersBase e2) {
            read(e2, 1002);
        } catch (PropertySerializerMapDouble.IconCompatParcelizer e3) {
            read(e3, e3.RemoteActionCompatParcelizer);
        } catch (SchemaAware e4) {
            if (e4.write == 1) {
                i = e4.IconCompatParcelizer ? 3001 : 3003;
            } else if (e4.write == 4) {
                i = e4.IconCompatParcelizer ? 3002 : 3004;
            }
            read(e4, i);
        } catch (idResolver e5) {
            read(e5, e5.read);
        } catch (IOException e6) {
            read(e6, 2000);
        } catch (addNull e7) {
            addNull addnullRemoteActionCompatParcelizer2 = e7;
            if (addnullRemoteActionCompatParcelizer2.AudioAttributesImplApi26Parcelizer == 1 && (_pojoequalsAudioAttributesImplBaseParcelizer = this.onRewind.AudioAttributesImplBaseParcelizer()) != null) {
                addnullRemoteActionCompatParcelizer2 = addnullRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer(_pojoequalsAudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer);
            }
            if (addnullRemoteActionCompatParcelizer2.AudioAttributesCompatParcelizer && (this.onPlayFromMediaId == null || addnullRemoteActionCompatParcelizer2.IconCompatParcelizer == 5004 || addnullRemoteActionCompatParcelizer2.IconCompatParcelizer == 5003)) {
                prune.write("ExoPlayerImplInternal", "Recoverable renderer error", addnullRemoteActionCompatParcelizer2);
                addNull addnull = this.onPlayFromMediaId;
                if (addnull != null) {
                    addnull.addSuppressed(addnullRemoteActionCompatParcelizer2);
                    addnullRemoteActionCompatParcelizer2 = this.onPlayFromMediaId;
                } else {
                    this.onPlayFromMediaId = addnullRemoteActionCompatParcelizer2;
                }
                _usesExternalId _usesexternalid = this.AudioAttributesImplBaseParcelizer;
                _usesexternalid.RemoteActionCompatParcelizer(_usesexternalid.AudioAttributesCompatParcelizer(25, addnullRemoteActionCompatParcelizer2));
            } else {
                addNull addnull2 = this.onPlayFromMediaId;
                if (addnull2 != null) {
                    addnull2.addSuppressed(addnullRemoteActionCompatParcelizer2);
                    addnullRemoteActionCompatParcelizer2 = this.onPlayFromMediaId;
                }
                addNull addnull3 = addnullRemoteActionCompatParcelizer2;
                prune.read("ExoPlayerImplInternal", "Playback error", addnull3);
                if (addnull3.AudioAttributesImplApi26Parcelizer == 1 && this.onRewind.read() != this.onRewind.AudioAttributesImplBaseParcelizer()) {
                    while (this.onRewind.read() != this.onRewind.AudioAttributesImplBaseParcelizer()) {
                        this.onRewind.write();
                    }
                    _pojoEquals _pojoequals = (_pojoEquals) buildTypeSerializer.IconCompatParcelizer(this.onRewind.read());
                    onAddQueueItem();
                    this.onPlayFromUri = write(_pojoequals.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, _pojoequals.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer, _pojoequals.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer, _pojoequals.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer, true, 0);
                }
                IconCompatParcelizer(true, false);
                this.onPlayFromUri = this.onPlayFromUri.RemoteActionCompatParcelizer(addnull3);
            }
        }
        onAddQueueItem();
        return true;
    }

    private void read(IOException iOException, int i) {
        addNull addnullWrite = addNull.write(iOException, i);
        _pojoEquals _pojoequals = this.onRewind.read();
        if (_pojoequals != null) {
            addnullWrite = addnullWrite.RemoteActionCompatParcelizer(_pojoequals.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer);
        }
        prune.read("ExoPlayerImplInternal", "Playback error", addnullWrite);
        IconCompatParcelizer(false, false);
        this.onPlayFromUri = this.onPlayFromUri.RemoteActionCompatParcelizer(addnullWrite);
    }

    private void RemoteActionCompatParcelizer(parseUdtaMeta<Boolean> parseudtameta, long j) {
        synchronized (this) {
            long jRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            boolean z = false;
            long jRemoteActionCompatParcelizer2 = j;
            while (!parseudtameta.get().booleanValue() && jRemoteActionCompatParcelizer2 > 0) {
                try {
                    wait(jRemoteActionCompatParcelizer2);
                } catch (InterruptedException unused) {
                    z = true;
                }
                jRemoteActionCompatParcelizer2 = (jRemoteActionCompatParcelizer + j) - this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private void write(int i) {
        if (this.onPlayFromUri.MediaBrowserCompatItemReceiver != i) {
            if (i != 2) {
                this.onPrepareFromUri = C.TIME_UNSET;
            }
            this.onPlayFromUri = this.onPlayFromUri.read(i);
        }
    }

    private void onAddQueueItem() {
        this.onPlayFromSearch.read(this.onPlayFromUri);
        if (this.onPlayFromSearch.IconCompatParcelizer) {
            this.onPrepareFromSearch.read(this.onPlayFromSearch);
            this.onPlayFromSearch = new write(this.onPlayFromUri);
        }
    }

    private void onPrepareFromMediaId() {
        this.onPlayFromSearch.write(1);
        AudioAttributesCompatParcelizer(false, false, false, true);
        this.handleMediaPlayPauseIfPendingOnHandler.write(this.onRemoveQueueItemAt);
        write(this.onPlayFromUri.onAddQueueItem.RemoteActionCompatParcelizer() ? 4 : 2);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read(this.write.RemoteActionCompatParcelizer());
        this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(2);
    }

    private void read(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) throws Throwable {
        this.onPlayFromSearch.write(1);
        if (audioAttributesCompatParcelizer.RemoteActionCompatParcelizer != -1) {
            this.onFastForward = new AudioAttributesImplApi26Parcelizer(new buildMapSerializer(audioAttributesCompatParcelizer.read, audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer), audioAttributesCompatParcelizer.RemoteActionCompatParcelizer, audioAttributesCompatParcelizer.write);
        }
        RemoteActionCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read(audioAttributesCompatParcelizer.read, audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer), false);
    }

    private void RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, int i) throws Throwable {
        this.onPlayFromSearch.write(1);
        BasicSerializerFactory basicSerializerFactory = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (i == -1) {
            i = basicSerializerFactory.read();
        }
        RemoteActionCompatParcelizer(basicSerializerFactory.RemoteActionCompatParcelizer(i, audioAttributesCompatParcelizer.read, audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer), false);
    }

    private void AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) throws Throwable {
        this.onPlayFromSearch.write(1);
        RemoteActionCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(remoteActionCompatParcelizer.read, remoteActionCompatParcelizer.RemoteActionCompatParcelizer, remoteActionCompatParcelizer.AudioAttributesCompatParcelizer, remoteActionCompatParcelizer.IconCompatParcelizer), false);
    }

    private void write(int i, int i2, ToStringSerializerBase toStringSerializerBase) throws Throwable {
        this.onPlayFromSearch.write(1);
        RemoteActionCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer(i, i2, toStringSerializerBase), false);
    }

    private void onPlayFromUri() throws Throwable {
        RemoteActionCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(), true);
    }

    private void AudioAttributesCompatParcelizer(ToStringSerializerBase toStringSerializerBase) throws Throwable {
        this.onPlayFromSearch.write(1);
        RemoteActionCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(toStringSerializerBase), false);
    }

    private void write(int i, int i2, List<JsonSerializableSchema> list) throws Throwable {
        this.onPlayFromSearch.write(1);
        RemoteActionCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(i, i2, list), false);
    }

    private void onPrepareFromSearch() {
        for (_pojoEquals _pojoequalsRemoteActionCompatParcelizer = this.onRewind.read(); _pojoequalsRemoteActionCompatParcelizer != null; _pojoequalsRemoteActionCompatParcelizer = _pojoequalsRemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) {
            for (_verifyAndResolvePlaceholders _verifyandresolveplaceholders : _pojoequalsRemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer().write) {
            }
        }
    }

    private void RemoteActionCompatParcelizer(boolean z, int i, boolean z2, int i2) throws addNull {
        this.onPlayFromSearch.write(z2 ? 1 : 0);
        this.onPlayFromUri = this.onPlayFromUri.AudioAttributesCompatParcelizer(z, i2, i);
        read(false, false);
        onPrepareFromSearch();
        if (!onSetShuffleMode()) {
            onSkipToPrevious();
            onStop();
        } else if (this.onPlayFromUri.MediaBrowserCompatItemReceiver == 3) {
            this.onAddQueueItem.RemoteActionCompatParcelizer();
            onSetCaptioningEnabled();
            this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(2);
        } else if (this.onPlayFromUri.MediaBrowserCompatItemReceiver == 2) {
            this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(2);
        }
    }

    private void MediaBrowserCompatCustomActionResultReceiver(boolean z) throws addNull {
        this.onPlay = z;
        onSetRepeatMode();
        if (!this.onPause || this.onRewind.AudioAttributesImplBaseParcelizer() == this.onRewind.read()) {
            return;
        }
        MediaBrowserCompatItemReceiver(true);
        IconCompatParcelizer(false);
    }

    private void AudioAttributesImplBaseParcelizer(boolean z) {
        if (z != this.onCustomAction) {
            this.onCustomAction = z;
            if (z || !this.onPlayFromUri.MediaBrowserCompatMediaItem) {
                return;
            }
            this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(2);
        }
    }

    private void IconCompatParcelizer(int i) throws addNull {
        this.onSkipToNext = i;
        if (!this.onRewind.AudioAttributesCompatParcelizer(this.onPlayFromUri.onAddQueueItem, i)) {
            MediaBrowserCompatItemReceiver(true);
        }
        IconCompatParcelizer(false);
    }

    private void AudioAttributesImplApi26Parcelizer(boolean z) throws addNull {
        this.MediaSessionCompatResultReceiverWrapper = z;
        if (!this.onRewind.AudioAttributesCompatParcelizer(this.onPlayFromUri.onAddQueueItem, z)) {
            MediaBrowserCompatItemReceiver(true);
        }
        IconCompatParcelizer(false);
    }

    private void RemoteActionCompatParcelizer(ExoPlayer.IconCompatParcelizer iconCompatParcelizer) {
        this.onRemoveQueueItem = iconCompatParcelizer;
        this.onRewind.read(this.onPlayFromUri.onAddQueueItem, iconCompatParcelizer);
    }

    private void MediaBrowserCompatItemReceiver(boolean z) throws addNull {
        StdKeySerializers.write writeVar = this.onRewind.read().AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        long j = read(writeVar, this.onPlayFromUri.RatingCompat, true, false);
        if (j != this.onPlayFromUri.RatingCompat) {
            this.onPlayFromUri = write(writeVar, j, this.onPlayFromUri.MediaMetadataCompat, this.onPlayFromUri.AudioAttributesCompatParcelizer, z, 5);
        }
    }

    private void onSetCaptioningEnabled() throws addNull {
        _pojoEquals _pojoequals = this.onRewind.read();
        if (_pojoequals != null) {
            _findPrimitive _findprimitiveAudioAttributesImplBaseParcelizer = _pojoequals.AudioAttributesImplBaseParcelizer();
            for (int i = 0; i < this.onSetRating.length; i++) {
                if (_findprimitiveAudioAttributesImplBaseParcelizer.IconCompatParcelizer(i) && this.onSetRating[i].RatingCompat() == 1) {
                    this.onSetRating[i].onPrepare();
                }
            }
        }
    }

    private void onSkipToPrevious() throws addNull {
        this.onAddQueueItem.write();
        for (buildIndexedListSerializer buildindexedlistserializer : this.onSetRating) {
            if (IconCompatParcelizer(buildindexedlistserializer)) {
                read(buildindexedlistserializer);
            }
        }
    }

    private void MediaBrowserCompatItemReceiver() throws addNull {
        onRemoveQueueItem();
    }

    private void onStop() throws addNull {
        _pojoEquals _pojoequals = this.onRewind.read();
        if (_pojoequals != null) {
            long jE_ = _pojoequals.write ? _pojoequals.IconCompatParcelizer.E_() : -9223372036854775807L;
            if (jE_ != C.TIME_UNSET) {
                if (!_pojoequals.MediaBrowserCompatCustomActionResultReceiver()) {
                    this.onRewind.read(_pojoequals);
                    IconCompatParcelizer(false);
                    handleMediaPlayPauseIfPendingOnHandler();
                }
                AudioAttributesCompatParcelizer(jE_);
                if (jE_ != this.onPlayFromUri.RatingCompat) {
                    this.onPlayFromUri = write(this.onPlayFromUri.RemoteActionCompatParcelizer, jE_, this.onPlayFromUri.MediaMetadataCompat, jE_, true, 5);
                }
            } else {
                long jIconCompatParcelizer = this.onAddQueueItem.IconCompatParcelizer(_pojoequals != this.onRewind.AudioAttributesImplBaseParcelizer());
                this.onSetShuffleMode = jIconCompatParcelizer;
                long jRemoteActionCompatParcelizer = _pojoequals.RemoteActionCompatParcelizer(jIconCompatParcelizer);
                IconCompatParcelizer(this.onPlayFromUri.RatingCompat, jRemoteActionCompatParcelizer);
                if (this.onAddQueueItem.AudioAttributesCompatParcelizer()) {
                    this.onPlayFromUri = write(this.onPlayFromUri.RemoteActionCompatParcelizer, jRemoteActionCompatParcelizer, this.onPlayFromUri.MediaMetadataCompat, jRemoteActionCompatParcelizer, !this.onPlayFromSearch.read, 6);
                } else {
                    this.onPlayFromUri.IconCompatParcelizer(jRemoteActionCompatParcelizer);
                }
            }
            this.onPlayFromUri.IconCompatParcelizer = this.onRewind.IconCompatParcelizer().IconCompatParcelizer();
            this.onPlayFromUri.onCustomAction = MediaDescriptionCompat();
            if (this.onPlayFromUri.MediaBrowserCompatCustomActionResultReceiver && this.onPlayFromUri.MediaBrowserCompatItemReceiver == 3 && IconCompatParcelizer(this.onPlayFromUri.onAddQueueItem, this.onPlayFromUri.RemoteActionCompatParcelizer) && this.onPlayFromUri.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer == 1.0f) {
                float f = this.MediaDescriptionCompat.read(MediaBrowserCompatMediaItem(), MediaDescriptionCompat());
                if (this.onAddQueueItem.IconCompatParcelizer().AudioAttributesCompatParcelizer != f) {
                    write(this.onPlayFromUri.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(f));
                    IconCompatParcelizer(this.onPlayFromUri.AudioAttributesImplApi21Parcelizer, this.onAddQueueItem.IconCompatParcelizer().AudioAttributesCompatParcelizer, false, false);
                }
            }
        }
    }

    private void write(DefaultBaseTypeLimitingValidatorUnsafeBaseTypes defaultBaseTypeLimitingValidatorUnsafeBaseTypes) {
        this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(16);
        this.onAddQueueItem.IconCompatParcelizer(defaultBaseTypeLimitingValidatorUnsafeBaseTypes);
    }

    private void onPrepare() {
        for (_pojoEquals _pojoequalsRemoteActionCompatParcelizer = this.onRewind.read(); _pojoequalsRemoteActionCompatParcelizer != null; _pojoequalsRemoteActionCompatParcelizer = _pojoequalsRemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) {
            for (_verifyAndResolvePlaceholders _verifyandresolveplaceholders : _pojoequalsRemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer().write) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void RatingCompat() throws kotlin.addNull, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.LongNode.RatingCompat():void");
    }

    private long MediaBrowserCompatMediaItem() {
        return read(this.onPlayFromUri.onAddQueueItem, this.onPlayFromUri.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer, this.onPlayFromUri.RatingCompat);
    }

    private long read(PolymorphicTypeValidator polymorphicTypeValidator, Object obj, long j) {
        polymorphicTypeValidator.RemoteActionCompatParcelizer(polymorphicTypeValidator.RemoteActionCompatParcelizer(obj, this.onPrepare).AudioAttributesImplBaseParcelizer, this.MediaSessionCompatQueueItem);
        return (this.MediaSessionCompatQueueItem.RatingCompat != C.TIME_UNSET && this.MediaSessionCompatQueueItem.AudioAttributesImplApi26Parcelizer() && this.MediaSessionCompatQueueItem.write) ? LaissezFaireSubTypeValidator.IconCompatParcelizer(this.MediaSessionCompatQueueItem.AudioAttributesCompatParcelizer() - this.MediaSessionCompatQueueItem.RatingCompat) - (j + this.onPrepare.IconCompatParcelizer()) : C.TIME_UNSET;
    }

    private boolean IconCompatParcelizer(PolymorphicTypeValidator polymorphicTypeValidator, StdKeySerializers.write writeVar) {
        if (writeVar.IconCompatParcelizer() || polymorphicTypeValidator.RemoteActionCompatParcelizer()) {
            return false;
        }
        polymorphicTypeValidator.RemoteActionCompatParcelizer(polymorphicTypeValidator.RemoteActionCompatParcelizer(writeVar.AudioAttributesCompatParcelizer, this.onPrepare).AudioAttributesImplBaseParcelizer, this.MediaSessionCompatQueueItem);
        return this.MediaSessionCompatQueueItem.AudioAttributesImplApi26Parcelizer() && this.MediaSessionCompatQueueItem.write && this.MediaSessionCompatQueueItem.RatingCompat != C.TIME_UNSET;
    }

    private void read(long j) {
        long jMin = (this.onPlayFromUri.MediaBrowserCompatItemReceiver != 3 || (!this.AudioAttributesImplApi26Parcelizer && onSetShuffleMode())) ? IconCompatParcelizer : 1000L;
        if (this.AudioAttributesImplApi26Parcelizer && onSetShuffleMode()) {
            for (buildIndexedListSerializer buildindexedlistserializer : this.onSetRating) {
                if (IconCompatParcelizer(buildindexedlistserializer)) {
                    jMin = Math.min(jMin, LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(buildindexedlistserializer.AudioAttributesCompatParcelizer(this.onSetShuffleMode, this.onSetPlaybackSpeed)));
                }
            }
        }
        this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(j + jMin);
    }

    private void RemoteActionCompatParcelizer(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) throws Throwable {
        long j;
        long j2;
        StdKeySerializers.write writeVar;
        boolean z;
        boolean z2;
        long j3;
        long j4;
        long jRemoteActionCompatParcelizer;
        boolean z3;
        long j5;
        this.onPlayFromSearch.write(1);
        Pair<Object, Long> pairWrite = write(this.onPlayFromUri.onAddQueueItem, audioAttributesImplApi26Parcelizer, true, this.onSkipToNext, this.MediaSessionCompatResultReceiverWrapper, this.MediaSessionCompatQueueItem, this.onPrepare);
        if (pairWrite == null) {
            Pair<StdKeySerializers.write, Long> pairAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.onPlayFromUri.onAddQueueItem);
            writeVar = (StdKeySerializers.write) pairAudioAttributesCompatParcelizer.first;
            long jLongValue = ((Long) pairAudioAttributesCompatParcelizer.second).longValue();
            z = !this.onPlayFromUri.onAddQueueItem.RemoteActionCompatParcelizer();
            j = jLongValue;
            j2 = -9223372036854775807L;
        } else {
            Object obj = pairWrite.first;
            long jLongValue2 = ((Long) pairWrite.second).longValue();
            long j6 = audioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer == C.TIME_UNSET ? -9223372036854775807L : jLongValue2;
            StdKeySerializers.write writeVarRemoteActionCompatParcelizer = this.onRewind.RemoteActionCompatParcelizer(this.onPlayFromUri.onAddQueueItem, obj, jLongValue2);
            if (writeVarRemoteActionCompatParcelizer.IconCompatParcelizer()) {
                this.onPlayFromUri.onAddQueueItem.RemoteActionCompatParcelizer(writeVarRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer, this.onPrepare);
                jLongValue2 = this.onPrepare.AudioAttributesCompatParcelizer(writeVarRemoteActionCompatParcelizer.write) == writeVarRemoteActionCompatParcelizer.read ? this.onPrepare.read() : 0L;
            } else if (audioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer != C.TIME_UNSET) {
                j = jLongValue2;
                j2 = j6;
                writeVar = writeVarRemoteActionCompatParcelizer;
                z = false;
            }
            j = jLongValue2;
            j2 = j6;
            writeVar = writeVarRemoteActionCompatParcelizer;
            z = true;
        }
        try {
            if (this.onPlayFromUri.onAddQueueItem.RemoteActionCompatParcelizer()) {
                this.onFastForward = audioAttributesImplApi26Parcelizer;
            } else if (pairWrite == null) {
                if (this.onPlayFromUri.MediaBrowserCompatItemReceiver != 1) {
                    write(4);
                }
                AudioAttributesCompatParcelizer(false, true, false, true);
            } else {
                try {
                    if (writeVar.equals(this.onPlayFromUri.RemoteActionCompatParcelizer)) {
                        _pojoEquals _pojoequals = this.onRewind.read();
                        j4 = (_pojoequals == null || !_pojoequals.write || j == 0) ? j : _pojoequals.IconCompatParcelizer.read(j, this.onSkipToQueueItem);
                        z2 = z;
                        try {
                            if (LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(j4) == LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(this.onPlayFromUri.RatingCompat)) {
                                if (this.onPlayFromUri.MediaBrowserCompatItemReceiver != 2) {
                                    if (this.onPlayFromUri.MediaBrowserCompatItemReceiver == 3) {
                                    }
                                }
                                j5 = this.onPlayFromUri.RatingCompat;
                                this.onPlayFromUri = write(writeVar, j5, j2, j5, z2, 2);
                            }
                        } catch (Throwable th) {
                            th = th;
                            j3 = j;
                            this.onPlayFromUri = write(writeVar, j3, j2, j3, z2, 2);
                            throw th;
                        }
                    } else {
                        z2 = z;
                        j4 = j;
                    }
                    RemoteActionCompatParcelizer(this.onPlayFromUri.onAddQueueItem, writeVar, this.onPlayFromUri.onAddQueueItem, this.onPlayFromUri.RemoteActionCompatParcelizer, j2, true);
                    z = z3;
                    j = jRemoteActionCompatParcelizer;
                } catch (Throwable th2) {
                    th = th2;
                    z2 = z3;
                    j3 = jRemoteActionCompatParcelizer;
                    this.onPlayFromUri = write(writeVar, j3, j2, j3, z2, 2);
                    throw th;
                }
                jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(writeVar, j4, this.onPlayFromUri.MediaBrowserCompatItemReceiver == 4);
                z3 = z2 | (j != jRemoteActionCompatParcelizer);
            }
            z2 = z;
            j5 = j;
            this.onPlayFromUri = write(writeVar, j5, j2, j5, z2, 2);
        } catch (Throwable th3) {
            th = th3;
            z2 = z;
        }
    }

    private long RemoteActionCompatParcelizer(StdKeySerializers.write writeVar, long j, boolean z) throws addNull {
        return read(writeVar, j, this.onRewind.read() != this.onRewind.AudioAttributesImplBaseParcelizer(), z);
    }

    private long read(StdKeySerializers.write writeVar, long j, boolean z, boolean z2) throws addNull {
        onSkipToPrevious();
        read(false, true);
        if (z2 || this.onPlayFromUri.MediaBrowserCompatItemReceiver == 3) {
            write(2);
        }
        _pojoEquals _pojoequals = this.onRewind.read();
        _pojoEquals _pojoequalsRemoteActionCompatParcelizer = _pojoequals;
        while (_pojoequalsRemoteActionCompatParcelizer != null && !writeVar.equals(_pojoequalsRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer)) {
            _pojoequalsRemoteActionCompatParcelizer = _pojoequalsRemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        }
        if (z || _pojoequals != _pojoequalsRemoteActionCompatParcelizer || (_pojoequalsRemoteActionCompatParcelizer != null && _pojoequalsRemoteActionCompatParcelizer.read(j) < 0)) {
            for (buildIndexedListSerializer buildindexedlistserializer : this.onSetRating) {
                write(buildindexedlistserializer);
            }
            if (_pojoequalsRemoteActionCompatParcelizer != null) {
                while (this.onRewind.read() != _pojoequalsRemoteActionCompatParcelizer) {
                    this.onRewind.write();
                }
                this.onRewind.read(_pojoequalsRemoteActionCompatParcelizer);
                _pojoequalsRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US);
                MediaBrowserCompatSearchResultReceiver();
            }
        }
        if (_pojoequalsRemoteActionCompatParcelizer != null) {
            this.onRewind.read(_pojoequalsRemoteActionCompatParcelizer);
            if (!_pojoequalsRemoteActionCompatParcelizer.write) {
                _pojoequalsRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer = _pojoequalsRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(j);
            } else if (_pojoequalsRemoteActionCompatParcelizer.RemoteActionCompatParcelizer) {
                long jWrite = _pojoequalsRemoteActionCompatParcelizer.IconCompatParcelizer.write(j);
                _pojoequalsRemoteActionCompatParcelizer.IconCompatParcelizer.IconCompatParcelizer(jWrite - this.AudioAttributesCompatParcelizer, this.onSkipToPrevious);
                j = jWrite;
            }
            AudioAttributesCompatParcelizer(j);
            handleMediaPlayPauseIfPendingOnHandler();
        } else {
            this.onRewind.AudioAttributesCompatParcelizer();
            AudioAttributesCompatParcelizer(j);
        }
        IconCompatParcelizer(false);
        this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(2);
        return j;
    }

    private void AudioAttributesCompatParcelizer(long j) throws addNull {
        _pojoEquals _pojoequals = this.onRewind.read();
        long j2 = _pojoequals == null ? j + MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US : _pojoequals.read(j);
        this.onSetShuffleMode = j2;
        this.onAddQueueItem.IconCompatParcelizer(j2);
        for (buildIndexedListSerializer buildindexedlistserializer : this.onSetRating) {
            if (IconCompatParcelizer(buildindexedlistserializer)) {
                buildindexedlistserializer.RemoteActionCompatParcelizer(this.onSetShuffleMode);
            }
        }
        onPlayFromSearch();
    }

    private void IconCompatParcelizer(DefaultBaseTypeLimitingValidatorUnsafeBaseTypes defaultBaseTypeLimitingValidatorUnsafeBaseTypes) throws addNull {
        write(defaultBaseTypeLimitingValidatorUnsafeBaseTypes);
        write(this.onAddQueueItem.IconCompatParcelizer(), true);
    }

    private void write(createKeySerializer createkeyserializer) {
        this.onSkipToQueueItem = createkeyserializer;
    }

    private void AudioAttributesCompatParcelizer(boolean z, AtomicBoolean atomicBoolean) {
        if (this.MediaBrowserCompatCustomActionResultReceiver != z) {
            this.MediaBrowserCompatCustomActionResultReceiver = z;
            if (!z) {
                for (buildIndexedListSerializer buildindexedlistserializer : this.onSetRating) {
                    if (!IconCompatParcelizer(buildindexedlistserializer) && this.onStop.remove(buildindexedlistserializer)) {
                        buildindexedlistserializer.onPrepareFromSearch();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void IconCompatParcelizer(boolean z, boolean z2) {
        AudioAttributesCompatParcelizer(z || !this.MediaBrowserCompatCustomActionResultReceiver, false, true, false);
        this.onPlayFromSearch.write(z2 ? 1 : 0);
        this.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(this.onRemoveQueueItemAt);
        write(1);
    }

    private void onRewind() {
        try {
            AudioAttributesCompatParcelizer(true, false, true, false);
            onPrepareFromUri();
            this.handleMediaPlayPauseIfPendingOnHandler.IconCompatParcelizer(this.onRemoveQueueItemAt);
            write(1);
            HandlerThread handlerThread = this.RatingCompat;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            synchronized (this) {
                this.onSetRepeatMode = true;
                notifyAll();
            }
        } catch (Throwable th) {
            HandlerThread handlerThread2 = this.RatingCompat;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            synchronized (this) {
                this.onSetRepeatMode = true;
                notifyAll();
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f3 A[PHI: r3
      0x00f3: PHI (r3v3 o.PolymorphicTypeValidator) = 
      (r3v2 o.PolymorphicTypeValidator)
      (r3v2 o.PolymorphicTypeValidator)
      (r3v7 o.PolymorphicTypeValidator)
      (r3v7 o.PolymorphicTypeValidator)
     binds: [B:31:0x00b4, B:33:0x00b8, B:35:0x00cd, B:37:0x00e4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void AudioAttributesCompatParcelizer(boolean r33, boolean r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.LongNode.AudioAttributesCompatParcelizer(boolean, boolean, boolean, boolean):void");
    }

    private Pair<StdKeySerializers.write, Long> AudioAttributesCompatParcelizer(PolymorphicTypeValidator polymorphicTypeValidator) {
        long j = 0;
        if (polymorphicTypeValidator.RemoteActionCompatParcelizer()) {
            return Pair.create(buildEnumSetSerializer.read(), 0L);
        }
        Pair<Object, Long> pairAudioAttributesCompatParcelizer = polymorphicTypeValidator.AudioAttributesCompatParcelizer(this.MediaSessionCompatQueueItem, this.onPrepare, polymorphicTypeValidator.RemoteActionCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper), C.TIME_UNSET);
        StdKeySerializers.write writeVarRemoteActionCompatParcelizer = this.onRewind.RemoteActionCompatParcelizer(polymorphicTypeValidator, pairAudioAttributesCompatParcelizer.first, 0L);
        long jLongValue = ((Long) pairAudioAttributesCompatParcelizer.second).longValue();
        if (writeVarRemoteActionCompatParcelizer.IconCompatParcelizer()) {
            polymorphicTypeValidator.RemoteActionCompatParcelizer(writeVarRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer, this.onPrepare);
            if (writeVarRemoteActionCompatParcelizer.read == this.onPrepare.AudioAttributesCompatParcelizer(writeVarRemoteActionCompatParcelizer.write)) {
                j = this.onPrepare.read();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(writeVarRemoteActionCompatParcelizer, Long.valueOf(j));
    }

    private void AudioAttributesCompatParcelizer(buildMapEntrySerializer buildmapentryserializer) throws addNull {
        if (buildmapentryserializer.read() == C.TIME_UNSET) {
            read(buildmapentryserializer);
            return;
        }
        if (this.onPlayFromUri.onAddQueueItem.RemoteActionCompatParcelizer()) {
            this.onMediaButtonEvent.add(new IconCompatParcelizer(buildmapentryserializer));
            return;
        }
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(buildmapentryserializer);
        if (IconCompatParcelizer(iconCompatParcelizer, this.onPlayFromUri.onAddQueueItem, this.onPlayFromUri.onAddQueueItem, this.onSkipToNext, this.MediaSessionCompatResultReceiverWrapper, this.MediaSessionCompatQueueItem, this.onPrepare)) {
            this.onMediaButtonEvent.add(iconCompatParcelizer);
            Collections.sort(this.onMediaButtonEvent);
        } else {
            buildmapentryserializer.read(false);
        }
    }

    private void read(buildMapEntrySerializer buildmapentryserializer) throws addNull {
        if (buildmapentryserializer.RemoteActionCompatParcelizer() == this.onPrepareFromMediaId) {
            IconCompatParcelizer(buildmapentryserializer);
            if (this.onPlayFromUri.MediaBrowserCompatItemReceiver == 3 || this.onPlayFromUri.MediaBrowserCompatItemReceiver == 2) {
                this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(2);
                return;
            }
            return;
        }
        this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(15, buildmapentryserializer).AudioAttributesCompatParcelizer();
    }

    private void AudioAttributesImplBaseParcelizer(final buildMapEntrySerializer buildmapentryserializer) {
        Looper looperRemoteActionCompatParcelizer = buildmapentryserializer.RemoteActionCompatParcelizer();
        if (!looperRemoteActionCompatParcelizer.getThread().isAlive()) {
            prune.RemoteActionCompatParcelizer("TAG", "Trying to send message on a dead thread.");
            buildmapentryserializer.read(false);
        } else {
            this.RemoteActionCompatParcelizer.read(looperRemoteActionCompatParcelizer, null).IconCompatParcelizer(new Runnable() { // from class: o.NodeSerialization
                @Override // java.lang.Runnable
                public final void run() {
                    LongNode.RemoteActionCompatParcelizer(buildmapentryserializer);
                }
            });
        }
    }

    static /* synthetic */ void RemoteActionCompatParcelizer(buildMapEntrySerializer buildmapentryserializer) {
        try {
            IconCompatParcelizer(buildmapentryserializer);
        } catch (addNull e) {
            prune.read("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    private static void IconCompatParcelizer(buildMapEntrySerializer buildmapentryserializer) throws addNull {
        buildmapentryserializer.MediaBrowserCompatCustomActionResultReceiver();
        try {
            buildmapentryserializer.MediaBrowserCompatItemReceiver().AudioAttributesCompatParcelizer(buildmapentryserializer.AudioAttributesImplApi26Parcelizer(), buildmapentryserializer.write());
        } finally {
            buildmapentryserializer.read(true);
        }
    }

    private void AudioAttributesCompatParcelizer(PolymorphicTypeValidator polymorphicTypeValidator, PolymorphicTypeValidator polymorphicTypeValidator2) {
        if (polymorphicTypeValidator.RemoteActionCompatParcelizer() && polymorphicTypeValidator2.RemoteActionCompatParcelizer()) {
            return;
        }
        for (int size = this.onMediaButtonEvent.size() - 1; size >= 0; size--) {
            if (!IconCompatParcelizer(this.onMediaButtonEvent.get(size), polymorphicTypeValidator, polymorphicTypeValidator2, this.onSkipToNext, this.MediaSessionCompatResultReceiverWrapper, this.MediaSessionCompatQueueItem, this.onPrepare)) {
                this.onMediaButtonEvent.get(size).IconCompatParcelizer.read(false);
                this.onMediaButtonEvent.remove(size);
            }
        }
        Collections.sort(this.onMediaButtonEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x007b, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void IconCompatParcelizer(long r8, long r10) throws kotlin.addNull {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.LongNode.IconCompatParcelizer(long, long):void");
    }

    private static void read(buildIndexedListSerializer buildindexedlistserializer) {
        if (buildindexedlistserializer.RatingCompat() == 2) {
            buildindexedlistserializer.onPrepareFromMediaId();
        }
    }

    private void write(buildIndexedListSerializer buildindexedlistserializer) throws addNull {
        if (IconCompatParcelizer(buildindexedlistserializer)) {
            this.onAddQueueItem.AudioAttributesCompatParcelizer(buildindexedlistserializer);
            read(buildindexedlistserializer);
            buildindexedlistserializer.y_();
            this.MediaBrowserCompatItemReceiver--;
        }
    }

    private void onRemoveQueueItem() throws addNull {
        onRemoveQueueItemAt();
        MediaBrowserCompatItemReceiver(true);
    }

    private void onRemoveQueueItemAt() throws addNull {
        float f = this.onAddQueueItem.IconCompatParcelizer().AudioAttributesCompatParcelizer;
        _pojoEquals _pojoequalsAudioAttributesImplBaseParcelizer = this.onRewind.AudioAttributesImplBaseParcelizer();
        _findPrimitive _findprimitive = null;
        boolean z = true;
        for (_pojoEquals _pojoequalsRemoteActionCompatParcelizer = this.onRewind.read(); _pojoequalsRemoteActionCompatParcelizer != null && _pojoequalsRemoteActionCompatParcelizer.write; _pojoequalsRemoteActionCompatParcelizer = _pojoequalsRemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) {
            _findPrimitive _findprimitiveIconCompatParcelizer = _pojoequalsRemoteActionCompatParcelizer.IconCompatParcelizer(f, this.onPlayFromUri.onAddQueueItem);
            if (_pojoequalsRemoteActionCompatParcelizer == this.onRewind.read()) {
                _findprimitive = _findprimitiveIconCompatParcelizer;
            }
            if (_findprimitiveIconCompatParcelizer.RemoteActionCompatParcelizer(_pojoequalsRemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer())) {
                if (_pojoequalsRemoteActionCompatParcelizer == _pojoequalsAudioAttributesImplBaseParcelizer) {
                    z = false;
                }
            } else {
                if (z) {
                    _pojoEquals _pojoequals = this.onRewind.read();
                    boolean z2 = this.onRewind.read(_pojoequals);
                    boolean[] zArr = new boolean[this.onSetRating.length];
                    long j = _pojoequals.read((_findPrimitive) buildTypeSerializer.IconCompatParcelizer(_findprimitive), this.onPlayFromUri.RatingCompat, z2, zArr);
                    boolean z3 = (this.onPlayFromUri.MediaBrowserCompatItemReceiver == 4 || j == this.onPlayFromUri.RatingCompat) ? false : true;
                    this.onPlayFromUri = write(this.onPlayFromUri.RemoteActionCompatParcelizer, j, this.onPlayFromUri.MediaMetadataCompat, this.onPlayFromUri.AudioAttributesCompatParcelizer, z3, 5);
                    if (z3) {
                        AudioAttributesCompatParcelizer(j);
                    }
                    boolean[] zArr2 = new boolean[this.onSetRating.length];
                    int i = 0;
                    while (true) {
                        buildIndexedListSerializer[] buildindexedlistserializerArr = this.onSetRating;
                        if (i >= buildindexedlistserializerArr.length) {
                            break;
                        }
                        buildIndexedListSerializer buildindexedlistserializer = buildindexedlistserializerArr[i];
                        zArr2[i] = IconCompatParcelizer(buildindexedlistserializer);
                        visitStringFormat visitstringformat = _pojoequals.AudioAttributesImplBaseParcelizer[i];
                        if (zArr2[i]) {
                            if (visitstringformat != buildindexedlistserializer.MediaBrowserCompatSearchResultReceiver()) {
                                write(buildindexedlistserializer);
                            } else if (zArr[i]) {
                                buildindexedlistserializer.RemoteActionCompatParcelizer(this.onSetShuffleMode);
                            }
                        }
                        i++;
                    }
                    AudioAttributesCompatParcelizer(zArr2, this.onSetShuffleMode);
                } else {
                    this.onRewind.read(_pojoequalsRemoteActionCompatParcelizer);
                    if (_pojoequalsRemoteActionCompatParcelizer.write) {
                        _pojoequalsRemoteActionCompatParcelizer.read(_findprimitiveIconCompatParcelizer, Math.max(_pojoequalsRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer, _pojoequalsRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.onSetShuffleMode)));
                    }
                }
                IconCompatParcelizer(true);
                if (this.onPlayFromUri.MediaBrowserCompatItemReceiver != 4) {
                    handleMediaPlayPauseIfPendingOnHandler();
                    onStop();
                    this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(2);
                    return;
                }
                return;
            }
        }
    }

    private void RemoteActionCompatParcelizer(float f) {
        for (_pojoEquals _pojoequalsRemoteActionCompatParcelizer = this.onRewind.read(); _pojoequalsRemoteActionCompatParcelizer != null; _pojoequalsRemoteActionCompatParcelizer = _pojoequalsRemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) {
            for (_verifyAndResolvePlaceholders _verifyandresolveplaceholders : _pojoequalsRemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer().write) {
                if (_verifyandresolveplaceholders != null) {
                    _verifyandresolveplaceholders.write(f);
                }
            }
        }
    }

    private void onPlayFromSearch() {
        for (_pojoEquals _pojoequalsRemoteActionCompatParcelizer = this.onRewind.read(); _pojoequalsRemoteActionCompatParcelizer != null; _pojoequalsRemoteActionCompatParcelizer = _pojoequalsRemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) {
            for (_verifyAndResolvePlaceholders _verifyandresolveplaceholders : _pojoequalsRemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer().write) {
            }
        }
    }

    private boolean AudioAttributesImplApi21Parcelizer(boolean z) {
        if (this.MediaBrowserCompatItemReceiver == 0) {
            return MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
        if (!z) {
            return false;
        }
        if (!this.onPlayFromUri.write) {
            return true;
        }
        _pojoEquals _pojoequals = this.onRewind.read();
        long j = IconCompatParcelizer(this.onPlayFromUri.onAddQueueItem, _pojoequals.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer) ? this.MediaDescriptionCompat.read() : C.TIME_UNSET;
        _pojoEquals _pojoequalsIconCompatParcelizer = this.onRewind.IconCompatParcelizer();
        return (_pojoequalsIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver() && _pojoequalsIconCompatParcelizer.AudioAttributesCompatParcelizer.IconCompatParcelizer) || (_pojoequalsIconCompatParcelizer.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.IconCompatParcelizer() && !_pojoequalsIconCompatParcelizer.write) || this.handleMediaPlayPauseIfPendingOnHandler.read(new _withArrayAddTailProperty.AudioAttributesCompatParcelizer(this.onRemoveQueueItemAt, this.onPlayFromUri.onAddQueueItem, _pojoequals.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, _pojoequals.RemoteActionCompatParcelizer(this.onSetShuffleMode), MediaDescriptionCompat(), this.onAddQueueItem.IconCompatParcelizer().AudioAttributesCompatParcelizer, this.onPlayFromUri.MediaBrowserCompatCustomActionResultReceiver, this.MediaMetadataCompat, j));
    }

    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        _pojoEquals _pojoequals = this.onRewind.read();
        long j = _pojoequals.AudioAttributesCompatParcelizer.read;
        if (_pojoequals.write) {
            return j == C.TIME_UNSET || this.onPlayFromUri.RatingCompat < j || !onSetShuffleMode();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void RemoteActionCompatParcelizer(kotlin.PolymorphicTypeValidator r29, boolean r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.LongNode.RemoteActionCompatParcelizer(o.PolymorphicTypeValidator, boolean):void");
    }

    private void RemoteActionCompatParcelizer(PolymorphicTypeValidator polymorphicTypeValidator, StdKeySerializers.write writeVar, PolymorphicTypeValidator polymorphicTypeValidator2, StdKeySerializers.write writeVar2, long j, boolean z) throws addNull {
        if (!IconCompatParcelizer(polymorphicTypeValidator, writeVar)) {
            DefaultBaseTypeLimitingValidatorUnsafeBaseTypes defaultBaseTypeLimitingValidatorUnsafeBaseTypes = writeVar.IconCompatParcelizer() ? DefaultBaseTypeLimitingValidatorUnsafeBaseTypes.write : this.onPlayFromUri.AudioAttributesImplApi21Parcelizer;
            if (this.onAddQueueItem.IconCompatParcelizer().equals(defaultBaseTypeLimitingValidatorUnsafeBaseTypes)) {
                return;
            }
            write(defaultBaseTypeLimitingValidatorUnsafeBaseTypes);
            IconCompatParcelizer(this.onPlayFromUri.AudioAttributesImplApi21Parcelizer, defaultBaseTypeLimitingValidatorUnsafeBaseTypes.AudioAttributesCompatParcelizer, false, false);
            return;
        }
        polymorphicTypeValidator.RemoteActionCompatParcelizer(polymorphicTypeValidator.RemoteActionCompatParcelizer(writeVar.AudioAttributesCompatParcelizer, this.onPrepare).AudioAttributesImplBaseParcelizer, this.MediaSessionCompatQueueItem);
        this.MediaDescriptionCompat.write((JsonSerializableSchema.AudioAttributesImplApi26Parcelizer) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.MediaSessionCompatQueueItem.AudioAttributesImplApi21Parcelizer));
        if (j != C.TIME_UNSET) {
            this.MediaDescriptionCompat.AudioAttributesCompatParcelizer(read(polymorphicTypeValidator, writeVar.AudioAttributesCompatParcelizer, j));
            return;
        }
        if (!LaissezFaireSubTypeValidator.read(!polymorphicTypeValidator2.RemoteActionCompatParcelizer() ? polymorphicTypeValidator2.RemoteActionCompatParcelizer(polymorphicTypeValidator2.RemoteActionCompatParcelizer(writeVar2.AudioAttributesCompatParcelizer, this.onPrepare).AudioAttributesImplBaseParcelizer, this.MediaSessionCompatQueueItem).MediaBrowserCompatSearchResultReceiver : null, this.MediaSessionCompatQueueItem.MediaBrowserCompatSearchResultReceiver) || z) {
            this.MediaDescriptionCompat.AudioAttributesCompatParcelizer(C.TIME_UNSET);
        }
    }

    private long MediaMetadataCompat() {
        _pojoEquals _pojoequalsAudioAttributesImplBaseParcelizer = this.onRewind.AudioAttributesImplBaseParcelizer();
        if (_pojoequalsAudioAttributesImplBaseParcelizer == null) {
            return 0L;
        }
        long jAudioAttributesCompatParcelizer = _pojoequalsAudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer();
        if (!_pojoequalsAudioAttributesImplBaseParcelizer.write) {
            return jAudioAttributesCompatParcelizer;
        }
        int i = 0;
        while (true) {
            buildIndexedListSerializer[] buildindexedlistserializerArr = this.onSetRating;
            if (i >= buildindexedlistserializerArr.length) {
                return jAudioAttributesCompatParcelizer;
            }
            if (IconCompatParcelizer(buildindexedlistserializerArr[i]) && this.onSetRating[i].MediaBrowserCompatSearchResultReceiver() == _pojoequalsAudioAttributesImplBaseParcelizer.AudioAttributesImplBaseParcelizer[i]) {
                long jMediaBrowserCompatItemReceiver = this.onSetRating[i].MediaBrowserCompatItemReceiver();
                if (jMediaBrowserCompatItemReceiver == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jAudioAttributesCompatParcelizer = Math.max(jMediaBrowserCompatItemReceiver, jAudioAttributesCompatParcelizer);
            }
            i++;
        }
    }

    private void onSkipToNext() throws addNull {
        if (this.onPlayFromUri.onAddQueueItem.RemoteActionCompatParcelizer() || !this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer()) {
            return;
        }
        boolean zOnPlay = onPlay();
        onPause();
        onFastForward();
        onMediaButtonEvent();
        AudioAttributesCompatParcelizer(zOnPlay);
    }

    private boolean onPlay() throws addNull {
        POJONode pOJONodeWrite;
        this.onRewind.read(this.onSetShuffleMode);
        boolean z = false;
        if (this.onRewind.MediaBrowserCompatItemReceiver() && (pOJONodeWrite = this.onRewind.write(this.onSetShuffleMode, this.onPlayFromUri)) != null) {
            _pojoEquals _pojoequalsAudioAttributesCompatParcelizer = this.onRewind.AudioAttributesCompatParcelizer(pOJONodeWrite);
            _pojoequalsAudioAttributesCompatParcelizer.IconCompatParcelizer.IconCompatParcelizer(this, pOJONodeWrite.AudioAttributesImplApi21Parcelizer);
            if (this.onRewind.read() == _pojoequalsAudioAttributesCompatParcelizer) {
                AudioAttributesCompatParcelizer(pOJONodeWrite.AudioAttributesImplApi21Parcelizer);
            }
            IconCompatParcelizer(false);
            z = true;
        }
        if (this.PlaybackStateCompat) {
            this.PlaybackStateCompat = onCommand();
            onSkipToQueueItem();
            return z;
        }
        handleMediaPlayPauseIfPendingOnHandler();
        return z;
    }

    private void onPause() throws addNull {
        _pojoEquals _pojoequalsAudioAttributesImplBaseParcelizer = this.onRewind.AudioAttributesImplBaseParcelizer();
        if (_pojoequalsAudioAttributesImplBaseParcelizer == null) {
            return;
        }
        int i = 0;
        if (_pojoequalsAudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer() == null || this.onPause) {
            if (!_pojoequalsAudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer.IconCompatParcelizer && !this.onPause) {
                return;
            }
            while (true) {
                buildIndexedListSerializer[] buildindexedlistserializerArr = this.onSetRating;
                if (i >= buildindexedlistserializerArr.length) {
                    return;
                }
                buildIndexedListSerializer buildindexedlistserializer = buildindexedlistserializerArr[i];
                visitStringFormat visitstringformat = _pojoequalsAudioAttributesImplBaseParcelizer.AudioAttributesImplBaseParcelizer[i];
                if (visitstringformat != null && buildindexedlistserializer.MediaBrowserCompatSearchResultReceiver() == visitstringformat && buildindexedlistserializer.MediaMetadataCompat()) {
                    read(buildindexedlistserializer, (_pojoequalsAudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer.read == C.TIME_UNSET || _pojoequalsAudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer.read == Long.MIN_VALUE) ? -9223372036854775807L : _pojoequalsAudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer() + _pojoequalsAudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer.read);
                }
                i++;
            }
        } else if (onCustomAction()) {
            if (_pojoequalsAudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer().write || this.onSetShuffleMode >= _pojoequalsAudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer().read()) {
                _findPrimitive _findprimitiveAudioAttributesImplBaseParcelizer = _pojoequalsAudioAttributesImplBaseParcelizer.AudioAttributesImplBaseParcelizer();
                _pojoEquals _pojoequalsRemoteActionCompatParcelizer = this.onRewind.RemoteActionCompatParcelizer();
                _findPrimitive _findprimitiveAudioAttributesImplBaseParcelizer2 = _pojoequalsRemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer();
                RemoteActionCompatParcelizer(this.onPlayFromUri.onAddQueueItem, _pojoequalsRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, this.onPlayFromUri.onAddQueueItem, _pojoequalsAudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, C.TIME_UNSET, false);
                if (_pojoequalsRemoteActionCompatParcelizer.write && _pojoequalsRemoteActionCompatParcelizer.IconCompatParcelizer.E_() != C.TIME_UNSET) {
                    RemoteActionCompatParcelizer(_pojoequalsRemoteActionCompatParcelizer.read());
                    if (_pojoequalsRemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
                        return;
                    }
                    this.onRewind.read(_pojoequalsRemoteActionCompatParcelizer);
                    IconCompatParcelizer(false);
                    handleMediaPlayPauseIfPendingOnHandler();
                    return;
                }
                for (int i2 = 0; i2 < this.onSetRating.length; i2++) {
                    boolean zIconCompatParcelizer = _findprimitiveAudioAttributesImplBaseParcelizer.IconCompatParcelizer(i2);
                    boolean zIconCompatParcelizer2 = _findprimitiveAudioAttributesImplBaseParcelizer2.IconCompatParcelizer(i2);
                    if (zIconCompatParcelizer && !this.onSetRating[i2].onAddQueueItem()) {
                        boolean z = this.onSetCaptioningEnabled[i2].MediaBrowserCompatMediaItem() == -2;
                        buildIteratorSerializer builditeratorserializer = _findprimitiveAudioAttributesImplBaseParcelizer.read[i2];
                        buildIteratorSerializer builditeratorserializer2 = _findprimitiveAudioAttributesImplBaseParcelizer2.read[i2];
                        if (!zIconCompatParcelizer2 || !builditeratorserializer2.equals(builditeratorserializer) || z) {
                            read(this.onSetRating[i2], _pojoequalsRemoteActionCompatParcelizer.read());
                        }
                    }
                }
            }
        }
    }

    private void onFastForward() throws addNull {
        _pojoEquals _pojoequalsAudioAttributesImplBaseParcelizer = this.onRewind.AudioAttributesImplBaseParcelizer();
        if (_pojoequalsAudioAttributesImplBaseParcelizer == null || this.onRewind.read() == _pojoequalsAudioAttributesImplBaseParcelizer || _pojoequalsAudioAttributesImplBaseParcelizer.read || !onSeekTo()) {
            return;
        }
        MediaBrowserCompatSearchResultReceiver();
    }

    private void AudioAttributesCompatParcelizer(boolean z) {
        if (this.onRemoveQueueItem.AudioAttributesCompatParcelizer != C.TIME_UNSET) {
            if (z || !this.onPlayFromUri.onAddQueueItem.equals(this.MediaBrowserCompatMediaItem)) {
                this.MediaBrowserCompatMediaItem = this.onPlayFromUri.onAddQueueItem;
                this.onRewind.write(this.onPlayFromUri.onAddQueueItem);
            }
        }
    }

    private boolean onSeekTo() throws addNull {
        _pojoEquals _pojoequalsAudioAttributesImplBaseParcelizer = this.onRewind.AudioAttributesImplBaseParcelizer();
        _findPrimitive _findprimitiveAudioAttributesImplBaseParcelizer = _pojoequalsAudioAttributesImplBaseParcelizer.AudioAttributesImplBaseParcelizer();
        int i = 0;
        boolean z = false;
        while (true) {
            buildIndexedListSerializer[] buildindexedlistserializerArr = this.onSetRating;
            if (i >= buildindexedlistserializerArr.length) {
                return !z;
            }
            buildIndexedListSerializer buildindexedlistserializer = buildindexedlistserializerArr[i];
            if (IconCompatParcelizer(buildindexedlistserializer)) {
                boolean z2 = buildindexedlistserializer.MediaBrowserCompatSearchResultReceiver() != _pojoequalsAudioAttributesImplBaseParcelizer.AudioAttributesImplBaseParcelizer[i];
                if (!_findprimitiveAudioAttributesImplBaseParcelizer.IconCompatParcelizer(i) || z2) {
                    if (!buildindexedlistserializer.onAddQueueItem()) {
                        buildindexedlistserializer.IconCompatParcelizer(RemoteActionCompatParcelizer(_findprimitiveAudioAttributesImplBaseParcelizer.write[i]), _pojoequalsAudioAttributesImplBaseParcelizer.AudioAttributesImplBaseParcelizer[i], _pojoequalsAudioAttributesImplBaseParcelizer.read(), _pojoequalsAudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(), _pojoequalsAudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer);
                        if (this.onCustomAction) {
                            AudioAttributesImplBaseParcelizer(false);
                        }
                    } else if (buildindexedlistserializer.onRemoveQueueItemAt()) {
                        write(buildindexedlistserializer);
                    } else {
                        z = true;
                    }
                }
            }
            i++;
        }
    }

    private void onMediaButtonEvent() throws addNull {
        boolean z = false;
        while (onSetRating()) {
            if (z) {
                onAddQueueItem();
            }
            _pojoEquals _pojoequals = (_pojoEquals) buildTypeSerializer.IconCompatParcelizer(this.onRewind.write());
            this.onPlayFromUri = write(_pojoequals.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, _pojoequals.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer, _pojoequals.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer, _pojoequals.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer, !(this.onPlayFromUri.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.equals(_pojoequals.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer) && this.onPlayFromUri.RemoteActionCompatParcelizer.write == -1 && _pojoequals.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.write == -1 && this.onPlayFromUri.RemoteActionCompatParcelizer.IconCompatParcelizer != _pojoequals.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.IconCompatParcelizer), 0);
            onSetRepeatMode();
            onStop();
            if (this.onPlayFromUri.MediaBrowserCompatItemReceiver == 3) {
                onSetCaptioningEnabled();
            }
            AudioAttributesImplApi21Parcelizer();
            z = true;
        }
    }

    private void onPlayFromMediaId() {
        boolean z;
        _pojoEquals _pojoequals = this.onRewind.read();
        if (_pojoequals != null) {
            _findPrimitive _findprimitiveAudioAttributesImplBaseParcelizer = _pojoequals.AudioAttributesImplBaseParcelizer();
            boolean z2 = false;
            int i = 0;
            boolean z3 = false;
            while (true) {
                if (i >= this.onSetRating.length) {
                    z = true;
                    break;
                }
                if (_findprimitiveAudioAttributesImplBaseParcelizer.IconCompatParcelizer(i)) {
                    if (this.onSetRating[i].MediaBrowserCompatMediaItem() != 1) {
                        z = false;
                        break;
                    } else if (_findprimitiveAudioAttributesImplBaseParcelizer.read[i].IconCompatParcelizer != 0) {
                        z3 = true;
                    }
                }
                i++;
            }
            if (z3 && z) {
                z2 = true;
            }
            AudioAttributesImplBaseParcelizer(z2);
        }
    }

    private void AudioAttributesImplApi21Parcelizer() {
        _findPrimitive _findprimitiveAudioAttributesImplBaseParcelizer = this.onRewind.read().AudioAttributesImplBaseParcelizer();
        for (int i = 0; i < this.onSetRating.length; i++) {
            if (_findprimitiveAudioAttributesImplBaseParcelizer.IconCompatParcelizer(i)) {
                this.onSetRating[i].onRewind();
            }
        }
    }

    private void onSetRepeatMode() {
        _pojoEquals _pojoequals = this.onRewind.read();
        this.onPause = _pojoequals != null && _pojoequals.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer && this.onPlay;
    }

    private boolean onSetRating() {
        _pojoEquals _pojoequals;
        _pojoEquals _pojoequalsRemoteActionCompatParcelizer;
        return onSetShuffleMode() && !this.onPause && (_pojoequals = this.onRewind.read()) != null && (_pojoequalsRemoteActionCompatParcelizer = _pojoequals.RemoteActionCompatParcelizer()) != null && this.onSetShuffleMode >= _pojoequalsRemoteActionCompatParcelizer.read() && _pojoequalsRemoteActionCompatParcelizer.read;
    }

    private boolean onCustomAction() {
        _pojoEquals _pojoequalsAudioAttributesImplBaseParcelizer = this.onRewind.AudioAttributesImplBaseParcelizer();
        if (!_pojoequalsAudioAttributesImplBaseParcelizer.write) {
            return false;
        }
        int i = 0;
        while (true) {
            buildIndexedListSerializer[] buildindexedlistserializerArr = this.onSetRating;
            if (i >= buildindexedlistserializerArr.length) {
                return true;
            }
            buildIndexedListSerializer buildindexedlistserializer = buildindexedlistserializerArr[i];
            visitStringFormat visitstringformat = _pojoequalsAudioAttributesImplBaseParcelizer.AudioAttributesImplBaseParcelizer[i];
            if (buildindexedlistserializer.MediaBrowserCompatSearchResultReceiver() != visitstringformat || (visitstringformat != null && !buildindexedlistserializer.MediaMetadataCompat() && !read(buildindexedlistserializer, _pojoequalsAudioAttributesImplBaseParcelizer))) {
                break;
            }
            i++;
        }
        return false;
    }

    private static boolean read(buildIndexedListSerializer buildindexedlistserializer, _pojoEquals _pojoequals) {
        _pojoEquals _pojoequalsRemoteActionCompatParcelizer = _pojoequals.RemoteActionCompatParcelizer();
        if (_pojoequals.AudioAttributesCompatParcelizer.write && _pojoequalsRemoteActionCompatParcelizer.write) {
            return (buildindexedlistserializer instanceof TypeBindings) || (buildindexedlistserializer instanceof NumberSerializerBigDecimalAsStringSerializer) || buildindexedlistserializer.MediaBrowserCompatItemReceiver() >= _pojoequalsRemoteActionCompatParcelizer.read();
        }
        return false;
    }

    private void RemoteActionCompatParcelizer(long j) {
        for (buildIndexedListSerializer buildindexedlistserializer : this.onSetRating) {
            if (buildindexedlistserializer.MediaBrowserCompatSearchResultReceiver() != null) {
                read(buildindexedlistserializer, j);
            }
        }
    }

    private static void read(buildIndexedListSerializer buildindexedlistserializer, long j) {
        buildindexedlistserializer.onPlayFromUri();
        if (buildindexedlistserializer instanceof TypeBindings) {
            ((TypeBindings) buildindexedlistserializer).AudioAttributesCompatParcelizer(j);
        }
    }

    private void AudioAttributesCompatParcelizer(StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer) throws addNull {
        if (this.onRewind.write(stdJdkSerializersAtomicIntegerSerializer)) {
            _pojoEquals _pojoequalsIconCompatParcelizer = this.onRewind.IconCompatParcelizer();
            _pojoequalsIconCompatParcelizer.write(this.onAddQueueItem.IconCompatParcelizer().AudioAttributesCompatParcelizer, this.onPlayFromUri.onAddQueueItem);
            IconCompatParcelizer(_pojoequalsIconCompatParcelizer.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, _pojoequalsIconCompatParcelizer.AudioAttributesImplApi21Parcelizer(), _pojoequalsIconCompatParcelizer.AudioAttributesImplBaseParcelizer());
            if (_pojoequalsIconCompatParcelizer == this.onRewind.read()) {
                AudioAttributesCompatParcelizer(_pojoequalsIconCompatParcelizer.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer);
                MediaBrowserCompatSearchResultReceiver();
                this.onPlayFromUri = write(this.onPlayFromUri.RemoteActionCompatParcelizer, _pojoequalsIconCompatParcelizer.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer, this.onPlayFromUri.MediaMetadataCompat, _pojoequalsIconCompatParcelizer.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer, false, 5);
            }
            handleMediaPlayPauseIfPendingOnHandler();
        }
    }

    private void IconCompatParcelizer(StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer) {
        if (this.onRewind.write(stdJdkSerializersAtomicIntegerSerializer)) {
            this.onRewind.read(this.onSetShuffleMode);
            handleMediaPlayPauseIfPendingOnHandler();
        }
    }

    private void write(DefaultBaseTypeLimitingValidatorUnsafeBaseTypes defaultBaseTypeLimitingValidatorUnsafeBaseTypes, boolean z) throws addNull {
        IconCompatParcelizer(defaultBaseTypeLimitingValidatorUnsafeBaseTypes, defaultBaseTypeLimitingValidatorUnsafeBaseTypes.AudioAttributesCompatParcelizer, true, z);
    }

    private void IconCompatParcelizer(DefaultBaseTypeLimitingValidatorUnsafeBaseTypes defaultBaseTypeLimitingValidatorUnsafeBaseTypes, float f, boolean z, boolean z2) throws addNull {
        if (z) {
            if (z2) {
                this.onPlayFromSearch.write(1);
            }
            this.onPlayFromUri = this.onPlayFromUri.RemoteActionCompatParcelizer(defaultBaseTypeLimitingValidatorUnsafeBaseTypes);
        }
        RemoteActionCompatParcelizer(defaultBaseTypeLimitingValidatorUnsafeBaseTypes.AudioAttributesCompatParcelizer);
        for (buildIndexedListSerializer buildindexedlistserializer : this.onSetRating) {
            if (buildindexedlistserializer != null) {
                buildindexedlistserializer.read(f, defaultBaseTypeLimitingValidatorUnsafeBaseTypes.AudioAttributesCompatParcelizer);
            }
        }
    }

    private void handleMediaPlayPauseIfPendingOnHandler() {
        boolean zOnSetPlaybackSpeed = onSetPlaybackSpeed();
        this.PlaybackStateCompat = zOnSetPlaybackSpeed;
        if (zOnSetPlaybackSpeed) {
            this.onRewind.IconCompatParcelizer().IconCompatParcelizer(this.onSetShuffleMode, this.onAddQueueItem.IconCompatParcelizer().AudioAttributesCompatParcelizer, this.MediaBrowserCompatSearchResultReceiver);
        }
        onSkipToQueueItem();
    }

    private boolean onSetPlaybackSpeed() {
        long jRemoteActionCompatParcelizer;
        if (!onCommand()) {
            return false;
        }
        _pojoEquals _pojoequalsIconCompatParcelizer = this.onRewind.IconCompatParcelizer();
        long jWrite = write(_pojoequalsIconCompatParcelizer.write());
        if (_pojoequalsIconCompatParcelizer == this.onRewind.read()) {
            jRemoteActionCompatParcelizer = _pojoequalsIconCompatParcelizer.RemoteActionCompatParcelizer(this.onSetShuffleMode);
        } else {
            jRemoteActionCompatParcelizer = _pojoequalsIconCompatParcelizer.RemoteActionCompatParcelizer(this.onSetShuffleMode) - _pojoequalsIconCompatParcelizer.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer;
        }
        _withArrayAddTailProperty.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new _withArrayAddTailProperty.AudioAttributesCompatParcelizer(this.onRemoveQueueItemAt, this.onPlayFromUri.onAddQueueItem, _pojoequalsIconCompatParcelizer.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, jRemoteActionCompatParcelizer, jWrite, this.onAddQueueItem.IconCompatParcelizer().AudioAttributesCompatParcelizer, this.onPlayFromUri.MediaBrowserCompatCustomActionResultReceiver, this.MediaMetadataCompat, IconCompatParcelizer(this.onPlayFromUri.onAddQueueItem, _pojoequalsIconCompatParcelizer.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer) ? this.MediaDescriptionCompat.read() : C.TIME_UNSET);
        boolean zAudioAttributesCompatParcelizer = this.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer);
        _pojoEquals _pojoequals = this.onRewind.read();
        if (zAudioAttributesCompatParcelizer || !_pojoequals.write || jWrite >= 500000 || (this.AudioAttributesCompatParcelizer <= 0 && !this.onSkipToPrevious)) {
            return zAudioAttributesCompatParcelizer;
        }
        _pojoequals.IconCompatParcelizer.IconCompatParcelizer(this.onPlayFromUri.RatingCompat, false);
        return this.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer);
    }

    private boolean onCommand() {
        _pojoEquals _pojoequalsIconCompatParcelizer = this.onRewind.IconCompatParcelizer();
        return (_pojoequalsIconCompatParcelizer == null || _pojoequalsIconCompatParcelizer.MediaBrowserCompatItemReceiver() || _pojoequalsIconCompatParcelizer.write() == Long.MIN_VALUE) ? false : true;
    }

    private void onSkipToQueueItem() {
        _pojoEquals _pojoequalsIconCompatParcelizer = this.onRewind.IconCompatParcelizer();
        boolean z = this.PlaybackStateCompat || (_pojoequalsIconCompatParcelizer != null && _pojoequalsIconCompatParcelizer.IconCompatParcelizer.IconCompatParcelizer());
        if (z != this.onPlayFromUri.write) {
            this.onPlayFromUri = this.onPlayFromUri.IconCompatParcelizer(z);
        }
    }

    private buildEnumSetSerializer write(StdKeySerializers.write writeVar, long j, long j2, long j3, boolean z, int i) {
        _writeAsBinary _writeasbinary;
        _findPrimitive _findprimitive;
        List<androidx.media3.common.Metadata> list;
        _writeAsBinary _writeasbinaryAudioAttributesImplApi21Parcelizer;
        _findPrimitive _findprimitiveAudioAttributesImplBaseParcelizer;
        this.read = (!this.read && j == this.onPlayFromUri.RatingCompat && writeVar.equals(this.onPlayFromUri.RemoteActionCompatParcelizer)) ? false : true;
        onSetRepeatMode();
        _writeAsBinary _writeasbinary2 = this.onPlayFromUri.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        _findPrimitive _findprimitive2 = this.onPlayFromUri.onCommand;
        List<androidx.media3.common.Metadata> listAudioAttributesImplApi26Parcelizer = this.onPlayFromUri.MediaDescriptionCompat;
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer()) {
            _pojoEquals _pojoequals = this.onRewind.read();
            if (_pojoequals == null) {
                _writeasbinaryAudioAttributesImplApi21Parcelizer = _writeAsBinary.read;
            } else {
                _writeasbinaryAudioAttributesImplApi21Parcelizer = _pojoequals.AudioAttributesImplApi21Parcelizer();
            }
            if (_pojoequals == null) {
                _findprimitiveAudioAttributesImplBaseParcelizer = this.AudioAttributesImplApi21Parcelizer;
            } else {
                _findprimitiveAudioAttributesImplBaseParcelizer = _pojoequals.AudioAttributesImplBaseParcelizer();
            }
            initExtraTracks<androidx.media3.common.Metadata> initextratracksIconCompatParcelizer = IconCompatParcelizer(_findprimitiveAudioAttributesImplBaseParcelizer.write);
            if (_pojoequals != null && _pojoequals.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer != j2) {
                _pojoequals.AudioAttributesCompatParcelizer = _pojoequals.AudioAttributesCompatParcelizer.IconCompatParcelizer(j2);
            }
            onPlayFromMediaId();
            _writeasbinary = _writeasbinaryAudioAttributesImplApi21Parcelizer;
            _findprimitive = _findprimitiveAudioAttributesImplBaseParcelizer;
            list = initextratracksIconCompatParcelizer;
        } else {
            if (!writeVar.equals(this.onPlayFromUri.RemoteActionCompatParcelizer)) {
                _writeasbinary2 = _writeAsBinary.read;
                _findprimitive2 = this.AudioAttributesImplApi21Parcelizer;
                listAudioAttributesImplApi26Parcelizer = initExtraTracks.AudioAttributesImplApi26Parcelizer();
            }
            _writeasbinary = _writeasbinary2;
            _findprimitive = _findprimitive2;
            list = listAudioAttributesImplApi26Parcelizer;
        }
        if (z) {
            this.onPlayFromSearch.AudioAttributesCompatParcelizer(i);
        }
        return this.onPlayFromUri.AudioAttributesCompatParcelizer(writeVar, j, j2, j3, MediaDescriptionCompat(), _writeasbinary, _findprimitive, list);
    }

    private static initExtraTracks<androidx.media3.common.Metadata> IconCompatParcelizer(_verifyAndResolvePlaceholders[] _verifyandresolveplaceholdersArr) {
        initExtraTracks.IconCompatParcelizer iconCompatParcelizer = new initExtraTracks.IconCompatParcelizer();
        boolean z = false;
        for (_verifyAndResolvePlaceholders _verifyandresolveplaceholders : _verifyandresolveplaceholdersArr) {
            if (_verifyandresolveplaceholders != null) {
                C0170format c0170format = _verifyandresolveplaceholders.read(0);
                if (c0170format.onPlay == null) {
                    iconCompatParcelizer.read(new androidx.media3.common.Metadata(new Metadata.Entry[0]));
                } else {
                    iconCompatParcelizer.read(c0170format.onPlay);
                    z = true;
                }
            }
        }
        return z ? iconCompatParcelizer.IconCompatParcelizer() : initExtraTracks.AudioAttributesImplApi26Parcelizer();
    }

    private void MediaBrowserCompatSearchResultReceiver() throws addNull {
        AudioAttributesCompatParcelizer(new boolean[this.onSetRating.length], this.onRewind.AudioAttributesImplBaseParcelizer().read());
    }

    private void AudioAttributesCompatParcelizer(boolean[] zArr, long j) throws addNull {
        _pojoEquals _pojoequalsAudioAttributesImplBaseParcelizer = this.onRewind.AudioAttributesImplBaseParcelizer();
        _findPrimitive _findprimitiveAudioAttributesImplBaseParcelizer = _pojoequalsAudioAttributesImplBaseParcelizer.AudioAttributesImplBaseParcelizer();
        for (int i = 0; i < this.onSetRating.length; i++) {
            if (!_findprimitiveAudioAttributesImplBaseParcelizer.IconCompatParcelizer(i) && this.onStop.remove(this.onSetRating[i])) {
                this.onSetRating[i].onPrepareFromSearch();
            }
        }
        for (int i2 = 0; i2 < this.onSetRating.length; i2++) {
            if (_findprimitiveAudioAttributesImplBaseParcelizer.IconCompatParcelizer(i2)) {
                read(i2, zArr[i2], j);
            }
        }
        _pojoequalsAudioAttributesImplBaseParcelizer.read = true;
    }

    private void read(int i, boolean z, long j) throws addNull {
        buildIndexedListSerializer buildindexedlistserializer = this.onSetRating[i];
        if (IconCompatParcelizer(buildindexedlistserializer)) {
            return;
        }
        _pojoEquals _pojoequalsAudioAttributesImplBaseParcelizer = this.onRewind.AudioAttributesImplBaseParcelizer();
        boolean z2 = _pojoequalsAudioAttributesImplBaseParcelizer == this.onRewind.read();
        _findPrimitive _findprimitiveAudioAttributesImplBaseParcelizer = _pojoequalsAudioAttributesImplBaseParcelizer.AudioAttributesImplBaseParcelizer();
        buildIteratorSerializer builditeratorserializer = _findprimitiveAudioAttributesImplBaseParcelizer.read[i];
        C0170format[] c0170formatArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(_findprimitiveAudioAttributesImplBaseParcelizer.write[i]);
        boolean z3 = onSetShuffleMode() && this.onPlayFromUri.MediaBrowserCompatItemReceiver == 3;
        boolean z4 = !z && z3;
        this.MediaBrowserCompatItemReceiver++;
        this.onStop.add(buildindexedlistserializer);
        buildindexedlistserializer.IconCompatParcelizer(builditeratorserializer, c0170formatArrRemoteActionCompatParcelizer, _pojoequalsAudioAttributesImplBaseParcelizer.AudioAttributesImplBaseParcelizer[i], z4, z2, j, _pojoequalsAudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(), _pojoequalsAudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer);
        buildindexedlistserializer.AudioAttributesCompatParcelizer(11, new buildIndexedListSerializer.IconCompatParcelizer() { // from class: o.LongNode.5
            @Override // o.buildIndexedListSerializer.IconCompatParcelizer
            public final void IconCompatParcelizer() {
                LongNode.IconCompatParcelizer(LongNode.this);
            }

            @Override // o.buildIndexedListSerializer.IconCompatParcelizer
            public final void AudioAttributesCompatParcelizer() {
                if (LongNode.this.AudioAttributesImplApi26Parcelizer || LongNode.this.onCustomAction) {
                    LongNode.this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(2);
                }
            }
        });
        this.onAddQueueItem.RemoteActionCompatParcelizer(buildindexedlistserializer);
        if (z3 && z2) {
            buildindexedlistserializer.onPrepare();
        }
    }

    private void onPrepareFromUri() {
        for (int i = 0; i < this.onSetRating.length; i++) {
            this.onSetCaptioningEnabled[i].RemoteActionCompatParcelizer();
            this.onSetRating[i].onPlay();
        }
    }

    private void IconCompatParcelizer(boolean z) {
        long jIconCompatParcelizer;
        _pojoEquals _pojoequalsIconCompatParcelizer = this.onRewind.IconCompatParcelizer();
        StdKeySerializers.write writeVar = _pojoequalsIconCompatParcelizer == null ? this.onPlayFromUri.RemoteActionCompatParcelizer : _pojoequalsIconCompatParcelizer.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        boolean zEquals = this.onPlayFromUri.read.equals(writeVar);
        if (!zEquals) {
            this.onPlayFromUri = this.onPlayFromUri.RemoteActionCompatParcelizer(writeVar);
        }
        buildEnumSetSerializer buildenumsetserializer = this.onPlayFromUri;
        if (_pojoequalsIconCompatParcelizer == null) {
            jIconCompatParcelizer = buildenumsetserializer.RatingCompat;
        } else {
            jIconCompatParcelizer = _pojoequalsIconCompatParcelizer.IconCompatParcelizer();
        }
        buildenumsetserializer.IconCompatParcelizer = jIconCompatParcelizer;
        this.onPlayFromUri.onCustomAction = MediaDescriptionCompat();
        if ((!zEquals || z) && _pojoequalsIconCompatParcelizer != null && _pojoequalsIconCompatParcelizer.write) {
            IconCompatParcelizer(_pojoequalsIconCompatParcelizer.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, _pojoequalsIconCompatParcelizer.AudioAttributesImplApi21Parcelizer(), _pojoequalsIconCompatParcelizer.AudioAttributesImplBaseParcelizer());
        }
    }

    private long MediaDescriptionCompat() {
        return write(this.onPlayFromUri.IconCompatParcelizer);
    }

    private long write(long j) {
        _pojoEquals _pojoequalsIconCompatParcelizer = this.onRewind.IconCompatParcelizer();
        if (_pojoequalsIconCompatParcelizer == null) {
            return 0L;
        }
        return Math.max(0L, j - _pojoequalsIconCompatParcelizer.RemoteActionCompatParcelizer(this.onSetShuffleMode));
    }

    private void IconCompatParcelizer(StdKeySerializers.write writeVar, _writeAsBinary _writeasbinary, _findPrimitive _findprimitive) {
        _withArrayAddTailProperty _witharrayaddtailproperty = this.handleMediaPlayPauseIfPendingOnHandler;
        modifyArraySerializer modifyarrayserializer = this.onRemoveQueueItemAt;
        PolymorphicTypeValidator polymorphicTypeValidator = this.onPlayFromUri.onAddQueueItem;
        _witharrayaddtailproperty.RemoteActionCompatParcelizer(modifyarrayserializer, this.onSetRating, _writeasbinary, _findprimitive.write);
    }

    private boolean onSetShuffleMode() {
        return this.onPlayFromUri.MediaBrowserCompatCustomActionResultReceiver && this.onPlayFromUri.MediaBrowserCompatSearchResultReceiver == 0;
    }

    private static MediaBrowserCompatItemReceiver read(PolymorphicTypeValidator polymorphicTypeValidator, buildEnumSetSerializer buildenumsetserializer, AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, TextNode textNode, int i, boolean z, PolymorphicTypeValidator.IconCompatParcelizer iconCompatParcelizer, PolymorphicTypeValidator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        long j;
        int i2;
        StdKeySerializers.write writeVar;
        int i3;
        long jLongValue;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        int iRemoteActionCompatParcelizer;
        boolean z5;
        TextNode textNode2;
        long j2;
        long jLongValue2;
        int i5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        int iRemoteActionCompatParcelizer2;
        if (polymorphicTypeValidator.RemoteActionCompatParcelizer()) {
            return new MediaBrowserCompatItemReceiver(buildEnumSetSerializer.read(), 0L, C.TIME_UNSET, false, true, false);
        }
        StdKeySerializers.write writeVar2 = buildenumsetserializer.RemoteActionCompatParcelizer;
        Object obj = writeVar2.AudioAttributesCompatParcelizer;
        boolean zWrite = write(buildenumsetserializer, audioAttributesCompatParcelizer);
        if (buildenumsetserializer.RemoteActionCompatParcelizer.IconCompatParcelizer() || zWrite) {
            j = buildenumsetserializer.MediaMetadataCompat;
        } else {
            j = buildenumsetserializer.RatingCompat;
        }
        long j3 = j;
        boolean z10 = false;
        if (audioAttributesImplApi26Parcelizer != null) {
            i2 = -1;
            Pair<Object, Long> pairWrite = write(polymorphicTypeValidator, audioAttributesImplApi26Parcelizer, true, i, z, iconCompatParcelizer, audioAttributesCompatParcelizer);
            if (pairWrite == null) {
                iRemoteActionCompatParcelizer2 = polymorphicTypeValidator.RemoteActionCompatParcelizer(z);
                jLongValue = j3;
                z8 = true;
                z9 = false;
                z7 = false;
            } else {
                if (audioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer == C.TIME_UNSET) {
                    i5 = polymorphicTypeValidator.RemoteActionCompatParcelizer(pairWrite.first, audioAttributesCompatParcelizer).AudioAttributesImplBaseParcelizer;
                    jLongValue2 = j3;
                    z6 = false;
                } else {
                    obj = pairWrite.first;
                    jLongValue2 = ((Long) pairWrite.second).longValue();
                    i5 = -1;
                    z6 = true;
                }
                z7 = buildenumsetserializer.MediaBrowserCompatItemReceiver == 4;
                z8 = false;
                z9 = z6;
                jLongValue = jLongValue2;
                iRemoteActionCompatParcelizer2 = i5;
            }
            z2 = z9;
            z3 = z7;
            z4 = z8;
            writeVar = writeVar2;
            i4 = iRemoteActionCompatParcelizer2;
        } else {
            i2 = -1;
            if (buildenumsetserializer.onAddQueueItem.RemoteActionCompatParcelizer()) {
                iRemoteActionCompatParcelizer = polymorphicTypeValidator.RemoteActionCompatParcelizer(z);
            } else if (polymorphicTypeValidator.read(obj) == -1) {
                int iRemoteActionCompatParcelizer3 = read(iconCompatParcelizer, audioAttributesCompatParcelizer, i, z, obj, buildenumsetserializer.onAddQueueItem, polymorphicTypeValidator);
                if (iRemoteActionCompatParcelizer3 == -1) {
                    iRemoteActionCompatParcelizer3 = polymorphicTypeValidator.RemoteActionCompatParcelizer(z);
                    z5 = true;
                } else {
                    z5 = false;
                }
                i4 = iRemoteActionCompatParcelizer3;
                z4 = z5;
                jLongValue = j3;
                z3 = false;
                z2 = false;
                writeVar = writeVar2;
            } else if (j3 == C.TIME_UNSET) {
                iRemoteActionCompatParcelizer = polymorphicTypeValidator.RemoteActionCompatParcelizer(obj, audioAttributesCompatParcelizer).AudioAttributesImplBaseParcelizer;
            } else if (zWrite) {
                writeVar = writeVar2;
                buildenumsetserializer.onAddQueueItem.RemoteActionCompatParcelizer(writeVar.AudioAttributesCompatParcelizer, audioAttributesCompatParcelizer);
                if (buildenumsetserializer.onAddQueueItem.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer, iconCompatParcelizer).RemoteActionCompatParcelizer == buildenumsetserializer.onAddQueueItem.read(writeVar.AudioAttributesCompatParcelizer)) {
                    Pair<Object, Long> pairAudioAttributesCompatParcelizer = polymorphicTypeValidator.AudioAttributesCompatParcelizer(iconCompatParcelizer, audioAttributesCompatParcelizer, polymorphicTypeValidator.RemoteActionCompatParcelizer(obj, audioAttributesCompatParcelizer).AudioAttributesImplBaseParcelizer, audioAttributesCompatParcelizer.IconCompatParcelizer() + j3);
                    obj = pairAudioAttributesCompatParcelizer.first;
                    jLongValue = ((Long) pairAudioAttributesCompatParcelizer.second).longValue();
                } else {
                    jLongValue = j3;
                }
                i4 = -1;
                z2 = true;
                z3 = false;
                z4 = false;
            } else {
                writeVar = writeVar2;
                i3 = -1;
                i4 = i3;
                jLongValue = j3;
                z3 = false;
                z4 = false;
                z2 = false;
            }
            i3 = iRemoteActionCompatParcelizer;
            writeVar = writeVar2;
            i4 = i3;
            jLongValue = j3;
            z3 = false;
            z4 = false;
            z2 = false;
        }
        if (i4 != i2) {
            Pair<Object, Long> pairAudioAttributesCompatParcelizer2 = polymorphicTypeValidator.AudioAttributesCompatParcelizer(iconCompatParcelizer, audioAttributesCompatParcelizer, i4, C.TIME_UNSET);
            obj = pairAudioAttributesCompatParcelizer2.first;
            jLongValue = ((Long) pairAudioAttributesCompatParcelizer2.second).longValue();
            textNode2 = textNode;
            j2 = -9223372036854775807L;
        } else {
            textNode2 = textNode;
            j2 = jLongValue;
        }
        StdKeySerializers.write writeVarRemoteActionCompatParcelizer = textNode2.RemoteActionCompatParcelizer(polymorphicTypeValidator, obj, jLongValue);
        boolean z11 = writeVarRemoteActionCompatParcelizer.IconCompatParcelizer == i2 || (writeVar.IconCompatParcelizer != i2 && writeVarRemoteActionCompatParcelizer.IconCompatParcelizer >= writeVar.IconCompatParcelizer);
        if (writeVar.AudioAttributesCompatParcelizer.equals(obj) && !writeVar.IconCompatParcelizer() && !writeVarRemoteActionCompatParcelizer.IconCompatParcelizer() && z11) {
            z10 = true;
        }
        StdKeySerializers.write writeVar3 = writeVar;
        boolean zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(zWrite, writeVar, j3, writeVarRemoteActionCompatParcelizer, polymorphicTypeValidator.RemoteActionCompatParcelizer(obj, audioAttributesCompatParcelizer), j2);
        if (z10 || zAudioAttributesCompatParcelizer) {
            writeVarRemoteActionCompatParcelizer = writeVar3;
        }
        if (writeVarRemoteActionCompatParcelizer.IconCompatParcelizer()) {
            if (writeVarRemoteActionCompatParcelizer.equals(writeVar3)) {
                jLongValue = buildenumsetserializer.RatingCompat;
            } else {
                polymorphicTypeValidator.RemoteActionCompatParcelizer(writeVarRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer, audioAttributesCompatParcelizer);
                jLongValue = writeVarRemoteActionCompatParcelizer.read == audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(writeVarRemoteActionCompatParcelizer.write) ? audioAttributesCompatParcelizer.read() : 0L;
            }
        }
        return new MediaBrowserCompatItemReceiver(writeVarRemoteActionCompatParcelizer, jLongValue, j2, z3, z4, z2);
    }

    private static boolean AudioAttributesCompatParcelizer(boolean z, StdKeySerializers.write writeVar, long j, StdKeySerializers.write writeVar2, PolymorphicTypeValidator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, long j2) {
        if (!z && j == j2 && writeVar.AudioAttributesCompatParcelizer.equals(writeVar2.AudioAttributesCompatParcelizer)) {
            if (writeVar.IconCompatParcelizer() && audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(writeVar.write)) {
                return (audioAttributesCompatParcelizer.IconCompatParcelizer(writeVar.write, writeVar.read) == 4 || audioAttributesCompatParcelizer.IconCompatParcelizer(writeVar.write, writeVar.read) == 2) ? false : true;
            }
            if (writeVar2.IconCompatParcelizer() && audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(writeVar2.write)) {
                return true;
            }
        }
        return false;
    }

    private static boolean write(buildEnumSetSerializer buildenumsetserializer, PolymorphicTypeValidator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        StdKeySerializers.write writeVar = buildenumsetserializer.RemoteActionCompatParcelizer;
        PolymorphicTypeValidator polymorphicTypeValidator = buildenumsetserializer.onAddQueueItem;
        return polymorphicTypeValidator.RemoteActionCompatParcelizer() || polymorphicTypeValidator.RemoteActionCompatParcelizer(writeVar.AudioAttributesCompatParcelizer, audioAttributesCompatParcelizer).IconCompatParcelizer;
    }

    private void read(boolean z, boolean z2) {
        this.MediaMetadataCompat = z;
        this.MediaBrowserCompatSearchResultReceiver = (!z || z2) ? C.TIME_UNSET : this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    private static boolean IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, PolymorphicTypeValidator polymorphicTypeValidator, PolymorphicTypeValidator polymorphicTypeValidator2, int i, boolean z, PolymorphicTypeValidator.IconCompatParcelizer iconCompatParcelizer2, PolymorphicTypeValidator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        if (iconCompatParcelizer.read == null) {
            Pair<Object, Long> pairWrite = write(polymorphicTypeValidator, new AudioAttributesImplApi26Parcelizer(iconCompatParcelizer.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(), iconCompatParcelizer.IconCompatParcelizer.IconCompatParcelizer(), iconCompatParcelizer.IconCompatParcelizer.read() == Long.MIN_VALUE ? C.TIME_UNSET : LaissezFaireSubTypeValidator.IconCompatParcelizer(iconCompatParcelizer.IconCompatParcelizer.read())), false, i, z, iconCompatParcelizer2, audioAttributesCompatParcelizer);
            if (pairWrite == null) {
                return false;
            }
            iconCompatParcelizer.write(polymorphicTypeValidator.read(pairWrite.first), ((Long) pairWrite.second).longValue(), pairWrite.first);
            if (iconCompatParcelizer.IconCompatParcelizer.read() == Long.MIN_VALUE) {
                IconCompatParcelizer(polymorphicTypeValidator, iconCompatParcelizer, iconCompatParcelizer2, audioAttributesCompatParcelizer);
            }
            return true;
        }
        int i2 = polymorphicTypeValidator.read(iconCompatParcelizer.read);
        if (i2 == -1) {
            return false;
        }
        if (iconCompatParcelizer.IconCompatParcelizer.read() == Long.MIN_VALUE) {
            IconCompatParcelizer(polymorphicTypeValidator, iconCompatParcelizer, iconCompatParcelizer2, audioAttributesCompatParcelizer);
            return true;
        }
        iconCompatParcelizer.AudioAttributesCompatParcelizer = i2;
        polymorphicTypeValidator2.RemoteActionCompatParcelizer(iconCompatParcelizer.read, audioAttributesCompatParcelizer);
        if (audioAttributesCompatParcelizer.IconCompatParcelizer && polymorphicTypeValidator2.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer, iconCompatParcelizer2).RemoteActionCompatParcelizer == polymorphicTypeValidator2.read(iconCompatParcelizer.read)) {
            Pair<Object, Long> pairAudioAttributesCompatParcelizer = polymorphicTypeValidator.AudioAttributesCompatParcelizer(iconCompatParcelizer2, audioAttributesCompatParcelizer, polymorphicTypeValidator.RemoteActionCompatParcelizer(iconCompatParcelizer.read, audioAttributesCompatParcelizer).AudioAttributesImplBaseParcelizer, iconCompatParcelizer.write + audioAttributesCompatParcelizer.IconCompatParcelizer());
            iconCompatParcelizer.write(polymorphicTypeValidator.read(pairAudioAttributesCompatParcelizer.first), ((Long) pairAudioAttributesCompatParcelizer.second).longValue(), pairAudioAttributesCompatParcelizer.first);
        }
        return true;
    }

    private static void IconCompatParcelizer(PolymorphicTypeValidator polymorphicTypeValidator, IconCompatParcelizer iconCompatParcelizer, PolymorphicTypeValidator.IconCompatParcelizer iconCompatParcelizer2, PolymorphicTypeValidator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        int i = polymorphicTypeValidator.RemoteActionCompatParcelizer(polymorphicTypeValidator.RemoteActionCompatParcelizer(iconCompatParcelizer.read, audioAttributesCompatParcelizer).AudioAttributesImplBaseParcelizer, iconCompatParcelizer2).AudioAttributesImplBaseParcelizer;
        iconCompatParcelizer.write(i, audioAttributesCompatParcelizer.read != C.TIME_UNSET ? audioAttributesCompatParcelizer.read - 1 : Long.MAX_VALUE, polymorphicTypeValidator.RemoteActionCompatParcelizer(i, audioAttributesCompatParcelizer, true).write);
    }

    private static Pair<Object, Long> write(PolymorphicTypeValidator polymorphicTypeValidator, AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, boolean z, int i, boolean z2, PolymorphicTypeValidator.IconCompatParcelizer iconCompatParcelizer, PolymorphicTypeValidator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        Pair<Object, Long> pairAudioAttributesCompatParcelizer;
        int i2;
        PolymorphicTypeValidator polymorphicTypeValidator2 = audioAttributesImplApi26Parcelizer.read;
        if (polymorphicTypeValidator.RemoteActionCompatParcelizer()) {
            return null;
        }
        PolymorphicTypeValidator polymorphicTypeValidator3 = polymorphicTypeValidator2.RemoteActionCompatParcelizer() ? polymorphicTypeValidator : polymorphicTypeValidator2;
        try {
            pairAudioAttributesCompatParcelizer = polymorphicTypeValidator3.AudioAttributesCompatParcelizer(iconCompatParcelizer, audioAttributesCompatParcelizer, audioAttributesImplApi26Parcelizer.IconCompatParcelizer, audioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (!polymorphicTypeValidator.equals(polymorphicTypeValidator3)) {
            if (polymorphicTypeValidator.read(pairAudioAttributesCompatParcelizer.first) == -1) {
                if (z && (i2 = read(iconCompatParcelizer, audioAttributesCompatParcelizer, i, z2, pairAudioAttributesCompatParcelizer.first, polymorphicTypeValidator3, polymorphicTypeValidator)) != -1) {
                    return polymorphicTypeValidator.AudioAttributesCompatParcelizer(iconCompatParcelizer, audioAttributesCompatParcelizer, i2, C.TIME_UNSET);
                }
                return null;
            }
            if (polymorphicTypeValidator3.RemoteActionCompatParcelizer(pairAudioAttributesCompatParcelizer.first, audioAttributesCompatParcelizer).IconCompatParcelizer && polymorphicTypeValidator3.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer, iconCompatParcelizer).RemoteActionCompatParcelizer == polymorphicTypeValidator3.read(pairAudioAttributesCompatParcelizer.first)) {
                return polymorphicTypeValidator.AudioAttributesCompatParcelizer(iconCompatParcelizer, audioAttributesCompatParcelizer, polymorphicTypeValidator.RemoteActionCompatParcelizer(pairAudioAttributesCompatParcelizer.first, audioAttributesCompatParcelizer).AudioAttributesImplBaseParcelizer, audioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer);
            }
        }
        return pairAudioAttributesCompatParcelizer;
    }

    static int read(PolymorphicTypeValidator.IconCompatParcelizer iconCompatParcelizer, PolymorphicTypeValidator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, int i, boolean z, Object obj, PolymorphicTypeValidator polymorphicTypeValidator, PolymorphicTypeValidator polymorphicTypeValidator2) {
        Object obj2 = polymorphicTypeValidator.RemoteActionCompatParcelizer(polymorphicTypeValidator.RemoteActionCompatParcelizer(obj, audioAttributesCompatParcelizer).AudioAttributesImplBaseParcelizer, iconCompatParcelizer).MediaBrowserCompatSearchResultReceiver;
        for (int i2 = 0; i2 < polymorphicTypeValidator2.AudioAttributesCompatParcelizer(); i2++) {
            if (polymorphicTypeValidator2.RemoteActionCompatParcelizer(i2, iconCompatParcelizer).MediaBrowserCompatSearchResultReceiver.equals(obj2)) {
                return i2;
            }
        }
        int i3 = polymorphicTypeValidator.read(obj);
        int iIconCompatParcelizer = polymorphicTypeValidator.IconCompatParcelizer();
        int iWrite = i3;
        int i4 = -1;
        for (int i5 = 0; i5 < iIconCompatParcelizer && i4 == -1; i5++) {
            iWrite = polymorphicTypeValidator.write(iWrite, audioAttributesCompatParcelizer, iconCompatParcelizer, i, z);
            if (iWrite == -1) {
                break;
            }
            i4 = polymorphicTypeValidator2.read(polymorphicTypeValidator.write(iWrite));
        }
        if (i4 == -1) {
            return -1;
        }
        return polymorphicTypeValidator2.AudioAttributesCompatParcelizer(i4, audioAttributesCompatParcelizer).AudioAttributesImplBaseParcelizer;
    }

    private static C0170format[] RemoteActionCompatParcelizer(_verifyAndResolvePlaceholders _verifyandresolveplaceholders) {
        int iMediaBrowserCompatCustomActionResultReceiver = _verifyandresolveplaceholders != null ? _verifyandresolveplaceholders.MediaBrowserCompatCustomActionResultReceiver() : 0;
        C0170format[] c0170formatArr = new C0170format[iMediaBrowserCompatCustomActionResultReceiver];
        for (int i = 0; i < iMediaBrowserCompatCustomActionResultReceiver; i++) {
            c0170formatArr[i] = _verifyandresolveplaceholders.read(i);
        }
        return c0170formatArr;
    }

    private static boolean IconCompatParcelizer(buildIndexedListSerializer buildindexedlistserializer) {
        return buildindexedlistserializer.RatingCompat() != 0;
    }

    static final class AudioAttributesImplApi26Parcelizer {
        public final long AudioAttributesCompatParcelizer;
        public final int IconCompatParcelizer;
        public final PolymorphicTypeValidator read;

        public AudioAttributesImplApi26Parcelizer(PolymorphicTypeValidator polymorphicTypeValidator, int i, long j) {
            this.read = polymorphicTypeValidator;
            this.IconCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer = j;
        }
    }

    static final class MediaBrowserCompatItemReceiver {
        public final StdKeySerializers.write AudioAttributesCompatParcelizer;
        public final long IconCompatParcelizer;
        public final boolean MediaBrowserCompatItemReceiver;
        public final boolean RemoteActionCompatParcelizer;
        public final long read;
        public final boolean write;

        public MediaBrowserCompatItemReceiver(StdKeySerializers.write writeVar, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.AudioAttributesCompatParcelizer = writeVar;
            this.IconCompatParcelizer = j;
            this.read = j2;
            this.write = z;
            this.RemoteActionCompatParcelizer = z2;
            this.MediaBrowserCompatItemReceiver = z3;
        }
    }

    static final class IconCompatParcelizer implements Comparable<IconCompatParcelizer> {
        public int AudioAttributesCompatParcelizer;
        public final buildMapEntrySerializer IconCompatParcelizer;
        public Object read;
        public long write;

        public IconCompatParcelizer(buildMapEntrySerializer buildmapentryserializer) {
            this.IconCompatParcelizer = buildmapentryserializer;
        }

        public final void write(int i, long j, Object obj) {
            this.AudioAttributesCompatParcelizer = i;
            this.write = j;
            this.read = obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public int compareTo(IconCompatParcelizer iconCompatParcelizer) {
            Object obj = this.read;
            if ((obj == null) != (iconCompatParcelizer.read == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.AudioAttributesCompatParcelizer - iconCompatParcelizer.AudioAttributesCompatParcelizer;
            return i != 0 ? i : LaissezFaireSubTypeValidator.write(this.write, iconCompatParcelizer.write);
        }
    }

    static final class AudioAttributesCompatParcelizer {
        private final ToStringSerializerBase AudioAttributesCompatParcelizer;
        private final int RemoteActionCompatParcelizer;
        private final List<BasicSerializerFactory.AudioAttributesCompatParcelizer> read;
        private final long write;

        /* synthetic */ AudioAttributesCompatParcelizer(List list, ToStringSerializerBase toStringSerializerBase, int i, long j, byte b) {
            this(list, toStringSerializerBase, i, j);
        }

        private AudioAttributesCompatParcelizer(List<BasicSerializerFactory.AudioAttributesCompatParcelizer> list, ToStringSerializerBase toStringSerializerBase, int i, long j) {
            this.read = list;
            this.AudioAttributesCompatParcelizer = toStringSerializerBase;
            this.RemoteActionCompatParcelizer = i;
            this.write = j;
        }
    }
}
