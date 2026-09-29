package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.JdkDeserializers;
import kotlin._int;
import kotlin._readAndBind;

/* JADX INFO: loaded from: classes2.dex */
public final class NumberDeserializers1 {
    private static _readAndBind.IconCompatParcelizer read = new _readAndBind.IconCompatParcelizer();
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 0;

    public static void AudioAttributesCompatParcelizer(_long _longVar, _readAndBind.write writeVar) {
        JdkDeserializers.IconCompatParcelizer iconCompatParcelizerOnPlayFromMediaId = _longVar.onPlayFromMediaId();
        JdkDeserializers.IconCompatParcelizer iconCompatParcelizerOnSeekTo = _longVar.onSeekTo();
        RemoteActionCompatParcelizer = 0;
        write = 0;
        _longVar.PlaybackStateCompatCustomAction();
        ArrayList<JdkDeserializers> arrayListAccessgetReportFullyDrawnExecutorp = _longVar.accessgetReportFullyDrawnExecutorp();
        int size = arrayListAccessgetReportFullyDrawnExecutorp.size();
        for (int i = 0; i < size; i++) {
            arrayListAccessgetReportFullyDrawnExecutorp.get(i).PlaybackStateCompatCustomAction();
        }
        boolean z_init_lambda5 = _longVar._init_lambda5();
        if (iconCompatParcelizerOnPlayFromMediaId == JdkDeserializers.IconCompatParcelizer.FIXED) {
            _longVar.write(0, _longVar.onSetShuffleMode());
        } else {
            _longVar._init_lambda2();
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            JdkDeserializers jdkDeserializers = arrayListAccessgetReportFullyDrawnExecutorp.get(i2);
            if (jdkDeserializers instanceof _deserializeUsingCreator) {
                _deserializeUsingCreator _deserializeusingcreator = (_deserializeUsingCreator) jdkDeserializers;
                if (_deserializeusingcreator.IconCompatParcelizer() == 1) {
                    if (_deserializeusingcreator.write() != -1) {
                        _deserializeusingcreator.AudioAttributesCompatParcelizer(_deserializeusingcreator.write());
                    } else if (_deserializeusingcreator.RemoteActionCompatParcelizer() != -1 && _longVar.AudioAttributesImplApi21Parcelizer()) {
                        _deserializeusingcreator.AudioAttributesCompatParcelizer(_longVar.onSetShuffleMode() - _deserializeusingcreator.RemoteActionCompatParcelizer());
                    } else if (_longVar.AudioAttributesImplApi21Parcelizer()) {
                        _deserializeusingcreator.AudioAttributesCompatParcelizer((int) ((_deserializeusingcreator.AudioAttributesImplApi26Parcelizer() * _longVar.onSetShuffleMode()) + 0.5f));
                    }
                    z = true;
                }
            } else if ((jdkDeserializers instanceof _deSerializeBCP47Locale) && ((_deSerializeBCP47Locale) jdkDeserializers).AudioAttributesImplApi26Parcelizer() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                JdkDeserializers jdkDeserializers2 = arrayListAccessgetReportFullyDrawnExecutorp.get(i3);
                if (jdkDeserializers2 instanceof _deserializeUsingCreator) {
                    _deserializeUsingCreator _deserializeusingcreator2 = (_deserializeUsingCreator) jdkDeserializers2;
                    if (_deserializeusingcreator2.IconCompatParcelizer() == 1) {
                        IconCompatParcelizer(0, _deserializeusingcreator2, writeVar, z_init_lambda5);
                    }
                }
            }
        }
        IconCompatParcelizer(0, _longVar, writeVar, z_init_lambda5);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                JdkDeserializers jdkDeserializers3 = arrayListAccessgetReportFullyDrawnExecutorp.get(i4);
                if (jdkDeserializers3 instanceof _deSerializeBCP47Locale) {
                    _deSerializeBCP47Locale _deserializebcp47locale = (_deSerializeBCP47Locale) jdkDeserializers3;
                    if (_deserializebcp47locale.AudioAttributesImplApi26Parcelizer() == 0) {
                        read(_deserializebcp47locale, writeVar, 0, z_init_lambda5);
                    }
                }
            }
        }
        if (iconCompatParcelizerOnSeekTo == JdkDeserializers.IconCompatParcelizer.FIXED) {
            _longVar.IconCompatParcelizer(0, _longVar.onAddQueueItem());
        } else {
            _longVar.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8();
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            JdkDeserializers jdkDeserializers4 = arrayListAccessgetReportFullyDrawnExecutorp.get(i5);
            if (jdkDeserializers4 instanceof _deserializeUsingCreator) {
                _deserializeUsingCreator _deserializeusingcreator3 = (_deserializeUsingCreator) jdkDeserializers4;
                if (_deserializeusingcreator3.IconCompatParcelizer() == 0) {
                    if (_deserializeusingcreator3.write() != -1) {
                        _deserializeusingcreator3.AudioAttributesCompatParcelizer(_deserializeusingcreator3.write());
                    } else if (_deserializeusingcreator3.RemoteActionCompatParcelizer() != -1 && _longVar.MediaBrowserCompatCustomActionResultReceiver()) {
                        _deserializeusingcreator3.AudioAttributesCompatParcelizer(_longVar.onAddQueueItem() - _deserializeusingcreator3.RemoteActionCompatParcelizer());
                    } else if (_longVar.MediaBrowserCompatCustomActionResultReceiver()) {
                        _deserializeusingcreator3.AudioAttributesCompatParcelizer((int) ((_deserializeusingcreator3.AudioAttributesImplApi26Parcelizer() * _longVar.onAddQueueItem()) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((jdkDeserializers4 instanceof _deSerializeBCP47Locale) && ((_deSerializeBCP47Locale) jdkDeserializers4).AudioAttributesImplApi26Parcelizer() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                JdkDeserializers jdkDeserializers5 = arrayListAccessgetReportFullyDrawnExecutorp.get(i6);
                if (jdkDeserializers5 instanceof _deserializeUsingCreator) {
                    _deserializeUsingCreator _deserializeusingcreator4 = (_deserializeUsingCreator) jdkDeserializers5;
                    if (_deserializeusingcreator4.IconCompatParcelizer() == 0) {
                        read(1, _deserializeusingcreator4, writeVar);
                    }
                }
            }
        }
        read(0, _longVar, writeVar);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                JdkDeserializers jdkDeserializers6 = arrayListAccessgetReportFullyDrawnExecutorp.get(i7);
                if (jdkDeserializers6 instanceof _deSerializeBCP47Locale) {
                    _deSerializeBCP47Locale _deserializebcp47locale2 = (_deSerializeBCP47Locale) jdkDeserializers6;
                    if (_deserializebcp47locale2.AudioAttributesImplApi26Parcelizer() == 1) {
                        read(_deserializebcp47locale2, writeVar, 1, z_init_lambda5);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            JdkDeserializers jdkDeserializers7 = arrayListAccessgetReportFullyDrawnExecutorp.get(i8);
            if (jdkDeserializers7.MediaSessionCompatResultReceiverWrapper() && read(jdkDeserializers7)) {
                _long.IconCompatParcelizer(jdkDeserializers7, writeVar, read, 0);
                if (jdkDeserializers7 instanceof _deserializeUsingCreator) {
                    if (((_deserializeUsingCreator) jdkDeserializers7).IconCompatParcelizer() == 0) {
                        read(0, jdkDeserializers7, writeVar);
                    } else {
                        IconCompatParcelizer(0, jdkDeserializers7, writeVar, z_init_lambda5);
                    }
                } else {
                    IconCompatParcelizer(0, jdkDeserializers7, writeVar, z_init_lambda5);
                    read(0, jdkDeserializers7, writeVar);
                }
            }
        }
    }

    private static void read(_deSerializeBCP47Locale _deserializebcp47locale, _readAndBind.write writeVar, int i, boolean z) {
        if (_deserializebcp47locale.write()) {
            if (i == 0) {
                IconCompatParcelizer(1, _deserializebcp47locale, writeVar, z);
            } else {
                read(1, _deserializebcp47locale, writeVar);
            }
        }
    }

    private static void IconCompatParcelizer(int i, JdkDeserializers jdkDeserializers, _readAndBind.write writeVar, boolean z) {
        boolean z2;
        if (jdkDeserializers.onStop()) {
            return;
        }
        int i2 = 1;
        RemoteActionCompatParcelizer++;
        int i3 = 0;
        if (!(jdkDeserializers instanceof _long) && jdkDeserializers.MediaSessionCompatResultReceiverWrapper() && read(jdkDeserializers)) {
            _long.IconCompatParcelizer(jdkDeserializers, writeVar, new _readAndBind.IconCompatParcelizer(), 0);
        }
        _int _intVarWrite = jdkDeserializers.write(_int.read.LEFT);
        _int _intVarWrite2 = jdkDeserializers.write(_int.read.RIGHT);
        int i4 = _intVarWrite.read();
        int i5 = _intVarWrite2.read();
        if (_intVarWrite.IconCompatParcelizer() != null && _intVarWrite.MediaDescriptionCompat()) {
            Iterator<_int> it = _intVarWrite.IconCompatParcelizer().iterator();
            while (it.hasNext()) {
                _int next = it.next();
                JdkDeserializers jdkDeserializers2 = next.IconCompatParcelizer;
                int i6 = i + 1;
                boolean z3 = read(jdkDeserializers2);
                if (jdkDeserializers2.MediaSessionCompatResultReceiverWrapper() && z3) {
                    _long.IconCompatParcelizer(jdkDeserializers2, writeVar, new _readAndBind.IconCompatParcelizer(), i3);
                }
                int i7 = ((next == jdkDeserializers2.MediaMetadataCompat && jdkDeserializers2.onPrepareFromMediaId.read != null && jdkDeserializers2.onPrepareFromMediaId.read.MediaDescriptionCompat()) || (next == jdkDeserializers2.onPrepareFromMediaId && jdkDeserializers2.MediaMetadataCompat.read != null && jdkDeserializers2.MediaMetadataCompat.read.MediaDescriptionCompat())) ? i2 : i3;
                if (jdkDeserializers2.onPlayFromMediaId() != JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT || z3) {
                    if (!jdkDeserializers2.MediaSessionCompatResultReceiverWrapper()) {
                        if (next == jdkDeserializers2.MediaMetadataCompat && jdkDeserializers2.onPrepareFromMediaId.read == null) {
                            int iWrite = jdkDeserializers2.MediaMetadataCompat.write() + i4;
                            jdkDeserializers2.write(iWrite, jdkDeserializers2.onSetShuffleMode() + iWrite);
                            IconCompatParcelizer(i6, jdkDeserializers2, writeVar, z);
                        } else if (next == jdkDeserializers2.onPrepareFromMediaId && jdkDeserializers2.MediaMetadataCompat.read == null) {
                            int iWrite2 = i4 - jdkDeserializers2.onPrepareFromMediaId.write();
                            jdkDeserializers2.write(iWrite2 - jdkDeserializers2.onSetShuffleMode(), iWrite2);
                            IconCompatParcelizer(i6, jdkDeserializers2, writeVar, z);
                        } else if (i7 != 0 && !jdkDeserializers2.setSessionImpl()) {
                            RemoteActionCompatParcelizer(i6, writeVar, jdkDeserializers2, z);
                        }
                    }
                } else if (jdkDeserializers2.onPlayFromMediaId() == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT && jdkDeserializers2.handleMediaPlayPauseIfPendingOnHandler >= 0 && jdkDeserializers2.onPlayFromMediaId >= 0 && ((jdkDeserializers2.onRewind() == 8 || (jdkDeserializers2.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 0 && jdkDeserializers2.handleMediaPlayPauseIfPendingOnHandler() == BitmapDescriptorFactory.HUE_RED)) && !jdkDeserializers2.setSessionImpl() && !jdkDeserializers2.onSkipToPrevious() && i7 != 0 && !jdkDeserializers2.setSessionImpl())) {
                    read(i6, jdkDeserializers, writeVar, jdkDeserializers2, z);
                }
                i2 = 1;
                i3 = 0;
            }
        }
        if (jdkDeserializers instanceof _deserializeUsingCreator) {
            return;
        }
        if (_intVarWrite2.IconCompatParcelizer() != null && _intVarWrite2.MediaDescriptionCompat()) {
            Iterator<_int> it2 = _intVarWrite2.IconCompatParcelizer().iterator();
            while (it2.hasNext()) {
                _int next2 = it2.next();
                JdkDeserializers jdkDeserializers3 = next2.IconCompatParcelizer;
                int i8 = i + 1;
                boolean z4 = read(jdkDeserializers3);
                if (jdkDeserializers3.MediaSessionCompatResultReceiverWrapper() && z4) {
                    z2 = false;
                    _long.IconCompatParcelizer(jdkDeserializers3, writeVar, new _readAndBind.IconCompatParcelizer(), 0);
                } else {
                    z2 = false;
                }
                boolean z5 = ((next2 == jdkDeserializers3.MediaMetadataCompat && jdkDeserializers3.onPrepareFromMediaId.read != null && jdkDeserializers3.onPrepareFromMediaId.read.MediaDescriptionCompat()) || (next2 == jdkDeserializers3.onPrepareFromMediaId && jdkDeserializers3.MediaMetadataCompat.read != null && jdkDeserializers3.MediaMetadataCompat.read.MediaDescriptionCompat())) ? true : z2;
                if (jdkDeserializers3.onPlayFromMediaId() != JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT || z4) {
                    if (!jdkDeserializers3.MediaSessionCompatResultReceiverWrapper()) {
                        if (next2 == jdkDeserializers3.MediaMetadataCompat && jdkDeserializers3.onPrepareFromMediaId.read == null) {
                            int iWrite3 = jdkDeserializers3.MediaMetadataCompat.write() + i5;
                            jdkDeserializers3.write(iWrite3, jdkDeserializers3.onSetShuffleMode() + iWrite3);
                            IconCompatParcelizer(i8, jdkDeserializers3, writeVar, z);
                        } else if (next2 == jdkDeserializers3.onPrepareFromMediaId && jdkDeserializers3.MediaMetadataCompat.read == null) {
                            int iWrite4 = i5 - jdkDeserializers3.onPrepareFromMediaId.write();
                            jdkDeserializers3.write(iWrite4 - jdkDeserializers3.onSetShuffleMode(), iWrite4);
                            IconCompatParcelizer(i8, jdkDeserializers3, writeVar, z);
                        } else if (z5 && !jdkDeserializers3.setSessionImpl()) {
                            RemoteActionCompatParcelizer(i8, writeVar, jdkDeserializers3, z);
                        }
                    }
                } else if (jdkDeserializers3.onPlayFromMediaId() == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT && jdkDeserializers3.handleMediaPlayPauseIfPendingOnHandler >= 0 && jdkDeserializers3.onPlayFromMediaId >= 0 && (jdkDeserializers3.onRewind() == 8 || (jdkDeserializers3.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 0 && jdkDeserializers3.handleMediaPlayPauseIfPendingOnHandler() == BitmapDescriptorFactory.HUE_RED))) {
                    if (!jdkDeserializers3.setSessionImpl() && !jdkDeserializers3.onSkipToPrevious() && z5 && !jdkDeserializers3.setSessionImpl()) {
                        read(i8, jdkDeserializers, writeVar, jdkDeserializers3, z);
                    }
                }
            }
        }
        jdkDeserializers.ParcelableVolumeInfo();
    }

    private static void read(int i, JdkDeserializers jdkDeserializers, _readAndBind.write writeVar) {
        if (jdkDeserializers.MediaSessionCompatToken()) {
            return;
        }
        boolean z = true;
        write++;
        if (!(jdkDeserializers instanceof _long) && jdkDeserializers.MediaSessionCompatResultReceiverWrapper() && read(jdkDeserializers)) {
            _long.IconCompatParcelizer(jdkDeserializers, writeVar, new _readAndBind.IconCompatParcelizer(), 0);
        }
        _int _intVarWrite = jdkDeserializers.write(_int.read.TOP);
        _int _intVarWrite2 = jdkDeserializers.write(_int.read.BOTTOM);
        int i2 = _intVarWrite.read();
        int i3 = _intVarWrite2.read();
        if (_intVarWrite.IconCompatParcelizer() != null && _intVarWrite.MediaDescriptionCompat()) {
            Iterator<_int> it = _intVarWrite.IconCompatParcelizer().iterator();
            while (it.hasNext()) {
                _int next = it.next();
                JdkDeserializers jdkDeserializers2 = next.IconCompatParcelizer;
                int i4 = i + 1;
                boolean z2 = read(jdkDeserializers2);
                if (jdkDeserializers2.MediaSessionCompatResultReceiverWrapper() && z2) {
                    _long.IconCompatParcelizer(jdkDeserializers2, writeVar, new _readAndBind.IconCompatParcelizer(), 0);
                }
                boolean z3 = ((next == jdkDeserializers2.onSeekTo && jdkDeserializers2.AudioAttributesImplApi26Parcelizer.read != null && jdkDeserializers2.AudioAttributesImplApi26Parcelizer.read.MediaDescriptionCompat()) || (next == jdkDeserializers2.AudioAttributesImplApi26Parcelizer && jdkDeserializers2.onSeekTo.read != null && jdkDeserializers2.onSeekTo.read.MediaDescriptionCompat())) ? z : false;
                if (jdkDeserializers2.onSeekTo() != JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT || z2) {
                    if (!jdkDeserializers2.MediaSessionCompatResultReceiverWrapper()) {
                        if (next == jdkDeserializers2.onSeekTo && jdkDeserializers2.AudioAttributesImplApi26Parcelizer.read == null) {
                            int iWrite = jdkDeserializers2.onSeekTo.write() + i2;
                            jdkDeserializers2.IconCompatParcelizer(iWrite, jdkDeserializers2.onAddQueueItem() + iWrite);
                            read(i4, jdkDeserializers2, writeVar);
                        } else if (next == jdkDeserializers2.AudioAttributesImplApi26Parcelizer && jdkDeserializers2.onSeekTo.read == null) {
                            int iWrite2 = i2 - jdkDeserializers2.AudioAttributesImplApi26Parcelizer.write();
                            jdkDeserializers2.IconCompatParcelizer(iWrite2 - jdkDeserializers2.onAddQueueItem(), iWrite2);
                            read(i4, jdkDeserializers2, writeVar);
                        } else if (z3 && !jdkDeserializers2.onSkipToNext()) {
                            AudioAttributesCompatParcelizer(i4, writeVar, jdkDeserializers2);
                        }
                    }
                } else if (jdkDeserializers2.onSeekTo() == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT && jdkDeserializers2.onCustomAction >= 0 && jdkDeserializers2.onPause >= 0 && ((jdkDeserializers2.onRewind() == 8 || (jdkDeserializers2.onAddQueueItem == 0 && jdkDeserializers2.handleMediaPlayPauseIfPendingOnHandler() == BitmapDescriptorFactory.HUE_RED)) && !jdkDeserializers2.onSkipToNext() && !jdkDeserializers2.onSkipToPrevious() && z3 && !jdkDeserializers2.onSkipToNext())) {
                    IconCompatParcelizer(i4, jdkDeserializers, writeVar, jdkDeserializers2);
                }
                z = true;
            }
        }
        if (jdkDeserializers instanceof _deserializeUsingCreator) {
            return;
        }
        if (_intVarWrite2.IconCompatParcelizer() != null && _intVarWrite2.MediaDescriptionCompat()) {
            Iterator<_int> it2 = _intVarWrite2.IconCompatParcelizer().iterator();
            while (it2.hasNext()) {
                _int next2 = it2.next();
                JdkDeserializers jdkDeserializers3 = next2.IconCompatParcelizer;
                int i5 = i + 1;
                boolean z4 = read(jdkDeserializers3);
                if (jdkDeserializers3.MediaSessionCompatResultReceiverWrapper() && z4) {
                    _long.IconCompatParcelizer(jdkDeserializers3, writeVar, new _readAndBind.IconCompatParcelizer(), 0);
                }
                boolean z5 = (next2 == jdkDeserializers3.onSeekTo && jdkDeserializers3.AudioAttributesImplApi26Parcelizer.read != null && jdkDeserializers3.AudioAttributesImplApi26Parcelizer.read.MediaDescriptionCompat()) || (next2 == jdkDeserializers3.AudioAttributesImplApi26Parcelizer && jdkDeserializers3.onSeekTo.read != null && jdkDeserializers3.onSeekTo.read.MediaDescriptionCompat());
                if (jdkDeserializers3.onSeekTo() != JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT || z4) {
                    if (!jdkDeserializers3.MediaSessionCompatResultReceiverWrapper()) {
                        if (next2 == jdkDeserializers3.onSeekTo && jdkDeserializers3.AudioAttributesImplApi26Parcelizer.read == null) {
                            int iWrite3 = jdkDeserializers3.onSeekTo.write() + i3;
                            jdkDeserializers3.IconCompatParcelizer(iWrite3, jdkDeserializers3.onAddQueueItem() + iWrite3);
                            read(i5, jdkDeserializers3, writeVar);
                        } else if (next2 == jdkDeserializers3.AudioAttributesImplApi26Parcelizer && jdkDeserializers3.onSeekTo.read == null) {
                            int iWrite4 = i3 - jdkDeserializers3.AudioAttributesImplApi26Parcelizer.write();
                            jdkDeserializers3.IconCompatParcelizer(iWrite4 - jdkDeserializers3.onAddQueueItem(), iWrite4);
                            read(i5, jdkDeserializers3, writeVar);
                        } else if (z5 && !jdkDeserializers3.onSkipToNext()) {
                            AudioAttributesCompatParcelizer(i5, writeVar, jdkDeserializers3);
                        }
                    }
                } else if (jdkDeserializers3.onSeekTo() == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT && jdkDeserializers3.onCustomAction >= 0 && jdkDeserializers3.onPause >= 0 && (jdkDeserializers3.onRewind() == 8 || (jdkDeserializers3.onAddQueueItem == 0 && jdkDeserializers3.handleMediaPlayPauseIfPendingOnHandler() == BitmapDescriptorFactory.HUE_RED))) {
                    if (!jdkDeserializers3.onSkipToNext() && !jdkDeserializers3.onSkipToPrevious() && z5 && !jdkDeserializers3.onSkipToNext()) {
                        IconCompatParcelizer(i5, jdkDeserializers, writeVar, jdkDeserializers3);
                    }
                }
            }
        }
        _int _intVarWrite3 = jdkDeserializers.write(_int.read.BASELINE);
        if (_intVarWrite3.IconCompatParcelizer() != null && _intVarWrite3.MediaDescriptionCompat()) {
            int i6 = _intVarWrite3.read();
            for (_int _intVar : _intVarWrite3.IconCompatParcelizer()) {
                JdkDeserializers jdkDeserializers4 = _intVar.IconCompatParcelizer;
                int i7 = i + 1;
                boolean z6 = read(jdkDeserializers4);
                if (jdkDeserializers4.MediaSessionCompatResultReceiverWrapper() && z6) {
                    _long.IconCompatParcelizer(jdkDeserializers4, writeVar, new _readAndBind.IconCompatParcelizer(), 0);
                }
                if (jdkDeserializers4.onSeekTo() != JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT || z6) {
                    if (!jdkDeserializers4.MediaSessionCompatResultReceiverWrapper() && _intVar == jdkDeserializers4.read) {
                        jdkDeserializers4.MediaDescriptionCompat(_intVar.write() + i6);
                        read(i7, jdkDeserializers4, writeVar);
                    }
                }
            }
        }
        jdkDeserializers.MediaSessionCompatQueueItem();
    }

    private static void RemoteActionCompatParcelizer(int i, _readAndBind.write writeVar, JdkDeserializers jdkDeserializers, boolean z) {
        float fMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = jdkDeserializers.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        int i2 = jdkDeserializers.MediaMetadataCompat.read.read();
        int i3 = jdkDeserializers.onPrepareFromMediaId.read.read();
        int iWrite = jdkDeserializers.MediaMetadataCompat.write();
        int iWrite2 = jdkDeserializers.onPrepareFromMediaId.write();
        if (i2 == i3) {
            fMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 0.5f;
        } else {
            i2 += iWrite;
            i3 -= iWrite2;
        }
        int iOnSetShuffleMode = jdkDeserializers.onSetShuffleMode();
        int i4 = (i3 - i2) - iOnSetShuffleMode;
        if (i2 > i3) {
            i4 = (i2 - i3) - iOnSetShuffleMode;
        }
        int i5 = ((int) (i4 > 0 ? (fMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver * i4) + 0.5f : fMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver * i4)) + i2;
        int i6 = i5 + iOnSetShuffleMode;
        if (i2 > i3) {
            i6 = i5 - iOnSetShuffleMode;
        }
        jdkDeserializers.write(i5, i6);
        IconCompatParcelizer(i + 1, jdkDeserializers, writeVar, z);
    }

    private static void AudioAttributesCompatParcelizer(int i, _readAndBind.write writeVar, JdkDeserializers jdkDeserializers) {
        float fOnRemoveQueueItem = jdkDeserializers.onRemoveQueueItem();
        int i2 = jdkDeserializers.onSeekTo.read.read();
        int i3 = jdkDeserializers.AudioAttributesImplApi26Parcelizer.read.read();
        int iWrite = jdkDeserializers.onSeekTo.write();
        int iWrite2 = jdkDeserializers.AudioAttributesImplApi26Parcelizer.write();
        if (i2 == i3) {
            fOnRemoveQueueItem = 0.5f;
        } else {
            i2 += iWrite;
            i3 -= iWrite2;
        }
        int iOnAddQueueItem = jdkDeserializers.onAddQueueItem();
        int i4 = (i3 - i2) - iOnAddQueueItem;
        if (i2 > i3) {
            i4 = (i2 - i3) - iOnAddQueueItem;
        }
        int i5 = (int) (i4 > 0 ? (fOnRemoveQueueItem * i4) + 0.5f : fOnRemoveQueueItem * i4);
        int i6 = i2 + i5;
        int i7 = i6 + iOnAddQueueItem;
        if (i2 > i3) {
            i6 = i2 - i5;
            i7 = i6 - iOnAddQueueItem;
        }
        jdkDeserializers.IconCompatParcelizer(i6, i7);
        read(i + 1, jdkDeserializers, writeVar);
    }

    private static void read(int i, JdkDeserializers jdkDeserializers, _readAndBind.write writeVar, JdkDeserializers jdkDeserializers2, boolean z) {
        int iOnSetShuffleMode;
        float fMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = jdkDeserializers2.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        int iWrite = jdkDeserializers2.MediaMetadataCompat.read.read() + jdkDeserializers2.MediaMetadataCompat.write();
        int iWrite2 = jdkDeserializers2.onPrepareFromMediaId.read.read() - jdkDeserializers2.onPrepareFromMediaId.write();
        if (iWrite2 >= iWrite) {
            int iOnSetShuffleMode2 = jdkDeserializers2.onSetShuffleMode();
            if (jdkDeserializers2.onRewind() != 8) {
                if (jdkDeserializers2.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 2) {
                    if (jdkDeserializers instanceof _long) {
                        iOnSetShuffleMode = jdkDeserializers.onSetShuffleMode();
                    } else {
                        iOnSetShuffleMode = jdkDeserializers.onPrepareFromMediaId().onSetShuffleMode();
                    }
                    iOnSetShuffleMode2 = (int) (jdkDeserializers2.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() * 0.5f * iOnSetShuffleMode);
                } else if (jdkDeserializers2.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 0) {
                    iOnSetShuffleMode2 = iWrite2 - iWrite;
                }
                iOnSetShuffleMode2 = Math.max(jdkDeserializers2.onPlayFromMediaId, iOnSetShuffleMode2);
                if (jdkDeserializers2.handleMediaPlayPauseIfPendingOnHandler > 0) {
                    iOnSetShuffleMode2 = Math.min(jdkDeserializers2.handleMediaPlayPauseIfPendingOnHandler, iOnSetShuffleMode2);
                }
            }
            int i2 = iWrite + ((int) ((fMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver * ((iWrite2 - iWrite) - iOnSetShuffleMode2)) + 0.5f));
            jdkDeserializers2.write(i2, iOnSetShuffleMode2 + i2);
            IconCompatParcelizer(i + 1, jdkDeserializers2, writeVar, z);
        }
    }

    private static void IconCompatParcelizer(int i, JdkDeserializers jdkDeserializers, _readAndBind.write writeVar, JdkDeserializers jdkDeserializers2) {
        int iOnAddQueueItem;
        float fOnRemoveQueueItem = jdkDeserializers2.onRemoveQueueItem();
        int iWrite = jdkDeserializers2.onSeekTo.read.read() + jdkDeserializers2.onSeekTo.write();
        int iWrite2 = jdkDeserializers2.AudioAttributesImplApi26Parcelizer.read.read() - jdkDeserializers2.AudioAttributesImplApi26Parcelizer.write();
        if (iWrite2 >= iWrite) {
            int iOnAddQueueItem2 = jdkDeserializers2.onAddQueueItem();
            if (jdkDeserializers2.onRewind() != 8) {
                if (jdkDeserializers2.onAddQueueItem == 2) {
                    if (jdkDeserializers instanceof _long) {
                        iOnAddQueueItem = jdkDeserializers.onAddQueueItem();
                    } else {
                        iOnAddQueueItem = jdkDeserializers.onPrepareFromMediaId().onAddQueueItem();
                    }
                    iOnAddQueueItem2 = (int) (fOnRemoveQueueItem * 0.5f * iOnAddQueueItem);
                } else if (jdkDeserializers2.onAddQueueItem == 0) {
                    iOnAddQueueItem2 = iWrite2 - iWrite;
                }
                iOnAddQueueItem2 = Math.max(jdkDeserializers2.onPause, iOnAddQueueItem2);
                if (jdkDeserializers2.onCustomAction > 0) {
                    iOnAddQueueItem2 = Math.min(jdkDeserializers2.onCustomAction, iOnAddQueueItem2);
                }
            }
            int i2 = iWrite + ((int) ((fOnRemoveQueueItem * ((iWrite2 - iWrite) - iOnAddQueueItem2)) + 0.5f));
            jdkDeserializers2.IconCompatParcelizer(i2, iOnAddQueueItem2 + i2);
            read(i + 1, jdkDeserializers2, writeVar);
        }
    }

    private static boolean read(JdkDeserializers jdkDeserializers) {
        JdkDeserializers.IconCompatParcelizer iconCompatParcelizerOnPlayFromMediaId = jdkDeserializers.onPlayFromMediaId();
        JdkDeserializers.IconCompatParcelizer iconCompatParcelizerOnSeekTo = jdkDeserializers.onSeekTo();
        _long _longVar = jdkDeserializers.onPrepareFromMediaId() != null ? (_long) jdkDeserializers.onPrepareFromMediaId() : null;
        if (_longVar != null) {
            _longVar.onPlayFromMediaId();
            JdkDeserializers.IconCompatParcelizer iconCompatParcelizer = JdkDeserializers.IconCompatParcelizer.FIXED;
        }
        if (_longVar != null) {
            _longVar.onSeekTo();
            JdkDeserializers.IconCompatParcelizer iconCompatParcelizer2 = JdkDeserializers.IconCompatParcelizer.FIXED;
        }
        boolean z = iconCompatParcelizerOnPlayFromMediaId == JdkDeserializers.IconCompatParcelizer.FIXED || jdkDeserializers.AudioAttributesImplApi21Parcelizer() || iconCompatParcelizerOnPlayFromMediaId == JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT || (iconCompatParcelizerOnPlayFromMediaId == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT && jdkDeserializers.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 0 && jdkDeserializers.AudioAttributesImplApi21Parcelizer == BitmapDescriptorFactory.HUE_RED && jdkDeserializers.MediaBrowserCompatItemReceiver(0)) || (iconCompatParcelizerOnPlayFromMediaId == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT && jdkDeserializers.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 1 && jdkDeserializers.RemoteActionCompatParcelizer(0, jdkDeserializers.onSetShuffleMode()));
        boolean z2 = iconCompatParcelizerOnSeekTo == JdkDeserializers.IconCompatParcelizer.FIXED || jdkDeserializers.MediaBrowserCompatCustomActionResultReceiver() || iconCompatParcelizerOnSeekTo == JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT || (iconCompatParcelizerOnSeekTo == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT && jdkDeserializers.onAddQueueItem == 0 && jdkDeserializers.AudioAttributesImplApi21Parcelizer == BitmapDescriptorFactory.HUE_RED && jdkDeserializers.MediaBrowserCompatItemReceiver(1)) || (iconCompatParcelizerOnSeekTo == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT && jdkDeserializers.onAddQueueItem == 1 && jdkDeserializers.RemoteActionCompatParcelizer(1, jdkDeserializers.onAddQueueItem()));
        if (jdkDeserializers.AudioAttributesImplApi21Parcelizer <= BitmapDescriptorFactory.HUE_RED || !(z || z2)) {
            return z && z2;
        }
        return true;
    }
}
