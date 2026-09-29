package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.JdkDeserializers;
import kotlin._readAndBind;

/* JADX INFO: loaded from: classes2.dex */
public final class setIgnorableProperties {
    private _long AudioAttributesImplApi26Parcelizer;
    private _long RemoteActionCompatParcelizer;
    private boolean AudioAttributesCompatParcelizer = true;
    private boolean AudioAttributesImplApi21Parcelizer = true;
    private ArrayList<NumberDeserializersBigDecimalDeserializer> AudioAttributesImplBaseParcelizer = new ArrayList<>();
    private ArrayList<NumberDeserializersBigIntegerDeserializer> MediaBrowserCompatItemReceiver = new ArrayList<>();
    private _readAndBind.write write = null;
    private _readAndBind.IconCompatParcelizer read = new _readAndBind.IconCompatParcelizer();
    private ArrayList<NumberDeserializersBigIntegerDeserializer> IconCompatParcelizer = new ArrayList<>();

    public setIgnorableProperties(_long _longVar) {
        this.AudioAttributesImplApi26Parcelizer = _longVar;
        this.RemoteActionCompatParcelizer = _longVar;
    }

    public final void IconCompatParcelizer(_readAndBind.write writeVar) {
        this.write = writeVar;
    }

    private int write(_long _longVar, int i) {
        int size = this.IconCompatParcelizer.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jMax = Math.max(jMax, this.IconCompatParcelizer.get(i2).AudioAttributesCompatParcelizer(_longVar, i));
        }
        return (int) jMax;
    }

    public final boolean write(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (this.AudioAttributesCompatParcelizer || this.AudioAttributesImplApi21Parcelizer) {
            for (JdkDeserializers jdkDeserializers : ((_isStdKeyDeser) this.AudioAttributesImplApi26Parcelizer).MediaSessionCompatQueueItem) {
                jdkDeserializers.x_();
                jdkDeserializers.onSetPlaybackSpeed = false;
                jdkDeserializers.MediaDescriptionCompat.RemoteActionCompatParcelizer();
                jdkDeserializers.onPrepareFromUri.RemoteActionCompatParcelizer();
            }
            this.AudioAttributesImplApi26Parcelizer.x_();
            this.AudioAttributesImplApi26Parcelizer.onSetPlaybackSpeed = false;
            this.AudioAttributesImplApi26Parcelizer.MediaDescriptionCompat.RemoteActionCompatParcelizer();
            this.AudioAttributesImplApi26Parcelizer.onPrepareFromUri.RemoteActionCompatParcelizer();
            this.AudioAttributesImplApi21Parcelizer = false;
        }
        read(this.RemoteActionCompatParcelizer);
        this.AudioAttributesImplApi26Parcelizer.onPlayFromMediaId(0);
        this.AudioAttributesImplApi26Parcelizer.onMediaButtonEvent(0);
        JdkDeserializers.IconCompatParcelizer iconCompatParcelizerRemoteActionCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(0);
        JdkDeserializers.IconCompatParcelizer iconCompatParcelizerRemoteActionCompatParcelizer2 = this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(1);
        if (this.AudioAttributesCompatParcelizer) {
            AudioAttributesCompatParcelizer();
        }
        int iOnSetRating = this.AudioAttributesImplApi26Parcelizer.onSetRating();
        int iOnSetRepeatMode = this.AudioAttributesImplApi26Parcelizer.onSetRepeatMode();
        this.AudioAttributesImplApi26Parcelizer.MediaDescriptionCompat.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(iOnSetRating);
        this.AudioAttributesImplApi26Parcelizer.onPrepareFromUri.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(iOnSetRepeatMode);
        read();
        if (iconCompatParcelizerRemoteActionCompatParcelizer == JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT || iconCompatParcelizerRemoteActionCompatParcelizer2 == JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT) {
            if (z) {
                Iterator<NumberDeserializersBigDecimalDeserializer> it = this.AudioAttributesImplBaseParcelizer.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!it.next().MediaBrowserCompatItemReceiver()) {
                        z = false;
                        break;
                    }
                }
            }
            if (z && iconCompatParcelizerRemoteActionCompatParcelizer == JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT) {
                this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(JdkDeserializers.IconCompatParcelizer.FIXED);
                _long _longVar = this.AudioAttributesImplApi26Parcelizer;
                _longVar.onFastForward(write(_longVar, 0));
                this.AudioAttributesImplApi26Parcelizer.MediaDescriptionCompat.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.onSetShuffleMode());
            }
            if (z && iconCompatParcelizerRemoteActionCompatParcelizer2 == JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT) {
                this.AudioAttributesImplApi26Parcelizer.write(JdkDeserializers.IconCompatParcelizer.FIXED);
                _long _longVar2 = this.AudioAttributesImplApi26Parcelizer;
                _longVar2.MediaMetadataCompat(write(_longVar2, 1));
                this.AudioAttributesImplApi26Parcelizer.onPrepareFromUri.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.onAddQueueItem());
            }
        }
        if (this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatSearchResultReceiver[0] == JdkDeserializers.IconCompatParcelizer.FIXED || this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatSearchResultReceiver[0] == JdkDeserializers.IconCompatParcelizer.MATCH_PARENT) {
            int iOnSetShuffleMode = this.AudioAttributesImplApi26Parcelizer.onSetShuffleMode() + iOnSetRating;
            this.AudioAttributesImplApi26Parcelizer.MediaDescriptionCompat.write.RemoteActionCompatParcelizer(iOnSetShuffleMode);
            this.AudioAttributesImplApi26Parcelizer.MediaDescriptionCompat.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(iOnSetShuffleMode - iOnSetRating);
            read();
            if (this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatSearchResultReceiver[1] == JdkDeserializers.IconCompatParcelizer.FIXED || this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatSearchResultReceiver[1] == JdkDeserializers.IconCompatParcelizer.MATCH_PARENT) {
                int iOnAddQueueItem = this.AudioAttributesImplApi26Parcelizer.onAddQueueItem() + iOnSetRepeatMode;
                this.AudioAttributesImplApi26Parcelizer.onPrepareFromUri.write.RemoteActionCompatParcelizer(iOnAddQueueItem);
                this.AudioAttributesImplApi26Parcelizer.onPrepareFromUri.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(iOnAddQueueItem - iOnSetRepeatMode);
            }
            read();
            z2 = true;
        } else {
            z2 = false;
        }
        for (NumberDeserializersBigDecimalDeserializer numberDeserializersBigDecimalDeserializer : this.AudioAttributesImplBaseParcelizer) {
            if (numberDeserializersBigDecimalDeserializer.MediaBrowserCompatItemReceiver != this.AudioAttributesImplApi26Parcelizer || numberDeserializersBigDecimalDeserializer.AudioAttributesImplApi26Parcelizer) {
                numberDeserializersBigDecimalDeserializer.write();
            }
        }
        Iterator<NumberDeserializersBigDecimalDeserializer> it2 = this.AudioAttributesImplBaseParcelizer.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z3 = true;
                break;
            }
            NumberDeserializersBigDecimalDeserializer next = it2.next();
            if (z2 || next.MediaBrowserCompatItemReceiver != this.AudioAttributesImplApi26Parcelizer) {
                if (!next.MediaBrowserCompatMediaItem.AudioAttributesImplBaseParcelizer || ((!next.write.AudioAttributesImplBaseParcelizer && !(next instanceof MapDeserializerMapReferringAccumulator)) || (!next.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer && !(next instanceof getMapClass) && !(next instanceof MapDeserializerMapReferringAccumulator)))) {
                    break;
                }
            }
        }
        this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(iconCompatParcelizerRemoteActionCompatParcelizer);
        this.AudioAttributesImplApi26Parcelizer.write(iconCompatParcelizerRemoteActionCompatParcelizer2);
        return z3;
    }

    public final boolean write() {
        if (this.AudioAttributesCompatParcelizer) {
            for (JdkDeserializers jdkDeserializers : ((_isStdKeyDeser) this.AudioAttributesImplApi26Parcelizer).MediaSessionCompatQueueItem) {
                jdkDeserializers.x_();
                jdkDeserializers.onSetPlaybackSpeed = false;
                jdkDeserializers.MediaDescriptionCompat.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer = false;
                jdkDeserializers.MediaDescriptionCompat.AudioAttributesImplApi26Parcelizer = false;
                jdkDeserializers.MediaDescriptionCompat.RemoteActionCompatParcelizer();
                jdkDeserializers.onPrepareFromUri.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer = false;
                jdkDeserializers.onPrepareFromUri.AudioAttributesImplApi26Parcelizer = false;
                jdkDeserializers.onPrepareFromUri.RemoteActionCompatParcelizer();
            }
            this.AudioAttributesImplApi26Parcelizer.x_();
            this.AudioAttributesImplApi26Parcelizer.onSetPlaybackSpeed = false;
            this.AudioAttributesImplApi26Parcelizer.MediaDescriptionCompat.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer = false;
            this.AudioAttributesImplApi26Parcelizer.MediaDescriptionCompat.AudioAttributesImplApi26Parcelizer = false;
            this.AudioAttributesImplApi26Parcelizer.MediaDescriptionCompat.RemoteActionCompatParcelizer();
            this.AudioAttributesImplApi26Parcelizer.onPrepareFromUri.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer = false;
            this.AudioAttributesImplApi26Parcelizer.onPrepareFromUri.AudioAttributesImplApi26Parcelizer = false;
            this.AudioAttributesImplApi26Parcelizer.onPrepareFromUri.RemoteActionCompatParcelizer();
            AudioAttributesCompatParcelizer();
        }
        read(this.RemoteActionCompatParcelizer);
        this.AudioAttributesImplApi26Parcelizer.onPlayFromMediaId(0);
        this.AudioAttributesImplApi26Parcelizer.onMediaButtonEvent(0);
        this.AudioAttributesImplApi26Parcelizer.MediaDescriptionCompat.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(0);
        this.AudioAttributesImplApi26Parcelizer.onPrepareFromUri.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(0);
        return true;
    }

    public final boolean RemoteActionCompatParcelizer(boolean z, int i) {
        boolean z2;
        boolean z3 = false;
        JdkDeserializers.IconCompatParcelizer iconCompatParcelizerRemoteActionCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(0);
        JdkDeserializers.IconCompatParcelizer iconCompatParcelizerRemoteActionCompatParcelizer2 = this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(1);
        int iOnSetRating = this.AudioAttributesImplApi26Parcelizer.onSetRating();
        int iOnSetRepeatMode = this.AudioAttributesImplApi26Parcelizer.onSetRepeatMode();
        if (z && (iconCompatParcelizerRemoteActionCompatParcelizer == JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT || iconCompatParcelizerRemoteActionCompatParcelizer2 == JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT)) {
            Iterator<NumberDeserializersBigDecimalDeserializer> it = this.AudioAttributesImplBaseParcelizer.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                NumberDeserializersBigDecimalDeserializer next = it.next();
                if (next.MediaMetadataCompat == i && !next.MediaBrowserCompatItemReceiver()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && iconCompatParcelizerRemoteActionCompatParcelizer == JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT) {
                    this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(JdkDeserializers.IconCompatParcelizer.FIXED);
                    _long _longVar = this.AudioAttributesImplApi26Parcelizer;
                    _longVar.onFastForward(write(_longVar, 0));
                    this.AudioAttributesImplApi26Parcelizer.MediaDescriptionCompat.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.onSetShuffleMode());
                }
            } else if (z && iconCompatParcelizerRemoteActionCompatParcelizer2 == JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT) {
                this.AudioAttributesImplApi26Parcelizer.write(JdkDeserializers.IconCompatParcelizer.FIXED);
                _long _longVar2 = this.AudioAttributesImplApi26Parcelizer;
                _longVar2.MediaMetadataCompat(write(_longVar2, 1));
                this.AudioAttributesImplApi26Parcelizer.onPrepareFromUri.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.onAddQueueItem());
            }
        }
        if (i == 0) {
            if (this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatSearchResultReceiver[0] == JdkDeserializers.IconCompatParcelizer.FIXED || this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatSearchResultReceiver[0] == JdkDeserializers.IconCompatParcelizer.MATCH_PARENT) {
                int iOnSetShuffleMode = this.AudioAttributesImplApi26Parcelizer.onSetShuffleMode() + iOnSetRating;
                this.AudioAttributesImplApi26Parcelizer.MediaDescriptionCompat.write.RemoteActionCompatParcelizer(iOnSetShuffleMode);
                this.AudioAttributesImplApi26Parcelizer.MediaDescriptionCompat.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(iOnSetShuffleMode - iOnSetRating);
                z2 = true;
            }
            z2 = false;
        } else {
            if (this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatSearchResultReceiver[1] == JdkDeserializers.IconCompatParcelizer.FIXED || this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatSearchResultReceiver[1] == JdkDeserializers.IconCompatParcelizer.MATCH_PARENT) {
                int iOnAddQueueItem = this.AudioAttributesImplApi26Parcelizer.onAddQueueItem() + iOnSetRepeatMode;
                this.AudioAttributesImplApi26Parcelizer.onPrepareFromUri.write.RemoteActionCompatParcelizer(iOnAddQueueItem);
                this.AudioAttributesImplApi26Parcelizer.onPrepareFromUri.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(iOnAddQueueItem - iOnSetRepeatMode);
                z2 = true;
            }
            z2 = false;
        }
        read();
        for (NumberDeserializersBigDecimalDeserializer numberDeserializersBigDecimalDeserializer : this.AudioAttributesImplBaseParcelizer) {
            if (numberDeserializersBigDecimalDeserializer.MediaMetadataCompat == i && (numberDeserializersBigDecimalDeserializer.MediaBrowserCompatItemReceiver != this.AudioAttributesImplApi26Parcelizer || numberDeserializersBigDecimalDeserializer.AudioAttributesImplApi26Parcelizer)) {
                numberDeserializersBigDecimalDeserializer.write();
            }
        }
        Iterator<NumberDeserializersBigDecimalDeserializer> it2 = this.AudioAttributesImplBaseParcelizer.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z3 = true;
                break;
            }
            NumberDeserializersBigDecimalDeserializer next2 = it2.next();
            if (next2.MediaMetadataCompat == i && (z2 || next2.MediaBrowserCompatItemReceiver != this.AudioAttributesImplApi26Parcelizer)) {
                if (!next2.MediaBrowserCompatMediaItem.AudioAttributesImplBaseParcelizer || !next2.write.AudioAttributesImplBaseParcelizer || (!(next2 instanceof getMapClass) && !next2.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer)) {
                    break;
                }
            }
        }
        this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(iconCompatParcelizerRemoteActionCompatParcelizer);
        this.AudioAttributesImplApi26Parcelizer.write(iconCompatParcelizerRemoteActionCompatParcelizer2);
        return z3;
    }

    private void read(JdkDeserializers jdkDeserializers, JdkDeserializers.IconCompatParcelizer iconCompatParcelizer, int i, JdkDeserializers.IconCompatParcelizer iconCompatParcelizer2, int i2) {
        this.read.read = iconCompatParcelizer;
        this.read.AudioAttributesImplApi26Parcelizer = iconCompatParcelizer2;
        this.read.write = i;
        this.read.AudioAttributesImplBaseParcelizer = i2;
        this.write.RemoteActionCompatParcelizer(jdkDeserializers, this.read);
        jdkDeserializers.onFastForward(this.read.MediaBrowserCompatCustomActionResultReceiver);
        jdkDeserializers.MediaMetadataCompat(this.read.AudioAttributesImplApi21Parcelizer);
        jdkDeserializers.read(this.read.IconCompatParcelizer);
        jdkDeserializers.MediaBrowserCompatSearchResultReceiver(this.read.RemoteActionCompatParcelizer);
    }

    private boolean read(_long _longVar) {
        int iOnSetShuffleMode;
        JdkDeserializers.IconCompatParcelizer iconCompatParcelizer;
        int iOnAddQueueItem;
        for (JdkDeserializers jdkDeserializers : ((_isStdKeyDeser) _longVar).MediaSessionCompatQueueItem) {
            JdkDeserializers.IconCompatParcelizer iconCompatParcelizer2 = jdkDeserializers.MediaBrowserCompatSearchResultReceiver[0];
            JdkDeserializers.IconCompatParcelizer iconCompatParcelizer3 = jdkDeserializers.MediaBrowserCompatSearchResultReceiver[1];
            if (jdkDeserializers.onRewind() == 8) {
                jdkDeserializers.onSetPlaybackSpeed = true;
            } else {
                if (jdkDeserializers.onFastForward < 1.0f && iconCompatParcelizer2 == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT) {
                    jdkDeserializers.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 2;
                }
                if (jdkDeserializers.onPlay < 1.0f && iconCompatParcelizer3 == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT) {
                    jdkDeserializers.onAddQueueItem = 2;
                }
                if (jdkDeserializers.handleMediaPlayPauseIfPendingOnHandler() > BitmapDescriptorFactory.HUE_RED) {
                    if (iconCompatParcelizer2 == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT && (iconCompatParcelizer3 == JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT || iconCompatParcelizer3 == JdkDeserializers.IconCompatParcelizer.FIXED)) {
                        jdkDeserializers.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 3;
                    } else if (iconCompatParcelizer3 == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT && (iconCompatParcelizer2 == JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT || iconCompatParcelizer2 == JdkDeserializers.IconCompatParcelizer.FIXED)) {
                        jdkDeserializers.onAddQueueItem = 3;
                    } else if (iconCompatParcelizer2 == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT && iconCompatParcelizer3 == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT) {
                        if (jdkDeserializers.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 0) {
                            jdkDeserializers.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 3;
                        }
                        if (jdkDeserializers.onAddQueueItem == 0) {
                            jdkDeserializers.onAddQueueItem = 3;
                        }
                    }
                }
                if (iconCompatParcelizer2 == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT && jdkDeserializers.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 1 && (jdkDeserializers.MediaMetadataCompat.read == null || jdkDeserializers.onPrepareFromMediaId.read == null)) {
                    iconCompatParcelizer2 = JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT;
                }
                JdkDeserializers.IconCompatParcelizer iconCompatParcelizer4 = iconCompatParcelizer2;
                JdkDeserializers.IconCompatParcelizer iconCompatParcelizer5 = (iconCompatParcelizer3 == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT && jdkDeserializers.onAddQueueItem == 1 && (jdkDeserializers.onSeekTo.read == null || jdkDeserializers.AudioAttributesImplApi26Parcelizer.read == null)) ? JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT : iconCompatParcelizer3;
                jdkDeserializers.MediaDescriptionCompat.IconCompatParcelizer = iconCompatParcelizer4;
                jdkDeserializers.MediaDescriptionCompat.AudioAttributesImplBaseParcelizer = jdkDeserializers.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                jdkDeserializers.onPrepareFromUri.IconCompatParcelizer = iconCompatParcelizer5;
                jdkDeserializers.onPrepareFromUri.AudioAttributesImplBaseParcelizer = jdkDeserializers.onAddQueueItem;
                if ((iconCompatParcelizer4 == JdkDeserializers.IconCompatParcelizer.MATCH_PARENT || iconCompatParcelizer4 == JdkDeserializers.IconCompatParcelizer.FIXED || iconCompatParcelizer4 == JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT) && (iconCompatParcelizer5 == JdkDeserializers.IconCompatParcelizer.MATCH_PARENT || iconCompatParcelizer5 == JdkDeserializers.IconCompatParcelizer.FIXED || iconCompatParcelizer5 == JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT)) {
                    int iOnSetShuffleMode2 = jdkDeserializers.onSetShuffleMode();
                    if (iconCompatParcelizer4 == JdkDeserializers.IconCompatParcelizer.MATCH_PARENT) {
                        iOnSetShuffleMode = (_longVar.onSetShuffleMode() - jdkDeserializers.MediaMetadataCompat.AudioAttributesCompatParcelizer) - jdkDeserializers.onPrepareFromMediaId.AudioAttributesCompatParcelizer;
                        iconCompatParcelizer4 = JdkDeserializers.IconCompatParcelizer.FIXED;
                    } else {
                        iOnSetShuffleMode = iOnSetShuffleMode2;
                    }
                    int iOnAddQueueItem2 = jdkDeserializers.onAddQueueItem();
                    if (iconCompatParcelizer5 == JdkDeserializers.IconCompatParcelizer.MATCH_PARENT) {
                        iOnAddQueueItem = (_longVar.onAddQueueItem() - jdkDeserializers.onSeekTo.AudioAttributesCompatParcelizer) - jdkDeserializers.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer;
                        iconCompatParcelizer = JdkDeserializers.IconCompatParcelizer.FIXED;
                    } else {
                        iconCompatParcelizer = iconCompatParcelizer5;
                        iOnAddQueueItem = iOnAddQueueItem2;
                    }
                    read(jdkDeserializers, iconCompatParcelizer4, iOnSetShuffleMode, iconCompatParcelizer, iOnAddQueueItem);
                    jdkDeserializers.MediaDescriptionCompat.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(jdkDeserializers.onSetShuffleMode());
                    jdkDeserializers.onPrepareFromUri.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(jdkDeserializers.onAddQueueItem());
                    jdkDeserializers.onSetPlaybackSpeed = true;
                } else {
                    if (iconCompatParcelizer4 == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT && (iconCompatParcelizer5 == JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT || iconCompatParcelizer5 == JdkDeserializers.IconCompatParcelizer.FIXED)) {
                        if (jdkDeserializers.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 3) {
                            if (iconCompatParcelizer5 == JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT) {
                                read(jdkDeserializers, JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT, 0, JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT, 0);
                            }
                            int iOnAddQueueItem3 = jdkDeserializers.onAddQueueItem();
                            int i = (int) ((iOnAddQueueItem3 * jdkDeserializers.AudioAttributesImplApi21Parcelizer) + 0.5f);
                            JdkDeserializers.IconCompatParcelizer iconCompatParcelizer6 = JdkDeserializers.IconCompatParcelizer.FIXED;
                            read(jdkDeserializers, iconCompatParcelizer6, i, iconCompatParcelizer6, iOnAddQueueItem3);
                            jdkDeserializers.MediaDescriptionCompat.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(jdkDeserializers.onSetShuffleMode());
                            jdkDeserializers.onPrepareFromUri.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(jdkDeserializers.onAddQueueItem());
                            jdkDeserializers.onSetPlaybackSpeed = true;
                        } else if (jdkDeserializers.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 1) {
                            read(jdkDeserializers, JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT, 0, iconCompatParcelizer5, 0);
                            jdkDeserializers.MediaDescriptionCompat.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem = jdkDeserializers.onSetShuffleMode();
                        } else if (jdkDeserializers.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 2) {
                            if (_longVar.MediaBrowserCompatSearchResultReceiver[0] == JdkDeserializers.IconCompatParcelizer.FIXED || _longVar.MediaBrowserCompatSearchResultReceiver[0] == JdkDeserializers.IconCompatParcelizer.MATCH_PARENT) {
                                read(jdkDeserializers, JdkDeserializers.IconCompatParcelizer.FIXED, (int) ((jdkDeserializers.onFastForward * _longVar.onSetShuffleMode()) + 0.5f), iconCompatParcelizer5, jdkDeserializers.onAddQueueItem());
                                jdkDeserializers.MediaDescriptionCompat.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(jdkDeserializers.onSetShuffleMode());
                                jdkDeserializers.onPrepareFromUri.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(jdkDeserializers.onAddQueueItem());
                                jdkDeserializers.onSetPlaybackSpeed = true;
                            }
                        } else if (jdkDeserializers.RatingCompat[0].read == null || jdkDeserializers.RatingCompat[1].read == null) {
                            read(jdkDeserializers, JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT, 0, iconCompatParcelizer5, 0);
                            jdkDeserializers.MediaDescriptionCompat.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(jdkDeserializers.onSetShuffleMode());
                            jdkDeserializers.onPrepareFromUri.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(jdkDeserializers.onAddQueueItem());
                            jdkDeserializers.onSetPlaybackSpeed = true;
                        }
                    }
                    if (iconCompatParcelizer5 == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT && (iconCompatParcelizer4 == JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT || iconCompatParcelizer4 == JdkDeserializers.IconCompatParcelizer.FIXED)) {
                        if (jdkDeserializers.onAddQueueItem == 3) {
                            if (iconCompatParcelizer4 == JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT) {
                                read(jdkDeserializers, JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT, 0, JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT, 0);
                            }
                            int iOnSetShuffleMode3 = jdkDeserializers.onSetShuffleMode();
                            float f = jdkDeserializers.AudioAttributesImplApi21Parcelizer;
                            if (jdkDeserializers.onCommand() == -1) {
                                f = 1.0f / f;
                            }
                            JdkDeserializers.IconCompatParcelizer iconCompatParcelizer7 = JdkDeserializers.IconCompatParcelizer.FIXED;
                            read(jdkDeserializers, iconCompatParcelizer7, iOnSetShuffleMode3, iconCompatParcelizer7, (int) ((iOnSetShuffleMode3 * f) + 0.5f));
                            jdkDeserializers.MediaDescriptionCompat.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(jdkDeserializers.onSetShuffleMode());
                            jdkDeserializers.onPrepareFromUri.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(jdkDeserializers.onAddQueueItem());
                            jdkDeserializers.onSetPlaybackSpeed = true;
                        } else if (jdkDeserializers.onAddQueueItem == 1) {
                            read(jdkDeserializers, iconCompatParcelizer4, 0, JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT, 0);
                            jdkDeserializers.onPrepareFromUri.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem = jdkDeserializers.onAddQueueItem();
                        } else if (jdkDeserializers.onAddQueueItem == 2) {
                            if (_longVar.MediaBrowserCompatSearchResultReceiver[1] == JdkDeserializers.IconCompatParcelizer.FIXED || _longVar.MediaBrowserCompatSearchResultReceiver[1] == JdkDeserializers.IconCompatParcelizer.MATCH_PARENT) {
                                read(jdkDeserializers, iconCompatParcelizer4, jdkDeserializers.onSetShuffleMode(), JdkDeserializers.IconCompatParcelizer.FIXED, (int) ((jdkDeserializers.onPlay * _longVar.onAddQueueItem()) + 0.5f));
                                jdkDeserializers.MediaDescriptionCompat.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(jdkDeserializers.onSetShuffleMode());
                                jdkDeserializers.onPrepareFromUri.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(jdkDeserializers.onAddQueueItem());
                                jdkDeserializers.onSetPlaybackSpeed = true;
                            }
                        } else if (jdkDeserializers.RatingCompat[2].read == null || jdkDeserializers.RatingCompat[3].read == null) {
                            read(jdkDeserializers, JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT, 0, iconCompatParcelizer5, 0);
                            jdkDeserializers.MediaDescriptionCompat.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(jdkDeserializers.onSetShuffleMode());
                            jdkDeserializers.onPrepareFromUri.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(jdkDeserializers.onAddQueueItem());
                            jdkDeserializers.onSetPlaybackSpeed = true;
                        }
                    }
                    if (iconCompatParcelizer4 == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT && iconCompatParcelizer5 == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT) {
                        if (jdkDeserializers.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 1 || jdkDeserializers.onAddQueueItem == 1) {
                            read(jdkDeserializers, JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT, 0, JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT, 0);
                            jdkDeserializers.MediaDescriptionCompat.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem = jdkDeserializers.onSetShuffleMode();
                            jdkDeserializers.onPrepareFromUri.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem = jdkDeserializers.onAddQueueItem();
                        } else if (jdkDeserializers.onAddQueueItem == 2 && jdkDeserializers.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 2 && _longVar.MediaBrowserCompatSearchResultReceiver[0] == JdkDeserializers.IconCompatParcelizer.FIXED && _longVar.MediaBrowserCompatSearchResultReceiver[1] == JdkDeserializers.IconCompatParcelizer.FIXED) {
                            float f2 = jdkDeserializers.onFastForward;
                            int iOnAddQueueItem4 = (int) ((jdkDeserializers.onPlay * _longVar.onAddQueueItem()) + 0.5f);
                            JdkDeserializers.IconCompatParcelizer iconCompatParcelizer8 = JdkDeserializers.IconCompatParcelizer.FIXED;
                            read(jdkDeserializers, iconCompatParcelizer8, (int) ((f2 * _longVar.onSetShuffleMode()) + 0.5f), iconCompatParcelizer8, iOnAddQueueItem4);
                            jdkDeserializers.MediaDescriptionCompat.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(jdkDeserializers.onSetShuffleMode());
                            jdkDeserializers.onPrepareFromUri.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(jdkDeserializers.onAddQueueItem());
                            jdkDeserializers.onSetPlaybackSpeed = true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private void read() {
        for (JdkDeserializers jdkDeserializers : ((_isStdKeyDeser) this.AudioAttributesImplApi26Parcelizer).MediaSessionCompatQueueItem) {
            if (!jdkDeserializers.onSetPlaybackSpeed) {
                boolean z = false;
                JdkDeserializers.IconCompatParcelizer iconCompatParcelizer = jdkDeserializers.MediaBrowserCompatSearchResultReceiver[0];
                JdkDeserializers.IconCompatParcelizer iconCompatParcelizer2 = jdkDeserializers.MediaBrowserCompatSearchResultReceiver[1];
                int i = jdkDeserializers.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                int i2 = jdkDeserializers.onAddQueueItem;
                boolean z2 = iconCompatParcelizer == JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT || (iconCompatParcelizer == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT && i == 1);
                if (iconCompatParcelizer2 == JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT || (iconCompatParcelizer2 == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                boolean z3 = jdkDeserializers.MediaDescriptionCompat.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer;
                boolean z4 = jdkDeserializers.onPrepareFromUri.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer;
                if (z3 && z4) {
                    read(jdkDeserializers, JdkDeserializers.IconCompatParcelizer.FIXED, jdkDeserializers.MediaDescriptionCompat.AudioAttributesCompatParcelizer.RatingCompat, JdkDeserializers.IconCompatParcelizer.FIXED, jdkDeserializers.onPrepareFromUri.AudioAttributesCompatParcelizer.RatingCompat);
                    jdkDeserializers.onSetPlaybackSpeed = true;
                } else if (z3 && z) {
                    read(jdkDeserializers, JdkDeserializers.IconCompatParcelizer.FIXED, jdkDeserializers.MediaDescriptionCompat.AudioAttributesCompatParcelizer.RatingCompat, JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT, jdkDeserializers.onPrepareFromUri.AudioAttributesCompatParcelizer.RatingCompat);
                    if (iconCompatParcelizer2 == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT) {
                        jdkDeserializers.onPrepareFromUri.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem = jdkDeserializers.onAddQueueItem();
                    } else {
                        jdkDeserializers.onPrepareFromUri.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(jdkDeserializers.onAddQueueItem());
                        jdkDeserializers.onSetPlaybackSpeed = true;
                    }
                } else if (z4 && z2) {
                    read(jdkDeserializers, JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT, jdkDeserializers.MediaDescriptionCompat.AudioAttributesCompatParcelizer.RatingCompat, JdkDeserializers.IconCompatParcelizer.FIXED, jdkDeserializers.onPrepareFromUri.AudioAttributesCompatParcelizer.RatingCompat);
                    if (iconCompatParcelizer == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT) {
                        jdkDeserializers.MediaDescriptionCompat.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem = jdkDeserializers.onSetShuffleMode();
                    } else {
                        jdkDeserializers.MediaDescriptionCompat.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(jdkDeserializers.onSetShuffleMode());
                        jdkDeserializers.onSetPlaybackSpeed = true;
                    }
                }
                if (jdkDeserializers.onSetPlaybackSpeed && jdkDeserializers.onPrepareFromUri.read != null) {
                    jdkDeserializers.onPrepareFromUri.read.RemoteActionCompatParcelizer(jdkDeserializers.MediaMetadataCompat());
                }
            }
        }
    }

    public final void IconCompatParcelizer() {
        this.AudioAttributesCompatParcelizer = true;
    }

    public final void RemoteActionCompatParcelizer() {
        this.AudioAttributesImplApi21Parcelizer = true;
    }

    private void AudioAttributesCompatParcelizer() {
        IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
        this.IconCompatParcelizer.clear();
        NumberDeserializersBigIntegerDeserializer.read = 0;
        AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.MediaDescriptionCompat, 0, this.IconCompatParcelizer);
        AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.onPrepareFromUri, 1, this.IconCompatParcelizer);
        this.AudioAttributesCompatParcelizer = false;
    }

    private void IconCompatParcelizer(ArrayList<NumberDeserializersBigDecimalDeserializer> arrayList) {
        arrayList.clear();
        this.RemoteActionCompatParcelizer.MediaDescriptionCompat.AudioAttributesCompatParcelizer();
        this.RemoteActionCompatParcelizer.onPrepareFromUri.AudioAttributesCompatParcelizer();
        arrayList.add(this.RemoteActionCompatParcelizer.MediaDescriptionCompat);
        arrayList.add(this.RemoteActionCompatParcelizer.onPrepareFromUri);
        HashSet hashSet = null;
        for (JdkDeserializers jdkDeserializers : ((_isStdKeyDeser) this.RemoteActionCompatParcelizer).MediaSessionCompatQueueItem) {
            if (jdkDeserializers instanceof _deserializeUsingCreator) {
                arrayList.add(new MapDeserializerMapReferringAccumulator(jdkDeserializers));
            } else {
                if (jdkDeserializers.setSessionImpl()) {
                    if (jdkDeserializers.IconCompatParcelizer == null) {
                        jdkDeserializers.IconCompatParcelizer = new getMapClass(jdkDeserializers, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(jdkDeserializers.IconCompatParcelizer);
                } else {
                    arrayList.add(jdkDeserializers.MediaDescriptionCompat);
                }
                if (jdkDeserializers.onSkipToNext()) {
                    if (jdkDeserializers.onSetShuffleMode == null) {
                        jdkDeserializers.onSetShuffleMode = new getMapClass(jdkDeserializers, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(jdkDeserializers.onSetShuffleMode);
                } else {
                    arrayList.add(jdkDeserializers.onPrepareFromUri);
                }
                if (jdkDeserializers instanceof JsonNodeDeserializerArrayDeserializer) {
                    arrayList.add(new NullifyingDeserializer(jdkDeserializers));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<NumberDeserializersBigDecimalDeserializer> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().AudioAttributesCompatParcelizer();
        }
        for (NumberDeserializersBigDecimalDeserializer numberDeserializersBigDecimalDeserializer : arrayList) {
            if (numberDeserializersBigDecimalDeserializer.MediaBrowserCompatItemReceiver != this.RemoteActionCompatParcelizer) {
                numberDeserializersBigDecimalDeserializer.read();
            }
        }
    }

    private void read(setIncludableProperties setincludableproperties, int i, int i2, setIncludableProperties setincludableproperties2, ArrayList<NumberDeserializersBigIntegerDeserializer> arrayList, NumberDeserializersBigIntegerDeserializer numberDeserializersBigIntegerDeserializer) {
        NumberDeserializersBigDecimalDeserializer numberDeserializersBigDecimalDeserializer = setincludableproperties.AudioAttributesImplApi26Parcelizer;
        if (numberDeserializersBigDecimalDeserializer.AudioAttributesImplApi21Parcelizer != null || numberDeserializersBigDecimalDeserializer == this.AudioAttributesImplApi26Parcelizer.MediaDescriptionCompat || numberDeserializersBigDecimalDeserializer == this.AudioAttributesImplApi26Parcelizer.onPrepareFromUri) {
            return;
        }
        if (numberDeserializersBigIntegerDeserializer == null) {
            numberDeserializersBigIntegerDeserializer = new NumberDeserializersBigIntegerDeserializer(numberDeserializersBigDecimalDeserializer, i2);
            arrayList.add(numberDeserializersBigIntegerDeserializer);
        }
        numberDeserializersBigDecimalDeserializer.AudioAttributesImplApi21Parcelizer = numberDeserializersBigIntegerDeserializer;
        numberDeserializersBigIntegerDeserializer.RemoteActionCompatParcelizer(numberDeserializersBigDecimalDeserializer);
        for (MapDeserializerMapReferring mapDeserializerMapReferring : numberDeserializersBigDecimalDeserializer.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer) {
            if (mapDeserializerMapReferring instanceof setIncludableProperties) {
                read((setIncludableProperties) mapDeserializerMapReferring, i, 0, setincludableproperties2, arrayList, numberDeserializersBigIntegerDeserializer);
            }
        }
        for (MapDeserializerMapReferring mapDeserializerMapReferring2 : numberDeserializersBigDecimalDeserializer.write.AudioAttributesCompatParcelizer) {
            if (mapDeserializerMapReferring2 instanceof setIncludableProperties) {
                read((setIncludableProperties) mapDeserializerMapReferring2, i, 1, setincludableproperties2, arrayList, numberDeserializersBigIntegerDeserializer);
            }
        }
        if (i == 1 && (numberDeserializersBigDecimalDeserializer instanceof NumberDeserializersBooleanDeserializer)) {
            for (MapDeserializerMapReferring mapDeserializerMapReferring3 : ((NumberDeserializersBooleanDeserializer) numberDeserializersBigDecimalDeserializer).RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer) {
                if (mapDeserializerMapReferring3 instanceof setIncludableProperties) {
                    read((setIncludableProperties) mapDeserializerMapReferring3, i, 2, setincludableproperties2, arrayList, numberDeserializersBigIntegerDeserializer);
                }
            }
        }
        for (setIncludableProperties setincludableproperties3 : numberDeserializersBigDecimalDeserializer.MediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer) {
            if (setincludableproperties3 == setincludableproperties2) {
                numberDeserializersBigIntegerDeserializer.AudioAttributesCompatParcelizer = true;
            }
            read(setincludableproperties3, i, 0, setincludableproperties2, arrayList, numberDeserializersBigIntegerDeserializer);
        }
        for (setIncludableProperties setincludableproperties4 : numberDeserializersBigDecimalDeserializer.write.AudioAttributesImplApi21Parcelizer) {
            if (setincludableproperties4 == setincludableproperties2) {
                numberDeserializersBigIntegerDeserializer.AudioAttributesCompatParcelizer = true;
            }
            read(setincludableproperties4, i, 1, setincludableproperties2, arrayList, numberDeserializersBigIntegerDeserializer);
        }
        if (i == 1 && (numberDeserializersBigDecimalDeserializer instanceof NumberDeserializersBooleanDeserializer)) {
            Iterator<setIncludableProperties> it = ((NumberDeserializersBooleanDeserializer) numberDeserializersBigDecimalDeserializer).RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer.iterator();
            while (it.hasNext()) {
                read(it.next(), i, 2, setincludableproperties2, arrayList, numberDeserializersBigIntegerDeserializer);
            }
        }
    }

    private void AudioAttributesCompatParcelizer(NumberDeserializersBigDecimalDeserializer numberDeserializersBigDecimalDeserializer, int i, ArrayList<NumberDeserializersBigIntegerDeserializer> arrayList) {
        for (MapDeserializerMapReferring mapDeserializerMapReferring : numberDeserializersBigDecimalDeserializer.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer) {
            if (mapDeserializerMapReferring instanceof setIncludableProperties) {
                read((setIncludableProperties) mapDeserializerMapReferring, i, 0, numberDeserializersBigDecimalDeserializer.write, arrayList, null);
            } else if (mapDeserializerMapReferring instanceof NumberDeserializersBigDecimalDeserializer) {
                read(((NumberDeserializersBigDecimalDeserializer) mapDeserializerMapReferring).MediaBrowserCompatMediaItem, i, 0, numberDeserializersBigDecimalDeserializer.write, arrayList, null);
            }
        }
        for (MapDeserializerMapReferring mapDeserializerMapReferring2 : numberDeserializersBigDecimalDeserializer.write.AudioAttributesCompatParcelizer) {
            if (mapDeserializerMapReferring2 instanceof setIncludableProperties) {
                read((setIncludableProperties) mapDeserializerMapReferring2, i, 1, numberDeserializersBigDecimalDeserializer.MediaBrowserCompatMediaItem, arrayList, null);
            } else if (mapDeserializerMapReferring2 instanceof NumberDeserializersBigDecimalDeserializer) {
                read(((NumberDeserializersBigDecimalDeserializer) mapDeserializerMapReferring2).write, i, 1, numberDeserializersBigDecimalDeserializer.MediaBrowserCompatMediaItem, arrayList, null);
            }
        }
        if (i == 1) {
            for (MapDeserializerMapReferring mapDeserializerMapReferring3 : ((NumberDeserializersBooleanDeserializer) numberDeserializersBigDecimalDeserializer).RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer) {
                if (mapDeserializerMapReferring3 instanceof setIncludableProperties) {
                    read((setIncludableProperties) mapDeserializerMapReferring3, i, 2, null, arrayList, null);
                }
            }
        }
    }
}
