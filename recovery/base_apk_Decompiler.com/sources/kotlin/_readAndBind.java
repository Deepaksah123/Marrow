package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import kotlin.JdkDeserializers;
import kotlin._int;

/* JADX INFO: loaded from: classes2.dex */
public final class _readAndBind {
    private _long write;
    private final ArrayList<JdkDeserializers> read = new ArrayList<>();
    private IconCompatParcelizer AudioAttributesCompatParcelizer = new IconCompatParcelizer();

    public static class IconCompatParcelizer {
        public int AudioAttributesCompatParcelizer;
        public int AudioAttributesImplApi21Parcelizer;
        public JdkDeserializers.IconCompatParcelizer AudioAttributesImplApi26Parcelizer;
        public int AudioAttributesImplBaseParcelizer;
        public boolean IconCompatParcelizer;
        public int MediaBrowserCompatCustomActionResultReceiver;
        public boolean MediaBrowserCompatItemReceiver;
        public int RemoteActionCompatParcelizer;
        public JdkDeserializers.IconCompatParcelizer read;
        public int write;
    }

    public interface write {
        void IconCompatParcelizer();

        void RemoteActionCompatParcelizer(JdkDeserializers jdkDeserializers, IconCompatParcelizer iconCompatParcelizer);
    }

    public final void RemoteActionCompatParcelizer(_long _longVar) {
        this.read.clear();
        int size = ((_isStdKeyDeser) _longVar).MediaSessionCompatQueueItem.size();
        for (int i = 0; i < size; i++) {
            JdkDeserializers jdkDeserializers = ((_isStdKeyDeser) _longVar).MediaSessionCompatQueueItem.get(i);
            if (jdkDeserializers.onPlayFromMediaId() == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT || jdkDeserializers.onSeekTo() == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT) {
                this.read.add(jdkDeserializers);
            }
        }
        _longVar.AudioAttributesImplApi26Parcelizer();
    }

    public _readAndBind(_long _longVar) {
        this.write = _longVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ad A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void IconCompatParcelizer(kotlin._long r12) {
        /*
            r11 = this;
            java.util.ArrayList<o.JdkDeserializers> r0 = r12.MediaSessionCompatQueueItem
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r12.AudioAttributesCompatParcelizer(r1)
            o._readAndBind$write r2 = r12.IconCompatParcelizer()
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r0) goto Lb1
            java.util.ArrayList<o.JdkDeserializers> r5 = r12.MediaSessionCompatQueueItem
            java.lang.Object r5 = r5.get(r4)
            o.JdkDeserializers r5 = (kotlin.JdkDeserializers) r5
            boolean r6 = r5 instanceof kotlin._deserializeUsingCreator
            if (r6 != 0) goto Lad
            boolean r6 = r5 instanceof kotlin._deSerializeBCP47Locale
            if (r6 != 0) goto Lad
            boolean r6 = r5.onSkipToPrevious()
            if (r6 != 0) goto Lad
            if (r1 == 0) goto L44
            o.NumberDeserializers r6 = r5.MediaDescriptionCompat
            if (r6 == 0) goto L44
            o.NumberDeserializersBooleanDeserializer r6 = r5.onPrepareFromUri
            if (r6 == 0) goto L44
            o.NumberDeserializers r6 = r5.MediaDescriptionCompat
            o._squashDups r6 = r6.AudioAttributesCompatParcelizer
            boolean r6 = r6.AudioAttributesImplBaseParcelizer
            if (r6 == 0) goto L44
            o.NumberDeserializersBooleanDeserializer r6 = r5.onPrepareFromUri
            o._squashDups r6 = r6.AudioAttributesCompatParcelizer
            boolean r6 = r6.AudioAttributesImplBaseParcelizer
            if (r6 != 0) goto Lad
        L44:
            o.JdkDeserializers$IconCompatParcelizer r6 = r5.RemoteActionCompatParcelizer(r3)
            r7 = 1
            o.JdkDeserializers$IconCompatParcelizer r8 = r5.RemoteActionCompatParcelizer(r7)
            o.JdkDeserializers$IconCompatParcelizer r9 = o.JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT
            if (r6 != r9) goto L5f
            int r9 = r5.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            if (r9 == r7) goto L5f
            o.JdkDeserializers$IconCompatParcelizer r9 = o.JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT
            if (r8 != r9) goto L5f
            int r9 = r5.onAddQueueItem
            if (r9 == r7) goto L5f
            r9 = r7
            goto L60
        L5f:
            r9 = r3
        L60:
            if (r9 != 0) goto La6
            boolean r9 = r12.AudioAttributesCompatParcelizer(r7)
            if (r9 == 0) goto La8
            boolean r9 = r5 instanceof kotlin._readAndBindStringKeyMap
            if (r9 != 0) goto La8
            o.JdkDeserializers$IconCompatParcelizer r9 = o.JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT
            if (r6 != r9) goto L80
            int r9 = r5.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            if (r9 != 0) goto L80
            o.JdkDeserializers$IconCompatParcelizer r9 = o.JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT
            if (r8 == r9) goto L80
            boolean r9 = r5.setSessionImpl()
            if (r9 != 0) goto L80
            r9 = r7
            goto L81
        L80:
            r9 = r3
        L81:
            o.JdkDeserializers$IconCompatParcelizer r10 = o.JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT
            if (r8 != r10) goto L94
            int r10 = r5.onAddQueueItem
            if (r10 != 0) goto L94
            o.JdkDeserializers$IconCompatParcelizer r10 = o.JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT
            if (r6 == r10) goto L94
            boolean r10 = r5.setSessionImpl()
            if (r10 != 0) goto L94
            goto L95
        L94:
            r7 = r9
        L95:
            o.JdkDeserializers$IconCompatParcelizer r9 = o.JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT
            if (r6 == r9) goto L9d
            o.JdkDeserializers$IconCompatParcelizer r6 = o.JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT
            if (r8 != r6) goto La5
        L9d:
            float r6 = r5.AudioAttributesImplApi21Parcelizer
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto La5
            goto Lad
        La5:
            r9 = r7
        La6:
            if (r9 != 0) goto Lad
        La8:
            r11.AudioAttributesCompatParcelizer(r2, r5, r3)
            o.useNullForUnknownEnum r5 = r12.onSkipToPrevious
        Lad:
            int r4 = r4 + 1
            goto L12
        Lb1:
            r2.IconCompatParcelizer()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._readAndBind.IconCompatParcelizer(o._long):void");
    }

    private void AudioAttributesCompatParcelizer(_long _longVar, int i, int i2, int i3) {
        useNullForUnknownEnum usenullforunknownenum = _longVar.onSkipToPrevious;
        int iOnPrepareFromSearch = _longVar.onPrepareFromSearch();
        int iOnPlayFromSearch = _longVar.onPlayFromSearch();
        _longVar.onCommand(0);
        _longVar.onCustomAction(0);
        _longVar.onFastForward(i2);
        _longVar.MediaMetadataCompat(i3);
        _longVar.onCommand(iOnPrepareFromSearch);
        _longVar.onCustomAction(iOnPlayFromSearch);
        this.write.onPause(i);
        this.write._init_lambda4();
        useNullForUnknownEnum usenullforunknownenum2 = _longVar.onSkipToPrevious;
    }

    public final long RemoteActionCompatParcelizer(_long _longVar, int i, int i2, int i3, int i4, int i5) {
        boolean zWrite;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        int i8;
        int i9;
        int i10;
        boolean z3;
        boolean zWrite2;
        write writeVarIconCompatParcelizer = _longVar.IconCompatParcelizer();
        int size = ((_isStdKeyDeser) _longVar).MediaSessionCompatQueueItem.size();
        int iOnSetShuffleMode = _longVar.onSetShuffleMode();
        int iOnAddQueueItem = _longVar.onAddQueueItem();
        boolean zIconCompatParcelizer = MapDeserializer.IconCompatParcelizer(i, 128);
        boolean z4 = zIconCompatParcelizer || MapDeserializer.IconCompatParcelizer(i, 64);
        if (z4) {
            for (int i11 = 0; i11 < size; i11++) {
                JdkDeserializers jdkDeserializers = ((_isStdKeyDeser) _longVar).MediaSessionCompatQueueItem.get(i11);
                boolean z5 = (jdkDeserializers.onPlayFromMediaId() == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT) && (jdkDeserializers.onSeekTo() == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT) && jdkDeserializers.handleMediaPlayPauseIfPendingOnHandler() > BitmapDescriptorFactory.HUE_RED;
                if ((jdkDeserializers.setSessionImpl() && z5) || ((jdkDeserializers.onSkipToNext() && z5) || (jdkDeserializers instanceof _readAndBindStringKeyMap) || jdkDeserializers.setSessionImpl() || jdkDeserializers.onSkipToNext())) {
                    z4 = false;
                    break;
                }
            }
            z4 = true;
        }
        boolean z6 = z4 & ((i2 == 1073741824 && i4 == 1073741824) || zIconCompatParcelizer);
        if (z6) {
            int iMin = Math.min(_longVar.onPrepare(), i3);
            int iMin2 = Math.min(_longVar.onFastForward(), i5);
            if (i2 == 1073741824 && _longVar.onSetShuffleMode() != iMin) {
                _longVar.onFastForward(iMin);
                _longVar.AudioAttributesImplApi26Parcelizer();
            }
            if (i4 == 1073741824 && _longVar.onAddQueueItem() != iMin2) {
                _longVar.MediaMetadataCompat(iMin2);
                _longVar.AudioAttributesImplApi26Parcelizer();
            }
            if (i2 == 1073741824 && i4 == 1073741824) {
                zWrite = _longVar.RemoteActionCompatParcelizer(zIconCompatParcelizer);
                i6 = 2;
            } else {
                boolean zAudioAttributesCompatParcelizer = _longVar.AudioAttributesCompatParcelizer();
                if (i2 == 1073741824) {
                    zWrite2 = zAudioAttributesCompatParcelizer & _longVar.write(zIconCompatParcelizer, 0);
                    i6 = 1;
                } else {
                    zWrite2 = zAudioAttributesCompatParcelizer;
                    i6 = 0;
                }
                if (i4 == 1073741824) {
                    zWrite = _longVar.write(zIconCompatParcelizer, 1) & zWrite2;
                    i6++;
                } else {
                    zWrite = zWrite2;
                }
            }
            if (zWrite) {
                _longVar.read(i2 == 1073741824, i4 == 1073741824);
            }
        } else {
            zWrite = false;
            i6 = 0;
        }
        if (!zWrite || i6 != 2) {
            int iWrite = _longVar.write();
            if (size > 0) {
                IconCompatParcelizer(_longVar);
            }
            useNullForUnknownEnum usenullforunknownenum = _longVar.onSkipToPrevious;
            RemoteActionCompatParcelizer(_longVar);
            int size2 = this.read.size();
            if (size > 0) {
                AudioAttributesCompatParcelizer(_longVar, 0, iOnSetShuffleMode, iOnAddQueueItem);
            }
            if (size2 > 0) {
                boolean z7 = _longVar.onPlayFromMediaId() == JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT;
                boolean z8 = _longVar.onSeekTo() == JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT;
                int iMax = Math.max(_longVar.onSetShuffleMode(), this.write.onPrepareFromSearch());
                int iMax2 = Math.max(_longVar.onAddQueueItem(), this.write.onPlayFromSearch());
                int i12 = 0;
                boolean z_init_lambda5 = false;
                while (i12 < size2) {
                    JdkDeserializers jdkDeserializers2 = this.read.get(i12);
                    if (jdkDeserializers2 instanceof _readAndBindStringKeyMap) {
                        int iOnSetShuffleMode2 = jdkDeserializers2.onSetShuffleMode();
                        i8 = iWrite;
                        int iOnAddQueueItem2 = jdkDeserializers2.onAddQueueItem();
                        i9 = iOnSetShuffleMode;
                        boolean zAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(writeVarIconCompatParcelizer, jdkDeserializers2, 1);
                        useNullForUnknownEnum usenullforunknownenum2 = _longVar.onSkipToPrevious;
                        int iOnSetShuffleMode3 = jdkDeserializers2.onSetShuffleMode();
                        i10 = iOnAddQueueItem;
                        int iOnAddQueueItem3 = jdkDeserializers2.onAddQueueItem();
                        if (iOnSetShuffleMode3 != iOnSetShuffleMode2) {
                            jdkDeserializers2.onFastForward(iOnSetShuffleMode3);
                            if (z7 && jdkDeserializers2.onPlayFromUri() > iMax) {
                                iMax = Math.max(iMax, jdkDeserializers2.onPlayFromUri() + jdkDeserializers2.write(_int.read.RIGHT).write());
                            }
                            z3 = true;
                        } else {
                            z3 = z_init_lambda5 | zAudioAttributesCompatParcelizer2;
                        }
                        if (iOnAddQueueItem3 != iOnAddQueueItem2) {
                            jdkDeserializers2.MediaMetadataCompat(iOnAddQueueItem3);
                            if (z8 && jdkDeserializers2.MediaDescriptionCompat() > iMax2) {
                                iMax2 = Math.max(iMax2, jdkDeserializers2.MediaDescriptionCompat() + jdkDeserializers2.write(_int.read.BOTTOM).write());
                            }
                            z3 = true;
                        }
                        z_init_lambda5 = z3 | ((_readAndBindStringKeyMap) jdkDeserializers2)._init_lambda5();
                    } else {
                        i8 = iWrite;
                        i9 = iOnSetShuffleMode;
                        i10 = iOnAddQueueItem;
                    }
                    i12++;
                    iWrite = i8;
                    iOnSetShuffleMode = i9;
                    iOnAddQueueItem = i10;
                }
                int i13 = iWrite;
                int i14 = iOnSetShuffleMode;
                int i15 = iOnAddQueueItem;
                int i16 = 2;
                int i17 = 0;
                while (i17 < i16) {
                    int i18 = 0;
                    while (i18 < size2) {
                        JdkDeserializers jdkDeserializers3 = this.read.get(i18);
                        if (((jdkDeserializers3 instanceof JsonNodeDeserializer) && !(jdkDeserializers3 instanceof _readAndBindStringKeyMap)) || (jdkDeserializers3 instanceof _deserializeUsingCreator) || jdkDeserializers3.onRewind() == 8 || ((z6 && jdkDeserializers3.MediaDescriptionCompat.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer && jdkDeserializers3.onPrepareFromUri.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer) || (jdkDeserializers3 instanceof _readAndBindStringKeyMap))) {
                            z = z6;
                        } else {
                            int iOnSetShuffleMode4 = jdkDeserializers3.onSetShuffleMode();
                            int iOnAddQueueItem4 = jdkDeserializers3.onAddQueueItem();
                            int iMediaMetadataCompat = jdkDeserializers3.MediaMetadataCompat();
                            z = z6;
                            boolean zAudioAttributesCompatParcelizer3 = AudioAttributesCompatParcelizer(writeVarIconCompatParcelizer, jdkDeserializers3, i17 == 1 ? 2 : 1) | z_init_lambda5;
                            useNullForUnknownEnum usenullforunknownenum3 = _longVar.onSkipToPrevious;
                            int iOnSetShuffleMode5 = jdkDeserializers3.onSetShuffleMode();
                            int iOnAddQueueItem5 = jdkDeserializers3.onAddQueueItem();
                            if (iOnSetShuffleMode5 != iOnSetShuffleMode4) {
                                jdkDeserializers3.onFastForward(iOnSetShuffleMode5);
                                if (z7 && jdkDeserializers3.onPlayFromUri() > iMax) {
                                    iMax = Math.max(iMax, jdkDeserializers3.onPlayFromUri() + jdkDeserializers3.write(_int.read.RIGHT).write());
                                }
                                z2 = true;
                            } else {
                                z2 = zAudioAttributesCompatParcelizer3;
                            }
                            if (iOnAddQueueItem5 != iOnAddQueueItem4) {
                                jdkDeserializers3.MediaMetadataCompat(iOnAddQueueItem5);
                                if (z8 && jdkDeserializers3.MediaDescriptionCompat() > iMax2) {
                                    iMax2 = Math.max(iMax2, jdkDeserializers3.MediaDescriptionCompat() + jdkDeserializers3.write(_int.read.BOTTOM).write());
                                }
                                z2 = true;
                            }
                            if (jdkDeserializers3.onSetCaptioningEnabled() && iMediaMetadataCompat != jdkDeserializers3.MediaMetadataCompat()) {
                                z2 = true;
                            }
                            z_init_lambda5 = z2;
                        }
                        i18++;
                        z6 = z;
                    }
                    boolean z9 = z6;
                    if (!z_init_lambda5) {
                        break;
                    }
                    i17++;
                    AudioAttributesCompatParcelizer(_longVar, i17, i14, i15);
                    z6 = z9;
                    i16 = 2;
                    z_init_lambda5 = false;
                }
                i7 = i13;
            } else {
                i7 = iWrite;
            }
            _longVar.read(i7);
        }
        useNullForUnknownEnum usenullforunknownenum4 = _longVar.onSkipToPrevious;
        return 0L;
    }

    private boolean AudioAttributesCompatParcelizer(write writeVar, JdkDeserializers jdkDeserializers, int i) {
        this.AudioAttributesCompatParcelizer.read = jdkDeserializers.onPlayFromMediaId();
        this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer = jdkDeserializers.onSeekTo();
        this.AudioAttributesCompatParcelizer.write = jdkDeserializers.onSetShuffleMode();
        this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer = jdkDeserializers.onAddQueueItem();
        this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver = false;
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer = i;
        boolean z = this.AudioAttributesCompatParcelizer.read == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT;
        boolean z2 = this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT;
        boolean z3 = z && jdkDeserializers.AudioAttributesImplApi21Parcelizer > BitmapDescriptorFactory.HUE_RED;
        boolean z4 = z2 && jdkDeserializers.AudioAttributesImplApi21Parcelizer > BitmapDescriptorFactory.HUE_RED;
        if (z3 && jdkDeserializers.onPrepareFromSearch[0] == 4) {
            this.AudioAttributesCompatParcelizer.read = JdkDeserializers.IconCompatParcelizer.FIXED;
        }
        if (z4 && jdkDeserializers.onPrepareFromSearch[1] == 4) {
            this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer = JdkDeserializers.IconCompatParcelizer.FIXED;
        }
        writeVar.RemoteActionCompatParcelizer(jdkDeserializers, this.AudioAttributesCompatParcelizer);
        jdkDeserializers.onFastForward(this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver);
        jdkDeserializers.MediaMetadataCompat(this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer);
        jdkDeserializers.read(this.AudioAttributesCompatParcelizer.IconCompatParcelizer);
        jdkDeserializers.MediaBrowserCompatSearchResultReceiver(this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer);
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer = 0;
        return this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver;
    }
}
